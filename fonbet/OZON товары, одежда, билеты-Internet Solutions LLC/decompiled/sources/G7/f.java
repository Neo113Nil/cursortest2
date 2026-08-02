package G7;

import G7.d;

/* loaded from: classes9.dex */
final class f extends d.a {

    /* renamed from: a, reason: collision with root package name */
    private String f9733a;

    /* renamed from: b, reason: collision with root package name */
    private Long f9734b;

    @Override // G7.d.a
    public final d a() {
        String str = this.f9733a;
        if (str != null) {
            return new g(str, this.f9734b);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    @Override // G7.d.a
    public final d.a b(long j11) {
        this.f9734b = Long.valueOf(j11);
        return this;
    }

    @Override // G7.d.a
    public final d.a c(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f9733a = str;
        return this;
    }
}
