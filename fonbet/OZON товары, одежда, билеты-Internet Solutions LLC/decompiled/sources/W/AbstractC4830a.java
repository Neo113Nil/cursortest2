package W;

import W.C4832c;
import android.util.Range;
import androidx.annotation.NonNull;

/* renamed from: W.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC4830a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public static final Range<Integer> f32997a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public static final Range<Integer> f32998b;

    /* renamed from: W.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0585a {
    }

    static {
        Range<Integer> range = new Range<>(0, Integer.MAX_VALUE);
        f32997a = range;
        Range<Integer> range2 = new Range<>(0, Integer.MAX_VALUE);
        f32998b = range2;
        C4832c.a aVar = new C4832c.a();
        aVar.f();
        aVar.e();
        aVar.c(-1);
        aVar.b(range);
        aVar.d(range2);
        aVar.c(0);
        aVar.a();
    }

    AbstractC4830a() {
    }

    @NonNull
    public abstract Range<Integer> a();

    public abstract int b();

    @NonNull
    public abstract Range<Integer> c();

    public abstract int d();

    public abstract int e();
}
