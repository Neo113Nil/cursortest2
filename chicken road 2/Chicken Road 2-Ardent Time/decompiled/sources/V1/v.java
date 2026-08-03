package V1;

/* loaded from: classes.dex */
public final class v extends V1.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.net.Socket f1799m;

    public v(java.net.Socket socket) {
        this.f1799m = socket;
    }

    @Override // V1.e
    public final void j() {
        java.net.Socket socket = this.f1799m;
        try {
            socket.close();
        } catch (java.lang.AssertionError e2) {
            if (!Q1.d.p(e2)) {
                throw e2;
            }
            V1.n.f1779a.log(java.util.logging.Level.WARNING, "Failed to close timed out socket " + socket, (java.lang.Throwable) e2);
        } catch (java.lang.Exception e3) {
            V1.n.f1779a.log(java.util.logging.Level.WARNING, "Failed to close timed out socket " + socket, (java.lang.Throwable) e3);
        }
    }

    public final java.io.IOException k(java.io.IOException iOException) {
        java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
