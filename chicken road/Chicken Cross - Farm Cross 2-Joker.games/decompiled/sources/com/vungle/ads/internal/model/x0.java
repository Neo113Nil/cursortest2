package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class x0 {
    public static final w0 Companion = new w0();

    /* renamed from: a, reason: collision with root package name */
    public final String f12027a;

    public /* synthetic */ x0(int i, String str) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, v0.f12020a.getDescriptor());
        }
        this.f12027a = str;
    }

    public static final void a(x0 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.f12027a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && Intrinsics.areEqual(this.f12027a, ((x0) obj).f12027a);
    }

    public final int hashCode() {
        return this.f12027a.hashCode();
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("CCPA(status=").append(this.f12027a).append(')').toString();
    }

    public x0(String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f12027a = status;
    }
}
