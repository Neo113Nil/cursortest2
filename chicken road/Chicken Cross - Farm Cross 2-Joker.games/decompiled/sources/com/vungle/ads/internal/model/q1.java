package com.vungle.ads.internal.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes7.dex */
public final class q1 {
    public static final p1 Companion = new p1();

    /* renamed from: a, reason: collision with root package name */
    public final List f12005a;
    public u0 b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final d1 g;

    public /* synthetic */ q1(int i, List list, u0 u0Var, Long l, String str, String str2, String str3, d1 d1Var) {
        if ((i & 1) == 0) {
            this.f12005a = null;
        } else {
            this.f12005a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = u0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d1Var;
        }
    }

    public static final void a(q1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f12005a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, new ArrayListSerializer(StringSerializer.INSTANCE), self.f12005a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, s0.f12011a, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.d);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.e != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.e);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.f != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.f);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.g == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, b1.f11954a, self.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Intrinsics.areEqual(this.f12005a, q1Var.f12005a) && Intrinsics.areEqual(this.b, q1Var.b) && Intrinsics.areEqual(this.c, q1Var.c) && Intrinsics.areEqual(this.d, q1Var.d) && Intrinsics.areEqual(this.e, q1Var.e) && Intrinsics.areEqual(this.f, q1Var.f) && Intrinsics.areEqual(this.g, q1Var.g);
    }

    public final int hashCode() {
        List list = this.f12005a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        u0 u0Var = this.b;
        int hashCode2 = (hashCode + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d1 d1Var = this.g;
        return hashCode6 + (d1Var != null ? d1Var.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("RequestParam(placements=").append(this.f12005a).append(", adSize=").append(this.b).append(", adStartTime=").append(this.c).append(", advAppId=").append(this.d).append(", placementReferenceId=").append(this.e).append(", user=").append(this.f).append(", csb=").append(this.g).append(')').toString();
    }

    public q1(List list, u0 u0Var, Long l, String str, String str2, String str3, d1 d1Var) {
        this.f12005a = list;
        this.b = u0Var;
        this.c = l;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = d1Var;
    }

    public final List a() {
        return this.f12005a;
    }

    public final void a(u0 u0Var) {
        this.b = u0Var;
    }

    public /* synthetic */ q1(List list, Long l, String str, String str2, String str3, d1 d1Var, int i) {
        this((i & 1) != 0 ? null : list, (u0) null, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : d1Var);
    }
}
