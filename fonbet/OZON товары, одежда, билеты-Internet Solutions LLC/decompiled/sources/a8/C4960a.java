package a8;

import B0.A0;
import S7.h;
import S7.j;
import S7.l;
import S7.o;
import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* renamed from: a8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4960a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f36419c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f36420d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final S7.a f36421a;

    /* renamed from: b, reason: collision with root package name */
    private l f36422b;

    /* renamed from: a8.a$a, reason: collision with other inner class name */
    public static final class C0700a {

        /* renamed from: a, reason: collision with root package name */
        private Context f36423a = null;

        /* renamed from: b, reason: collision with root package name */
        private String f36424b = null;

        /* renamed from: c, reason: collision with root package name */
        private String f36425c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f36426d = null;

        /* renamed from: e, reason: collision with root package name */
        private c f36427e = null;

        /* renamed from: f, reason: collision with root package name */
        private h f36428f = null;

        /* renamed from: g, reason: collision with root package name */
        private l f36429g;

        private l g() throws GeneralSecurityException, IOException {
            h hVar = this.f36428f;
            if (hVar == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            j d11 = j.d(hVar);
            e eVar = new e(this.f36423a, this.f36424b, this.f36425c);
            c cVar = this.f36427e;
            try {
                if (cVar != null) {
                    o.a(d11, eVar, cVar, new byte[0]);
                } else {
                    S7.c.b(d11, eVar);
                }
                return l.b(d11);
            } catch (IOException e11) {
                throw new GeneralSecurityException(e11);
            }
        }

        private static byte[] h(Context context, String str, String str2) throws IOException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return O7.o.b(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(A0.b("can't read keyset; the pref value ", str, " is not a valid hex string"));
            }
        }

        private l i(byte[] bArr) throws GeneralSecurityException, IOException {
            try {
                this.f36427e = new d().b(this.f36426d);
                try {
                    return l.b(j.j(S7.b.c(bArr), this.f36427e, new byte[0]));
                } catch (IOException | GeneralSecurityException e11) {
                    try {
                        return l.b(S7.c.a(S7.b.c(bArr)));
                    } catch (IOException unused) {
                        throw e11;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e12) {
                try {
                    l b11 = l.b(S7.c.a(S7.b.c(bArr)));
                    Log.w("a", "cannot use Android Keystore, it'll be disabled", e12);
                    return b11;
                } catch (IOException unused2) {
                    throw e12;
                }
            }
        }

        private c j() throws GeneralSecurityException {
            d dVar = new d();
            try {
                boolean c11 = d.c(this.f36426d);
                try {
                    return dVar.b(this.f36426d);
                } catch (GeneralSecurityException | ProviderException e11) {
                    if (!c11) {
                        throw new KeyStoreException(A0.b("the master key ", this.f36426d, " exists but is unusable"), e11);
                    }
                    Log.w("a", "cannot use Android Keystore, it'll be disabled", e11);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e12) {
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e12);
                return null;
            }
        }

        public final synchronized C4960a f() throws GeneralSecurityException, IOException {
            C4960a c4960a;
            try {
                if (this.f36424b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (C4960a.f36419c) {
                    try {
                        byte[] h11 = h(this.f36423a, this.f36424b, this.f36425c);
                        if (h11 == null) {
                            if (this.f36426d != null) {
                                this.f36427e = j();
                            }
                            this.f36429g = g();
                        } else if (this.f36426d != null) {
                            this.f36429g = i(h11);
                        } else {
                            this.f36429g = l.b(S7.c.a(S7.b.c(h11)));
                        }
                        c4960a = new C4960a(this);
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return c4960a;
        }

        public final void k(h hVar) {
            this.f36428f = hVar;
        }

        public final void l(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            this.f36426d = str;
        }

        public final void m(Context context, String str, String str2) throws IOException {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            this.f36423a = context;
            this.f36424b = str;
            this.f36425c = str2;
        }
    }

    C4960a(C0700a c0700a) {
        new e(c0700a.f36423a, c0700a.f36424b, c0700a.f36425c);
        this.f36421a = c0700a.f36427e;
        this.f36422b = c0700a.f36429g;
    }

    public final synchronized j b() throws GeneralSecurityException {
        return this.f36422b.a();
    }
}
