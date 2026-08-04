package p117q0;

import G5.f;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import com.ryanheise.audioservice.AudioService;
import java.util.ArrayList;
import java.util.HashMap;
import p031e1.k;
import p033e3.h;
import p049g5.l;
import p096n1.e;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f15777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f15779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f15780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f15781f;

    public /* synthetic */ r(h hVar, e eVar, String str, Bundle bundle, ResultReceiver resultReceiver, int i7) {
        this.f15776a = i7;
        this.f15781f = hVar;
        this.f15777b = eVar;
        this.f15778c = str;
        this.f15779d = bundle;
        this.f15780e = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15776a) {
            case 0:
                IBinder binder = ((Messenger) this.f15777b.f15314b).getBinder();
                h hVar = this.f15781f;
                h hVar2 = (h) ((s) hVar.f12673a).f15787e.getOrDefault(binder, null);
                String str = this.f15778c;
                if (hVar2 == null) {
                    L.l("search for callback that isn't registered query=", str, "MBServiceCompat");
                    return;
                }
                ((s) hVar.f12673a).getClass();
                g gVar = new g(str, this.f15780e, 1);
                if (AudioService.f12302R == null) {
                    gVar.e(new ArrayList());
                } else {
                    if (l.f13281z != null) {
                        HashMap mapM = k.m("query", str);
                        mapM.put("extras", l.e(this.f15779d));
                        l.f13281z.g("search", mapM, new f(gVar, 1));
                    }
                    gVar.a();
                }
                if (!gVar.b()) {
                    throw new IllegalStateException(L.i("onSearch must call detach() or sendResult() before returning for query=", str));
                }
                return;
            default:
                IBinder binder2 = ((Messenger) this.f15777b.f15314b).getBinder();
                h hVar3 = this.f15781f;
                if (((h) ((s) hVar3.f12673a).f15787e.getOrDefault(binder2, null)) != null) {
                    ((s) hVar3.f12673a).getClass();
                    this.f15780e.b(-1, null);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f15778c + ", extras=" + this.f15779d);
                return;
        }
    }
}
