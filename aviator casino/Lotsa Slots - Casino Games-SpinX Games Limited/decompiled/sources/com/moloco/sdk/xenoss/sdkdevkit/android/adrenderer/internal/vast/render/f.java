package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* loaded from: classes5.dex */
public final class f {
    public static final int h = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r f7907a;
    public final java.io.File b;
    public final java.lang.Integer c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e g;

    public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar, java.io.File localMediaResource, java.lang.Integer num, java.lang.String networkMediaResource, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h tracking, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localMediaResource, "localMediaResource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkMediaResource, "networkMediaResource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracking, "tracking");
        this.f7907a = rVar;
        this.b = localMediaResource;
        this.c = num;
        this.d = networkMediaResource;
        this.e = str;
        this.f = tracking;
        this.g = eVar;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r a() {
        return this.f7907a;
    }

    public final java.io.File b() {
        return this.b;
    }

    public final java.lang.Integer c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.d;
    }

    public final java.lang.String e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7907a, fVar.f7907a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, fVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, fVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, fVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, fVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, fVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, fVar.g);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h f() {
        return this.f;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e g() {
        return this.g;
    }

    public final java.lang.String h() {
        return this.e;
    }

    public int hashCode() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar = this.f7907a;
        int hashCode = (((rVar == null ? 0 : rVar.hashCode()) * 31) + this.b.hashCode()) * 31;
        java.lang.Integer num = this.c;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.d.hashCode()) * 31;
        java.lang.String str = this.e;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f.hashCode()) * 31;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVar = this.g;
        return hashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i() {
        return this.g;
    }

    public final java.io.File j() {
        return this.b;
    }

    public final java.lang.Integer k() {
        return this.c;
    }

    public final java.lang.String l() {
        return this.d;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r m() {
        return this.f7907a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h n() {
        return this.f;
    }

    public java.lang.String toString() {
        return "Linear(skipOffset=" + this.f7907a + ", localMediaResource=" + this.b + ", localMediaResourceBitrate=" + this.c + ", networkMediaResource=" + this.d + ", clickThroughUrl=" + this.e + ", tracking=" + this.f + ", icon=" + this.g + ')';
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar, java.io.File localMediaResource, java.lang.Integer num, java.lang.String networkMediaResource, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h tracking, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localMediaResource, "localMediaResource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkMediaResource, "networkMediaResource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracking, "tracking");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f(rVar, localMediaResource, num, networkMediaResource, str, tracking, eVar);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar, java.io.File file, java.lang.Integer num, java.lang.String str, java.lang.String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            rVar = fVar.f7907a;
        }
        if ((i & 2) != 0) {
            file = fVar.b;
        }
        java.io.File file2 = file;
        if ((i & 4) != 0) {
            num = fVar.c;
        }
        java.lang.Integer num2 = num;
        if ((i & 8) != 0) {
            str = fVar.d;
        }
        java.lang.String str3 = str;
        if ((i & 16) != 0) {
            str2 = fVar.e;
        }
        java.lang.String str4 = str2;
        if ((i & 32) != 0) {
            hVar = fVar.f;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h hVar2 = hVar;
        if ((i & 64) != 0) {
            eVar = fVar.g;
        }
        return fVar.a(rVar, file2, num2, str3, str4, hVar2, eVar);
    }
}
