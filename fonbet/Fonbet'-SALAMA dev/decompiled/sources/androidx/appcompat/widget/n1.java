package androidx.appcompat.widget;

import W5.AbstractC0486a1;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import w1.C1759x1;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public Context f8711a = null;

    /* renamed from: b, reason: collision with root package name */
    public Object f8712b = null;

    /* renamed from: c, reason: collision with root package name */
    public Object f8713c = null;

    /* renamed from: d, reason: collision with root package name */
    public Object f8714d = null;

    /* renamed from: e, reason: collision with root package name */
    public Object f8715e = null;

    /* renamed from: f, reason: collision with root package name */
    public Object f8716f = null;

    /* renamed from: g, reason: collision with root package name */
    public Object f8717g;

    public static byte[] c(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
            if (string == null) {
                return null;
            }
            return Q0.a.s(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(AbstractC0486a1.h("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    public static J3.f d(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            V3.g0 F7 = V3.g0.F(byteArrayInputStream, C0879o.a());
            byteArrayInputStream.close();
            return new J3.f((V3.d0) ((V3.g0) C1759x1.J(F7).f17925b).x(), 3);
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public synchronized P3.a a() {
        P3.a aVar;
        try {
            if (((String) this.f8712b) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (P3.a.f5584b) {
                try {
                    byte[] c3 = c(this.f8711a, (String) this.f8712b, (String) this.f8713c);
                    if (c3 == null) {
                        if (((String) this.f8714d) != null) {
                            this.f8715e = f();
                        }
                        this.f8717g = b();
                    } else if (((String) this.f8714d) != null) {
                        this.f8717g = e(c3);
                    } else {
                        this.f8717g = d(c3);
                    }
                    aVar = new P3.a(this);
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    public J3.f b() {
        if (((J3.g) this.f8716f) == null) {
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
        J3.f fVar = new J3.f(V3.g0.E(), 3);
        J3.g gVar = (J3.g) this.f8716f;
        synchronized (fVar) {
            fVar.a(gVar.f3843a);
        }
        int C3 = J3.p.a((V3.g0) fVar.c().f17925b).A().C();
        synchronized (fVar) {
            for (int i7 = 0; i7 < ((V3.g0) ((V3.d0) fVar.f3842b).f11827b).B(); i7++) {
                try {
                    V3.f0 A7 = ((V3.g0) ((V3.d0) fVar.f3842b).f11827b).A(i7);
                    if (A7.D() == C3) {
                        if (!A7.F().equals(V3.Z.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + C3);
                        }
                        V3.d0 d0Var = (V3.d0) fVar.f3842b;
                        d0Var.e();
                        V3.g0.y((V3.g0) d0Var.f11827b, C3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new GeneralSecurityException("key not found: " + C3);
        }
        Context context = this.f8711a;
        String str = (String) this.f8712b;
        String str2 = (String) this.f8713c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        SharedPreferences.Editor edit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
        if (((P3.b) this.f8715e) != null) {
            C1759x1 c3 = fVar.c();
            P3.b bVar = (P3.b) this.f8715e;
            byte[] bArr = new byte[0];
            V3.g0 g0Var = (V3.g0) c3.f17925b;
            byte[] a2 = bVar.a(g0Var.e(), bArr);
            try {
                if (!V3.g0.G(bVar.b(a2, bArr), C0879o.a()).equals(g0Var)) {
                    throw new GeneralSecurityException("cannot encrypt keyset");
                }
                V3.M B7 = V3.N.B();
                C0872h t7 = AbstractC0873i.t(a2, 0, a2.length);
                B7.e();
                V3.N.y((V3.N) B7.f11827b, t7);
                V3.k0 a4 = J3.p.a(g0Var);
                B7.e();
                V3.N.z((V3.N) B7.f11827b, a4);
                if (!edit.putString(str, Q0.a.w(((V3.N) B7.b()).e())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
            } catch (com.google.crypto.tink.shaded.protobuf.C unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else if (!edit.putString(str, Q0.a.w(((V3.g0) fVar.c().f17925b).e())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
        return fVar;
    }

    public J3.f e(byte[] bArr) {
        try {
            this.f8715e = new P3.c().c((String) this.f8714d);
            try {
                return new J3.f((V3.d0) ((V3.g0) C1759x1.a0(new J3.f(new ByteArrayInputStream(bArr), 1), (P3.b) this.f8715e).f17925b).x(), 3);
            } catch (IOException | GeneralSecurityException e7) {
                try {
                    return d(bArr);
                } catch (IOException unused) {
                    throw e7;
                }
            }
        } catch (GeneralSecurityException | ProviderException e8) {
            try {
                J3.f d7 = d(bArr);
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e8);
                return d7;
            } catch (IOException unused2) {
                throw e8;
            }
        }
    }

    public P3.b f() {
        P3.c cVar = new P3.c();
        try {
            boolean a2 = P3.c.a((String) this.f8714d);
            try {
                return cVar.c((String) this.f8714d);
            } catch (GeneralSecurityException | ProviderException e7) {
                if (!a2) {
                    throw new KeyStoreException(AbstractC0486a1.h("the master key ", (String) this.f8714d, " exists but is unusable"), e7);
                }
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e7);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e8) {
            Log.w("a", "cannot use Android Keystore, it'll be disabled", e8);
            return null;
        }
    }
}
