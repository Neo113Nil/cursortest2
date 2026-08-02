package C50;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f4410a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f4411b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f4412c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f4413d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final H40.a f4414e;

    public c(String str, Boolean bool, Boolean bool2, Boolean bool3, @NotNull H40.a cbottomUIState) {
        Intrinsics.checkNotNullParameter(cbottomUIState, "cbottomUIState");
        this.f4410a = str;
        this.f4411b = bool;
        this.f4412c = bool2;
        this.f4413d = bool3;
        this.f4414e = cbottomUIState;
    }

    public final Boolean a() {
        return this.f4413d;
    }

    @NotNull
    public final H40.a b() {
        return this.f4414e;
    }

    public final Boolean c() {
        return this.f4411b;
    }

    public final String d() {
        return this.f4410a;
    }

    public final Boolean e() {
        return this.f4412c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f4410a, cVar.f4410a) && Intrinsics.d(this.f4411b, cVar.f4411b) && Intrinsics.d(this.f4412c, cVar.f4412c) && Intrinsics.d(this.f4413d, cVar.f4413d) && this.f4414e.equals(cVar.f4414e);
    }

    public final int hashCode() {
        String str = this.f4410a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f4411b;
        int a11 = C3532b.a((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, false);
        Boolean bool2 = this.f4412c;
        int hashCode2 = (a11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f4413d;
        return this.f4414e.hashCode() + ((hashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "FullUI(id=" + this.f4410a + ", disableNightMode=" + this.f4411b + ", displayCloseCross=false, lightStatusBar=" + this.f4412c + ", canClose=" + this.f4413d + ", cbottomUIState=" + this.f4414e + ")";
    }
}
