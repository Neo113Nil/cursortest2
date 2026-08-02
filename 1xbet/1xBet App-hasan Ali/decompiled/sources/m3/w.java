package m3;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.Jt;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class w extends Jt {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2095e f18110b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(AbstractC2095e abstractC2095e, Looper looper) {
        super(looper, 2);
        this.f18110b = abstractC2095e;
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
        if (this.f18110b.f18043w.get() != message.arg1) {
            int i = message.what;
            if (i == 2 || i == 1 || i == 7) {
                s sVar = (s) message.obj;
                sVar.getClass();
                sVar.d();
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 1 && i5 != 7) {
            if (i5 == 4) {
                this.f18110b.getClass();
            }
        }
        if (!this.f18110b.h()) {
            s sVar2 = (s) message.obj;
            sVar2.getClass();
            sVar2.d();
            return;
        }
        int i6 = message.what;
        if (i6 == 4) {
            AbstractC2095e abstractC2095e = this.f18110b;
            abstractC2095e.f18040t = new j3.b(message.arg2);
            if (!abstractC2095e.f18041u && !TextUtils.isEmpty(abstractC2095e.u()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC2095e.u());
                    AbstractC2095e abstractC2095e2 = this.f18110b;
                    if (!abstractC2095e2.f18041u) {
                        abstractC2095e2.z(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            AbstractC2095e abstractC2095e3 = this.f18110b;
            j3.b bVar = abstractC2095e3.f18040t;
            if (bVar == null) {
                bVar = new j3.b(8);
            }
            abstractC2095e3.f18030j.a(bVar);
            this.f18110b.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i6 == 5) {
            AbstractC2095e abstractC2095e4 = this.f18110b;
            j3.b bVar2 = abstractC2095e4.f18040t;
            if (bVar2 == null) {
                bVar2 = new j3.b(8);
            }
            abstractC2095e4.f18030j.a(bVar2);
            this.f18110b.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i6 == 3) {
            Object obj = message.obj;
            this.f18110b.f18030j.a(new j3.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            this.f18110b.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i6 == 6) {
            this.f18110b.z(5, null);
            InterfaceC2092b interfaceC2092b = this.f18110b.f18035o;
            if (interfaceC2092b != null) {
                interfaceC2092b.L(message.arg2);
            }
            this.f18110b.getClass();
            System.currentTimeMillis();
            AbstractC2095e.y(this.f18110b, 5, 1, null);
            return;
        }
        if (i6 == 2 && !this.f18110b.a()) {
            s sVar3 = (s) message.obj;
            sVar3.getClass();
            sVar3.d();
            return;
        }
        int i7 = message.what;
        if (i7 != 2 && i7 != 1 && i7 != 7) {
            Log.wtf("GmsClient", AbstractC2107A.q("Don't know how to handle message: ", i7), new Exception());
            return;
        }
        s sVar4 = (s) message.obj;
        synchronized (sVar4) {
            try {
                bool = sVar4.f18101a;
                if (sVar4.f18102b) {
                    Log.w("GmsClient", "Callback proxy " + sVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC2095e abstractC2095e5 = sVar4.f;
            int i8 = sVar4.f18104d;
            if (i8 != 0) {
                abstractC2095e5.z(1, null);
                Bundle bundle = sVar4.f18105e;
                sVar4.a(new j3.b(i8, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!sVar4.b()) {
                abstractC2095e5.z(1, null);
                sVar4.a(new j3.b(8, null));
            }
        }
        synchronized (sVar4) {
            sVar4.f18102b = true;
        }
        sVar4.d();
    }
}
