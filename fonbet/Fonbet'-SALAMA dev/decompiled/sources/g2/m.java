package g2;

import A1.X;
import E3.AbstractC0167z;
import f2.InterfaceC1075g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final X f13158a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0167z f13159b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13160c;

    /* renamed from: d, reason: collision with root package name */
    public final List f13161d;

    /* renamed from: e, reason: collision with root package name */
    public final j f13162e;

    public m(X x4, AbstractC0167z abstractC0167z, s sVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        AbstractC1664a.f(!abstractC0167z.isEmpty());
        this.f13158a = x4;
        this.f13159b = AbstractC0167z.E(abstractC0167z);
        this.f13161d = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f13162e = sVar.a(this);
        this.f13160c = v2.t.K(sVar.f13177c, 1000000L, sVar.f13176b);
    }

    public abstract String a();

    public abstract InterfaceC1075g c();

    public abstract j d();
}
