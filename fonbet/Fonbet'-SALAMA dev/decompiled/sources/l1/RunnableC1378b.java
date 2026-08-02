package l1;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import p.BinderC1519f;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1378b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14870a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f14873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14874e;

    public RunnableC1378b(SystemForegroundService systemForegroundService, int i7, Notification notification, int i8) {
        this.f14874e = systemForegroundService;
        this.f14871b = i7;
        this.f14873d = notification;
        this.f14872c = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14870a) {
            case 0:
                int i7 = Build.VERSION.SDK_INT;
                Notification notification = (Notification) this.f14873d;
                int i8 = this.f14871b;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f14874e;
                if (i7 < 29) {
                    systemForegroundService.startForeground(i8, notification);
                    break;
                } else {
                    systemForegroundService.startForeground(i8, notification, this.f14872c);
                    break;
                }
            default:
                ((BinderC1519f) this.f14874e).f15640b.onActivityResized(this.f14871b, this.f14872c, (Bundle) this.f14873d);
                break;
        }
    }

    public RunnableC1378b(BinderC1519f binderC1519f, int i7, int i8, Bundle bundle) {
        this.f14874e = binderC1519f;
        this.f14871b = i7;
        this.f14872c = i8;
        this.f14873d = bundle;
    }
}
