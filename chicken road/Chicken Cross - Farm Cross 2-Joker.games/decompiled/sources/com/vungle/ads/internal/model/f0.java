package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class f0 {
    public static final e0 Companion = new e0();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f11967a;
    public final Boolean b;
    public final Integer c;

    public /* synthetic */ f0(int i, Boolean bool, Boolean bool2, Integer num) {
        if ((i & 1) == 0) {
            this.f11967a = null;
        } else {
            this.f11967a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public static final void a(f0 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f11967a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.f11967a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.b);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.c == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.c);
    }

    public final Boolean b() {
        return this.b;
    }

    public final Integer c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.areEqual(this.f11967a, f0Var.f11967a) && Intrinsics.areEqual(this.b, f0Var.b) && Intrinsics.areEqual(this.c, f0Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.f11967a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("WebViewSettings(allowFileAccessFromFileUrls=").append(this.f11967a).append(", allowUniversalAccessFromFileUrls=").append(this.b).append(", layerType=").append(this.c).append(')').toString();
    }

    public final Boolean a() {
        return this.f11967a;
    }
}
