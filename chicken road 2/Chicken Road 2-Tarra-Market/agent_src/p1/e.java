package p1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Method f6432c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f6433d;

    public e(Method method, Method method2) {
        this.f6432c = method;
        this.f6433d = method2;
    }

    @Override // p1.g
    public final void f(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList b2 = g.b(list);
            this.f6432c.invoke(sSLParameters, b2.toArray(new String[b2.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw j1.d.a("unable to set ssl parameters", e2);
        }
    }

    @Override // p1.g
    public final String i(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f6433d.invoke(sSLSocket, null);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw j1.d.a("unable to get selected protocols", e2);
        }
    }
}
