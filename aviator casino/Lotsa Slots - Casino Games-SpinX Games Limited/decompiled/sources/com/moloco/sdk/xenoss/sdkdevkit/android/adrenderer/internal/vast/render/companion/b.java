package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7823a = 0;

    public static final class a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b {
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.a b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.a();
        public static final int c = 0;

        public a() {
            super(null);
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b$b, reason: collision with other inner class name */
    public static final class C0295b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b {
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.C0295b b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.C0295b();
        public static final int c = 0;

        public C0295b() {
            super(null);
        }
    }

    public static final class c extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b {
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.c b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.c();
        public static final int c = 0;

        public c() {
            super(null);
        }
    }

    public static final class d extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b {
        public static final int c = 8;
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            this.b = error;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c a() {
            return this.b;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.d) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public java.lang.String toString() {
            return "Error(error=" + this.b + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.d a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.d(error);
        }

        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.d a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cVar = dVar.b;
            }
            return dVar.a(cVar);
        }
    }

    public /* synthetic */ b(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public b() {
    }
}
