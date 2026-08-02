package P;

/* renamed from: P.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283b0 implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4444k;

    /* renamed from: l, reason: collision with root package name */
    public Object f4445l;

    /* JADX WARN: Type inference failed for: r0v4, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // i4.c
    public final Object c(Object obj) {
        long j5;
        switch (this.f4444k) {
            case 0:
                return ((kotlin.jvm.internal.m) this.f4445l).c(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                Z.j jVar = (Z.j) obj;
                synchronized (Z.l.f6208c) {
                    j5 = Z.l.f6210e;
                    Z.l.f6210e = 1 + j5;
                }
                return new Z.e(j5, jVar, (i4.c) this.f4445l);
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                t0.x xVar = (t0.x) this.f4445l;
                if (xVar != null) {
                    xVar.f19531m = booleanValue;
                }
                return W3.o.f6046a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0283b0(i4.c cVar, int i) {
        this.f4444k = i;
        switch (i) {
            case 1:
                this.f4445l = cVar;
                break;
            default:
                this.f4445l = (kotlin.jvm.internal.m) cVar;
                break;
        }
    }
}
