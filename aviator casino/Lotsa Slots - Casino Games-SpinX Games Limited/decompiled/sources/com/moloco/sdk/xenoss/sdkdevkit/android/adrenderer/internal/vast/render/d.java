package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* loaded from: classes5.dex */
public interface d {

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7901a = 0;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d$a$a, reason: collision with other inner class name */
        public static final class C0312a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a {
            public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.C0312a b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.C0312a();
            public static final int c = 0;

            public C0312a() {
                super(null);
            }
        }

        public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a {
            public static final int c = 0;
            public final int b;

            public /* synthetic */ b(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(i);
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
                return (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.b) && this.b == ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.b) obj).b;
            }

            public int hashCode() {
                return kotlin.UInt.m10908hashCodeimpl(this.b);
            }

            public java.lang.String toString() {
                return "Countdown(seconds=" + ((java.lang.Object) kotlin.UInt.m10942toStringimpl(this.b)) + ')';
            }

            public b(int i) {
                super(null);
                this.b = i;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.b a(int i) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.b(i, null);
            }

            public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.b bVar, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.b;
                }
                return bVar.a(i);
            }
        }

        public static final class c extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a {
            public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.c b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.c();
            public static final int c = 0;

            public c() {
                super(null);
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> l();
}
