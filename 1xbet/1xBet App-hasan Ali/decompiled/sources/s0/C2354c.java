package s0;

import c4.AbstractC0542c;

/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2354c extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f19155k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2355d f19156l;

    /* renamed from: m, reason: collision with root package name */
    public int f19157m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2354c(C2355d c2355d, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f19156l = c2355d;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19155k = obj;
        this.f19157m |= Integer.MIN_VALUE;
        return this.f19156l.b(0L, this);
    }
}
