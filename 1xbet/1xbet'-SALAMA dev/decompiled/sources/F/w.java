package F;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.ArrayList;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2456a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f2460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f2461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f2462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f2463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2464i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x f2465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f2466l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bundle f2468n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f2471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f2472r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Notification f2473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f2474t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2457b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2458c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2459d = new ArrayList();
    public boolean j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2467m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2469o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2470p = 0;

    public w(Context context, String str) {
        Notification notification = new Notification();
        this.f2473s = notification;
        this.f2456a = context;
        this.f2471q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f2464i = 0;
        this.f2474t = new ArrayList();
        this.f2472r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        F0 f7 = new F0(this);
        w wVar = (w) f7.f17381d;
        x xVar = wVar.f2465k;
        if (xVar != null) {
            xVar.e(f7);
        }
        int i7 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) f7.f17380c;
        Notification notificationBuild = i7 >= 26 ? builder.build() : builder.build();
        if (xVar != null) {
            wVar.f2465k.getClass();
        }
        if (xVar != null && (bundle = notificationBuild.extras) != null) {
            CharSequence charSequence = (CharSequence) xVar.f2476b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strK = xVar.k();
            if (strK != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strK);
            }
        }
        return notificationBuild;
    }

    public final void c(int i7) {
        Notification notification = this.f2473s;
        notification.flags = i7 | notification.flags;
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f2456a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f9055k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f9057b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f2463h = iconCompat;
    }

    public final void e(x xVar) {
        if (this.f2465k != xVar) {
            this.f2465k = xVar;
            if (((w) xVar.f2475a) != this) {
                xVar.f2475a = this;
                e(xVar);
            }
        }
    }
}
