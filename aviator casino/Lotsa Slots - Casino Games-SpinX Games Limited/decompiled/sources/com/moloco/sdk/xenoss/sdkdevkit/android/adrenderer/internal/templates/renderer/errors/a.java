package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

/* loaded from: classes5.dex */
public abstract class a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g {
    public static final int i = 0;
    public final java.lang.String h;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a$a, reason: collision with other inner class name */
    public static final class C0261a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a {
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a.C0261a j = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a.C0261a();
        public static final int k = 0;

        public C0261a() {
            super("net::ERR_CERT_AUTHORITY_INVALID", null);
        }

        public boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a.C0261a);
        }

        public int hashCode() {
            return -932810174;
        }

        public java.lang.String toString() {
            return "ERR_CERT_AUTHORITY_INVALID";
        }
    }

    public /* synthetic */ a(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    public java.lang.String c() {
        return this.h;
    }

    public a(java.lang.String str) {
        super(0, str, false, true, null);
        this.h = str;
    }
}
