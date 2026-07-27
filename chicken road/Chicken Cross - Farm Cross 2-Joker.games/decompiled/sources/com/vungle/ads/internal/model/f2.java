package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class f2 {
    public static final e2 Companion = new e2();

    /* renamed from: a, reason: collision with root package name */
    public final Long f11969a;

    public /* synthetic */ f2(int i, Long l) {
        if ((i & 1) == 0) {
            this.f11969a = null;
        } else {
            this.f11969a = l;
        }
    }

    public static final void a(f2 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.f11969a == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.f11969a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2) && Intrinsics.areEqual(this.f11969a, ((f2) obj).f11969a);
    }

    public final int hashCode() {
        Long l = this.f11969a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("ConfigSettings(refreshTime=").append(this.f11969a).append(')').toString();
    }

    public final Long a() {
        return this.f11969a;
    }
}
