package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* loaded from: classes5.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7784a = 0;

    public static final class a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r {
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
            return (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.a) && this.b == ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.a) obj).b;
        }

        public int hashCode() {
            return this.b;
        }

        public java.lang.String toString() {
            return "Percents(percents=" + this.b + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.a a(int i) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.a(i);
        }

        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.a aVar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.b;
            }
            return aVar.a(i);
        }
    }

    public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r {
        public static final int c = 0;
        public final long b;

        public b(long j) {
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
            return (obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b) && this.b == ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b) obj).b;
        }

        public int hashCode() {
            return kotlin.UByte$$ExternalSyntheticBackport0.m(this.b);
        }

        public java.lang.String toString() {
            return "Time(millis=" + this.b + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b a(long j) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b(j);
        }

        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b bVar, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = bVar.b;
            }
            return bVar.a(j);
        }
    }

    public /* synthetic */ r(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public r() {
    }
}
