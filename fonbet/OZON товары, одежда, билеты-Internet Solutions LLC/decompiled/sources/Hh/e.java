package Hh;

import G.g;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f10994a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f10995b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f10996c;

    public e(@NotNull String widgetName, @NotNull String holderName, @NotNull LinkedHashSet eventTypes) {
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        Intrinsics.checkNotNullParameter(eventTypes, "eventTypes");
        this.f10994a = widgetName;
        this.f10995b = holderName;
        this.f10996c = eventTypes;
    }

    @NotNull
    public final Set<String> a() {
        return this.f10996c;
    }

    @NotNull
    public final String b() {
        return this.f10995b;
    }

    @NotNull
    public final String c() {
        return this.f10994a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f10994a, eVar.f10994a) && this.f10995b.equals(eVar.f10995b) && this.f10996c.equals(eVar.f10996c);
    }

    public final int hashCode() {
        return this.f10996c.hashCode() + g.a(this.f10994a.hashCode() * 31, 31, this.f10995b);
    }

    @NotNull
    public final String toString() {
        return "WidgetHitchInfo(widgetName='" + this.f10994a + "', holderName='" + this.f10995b + "', eventTypes=" + this.f10996c + ")";
    }
}
