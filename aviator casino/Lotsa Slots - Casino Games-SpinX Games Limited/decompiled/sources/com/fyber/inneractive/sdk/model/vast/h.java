package com.fyber.inneractive.sdk.model.vast;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Integer f3804a;
    public java.lang.Integer b;
    public java.lang.String c;
    public com.fyber.inneractive.sdk.model.vast.l d;
    public java.lang.String e;
    public java.lang.String f;
    public java.lang.String g;
    public com.fyber.inneractive.sdk.flow.vast.b i;
    public final java.util.ArrayList h = new java.util.ArrayList();
    public final java.util.ArrayList j = new java.util.ArrayList();

    public final boolean a() {
        return (android.text.TextUtils.isEmpty(this.f) && android.text.TextUtils.isEmpty(this.e) && this.d == null) ? false : true;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Companion:  w:");
        sb.append(this.f3804a);
        sb.append(" h:");
        sb.append(this.b);
        sb.append(" ctr:");
        sb.append(this.g);
        sb.append(" clt:");
        sb.append(this.h);
        if (!android.text.TextUtils.isEmpty(this.f)) {
            sb.append(" html:");
            sb.append(this.f);
        }
        if (this.d != null) {
            sb.append(" static:");
            sb.append(this.d.b);
            sb.append("creative:");
            sb.append(this.d.f3806a);
        }
        if (!android.text.TextUtils.isEmpty(this.e)) {
            sb.append(" iframe:");
            sb.append(this.e);
        }
        sb.append(" events:");
        sb.append(this.j);
        if (this.i != null) {
            sb.append(" reason:");
            sb.append(this.i.f3760a);
            sb.append(" exception:");
            sb.append(this.i.getMessage());
        }
        return sb.toString();
    }
}
