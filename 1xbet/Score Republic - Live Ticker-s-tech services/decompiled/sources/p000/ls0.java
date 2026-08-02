package p000;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ls0 extends sq1 {

    /* JADX INFO: renamed from: k */
    public IconCompat f4892k;

    /* JADX INFO: renamed from: l */
    public IconCompat f4893l;

    /* JADX INFO: renamed from: m */
    public boolean f4894m;

    @Override // p000.sq1
    /* JADX INFO: renamed from: g */
    public final void mo3289g(f71 f71Var) {
        Bitmap bitmap;
        Notification.Builder builder = (Notification.Builder) f71Var.f2335l;
        Context context = (Context) f71Var.f2334k;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.f4892k;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                ks0.m3071a(bigContentTitle, iconCompat.m393d(context));
            } else {
                int type = iconCompat.f488a;
                if (type == -1) {
                    type = ((Icon) iconCompat.f489b).getType();
                }
                if (type == 1) {
                    IconCompat iconCompat2 = this.f4892k;
                    int i = iconCompat2.f488a;
                    if (i == -1) {
                        Object obj = iconCompat2.f489b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i == 1) {
                        bitmap = (Bitmap) iconCompat2.f489b;
                    } else {
                        if (i != 5) {
                            C0042ay.m531h(iconCompat2, "called getBitmap() on ");
                            return;
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.f489b;
                        int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        float f = iMin;
                        float f2 = 0.5f * f;
                        float f3 = 0.9166667f * f2;
                        float f4 = 0.010416667f * f;
                        paint.setColor(0);
                        paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f2, f2, f3, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f2, f2, f3, paint);
                        canvas.setBitmap(null);
                        bitmap = bitmapCreateBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.f4894m) {
            IconCompat iconCompat3 = this.f4893l;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.m393d(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            ks0.m3073c(bigContentTitle, false);
            ks0.m3072b(bigContentTitle, null);
        }
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: h */
    public final String mo3290h() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
