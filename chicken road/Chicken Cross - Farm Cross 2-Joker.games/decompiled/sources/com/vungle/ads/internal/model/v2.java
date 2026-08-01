package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class v2 {
    public static final u2 Companion = new u2();

    /* renamed from: a, reason: collision with root package name */
    public final l2 f12022a;
    public final p2 b;

    public /* synthetic */ v2(int i, l2 l2Var, p2 p2Var) {
        if ((i & 1) == 0) {
            this.f12022a = null;
        } else {
            this.f12022a = l2Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = p2Var;
        }
    }

    public static final void a(v2 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f12022a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, j2.f11982a, self.f12022a);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.b == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, m2.f11992a, self.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return Intrinsics.areEqual(this.f12022a, v2Var.f12022a) && Intrinsics.areEqual(this.b, v2Var.b);
    }

    public final int hashCode() {
        l2 l2Var = this.f12022a;
        int hashCode = (l2Var == null ? 0 : l2Var.hashCode()) * 31;
        p2 p2Var = this.b;
        return hashCode + (p2Var != null ? p2Var.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("UserPrivacy(gdpr=").append(this.f12022a).append(", iab=").append(this.b).append(')').toString();
    }
}
