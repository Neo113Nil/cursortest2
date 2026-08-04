package p117q0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import p033e3.h;
import p096n1.e;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f15771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f15775e;

    public q(int i7, int i8, Bundle bundle, h hVar, String str, e eVar) {
        this.f15775e = hVar;
        this.f15771a = eVar;
        this.f15772b = i7;
        this.f15773c = str;
        this.f15774d = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        e eVar = this.f15771a;
        IBinder binder = ((Messenger) eVar.f15314b).getBinder();
        h hVar2 = this.f15775e;
        ((s) hVar2.f12673a).f15787e.remove(binder);
        s sVar = (s) hVar2.f12673a;
        Iterator it = sVar.f15786d.iterator();
        while (true) {
            hVar = null;
            if (!it.hasNext()) {
                break;
            }
            h hVar3 = (h) it.next();
            if (hVar3.f15747c == this.f15772b) {
                if (TextUtils.isEmpty(this.f15773c) || this.f15774d <= 0) {
                    hVar = new h((s) hVar2.f12673a, hVar3.f15745a, hVar3.f15746b, hVar3.f15747c, eVar);
                }
                it.remove();
                break;
            }
        }
        if (hVar == null) {
            hVar = new h((s) hVar2.f12673a, this.f15773c, this.f15774d, this.f15772b, eVar);
        }
        sVar.f15787e.put(binder, hVar);
        try {
            binder.linkToDeath(hVar, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
