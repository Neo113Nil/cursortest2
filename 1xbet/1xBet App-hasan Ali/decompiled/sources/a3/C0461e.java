package a3;

import Q2.C0379q;
import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.C1428pc;
import com.google.android.gms.internal.ads.C1842ym;
import com.google.android.gms.internal.ads.InterfaceC1311mu;
import com.google.android.gms.internal.ads.InterfaceC1897zw;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONException;

/* renamed from: a3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0461e implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6537b;

    public /* synthetic */ C0461e(int i, Object obj) {
        this.f6536a = i;
        this.f6537b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    public final E3.a k(Object obj) {
        switch (this.f6536a) {
            case 0:
                final Uri uri = (Uri) obj;
                BinderC0468l binderC0468l = (BinderC0468l) this.f6537b;
                return AbstractC1400ot.h0(binderC0468l.v3("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new InterfaceC1311mu() { // from class: a3.f
                    @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        boolean isEmpty = TextUtils.isEmpty(str);
                        Uri uri2 = uri;
                        return !isEmpty ? BinderC0468l.B3(uri2, "nas", str) : uri2;
                    }
                }, binderC0468l.f6573q);
            case 1:
                final ArrayList arrayList = (ArrayList) obj;
                final BinderC0468l binderC0468l2 = (BinderC0468l) this.f6537b;
                return AbstractC1400ot.h0(binderC0468l2.v3("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new InterfaceC1311mu() { // from class: a3.b
                    @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        BinderC0468l binderC0468l3 = BinderC0468l.this;
                        binderC0468l3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = arrayList;
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            Object obj3 = arrayList3.get(i);
                            i++;
                            Uri uri2 = (Uri) obj3;
                            if (!BinderC0468l.A3(uri2, binderC0468l3.J, binderC0468l3.K) || TextUtils.isEmpty(str)) {
                                arrayList2.add(uri2);
                            } else {
                                arrayList2.add(BinderC0468l.B3(uri2, "nas", str));
                            }
                        }
                        return arrayList2;
                    }
                }, binderC0468l2.f6573q);
            default:
                C1842ym c1842ym = (C1842ym) obj;
                u uVar = new u(new JsonReader(new InputStreamReader(c1842ym.f16473a)), c1842ym.f16474b);
                C1428pc c1428pc = (C1428pc) this.f6537b;
                try {
                    uVar.f6621b = C0379q.f.f5048a.f(c1428pc.f14995k).toString();
                } catch (JSONException unused) {
                    uVar.f6621b = "{}";
                }
                if (!c1428pc.f15008x.isEmpty()) {
                    try {
                        uVar.f6622c = C0379q.f.f5048a.f(c1428pc.f15008x).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return AbstractC1400ot.c0(uVar);
        }
    }
}
