package H0;

import W3.f;
import android.content.SharedPreferences;
import android.util.Pair;
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
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences.Editor f3188b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3190d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
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
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : bVar.f3192b) {
            Iterator it = this.f3189c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(bVar, (String) it.next());
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
            String strA = bVar.a(str);
            try {
                Pair pair = new Pair(strA, new String(f.b(bVar.f3194d.a(bArr, strA.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
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
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(5);
        byteBufferAllocate.put(z4 ? (byte) 1 : (byte) 0);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f7) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(4);
        byteBufferAllocate.putFloat(f7);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i7) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(2);
        byteBufferAllocate.putInt(i7);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(3);
        byteBufferAllocate.putLong(j);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new p122r.c(0);
            set.add("__NULL__");
        }
        ArrayList<byte[]> arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(1);
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        c(str, byteBufferAllocate.array());
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
