package P;

import P.a;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public abstract class e {

    public static abstract class a {
        @NonNull
        public abstract e a();

        @NonNull
        public abstract a b(@NonNull String str);

        @NonNull
        public abstract a c(@NonNull String str);

        @NonNull
        public abstract a d(@NonNull String str);

        @NonNull
        public abstract a e(@NonNull String str);
    }

    e() {
    }

    @NonNull
    public static a a() {
        a.C0418a c0418a = new a.C0418a();
        c0418a.e("0.0");
        c0418a.c("0.0");
        c0418a.d("");
        c0418a.b("");
        return c0418a;
    }

    @NonNull
    public abstract String b();

    @NonNull
    public abstract String c();

    @NonNull
    public abstract String d();

    @NonNull
    public abstract String e();
}
