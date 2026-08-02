package b1;

/* loaded from: classes.dex */
public final class j extends AbstractC0507h {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f7211r;

    public j(k kVar) {
        this.f7211r = kVar;
    }

    @Override // b1.AbstractC0507h
    public final String g() {
        C0508i c0508i = (C0508i) this.f7211r.f7212k.get();
        if (c0508i == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c0508i.f7207a + "]";
    }
}
