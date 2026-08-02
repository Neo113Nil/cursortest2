package W;

import android.util.Range;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes8.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public static final Range<Integer> f33137a = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public static final Range<Integer> f33138b = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public static final A f33139c;

    public static abstract class a {
        a() {
        }

        @NonNull
        public abstract u0 a();

        @NonNull
        abstract a b(int i11);

        @NonNull
        public abstract a c(@NonNull A a11);
    }

    static {
        C4852x c4852x = C4852x.f33149c;
        f33139c = A.b(Arrays.asList(c4852x, C4852x.f33148b, C4852x.f33147a), C4845p.a(c4852x));
    }

    u0() {
    }

    abstract int a();

    @NonNull
    public abstract Range<Integer> b();

    @NonNull
    public abstract Range<Integer> c();

    @NonNull
    public abstract A d();

    @NonNull
    public abstract a e();
}
