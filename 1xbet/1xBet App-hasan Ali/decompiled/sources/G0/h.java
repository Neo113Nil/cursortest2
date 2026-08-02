package G0;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class h extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1802k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f1803l;

    /* renamed from: m, reason: collision with root package name */
    public int f1804m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f1803l = iVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f1802k = obj;
        this.f1804m |= Integer.MIN_VALUE;
        return this.f1803l.b(0.0f, this);
    }
}
