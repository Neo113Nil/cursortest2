package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class p3 {
    public static final o3 Companion = new o3();

    /* renamed from: a, reason: collision with root package name */
    public final c3 f12002a;
    public final t1 b;
    public final n1 c;
    public final m3 d;
    public final int e;

    public /* synthetic */ p3(int i, c3 c3Var, t1 t1Var, n1 n1Var, m3 m3Var, int i2) {
        if (17 != (i & 17)) {
            PluginExceptionsKt.throwMissingFieldException(i, 17, n3.f11996a.getDescriptor());
        }
        this.f12002a = c3Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = t1Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = n1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = m3Var;
        }
        this.e = i2;
    }

    public static final void a(p3 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, x2.f12028a, self.f12002a);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, r1.f12009a, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, l1.f11988a, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, k3.f11986a, self.d);
        }
        output.encodeIntElement(serialDesc, 4, self.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        return Intrinsics.areEqual(this.f12002a, p3Var.f12002a) && Intrinsics.areEqual(this.b, p3Var.b) && Intrinsics.areEqual(this.c, p3Var.c) && Intrinsics.areEqual(this.d, p3Var.d) && this.e == p3Var.e;
    }

    public final int hashCode() {
        int hashCode = this.f12002a.hashCode() * 31;
        t1 t1Var = this.b;
        int hashCode2 = (hashCode + (t1Var == null ? 0 : t1Var.hashCode())) * 31;
        n1 n1Var = this.c;
        int hashCode3 = (hashCode2 + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
        m3 m3Var = this.d;
        return Integer.hashCode(this.e) + ((hashCode3 + (m3Var != null ? m3Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("RtbToken(device=").append(this.f12002a).append(", user=").append(this.b).append(", ext=").append(this.c).append(", request=").append(this.d).append(", ordinalView=").append(this.e).append(')').toString();
    }

    public p3(c3 device, t1 t1Var, n1 n1Var, m3 m3Var, int i) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f12002a = device;
        this.b = t1Var;
        this.c = n1Var;
        this.d = m3Var;
        this.e = i;
    }
}
