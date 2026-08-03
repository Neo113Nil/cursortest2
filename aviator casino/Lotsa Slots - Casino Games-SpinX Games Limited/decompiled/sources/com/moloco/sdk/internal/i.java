package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public abstract class i {
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f6965a;
    public final int b;

    public static final class a extends com.moloco.sdk.internal.i {
        public static final int f = 0;
        public final int d;
        public final int e;

        public a(int i, int i2) {
            super(i, i2, null);
            this.d = i;
            this.e = i2;
        }

        public final com.moloco.sdk.internal.i.a a(int i, int i2) {
            return new com.moloco.sdk.internal.i.a(i, i2);
        }

        @Override // com.moloco.sdk.internal.i
        public int b() {
            return this.d;
        }

        public final int c() {
            return this.d;
        }

        public final int d() {
            return this.e;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.moloco.sdk.internal.i.a)) {
                return false;
            }
            com.moloco.sdk.internal.i.a aVar = (com.moloco.sdk.internal.i.a) obj;
            return this.d == aVar.d && this.e == aVar.e;
        }

        public int hashCode() {
            return (this.d * 31) + this.e;
        }

        public java.lang.String toString() {
            return "Custom(wDp=" + this.d + ", hDp=" + this.e + ')';
        }

        public static /* synthetic */ com.moloco.sdk.internal.i.a a(com.moloco.sdk.internal.i.a aVar, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = aVar.d;
            }
            if ((i3 & 2) != 0) {
                i2 = aVar.e;
            }
            return aVar.a(i, i2);
        }

        @Override // com.moloco.sdk.internal.i
        public int a() {
            return this.e;
        }
    }

    public static final class b extends com.moloco.sdk.internal.i {
        public static final com.moloco.sdk.internal.i.b d = new com.moloco.sdk.internal.i.b();
        public static final int e = 0;

        public b() {
            super(androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, null);
        }
    }

    public static final class c extends com.moloco.sdk.internal.i {
        public static final com.moloco.sdk.internal.i.c d = new com.moloco.sdk.internal.i.c();
        public static final int e = 0;

        public c() {
            super(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, null);
        }
    }

    public static final class d extends com.moloco.sdk.internal.i {
        public static final com.moloco.sdk.internal.i.d d = new com.moloco.sdk.internal.i.d();
        public static final int e = 0;

        public d() {
            super(728, 90, null);
        }
    }

    public /* synthetic */ i(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.f6965a;
    }

    public i(int i, int i2) {
        this.f6965a = i;
        this.b = i2;
    }
}
