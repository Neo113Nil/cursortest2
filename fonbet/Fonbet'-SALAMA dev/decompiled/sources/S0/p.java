package S0;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes.dex */
public final class p implements WebMessageBoundaryInterface {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f6256b = {"WEB_MESSAGE_ARRAY_BUFFER"};

    /* renamed from: a, reason: collision with root package name */
    public final R0.n f6257a;

    public p(R0.n nVar) {
        this.f6257a = nVar;
    }

    public static R0.n a(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        R0.o[] oVarArr = new R0.o[ports.length];
        for (int i7 = 0; i7 < ports.length; i7++) {
            oVarArr[i7] = new r(ports[i7]);
        }
        if (!w.f6305u.b()) {
            return new R0.n(webMessageBoundaryInterface.getData(), oVarArr);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) P6.b.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new R0.n(webMessagePayloadBoundaryInterface.getAsString(), oVarArr);
        }
        if (type != 1) {
            return null;
        }
        return new R0.n(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), oVarArr);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final String getData() {
        R0.n nVar = this.f6257a;
        nVar.a(0);
        return nVar.f5863b;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler getMessagePayload() {
        q qVar;
        R0.n nVar = this.f6257a;
        int i7 = nVar.f5865d;
        if (i7 == 0) {
            nVar.a(0);
            qVar = new q(nVar.f5863b);
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("Unknown web message payload type: " + i7);
            }
            nVar.a(1);
            byte[] bArr = nVar.f5864c;
            Objects.requireNonNull(bArr);
            qVar = new q(bArr);
        }
        return new P6.a(qVar);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public final InvocationHandler[] getPorts() {
        R0.o[] oVarArr = this.f6257a.f5862a;
        if (oVarArr == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[oVarArr.length];
        for (int i7 = 0; i7 < oVarArr.length; i7++) {
            invocationHandlerArr[i7] = Proxy.getInvocationHandler(((r) oVarArr[i7]).c());
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f6256b;
    }
}
