package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class s2 {
    public static final r2 Companion = new r2();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f12012a;
    public final Boolean b;

    public /* synthetic */ s2(int i, Integer num, Boolean bool) {
        if ((i & 1) == 0) {
            this.f12012a = null;
        } else {
            this.f12012a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }

    public static final void a(s2 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f12012a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.f12012a);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.b == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return Intrinsics.areEqual(this.f12012a, s2Var.f12012a) && Intrinsics.areEqual(this.b, s2Var.b);
    }

    public final int hashCode() {
        Integer num = this.f12012a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("LogMetricsSettings(errorLogLevel=").append(this.f12012a).append(", metricsEnabled=").append(this.b).append(')').toString();
    }
}
