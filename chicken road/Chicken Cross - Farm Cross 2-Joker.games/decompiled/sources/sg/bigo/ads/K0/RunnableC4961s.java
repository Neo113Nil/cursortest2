package sg.bigo.ads.K0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.webkit.ValueCallback;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.L0.C4982b;

/* renamed from: sg.bigo.ads.K0.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4961s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12364a;
    public final /* synthetic */ ValueCallback b;

    public RunnableC4961s(Bitmap bitmap, C4982b c4982b) {
        this.f12364a = bitmap;
        this.b = c4982b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap a2;
        LinearGradient linearGradient;
        float f;
        float f2;
        float f3;
        float f4;
        Bitmap bitmap = this.f12364a;
        if (bitmap.isRecycled()) {
            bitmap = null;
        } else {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width > 0 && height > 0 && (a2 = AbstractC4962t.a(width, height, Bitmap.Config.ARGB_8888)) != null) {
                Canvas canvas = new Canvas(a2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                Paint paint = new Paint();
                Paint paint2 = new Paint();
                if (width >= height) {
                    float f5 = 40;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f5, ViewCompat.MEASURED_SIZE_MASK, -1, tileMode);
                    paint.setShader(linearGradient);
                    PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                    paint.setXfermode(new PorterDuffXfermode(mode));
                    f3 = width;
                    canvas.drawRect(0.0f, 0.0f, f3, f5, paint);
                    f4 = height - 40;
                    f = height;
                    paint2.setShader(new LinearGradient(0.0f, f4, 0.0f, f, -1, ViewCompat.MEASURED_SIZE_MASK, tileMode));
                    paint2.setXfermode(new PorterDuffXfermode(mode));
                    f2 = 0.0f;
                } else {
                    float f6 = 40;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    linearGradient = new LinearGradient(0.0f, 0.0f, f6, 0.0f, ViewCompat.MEASURED_SIZE_MASK, -1, tileMode2);
                    paint.setShader(linearGradient);
                    PorterDuff.Mode mode2 = PorterDuff.Mode.DST_IN;
                    paint.setXfermode(new PorterDuffXfermode(mode2));
                    f = height;
                    canvas.drawRect(0.0f, 0.0f, f6, f, paint);
                    f2 = width - 40;
                    f3 = width;
                    paint2.setShader(new LinearGradient(f2, 0.0f, f3, 0.0f, -1, ViewCompat.MEASURED_SIZE_MASK, tileMode2));
                    paint2.setXfermode(new PorterDuffXfermode(mode2));
                    f4 = 0.0f;
                }
                canvas.drawRect(f2, f4, f3, f, paint2);
                bitmap = a2;
            }
        }
        ValueCallback valueCallback = this.b;
        if (valueCallback != null) {
            if (bitmap == null) {
                bitmap = this.f12364a;
            }
            valueCallback.onReceiveValue(bitmap);
        }
    }
}
