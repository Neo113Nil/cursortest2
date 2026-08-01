package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class y1 {
    public static final x1 Companion = new x1();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f12030a;
    public final Long b;

    public /* synthetic */ y1(int i, Boolean bool, Long l) {
        this.f12030a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.b = Long.MAX_VALUE;
        } else {
            this.b = l;
        }
    }

    public static final void a(y1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Long l;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.f12030a, Boolean.FALSE)) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.f12030a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || (l = self.b) == null || l.longValue() != Long.MAX_VALUE) {
            output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return Intrinsics.areEqual(this.f12030a, y1Var.f12030a) && Intrinsics.areEqual(this.b, y1Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.f12030a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("AutoRedirect(allowAutoRedirect=").append(this.f12030a).append(", afterClickDuration=").append(this.b).append(')').toString();
    }
}
