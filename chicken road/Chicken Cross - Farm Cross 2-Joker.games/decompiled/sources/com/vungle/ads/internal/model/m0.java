package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class m0 {
    public static final l0 Companion = new l0();

    /* renamed from: a, reason: collision with root package name */
    public final String f11991a;
    public final String b;
    public final String c;

    public /* synthetic */ m0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, k0.f11984a.getDescriptor());
        }
        this.f11991a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final void a(m0 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.f11991a);
        output.encodeStringElement(serialDesc, 1, self.b);
        output.encodeStringElement(serialDesc, 2, self.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.areEqual(this.f11991a, m0Var.f11991a) && Intrinsics.areEqual(this.b, m0Var.b) && Intrinsics.areEqual(this.c, m0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f11991a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("AppNode(bundle=").append(this.f11991a).append(", ver=").append(this.b).append(", appId=").append(this.c).append(')').toString();
    }

    public m0(String bundle, String ver, String appId) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(ver, "ver");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f11991a = bundle;
        this.b = ver;
        this.c = appId;
    }
}
