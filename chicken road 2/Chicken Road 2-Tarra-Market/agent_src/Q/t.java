package Q;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class t extends Z.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f472a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper, 1);
        this.f472a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r0 == 5) goto L18;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f472a.f753v.get() != message.arg1) {
            int i2 = message.what;
            if (i2 == 2 || i2 == 1 || i2 == 7) {
                p pVar = (p) message.obj;
                pVar.getClass();
                pVar.c();
                return;
            }
            return;
        }
        int i3 = message.what;
        if (i3 != 1 && i3 != 7) {
            if (i3 == 4) {
                this.f472a.getClass();
            }
        }
        if (!this.f472a.a()) {
            p pVar2 = (p) message.obj;
            pVar2.getClass();
            pVar2.c();
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            com.google.android.gms.common.internal.a aVar = this.f472a;
            aVar.f750s = new N.b(message.arg2);
            if (!aVar.f751t && !TextUtils.isEmpty(aVar.r()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.r());
                    com.google.android.gms.common.internal.a aVar2 = this.f472a;
                    if (!aVar2.f751t) {
                        aVar2.v(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.a aVar3 = this.f472a;
            N.b bVar = aVar3.f750s;
            if (bVar == null) {
                bVar = new N.b(8);
            }
            aVar3.f740i.a(bVar);
            this.f472a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            com.google.android.gms.common.internal.a aVar4 = this.f472a;
            N.b bVar2 = aVar4.f750s;
            if (bVar2 == null) {
                bVar2 = new N.b(8);
            }
            aVar4.f740i.a(bVar2);
            this.f472a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            this.f472a.f740i.a(new N.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            this.f472a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            this.f472a.v(5, null);
            h hVar = this.f472a.f745n;
            if (hVar != null) {
                ((O.g) hVar.f439a).b(message.arg2);
            }
            this.f472a.getClass();
            System.currentTimeMillis();
            com.google.android.gms.common.internal.a.u(this.f472a, 5, 1, null);
            return;
        }
        if (i4 == 2 && !this.f472a.c()) {
            p pVar3 = (p) message.obj;
            pVar3.getClass();
            pVar3.c();
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", C0.g.g(i5, "Don't know how to handle message: "), new Exception());
            return;
        }
        p pVar4 = (p) message.obj;
        synchronized (pVar4) {
            try {
                bool = pVar4.f462a;
                if (pVar4.f463b) {
                    Log.w("GmsClient", "Callback proxy " + pVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar5 = pVar4.f467f;
            int i6 = pVar4.f465d;
            if (i6 != 0) {
                aVar5.v(1, null);
                Bundle bundle = pVar4.f466e;
                pVar4.a(new N.b(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!pVar4.b()) {
                aVar5.v(1, null);
                pVar4.a(new N.b(8, null));
            }
        }
        synchronized (pVar4) {
            pVar4.f463b = true;
        }
        pVar4.c();
    }
}
