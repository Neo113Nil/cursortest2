package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class z {
    public static final y Companion = new y();

    /* renamed from: a, reason: collision with root package name */
    public final c0 f12031a;

    public /* synthetic */ z(int i, c0 c0Var) {
        if ((i & 1) == 0) {
            this.f12031a = null;
        } else {
            this.f12031a = c0Var;
        }
    }

    public static final void a(z self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.f12031a == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, a0.f11951a, self.f12031a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.areEqual(this.f12031a, ((z) obj).f12031a);
    }

    public final int hashCode() {
        c0 c0Var = this.f12031a;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.hashCode();
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("ViewAbility(om=").append(this.f12031a).append(')').toString();
    }
}
