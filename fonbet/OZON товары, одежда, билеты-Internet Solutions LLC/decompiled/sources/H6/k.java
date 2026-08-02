package H6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class k extends J6.a<I6.a, I6.b> {
    @Override // J6.a
    public final Bitmap a(Canvas canvas, Paint paint, int i11, Bitmap bitmap, I6.b bVar) {
        Bitmap decodeStream;
        R r11 = this.f14120a;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i11;
        options.inMutable = true;
        options.inBitmap = bitmap;
        Bitmap bitmap2 = null;
        try {
            ((I6.a) r11).reset();
            try {
                decodeStream = BitmapFactory.decodeStream(((I6.a) r11).c(), null, options);
            } catch (IllegalArgumentException unused) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i11;
                options2.inMutable = true;
                decodeStream = BitmapFactory.decodeStream(((I6.a) r11).c(), null, options2);
            }
            try {
                paint.setXfermode(null);
                canvas.drawBitmap(decodeStream, 0.0f, 0.0f, paint);
                return decodeStream;
            } catch (IOException e11) {
                e = e11;
                bitmap2 = decodeStream;
                e.printStackTrace();
                return bitmap2;
            }
        } catch (IOException e12) {
            e = e12;
        }
    }
}
