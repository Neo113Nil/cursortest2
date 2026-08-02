package t;

import u.p0;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f19424l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2383E f19425m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2384F f19426n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(C2383E c2383e, C2384F c2384f, int i) {
        super(1);
        this.f19424l = i;
        this.f19425m = c2383e;
        this.f19426n = c2384f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r3.f19426n.f19343a.f19353a != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        if (r3.f19425m.f19340a.f19353a != null) goto L37;
     */
    @Override // i4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj) {
        switch (this.f19424l) {
            case 0:
                p0 p0Var = (p0) obj;
                v vVar = v.f19415k;
                v vVar2 = v.f19416l;
                if (p0Var.a(vVar, vVar2)) {
                    C2385G c2385g = this.f19425m.f19340a.f19353a;
                    return c2385g != null ? c2385g.f19344a : AbstractC2379A.f19322b;
                }
                if (!p0Var.a(vVar2, v.f19417m)) {
                    return AbstractC2379A.f19322b;
                }
                C2385G c2385g2 = this.f19426n.f19343a.f19353a;
                return c2385g2 != null ? c2385g2.f19344a : AbstractC2379A.f19322b;
            case 1:
                int ordinal = ((v) obj).ordinal();
                float f = 0.0f;
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw new D2.e();
                        }
                        break;
                    }
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case 2:
                p0 p0Var2 = (p0) obj;
                v vVar3 = v.f19415k;
                v vVar4 = v.f19416l;
                if (p0Var2.a(vVar3, vVar4)) {
                    return AbstractC2379A.f19322b;
                }
                if (!p0Var2.a(vVar4, v.f19417m)) {
                    return AbstractC2379A.f19322b;
                }
                N n5 = this.f19426n.f19343a;
                return AbstractC2379A.f19322b;
            default:
                int ordinal2 = ((v) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new D2.e();
                    }
                    N n6 = this.f19426n.f19343a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
