package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import b.C0497b;
import java.lang.ref.WeakReference;
import q.AbstractServiceConnectionC2295j;
import q.C2294i;

/* loaded from: classes.dex */
public final class MD extends AbstractServiceConnectionC2295j {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f10607b;

    public MD(Q7 q7) {
        this.f10607b = new WeakReference(q7);
    }

    @Override // q.AbstractServiceConnectionC2295j
    public final void a(C2294i c2294i) {
        Q7 q7 = (Q7) this.f10607b.get();
        if (q7 != null) {
            q7.f11184b = c2294i;
            try {
                ((C0497b) c2294i.f18851a).h1();
            } catch (RemoteException unused) {
            }
            v3.e eVar = q7.f11186d;
            if (eVar != null) {
                Q7 q72 = (Q7) eVar.f20433m;
                C2294i c2294i2 = q72.f11184b;
                if (c2294i2 == null) {
                    q72.f11183a = null;
                } else if (q72.f11183a == null) {
                    q72.f11183a = c2294i2.b(null);
                }
                G.v a5 = new P.W(q72.f11183a).a();
                Context context = (Context) eVar.f20432l;
                String l5 = AbstractC0952et.l(context);
                Intent intent = (Intent) a5.f1749l;
                intent.setPackage(l5);
                intent.setData((Uri) eVar.f20434n);
                context.startActivity(intent, (Bundle) a5.f1750m);
                Activity activity = (Activity) context;
                MD md = q72.f11185c;
                if (md == null) {
                    return;
                }
                activity.unbindService(md);
                q72.f11184b = null;
                q72.f11183a = null;
                q72.f11185c = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Q7 q7 = (Q7) this.f10607b.get();
        if (q7 != null) {
            q7.f11184b = null;
            q7.f11183a = null;
        }
    }
}
