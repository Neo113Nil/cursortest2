package androidx.activity;

import android.window.OnBackInvokedCallback;
import t4.InterfaceC1430a;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4067b;

    public /* synthetic */ p(int i2, Object obj) {
        this.f4066a = i2;
        this.f4067b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f4066a) {
            case 0:
                InterfaceC1430a onBackInvoked = (InterfaceC1430a) this.f4067b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            default:
                ((AbstractActivityC1515c) this.f4067b).onBackPressed();
                break;
        }
    }
}
