package u;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.chickyneer.roadway.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12004a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f12008e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f12009f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f12010g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f12011h;

    /* renamed from: i, reason: collision with root package name */
    public int f12012i;

    /* renamed from: j, reason: collision with root package name */
    public int f12013j;

    /* renamed from: l, reason: collision with root package name */
    public r f12015l;

    /* renamed from: m, reason: collision with root package name */
    public String f12016m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12017n;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f12019p;

    /* renamed from: s, reason: collision with root package name */
    public String f12022s;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f12024u;

    /* renamed from: v, reason: collision with root package name */
    public Notification f12025v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f12026w;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12005b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12006c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12007d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f12014k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12018o = false;

    /* renamed from: q, reason: collision with root package name */
    public int f12020q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f12021r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f12023t = 0;

    public p(Context context, String str) {
        Notification notification = new Notification();
        this.f12025v = notification;
        this.f12004a = context;
        this.f12022s = str;
        notification.when = System.currentTimeMillis();
        this.f12025v.audioStreamType = -1;
        this.f12013j = 0;
        this.f12026w = new ArrayList();
        this.f12024u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notification;
        Bundle bundle;
        R4.u uVar = new R4.u(this);
        p pVar = (p) uVar.f2723e;
        r rVar = pVar.f12015l;
        if (rVar != null) {
            rVar.a(uVar);
        }
        int i2 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) uVar.f2722d;
        if (i2 >= 26) {
            notification = builder.build();
        } else {
            Notification build = builder.build();
            int i3 = uVar.f2720b;
            if (i3 != 0) {
                if (s.f(build) != null && (build.flags & 512) != 0 && i3 == 2) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
                if (s.f(build) != null && (build.flags & 512) == 0 && i3 == 1) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
            }
            notification = build;
        }
        if (rVar != null) {
            pVar.f12015l.getClass();
        }
        if (rVar != null && (bundle = notification.extras) != null) {
            if (rVar.f12030d) {
                bundle.putCharSequence("android.summaryText", rVar.f12029c);
            }
            CharSequence charSequence = rVar.f12028b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", rVar.b());
        }
        return notification;
    }

    public final void c(int i2) {
        Notification notification = this.f12025v;
        notification.defaults = i2;
        if ((i2 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i2, boolean z) {
        if (z) {
            Notification notification = this.f12025v;
            notification.flags = i2 | notification.flags;
        } else {
            Notification notification2 = this.f12025v;
            notification2.flags = (~i2) & notification2.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f12004a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f4307k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f4309b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f12011h = iconCompat;
    }

    public final void f(Uri uri) {
        Notification notification = this.f12025v;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder e3 = AbstractC1474o.e(AbstractC1474o.c(AbstractC1474o.b(), 4), 5);
        this.f12025v.audioAttributes = AbstractC1474o.a(e3);
    }

    public final void g(r rVar) {
        if (this.f12015l != rVar) {
            this.f12015l = rVar;
            if (rVar == null || rVar.f12027a == this) {
                return;
            }
            rVar.f12027a = this;
            g(rVar);
        }
    }
}
