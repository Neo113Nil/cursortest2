package q0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import e3.C1023h;
import java.util.Iterator;
import n1.C1450e;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1450e f15765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1023h f15769e;

    public q(int i7, int i8, Bundle bundle, C1023h c1023h, String str, C1450e c1450e) {
        this.f15769e = c1023h;
        this.f15765a = c1450e;
        this.f15766b = i7;
        this.f15767c = str;
        this.f15768d = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        C1450e c1450e = this.f15765a;
        IBinder binder = ((Messenger) c1450e.f15308b).getBinder();
        C1023h c1023h = this.f15769e;
        ((s) c1023h.f12667a).f15781e.remove(binder);
        s sVar = (s) c1023h.f12667a;
        Iterator it = sVar.f15780d.iterator();
        while (true) {
            hVar = null;
            if (!it.hasNext()) {
                break;
            }
            h hVar2 = (h) it.next();
            if (hVar2.f15741c == this.f15766b) {
                if (TextUtils.isEmpty(this.f15767c) || this.f15768d <= 0) {
                    hVar = new h((s) c1023h.f12667a, hVar2.f15739a, hVar2.f15740b, hVar2.f15741c, c1450e);
                }
                it.remove();
            }
        }
        if (hVar == null) {
            hVar = new h((s) c1023h.f12667a, this.f15767c, this.f15768d, this.f15766b, c1450e);
        }
        sVar.f15781e.put(binder, hVar);
        try {
            binder.linkToDeath(hVar, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
