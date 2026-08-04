package S0;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* JADX INFO: renamed from: S0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0433d extends WebMessagePort.WebMessageCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R0.d f6239a;

    public C0433d(R0.d dVar) {
        this.f6239a = dVar;
    }

    @Override // android.webkit.WebMessagePort.WebMessageCallback
    public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        R0.o[] oVarArr;
        r rVar = new r(webMessagePort);
        String data = webMessage.getData();
        WebMessagePort[] ports = webMessage.getPorts();
        if (ports == null) {
            oVarArr = null;
        } else {
            R0.o[] oVarArr2 = new R0.o[ports.length];
            for (int i7 = 0; i7 < ports.length; i7++) {
                oVarArr2[i7] = new r(ports[i7]);
            }
            oVarArr = oVarArr2;
        }
        this.f6239a.onMessage(rVar, new R0.n(data, oVarArr));
    }
}
