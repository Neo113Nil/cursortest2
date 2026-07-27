package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes7.dex */
public final class d1 {
    public static final c1 Companion = new c1();

    /* renamed from: a, reason: collision with root package name */
    public final double f11962a;
    public final int b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public d1(double d, int i, boolean z, String parentAuctionId, String creativeId, String adUnitId, String str) {
        Intrinsics.checkNotNullParameter(parentAuctionId, "parentAuctionId");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f11962a = d;
        this.b = i;
        this.c = z;
        this.d = parentAuctionId;
        this.e = creativeId;
        this.f = adUnitId;
        this.g = str;
    }

    public static final void a(d1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeDoubleElement(serialDesc, 0, self.f11962a);
        output.encodeIntElement(serialDesc, 1, self.b);
        output.encodeBooleanElement(serialDesc, 2, self.c);
        output.encodeStringElement(serialDesc, 3, self.d);
        output.encodeStringElement(serialDesc, 4, self.e);
        output.encodeStringElement(serialDesc, 5, self.f);
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.g == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Intrinsics.areEqual((Object) Double.valueOf(this.f11962a), (Object) Double.valueOf(d1Var.f11962a)) && this.b == d1Var.b && this.c == d1Var.c && Intrinsics.areEqual(this.d, d1Var.d) && Intrinsics.areEqual(this.e, d1Var.e) && Intrinsics.areEqual(this.f, d1Var.f) && Intrinsics.areEqual(this.g, d1Var.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (Integer.hashCode(this.b) + (Double.hashCode(this.f11962a) * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + i) * 31)) * 31)) * 31)) * 31;
        String str = this.g;
        return hashCode2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("CSBParam(bidfloor=").append(this.f11962a).append(", phase=").append(this.b).append(", isVXWinner=").append(this.c).append(", parentAuctionId=").append(this.d).append(", creativeId=").append(this.e).append(", adUnitId=").append(this.f).append(", ext=").append(this.g).append(')').toString();
    }

    public /* synthetic */ d1(int i, double d, int i2, boolean z, String str, String str2, String str3, String str4) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, b1.f11954a.getDescriptor());
        }
        this.f11962a = d;
        this.b = i2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
    }
}
