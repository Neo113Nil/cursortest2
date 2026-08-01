package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class k1 {
    public static final j1 Companion = new j1();

    /* renamed from: a, reason: collision with root package name */
    public final String f11985a;

    public /* synthetic */ k1(int i, String str) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, i1.f11978a.getDescriptor());
        }
        this.f11985a = str;
    }

    public static final void a(k1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.f11985a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && Intrinsics.areEqual(this.f11985a, ((k1) obj).f11985a);
    }

    public final int hashCode() {
        return this.f11985a.hashCode();
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("IAB(tcf=").append(this.f11985a).append(')').toString();
    }

    public k1(String tcf) {
        Intrinsics.checkNotNullParameter(tcf, "tcf");
        this.f11985a = tcf;
    }
}
