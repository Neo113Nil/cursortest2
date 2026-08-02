package com.google.android.gms.ads;

import Q2.C0357f;
import Q2.C0375o;
import Q2.C0379q;
import U2.j;
import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.InterfaceC0590Fb;

/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            C0375o c0375o = C0379q.f.f5049b;
            BinderC0610Ia binderC0610Ia = new BinderC0610Ia();
            c0375o.getClass();
            ((InterfaceC0590Fb) new C0357f(this, binderC0610Ia).d(this, false)).g0(intent);
        } catch (RemoteException e3) {
            j.f("RemoteException calling handleNotificationIntent: ".concat(e3.toString()));
        }
    }
}
