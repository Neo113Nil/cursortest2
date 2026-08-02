package X5;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p6.k;
import p6.l;
import q6.AbstractC8993d;
import q6.C8990a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final p6.h<T5.f, String> f34105a = new p6.h<>(1000);

    /* renamed from: b, reason: collision with root package name */
    private final x2.f<b> f34106b = C8990a.a(10, new a());

    final class a implements C8990a.b<b> {
        @Override // q6.C8990a.b
        public final b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    private static final class b implements C8990a.d {

        /* renamed from: a, reason: collision with root package name */
        final MessageDigest f34107a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC8993d f34108b = AbstractC8993d.a();

        b(MessageDigest messageDigest) {
            this.f34107a = messageDigest;
        }

        @Override // q6.C8990a.d
        @NonNull
        public final AbstractC8993d d() {
            return this.f34108b;
        }
    }

    public final String a(T5.f fVar) {
        String b11;
        synchronized (this.f34105a) {
            b11 = this.f34105a.b(fVar);
        }
        if (b11 == null) {
            x2.f<b> fVar2 = this.f34106b;
            b a11 = fVar2.a();
            k.c(a11, "Argument must not be null");
            b bVar = a11;
            MessageDigest messageDigest = bVar.f34107a;
            try {
                fVar.updateDiskCacheKey(messageDigest);
                String l11 = l.l(messageDigest.digest());
                fVar2.b(bVar);
                b11 = l11;
            } catch (Throwable th2) {
                fVar2.b(bVar);
                throw th2;
            }
        }
        synchronized (this.f34105a) {
            this.f34105a.f(fVar, b11);
        }
        return b11;
    }
}
