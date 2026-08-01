package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes7.dex */
public final class c0 {
    public static final b0 Companion = new b0();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f11958a;
    public final String b;

    public /* synthetic */ c0(int i, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.f11958a = null;
        } else {
            this.f11958a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public static final void a(c0 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f11958a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.f11958a);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.b == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.areEqual(this.f11958a, c0Var.f11958a) && Intrinsics.areEqual(this.b, c0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.f11958a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("ViewAbilityInfo(isEnabled=").append(this.f11958a).append(", extraVast=").append(this.b).append(')').toString();
    }
}
