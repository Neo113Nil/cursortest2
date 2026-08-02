package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: nc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC0502nc implements ServiceConnection {

    /* JADX INFO: renamed from: j */
    public boolean f5367j = false;

    /* JADX INFO: renamed from: k */
    public final LinkedBlockingQueue f5368k = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: a */
    public final IBinder m3513a() throws TimeoutException {
        p80.m3862g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f5367j) {
            C0270h1.m2191g("Cannot call get on this connection more than once");
            return null;
        }
        this.f5367j = true;
        IBinder iBinder = (IBinder) this.f5368k.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5368k.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
