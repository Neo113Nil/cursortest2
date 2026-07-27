package u;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.HashSet;

/* renamed from: u.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1458F {

    /* renamed from: d, reason: collision with root package name */
    public static String f11984d;

    /* renamed from: g, reason: collision with root package name */
    public static ServiceConnectionC1457E f11987g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11988a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f11989b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11983c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f11985e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f11986f = new Object();

    public C1458F(Context context) {
        this.f11988a = context;
        this.f11989b = (NotificationManager) context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
    }

    public final void a(int i2, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f11989b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i2, notification);
            return;
        }
        C1454B c1454b = new C1454B(this.f11988a.getPackageName(), i2, notification);
        synchronized (f11986f) {
            try {
                if (f11987g == null) {
                    f11987g = new ServiceConnectionC1457E(this.f11988a.getApplicationContext());
                }
                f11987g.f11980b.obtainMessage(0, c1454b).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i2);
    }
}
