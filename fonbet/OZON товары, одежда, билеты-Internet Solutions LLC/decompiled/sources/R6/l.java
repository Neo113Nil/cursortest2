package R6;

import R6.f;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public abstract class l {

    public static abstract class a {
        @NonNull
        public abstract l a();

        @NonNull
        public abstract a b(Integer num);

        @NonNull
        public abstract a c(long j11);

        @NonNull
        public abstract a d(long j11);

        @NonNull
        public abstract a e(o oVar);

        @NonNull
        public abstract a f(long j11);
    }

    @NonNull
    public static a h(@NonNull String str) {
        f.a aVar = new f.a();
        aVar.h(str);
        return aVar;
    }

    @NonNull
    public static a i(@NonNull byte[] bArr) {
        f.a aVar = new f.a();
        aVar.g(bArr);
        return aVar;
    }

    public abstract Integer a();

    public abstract long b();

    public abstract long c();

    public abstract o d();

    public abstract byte[] e();

    public abstract String f();

    public abstract long g();
}
