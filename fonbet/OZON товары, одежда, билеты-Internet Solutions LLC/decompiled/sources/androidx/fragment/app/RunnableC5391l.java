package androidx.fragment.app;

import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5391l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43123b;

    public /* synthetic */ RunnableC5391l(Object obj, int i11) {
        this.f43122a = i11;
        this.f43123b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43122a) {
            case 0:
                ((ComponentCallbacksC5392m) this.f43123b).lambda$performCreateView$0();
                break;
            default:
                FirebaseMessaging.b((FirebaseMessaging) this.f43123b);
                break;
        }
    }
}
