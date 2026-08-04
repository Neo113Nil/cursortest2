package g2;

import A1.X;
import E3.AbstractC0167z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f13164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0167z f13165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f13168e;

    public m(X x4, AbstractC0167z abstractC0167z, s sVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        p151v2.a.f(!abstractC0167z.isEmpty());
        this.f13164a = x4;
        this.f13165b = AbstractC0167z.E(abstractC0167z);
        this.f13167d = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f13168e = sVar.a(this);
        this.f13166c = p151v2.t.K(sVar.f13183c, 1000000L, sVar.f13182b);
    }

    public abstract String a();

    public abstract p040f2.g c();

    public abstract j d();
}
