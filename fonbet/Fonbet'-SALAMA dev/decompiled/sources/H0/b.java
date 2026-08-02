package H0;

import W3.f;
import android.content.SharedPreferences;
import e1.k;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import t.e;

/* loaded from: classes.dex */
public final class b implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3191a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f3192b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final String f3193c;

    /* renamed from: d, reason: collision with root package name */
    public final J3.a f3194d;

    /* renamed from: e, reason: collision with root package name */
    public final J3.c f3195e;

    public b(String str, SharedPreferences sharedPreferences, J3.a aVar, J3.c cVar) {
        this.f3193c = str;
        this.f3191a = sharedPreferences;
        this.f3194d = aVar;
        this.f3195e = cVar;
    }

    public static boolean c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(f.b(this.f3195e.a(str.getBytes(StandardCharsets.UTF_8), this.f3193c.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e7) {
                throw new AssertionError(e7);
            }
        } catch (GeneralSecurityException e8) {
            throw new SecurityException("Could not encrypt key. " + e8.getMessage(), e8);
        }
    }

    public final Object b(String str) {
        String str2;
        if (c(str)) {
            throw new SecurityException(k.e(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String a2 = a(str);
            String string = this.f3191a.getString(a2, null);
            if (string == null) {
                return null;
            }
            byte[] a4 = f.a(string);
            J3.a aVar = this.f3194d;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer wrap = ByteBuffer.wrap(aVar.b(a4, a2.getBytes(charset)));
            wrap.position(0);
            int i7 = wrap.getInt();
            int i8 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? 0 : 6 : 5 : 4 : 3 : 2 : 1;
            if (i8 == 0) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i7);
            }
            int e7 = e.e(i8);
            if (e7 == 0) {
                int i9 = wrap.getInt();
                ByteBuffer slice = wrap.slice();
                wrap.limit(i9);
                String charBuffer = charset.decode(slice).toString();
                if (charBuffer.equals("__NULL__")) {
                    return null;
                }
                return charBuffer;
            }
            if (e7 == 1) {
                r.c cVar = new r.c(0);
                while (wrap.hasRemaining()) {
                    int i10 = wrap.getInt();
                    ByteBuffer slice2 = wrap.slice();
                    slice2.limit(i10);
                    wrap.position(wrap.position() + i10);
                    cVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                }
                if (cVar.f15976c == 1 && "__NULL__".equals(cVar.f15975b[0])) {
                    return null;
                }
                return cVar;
            }
            if (e7 == 2) {
                return Integer.valueOf(wrap.getInt());
            }
            if (e7 == 3) {
                return Long.valueOf(wrap.getLong());
            }
            if (e7 == 4) {
                return Float.valueOf(wrap.getFloat());
            }
            if (e7 == 5) {
                return Boolean.valueOf(wrap.get() != 0);
            }
            switch (i8) {
                case 1:
                    str2 = "STRING";
                    break;
                case 2:
                    str2 = "STRING_SET";
                    break;
                case 3:
                    str2 = "INT";
                    break;
                case 4:
                    str2 = "LONG";
                    break;
                case 5:
                    str2 = "FLOAT";
                    break;
                case 6:
                    str2 = "BOOLEAN";
                    break;
                default:
                    str2 = "null";
                    break;
            }
            throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
        } catch (GeneralSecurityException e8) {
            throw new SecurityException("Could not decrypt value. " + e8.getMessage(), e8);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (c(str)) {
            throw new SecurityException(k.e(str, " is a reserved key for the encryption keyset."));
        }
        return this.f3191a.contains(a(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new a(this, this.f3191a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f3191a.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    String str = new String(this.f3195e.b(f.a(entry.getKey()), this.f3193c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, b(str));
                } catch (GeneralSecurityException e7) {
                    throw new SecurityException("Could not decrypt key. " + e7.getMessage(), e7);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z4) {
        Object b7 = b(str);
        return b7 instanceof Boolean ? ((Boolean) b7).booleanValue() : z4;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f7) {
        Object b7 = b(str);
        return b7 instanceof Float ? ((Float) b7).floatValue() : f7;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i7) {
        Object b7 = b(str);
        return b7 instanceof Integer ? ((Integer) b7).intValue() : i7;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object b7 = b(str);
        return b7 instanceof Long ? ((Long) b7).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object b7 = b(str);
        return b7 instanceof String ? (String) b7 : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object b7 = b(str);
        Set cVar = b7 instanceof Set ? (Set) b7 : new r.c(0);
        return cVar.size() > 0 ? cVar : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f3192b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f3192b.remove(onSharedPreferenceChangeListener);
    }
}
