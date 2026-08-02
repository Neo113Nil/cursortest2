package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class TF {

    /* renamed from: a, reason: collision with root package name */
    public final String f11642a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11643b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11644c;

    public TF(String str, boolean z3, boolean z5) {
        this.f11642a = str;
        this.f11643b = z3;
        this.f11644c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != TF.class) {
            return false;
        }
        TF tf = (TF) obj;
        return TextUtils.equals(this.f11642a, tf.f11642a) && this.f11643b == tf.f11643b && this.f11644c == tf.f11644c;
    }

    public final int hashCode() {
        return ((((this.f11642a.hashCode() + 31) * 31) + (true != this.f11643b ? 1237 : 1231)) * 31) + (true != this.f11644c ? 1237 : 1231);
    }
}
