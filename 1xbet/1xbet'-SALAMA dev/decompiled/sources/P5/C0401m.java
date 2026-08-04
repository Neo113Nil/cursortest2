package P5;

/* JADX INFO: renamed from: P5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0401m extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0402n f5667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0401m(C0402n c0402n, p065i6.d dVar) {
        super(dVar);
        this.f5667c = c0402n;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f5665a = obj;
        this.f5666b |= Integer.MIN_VALUE;
        return this.f5667c.c(null, this);
    }
}
