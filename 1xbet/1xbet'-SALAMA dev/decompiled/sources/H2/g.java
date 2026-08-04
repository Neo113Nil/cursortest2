package H2;

import I2.C0303k;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes.dex */
public final class g extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0303k f3241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3242b;

    public g(Context context, String str, String str2, String str3) {
        super(context);
        C0303k c0303k = new C0303k(context);
        c0303k.f3616c = str;
        this.f3241a = c0303k;
        c0303k.f3618e = str2;
        c0303k.f3617d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f3242b) {
            return false;
        }
        this.f3241a.a(motionEvent);
        return false;
    }
}
