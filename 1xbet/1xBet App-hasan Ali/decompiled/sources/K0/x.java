package K0;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2878a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2879b = 0;

    static {
        W0.p[] pVarArr = W0.o.f6020b;
        f2878a = W0.o.f6021c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0024, code lost:
    
        if (r1 == r18.f2871a) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w a(w wVar, int i, int i5, long j5, V0.q qVar, y yVar, V0.i iVar, int i6, int i7, V0.s sVar) {
        long j6;
        int i8 = i;
        int i9 = i5;
        long j7 = j5;
        V0.q qVar2 = qVar;
        y yVar2 = yVar;
        V0.i iVar2 = iVar;
        int i10 = i6;
        int i11 = i7;
        V0.s sVar2 = sVar;
        if (i8 == Integer.MIN_VALUE) {
            j6 = 0;
        } else {
            j6 = 0;
        }
        W0.p[] pVarArr = W0.o.f6020b;
        if (((j7 & 1095216660480L) == j6 || W0.o.a(j7, wVar.f2873c)) && ((qVar2 == null || qVar2.equals(wVar.f2874d)) && ((i9 == Integer.MIN_VALUE || i9 == wVar.f2872b) && ((yVar2 == null || yVar2.equals(wVar.f2875e)) && ((iVar2 == null || iVar2.equals(wVar.f)) && ((i10 == 0 || i10 == wVar.f2876g) && ((i11 == Integer.MIN_VALUE || i11 == wVar.f2877h) && (sVar2 == null || sVar2.equals(wVar.i))))))))) {
            return wVar;
        }
        W0.p[] pVarArr2 = W0.o.f6020b;
        if ((j7 & 1095216660480L) == j6) {
            j7 = wVar.f2873c;
        }
        if (qVar2 == null) {
            qVar2 = wVar.f2874d;
        }
        if (i8 == Integer.MIN_VALUE) {
            i8 = wVar.f2871a;
        }
        if (i9 == Integer.MIN_VALUE) {
            i9 = wVar.f2872b;
        }
        y yVar3 = wVar.f2875e;
        if (yVar3 != null && yVar2 == null) {
            yVar2 = yVar3;
        }
        if (iVar2 == null) {
            iVar2 = wVar.f;
        }
        if (i10 == 0) {
            i10 = wVar.f2876g;
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = wVar.f2877h;
        }
        if (sVar2 == null) {
            sVar2 = wVar.i;
        }
        return new w(i8, i9, j7, qVar2, yVar2, iVar2, i10, i11, sVar2);
    }
}
