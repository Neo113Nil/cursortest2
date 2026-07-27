package e5;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class a implements n {
    @Override // e5.n
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // e5.n
    public final boolean b(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // e5.n
    public final boolean c() {
        d5.e eVar = d5.e.f5492a;
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // e5.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            d5.e eVar = d5.e.f5492a;
            sSLParameters.setApplicationProtocols((String[]) W1.e.k(protocols).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e3) {
            throw new IOException("Android internal error", e3);
        }
    }
}
