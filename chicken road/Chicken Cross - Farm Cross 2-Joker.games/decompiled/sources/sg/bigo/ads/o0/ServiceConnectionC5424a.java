package sg.bigo.ads.o0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: sg.bigo.ads.o0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC5424a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final long f13222a;
    public boolean b = false;
    public final LinkedBlockingQueue c = new LinkedBlockingQueue(1);

    public ServiceConnectionC5424a(long j) {
        this.f13222a = j;
    }

    public final IBinder a() {
        if (this.b) {
            throw new IllegalStateException();
        }
        this.b = true;
        return (IBinder) this.c.poll(this.f13222a, TimeUnit.MILLISECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.c.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
