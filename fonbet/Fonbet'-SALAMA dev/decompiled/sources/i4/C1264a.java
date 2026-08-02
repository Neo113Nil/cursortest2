package i4;

import E3.F;
import java.util.Iterator;

/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1264a implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f13983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1265b f13984b;

    public C1264a(C1265b c1265b, Iterator it) {
        this.f13984b = c1265b;
        this.f13983a = it;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new F(this, 3);
    }
}
