package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.internal.AbstractC0861c;
import com.google.android.gms.internal.common.zzh;

/* loaded from: classes4.dex */
public final class Z extends zzh {
    public final /* synthetic */ AbstractC0861c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(AbstractC0861c abstractC0861c, Looper looper) {
        super(looper);
        this.a = abstractC0861c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        AbstractC0861c.a aVar;
        AbstractC0861c.a aVar2;
        C0852b c0852b;
        C0852b c0852b2;
        boolean z;
        if (this.a.zzd.get() != message.arg1) {
            int i = message.what;
            if (i == 2 || i == 1 || i == 7) {
                a0 a0Var = (a0) message.obj;
                a0Var.getClass();
                a0Var.b();
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || ((i2 == 4 && !this.a.enableLocalFallback()) || message.what == 5)) && !this.a.isConnecting()) {
            a0 a0Var2 = (a0) message.obj;
            a0Var2.getClass();
            a0Var2.b();
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            this.a.zzC = new C0852b(message.arg2);
            if (AbstractC0861c.zzo(this.a)) {
                AbstractC0861c abstractC0861c = this.a;
                z = abstractC0861c.zzD;
                if (!z) {
                    abstractC0861c.zzp(3, null);
                    return;
                }
            }
            AbstractC0861c abstractC0861c2 = this.a;
            c0852b2 = abstractC0861c2.zzC;
            C0852b c0852b3 = c0852b2 != null ? abstractC0861c2.zzC : new C0852b(8);
            this.a.zzc.a(c0852b3);
            this.a.onConnectionFailed(c0852b3);
            return;
        }
        if (i3 == 5) {
            AbstractC0861c abstractC0861c3 = this.a;
            c0852b = abstractC0861c3.zzC;
            C0852b c0852b4 = c0852b != null ? abstractC0861c3.zzC : new C0852b(8);
            this.a.zzc.a(c0852b4);
            this.a.onConnectionFailed(c0852b4);
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            C0852b c0852b5 = new C0852b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.a.zzc.a(c0852b5);
            this.a.onConnectionFailed(c0852b5);
            return;
        }
        if (i3 == 6) {
            this.a.zzp(5, null);
            AbstractC0861c abstractC0861c4 = this.a;
            aVar = abstractC0861c4.zzw;
            if (aVar != null) {
                aVar2 = abstractC0861c4.zzw;
                aVar2.onConnectionSuspended(message.arg2);
            }
            this.a.onConnectionSuspended(message.arg2);
            AbstractC0861c.zzn(this.a, 5, 1, null);
            return;
        }
        if (i3 == 2 && !this.a.isConnected()) {
            a0 a0Var3 = (a0) message.obj;
            a0Var3.getClass();
            a0Var3.b();
            return;
        }
        int i4 = message.what;
        if (i4 != 2 && i4 != 1 && i4 != 7) {
            new Exception();
            return;
        }
        a0 a0Var4 = (a0) message.obj;
        synchronized (a0Var4) {
            try {
                bool = a0Var4.a;
                if (a0Var4.b) {
                    a0Var4.toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a0Var4.a(bool);
        }
        synchronized (a0Var4) {
            a0Var4.b = true;
        }
        a0Var4.b();
    }
}
