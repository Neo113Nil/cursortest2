package t4;

import E.C0108m;
import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class l extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public C0108m f19615k;

    /* renamed from: l, reason: collision with root package name */
    public Object f19616l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f19617m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0108m f19618n;

    /* renamed from: o, reason: collision with root package name */
    public int f19619o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C0108m c0108m, a4.c cVar) {
        super(cVar);
        this.f19618n = c0108m;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19617m = obj;
        this.f19619o |= Integer.MIN_VALUE;
        return this.f19618n.d(null, this);
    }
}
