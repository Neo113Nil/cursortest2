package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cw0 extends fw0 {

    /* JADX INFO: renamed from: e */
    public final Method f1472e;

    /* JADX INFO: renamed from: f */
    public final Method f1473f;

    public cw0(Provider provider, Method method, Method method2) {
        super(provider);
        this.f1472e = method;
        this.f1473f = method2;
    }

    @Override // p000.fw0
    /* JADX INFO: renamed from: c */
    public final void mo787c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ky0 ky0Var = (ky0) it.next();
            if (ky0Var != ky0.f4591k) {
                arrayList.add(ky0Var.f4596j);
            }
        }
        try {
            this.f1472e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            dd0.m1163h(e);
        } catch (InvocationTargetException e2) {
            dd0.m1163h(e2);
        }
    }

    @Override // p000.fw0
    /* JADX INFO: renamed from: d */
    public final String mo788d(SSLSocket sSLSocket) {
        try {
            return (String) this.f1473f.invoke(sSLSocket, null);
        } catch (IllegalAccessException e) {
            dd0.m1163h(e);
            return null;
        } catch (InvocationTargetException e2) {
            dd0.m1163h(e2);
            return null;
        }
    }

    @Override // p000.fw0
    /* JADX INFO: renamed from: e */
    public final int mo789e() {
        return 1;
    }
}
