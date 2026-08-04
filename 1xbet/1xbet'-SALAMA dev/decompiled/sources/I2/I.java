package I2;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzbzn;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f3541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f3545f;

    public I(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f3541b = activity;
        this.f3540a = view;
        this.f3545f = onGlobalLayoutListener;
    }

    public final void a() {
        View decorView;
        if (this.f3542c) {
            return;
        }
        Activity activity = this.f3541b;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f3545f;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        zzbzn zzbznVar = E2.o.f1952C.f1954B;
        zzbzn.zza(this.f3540a, onGlobalLayoutListener);
        this.f3542c = true;
    }
}
