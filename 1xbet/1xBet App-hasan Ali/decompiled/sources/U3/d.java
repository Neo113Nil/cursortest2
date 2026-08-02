package U3;

import c4.AbstractC0542c;
import game.betting133.sports1xbet.aqua_network.AquaSignalEnvelope;

/* loaded from: classes.dex */
public final class d extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public Object f5897k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5898l;

    /* renamed from: m, reason: collision with root package name */
    public AquaSignalEnvelope f5899m;

    /* renamed from: n, reason: collision with root package name */
    public int f5900n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f5901o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g f5902p;

    /* renamed from: q, reason: collision with root package name */
    public int f5903q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f5902p = gVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f5901o = obj;
        this.f5903q |= Integer.MIN_VALUE;
        return this.f5902p.d(0, this);
    }
}
