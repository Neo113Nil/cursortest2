package sg.bigo.ads.K0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.Log;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.K0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4962t {
    public static Bitmap a(Context context, Bitmap bitmap) {
        Bitmap bitmap2;
        Bitmap bitmap3;
        if (bitmap != null && context != null) {
            int round = Math.round(bitmap.getWidth() * 0.25f);
            int round2 = Math.round(bitmap.getHeight() * 0.25f);
            if (round > 0 && round2 > 0) {
                try {
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, round, round2, false);
                } catch (Throwable th) {
                    AbstractC5496a.a("BitmapUtils", Log.getStackTraceString(th));
                    bitmap2 = null;
                }
                if (bitmap2 == null) {
                    return null;
                }
                Bitmap.Config config = bitmap2.getConfig();
                Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                if (config != config2) {
                    bitmap2 = bitmap.copy(config2, true);
                }
                try {
                    bitmap3 = Bitmap.createBitmap(bitmap2);
                } catch (Throwable th2) {
                    AbstractC5496a.a("BitmapUtils", Log.getStackTraceString(th2));
                    bitmap3 = null;
                }
                sg.bigo.ads.X.c cVar = new sg.bigo.ads.X.c(context);
                if (!cVar.a(10.0f)) {
                    return null;
                }
                cVar.a(bitmap2, bitmap3);
                bitmap2.recycle();
                cVar.a();
                return bitmap3;
            }
        }
        return null;
    }

    public static Bitmap b(String str, Context context) {
        sg.bigo.ads.U.c a2;
        if (context == null || (a2 = a(str, context)) == null) {
            return null;
        }
        return a2.f12561a;
    }

    public static void a(Context context, Bitmap bitmap, ValueCallback valueCallback) {
        AbstractC5446j.a(3, null, new RunnableC4958o(context, bitmap, valueCallback), 0L);
    }

    public static Bitmap a(int i, int i2, Bitmap.Config config) {
        try {
            return Bitmap.createBitmap(i, i2, config);
        } catch (Throwable th) {
            AbstractC5496a.a("BitmapUtils", Log.getStackTraceString(th));
            return null;
        }
    }

    public static Drawable a(float f, float f2, float f3, float f4, Rect rect, int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null));
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        return rect == null ? shapeDrawable : new InsetDrawable((Drawable) shapeDrawable, rect.left, rect.top, rect.right, rect.bottom);
    }

    public static Drawable a(float f, float f2, float f3, float f4, int i, float f5, boolean[] zArr) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null));
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(f5);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        if (zArr == null || zArr.length == 0) {
            return shapeDrawable;
        }
        float f6 = 0.0f;
        float f7 = (zArr.length < 1 || !zArr[0]) ? 0.0f : -f5;
        float f8 = (zArr.length < 2 || !zArr[1]) ? 0.0f : -f5;
        float f9 = (zArr.length < 3 || !zArr[2]) ? 0.0f : -f5;
        if (zArr.length >= 4 && zArr[3]) {
            f6 = -f5;
        }
        return new InsetDrawable((Drawable) shapeDrawable, (int) f7, (int) f8, (int) f9, (int) f6);
    }

    public static sg.bigo.ads.U.c a(String str, Context context) {
        Bitmap bitmap;
        if (context == null) {
            return null;
        }
        BitmapFactory.Options a2 = a(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels, str);
        try {
            bitmap = BitmapFactory.decodeFile(str, a2);
        } catch (OutOfMemoryError unused) {
            AbstractC5496a.a("BitmapUtils", "decodeImage OutOfMemoryError:size = " + a2.inSampleSize + ",filePath=" + str);
            bitmap = null;
        }
        if (bitmap != null) {
            return new sg.bigo.ads.U.c(bitmap, a2.outMimeType, str);
        }
        return null;
    }

    public static sg.bigo.ads.U.c a(String str) {
        Bitmap bitmap;
        BitmapFactory.Options a2 = a(128, 128, str);
        try {
            bitmap = BitmapFactory.decodeFile(str, a2);
        } catch (OutOfMemoryError unused) {
            AbstractC5496a.a("BitmapUtils", "decodeIcon OutOfMemoryError:size = " + a2.inSampleSize + ",filePath=" + str);
            bitmap = null;
        }
        if (bitmap != null) {
            return new sg.bigo.ads.U.c(bitmap, a2.outMimeType, str);
        }
        return null;
    }

    public static void a(ImageView imageView, Bitmap bitmap) {
        if (imageView == null || bitmap == null) {
            return;
        }
        AnimationDrawable animationDrawable = new AnimationDrawable();
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            animationDrawable.addFrame(drawable, 0);
        }
        animationDrawable.addFrame(new BitmapDrawable(imageView.getResources(), bitmap), 300);
        animationDrawable.setOneShot(true);
        animationDrawable.setEnterFadeDuration(300);
        animationDrawable.start();
        imageView.setImageDrawable(animationDrawable);
    }

    public static BitmapFactory.Options a(int i, int i2, String str) {
        if (i <= 0 || i2 <= 0) {
            return new BitmapFactory.Options();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i3 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        if (i4 <= 0 || i5 <= 0) {
            return new BitmapFactory.Options();
        }
        if (i4 > i || i5 > i2) {
            int i6 = i4 / 2;
            int i7 = i5 / 2;
            while (true) {
                if (i6 / i3 < i && i7 / i3 < i2) {
                    break;
                }
                i3 *= 2;
            }
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = i3;
        return options;
    }

    public static Bitmap a(Context context, float f, int i, int i2, int i3, boolean z) {
        Drawable c;
        Paint paint;
        Paint paint2;
        Context context2 = context;
        Paint paint3 = null;
        if (f <= 0.0f || (c = AbstractC4944a.c(context2, i)) == null) {
            return null;
        }
        Bitmap bitmap = ((BitmapDrawable) AbstractC4944a.c(context2, i2)).getBitmap();
        Bitmap extractAlpha = z ? bitmap.extractAlpha() : null;
        Bitmap bitmap2 = ((BitmapDrawable) c).getBitmap();
        Bitmap extractAlpha2 = z ? bitmap2.extractAlpha() : null;
        int width = bitmap2.getWidth() / 4;
        int i4 = 5;
        Bitmap a2 = a((width * 4) + (bitmap2.getWidth() * 5), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
        if (a2 == null) {
            return null;
        }
        a2.setDensity(bitmap2.getDensity());
        if (z) {
            paint = new Paint();
            paint.setMaskFilter(new BlurMaskFilter(1.0f, BlurMaskFilter.Blur.NORMAL));
        } else {
            paint = null;
        }
        Canvas canvas = new Canvas(a2);
        int i5 = 1;
        int i6 = 0;
        while (i5 <= i4) {
            if (i5 <= f) {
                if (paint != null && extractAlpha2 != null) {
                    paint.setColor(-12303292);
                    canvas.drawBitmap(extractAlpha2, i6, 0.0f, paint);
                }
                canvas.drawBitmap(bitmap2, i6, 0.0f, paint3);
                paint2 = paint3;
                i6 = bitmap2.getWidth() + width + i6;
            } else {
                if (paint != null && extractAlpha != null) {
                    paint.setColor(sg.bigo.ads.E0.p.a(-12303292, (int) 38.25f));
                    canvas.drawBitmap(extractAlpha, i6, 0.0f, paint);
                }
                float f2 = i6;
                canvas.drawBitmap(bitmap, f2, 0.0f, paint3);
                if (i5 == ((int) (f + 0.5f))) {
                    Bitmap bitmap3 = ((BitmapDrawable) AbstractC4944a.c(context2, i3)).getBitmap();
                    if (paint != null) {
                        Bitmap extractAlpha3 = bitmap3.extractAlpha();
                        paint.setColor(-12303292);
                        canvas.drawBitmap(extractAlpha3, f2, 0.0f, paint);
                    }
                    paint2 = null;
                    canvas.drawBitmap(bitmap3, f2, 0.0f, (Paint) null);
                } else {
                    paint2 = paint3;
                }
                i6 = bitmap.getWidth() + width + i6;
            }
            i5++;
            paint3 = paint2;
            i4 = 5;
            context2 = context;
        }
        return a2;
    }
}
