package R00;

import G.g;
import P00.l;
import T00.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d extends f {

    /* renamed from: b, reason: collision with root package name */
    private final String f24215b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f24216c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f24217d;

    /* renamed from: e, reason: collision with root package name */
    private final long f24218e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24219f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final l f24220g;

    /* renamed from: h, reason: collision with root package name */
    private final Exception f24221h;

    public d(@NotNull m layout, @NotNull l step, Exception exc) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(step, "step");
        String vertical = layout.g();
        String component = layout.b();
        String c11 = layout.c();
        long f7 = layout.f();
        String j11 = layout.j();
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(step, "step");
        this.f24215b = c11;
        this.f24216c = vertical;
        this.f24217d = component;
        this.f24218e = f7;
        this.f24219f = j11;
        this.f24220g = step;
        this.f24221h = exc;
    }

    @Override // R00.f
    @NotNull
    public final String a() {
        return this.f24217d;
    }

    @Override // R00.f
    @NotNull
    public final String c() {
        return this.f24216c;
    }

    @Override // R00.f
    public final String e() {
        return this.f24219f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f24215b, dVar.f24215b) && Intrinsics.d(this.f24216c, dVar.f24216c) && Intrinsics.d(this.f24217d, dVar.f24217d) && this.f24218e == dVar.f24218e && Intrinsics.d(this.f24219f, dVar.f24219f) && this.f24220g == dVar.f24220g && Intrinsics.d(this.f24221h, dVar.f24221h);
    }

    public final String g() {
        return this.f24215b;
    }

    @NotNull
    public final l h() {
        return this.f24220g;
    }

    public final int hashCode() {
        String str = this.f24215b;
        int a11 = Pk0.c.a(g.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f24216c), 31, this.f24217d), 31, this.f24218e);
        String str2 = this.f24219f;
        int hashCode = (this.f24220g.hashCode() + ((a11 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Exception exc = this.f24221h;
        return hashCode + (exc != null ? exc.hashCode() : 0);
    }

    public final Throwable i() {
        return this.f24221h;
    }

    @NotNull
    public final String toString() {
        return "PrepareWidgetIncident(stateId=" + this.f24215b + ", vertical=" + this.f24216c + ", component=" + this.f24217d + ", version=" + this.f24218e + ", widgetToken=" + this.f24219f + ", step=" + this.f24220g + ", throwable=" + this.f24221h + ")";
    }
}
