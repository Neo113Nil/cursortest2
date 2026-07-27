package f2;

import com.google.firebase.messaging.FirebaseMessaging;
import k1.C1205a;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements I1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f5619b;

    public /* synthetic */ m(FirebaseMessaging firebaseMessaging, int i2) {
        this.f5618a = i2;
        this.f5619b = firebaseMessaging;
    }

    @Override // I1.e
    public final void onSuccess(Object obj) {
        boolean z;
        switch (this.f5618a) {
            case 0:
                A a6 = (A) obj;
                if (!this.f5619b.f5326e.c() || a6.f5555h.a() == null) {
                    return;
                }
                synchronized (a6) {
                    z = a6.f5554g;
                }
                if (z) {
                    return;
                }
                a6.f(0L);
                return;
            default:
                C1205a c1205a = (C1205a) obj;
                U.e eVar = FirebaseMessaging.f5319k;
                FirebaseMessaging firebaseMessaging = this.f5619b;
                firebaseMessaging.getClass();
                if (c1205a != null) {
                    AbstractC1341c.v(c1205a.f10670a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
