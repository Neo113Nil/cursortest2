package a3;

import A0.J0;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.N4;
import com.google.android.gms.internal.ads.R4;
import com.google.android.gms.internal.ads.Xq;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: a3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0460d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6534c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6535d;

    public /* synthetic */ CallableC0460d(Object obj, Object obj2, Object obj3, int i) {
        this.f6532a = i;
        this.f6533b = obj;
        this.f6535d = obj2;
        this.f6534c = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Xq xq;
        switch (this.f6532a) {
            case 0:
                Uri uri = (Uri) this.f6535d;
                BinderC0468l binderC0468l = (BinderC0468l) this.f6533b;
                binderC0468l.getClass();
                try {
                    boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.Cb)).booleanValue();
                    InterfaceC2360a interfaceC2360a = (InterfaceC2360a) this.f6534c;
                    uri = (!booleanValue || (xq = binderC0468l.f6571o) == null) ? binderC0468l.f6570n.a(uri, binderC0468l.f6569m, (View) BinderC2361b.t1(interfaceC2360a), null) : xq.a(uri, binderC0468l.f6569m, (View) BinderC2361b.t1(interfaceC2360a), null);
                } catch (R4 e3) {
                    U2.j.j("", e3);
                }
                if (uri.getQueryParameter("ms") != null) {
                    return uri;
                }
                throw new Exception("Failed to append spam signals to click url.");
            case 1:
                BinderC0468l binderC0468l2 = (BinderC0468l) this.f6533b;
                N4 n42 = binderC0468l2.f6570n.f11167b;
                String e5 = n42 != null ? n42.e(binderC0468l2.f6569m, (View) BinderC2361b.t1((InterfaceC2360a) this.f6534c), null) : "";
                if (TextUtils.isEmpty(e5)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) this.f6535d;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    Uri uri2 = (Uri) obj;
                    if (BinderC0468l.A3(uri2, binderC0468l2.J, binderC0468l2.K)) {
                        arrayList.add(BinderC0468l.B3(uri2, "ms", e5));
                    } else {
                        U2.j.i("Not a Google URL: ".concat(String.valueOf(uri2)));
                        arrayList.add(uri2);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            default:
                J0.p(((F) this.f6533b).f6484c, (J2.h) this.f6535d, (G) this.f6534c);
                return Boolean.TRUE;
        }
    }
}
