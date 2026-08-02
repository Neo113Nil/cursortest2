package R00;

import G.g;
import T00.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e extends f {

    /* renamed from: b, reason: collision with root package name */
    private final String f24222b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f24223c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f24224d;

    /* renamed from: e, reason: collision with root package name */
    private final long f24225e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24226f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24227g;

    public e(@NotNull m layout, boolean z11) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        String vertical = layout.g();
        String component = layout.b();
        String c11 = layout.c();
        long f7 = layout.f();
        String j11 = layout.j();
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(component, "component");
        this.f24222b = c11;
        this.f24223c = vertical;
        this.f24224d = component;
        this.f24225e = f7;
        this.f24226f = j11;
        this.f24227g = z11;
    }

    @Override // R00.f
    @NotNull
    public final String a() {
        return this.f24224d;
    }

    @Override // R00.f
    @NotNull
    public final String c() {
        return this.f24223c;
    }

    @Override // R00.f
    public final String e() {
        return this.f24226f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f24222b, eVar.f24222b) && Intrinsics.d(this.f24223c, eVar.f24223c) && Intrinsics.d(this.f24224d, eVar.f24224d) && this.f24225e == eVar.f24225e && Intrinsics.d(this.f24226f, eVar.f24226f) && this.f24227g == eVar.f24227g;
    }

    public final String g() {
        return this.f24222b;
    }

    public final boolean h() {
        return this.f24227g;
    }

    public final int hashCode() {
        String str = this.f24222b;
        int a11 = Pk0.c.a(g.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f24223c), 31, this.f24224d), 31, this.f24225e);
        String str2 = this.f24226f;
        return Boolean.hashCode(this.f24227g) + ((a11 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnSupportedWidgetIncident(stateId=");
        sb2.append(this.f24222b);
        sb2.append(", vertical=");
        sb2.append(this.f24223c);
        sb2.append(", component=");
        sb2.append(this.f24224d);
        sb2.append(", version=");
        sb2.append(this.f24225e);
        sb2.append(", widgetToken=");
        sb2.append(this.f24226f);
        sb2.append(", isWidgetSupported=");
        return Pk0.a.a(")", sb2, this.f24227g);
    }
}
