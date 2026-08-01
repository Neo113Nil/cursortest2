package com.vungle.ads.internal.model;

import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class t1 {
    public static final s1 Companion = new s1();

    /* renamed from: a, reason: collision with root package name */
    public h1 f12015a;
    public x0 b;
    public a1 c;
    public FirstPartyData d;
    public k1 e;

    public /* synthetic */ t1(int i, h1 h1Var, x0 x0Var, a1 a1Var, FirstPartyData firstPartyData, k1 k1Var) {
        if ((i & 1) == 0) {
            this.f12015a = null;
        } else {
            this.f12015a = h1Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = x0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = a1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = firstPartyData;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = k1Var;
        }
    }

    public static final void a(t1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f12015a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, f1.f11968a, self.f12015a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, v0.f12020a, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, y0.f12029a, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, FirstPartyData$$serializer.INSTANCE, self.d);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.e == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, i1.f11978a, self.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return Intrinsics.areEqual(this.f12015a, t1Var.f12015a) && Intrinsics.areEqual(this.b, t1Var.b) && Intrinsics.areEqual(this.c, t1Var.c) && Intrinsics.areEqual(this.d, t1Var.d) && Intrinsics.areEqual(this.e, t1Var.e);
    }

    public final int hashCode() {
        h1 h1Var = this.f12015a;
        int hashCode = (h1Var == null ? 0 : h1Var.hashCode()) * 31;
        x0 x0Var = this.b;
        int hashCode2 = (hashCode + (x0Var == null ? 0 : x0Var.f12027a.hashCode())) * 31;
        a1 a1Var = this.c;
        int hashCode3 = (hashCode2 + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        FirstPartyData firstPartyData = this.d;
        int hashCode4 = (hashCode3 + (firstPartyData == null ? 0 : firstPartyData.hashCode())) * 31;
        k1 k1Var = this.e;
        return hashCode4 + (k1Var != null ? k1Var.f11985a.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("User(gdpr=").append(this.f12015a).append(", ccpa=").append(this.b).append(", coppa=").append(this.c).append(", fpd=").append(this.d).append(", iab=").append(this.e).append(')').toString();
    }

    public t1(h1 h1Var, x0 x0Var, a1 a1Var, FirstPartyData firstPartyData, k1 k1Var) {
        this.f12015a = h1Var;
        this.b = x0Var;
        this.c = a1Var;
        this.d = firstPartyData;
        this.e = k1Var;
    }
}
