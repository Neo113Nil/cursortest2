package sg.bigo.ads.Y;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ironsource.Y1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.I0.g;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.X0.q;
import sg.bigo.ads.X0.r;
import sg.bigo.ads.a1.InterfaceC5020a;
import sg.bigo.ads.k1.A;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class d extends BroadcastReceiver {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12623a = false;
    public final ArrayList b = new ArrayList();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a4, code lost:
    
        if (r2.equals("android.intent.action.ACTION_POWER_CONNECTED") == false) goto L42;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            e eVar = (e) ((WeakReference) it.next()).get();
            if (eVar != null) {
                String action = intent.getAction();
                char c2 = 2;
                boolean z2 = false;
                if ((eVar instanceof sg.bigo.ads.a1.b) && !TextUtils.isEmpty(action) && "android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    sg.bigo.ads.a1.b bVar = (sg.bigo.ads.a1.b) eVar;
                    boolean c3 = g.c(context);
                    synchronized (bVar.f12679a) {
                        Iterator it2 = bVar.f12679a.iterator();
                        while (it2.hasNext()) {
                            InterfaceC5020a interfaceC5020a = (InterfaceC5020a) it2.next();
                            if (interfaceC5020a != null) {
                                r rVar = (r) interfaceC5020a;
                                rVar.l = c3;
                                if (c3) {
                                    sg.bigo.ads.I0.f.d = Y1.f;
                                    sg.bigo.ads.I0.f.e = Y1.f;
                                    q qVar = rVar.p;
                                    if (qVar.f12612a == 2 && (qVar.f12612a == 0 || qVar.f12612a == 2)) {
                                        AbstractC5446j.a(3, null, qVar, 5000L);
                                        qVar.f12612a = 1;
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String action2 = intent.getAction();
                    if ((eVar instanceof sg.bigo.ads.I0.c) && !I.a((CharSequence) action2)) {
                        action2.getClass();
                        action2.hashCode();
                        switch (action2.hashCode()) {
                            case -2128145023:
                                if (action2.equals("android.intent.action.SCREEN_OFF")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1454123155:
                                if (action2.equals("android.intent.action.SCREEN_ON")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1019184907:
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                            case 1:
                            case 2:
                                ((sg.bigo.ads.I0.c) eVar).a(context, intent);
                                z2 = true;
                                break;
                        }
                    }
                } else {
                    z2 = z;
                }
                if (!z2) {
                    String action3 = intent.getAction();
                    if ((eVar instanceof f) && !TextUtils.isEmpty(action3) && "android.intent.action.CONFIGURATION_CHANGED".equals(action3)) {
                        ((A) eVar).a(context, intent);
                    }
                }
            }
        }
    }
}
