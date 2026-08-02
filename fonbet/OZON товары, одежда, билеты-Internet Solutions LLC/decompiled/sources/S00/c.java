package S00;

import B90.C2618u;
import G.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f25617a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f25618b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f25619c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f25620d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<b> f25621e;

    public c(@NotNull String traceKey, @NotNull String url, @NotNull String widgetName, @NotNull String stateId, @NotNull List<b> processingTimes) {
        Intrinsics.checkNotNullParameter(traceKey, "traceKey");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        Intrinsics.checkNotNullParameter(processingTimes, "processingTimes");
        this.f25617a = traceKey;
        this.f25618b = url;
        this.f25619c = widgetName;
        this.f25620d = stateId;
        this.f25621e = processingTimes;
    }

    @NotNull
    public final List<b> a() {
        return this.f25621e;
    }

    @NotNull
    public final String b() {
        return this.f25620d;
    }

    @NotNull
    public final String c() {
        return this.f25617a;
    }

    @NotNull
    public final String d() {
        return this.f25618b;
    }

    @NotNull
    public final String e() {
        return this.f25619c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f25617a, cVar.f25617a) && Intrinsics.d(this.f25618b, cVar.f25618b) && Intrinsics.d(this.f25619c, cVar.f25619c) && Intrinsics.d(this.f25620d, cVar.f25620d) && Intrinsics.d(this.f25621e, cVar.f25621e);
    }

    public final int hashCode() {
        return this.f25621e.hashCode() + g.a(g.a(g.a(this.f25617a.hashCode() * 31, 31, this.f25618b), 31, this.f25619c), 31, this.f25620d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetMetrics(traceKey=");
        sb2.append(this.f25617a);
        sb2.append(", url=");
        sb2.append(this.f25618b);
        sb2.append(", widgetName=");
        sb2.append(this.f25619c);
        sb2.append(", stateId=");
        sb2.append(this.f25620d);
        sb2.append(", processingTimes=");
        return C2618u.h(sb2, this.f25621e, ")");
    }
}
