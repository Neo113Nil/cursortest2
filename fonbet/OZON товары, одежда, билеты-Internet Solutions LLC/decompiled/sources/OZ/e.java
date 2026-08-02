package OZ;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e extends f {

    /* renamed from: b, reason: collision with root package name */
    private final int f20168b;

    /* renamed from: c, reason: collision with root package name */
    private final pZ.f f20169c;

    public /* synthetic */ e(int i11) {
        this(i11, null);
    }

    public static e c(e eVar, int i11) {
        pZ.f fVar = eVar.f20169c;
        eVar.getClass();
        return new e(i11, fVar);
    }

    @Override // OZ.f
    public final pZ.f a() {
        return this.f20169c;
    }

    @Override // OZ.f
    public final int b() {
        return this.f20168b;
    }

    @Override // pZ.f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e) || !super.equals(obj)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f20168b != eVar.f20168b) {
            return false;
        }
        return Intrinsics.d(this.f20169c, eVar.f20169c);
    }

    @Override // pZ.f
    public final int hashCode() {
        int hashCode = ((super.hashCode() * 31) + this.f20168b) * 31;
        pZ.f fVar = this.f20169c;
        return hashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SwitchTabDestination(tabId=" + this.f20168b + ", redirect=" + this.f20169c + ")";
    }

    public e(int i11, pZ.f fVar) {
        this.f20168b = i11;
        this.f20169c = fVar;
    }
}
