package n2;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import q.BinderC2290e;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2186b implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18468k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18469l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f18470m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Parcelable f18471n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f18472o;

    public RunnableC2186b(SystemForegroundService systemForegroundService, int i, Notification notification, int i5) {
        this.f18472o = systemForegroundService;
        this.f18469l = i;
        this.f18471n = notification;
        this.f18470m = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18468k) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                Notification notification = (Notification) this.f18471n;
                int i5 = this.f18469l;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f18472o;
                if (i < 29) {
                    systemForegroundService.startForeground(i5, notification);
                    break;
                } else {
                    systemForegroundService.startForeground(i5, notification, this.f18470m);
                    break;
                }
            default:
                ((BinderC2290e) this.f18472o).f18850l.c(this.f18469l, this.f18470m, (Bundle) this.f18471n);
                break;
        }
    }

    public RunnableC2186b(BinderC2290e binderC2290e, int i, int i5, Bundle bundle) {
        this.f18472o = binderC2290e;
        this.f18469l = i;
        this.f18470m = i5;
        this.f18471n = bundle;
    }
}
