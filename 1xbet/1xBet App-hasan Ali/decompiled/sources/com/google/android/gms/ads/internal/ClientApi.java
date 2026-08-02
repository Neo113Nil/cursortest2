package com.google.android.gms.ads.internal;

import P2.n;
import Q2.G;
import Q2.InterfaceC0352c0;
import Q2.InterfaceC0378p0;
import Q2.K;
import Q2.T;
import Q2.a1;
import S2.b;
import S2.d;
import U2.a;
import a3.BinderC0468l;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.BinderC0671Qf;
import com.google.android.gms.internal.ads.BinderC0767am;
import com.google.android.gms.internal.ads.BinderC0857cn;
import com.google.android.gms.internal.ads.BinderC1084hq;
import com.google.android.gms.internal.ads.BinderC1309ms;
import com.google.android.gms.internal.ads.Bl;
import com.google.android.gms.internal.ads.Bn;
import com.google.android.gms.internal.ads.Bo;
import com.google.android.gms.internal.ads.C0554Af;
import com.google.android.gms.internal.ads.C0601Gf;
import com.google.android.gms.internal.ads.C1118ig;
import com.google.android.gms.internal.ads.C1128iq;
import com.google.android.gms.internal.ads.C1212kl;
import com.google.android.gms.internal.ads.C1390oj;
import com.google.android.gms.internal.ads.C1482ql;
import com.google.android.gms.internal.ads.C1745wf;
import com.google.android.gms.internal.ads.C1796xl;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.Do;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.ED;
import com.google.android.gms.internal.ads.Eo;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.Ho;
import com.google.android.gms.internal.ads.I9;
import com.google.android.gms.internal.ads.InterfaceC0590Fb;
import com.google.android.gms.internal.ads.InterfaceC0612Ic;
import com.google.android.gms.internal.ads.InterfaceC0624Ka;
import com.google.android.gms.internal.ads.InterfaceC0632Lb;
import com.google.android.gms.internal.ads.InterfaceC1563sd;
import com.google.android.gms.internal.ads.Iq;
import com.google.android.gms.internal.ads.JB;
import com.google.android.gms.internal.ads.Jq;
import com.google.android.gms.internal.ads.Mj;
import com.google.android.gms.internal.ads.N8;
import com.google.android.gms.internal.ads.Oj;
import com.google.android.gms.internal.ads.U4;
import java.util.HashMap;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public class ClientApi extends E5 implements T {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // Q2.T
    public final K A2(InterfaceC2360a interfaceC2360a, a1 a1Var, String str, InterfaceC0624Ka interfaceC0624Ka, int i) {
        Context context = (Context) BinderC2361b.t1(interfaceC2360a);
        C0554Af z3 = C0554Af.z(context, interfaceC0624Ka, i);
        context.getClass();
        a1Var.getClass();
        str.getClass();
        ED a5 = ED.a(context);
        ED a6 = ED.a(a1Var);
        C0554Af c0554Af = z3.f7646b;
        CD b3 = CD.b(new C1796xl(c0554Af.f7688x, 11));
        C1128iq c1128iq = (C1128iq) CD.b(new C1212kl(a5, c0554Af.f7648c, a6, c0554Af.f7610A, b3, CD.b(JB.K), CD.b(JB.f9913z))).d();
        Eo eo = (Eo) b3.d();
        a aVar = (a) c0554Af.f7644a.f14809a;
        AbstractC1400ot.D(aVar);
        return new Do(context, a1Var, str, c1128iq, eo, aVar, (C1482ql) c0554Af.f7688x.d());
    }

    @Override // Q2.T
    public final G B0(InterfaceC2360a interfaceC2360a, String str, InterfaceC0624Ka interfaceC0624Ka, int i) {
        Context context = (Context) BinderC2361b.t1(interfaceC2360a);
        return new Bo(C0554Af.z(context, interfaceC0624Ka, i), context, str);
    }

    @Override // Q2.T
    public final InterfaceC0352c0 E0(InterfaceC2360a interfaceC2360a, int i) {
        return (BinderC0671Qf) C0554Af.z((Context) BinderC2361b.t1(interfaceC2360a), null, i).f7690y.d();
    }

    @Override // Q2.T
    public final K F2(InterfaceC2360a interfaceC2360a, a1 a1Var, String str, int i) {
        return new n((Context) BinderC2361b.t1(interfaceC2360a), a1Var, str, new a(244410000, i, true, false));
    }

    @Override // Q2.T
    public final K J1(InterfaceC2360a interfaceC2360a, a1 a1Var, String str, InterfaceC0624Ka interfaceC0624Ka, int i) {
        Context context = (Context) BinderC2361b.t1(interfaceC2360a);
        C0554Af z3 = C0554Af.z(context, interfaceC0624Ka, i);
        context.getClass();
        a1Var.getClass();
        str.getClass();
        return (Ho) ((CD) new U4(z3.f7646b, context, str, a1Var).f11722l).d();
    }

    @Override // Q2.T
    public final K J2(InterfaceC2360a interfaceC2360a, a1 a1Var, String str, InterfaceC0624Ka interfaceC0624Ka, int i) {
        Context context = (Context) BinderC2361b.t1(interfaceC2360a);
        C0554Af z3 = C0554Af.z(context, interfaceC0624Ka, i);
        str.getClass();
        context.getClass();
        ED a5 = ED.a(context);
        ED a6 = ED.a(str);
        C0554Af c0554Af = z3.f7646b;
        CD cd = c0554Af.f7619F0;
        Bn bn = new Bn(a5, cd, c0554Af.f7621G0, 4);
        CD b3 = CD.b(new C1796xl(cd, 17));
        CD cd2 = c0554Af.f7648c;
        ED ed = c0554Af.f7610A;
        C1745wf c1745wf = c0554Af.f7660j;
        return (BinderC1084hq) CD.b(new C1212kl(ed, a5, a6, CD.b(new C1118ig(a5, cd2, ed, bn, b3, c1745wf)), b3, c1745wf, c0554Af.f7688x)).d();
    }

    @Override // Q2.T
    public final InterfaceC0378p0 N1(InterfaceC2360a interfaceC2360a, InterfaceC0624Ka interfaceC0624Ka, int i) {
        return (BinderC0767am) C0554Af.z((Context) BinderC2361b.t1(interfaceC2360a), interfaceC0624Ka, i).f7680t.d();
    }

    @Override // Q2.T
    public final InterfaceC0632Lb Q(InterfaceC2360a interfaceC2360a) {
        Activity activity = (Activity) BinderC2361b.t1(interfaceC2360a);
        AdOverlayInfoParcel a5 = AdOverlayInfoParcel.a(activity.getIntent());
        if (a5 == null) {
            return new d(activity, 4);
        }
        int i = a5.f7456u;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new d(activity, 4) : new d(activity, 0) : new b(activity, a5) : new d(activity, 2) : new d(activity, 1) : new d(activity, 3);
    }

    @Override // Q2.T
    public final N8 k2(InterfaceC2360a interfaceC2360a, InterfaceC2360a interfaceC2360a2) {
        return new Oj((FrameLayout) BinderC2361b.t1(interfaceC2360a), (FrameLayout) BinderC2361b.t1(interfaceC2360a2));
    }

    @Override // Q2.T
    public final InterfaceC0612Ic q1(InterfaceC2360a interfaceC2360a, String str, InterfaceC0624Ka interfaceC0624Ka, int i) {
        Context context = (Context) BinderC2361b.t1(interfaceC2360a);
        C0554Af z3 = C0554Af.z(context, interfaceC0624Ka, i);
        context.getClass();
        return (Iq) ((CD) new C1390oj(z3.f7646b, context, str).f14828m).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        I9 i9 = null;
        Object[] objArr = 0;
        switch (i) {
            case 1:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                a1 a1Var = (a1) F5.a(parcel, a1.CREATOR);
                String readString = parcel.readString();
                InterfaceC0624Ka u32 = BinderC0610Ia.u3(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                F5.b(parcel);
                K A22 = A2(h1, a1Var, readString, u32, readInt);
                parcel2.writeNoException();
                F5.e(parcel2, A22);
                return true;
            case 2:
                InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
                a1 a1Var2 = (a1) F5.a(parcel, a1.CREATOR);
                String readString2 = parcel.readString();
                InterfaceC0624Ka u33 = BinderC0610Ia.u3(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                F5.b(parcel);
                K J12 = J1(h12, a1Var2, readString2, u33, readInt2);
                parcel2.writeNoException();
                F5.e(parcel2, J12);
                return true;
            case 3:
                InterfaceC2360a h13 = BinderC2361b.h1(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                InterfaceC0624Ka u34 = BinderC0610Ia.u3(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                F5.b(parcel);
                G B0 = B0(h13, readString3, u34, readInt3);
                parcel2.writeNoException();
                F5.e(parcel2, B0);
                return true;
            case 4:
                BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                InterfaceC2360a h14 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC2360a h15 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                N8 k22 = k2(h14, h15);
                parcel2.writeNoException();
                F5.e(parcel2, k22);
                return true;
            case 6:
                InterfaceC2360a h16 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC0624Ka u35 = BinderC0610Ia.u3(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                F5.b(parcel);
                Context context = (Context) BinderC2361b.t1(h16);
                C0554Af z3 = C0554Af.z(context, u35, readInt4);
                context.getClass();
                Jq jq = (Jq) ((CD) new C1390oj(z3.f7646b, context, (String) (objArr == true ? 1 : 0)).f14827l).d();
                parcel2.writeNoException();
                F5.e(parcel2, jq);
                return true;
            case 7:
                BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                InterfaceC2360a h17 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                InterfaceC0632Lb Q5 = Q(h17);
                parcel2.writeNoException();
                F5.e(parcel2, Q5);
                return true;
            case 9:
                InterfaceC2360a h18 = BinderC2361b.h1(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                F5.b(parcel);
                InterfaceC0352c0 E0 = E0(h18, readInt5);
                parcel2.writeNoException();
                F5.e(parcel2, E0);
                return true;
            case 10:
                InterfaceC2360a h19 = BinderC2361b.h1(parcel.readStrongBinder());
                a1 a1Var3 = (a1) F5.a(parcel, a1.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                F5.b(parcel);
                K F22 = F2(h19, a1Var3, readString4, readInt6);
                parcel2.writeNoException();
                F5.e(parcel2, F22);
                return true;
            case 11:
                InterfaceC2360a h110 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC2360a h111 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC2360a h112 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                Mj mj = new Mj((View) BinderC2361b.t1(h110), (HashMap) BinderC2361b.t1(h111), (HashMap) BinderC2361b.t1(h112));
                parcel2.writeNoException();
                F5.e(parcel2, mj);
                return true;
            case 12:
                InterfaceC2360a h113 = BinderC2361b.h1(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                InterfaceC0624Ka u36 = BinderC0610Ia.u3(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                F5.b(parcel);
                InterfaceC0612Ic q12 = q1(h113, readString5, u36, readInt7);
                parcel2.writeNoException();
                F5.e(parcel2, q12);
                return true;
            case 13:
                InterfaceC2360a h114 = BinderC2361b.h1(parcel.readStrongBinder());
                a1 a1Var4 = (a1) F5.a(parcel, a1.CREATOR);
                String readString6 = parcel.readString();
                InterfaceC0624Ka u37 = BinderC0610Ia.u3(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                F5.b(parcel);
                K J22 = J2(h114, a1Var4, readString6, u37, readInt8);
                parcel2.writeNoException();
                F5.e(parcel2, J22);
                return true;
            case 14:
                InterfaceC2360a h115 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC0624Ka u38 = BinderC0610Ia.u3(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                F5.b(parcel);
                InterfaceC1563sd y02 = y0(h115, u38, readInt9);
                parcel2.writeNoException();
                F5.e(parcel2, y02);
                return true;
            case 15:
                InterfaceC2360a h116 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC0624Ka u39 = BinderC0610Ia.u3(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                F5.b(parcel);
                InterfaceC0590Fb v12 = v1(h116, u39, readInt10);
                parcel2.writeNoException();
                F5.e(parcel2, v12);
                return true;
            case 16:
                InterfaceC2360a h117 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC0624Ka u310 = BinderC0610Ia.u3(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    i9 = queryLocalInterface instanceof I9 ? (I9) queryLocalInterface : new I9(readStrongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener", 0);
                }
                F5.b(parcel);
                Context context2 = (Context) BinderC2361b.t1(h117);
                C0554Af z5 = C0554Af.z(context2, u310, readInt11);
                context2.getClass();
                i9.getClass();
                Bl bl = (Bl) new C0601Gf(z5.f7646b, context2, i9).f9200e.d();
                parcel2.writeNoException();
                F5.e(parcel2, bl);
                return true;
            case 17:
                InterfaceC2360a h118 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC0624Ka u311 = BinderC0610Ia.u3(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                F5.b(parcel);
                InterfaceC0378p0 N12 = N1(h118, u311, readInt12);
                parcel2.writeNoException();
                F5.e(parcel2, N12);
                return true;
            case 18:
                InterfaceC2360a h119 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC0624Ka u312 = BinderC0610Ia.u3(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                F5.b(parcel);
                BinderC1309ms binderC1309ms = (BinderC1309ms) C0554Af.z((Context) BinderC2361b.t1(h119), u312, readInt13).f7692z.d();
                parcel2.writeNoException();
                F5.e(parcel2, binderC1309ms);
                return true;
            default:
                return false;
        }
    }

    @Override // Q2.T
    public final InterfaceC0590Fb v1(InterfaceC2360a interfaceC2360a, InterfaceC0624Ka interfaceC0624Ka, int i) {
        return (BinderC0857cn) C0554Af.z((Context) BinderC2361b.t1(interfaceC2360a), interfaceC0624Ka, i).f7622H.d();
    }

    @Override // Q2.T
    public final InterfaceC1563sd y0(InterfaceC2360a interfaceC2360a, InterfaceC0624Ka interfaceC0624Ka, int i) {
        return (BinderC0468l) C0554Af.z((Context) BinderC2361b.t1(interfaceC2360a), interfaceC0624Ka, i).K.d();
    }
}
