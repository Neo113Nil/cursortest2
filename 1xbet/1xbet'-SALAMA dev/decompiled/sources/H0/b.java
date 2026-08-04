package H0;

import W3.f;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p031e1.k;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f3192b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J3.a f3194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
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
        int i7;
        String str2;
        if (c(str)) {
            throw new SecurityException(k.e(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA = a(str);
            String string = this.f3191a.getString(strA, null);
            if (string == null) {
                return null;
            }
            byte[] bArrA = f.a(string);
            J3.a aVar = this.f3194d;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(aVar.b(bArrA, strA.getBytes(charset)));
            byteBufferWrap.position(0);
            int i8 = byteBufferWrap.getInt();
            if (i8 == 0) {
                i7 = 1;
            } else if (i8 == 1) {
                i7 = 2;
            } else if (i8 == 2) {
                i7 = 3;
            } else if (i8 == 3) {
                i7 = 4;
            } else if (i8 != 4) {
                i7 = i8 != 5 ? 0 : 6;
            } else {
                i7 = 5;
            }
            if (i7 == 0) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i8);
            }
            int iE = e.e(i7);
            if (iE == 0) {
                int i9 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                byteBufferWrap.limit(i9);
                String string2 = charset.decode(byteBufferSlice).toString();
                if (string2.equals("__NULL__")) {
                    return null;
                }
                return string2;
            }
            if (iE == 1) {
                p122r.c cVar = new p122r.c(0);
                while (byteBufferWrap.hasRemaining()) {
                    int i10 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                    byteBufferSlice2.limit(i10);
                    byteBufferWrap.position(byteBufferWrap.position() + i10);
                    cVar.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                }
                if (cVar.f15982c == 1 && "__NULL__".equals(cVar.f15981b[0])) {
                    return null;
                }
                return cVar;
            }
            if (iE == 2) {
                return Integer.valueOf(byteBufferWrap.getInt());
            }
            if (iE == 3) {
                return Long.valueOf(byteBufferWrap.getLong());
            }
            if (iE == 4) {
                return Float.valueOf(byteBufferWrap.getFloat());
            }
            if (iE == 5) {
                return Boolean.valueOf(byteBufferWrap.get() != 0);
            }
            switch (i7) {
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
        } catch (GeneralSecurityException e7) {
            throw new SecurityException("Could not decrypt value. " + e7.getMessage(), e7);
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
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f3191a.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    String str = new String(this.f3195e.b(f.a(entry.getKey()), this.f3193c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, b(str));
                } catch (GeneralSecurityException e7) {
                    throw new SecurityException("Could not decrypt key. " + e7.getMessage(), e7);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z4) {
        Object objB = b(str);
        return objB instanceof Boolean ? ((Boolean) objB).booleanValue() : z4;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f7) {
        Object objB = b(str);
        return objB instanceof Float ? ((Float) objB).floatValue() : f7;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i7) {
        Object objB = b(str);
        return objB instanceof Integer ? ((Integer) objB).intValue() : i7;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objB = b(str);
        return objB instanceof Long ? ((Long) objB).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objB = b(str);
        return objB instanceof String ? (String) objB : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objB = b(str);
        Set cVar = objB instanceof Set ? (Set) objB : new p122r.c(0);
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
