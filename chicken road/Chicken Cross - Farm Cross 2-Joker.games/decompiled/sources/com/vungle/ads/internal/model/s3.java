package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class s3 {
    public static final r3 Companion = new r3();

    /* renamed from: a, reason: collision with root package name */
    public final String f12013a;
    public String b;

    public /* synthetic */ s3(int i, String str, String str2) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, q3.f12007a.getDescriptor());
        }
        this.f12013a = str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public static final void a(s3 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.f12013a);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && Intrinsics.areEqual(self.b, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.b);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !Intrinsics.areEqual(s3.class, obj.getClass())) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return Intrinsics.areEqual(this.f12013a, s3Var.f12013a) && Intrinsics.areEqual(this.b, s3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12013a.hashCode() * 31);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("UnclosedAd(eventId=").append(this.f12013a).append(", sessionId=").append(this.b).append(')').toString();
    }

    public s3(String eventId, String sessionId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f12013a = eventId;
        this.b = sessionId;
    }

    public /* synthetic */ s3(String str) {
        this(str, "");
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }
}
