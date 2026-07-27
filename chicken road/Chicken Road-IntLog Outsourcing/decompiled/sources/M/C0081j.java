package M;

import m4.AbstractC1295c;

/* renamed from: M.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081j extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public f2.t f1702a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2.t f1704c;

    /* renamed from: d, reason: collision with root package name */
    public int f1705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0081j(f2.t tVar, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1704c = tVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1703b = obj;
        this.f1705d |= Integer.MIN_VALUE;
        return this.f1704c.b(this);
    }
}
