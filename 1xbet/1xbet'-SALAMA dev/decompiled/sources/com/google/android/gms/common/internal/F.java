package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.zzi;

/* JADX INFO: loaded from: classes.dex */
public final class F extends zzi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0810f f11240a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(AbstractC0810f abstractC0810f, Looper looper) {
        super(looper);
        this.f11240a = abstractC0810f;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
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
            if (AbstractC0810f.zzo(this.f11240a)) {
                AbstractC0810f abstractC0810f = this.f11240a;
                if (!abstractC0810f.zzC) {
                    abstractC0810f.a(3, null);
                    return;
                }
            }
            AbstractC0810f abstractC0810f2 = this.f11240a;
            ConnectionResult connectionResult = abstractC0810f2.zzB != null ? abstractC0810f2.zzB : new ConnectionResult(8);
            this.f11240a.zzc.a(connectionResult);
            this.f11240a.onConnectionFailed(connectionResult);
            return;
        }
        if (i9 == 5) {
            AbstractC0810f abstractC0810f3 = this.f11240a;
            ConnectionResult connectionResult2 = abstractC0810f3.zzB != null ? abstractC0810f3.zzB : new ConnectionResult(8);
            this.f11240a.zzc.a(connectionResult2);
            this.f11240a.onConnectionFailed(connectionResult2);
            return;
        }
        if (i9 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f11240a.zzc.a(connectionResult3);
            this.f11240a.onConnectionFailed(connectionResult3);
            return;
        }
        if (i9 == 6) {
            this.f11240a.a(5, null);
            AbstractC0810f abstractC0810f4 = this.f11240a;
            if (abstractC0810f4.zzw != null) {
                abstractC0810f4.zzw.onConnectionSuspended(message.arg2);
            }
            this.f11240a.onConnectionSuspended(message.arg2);
            AbstractC0810f.zzn(this.f11240a, 5, 1, null);
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
            Log.wtf("GmsClient", p031e1.k.d(i10, "Don't know how to handle message: "), new Exception());
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
            AbstractC0810f abstractC0810f5 = a8.f11228f;
            int i11 = a8.f11226d;
            if (i11 != 0) {
                abstractC0810f5.a(1, null);
                Bundle bundle = a8.f11227e;
                a8.a(new ConnectionResult(i11, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC0810f.KEY_PENDING_INTENT) : null));
            } else if (!a8.b()) {
                abstractC0810f5.a(1, null);
                a8.a(new ConnectionResult(8, null));
            }
        }
        synchronized (a8) {
            a8.f11224b = true;
        }
        a8.c();
    }
}
