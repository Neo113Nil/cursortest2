package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Vb {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6911a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final InlineParams e;

    public Vb(boolean z, String landingScheme, boolean z2, boolean z3, InlineParams inlineParams) {
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        this.f6911a = z;
        this.b = landingScheme;
        this.c = z2;
        this.d = z3;
        this.e = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vb)) {
            return false;
        }
        Vb vb = (Vb) obj;
        return this.f6911a == vb.f6911a && Intrinsics.areEqual(this.b, vb.b) && this.c == vb.c && this.d == vb.d && Intrinsics.areEqual(this.e, vb.e);
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(this.d) + ((Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.f6911a) * 31)) * 31)) * 31)) * 31;
        InlineParams inlineParams = this.e;
        return hashCode + (inlineParams == null ? 0 : inlineParams.hashCode());
    }

    public final String toString() {
        return "LandingPageState(isInAppBrowser=" + this.f6911a + ", landingScheme=" + this.b + ", isCCTEnabled=" + this.c + ", isPartialTabsEnabled=" + this.d + ", inlineParams=" + this.e + ")";
    }

    public /* synthetic */ Vb(boolean z, String str, boolean z2, int i) {
        this(z, (i & 2) != 0 ? "DEFAULT" : str, z2, false, null);
    }
}
