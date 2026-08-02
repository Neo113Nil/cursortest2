package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tt1 extends bm1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0575pb f7589a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt1(AbstractC0575pb abstractC0575pb, Looper looper) {
        super(looper, 4);
        this.f7589a = abstractC0575pb;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        km1 km1Var;
        AbstractC0575pb abstractC0575pb = this.f7589a;
        int i = abstractC0575pb.f6069x.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (km1Var = (km1) message.obj) != null) {
                synchronized (km1Var) {
                    km1Var.f4448a = null;
                }
                AbstractC0575pb abstractC0575pb2 = km1Var.f4450c;
                synchronized (abstractC0575pb2.f6057l) {
                    abstractC0575pb2.f6057l.remove(km1Var);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !abstractC0575pb.m3892q()) {
            km1 km1Var2 = (km1) message.obj;
            if (km1Var2 != null) {
                synchronized (km1Var2) {
                    km1Var2.f4448a = null;
                }
                AbstractC0575pb abstractC0575pb3 = km1Var2.f4450c;
                synchronized (abstractC0575pb3.f6057l) {
                    abstractC0575pb3.f6057l.remove(km1Var2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            abstractC0575pb.f6066u = new C0253gl(message.arg2, null, null);
            if (!abstractC0575pb.f6067v && !TextUtils.isEmpty(abstractC0575pb.mo720m()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC0575pb.mo720m());
                    if (!abstractC0575pb.f6067v) {
                        abstractC0575pb.m3895t(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            C0253gl c0253gl = abstractC0575pb.f6066u;
            if (c0253gl == null) {
                c0253gl = new C0253gl(8, null, null);
            }
            abstractC0575pb.f6055j.mo613i(c0253gl);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            C0253gl c0253gl2 = abstractC0575pb.f6066u;
            if (c0253gl2 == null) {
                c0253gl2 = new C0253gl(8, null, null);
            }
            abstractC0575pb.f6055j.mo613i(c0253gl2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            abstractC0575pb.f6055j.mo613i(new C0253gl(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            abstractC0575pb.m3895t(5, null);
            InterfaceC0464mb interfaceC0464mb = abstractC0575pb.f6060o;
            if (interfaceC0464mb != null) {
                interfaceC0464mb.mo305a(message.arg2);
            }
            System.currentTimeMillis();
            abstractC0575pb.m3894s(5, 1, null);
            return;
        }
        if (i4 == 2 && !abstractC0575pb.m3891p()) {
            km1 km1Var3 = (km1) message.obj;
            if (km1Var3 != null) {
                synchronized (km1Var3) {
                    km1Var3.f4448a = null;
                }
                AbstractC0575pb abstractC0575pb4 = km1Var3.f4450c;
                synchronized (abstractC0575pb4.f6057l) {
                    abstractC0575pb4.f6057l.remove(km1Var3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", j11.m2774i(new StringBuilder(String.valueOf(i5).length() + 34), "Don't know how to handle message: ", i5), new Exception());
            return;
        }
        km1 km1Var4 = (km1) message.obj;
        synchronized (km1Var4) {
            try {
                bool = km1Var4.f4448a;
                if (km1Var4.f4449b) {
                    String string = km1Var4.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC0575pb abstractC0575pb5 = km1Var4.f4453f;
            int i6 = km1Var4.f4451d;
            if (i6 != 0) {
                abstractC0575pb5.m3895t(1, null);
                Bundle bundle = km1Var4.f4452e;
                km1Var4.mo3056b(new C0253gl(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!km1Var4.mo3055a()) {
                abstractC0575pb5.m3895t(1, null);
                km1Var4.mo3056b(new C0253gl(8, null, null));
            }
        }
        synchronized (km1Var4) {
            km1Var4.f4449b = true;
        }
        synchronized (km1Var4) {
            km1Var4.f4448a = null;
        }
        AbstractC0575pb abstractC0575pb6 = km1Var4.f4450c;
        synchronized (abstractC0575pb6.f6057l) {
            abstractC0575pb6.f6057l.remove(km1Var4);
        }
    }
}
