package i2;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import q.BinderC2290e;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17326k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17327l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f17328m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f17329n;

    public /* synthetic */ g(int i, int i5, Object obj, Object obj2) {
        this.f17326k = i5;
        this.f17328m = obj;
        this.f17329n = obj2;
        this.f17327l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17326k) {
            case 0:
                Intent intent = (Intent) this.f17329n;
                ((h) this.f17328m).b(this.f17327l, intent);
                break;
            case 1:
                ((TextView) this.f17328m).setTypeface((Typeface) this.f17329n, this.f17327l);
                break;
            case 2:
                ((SystemForegroundService) this.f17329n).f7121o.notify(this.f17327l, (Notification) this.f17328m);
                break;
            default:
                ((BinderC2290e) this.f17329n).f18850l.e(this.f17327l, (Bundle) this.f17328m);
                break;
        }
    }

    public /* synthetic */ g(Object obj, int i, Parcelable parcelable, int i5) {
        this.f17326k = i5;
        this.f17329n = obj;
        this.f17327l = i;
        this.f17328m = parcelable;
    }
}
