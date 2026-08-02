package N4;

import S7.h;
import S7.j;
import T7.C4019a;
import Y7.e;
import a8.C4960a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.collection.C5133b;
import com.google.crypto.tink.internal.I;
import com.google.crypto.tink.internal.s;
import i8.g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: classes.dex */
public final class a implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f18669a;

    /* renamed from: b, reason: collision with root package name */
    final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f18670b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    final String f18671c;

    /* renamed from: d, reason: collision with root package name */
    final S7.a f18672d;

    /* renamed from: e, reason: collision with root package name */
    final S7.d f18673e;

    /* renamed from: N4.a$a, reason: collision with other inner class name */
    private static final class SharedPreferencesEditorC0358a implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        private final a f18674a;

        /* renamed from: b, reason: collision with root package name */
        private final SharedPreferences.Editor f18675b;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f18677d = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList f18676c = new CopyOnWriteArrayList();

        SharedPreferencesEditorC0358a(a aVar, SharedPreferences.Editor editor) {
            this.f18674a = aVar;
            this.f18675b = editor;
        }

        private void a() {
            if (this.f18677d.getAndSet(false)) {
                a aVar = this.f18674a;
                for (String str : ((HashMap) aVar.getAll()).keySet()) {
                    if (!this.f18676c.contains(str) && !a.e(str)) {
                        this.f18675b.remove(aVar.c(str));
                    }
                }
            }
        }

        private void b() {
            a aVar = this.f18674a;
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = aVar.f18670b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                Iterator it2 = this.f18676c.iterator();
                while (it2.hasNext()) {
                    next.onSharedPreferenceChanged(aVar, (String) it2.next());
                }
            }
        }

        private void c(String str, byte[] bArr) {
            a aVar = this.f18674a;
            aVar.getClass();
            if (a.e(str)) {
                throw new SecurityException(U7.d.e(str, " is a reserved key for the encryption keyset."));
            }
            this.f18676c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String c11 = aVar.c(str);
                Pair pair = new Pair(c11, g.b(aVar.f18672d.a(bArr, c11.getBytes(StandardCharsets.UTF_8))));
                this.f18675b.putString((String) pair.first, (String) pair.second);
            } catch (GeneralSecurityException e11) {
                throw new SecurityException("Could not encrypt data: " + e11.getMessage(), e11);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            a();
            this.f18675b.apply();
            b();
            this.f18676c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            this.f18677d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f18676c;
            a();
            try {
                return this.f18675b.commit();
            } finally {
                b();
                copyOnWriteArrayList.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z11) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(b.BOOLEAN.a());
            allocate.put(z11 ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f7) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(b.FLOAT.a());
            allocate.putFloat(f7);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i11) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(b.INT.a());
            allocate.putInt(i11);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j11) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(b.LONG.a());
            allocate.putLong(j11);
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
            allocate.putInt(b.STRING.a());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            Set<String> set2 = set;
            if (set == null) {
                C5133b c5133b = new C5133b(0);
                c5133b.add("__NULL__");
                set2 = c5133b;
            }
            ArrayList arrayList = new ArrayList(set2.size());
            int size = set2.size() * 4;
            Iterator<String> it = set2.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(b.STRING_SET.a());
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
            a aVar = this.f18674a;
            aVar.getClass();
            if (a.e(str)) {
                throw new SecurityException(U7.d.e(str, " is a reserved key for the encryption keyset."));
            }
            this.f18675b.remove(aVar.c(str));
            this.f18676c.add(str);
            return this;
        }
    }

    private enum b {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        private final int mId;

        b(int i11) {
            this.mId = i11;
        }

        public final int a() {
            return this.mId;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Deprecated
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c AES256_SIV;
        private final String mDeterministicAeadKeyTemplateName = "AES256_SIV";

        static {
            c cVar = new c();
            AES256_SIV = cVar;
            $VALUES = new c[]{cVar};
        }

        private c() {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        final h a() throws GeneralSecurityException {
            return h.a(s.b().a(this.mDeterministicAeadKeyTemplateName));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Deprecated
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d AES256_GCM;
        private final String mAeadKeyTemplateName = "AES256_GCM";

        static {
            d dVar = new d();
            AES256_GCM = dVar;
            $VALUES = new d[]{dVar};
        }

        private d() {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        final h a() throws GeneralSecurityException {
            return h.a(s.b().a(this.mAeadKeyTemplateName));
        }
    }

    a(String str, SharedPreferences sharedPreferences, S7.a aVar, S7.d dVar) {
        this.f18671c = str;
        this.f18669a = sharedPreferences;
        this.f18672d = aVar;
        this.f18673e = dVar;
    }

    public static a a(Context context, String str, N4.b bVar, c cVar, d dVar) throws GeneralSecurityException, IOException {
        return b(str, bVar.a(), context, cVar, dVar);
    }

    @Deprecated
    public static a b(String str, String str2, Context context, c cVar, d dVar) throws GeneralSecurityException, IOException {
        int i11 = e.f34768a;
        Y7.h.d();
        if (!X7.a.b()) {
            Y7.c.c();
        }
        C4019a.a();
        Context applicationContext = context.getApplicationContext();
        C4960a.C0700a c0700a = new C4960a.C0700a();
        c0700a.k(cVar.a());
        c0700a.m(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        c0700a.l("android-keystore://" + str2);
        j b11 = c0700a.f().b();
        C4960a.C0700a c0700a2 = new C4960a.C0700a();
        c0700a2.k(dVar.a());
        c0700a2.m(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        c0700a2.l("android-keystore://" + str2);
        j b12 = c0700a2.f().b();
        return new a(str, applicationContext.getSharedPreferences(str, 0), (S7.a) b12.h(I.c(), S7.a.class), (S7.d) b11.h(I.c(), S7.d.class));
    }

    private Object d(String str) throws SecurityException {
        if (e(str)) {
            throw new SecurityException(U7.d.e(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String c11 = c(str);
            String string = this.f18669a.getString(c11, null);
            if (string != null) {
                byte[] a11 = g.a(string);
                S7.a aVar = this.f18672d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer wrap = ByteBuffer.wrap(aVar.b(a11, c11.getBytes(charset)));
                wrap.position(0);
                int i11 = wrap.getInt();
                b bVar = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? null : b.BOOLEAN : b.FLOAT : b.LONG : b.INT : b.STRING_SET : b.STRING;
                if (bVar == null) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i11);
                }
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    int i12 = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i12);
                    String charBuffer = charset.decode(slice).toString();
                    if (!charBuffer.equals("__NULL__")) {
                        return charBuffer;
                    }
                } else {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return Integer.valueOf(wrap.getInt());
                        }
                        if (ordinal == 3) {
                            return Long.valueOf(wrap.getLong());
                        }
                        if (ordinal == 4) {
                            return Float.valueOf(wrap.getFloat());
                        }
                        if (ordinal == 5) {
                            return Boolean.valueOf(wrap.get() != 0);
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: " + bVar);
                    }
                    C5133b c5133b = new C5133b(0);
                    while (wrap.hasRemaining()) {
                        int i13 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i13);
                        wrap.position(wrap.position() + i13);
                        c5133b.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (c5133b.size() != 1 || !"__NULL__".equals(c5133b.l(0))) {
                        return c5133b;
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e11) {
            throw new SecurityException("Could not decrypt value. " + e11.getMessage(), e11);
        }
    }

    static boolean e(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    final String c(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return g.b(this.f18673e.b(str.getBytes(StandardCharsets.UTF_8), this.f18671c.getBytes()));
        } catch (GeneralSecurityException e11) {
            throw new SecurityException("Could not encrypt key. " + e11.getMessage(), e11);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (e(str)) {
            throw new SecurityException(U7.d.e(str, " is a reserved key for the encryption keyset."));
        }
        return this.f18669a.contains(c(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC0358a(this, this.f18669a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f18669a.getAll().entrySet()) {
            if (!e(entry.getKey())) {
                try {
                    String str = new String(this.f18673e.a(g.a(entry.getKey()), this.f18671c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, d(str));
                } catch (GeneralSecurityException e11) {
                    throw new SecurityException("Could not decrypt key. " + e11.getMessage(), e11);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z11) {
        Object d11 = d(str);
        return d11 instanceof Boolean ? ((Boolean) d11).booleanValue() : z11;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f7) {
        Object d11 = d(str);
        return d11 instanceof Float ? ((Float) d11).floatValue() : f7;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i11) {
        Object d11 = d(str);
        return d11 instanceof Integer ? ((Integer) d11).intValue() : i11;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j11) {
        Object d11 = d(str);
        return d11 instanceof Long ? ((Long) d11).longValue() : j11;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object d11 = d(str);
        return d11 instanceof String ? (String) d11 : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        Object d11 = d(str);
        Set<String> c5133b = d11 instanceof Set ? (Set) d11 : new C5133b<>(0);
        return c5133b.size() > 0 ? c5133b : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f18670b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f18670b.remove(onSharedPreferenceChangeListener);
    }
}
