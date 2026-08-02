package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.zzi;

/* loaded from: classes.dex */
public final class F extends zzi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0854f f11240a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(AbstractC0854f abstractC0854f, Looper looper) {
        super(looper);
        this.f11240a = abstractC0854f;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        InterfaceC0850b interfaceC0850b;
        InterfaceC0850b interfaceC0850b2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        boolean z4;
        if (this.f11240a.zzd.get() != message.arg1) {
            int i7 = message.what;
            if (i7 == 2 || i7 == 1 || i7 == 7) {
                A a2 = (A) message.obj;
                a2.getClass();
                a2.c();
                return;
            }
            return;
        }
        int i8 = message.what;
        if ((i8 == 1 || i8 == 7 || ((i8 == 4 && !this.f11240a.enableLocalFallback()) || message.what == 5)) && !this.f11240a.isConnecting()) {
            A a4 = (A) message.obj;
            a4.getClass();
            a4.c();
            return;
        }
        int i9 = message.what;
        if (i9 == 4) {
            this.f11240a.zzB = new ConnectionResult(message.arg2);
            if (AbstractC0854f.zzo(this.f11240a)) {
                AbstractC0854f abstractC0854f = this.f11240a;
                z4 = abstractC0854f.zzC;
                if (!z4) {
                    abstractC0854f.a(3, null);
                    return;
                }
            }
            AbstractC0854f abstractC0854f2 = this.f11240a;
            connectionResult2 = abstractC0854f2.zzB;
            ConnectionResult connectionResult3 = connectionResult2 != null ? abstractC0854f2.zzB : new ConnectionResult(8);
            this.f11240a.zzc.a(connectionResult3);
            this.f11240a.onConnectionFailed(connectionResult3);
            return;
        }
        if (i9 == 5) {
            AbstractC0854f abstractC0854f3 = this.f11240a;
            connectionResult = abstractC0854f3.zzB;
            ConnectionResult connectionResult4 = connectionResult != null ? abstractC0854f3.zzB : new ConnectionResult(8);
            this.f11240a.zzc.a(connectionResult4);
            this.f11240a.onConnectionFailed(connectionResult4);
            return;
        }
        if (i9 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f11240a.zzc.a(connectionResult5);
            this.f11240a.onConnectionFailed(connectionResult5);
            return;
        }
        if (i9 == 6) {
            this.f11240a.a(5, null);
            AbstractC0854f abstractC0854f4 = this.f11240a;
            interfaceC0850b = abstractC0854f4.zzw;
            if (interfaceC0850b != null) {
                interfaceC0850b2 = abstractC0854f4.zzw;
                interfaceC0850b2.onConnectionSuspended(message.arg2);
            }
            this.f11240a.onConnectionSuspended(message.arg2);
            AbstractC0854f.zzn(this.f11240a, 5, 1, null);
            return;
        }
        if (i9 == 2 && !this.f11240a.isConnected()) {
            A a7 = (A) message.obj;
            a7.getClass();
            a7.c();
            return;
        }
        int i10 = message.what;
        if (i10 != 2 && i10 != 1 && i10 != 7) {
            Log.wtf("GmsClient", e1.k.d(i10, "Don't know how to handle message: "), new Exception());
            return;
        }
        A a8 = (A) message.obj;
        synchronized (a8) {
            try {
                bool = a8.f11223a;
                if (a8.f11224b) {
                    Log.w("GmsClient", "Callback proxy " + a8.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC0854f abstractC0854f5 = a8.f11228f;
            int i11 = a8.f11226d;
            if (i11 != 0) {
                abstractC0854f5.a(1, null);
                Bundle bundle = a8.f11227e;
                a8.a(new ConnectionResult(i11, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC0854f.KEY_PENDING_INTENT) : null));
            } else if (!a8.b()) {
                abstractC0854f5.a(1, null);
                a8.a(new ConnectionResult(8, null));
            }
        }
        synchronized (a8) {
            a8.f11224b = true;
        }
        a8.c();
    }
}
