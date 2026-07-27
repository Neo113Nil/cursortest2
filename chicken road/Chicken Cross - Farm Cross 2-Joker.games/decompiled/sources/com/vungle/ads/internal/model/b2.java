package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class b2 {
    public static final a2 Companion = new a2();

    /* renamed from: a, reason: collision with root package name */
    public final Long f11955a;
    public final Integer b;

    public /* synthetic */ b2(int i, Long l, Integer num) {
        this.f11955a = (i & 1) == 0 ? 1000L : l;
        if ((i & 2) == 0) {
            this.b = 3;
        } else {
            this.b = num;
        }
    }

    public static final void a(b2 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Integer num;
        Long l;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || (l = self.f11955a) == null || l.longValue() != 1000) {
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.f11955a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || (num = self.b) == null || num.intValue() != 3) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Intrinsics.areEqual(this.f11955a, b2Var.f11955a) && Intrinsics.areEqual(this.b, b2Var.b);
    }

    public final int hashCode() {
        Long l = this.f11955a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("CleverCache(diskSize=").append(this.f11955a).append(", diskPercentage=").append(this.b).append(')').toString();
    }
}
