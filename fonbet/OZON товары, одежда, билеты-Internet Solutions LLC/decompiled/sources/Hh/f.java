package Hh;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f10997a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f10998b;

    public f(@NotNull String widgetName, @NotNull String holderName) {
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        this.f10997a = widgetName;
        this.f10998b = holderName;
    }

    @NotNull
    public final String a() {
        return this.f10998b;
    }

    @NotNull
    public final String b() {
        return this.f10997a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f10997a, fVar.f10997a) && Intrinsics.d(this.f10998b, fVar.f10998b);
    }

    public final int hashCode() {
        return this.f10998b.hashCode() + (this.f10997a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetInfo(widgetName='");
        sb2.append(this.f10997a);
        sb2.append("', holderName='");
        return o0.c(sb2, this.f10998b, "')");
    }
}
