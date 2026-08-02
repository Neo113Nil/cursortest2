package com.facetec.sdk;

/* loaded from: classes8.dex */
class dn extends android.widget.RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f3515a;

    public dn(android.content.Context context) {
        super(context);
        this.f3515a = c();
    }

    public dn(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3515a = c();
    }

    public void setXFraction(float f) {
        int i = this.f3515a;
        setX(i > 0 ? f * i : -9999.0f);
    }

    private static int c() {
        return (int) (com.facetec.sdk.dp.b().width * com.facetec.sdk.dm.b());
    }
}
