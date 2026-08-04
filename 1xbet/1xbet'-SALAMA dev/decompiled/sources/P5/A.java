package P5;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f5591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b7, p065i6.d dVar) {
        super(dVar);
        this.f5591c = b7;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f5589a = obj;
        this.f5590b |= Integer.MIN_VALUE;
        return this.f5591c.c(null, this);
    }
}
