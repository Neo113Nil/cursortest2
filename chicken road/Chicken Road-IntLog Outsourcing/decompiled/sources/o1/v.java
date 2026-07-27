package o1;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class v extends A1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f11604a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper, 0);
        this.f11604a = aVar;
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
        if (this.f11604a.f4991A.get() != message.arg1) {
            int i2 = message.what;
            if (i2 == 2 || i2 == 1 || i2 == 7) {
                r rVar = (r) message.obj;
                rVar.getClass();
                rVar.c();
                return;
            }
            return;
        }
        int i3 = message.what;
        if (i3 != 1 && i3 != 7) {
            if (i3 == 4) {
                this.f11604a.getClass();
            }
        }
        if (!this.f11604a.g()) {
            r rVar2 = (r) message.obj;
            rVar2.getClass();
            rVar2.c();
            return;
        }
        int i6 = message.what;
        if (i6 == 4) {
            com.google.android.gms.common.internal.a aVar = this.f11604a;
            aVar.f5016x = new l1.b(message.arg2);
            if (!aVar.f5017y && !TextUtils.isEmpty(aVar.u()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.u());
                    com.google.android.gms.common.internal.a aVar2 = this.f11604a;
                    if (!aVar2.f5017y) {
                        aVar2.z(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.a aVar3 = this.f11604a;
            l1.b bVar = aVar3.f5016x;
            if (bVar == null) {
                bVar = new l1.b(8);
            }
            aVar3.f5006n.a(bVar);
            com.google.android.gms.common.internal.a aVar4 = this.f11604a;
            aVar4.getClass();
            aVar4.f4996d = bVar.f11000b;
            aVar4.f4997e = System.currentTimeMillis();
            return;
        }
        if (i6 == 5) {
            com.google.android.gms.common.internal.a aVar5 = this.f11604a;
            l1.b bVar2 = aVar5.f5016x;
            if (bVar2 == null) {
                bVar2 = new l1.b(8);
            }
            aVar5.f5006n.a(bVar2);
            com.google.android.gms.common.internal.a aVar6 = this.f11604a;
            aVar6.getClass();
            aVar6.f4996d = bVar2.f11000b;
            aVar6.f4997e = System.currentTimeMillis();
            return;
        }
        if (i6 == 3) {
            Object obj = message.obj;
            PendingIntent pendingIntent = obj instanceof PendingIntent ? (PendingIntent) obj : null;
            int i7 = message.arg2;
            this.f11604a.f5006n.a(new l1.b(i7, pendingIntent));
            com.google.android.gms.common.internal.a aVar7 = this.f11604a;
            aVar7.getClass();
            aVar7.f4996d = i7;
            aVar7.f4997e = System.currentTimeMillis();
            return;
        }
        if (i6 == 6) {
            this.f11604a.z(5, null);
            C1371i c1371i = this.f11604a.f5011s;
            if (c1371i != null) {
                ((m1.i) c1371i.f11562a).onConnectionSuspended(message.arg2);
            }
            com.google.android.gms.common.internal.a aVar8 = this.f11604a;
            aVar8.f4993a = message.arg2;
            aVar8.f4994b = System.currentTimeMillis();
            com.google.android.gms.common.internal.a.y(this.f11604a, 5, 1, null);
            return;
        }
        if (i6 == 2 && !this.f11604a.a()) {
            r rVar3 = (r) message.obj;
            rVar3.getClass();
            rVar3.c();
            return;
        }
        int i8 = message.what;
        if (i8 != 2 && i8 != 1 && i8 != 7) {
            Log.wtf("GmsClient", AbstractC0279e.d(i8, "Don't know how to handle message: "), new Exception());
            return;
        }
        r rVar4 = (r) message.obj;
        synchronized (rVar4) {
            try {
                bool = rVar4.f11594a;
                if (rVar4.f11595b) {
                    Log.w("GmsClient", "Callback proxy " + rVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar9 = rVar4.f11599f;
            int i9 = rVar4.f11597d;
            if (i9 != 0) {
                aVar9.z(1, null);
                Bundle bundle = rVar4.f11598e;
                rVar4.a(new l1.b(i9, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!rVar4.b()) {
                aVar9.z(1, null);
                rVar4.a(new l1.b(8, null));
            }
        }
        synchronized (rVar4) {
            rVar4.f11595b = true;
        }
        rVar4.c();
    }
}
