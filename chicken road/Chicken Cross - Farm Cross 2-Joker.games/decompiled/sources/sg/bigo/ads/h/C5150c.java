package sg.bigo.ads.h;

/* renamed from: sg.bigo.ads.h.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5150c extends sg.bigo.ads.K0.E {
    public final /* synthetic */ AbstractC5204s i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5150c(AbstractC5204s abstractC5204s, long j) {
        super(j, 1000L);
        this.i = abstractC5204s;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        AbstractC5204s abstractC5204s = this.i;
        abstractC5204s.a(abstractC5204s.S, new RunnableC5146b(this));
    }
}
