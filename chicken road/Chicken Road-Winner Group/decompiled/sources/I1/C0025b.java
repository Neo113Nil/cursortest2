package I1;

import android.window.OnBackInvokedCallback;

/* renamed from: I1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0025b implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f594b;

    public /* synthetic */ C0025b(int i3, Object obj) {
        this.f593a = i3;
        this.f594b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f593a) {
            case 0:
                ((AbstractActivityC0027d) this.f594b).onBackPressed();
                break;
            default:
                o2.a onBackInvoked = (o2.a) this.f594b;
                kotlin.jvm.internal.j.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
        }
    }
}
