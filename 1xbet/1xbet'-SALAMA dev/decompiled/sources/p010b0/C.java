package p010b0;

import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
public final class C extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f9911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f9913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f9914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(O o7, int i7, d dVar) {
        super(2, dVar);
        this.f9914d = o7;
        this.f9915e = i7;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        C c3 = new C(this.f9914d, this.f9915e, dVar);
        c3.f9913c = ((Boolean) obj).booleanValue();
        return c3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C) create(bool, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int iIntValue;
        ?? r7;
        ?? r8;
        i0 i0Var;
        ?? r9;
        a aVar = a.f14648a;
        ?? r10 = this.f9912b;
        O o7 = this.f9914d;
        try {
            if (r10 == 0) {
                p003a.a.p0(obj);
                boolean z4 = this.f9913c;
                this.f9913c = z4;
                this.f9912b = 1;
                obj = O.f(o7, z4, this);
                r10 = z4;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (r10 != 1) {
                    if (r10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z7 = this.f9913c;
                    th = this.f9911a;
                    p003a.a.p0(obj);
                    r8 = z7;
                    iIntValue = ((Number) obj).intValue();
                    r7 = r8;
                    b0 b0Var = new b0(th, iIntValue);
                    r9 = r7;
                    i0Var = b0Var;
                    return new p044f6.d(i0Var, Boolean.valueOf((boolean) r9));
                }
                boolean z8 = this.f9913c;
                p003a.a.p0(obj);
                r10 = z8;
            }
            i0Var = (i0) obj;
            r9 = r10;
        } catch (Throwable th2) {
            if (r10 != 0) {
                h0 h0VarG = o7.g();
                this.f9911a = th2;
                this.f9913c = r10;
                this.f9912b = 2;
                Integer numA = h0VarG.a();
                if (numA == aVar) {
                    return aVar;
                }
                r8 = r10;
                th = th2;
                obj = numA;
            } else {
                ?? r11 = r10;
                th = th2;
                iIntValue = this.f9915e;
                r7 = r11 == true ? 1 : 0;
            }
            b0 b0Var2 = new b0(th, iIntValue);
            r9 = r7;
            i0Var = b0Var2;
            return new p044f6.d(i0Var, Boolean.valueOf((boolean) r9));
        }
        return new p044f6.d(i0Var, Boolean.valueOf((boolean) r9));
    }
}
