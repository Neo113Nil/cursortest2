package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5458a;
    public Integer b;
    public String c;
    public l d;
    public String e;
    public String f;
    public String g;
    public com.fyber.inneractive.sdk.flow.vast.b i;
    public final ArrayList h = new ArrayList();
    public final ArrayList j = new ArrayList();

    public final boolean a() {
        return (TextUtils.isEmpty(this.f) && TextUtils.isEmpty(this.e) && this.d == null) ? false : true;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("Companion:  w:").append(this.f5458a).append(" h:").append(this.b).append(" ctr:").append(this.g).append(" clt:").append(this.h);
        if (!TextUtils.isEmpty(this.f)) {
            append.append(" html:").append(this.f);
        }
        if (this.d != null) {
            append.append(" static:").append(this.d.b).append("creative:").append(this.d.f5460a);
        }
        if (!TextUtils.isEmpty(this.e)) {
            append.append(" iframe:").append(this.e);
        }
        append.append(" events:").append(this.j);
        if (this.i != null) {
            append.append(" reason:").append(this.i.f5413a);
            append.append(" exception:").append(this.i.getMessage());
        }
        return append.toString();
    }
}
