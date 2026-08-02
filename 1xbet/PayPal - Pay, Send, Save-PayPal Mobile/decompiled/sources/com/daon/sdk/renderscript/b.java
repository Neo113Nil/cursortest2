package com.daon.sdk.renderscript;

/* loaded from: classes7.dex */
public abstract class b {
    public static final void a(java.lang.String str, int i, int i2, com.daon.sdk.renderscript.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public static final int b(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        int i = config == null ? -1 : com.daon.sdk.renderscript.b.a.f2847a[config.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        throw new java.lang.IllegalArgumentException("RenderScript. Only ARGB_8888 and ALPHA_8 Bitmap are supported.");
    }

    public static /* synthetic */ void a(java.lang.String str, android.graphics.Bitmap bitmap, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        a(str, bitmap, z);
    }

    public static final void a(java.lang.String str, android.graphics.Bitmap bitmap, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        if (z) {
            if (bitmap.getConfig() != android.graphics.Bitmap.Config.ARGB_8888 && bitmap.getConfig() != android.graphics.Bitmap.Config.ALPHA_8) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("RenderScript. ");
                sb.append(str);
                sb.append(" supports only ARGB_8888 and ALPHA_8 bitmaps. ");
                sb.append(bitmap.getConfig());
                sb.append(" provided.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
        } else if (bitmap.getConfig() != android.graphics.Bitmap.Config.ARGB_8888) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("RenderScript. ");
            sb2.append(str);
            sb2.append(" supports only ARGB_8888. ");
            sb2.append(bitmap.getConfig());
            sb2.append(" provided.");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        if (bitmap.getWidth() * b(bitmap) == bitmap.getRowBytes()) {
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("RenderScript ");
        sb3.append(str);
        sb3.append(". Only bitmaps with rowSize equal to the width * vectorSize are currently supported. Provided were rowBytes=");
        sb3.append(bitmap.getRowBytes());
        sb3.append(", width={");
        sb3.append(bitmap.getWidth());
        sb3.append(", and vectorSize=");
        sb3.append(b(bitmap));
        sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb3.toString().toString());
    }

    public static final android.graphics.Bitmap a(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        if (bitmap.getConfig() != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            android.graphics.Bitmap.Config config = bitmap.getConfig();
            kotlin.jvm.internal.Intrinsics.checkNotNull(config);
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, config);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "");
            return createBitmap;
        }
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap2, "");
        return createBitmap2;
    }

    public abstract /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2847a;

        static {
            int[] iArr = new int[android.graphics.Bitmap.Config.values().length];
            try {
                iArr[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f2847a = iArr;
        }
    }
}
