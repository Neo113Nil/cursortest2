package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public class ae extends za {
    public ae(Context context, ya yaVar, Bundle bundle) {
        super(context, yaVar, bundle);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!MetaData.E().l0()) {
                this.callback.a();
                return;
            }
            vh vhVar = (vh) com.startapp.sdk.components.a.a(this.context).f3359g.a();
            k8 k8Var = (k8) vhVar.f4527b.a();
            k8Var.f3952a.post(new ph(vhVar));
            d9 d9Var = new d9(e9.f3621i);
            d9Var.f3579j = true;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f3334U.f4509a;
                if (aVar != null) {
                    ((t9) aVar.f3369q.a()).a(d9Var);
                } else {
                    this.callback.a();
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
