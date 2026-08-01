package com.vungle.ads.internal.model;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes7.dex */
public final class w2 {
    public static final c2 Companion = new c2();

    /* renamed from: a, reason: collision with root package name */
    public final b2 f12025a;
    public final f2 b;
    public final i2 c;
    public final s2 d;
    public final List e;
    public final v2 f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Boolean m;
    public final Boolean n;
    public final Boolean o;
    public Long p;
    public y1 q;
    public Boolean r;
    public final Boolean s;
    public final Map t;

    public /* synthetic */ w2(int i, b2 b2Var, f2 f2Var, i2 i2Var, s2 s2Var, List list, v2 v2Var, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l, y1 y1Var, Boolean bool7, Boolean bool8, Map map) {
        if ((i & 1) == 0) {
            this.f12025a = null;
        } else {
            this.f12025a = b2Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f2Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = i2Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = s2Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = v2Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        this.h = (i & 128) == 0 ? Boolean.TRUE : bool;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool5;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = bool6;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = l;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = y1Var;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = bool7;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = bool8;
        }
        if ((i & 524288) == 0) {
            this.t = null;
        } else {
            this.t = map;
        }
    }

    public static final void a(w2 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f12025a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, z1.f12032a, self.f12025a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, d2.f11963a, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, g2.f11972a, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, q2.f12006a, self.d);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.e != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, new ArrayListSerializer(h3.f11975a), self.e);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.f != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, t2.f12016a, self.f);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.g != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.g);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.h, Boolean.TRUE)) {
            output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.h);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.i != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self.i);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.j != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.j);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.k != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, BooleanSerializer.INSTANCE, self.k);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.l != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, IntSerializer.INSTANCE, self.l);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.m != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, BooleanSerializer.INSTANCE, self.m);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.n != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, BooleanSerializer.INSTANCE, self.n);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.o != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, BooleanSerializer.INSTANCE, self.o);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.p != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, LongSerializer.INSTANCE, self.p);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.q != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, w1.f12024a, self.q);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.r != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, BooleanSerializer.INSTANCE, self.r);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.s != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, BooleanSerializer.INSTANCE, self.s);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 19) && self.t == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 19, new LinkedHashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE), self.t);
    }

    public final f2 b() {
        return this.b;
    }

    public final i2 c() {
        return this.c;
    }

    public final List d() {
        return this.e;
    }

    public final Map e() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return Intrinsics.areEqual(this.f12025a, w2Var.f12025a) && Intrinsics.areEqual(this.b, w2Var.b) && Intrinsics.areEqual(this.c, w2Var.c) && Intrinsics.areEqual(this.d, w2Var.d) && Intrinsics.areEqual(this.e, w2Var.e) && Intrinsics.areEqual(this.f, w2Var.f) && Intrinsics.areEqual(this.g, w2Var.g) && Intrinsics.areEqual(this.h, w2Var.h) && Intrinsics.areEqual(this.i, w2Var.i) && Intrinsics.areEqual(this.j, w2Var.j) && Intrinsics.areEqual(this.k, w2Var.k) && Intrinsics.areEqual(this.l, w2Var.l) && Intrinsics.areEqual(this.m, w2Var.m) && Intrinsics.areEqual(this.n, w2Var.n) && Intrinsics.areEqual(this.o, w2Var.o) && Intrinsics.areEqual(this.p, w2Var.p) && Intrinsics.areEqual(this.q, w2Var.q) && Intrinsics.areEqual(this.r, w2Var.r) && Intrinsics.areEqual(this.s, w2Var.s) && Intrinsics.areEqual(this.t, w2Var.t);
    }

    public final int hashCode() {
        b2 b2Var = this.f12025a;
        int hashCode = (b2Var == null ? 0 : b2Var.hashCode()) * 31;
        f2 f2Var = this.b;
        int hashCode2 = (hashCode + (f2Var == null ? 0 : f2Var.hashCode())) * 31;
        i2 i2Var = this.c;
        int hashCode3 = (hashCode2 + (i2Var == null ? 0 : i2Var.hashCode())) * 31;
        s2 s2Var = this.d;
        int hashCode4 = (hashCode3 + (s2Var == null ? 0 : s2Var.hashCode())) * 31;
        List list = this.e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        v2 v2Var = this.f;
        int hashCode6 = (hashCode5 + (v2Var == null ? 0 : v2Var.hashCode())) * 31;
        String str = this.g;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.j;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.k;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.l;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.m;
        int hashCode13 = (hashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.n;
        int hashCode14 = (hashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.o;
        int hashCode15 = (hashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l = this.p;
        int hashCode16 = (hashCode15 + (l == null ? 0 : l.hashCode())) * 31;
        y1 y1Var = this.q;
        int hashCode17 = (hashCode16 + (y1Var == null ? 0 : y1Var.hashCode())) * 31;
        Boolean bool7 = this.r;
        int hashCode18 = (hashCode17 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.s;
        int hashCode19 = (hashCode18 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Map map = this.t;
        return hashCode19 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigPayload(cleverCache=");
        sb.append(this.f12025a).append(", configSettings=").append(this.b).append(", endpoints=").append(this.c).append(", logMetricsSettings=").append(this.d).append(", placements=").append(this.e).append(", userPrivacy=").append(this.f).append(", configExtension=").append(this.g).append(", disableAdId=").append(this.h).append(", isReportIncentivizedEnabled=").append(this.i).append(", sessionTimeout=").append(this.j).append(", waitForConnectivityForTPAT=").append(this.k).append(", signalSessionTimeout=");
        sb.append(this.l).append(", signalsDisabled=").append(this.m).append(", fpdEnabled=").append(this.n).append(", rtaDebugging=").append(this.o).append(", configLastValidatedTimestamp=").append(this.p).append(", autoRedirect=").append(this.q).append(", enableOT=").append(this.r).append(", prewarmWebView=").append(this.s).append(", vmTemplates=").append(this.t).append(')');
        return sb.toString();
    }

    public final String a() {
        return this.g;
    }
}
