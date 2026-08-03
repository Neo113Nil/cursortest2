package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* loaded from: classes5.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7910a = 0;

    public static final class a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i {
        public static final int c = 0;
        public final long b;

        public a(long j) {
            super(null);
            this.b = j;
        }

        public final long a() {
            return this.b;
        }
    }

    public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i {
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.b b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.b();
        public static final int c = 0;

        public b() {
            super(null);
        }
    }

    public static final class c extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i {
        public static final int d = 0;
        public final long b;
        public final long c;

        public c(long j, long j2) {
            super(null);
            this.b = j;
            this.c = j2;
        }

        public final long a() {
            return this.b;
        }

        public final long b() {
            return this.c;
        }

        public final long c() {
            return this.b;
        }

        public final long d() {
            return this.c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c)) {
                return false;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c) obj;
            return this.b == cVar.b && this.c == cVar.c;
        }

        public int hashCode() {
            return (kotlin.UByte$$ExternalSyntheticBackport0.m(this.b) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.c);
        }

        public java.lang.String toString() {
            return "Position(currentPositionMillis=" + this.b + ", totalDurationMillis=" + this.c + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c a(long j, long j2) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c(j, j2);
        }

        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c cVar, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = cVar.b;
            }
            if ((i & 2) != 0) {
                j2 = cVar.c;
            }
            return cVar.a(j, j2);
        }
    }

    public static final class d extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i {
        public static final int c = 0;
        public final long b;

        public d(long j) {
            super(null);
            this.b = j;
        }

        public final long a() {
            return this.b;
        }

        public final long b() {
            return this.b;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d) && this.b == ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d) obj).b;
        }

        public int hashCode() {
            return kotlin.UByte$$ExternalSyntheticBackport0.m(this.b);
        }

        public java.lang.String toString() {
            return "Preparing(totalDurationMillis=" + this.b + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d a(long j) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d(j);
        }

        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d dVar, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = dVar.b;
            }
            return dVar.a(j);
        }
    }

    public /* synthetic */ i(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public i() {
    }
}
