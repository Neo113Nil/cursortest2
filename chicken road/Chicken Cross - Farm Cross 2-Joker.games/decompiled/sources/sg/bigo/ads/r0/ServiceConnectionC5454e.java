package sg.bigo.ads.r0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: sg.bigo.ads.r0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC5454e implements ServiceConnection, IBinder.DeathRecipient {
    public static volatile ServiceConnectionC5454e d;
    public static final Object e = new Object();
    public final Context b;
    public boolean c = false;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f13267a = new LinkedBlockingQueue(1);

    public ServiceConnectionC5454e(Context context) {
        this.b = context;
    }

    public final void a() {
        try {
            synchronized (e) {
                this.f13267a.clear();
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized void b() {
        if (this.c) {
            try {
                this.c = false;
                a();
                this.b.unbindService(this);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        b();
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        b();
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        b();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a();
    }

    public final void a(IBinder iBinder) {
        try {
            synchronized (e) {
                this.f13267a.clear();
                this.f13267a.add(iBinder);
            }
        } catch (Exception unused) {
        }
    }
}
