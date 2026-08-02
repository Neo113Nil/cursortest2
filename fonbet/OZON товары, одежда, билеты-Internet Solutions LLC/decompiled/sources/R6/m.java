package R6;

import R6.g;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class m {

    public static abstract class a {
        @NonNull
        public abstract m a();

        @NonNull
        public abstract a b(k kVar);

        @NonNull
        public abstract a c(ArrayList arrayList);

        @NonNull
        abstract a d(Integer num);

        @NonNull
        abstract a e(String str);

        @NonNull
        public abstract a f(p pVar);

        @NonNull
        public abstract a g(long j11);

        @NonNull
        public abstract a h(long j11);

        @NonNull
        public final void i(int i11) {
            d(Integer.valueOf(i11));
        }

        @NonNull
        public final void j(@NonNull String str) {
            e(str);
        }
    }

    @NonNull
    public static a a() {
        return new g.a();
    }

    public abstract k b();

    public abstract List<l> c();

    public abstract Integer d();

    public abstract String e();

    public abstract p f();

    public abstract long g();

    public abstract long h();
}
