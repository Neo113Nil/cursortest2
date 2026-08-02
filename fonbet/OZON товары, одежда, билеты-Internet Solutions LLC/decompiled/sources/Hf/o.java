package Hf;

/* loaded from: classes6.dex */
public final class o extends u {

    /* renamed from: f, reason: collision with root package name */
    private String f10917f;

    /* renamed from: g, reason: collision with root package name */
    private String f10918g;

    public o() {
    }

    @Override // Hf.u
    public final void a(B b11) {
        b11.D(this);
    }

    @Override // Hf.u
    protected final String k() {
        return "destination=" + this.f10917f + ", title=" + this.f10918g;
    }

    public final String m() {
        return this.f10917f;
    }

    public o(String str, String str2) {
        this.f10917f = str;
        this.f10918g = str2;
    }
}
