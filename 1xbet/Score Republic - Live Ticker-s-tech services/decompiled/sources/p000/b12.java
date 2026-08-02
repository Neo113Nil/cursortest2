package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b12 extends hu1 implements nx1 {

    /* JADX INFO: renamed from: b */
    public final x62 f681b;

    /* JADX INFO: renamed from: c */
    public Boolean f682c;

    /* JADX INFO: renamed from: d */
    public String f683d;

    public b12(x62 x62Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        p80.m3863h(x62Var);
        this.f681b = x62Var;
        this.f683d = null;
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: A */
    public final void mo556A(z72 z72Var) {
        p80.m3860e(z72Var.f9655j);
        p80.m3863h(z72Var.f9641B);
        m564c(new j02(this, z72Var, 6));
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: B */
    public final void mo557B(z72 z72Var, g62 g62Var, tx1 tx1Var) {
        m565d(z72Var);
        String str = z72Var.f9655j;
        p80.m3863h(str);
        this.f681b.mo1564c().m6J(new RunnableC0452m(this, str, g62Var, tx1Var, 5, false));
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: C */
    public final void mo558C(hr1 hr1Var, z72 z72Var) {
        p80.m3863h(hr1Var);
        p80.m3863h(hr1Var.f3301l);
        m565d(z72Var);
        hr1 hr1Var2 = new hr1(hr1Var);
        hr1Var2.f3299j = z72Var.f9655j;
        m562G(new RunnableC0702sr(this, hr1Var2, z72Var, 9));
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: D */
    public final void mo559D(fu1 fu1Var, z72 z72Var) {
        p80.m3863h(fu1Var);
        m565d(z72Var);
        m562G(new RunnableC0702sr(this, fu1Var, z72Var, 10));
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: E */
    public final void mo560E(z72 z72Var) {
        m565d(z72Var);
        m562G(new j02(this, z72Var, 1));
    }

    /* JADX INFO: renamed from: F */
    public final void m561F(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        x62 x62Var = this.f681b;
        if (zIsEmpty) {
            x62Var.mo1563b().f4600o.m5312a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f682c == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.f683d) && !j22.m2811t(x62Var.f8832u.f2242j, Binder.getCallingUid()) && !p90.m3876b(x62Var.f8832u.f2242j).m3882e(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    this.f682c = Boolean.valueOf(z2);
                }
                if (this.f682c.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                x62Var.mo1563b().f4600o.m5313b(ky1.m3106I(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.f683d == null) {
            Context context = x62Var.f8832u.f2242j;
            int callingUid = Binder.getCallingUid();
            int i = o90.f5673e;
            if (j22.m2784C(callingUid, context, str)) {
                this.f683d = str;
            }
        }
        if (str.equals(this.f683d)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    /* JADX INFO: renamed from: G */
    public final void m562G(Runnable runnable) {
        x62 x62Var = this.f681b;
        if (x62Var.mo1564c().m3G()) {
            runnable.run();
        } else {
            x62Var.mo1564c().m6J(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.hu1
    /* JADX INFO: renamed from: a */
    public final boolean mo563a(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        List list;
        x62 x62Var = this.f681b;
        ArrayList arrayList = null;
        qx1 ox1Var = null;
        tx1 rx1Var = null;
        switch (i) {
            case 1:
                fu1 fu1Var = (fu1) iu1.m2701a(parcel, fu1.CREATOR);
                z72 z72Var = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                mo559D(fu1Var, z72Var);
                parcel2.writeNoException();
                return true;
            case 2:
                b72 b72Var = (b72) iu1.m2701a(parcel, b72.CREATOR);
                z72 z72Var2 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                mo570k(b72Var, z72Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                z72 z72Var3 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                mo578u(z72Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                fu1 fu1Var2 = (fu1) iu1.m2701a(parcel, fu1.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                iu1.m2704d(parcel);
                p80.m3863h(fu1Var2);
                p80.m3860e(string);
                m561F(string, true);
                m562G(new RunnableC0702sr(this, fu1Var2, string, 11));
                parcel2.writeNoException();
                return true;
            case 6:
                z72 z72Var4 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                mo568i(z72Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                z72 z72Var5 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                Object[] objArr = parcel.readInt() != 0;
                iu1.m2704d(parcel);
                m565d(z72Var5);
                String str = z72Var5.f9655j;
                p80.m3863h(str);
                try {
                    List<d72> list2 = (List) x62Var.mo1564c().m4H(new h02(this, str, 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (d72 d72Var : list2) {
                        if (objArr != false || !f72.m1692f0(d72Var.f1573c)) {
                            arrayList2.add(new b72(d72Var));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException | ExecutionException e) {
                    x62Var.mo1563b().f4600o.m5314c(ky1.m3106I(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                fu1 fu1Var3 = (fu1) iu1.m2701a(parcel, fu1.CREATOR);
                String string2 = parcel.readString();
                iu1.m2704d(parcel);
                byte[] bArrMo572m = mo572m(string2, fu1Var3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo572m);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                iu1.m2704d(parcel);
                mo575q(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                z72 z72Var6 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                String strMo571l = mo571l(z72Var6);
                parcel2.writeNoException();
                parcel2.writeString(strMo571l);
                return true;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                hr1 hr1Var = (hr1) iu1.m2701a(parcel, hr1.CREATOR);
                z72 z72Var7 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                mo558C(hr1Var, z72Var7);
                parcel2.writeNoException();
                return true;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                hr1 hr1Var2 = (hr1) iu1.m2701a(parcel, hr1.CREATOR);
                iu1.m2704d(parcel);
                p80.m3863h(hr1Var2);
                p80.m3863h(hr1Var2.f3301l);
                p80.m3860e(hr1Var2.f3299j);
                m561F(hr1Var2.f3299j, true);
                m562G(new f31(14, this, new hr1(hr1Var2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = iu1.f3667a;
                z = parcel.readInt() != 0;
                z72 z72Var8 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                List listMo580w = mo580w(string6, string7, z, z72Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo580w);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = iu1.f3667a;
                z = parcel.readInt() != 0;
                iu1.m2704d(parcel);
                List listMo567g = mo567g(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo567g);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                z72 z72Var9 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                List listMo576r = mo576r(string11, string12, z72Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo576r);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                iu1.m2704d(parcel);
                List listMo579v = mo579v(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo579v);
                return true;
            case 18:
                z72 z72Var10 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                mo577s(z72Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                z72 z72Var11 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                mo582z(bundle, z72Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                z72 z72Var12 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                mo566f(z72Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                z72 z72Var13 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                gt1 gt1VarMo573o = mo573o(z72Var13);
                parcel2.writeNoException();
                if (gt1VarMo573o == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                gt1VarMo573o.writeToParcel(parcel2, 1);
                return true;
            case 24:
                z72 z72Var14 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                Bundle bundle2 = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                iu1.m2704d(parcel);
                m565d(z72Var14);
                String str2 = z72Var14.f9655j;
                p80.m3863h(str2);
                if (!x62Var.m5560f0().m770L(null, jx1.f4151T0)) {
                    try {
                        list = (List) x62Var.mo1564c().m4H(new u02(this, z72Var14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e2) {
                        x62Var.mo1563b().f4600o.m5314c(ky1.m3106I(str2), e2, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) x62Var.mo1564c().m5I(new u02(this, z72Var14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                        x62Var.mo1563b().f4600o.m5314c(ky1.m3106I(str2), e3, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                z72 z72Var15 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                mo556A(z72Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                z72 z72Var16 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                mo569j(z72Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                z72 z72Var17 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                iu1.m2704d(parcel);
                mo560E(z72Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                z72 z72Var18 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                g62 g62Var = (g62) iu1.m2701a(parcel, g62.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    rx1Var = iInterfaceQueryLocalInterface instanceof tx1 ? (tx1) iInterfaceQueryLocalInterface : new rx1(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 2);
                }
                iu1.m2704d(parcel);
                mo557B(z72Var18, g62Var, rx1Var);
                parcel2.writeNoException();
                return true;
            case 30:
                z72 z72Var19 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                vp1 vp1Var = (vp1) iu1.m2701a(parcel, vp1.CREATOR);
                iu1.m2704d(parcel);
                mo581x(z72Var19, vp1Var);
                parcel2.writeNoException();
                return true;
            case 31:
                z72 z72Var20 = (z72) iu1.m2701a(parcel, z72.CREATOR);
                Bundle bundle3 = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    ox1Var = iInterfaceQueryLocalInterface2 instanceof qx1 ? (qx1) iInterfaceQueryLocalInterface2 : new ox1(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 2);
                }
                iu1.m2704d(parcel);
                mo574p(z72Var20, bundle3, ox1Var);
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m564c(Runnable runnable) {
        x62 x62Var = this.f681b;
        if (x62Var.mo1564c().m3G()) {
            runnable.run();
        } else {
            x62Var.mo1564c().m8L(runnable);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m565d(z72 z72Var) {
        p80.m3863h(z72Var);
        String str = z72Var.f9655j;
        p80.m3860e(str);
        m561F(str, false);
        this.f681b.m5572l0().m1703G(z72Var.f9656k);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: f */
    public final void mo566f(z72 z72Var) {
        p80.m3860e(z72Var.f9655j);
        p80.m3863h(z72Var.f9641B);
        m564c(new j02(this, z72Var, 4));
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: g */
    public final List mo567g(String str, String str2, String str3, boolean z) {
        m561F(str, true);
        x62 x62Var = this.f681b;
        try {
            List<d72> list = (List) x62Var.mo1564c().m4H(new n02(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (d72 d72Var : list) {
                if (z || !f72.m1692f0(d72Var.f1573c)) {
                    arrayList.add(new b72(d72Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            x62Var.mo1563b().f4600o.m5314c(ky1.m3106I(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: i */
    public final void mo568i(z72 z72Var) {
        m565d(z72Var);
        m562G(new j02(this, z72Var, 2));
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: j */
    public final void mo569j(z72 z72Var) {
        p80.m3860e(z72Var.f9655j);
        p80.m3863h(z72Var.f9641B);
        m564c(new j02(this, z72Var, 5));
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: k */
    public final void mo570k(b72 b72Var, z72 z72Var) {
        p80.m3863h(b72Var);
        m565d(z72Var);
        m562G(new RunnableC0702sr(this, b72Var, z72Var, 12));
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: l */
    public final String mo571l(z72 z72Var) {
        m565d(z72Var);
        x62 x62Var = this.f681b;
        try {
            return (String) x62Var.mo1564c().m4H(new h02(x62Var, z72Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            x62Var.mo1563b().f4600o.m5314c(ky1.m3106I(z72Var.f9655j), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: m */
    public final byte[] mo572m(String str, fu1 fu1Var) {
        p80.m3860e(str);
        p80.m3863h(fu1Var);
        m561F(str, true);
        x62 x62Var = this.f681b;
        wc1 wc1Var = x62Var.mo1563b().f4607v;
        f02 f02Var = x62Var.f8832u;
        cy1 cy1Var = f02Var.f2251s;
        String str2 = fu1Var.f2501j;
        wc1Var.m5313b(cy1Var.m1043a(str2), "Log and bundle. event");
        x62Var.mo1567f().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) x62Var.mo1564c().m5I(new CallableC0445lt(this, fu1Var, str)).get();
            if (bArr == null) {
                x62Var.mo1563b().f4600o.m5313b(ky1.m3106I(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            x62Var.mo1567f().getClass();
            x62Var.mo1563b().f4607v.m5315d("Log and bundle processed. event, size, time_ms", f02Var.f2251s.m1043a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            x62Var.mo1563b().f4600o.m5315d("Failed to log and bundle. appId, event, error", ky1.m3106I(str), f02Var.f2251s.m1043a(str2), e);
            return null;
        }
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: o */
    public final gt1 mo573o(z72 z72Var) {
        m565d(z72Var);
        String str = z72Var.f9655j;
        p80.m3860e(str);
        x62 x62Var = this.f681b;
        try {
            return (gt1) x62Var.mo1564c().m5I(new h02(this, z72Var, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            x62Var.mo1563b().f4600o.m5314c(ky1.m3106I(str), e, "Failed to get consent. appId");
            return new gt1(null);
        }
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: p */
    public final void mo574p(z72 z72Var, Bundle bundle, qx1 qx1Var) {
        m565d(z72Var);
        String str = z72Var.f9655j;
        p80.m3863h(str);
        this.f681b.mo1564c().m6J(new u21(this, z72Var, bundle, qx1Var, str));
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: q */
    public final void mo575q(long j, String str, String str2, String str3) {
        m562G(new ee1(this, str2, str3, str, j, 1));
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: r */
    public final List mo576r(String str, String str2, z72 z72Var) {
        m565d(z72Var);
        String str3 = z72Var.f9655j;
        p80.m3863h(str3);
        x62 x62Var = this.f681b;
        try {
            return (List) x62Var.mo1564c().m4H(new n02(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            x62Var.mo1563b().f4600o.m5313b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: s */
    public final void mo577s(z72 z72Var) {
        String str = z72Var.f9655j;
        p80.m3860e(str);
        m561F(str, false);
        m562G(new j02(this, z72Var, 3));
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: u */
    public final void mo578u(z72 z72Var) {
        m565d(z72Var);
        m562G(new j02(this, z72Var, 0));
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: v */
    public final List mo579v(String str, String str2, String str3) {
        m561F(str, true);
        x62 x62Var = this.f681b;
        try {
            return (List) x62Var.mo1564c().m4H(new n02(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            x62Var.mo1563b().f4600o.m5313b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: w */
    public final List mo580w(String str, String str2, boolean z, z72 z72Var) {
        m565d(z72Var);
        String str3 = z72Var.f9655j;
        p80.m3863h(str3);
        x62 x62Var = this.f681b;
        try {
            List<d72> list = (List) x62Var.mo1564c().m4H(new n02(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (d72 d72Var : list) {
                if (z || !f72.m1692f0(d72Var.f1573c)) {
                    arrayList.add(new b72(d72Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            x62Var.mo1563b().f4600o.m5314c(ky1.m3106I(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: x */
    public final void mo581x(z72 z72Var, vp1 vp1Var) {
        m565d(z72Var);
        m562G(new RunnableC0702sr(this, z72Var, vp1Var, 13, false));
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: z */
    public final void mo582z(Bundle bundle, z72 z72Var) {
        m565d(z72Var);
        String str = z72Var.f9655j;
        p80.m3863h(str);
        m562G(new RunnableC0452m(this, bundle, str, z72Var, 7, false));
    }
}
