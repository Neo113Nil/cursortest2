package com.google.android.gms.ads;

import Q2.C0357f;
import Q2.C0375o;
import Q2.C0379q;
import U2.j;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.InterfaceC0590Fb;

/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C0375o c0375o = C0379q.f.f5049b;
            BinderC0610Ia binderC0610Ia = new BinderC0610Ia();
            c0375o.getClass();
            InterfaceC0590Fb interfaceC0590Fb = (InterfaceC0590Fb) new C0357f(this, binderC0610Ia).d(this, false);
            if (interfaceC0590Fb == null) {
                j.f("OfflineUtils is null");
            } else {
                interfaceC0590Fb.g0(getIntent());
            }
        } catch (RemoteException e3) {
            j.f("RemoteException calling handleNotificationIntent: ".concat(e3.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
