package p063i4;

import E3.F;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f13989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f13990b;

    public a(b bVar, Iterator it) {
        this.f13990b = bVar;
        this.f13989a = it;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new F(this, 3);
    }
}
