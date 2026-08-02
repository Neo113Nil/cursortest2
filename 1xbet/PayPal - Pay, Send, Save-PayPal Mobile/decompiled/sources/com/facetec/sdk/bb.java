package com.facetec.sdk;

/* loaded from: classes8.dex */
class bb extends android.widget.TextView {
    private boolean e;

    public bb(android.content.Context context) {
        super(context);
        this.e = false;
        c();
    }

    public bb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        c();
    }

    public bb(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        c();
    }

    private void c() {
        if (this.e) {
            return;
        }
        this.e = true;
        setIncludeFontPadding(com.facetec.sdk.ay.e(com.facetec.sdk.as.d));
    }
}
