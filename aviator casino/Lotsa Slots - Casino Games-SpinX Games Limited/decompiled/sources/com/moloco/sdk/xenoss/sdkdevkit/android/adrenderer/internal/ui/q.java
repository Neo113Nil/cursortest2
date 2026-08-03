package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7648a = 0;

    public static final class a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q {
        public static final int e = 0;
        public final boolean b;
        public final int c;
        public final int d;

        public /* synthetic */ a(boolean z, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, i, i2);
        }

        public final int a() {
            return this.d;
        }

        public final boolean b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public a(boolean z, int i, int i2) {
            super(null);
            this.b = z;
            this.c = i;
            this.d = i2;
        }
    }

    public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q {
        public static final int g = 8;
        public final androidx.compose.ui.graphics.painter.Painter b;
        public final java.lang.String c;
        public final long d;
        public final androidx.compose.ui.graphics.Shape e;
        public final long f;

        public /* synthetic */ b(androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str, long j, androidx.compose.ui.graphics.Shape shape, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(painter, str, j, shape, j2);
        }

        public final long a() {
            return this.f;
        }

        public final androidx.compose.ui.graphics.Shape b() {
            return this.e;
        }

        public final java.lang.String c() {
            return this.c;
        }

        public final long d() {
            return this.d;
        }

        public final androidx.compose.ui.graphics.painter.Painter e() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str, long j, androidx.compose.ui.graphics.Shape backgroundShape, long j2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "painter");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundShape, "backgroundShape");
            this.b = painter;
            this.c = str;
            this.d = j;
            this.e = backgroundShape;
            this.f = j2;
        }
    }

    public static final class c extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q {
        public static final int c = 0;
        public final java.lang.String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(java.lang.String text) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
            this.b = text;
        }

        public final java.lang.String a() {
            return this.b;
        }
    }

    public static final class d extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q {
        public static final int l = 8;
        public final java.lang.String b;
        public final androidx.compose.ui.graphics.painter.Painter c;
        public final java.lang.String d;
        public final long e;
        public final androidx.compose.ui.graphics.Shape f;
        public final long g;
        public final boolean h;
        public final boolean i;
        public final long j;
        public final long k;

        public /* synthetic */ d(java.lang.String str, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str2, long j, androidx.compose.ui.graphics.Shape shape, long j2, boolean z, boolean z2, long j3, long j4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, painter, str2, j, shape, j2, z, z2, j3, j4);
        }

        public final long a() {
            return this.g;
        }

        public final androidx.compose.ui.graphics.Shape b() {
            return this.f;
        }

        public final java.lang.String c() {
            return this.d;
        }

        public final long d() {
            return this.k;
        }

        public final long e() {
            return this.j;
        }

        public final long f() {
            return this.e;
        }

        public final androidx.compose.ui.graphics.painter.Painter g() {
            return this.c;
        }

        public final java.lang.String h() {
            return this.b;
        }

        public final boolean i() {
            return this.h;
        }

        public final boolean j() {
            return this.i;
        }

        public /* synthetic */ d(java.lang.String str, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str2, long j, androidx.compose.ui.graphics.Shape shape, long j2, boolean z, boolean z2, long j3, long j4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, painter, str2, j, shape, j2, z, z2, j3, (i & 512) != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : j4, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(java.lang.String text, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str, long j, androidx.compose.ui.graphics.Shape backgroundShape, long j2, boolean z, boolean z2, long j3, long j4) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "painter");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundShape, "backgroundShape");
            this.b = text;
            this.c = painter;
            this.d = str;
            this.e = j;
            this.f = backgroundShape;
            this.g = j2;
            this.h = z;
            this.i = z2;
            this.j = j3;
            this.k = j4;
        }
    }

    public /* synthetic */ q(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public q() {
    }
}
