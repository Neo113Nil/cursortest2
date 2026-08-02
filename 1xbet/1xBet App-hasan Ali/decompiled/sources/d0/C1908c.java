package d0;

import c4.AbstractC0542c;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1908c extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public r4.b f16828k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f16829l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC1909d f16830m;

    /* renamed from: n, reason: collision with root package name */
    public int f16831n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1908c(ViewOnAttachStateChangeListenerC1909d viewOnAttachStateChangeListenerC1909d, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f16830m = viewOnAttachStateChangeListenerC1909d;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f16829l = obj;
        this.f16831n |= Integer.MIN_VALUE;
        return this.f16830m.a(this);
    }
}
