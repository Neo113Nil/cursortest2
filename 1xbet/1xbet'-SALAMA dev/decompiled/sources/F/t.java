package F;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IconCompat f2452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IconCompat f2453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2454e;

    @Override // F.x
    public final void e(F0 f7) {
        Bitmap bitmapC;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) f7.f17380c).setBigContentTitle((CharSequence) this.f2476b);
        IconCompat iconCompat = this.f2452c;
        Context context = (Context) f7.f17379b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                s.a(bigContentTitle, J.c.c(iconCompat, context));
            } else if (iconCompat.f() == 1) {
                IconCompat iconCompat2 = this.f2452c;
                int i7 = iconCompat2.f9056a;
                if (i7 == -1) {
                    Object obj = iconCompat2.f9057b;
                    bitmapC = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i7 == 1) {
                    bitmapC = (Bitmap) iconCompat2.f9057b;
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapC = IconCompat.c((Bitmap) iconCompat2.f9057b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapC);
            }
        }
        if (this.f2454e) {
            IconCompat iconCompat3 = this.f2453d;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                r.a(bigContentTitle, J.c.c(iconCompat3, context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            s.c(bigContentTitle, false);
            s.b(bigContentTitle, null);
        }
    }

    @Override // F.x
    public final String k() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
