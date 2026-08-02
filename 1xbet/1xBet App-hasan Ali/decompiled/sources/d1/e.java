package d1;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class e extends J2.a {

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f16862b;

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f16863c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16864d;

    @Override // J2.a
    public final void b(m2.g gVar) {
        Bitmap a5;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) gVar.f17995m).setBigContentTitle(null);
        IconCompat iconCompat = this.f16862b;
        Context context = (Context) gVar.f17994l;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                d.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f16862b;
                int i = iconCompat2.f6958a;
                if (i == -1) {
                    Object obj = iconCompat2.f6959b;
                    a5 = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    a5 = (Bitmap) iconCompat2.f6959b;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    a5 = IconCompat.a((Bitmap) iconCompat2.f6959b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(a5);
            }
        }
        if (this.f16864d) {
            IconCompat iconCompat3 = this.f16863c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            d.c(bigContentTitle, false);
            d.b(bigContentTitle, null);
        }
    }

    @Override // J2.a
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
