package Oj;

import Sc.InterfaceC3999a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f20443a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC3709b f20444b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC3709b f20445c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final EnumC3709b f20446d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final EnumC3709b f20447e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final g f20448f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final EnumC3708a f20449g;

    public e(f backgroundWrapperSize, EnumC3709b paddingLeft, EnumC3709b paddingRight, g corners, EnumC3708a margin) {
        EnumC3709b paddingBottom = EnumC3709b.PADDING_NONE;
        Intrinsics.checkNotNullParameter(backgroundWrapperSize, "backgroundWrapperSize");
        Intrinsics.checkNotNullParameter(paddingLeft, "paddingLeft");
        Intrinsics.checkNotNullParameter(paddingBottom, "paddingTop");
        Intrinsics.checkNotNullParameter(paddingRight, "paddingRight");
        Intrinsics.checkNotNullParameter(paddingBottom, "paddingBottom");
        Intrinsics.checkNotNullParameter(corners, "corners");
        Intrinsics.checkNotNullParameter(margin, "margin");
        this.f20443a = backgroundWrapperSize;
        this.f20444b = paddingLeft;
        this.f20445c = paddingBottom;
        this.f20446d = paddingRight;
        this.f20447e = paddingBottom;
        this.f20448f = corners;
        this.f20449g = margin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f20443a == eVar.f20443a && this.f20444b == eVar.f20444b && this.f20445c == eVar.f20445c && this.f20446d == eVar.f20446d && this.f20447e == eVar.f20447e && Intrinsics.d(this.f20448f, eVar.f20448f) && this.f20449g == eVar.f20449g;
    }

    public final int hashCode() {
        return this.f20449g.hashCode() + ((this.f20448f.hashCode() + ((this.f20447e.hashCode() + ((this.f20446d.hashCode() + ((this.f20445c.hashCode() + ((this.f20444b.hashCode() + (this.f20443a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "BackgroundWrapperSettings(backgroundWrapperSize=" + this.f20443a + ", paddingLeft=" + this.f20444b + ", paddingTop=" + this.f20445c + ", paddingRight=" + this.f20446d + ", paddingBottom=" + this.f20447e + ", corners=" + this.f20448f + ", margin=" + this.f20449g + ")";
    }
}
