package l;

import Y1.C0077a;
import android.content.Context;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s0 implements C0.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f9878a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9879b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9880c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9881d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9882e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f9883g;

    public s0(C0077a c0077a, WebView webView, String str, ArrayList arrayList, o1.c cVar) {
        ArrayList arrayList2 = new ArrayList();
        this.f9880c = arrayList2;
        this.f9881d = new HashMap();
        this.f9878a = c0077a;
        this.f9879b = webView;
        this.f9882e = str;
        this.f9883g = cVar;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o1.h hVar = (o1.h) it.next();
                ((HashMap) this.f9881d).put(UUID.randomUUID().toString(), hVar);
            }
        }
        this.f = "";
    }

    @Override // c2.a
    public Object get() {
        return new G0.l((Context) ((b0.i) this.f9878a).f2461b, (B0.g) ((c2.a) this.f9879b).get(), (H0.d) ((c2.a) this.f9880c).get(), (G0.d) ((A0.j) this.f9881d).get(), (Executor) ((c2.a) this.f9882e).get(), (I0.c) ((c2.a) this.f).get(), new P0.j(4), new P0.j(3), (H0.c) ((c2.a) this.f9883g).get());
    }
}
