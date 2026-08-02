package q0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import com.ryanheise.audioservice.AudioService;
import e3.C1023h;
import java.util.ArrayList;
import java.util.HashMap;
import n1.C1450e;
import w1.L;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1450e f15771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15772c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f15773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f15774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1023h f15775f;

    public /* synthetic */ r(C1023h c1023h, C1450e c1450e, String str, Bundle bundle, ResultReceiver resultReceiver, int i7) {
        this.f15770a = i7;
        this.f15775f = c1023h;
        this.f15771b = c1450e;
        this.f15772c = str;
        this.f15773d = bundle;
        this.f15774e = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15770a) {
            case 0:
                IBinder binder = ((Messenger) this.f15771b.f15308b).getBinder();
                C1023h c1023h = this.f15775f;
                h hVar = (h) ((s) c1023h.f12667a).f15781e.getOrDefault(binder, null);
                String str = this.f15772c;
                if (hVar == null) {
                    L.l("search for callback that isn't registered query=", str, "MBServiceCompat");
                    return;
                }
                ((s) c1023h.f12667a).getClass();
                g gVar = new g(str, this.f15774e, 1);
                if (AudioService.f12302R == null) {
                    gVar.e(new ArrayList());
                } else {
                    if (g5.l.f13275z != null) {
                        HashMap m7 = e1.k.m("query", str);
                        m7.put("extras", g5.l.e(this.f15773d));
                        g5.l.f13275z.g("search", m7, new G5.f(gVar, 1));
                    }
                    gVar.a();
                }
                if (!gVar.b()) {
                    throw new IllegalStateException(L.i("onSearch must call detach() or sendResult() before returning for query=", str));
                }
                return;
            default:
                IBinder binder2 = ((Messenger) this.f15771b.f15308b).getBinder();
                C1023h c1023h2 = this.f15775f;
                if (((h) ((s) c1023h2.f12667a).f15781e.getOrDefault(binder2, null)) != null) {
                    ((s) c1023h2.f12667a).getClass();
                    this.f15774e.b(-1, null);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f15772c + ", extras=" + this.f15773d);
                return;
        }
    }
}
