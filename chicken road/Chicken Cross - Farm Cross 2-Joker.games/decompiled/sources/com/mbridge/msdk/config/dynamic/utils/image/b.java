package com.mbridge.msdk.config.dynamic.utils.image;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;

/* compiled from: ImageOperateUtil.java */
/* loaded from: classes6.dex */
public class b {

    /* compiled from: ImageOperateUtil.java */
    class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f9115a;

        a(ImageView imageView) {
            this.f9115a = imageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("ImageOperateUtil", "图片下载失败: " + str + " URL: " + str2);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (!bitmap.isRecycled()) {
                    ImageView imageView = this.f9115a;
                    if (imageView instanceof ComponentImageView) {
                        ((ComponentImageView) imageView).setBitmap(bitmap);
                    } else {
                        imageView.setImageBitmap(bitmap);
                    }
                }
            } catch (Throwable th) {
                q0.b("ImageOperateUtil", "设置图片异常: " + th.getMessage());
            }
        }
    }

    public static void a(ImageView imageView, Bitmap bitmap) {
        a(imageView, bitmap, 25.0f, Shader.TileMode.MIRROR);
    }

    public static void b(final ImageView imageView, final Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                b.c(bitmap, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Bitmap bitmap, final ImageView imageView) {
        final Bitmap b = b(bitmap);
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                b.b(b, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static void a(final ImageView imageView, final Bitmap bitmap, final float f, final Shader.TileMode tileMode) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    b.a(bitmap, f, tileMode, imageView);
                }
            });
        } else {
            imageView.setImageBitmap(bitmap);
            a(imageView, f, tileMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static Bitmap b(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    int min = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    float f = min;
                    canvas.drawCircle(f, f, f, paint);
                    return createBitmap;
                }
            } catch (Throwable th) {
                q0.b("ImageOperateUtil", th.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, float f, Shader.TileMode tileMode, final ImageView imageView) {
        final Bitmap a2 = a(bitmap, f, tileMode);
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                b.a(a2, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static void a(final ImageView imageView, final Bitmap bitmap, final int i, String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        final int a2 = a(str);
        com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                b.a(bitmap, i, a2, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, int i, int i2, final ImageView imageView) {
        final Bitmap a2 = a(bitmap, i, i2);
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                b.d(a2, imageView);
            }
        });
    }

    public static void a(final ImageView imageView, final Bitmap... bitmapArr) {
        if (bitmapArr == null) {
            imageView.setImageBitmap(a());
        } else if (bitmapArr.length == 1) {
            a(imageView, bitmapArr[0]);
        } else {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    b.a(bitmapArr, imageView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap[] bitmapArr, final ImageView imageView) {
        final com.mbridge.msdk.video.dynview.shape.a build;
        ArrayList arrayList = new ArrayList();
        for (Bitmap bitmap : bitmapArr) {
            arrayList.add(a(bitmap, 25.0f, Shader.TileMode.MIRROR));
        }
        if (arrayList.size() <= 1 || (build = com.mbridge.msdk.video.dynview.shape.a.a().b((Bitmap) arrayList.get(0)).a((Bitmap) arrayList.get(1)).a(5).orientation(m0.G(com.mbridge.msdk.foundation.controller.c.n().d())).build()) == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                imageView.setImageDrawable(build);
            }
        });
    }

    public static void a(View view, float f, Shader.TileMode tileMode) {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (f <= 0.0f) {
                    f = 25.0f;
                }
                if (tileMode == null) {
                    tileMode = Shader.TileMode.MIRROR;
                }
                view.setRenderEffect(RenderEffect.createBlurEffect(f, f, tileMode));
            }
        } catch (Throwable th) {
            q0.b("ImageOperateUtil", th.getMessage());
        }
    }

    public static Bitmap a(Bitmap bitmap, float f, Shader.TileMode tileMode) {
        if (f <= 0.0f) {
            f = 25.0f;
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (tileMode == null) {
                    tileMode = Shader.TileMode.MIRROR;
                }
                RenderEffect createBlurEffect = RenderEffect.createBlurEffect(f, f, tileMode);
                ImageReader newInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
                RenderNode renderNode = new RenderNode("BlurEffect");
                HardwareRenderer hardwareRenderer = new HardwareRenderer();
                hardwareRenderer.setSurface(newInstance.getSurface());
                hardwareRenderer.setContentRoot(renderNode);
                renderNode.setPosition(0, 0, newInstance.getWidth(), newInstance.getHeight());
                renderNode.setRenderEffect(createBlurEffect);
                renderNode.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                renderNode.endRecording();
                hardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
                Image acquireNextImage = newInstance.acquireNextImage();
                HardwareBuffer hardwareBuffer = acquireNextImage.getHardwareBuffer();
                if (hardwareBuffer != null) {
                    Bitmap wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
                    acquireNextImage.close();
                    hardwareBuffer.close();
                    return wrapHardwareBuffer;
                }
                return a();
            }
            return a(bitmap);
        } catch (Throwable th) {
            q0.b("ImageOperateUtil", th.getMessage());
            return null;
        }
    }

    private static Bitmap a(Bitmap bitmap) {
        try {
            Bitmap a2 = com.mbridge.msdk.config.dynamic.utils.image.a.a(bitmap, 10);
            return (a2 == null || a2.isRecycled()) ? a() : a2;
        } catch (Throwable th) {
            q0.b("ImageOperateUtil", th.getMessage());
            return null;
        }
    }

    private static Bitmap a() {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_4444);
            createBitmap.eraseColor(Color.parseColor("#FF0000"));
            return createBitmap;
        } catch (Throwable th) {
            q0.b("ImageOperateUtil", th.getMessage());
            return null;
        }
    }

    public static Bitmap a(Bitmap bitmap, float f, int i) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            Path path = new Path();
            RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
            switch (i) {
                case 0:
                    path.addRoundRect(rectF, f, f, Path.Direction.CW);
                    break;
                case 1:
                    path.addRoundRect(rectF, new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                    break;
                case 2:
                    path.addRoundRect(rectF, new float[]{0.0f, 0.0f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                    break;
                case 3:
                    path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, f}, Path.Direction.CW);
                    break;
                case 4:
                    path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, 0.0f, 0.0f}, Path.Direction.CW);
                    break;
                case 5:
                    path.addRoundRect(rectF, new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                    break;
                case 6:
                    path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f}, Path.Direction.CW);
                    break;
                case 7:
                    path.addRoundRect(rectF, new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f}, Path.Direction.CW);
                    break;
                case 8:
                    path.addRoundRect(rectF, new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f}, Path.Direction.CW);
                    break;
                case 9:
                    path.addRoundRect(rectF, new float[]{f, f, 0.0f, 0.0f, f, f, 0.0f, 0.0f}, Path.Direction.CW);
                    break;
                case 10:
                    path.addRoundRect(rectF, new float[]{0.0f, 0.0f, f, f, 0.0f, 0.0f, f, f}, Path.Direction.CW);
                    break;
            }
            canvas.clipPath(path);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return createBitmap;
        } catch (Throwable th) {
            q0.b("ImageOperateUtil", th.getMessage());
            return null;
        }
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str) || str.equals("corner")) {
            return 0;
        }
        String replace = str.replace("corner", "");
        if (TextUtils.isEmpty(replace)) {
            return 0;
        }
        String upperCase = replace.toUpperCase();
        upperCase.hashCode();
        upperCase.hashCode();
        switch (upperCase) {
        }
        return 0;
    }

    public static void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new a(imageView));
    }
}
