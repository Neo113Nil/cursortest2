package Hf;

/* loaded from: classes6.dex */
public final class q extends u {

    /* renamed from: f, reason: collision with root package name */
    private String f10920f;

    /* renamed from: g, reason: collision with root package name */
    private String f10921g;

    public q() {
    }

    @Override // Hf.u
    public final void a(B b11) {
        b11.B(this);
    }

    @Override // Hf.u
    protected final String k() {
        return "destination=" + this.f10920f + ", title=" + this.f10921g;
    }

    public final String m() {
        return this.f10920f;
    }

    public q(String str, String str2) {
        this.f10920f = str;
        this.f10921g = str2;
    }
}
