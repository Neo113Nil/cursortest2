package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7911a = 0;

    public static final class a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j {
        public static final int c = 0;
        public final int b;

        public a(int i) {
            super(null);
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.a) && this.b == ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.a) obj).b;
        }

        public int hashCode() {
            return this.b;
        }

        public java.lang.String toString() {
            return "Html(webViewId=" + this.b + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.a a(int i) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.a(i);
        }

        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.a aVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.b;
            }
            return aVar.a(i);
        }
    }

    public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j {
        public static final int e = 0;
        public final java.lang.String b;
        public final int c;
        public final int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String imageUrl, int i, int i2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.b = imageUrl;
            this.c = i;
            this.d = i2;
        }

        public final java.lang.String a() {
            return this.b;
        }

        public final int b() {
            return this.c;
        }

        public final int c() {
            return this.d;
        }

        public final int d() {
            return this.d;
        }

        public final java.lang.String e() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.b)) {
                return false;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.b) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int f() {
            return this.c;
        }

        public int hashCode() {
            return (((this.b.hashCode() * 31) + this.c) * 31) + this.d;
        }

        public java.lang.String toString() {
            return "Image(imageUrl=" + this.b + ", w=" + this.c + ", h=" + this.d + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.b a(java.lang.String imageUrl, int i, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.b(imageUrl, i, i2);
        }

        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.b bVar, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = bVar.b;
            }
            if ((i3 & 2) != 0) {
                i = bVar.c;
            }
            if ((i3 & 4) != 0) {
                i2 = bVar.d;
            }
            return bVar.a(str, i, i2);
        }
    }

    public /* synthetic */ j(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public j() {
    }
}
