package com.vungle.ads.internal.load;

import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.model.q0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes7.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final j3 f11934a;
    public final q0 b;
    public final VungleAdSize c;
    public final VungleCSBData d;

    public b(j3 placement, q0 q0Var, VungleAdSize vungleAdSize, VungleCSBData vungleCSBData) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f11934a = placement;
        this.b = q0Var;
        this.c = vungleAdSize;
        this.d = vungleCSBData;
    }

    public final q0 a() {
        return this.b;
    }

    public final VungleCSBData b() {
        return this.d;
    }

    public final j3 c() {
        return this.f11934a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(b.class, obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (!Intrinsics.areEqual(this.f11934a.b(), bVar.f11934a.b()) || !Intrinsics.areEqual(this.c, bVar.c)) {
            return false;
        }
        q0 q0Var = this.b;
        if (q0Var != null) {
            if (!Intrinsics.areEqual(q0Var, bVar.b)) {
                return false;
            }
        } else if (bVar.b != null) {
            return false;
        }
        VungleCSBData vungleCSBData = this.d;
        VungleCSBData vungleCSBData2 = bVar.d;
        return vungleCSBData != null ? Intrinsics.areEqual(vungleCSBData, vungleCSBData2) : vungleCSBData2 == null;
    }

    public final int hashCode() {
        int hashCode = this.f11934a.f11983a.hashCode() * 31;
        VungleAdSize vungleAdSize = this.c;
        int hashCode2 = (hashCode + (vungleAdSize != null ? vungleAdSize.hashCode() : 0)) * 31;
        q0 q0Var = this.b;
        int hashCode3 = (hashCode2 + (q0Var != null ? q0Var.hashCode() : 0)) * 31;
        VungleCSBData vungleCSBData = this.d;
        return hashCode3 + (vungleCSBData != null ? vungleCSBData.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("AdRequest{placementId='").append(this.f11934a.f11983a).append("', adMarkup=").append(this.b).append(", requestAdSize=").append(this.c).append(", csbData=").append(this.d).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
