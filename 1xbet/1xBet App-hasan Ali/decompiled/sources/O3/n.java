package O3;

import android.app.Activity;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4085k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Activity f4086l;

    public /* synthetic */ n(Activity activity, int i) {
        this.f4085k = i;
        this.f4086l = activity;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f4085k) {
            case 0:
                Activity activity = this.f4086l;
                if (activity != null) {
                    e.c(activity);
                }
                break;
            default:
                this.f4086l.finishAffinity();
                break;
        }
        return W3.o.f6046a;
    }
}
