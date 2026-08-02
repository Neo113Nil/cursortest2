package Q70;

import E30.j;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.pinprogress.PinProgressWrapperState;

/* loaded from: classes3.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23015a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23016b;

    /* renamed from: c, reason: collision with root package name */
    private final j f23017c;

    /* renamed from: d, reason: collision with root package name */
    private final j f23018d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final PinProgressWrapperState f23019e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f23020f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f23021g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f23022h;

    public c(boolean z11, boolean z12, j jVar, j jVar2, @NotNull PinProgressWrapperState pins, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f23015a = z11;
        this.f23016b = z12;
        this.f23017c = jVar;
        this.f23018d = jVar2;
        this.f23019e = pins;
        this.f23020f = z13;
        this.f23021g = z14;
        this.f23022h = z15;
    }

    public final boolean a() {
        return this.f23016b;
    }

    public final boolean b() {
        return this.f23015a;
    }

    public final j c() {
        return this.f23018d;
    }

    public final boolean d() {
        return this.f23020f;
    }

    public final boolean e() {
        return this.f23021g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f23015a == cVar.f23015a && this.f23016b == cVar.f23016b && Intrinsics.d(this.f23017c, cVar.f23017c) && Intrinsics.d(this.f23018d, cVar.f23018d) && Intrinsics.d(this.f23019e, cVar.f23019e) && this.f23020f == cVar.f23020f && this.f23021g == cVar.f23021g && this.f23022h == cVar.f23022h;
    }

    public final boolean f() {
        return this.f23022h;
    }

    @NotNull
    public final PinProgressWrapperState g() {
        return this.f23019e;
    }

    public final j h() {
        return this.f23017c;
    }

    public final int hashCode() {
        int a11 = C3532b.a(Boolean.hashCode(this.f23015a) * 31, 31, this.f23016b);
        j jVar = this.f23017c;
        int hashCode = (a11 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        j jVar2 = this.f23018d;
        return Boolean.hashCode(this.f23022h) + C3532b.a(C3532b.a((this.f23019e.hashCode() + ((hashCode + (jVar2 != null ? jVar2.hashCode() : 0)) * 31)) * 31, 31, this.f23020f), 31, this.f23021g);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PinPad(bioButton=");
        sb2.append(this.f23015a);
        sb2.append(", backButton=");
        sb2.append(this.f23016b);
        sb2.append(", title=");
        sb2.append(this.f23017c);
        sb2.append(", errorTitle=");
        sb2.append(this.f23018d);
        sb2.append(", pins=");
        sb2.append(this.f23019e);
        sb2.append(", hiddenOzonLogo=");
        sb2.append(this.f23020f);
        sb2.append(", needCloseCross=");
        sb2.append(this.f23021g);
        sb2.append(", needLogout=");
        return Pk0.a.a(")", sb2, this.f23022h);
    }
}
