package P1;

import androidx.recyclerview.widget.m;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes.dex */
public final class F implements Comparable<F> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final F f21504b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final F f21505c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final F f21506d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final F f21507e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final F f21508f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final F f21509g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final F f21510h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final F f21511i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final F f21512j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final F f21513k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final List<F> f21514l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f21515m = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int f21516a;

    public static final class a {
    }

    static {
        F f7 = new F(100);
        F f11 = new F(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        F f12 = new F(300);
        F f13 = new F(400);
        f21504b = f13;
        F f14 = new F(CounterView.COUNTER_MAX_DEFAULT);
        f21505c = f14;
        F f15 = new F(600);
        f21506d = f15;
        F f16 = new F(700);
        f21507e = f16;
        F f17 = new F(800);
        F f18 = new F(DescriptorProtos$Edition.EDITION_LEGACY_VALUE);
        f21508f = f12;
        f21509g = f13;
        f21510h = f14;
        f21511i = f15;
        f21512j = f16;
        f21513k = f17;
        f21514l = C7714v.b0(f7, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    public F(int i11) {
        this.f21516a = i11;
        if (1 > i11 || i11 >= 1001) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Font weight can be in range [1, 1000]. Current value: ").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            return this.f21516a == ((F) obj).f21516a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21516a;
    }

    @Override // java.lang.Comparable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull F f7) {
        return Intrinsics.i(this.f21516a, f7.f21516a);
    }

    public final int l() {
        return this.f21516a;
    }

    @NotNull
    public final String toString() {
        return Ek.a.d(new StringBuilder("FontWeight(weight="), this.f21516a, ')');
    }
}
