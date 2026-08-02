package L4;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class H extends C0222e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f3064m;

    public H(Socket socket) {
        this.f3064m = socket;
    }

    @Override // L4.C0222e
    public final void j() {
        Socket socket = this.f3064m;
        try {
            socket.close();
        } catch (AssertionError e3) {
            if (!N4.b.H(e3)) {
                throw e3;
            }
            x.f3123a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
        } catch (Exception e5) {
            x.f3123a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e5);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
