package androidx.activity;

import android.window.OnBackInvokedCallback;
import q5.AbstractActivityC1559c;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8128b;

    public /* synthetic */ t(Object obj, int i7) {
        this.f8127a = i7;
        this.f8128b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f8127a) {
            case 0:
                s6.a aVar = (s6.a) this.f8128b;
                t6.h.e(aVar, "$onBackInvoked");
                aVar.invoke();
                break;
            case 1:
                ((Runnable) this.f8128b).run();
                break;
            case 2:
                ((i.v) this.f8128b).E();
                break;
            default:
                ((AbstractActivityC1559c) this.f8128b).onBackPressed();
                break;
        }
    }
}
