package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

/* loaded from: classes5.dex */
public abstract class i extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g {
    public static final int i = 0;
    public final java.lang.String h;

    public static final class a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i {
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.a j = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.a();
        public static final int k = 0;

        public a() {
            super("net::ERR_CONNECTION_TIMED_OUT", null);
        }

        public boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.a);
        }

        public int hashCode() {
            return -56384004;
        }

        public java.lang.String toString() {
            return "ERR_CONNECTION_TIMED_OUT";
        }
    }

    public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i {
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.b j = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.b();
        public static final int k = 0;

        public b() {
            super("net::ERR_TIMED_OUT", null);
        }

        public boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.b);
        }

        public int hashCode() {
            return 389383759;
        }

        public java.lang.String toString() {
            return "ERR_TIMED_OUT";
        }
    }

    public /* synthetic */ i(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    public java.lang.String c() {
        return this.h;
    }

    public i(java.lang.String str) {
        super(-8, str, true, false, null);
        this.h = str;
    }
}
