package H0;

import W3.f;
import android.content.SharedPreferences;
import android.util.Pair;
import e1.k;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    public final b f3187a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences.Editor f3188b;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3190d = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f3189c = new CopyOnWriteArrayList();

    public a(b bVar, SharedPreferences.Editor editor) {
        this.f3187a = bVar;
        this.f3188b = editor;
    }

    public final void a() {
        if (this.f3190d.getAndSet(false)) {
            b bVar = this.f3187a;
            for (String str : ((HashMap) bVar.getAll()).keySet()) {
                if (!this.f3189c.contains(str) && !b.c(str)) {
                    this.f3188b.remove(bVar.a(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        a();
        this.f3188b.apply();
        b();
        this.f3189c.clear();
    }

    public final void b() {
        b bVar = this.f3187a;
        Iterator it = bVar.f3192b.iterator();
        while (it.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
            Iterator it2 = this.f3189c.iterator();
            while (it2.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(bVar, (String) it2.next());
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        b bVar = this.f3187a;
        bVar.getClass();
        if (b.c(str)) {
            throw new SecurityException(k.e(str, " is a reserved key for the encryption keyset."));
        }
        this.f3189c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String a2 = bVar.a(str);
            try {
                Pair pair = new Pair(a2, new String(f.b(bVar.f3194d.a(bArr, a2.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.f3188b.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e7) {
                throw new AssertionError(e7);
            }
        } catch (GeneralSecurityException e8) {
            throw new SecurityException("Could not encrypt data: " + e8.getMessage(), e8);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f3190d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3189c;
        a();
        try {
            return this.f3188b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z4) {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.putInt(5);
        allocate.put(z4 ? (byte) 1 : (byte) 0);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f7) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(4);
        allocate.putFloat(f7);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i7) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(2);
        allocate.putInt(i7);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(3);
        allocate.putLong(j);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 8);
        allocate.putInt(0);
        allocate.putInt(length);
        allocate.put(bytes);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new r.c(0);
            set.add("__NULL__");
        }
        ArrayList arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(size + 4);
        allocate.putInt(1);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        b bVar = this.f3187a;
        bVar.getClass();
        if (b.c(str)) {
            throw new SecurityException(k.e(str, " is a reserved key for the encryption keyset."));
        }
        this.f3188b.remove(bVar.a(str));
        this.f3189c.add(str);
        return this;
    }
}
