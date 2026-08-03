package com.moloco.sdk.internal.publisher.nativead.model;

/* loaded from: classes5.dex */
public abstract class c {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.publisher.nativead.model.b.a f7142a;
    public final int b;
    public final boolean c;

    public static final class a extends com.moloco.sdk.internal.publisher.nativead.model.c {
        public static final int f = 0;
        public final java.lang.String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.internal.publisher.nativead.model.b.a.C0195a originAsset) {
            super(originAsset, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            this.e = originAsset.e();
        }

        public final java.lang.String d() {
            return this.e;
        }
    }

    public static final class b extends com.moloco.sdk.internal.publisher.nativead.model.c {
        public static final int f = 8;
        public final android.net.Uri e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.internal.publisher.nativead.model.b.a.C0196b originAsset, android.net.Uri precachedAssetUri) {
            super(originAsset, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(precachedAssetUri, "precachedAssetUri");
            this.e = precachedAssetUri;
        }

        public final android.net.Uri d() {
            return this.e;
        }
    }

    /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.c$c, reason: collision with other inner class name */
    public static final class C0198c extends com.moloco.sdk.internal.publisher.nativead.model.c {
        public static final int f = 0;
        public final java.lang.String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0198c(com.moloco.sdk.internal.publisher.nativead.model.b.a.c originAsset) {
            super(originAsset, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            this.e = originAsset.d();
        }

        public final java.lang.String d() {
            return this.e;
        }
    }

    public static final class d extends com.moloco.sdk.internal.publisher.nativead.model.c {
        public static final int f = 8;
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.internal.publisher.nativead.model.b.a.d originAsset, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a vastAd) {
            super(originAsset, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originAsset, "originAsset");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastAd, "vastAd");
            this.e = vastAd;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a d() {
            return this.e;
        }
    }

    public /* synthetic */ c(com.moloco.sdk.internal.publisher.nativead.model.b.a aVar, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final int a() {
        return this.b;
    }

    public final com.moloco.sdk.internal.publisher.nativead.model.b.a b() {
        return this.f7142a;
    }

    public final boolean c() {
        return this.c;
    }

    public c(com.moloco.sdk.internal.publisher.nativead.model.b.a aVar) {
        this.f7142a = aVar;
        this.b = aVar.a();
        this.c = aVar.b();
    }
}
