package Y5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f7791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f7792f;

    public g(Provider provider, Method method, Method method2) {
        super(provider);
        this.f7791e = method;
        this.f7792f = method2;
    }

    @Override // Y5.j
    public final void c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar != k.HTTP_1_0) {
                arrayList.add(kVar.f7810a);
            }
        }
        try {
            this.f7791e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // Y5.j
    public final String d(SSLSocket sSLSocket) {
        try {
            return (String) this.f7792f.invoke(sSLSocket, null);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // Y5.j
    public final int e() {
        return 1;
    }
}
