package w1;

/* loaded from: classes.dex */
public final class w2 extends C2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2(D1.a aVar, int i7) {
        super(aVar);
        this.f17914e = i7;
    }

    public static w2 c(long j, int i7, long j3, long j7) {
        return new w2(new y2(j, i7, j3, j7), 0);
    }

    @Override // w1.C2
    public final D2 a() {
        switch (this.f17914e) {
            case 0:
                return D2.SESSION_ID;
            default:
                return D2.SESSION_INFO;
        }
    }
}
