package i1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class t extends s1.d {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1417k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1418l;

    public /* synthetic */ t(int i2, Object obj) {
        this.f1417k = i2;
        this.f1418l = obj;
    }

    @Override // s1.d
    public IOException l(IOException iOException) {
        switch (this.f1417k) {
            case 1:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            case 2:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
            default:
                return super.l(iOException);
        }
    }

    @Override // s1.d
    public final void m() {
        m1.b bVar;
        l1.c cVar;
        switch (this.f1417k) {
            case 0:
                m1.f fVar = ((u) this.f1418l).f1420b;
                fVar.f6145d = true;
                l1.g gVar = fVar.f6143b;
                if (gVar != null) {
                    synchronized (gVar.f6116d) {
                        gVar.f6125m = true;
                        bVar = gVar.f6126n;
                        cVar = gVar.f6122j;
                    }
                    if (bVar != null) {
                        bVar.cancel();
                        return;
                    } else {
                        if (cVar != null) {
                            j1.d.d(cVar.f6091d);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                o1.w wVar = (o1.w) this.f1418l;
                if (wVar.d(6)) {
                    wVar.f6363d.o(wVar.f6362c, 6);
                    return;
                }
                return;
            default:
                Socket socket = (Socket) this.f1418l;
                try {
                    socket.close();
                    return;
                } catch (AssertionError e2) {
                    if (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) {
                        throw e2;
                    }
                    s1.l.f6634a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
                    return;
                } catch (Exception e3) {
                    s1.l.f6634a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
                    return;
                }
        }
    }

    public void n() {
        if (k()) {
            throw l(null);
        }
    }
}
