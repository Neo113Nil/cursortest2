package R5;

import A1.InterfaceC0025j;
import A1.InterfaceC0027k;
import E3.AbstractC0167z;
import E3.C0165x;
import a.AbstractC0603a;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebStorage;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import d2.C0958a;
import d2.C0959b;
import g4.C1145r;
import g4.InterfaceC1131d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import v0.AbstractC1663a;
import v2.AbstractC1664a;
import w1.C1726n0;
import w1.P2;
import w1.V0;

/* loaded from: classes2.dex */
public final /* synthetic */ class M implements A5.b, A5.c, S5.c, X1.a, InterfaceC0025j, com.google.firebase.storage.y, N4.a, InterfaceC1131d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6088a;

    public /* synthetic */ M(int i7) {
        this.f6088a = i7;
    }

    @Override // com.google.firebase.storage.y
    public void a(Object obj, Object obj2) {
        switch (this.f6088a) {
            case 17:
                K5.p pVar = (K5.p) obj;
                com.google.firebase.storage.r rVar = (com.google.firebase.storage.r) obj2;
                G5.b bVar = pVar.f4130a;
                A5.h hVar = pVar.f4131b;
                if (((K5.c) bVar.f3047b).f4101k.booleanValue()) {
                    return;
                }
                HashMap a2 = bVar.a(rVar, null);
                a2.put("taskState", 1);
                hVar.c(a2);
                K5.c cVar = (K5.c) bVar.f3047b;
                synchronized (cVar.f4099h) {
                    cVar.f4099h.notifyAll();
                }
                return;
            default:
                K5.q qVar = (K5.q) obj;
                com.google.firebase.storage.r rVar2 = (com.google.firebase.storage.r) obj2;
                G5.b bVar2 = qVar.f4132a;
                A5.h hVar2 = qVar.f4133b;
                if (((K5.c) bVar2.f3047b).f4101k.booleanValue()) {
                    return;
                }
                HashMap a4 = bVar2.a(rVar2, null);
                a4.put("taskState", 0);
                hVar2.c(a4);
                K5.c cVar2 = (K5.c) bVar2.f3047b;
                synchronized (cVar2.f4098g) {
                    cVar2.f4098g.notifyAll();
                }
                return;
        }
    }

    @Override // N4.a
    public void b(N4.b bVar) {
    }

    @Override // S5.c
    public boolean c(View view) {
        return view.hasFocus();
    }

    @Override // A1.InterfaceC0025j
    public InterfaceC0027k d(Bundle bundle) {
        E3.L o7;
        C0958a[] c0958aArr;
        switch (this.f6088a) {
            case 15:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList == null) {
                    C0165x c0165x = AbstractC0167z.f2083b;
                    o7 = E3.L.f2000e;
                } else {
                    o7 = AbstractC1664a.o(A1.X.f280Y, parcelableArrayList);
                }
                return new c2.e0(bundle.getString(Integer.toString(1, 36), ""), (A1.X[]) o7.toArray(new A1.X[0]));
            case 16:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                return parcelableArrayList2 == null ? new c2.f0(new c2.e0[0]) : new c2.f0((c2.e0[]) AbstractC1664a.o(c2.e0.f10340f, parcelableArrayList2).toArray(new c2.e0[0]));
            case 17:
            case 18:
            default:
                long j = bundle.getLong(Integer.toString(0, 36));
                int i7 = bundle.getInt(Integer.toString(1, 36), -1);
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(Integer.toString(2, 36));
                int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
                long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
                long j3 = bundle.getLong(Integer.toString(5, 36));
                boolean z4 = bundle.getBoolean(Integer.toString(6, 36));
                if (intArray == null) {
                    intArray = new int[0];
                }
                int[] iArr = intArray;
                Uri[] uriArr = new Uri[0];
                if (parcelableArrayList3 != null) {
                    uriArr = (Uri[]) parcelableArrayList3.toArray(uriArr);
                }
                Uri[] uriArr2 = uriArr;
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new C0958a(j, i7, iArr, uriArr2, longArray, j3, z4);
            case 19:
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(Integer.toString(1, 36));
                if (parcelableArrayList4 == null) {
                    c0958aArr = new C0958a[0];
                } else {
                    C0958a[] c0958aArr2 = new C0958a[parcelableArrayList4.size()];
                    for (int i8 = 0; i8 < parcelableArrayList4.size(); i8++) {
                        c0958aArr2[i8] = (C0958a) C0958a.f12373y.d((Bundle) parcelableArrayList4.get(i8));
                    }
                    c0958aArr = c0958aArr2;
                }
                return new C0959b(c0958aArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
        }
    }

    @Override // g4.InterfaceC1131d
    public Object e(C1145r c1145r) {
        switch (this.f6088a) {
            case 27:
                return (ScheduledExecutorService) ExecutorsRegistrar.f11958a.get();
            case 28:
                return (ScheduledExecutorService) ExecutorsRegistrar.f11960c.get();
            default:
                return (ScheduledExecutorService) ExecutorsRegistrar.f11959b.get();
        }
    }

    @Override // A5.c
    public void f(Object obj) {
        switch (this.f6088a) {
            case 1:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance'.", "");
                    int i7 = C0411g.f6164e;
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        int i8 = C0411g.f6164e;
                        break;
                    } else {
                        Object obj2 = list.get(0);
                        t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj2, (String) obj3, (String) list.get(2)));
                        int i9 = C0411g.f6164e;
                        break;
                    }
                }
            case 2:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged'.", "");
                    int i10 = i0.f6175d;
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i11 = i0.f6175d;
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        t6.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i12 = i0.f6175d;
                        break;
                    }
                }
            case 3:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance'.", "");
                    int i13 = C0411g.f6164e;
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        int i14 = C0411g.f6164e;
                        break;
                    } else {
                        Object obj6 = list3.get(0);
                        t6.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        t6.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj6, (String) obj7, (String) list3.get(2)));
                        int i15 = C0411g.f6164e;
                        break;
                    }
                }
            case 4:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError'.", "");
                    int i16 = e0.f6158c;
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i17 = e0.f6158c;
                        break;
                    } else {
                        Object obj8 = list4.get(0);
                        t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        t6.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i18 = e0.f6158c;
                        break;
                    }
                }
            case 5:
            default:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance'.", "");
                    int i19 = C0411g.f6164e;
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i20 = C0411g.f6164e;
                        break;
                    } else {
                        Object obj10 = list5.get(0);
                        t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        t6.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i21 = C0411g.f6164e;
                        break;
                    }
                }
            case 6:
                if (!(obj instanceof List)) {
                    AbstractC1663a.m("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance'.", "");
                    int i22 = C0411g.f6164e;
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i23 = C0411g.f6164e;
                        break;
                    } else {
                        Object obj12 = list6.get(0);
                        t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        t6.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0603a.h(new C0405a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i24 = C0411g.f6164e;
                        break;
                    }
                }
        }
    }

    @Override // X1.a
    public boolean g(int i7, int i8, int i9, int i10, int i11) {
        return false;
    }

    public void h(Object obj) {
        ((c2.T) obj).f10260b.getClass();
    }

    @Override // A5.b
    public void i(Object obj, V0 v02) {
        List w02;
        List w03;
        switch (this.f6088a) {
            case 0:
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                t6.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebStorage");
                try {
                    ((WebStorage) obj2).deleteAllData();
                    w02 = Y4.D.D(null);
                } catch (Throwable th) {
                    w02 = AbstractC0603a.w0(th);
                }
                v02.f(w02);
                break;
            default:
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                try {
                    w03 = Y4.D.D(Boolean.valueOf(R0.d.a((String) obj3)));
                } catch (Throwable th2) {
                    w03 = AbstractC0603a.w0(th2);
                }
                v02.f(w03);
                break;
        }
    }

    public C1726n0 j(Context context, P2 p22) {
        switch (this.f6088a) {
            case 23:
                return new C1726n0(context, p22);
            default:
                return new d5.d(context, p22);
        }
    }

    public P2 k(Context context) {
        switch (this.f6088a) {
            case zzbbd.zzt.zzm /* 21 */:
                return new P2(context, 29);
            default:
                return new d5.b(context, 29);
        }
    }

    public /* synthetic */ M(Object obj, int i7) {
        this.f6088a = i7;
    }
}
