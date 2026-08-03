package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7774a = 0;

    public static final class a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h {
        public static final int c = 8;
        public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e> companions) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companions, "companions");
            this.b = companions;
        }

        public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e> a() {
            return this.b;
        }
    }

    public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h {
        public static final int c = 8;
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p linear) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linear, "linear");
            this.b = linear;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p a() {
            return this.b;
        }
    }

    public /* synthetic */ h(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public h() {
    }
}
