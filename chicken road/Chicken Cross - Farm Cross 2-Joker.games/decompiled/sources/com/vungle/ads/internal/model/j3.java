package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes7.dex */
public final class j3 {
    public static final i3 Companion = new i3();

    /* renamed from: a, reason: collision with root package name */
    public final String f11983a;
    public final boolean b;
    public final String c;

    public /* synthetic */ j3(int i, String str, boolean z, String str2) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, h3.f11975a.getDescriptor());
        }
        this.f11983a = str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public static final void a(j3 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.f11983a);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b) {
            output.encodeBooleanElement(serialDesc, 1, self.b);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.c == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.c);
    }

    public final String b() {
        return this.f11983a;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return Intrinsics.areEqual(this.c, "appopen");
    }

    public final boolean e() {
        return Intrinsics.areEqual(this.c, "banner");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return Intrinsics.areEqual(this.f11983a, j3Var.f11983a) && this.b == j3Var.b && Intrinsics.areEqual(this.c, j3Var.c);
    }

    public final boolean f() {
        return Intrinsics.areEqual(this.c, "in_line");
    }

    public final boolean g() {
        return Intrinsics.areEqual(this.c, "interstitial");
    }

    public final boolean h() {
        return Intrinsics.areEqual(this.c, "mrec");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f11983a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.c;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public final boolean i() {
        return Intrinsics.areEqual(this.c, "native");
    }

    public final boolean j() {
        return Intrinsics.areEqual(this.c, "rewarded");
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("Placement(referenceId=").append(this.f11983a).append(", headerBidding=").append(this.b).append(", type=").append(this.c).append(')').toString();
    }

    public j3(String referenceId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        this.f11983a = referenceId;
        this.b = z;
        this.c = str;
    }

    public final boolean a() {
        return this.b;
    }

    public /* synthetic */ j3(String str) {
        this(str, null, false);
    }
}
