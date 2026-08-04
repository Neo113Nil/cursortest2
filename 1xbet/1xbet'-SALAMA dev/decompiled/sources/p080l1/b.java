package p080l1;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import p109p.f;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14876a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f14879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14880e;

    public b(SystemForegroundService systemForegroundService, int i7, Notification notification, int i8) {
        this.f14880e = systemForegroundService;
        this.f14877b = i7;
        this.f14879d = notification;
        this.f14878c = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14876a) {
            case 0:
                int i7 = Build.VERSION.SDK_INT;
                Notification notification = (Notification) this.f14879d;
                int i8 = this.f14877b;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f14880e;
                if (i7 < 29) {
                    systemForegroundService.startForeground(i8, notification);
                } else {
                    systemForegroundService.startForeground(i8, notification, this.f14878c);
                }
                break;
            default:
                ((f) this.f14880e).f15646b.onActivityResized(this.f14877b, this.f14878c, (Bundle) this.f14879d);
                break;
        }
    }

    public b(f fVar, int i7, int i8, Bundle bundle) {
        this.f14880e = fVar;
        this.f14877b = i7;
        this.f14878c = i8;
        this.f14879d = bundle;
    }
}
