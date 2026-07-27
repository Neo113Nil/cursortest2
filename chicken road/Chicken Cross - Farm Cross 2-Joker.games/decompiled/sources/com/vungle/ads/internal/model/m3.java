package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes7.dex */
public final class m3 {
    public static final l3 Companion = new l3();

    /* renamed from: a, reason: collision with root package name */
    public final String f11993a;

    public /* synthetic */ m3(int i, String str) {
        if ((i & 1) == 0) {
            this.f11993a = null;
        } else {
            this.f11993a = str;
        }
    }

    public static final void a(m3 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.f11993a == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.f11993a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3) && Intrinsics.areEqual(this.f11993a, ((m3) obj).f11993a);
    }

    public final int hashCode() {
        String str = this.f11993a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("RtbRequest(sdkUserAgent=").append(this.f11993a).append(')').toString();
    }

    public m3(String str) {
        this.f11993a = str;
    }
}
