package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes7.dex */
public final class n1 {
    public static final m1 Companion = new m1();

    /* renamed from: a, reason: collision with root package name */
    public final String f11995a;
    public String b;
    public final Long c;

    public /* synthetic */ n1(int i, String str, String str2, Long l) {
        if ((i & 1) == 0) {
            this.f11995a = null;
        } else {
            this.f11995a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
    }

    public static final void a(n1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f11995a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.f11995a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.b);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.c == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Intrinsics.areEqual(this.f11995a, n1Var.f11995a) && Intrinsics.areEqual(this.b, n1Var.b) && Intrinsics.areEqual(this.c, n1Var.c);
    }

    public final int hashCode() {
        String str = this.f11995a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("RequestExt(configExtension=").append(this.f11995a).append(", signals=").append(this.b).append(", configLastValidatedTimestamp=").append(this.c).append(')').toString();
    }

    public n1(String str, String str2, Long l) {
        this.f11995a = str;
        this.b = str2;
        this.c = l;
    }
}
