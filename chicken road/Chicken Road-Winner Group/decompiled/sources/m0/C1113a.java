package m0;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1113a {

    /* renamed from: a, reason: collision with root package name */
    public String f10005a;

    /* renamed from: b, reason: collision with root package name */
    public String f10006b;

    public C1130s a() {
        if ("first_party".equals(this.f10006b)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.f10005a == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (this.f10006b != null) {
            return new C1130s(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }
}
