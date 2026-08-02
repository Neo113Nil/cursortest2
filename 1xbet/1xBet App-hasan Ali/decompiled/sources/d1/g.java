package d1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import game.betting133.sports1xbet.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16866a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f16870e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f16871g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f16872h;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public J2.a f16874k;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f16876m;

    /* renamed from: n, reason: collision with root package name */
    public String f16877n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f16878o;

    /* renamed from: p, reason: collision with root package name */
    public final Notification f16879p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f16880q;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16867b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f16868c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16869d = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final boolean f16873j = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16875l = false;

    public g(Context context, String str) {
        Notification notification = new Notification();
        this.f16879p = notification;
        this.f16866a = context;
        this.f16877n = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.i = 0;
        this.f16880q = new ArrayList();
        this.f16878o = true;
    }

    public static CharSequence b(String str) {
        return str == null ? str : str.length() > 5120 ? str.subSequence(0, 5120) : str;
    }

    public final Notification a() {
        Notification build;
        Bundle bundle;
        m2.g gVar = new m2.g(this);
        g gVar2 = (g) gVar.f17996n;
        J2.a aVar = gVar2.f16874k;
        if (aVar != null) {
            aVar.b(gVar);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) gVar.f17995m;
        if (i >= 26) {
            build = builder.build();
        } else if (i >= 24) {
            build = builder.build();
        } else {
            builder.setExtras((Bundle) gVar.f17997o);
            build = builder.build();
        }
        if (aVar != null) {
            gVar2.f16874k.getClass();
        }
        if (aVar != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", aVar.d());
        }
        return build;
    }

    public final void c(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f16866a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
        }
        PorterDuff.Mode mode = IconCompat.f6957k;
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f6959b = bitmap;
        this.f16872h = iconCompat;
    }

    public final void d(J2.a aVar) {
        if (this.f16874k != aVar) {
            this.f16874k = aVar;
            if (((g) aVar.f2693a) != this) {
                aVar.f2693a = this;
                d(aVar);
            }
        }
    }
}
