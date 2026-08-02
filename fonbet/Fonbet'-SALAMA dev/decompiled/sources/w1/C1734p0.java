package w1;

/* renamed from: w1.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1734p0 extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17819c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1743s0 f17820d;

    public C1734p0(C1743s0 c1743s0, int i7, String str, String str2) {
        this.f17820d = c1743s0;
        this.f17817a = i7;
        this.f17818b = str;
        this.f17819c = str2;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        C1743s0 c1743s0 = this.f17820d;
        if (c1743s0.f17853B != null) {
            if (this.f17817a == 200) {
                C1756w1.j(true);
            } else {
                C1756w1.j(false);
            }
        }
        com.google.android.gms.common.internal.w wVar = c1743s0.f17855D;
        String str = this.f17818b;
        wVar.r(str, this.f17819c);
        c1743s0.f17854C.remove(str);
    }
}
