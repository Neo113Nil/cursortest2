package z;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1034a extends android.text.style.ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f8507a;

    /* renamed from: b, reason: collision with root package name */
    public final z.C1041h f8508b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8509c;

    public C1034a(int i2, z.C1041h c1041h, int i3) {
        this.f8507a = i2;
        this.f8508b = c1041h;
        this.f8509c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f8507a);
        this.f8508b.f8517a.performAction(this.f8509c, bundle);
    }
}
