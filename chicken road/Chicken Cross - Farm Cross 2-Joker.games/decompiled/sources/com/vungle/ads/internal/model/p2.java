package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class p2 {
    public static final n2 Companion = new n2();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f12001a;

    public /* synthetic */ p2(int i, Integer num) {
        if ((i & 1) == 0) {
            this.f12001a = null;
        } else {
            this.f12001a = num;
        }
    }

    public static final void a(p2 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.f12001a == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.f12001a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2) && Intrinsics.areEqual(this.f12001a, ((p2) obj).f12001a);
    }

    public final int hashCode() {
        Integer num = this.f12001a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("IABSettings(tcfStatus=").append(this.f12001a).append(')').toString();
    }
}
