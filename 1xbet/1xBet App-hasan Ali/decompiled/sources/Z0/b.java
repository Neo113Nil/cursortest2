package Z0;

import A0.RunnableC0049o;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final b f6259m = new b(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final b f6260n = new b(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final b f6261o = new b(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final b f6262p = new b(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6263l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i5) {
        super(i);
        this.f6263l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f6263l) {
            case 0:
                j jVar = (j) obj;
                jVar.getHandler().post(new RunnableC0049o(7, jVar.f6285A));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return W3.o.f6046a;
    }
}
