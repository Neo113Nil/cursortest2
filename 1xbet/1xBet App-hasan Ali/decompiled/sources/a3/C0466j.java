package a3;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0681Sb;
import com.google.android.gms.internal.ads.C1041gs;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.InterfaceC0695Ub;
import com.google.android.gms.internal.ads.Jw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: a3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0466j implements Jw {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6545k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0695Ub f6546l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f6547m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BinderC0468l f6548n;

    public /* synthetic */ C0466j(BinderC0468l binderC0468l, InterfaceC0695Ub interfaceC0695Ub, boolean z3, int i) {
        this.f6545k = i;
        this.f6546l = interfaceC0695Ub;
        this.f6547m = z3;
        this.f6548n = binderC0468l;
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public final void mo14o(Object obj) {
        BinderC0468l binderC0468l;
        switch (this.f6545k) {
            case 0:
                BinderC0468l binderC0468l2 = this.f6548n;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    C0681Sb c0681Sb = (C0681Sb) this.f6546l;
                    Parcel N5 = c0681Sb.N();
                    N5.writeTypedList(arrayList);
                    c0681Sb.d1(N5, 1);
                    if (!binderC0468l2.f6580x && !this.f6547m) {
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        Uri uri = (Uri) obj2;
                        boolean A3 = BinderC0468l.A3(uri, binderC0468l2.J, binderC0468l2.K);
                        C1041gs c1041gs = binderC0468l2.f6579w;
                        if (A3) {
                            c1041gs.b(BinderC0468l.B3(uri, binderC0468l2.f6559G, "1").toString(), null, null);
                        } else {
                            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.a7)).booleanValue()) {
                                c1041gs.b(uri.toString(), null, null);
                            }
                        }
                    }
                    break;
                } catch (RemoteException e3) {
                    U2.j.g("", e3);
                    return;
                }
                break;
            default:
                List<Uri> list = (List) obj;
                try {
                    Iterator it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        binderC0468l = this.f6548n;
                        if (hasNext) {
                            if (BinderC0468l.A3((Uri) it.next(), binderC0468l.f6560H, binderC0468l.f6561I)) {
                                binderC0468l.f6556D.getAndIncrement();
                            }
                        }
                    }
                    C0681Sb c0681Sb2 = (C0681Sb) this.f6546l;
                    Parcel N6 = c0681Sb2.N();
                    N6.writeTypedList(list);
                    c0681Sb2.d1(N6, 1);
                    if (!binderC0468l.f6581y && !this.f6547m) {
                    }
                    for (Uri uri2 : list) {
                        boolean A32 = BinderC0468l.A3(uri2, binderC0468l.f6560H, binderC0468l.f6561I);
                        C1041gs c1041gs2 = binderC0468l.f6579w;
                        if (A32) {
                            c1041gs2.b(BinderC0468l.B3(uri2, binderC0468l.f6559G, "1").toString(), null, null);
                        } else {
                            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.a7)).booleanValue()) {
                                c1041gs2.b(uri2.toString(), null, null);
                            }
                        }
                    }
                    break;
                } catch (RemoteException e5) {
                    U2.j.g("", e5);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public final void u(Throwable th) {
        switch (this.f6545k) {
            case 0:
                try {
                    InterfaceC0695Ub interfaceC0695Ub = this.f6546l;
                    String str = "Internal error: " + th.getMessage();
                    C0681Sb c0681Sb = (C0681Sb) interfaceC0695Ub;
                    Parcel N5 = c0681Sb.N();
                    N5.writeString(str);
                    c0681Sb.d1(N5, 2);
                    break;
                } catch (RemoteException e3) {
                    U2.j.g("", e3);
                    return;
                }
            default:
                try {
                    InterfaceC0695Ub interfaceC0695Ub2 = this.f6546l;
                    String str2 = "Internal error: " + th.getMessage();
                    C0681Sb c0681Sb2 = (C0681Sb) interfaceC0695Ub2;
                    Parcel N6 = c0681Sb2.N();
                    N6.writeString(str2);
                    c0681Sb2.d1(N6, 2);
                    break;
                } catch (RemoteException e5) {
                    U2.j.g("", e5);
                }
        }
    }
}
