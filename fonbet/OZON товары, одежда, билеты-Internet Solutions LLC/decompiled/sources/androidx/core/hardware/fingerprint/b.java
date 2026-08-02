package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.os.e;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f42173a;

    static class a {
        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i11, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i11, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static d f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new d(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new d(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new d(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(d dVar) {
            if (dVar == null) {
                return null;
            }
            if (dVar.a() != null) {
                return new FingerprintManager.CryptoObject(dVar.a());
            }
            if (dVar.c() != null) {
                return new FingerprintManager.CryptoObject(dVar.c());
            }
            if (dVar.b() != null) {
                return new FingerprintManager.CryptoObject(dVar.b());
            }
            return null;
        }
    }

    /* renamed from: androidx.core.hardware.fingerprint.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0770b {
        public abstract void a(int i11, @NonNull CharSequence charSequence);

        public abstract void b();

        public abstract void c(@NonNull CharSequence charSequence);

        public abstract void d(@NonNull c cVar);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f42174a;

        public c(@NonNull d dVar) {
            this.f42174a = dVar;
        }

        @NonNull
        public final d a() {
            return this.f42174a;
        }
    }

    private b(Context context) {
        this.f42173a = context;
    }

    @NonNull
    public static b b(@NonNull Context context) {
        return new b(context);
    }

    @Deprecated
    public final void a(d dVar, e eVar, @NonNull AbstractC0770b abstractC0770b) {
        CancellationSignal cancellationSignal = eVar != null ? (CancellationSignal) eVar.b() : null;
        FingerprintManager c11 = a.c(this.f42173a);
        if (c11 != null) {
            a.a(c11, a.g(dVar), cancellationSignal, 0, new androidx.core.hardware.fingerprint.a(abstractC0770b), null);
        }
    }

    public final boolean c() {
        FingerprintManager c11 = a.c(this.f42173a);
        return c11 != null && a.d(c11);
    }

    public final boolean d() {
        FingerprintManager c11 = a.c(this.f42173a);
        return c11 != null && a.e(c11);
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f42175a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f42176b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f42177c;

        public d(@NonNull Signature signature) {
            this.f42175a = signature;
            this.f42176b = null;
            this.f42177c = null;
        }

        public final Cipher a() {
            return this.f42176b;
        }

        public final Mac b() {
            return this.f42177c;
        }

        public final Signature c() {
            return this.f42175a;
        }

        public d(@NonNull Cipher cipher) {
            this.f42176b = cipher;
            this.f42175a = null;
            this.f42177c = null;
        }

        public d(@NonNull Mac mac) {
            this.f42177c = mac;
            this.f42176b = null;
            this.f42175a = null;
        }
    }
}
