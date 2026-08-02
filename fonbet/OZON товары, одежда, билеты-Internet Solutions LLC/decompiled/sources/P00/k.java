package P00;

import B90.C2618u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class k<I extends C7854a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L00.j f21494a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final T00.a f21495b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f21496c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f21497d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a f21498e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final S00.a f21499f;

    /* renamed from: g, reason: collision with root package name */
    private final String f21500g;

    public k(@NotNull L00.j raw, @NotNull T00.a pageState, @NotNull ArrayList list, @NotNull ArrayList incidents, @NotNull a analyticsInfo, @NotNull S00.a pageMetrics) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        Intrinsics.checkNotNullParameter(pageState, "pageState");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(incidents, "incidents");
        Intrinsics.checkNotNullParameter(analyticsInfo, "analyticsInfo");
        Intrinsics.checkNotNullParameter(pageMetrics, "pageMetrics");
        this.f21494a = raw;
        this.f21495b = pageState;
        this.f21496c = list;
        this.f21497d = incidents;
        this.f21498e = analyticsInfo;
        this.f21499f = pageMetrics;
        this.f21500g = raw.c().get("x-o3-trace-id");
    }

    public static k a(k kVar, S00.a pageMetrics) {
        ArrayList list = kVar.f21496c;
        ArrayList incidents = kVar.f21497d;
        L00.j raw = kVar.f21494a;
        Intrinsics.checkNotNullParameter(raw, "raw");
        T00.a pageState = kVar.f21495b;
        Intrinsics.checkNotNullParameter(pageState, "pageState");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(incidents, "incidents");
        a analyticsInfo = kVar.f21498e;
        Intrinsics.checkNotNullParameter(analyticsInfo, "analyticsInfo");
        Intrinsics.checkNotNullParameter(pageMetrics, "pageMetrics");
        return new k(raw, pageState, list, incidents, analyticsInfo, pageMetrics);
    }

    @NotNull
    public final a b() {
        return this.f21498e;
    }

    @NotNull
    public final List<R00.f> c() {
        return this.f21497d;
    }

    @NotNull
    public final List<I> d() {
        return this.f21496c;
    }

    @NotNull
    public final S00.a e() {
        return this.f21499f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f21494a, kVar.f21494a) && Intrinsics.d(this.f21495b, kVar.f21495b) && this.f21496c.equals(kVar.f21496c) && this.f21497d.equals(kVar.f21497d) && Intrinsics.d(this.f21498e, kVar.f21498e) && Intrinsics.d(this.f21499f, kVar.f21499f);
    }

    @NotNull
    public final T00.a f() {
        return this.f21495b;
    }

    @NotNull
    public final L00.j g() {
        return this.f21494a;
    }

    public final String h() {
        return this.f21500g;
    }

    public final int hashCode() {
        return this.f21499f.hashCode() + ((this.f21498e.hashCode() + C2618u.b(this.f21497d, C2618u.b(this.f21496c, (this.f21495b.hashCode() + (this.f21494a.hashCode() * 31)) * 31, 31), 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ComposerResponseModel(raw=" + this.f21494a + ", pageState=" + this.f21495b + ", list=" + this.f21496c + ", incidents=" + this.f21497d + ", analyticsInfo=" + this.f21498e + ", pageMetrics=" + this.f21499f + ")";
    }
}
