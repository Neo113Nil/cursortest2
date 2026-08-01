package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class a1 {
    public static final z0 Companion = new z0();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f11952a;

    public /* synthetic */ a1(int i, Boolean bool) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, y0.f12029a.getDescriptor());
        }
        this.f11952a = bool;
    }

    public static final void a(a1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.f11952a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && Intrinsics.areEqual(this.f11952a, ((a1) obj).f11952a);
    }

    public final int hashCode() {
        Boolean bool = this.f11952a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("COPPA(isCoppa=").append(this.f11952a).append(')').toString();
    }

    public a1(Boolean bool) {
        this.f11952a = bool;
    }
}
