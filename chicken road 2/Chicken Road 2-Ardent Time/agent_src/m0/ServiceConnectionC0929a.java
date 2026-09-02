package m0;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0929a implements android.content.ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8039a = false;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f8040b = new java.util.concurrent.LinkedBlockingQueue();

    public final android.os.IBinder a(java.util.concurrent.TimeUnit timeUnit) {
        p0.AbstractC0966r.b("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f8039a) {
            throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f8039a = true;
        android.os.IBinder iBinder = (android.os.IBinder) this.f8040b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new java.util.concurrent.TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f8040b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
