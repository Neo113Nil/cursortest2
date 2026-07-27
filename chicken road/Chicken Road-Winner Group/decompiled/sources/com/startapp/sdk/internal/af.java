package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class af extends hf {

    /* renamed from: a, reason: collision with root package name */
    public final e9 f3460a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3461b;

    public af(e9 e9Var, String str) {
        this.f3460a = e9Var;
        this.f3461b = str;
    }

    @Override // com.startapp.sdk.internal.hf
    public final boolean a(Object obj) {
        if (obj instanceof u9) {
            e9 e9Var = this.f3460a;
            d9 d9Var = ((u9) obj).n0;
            if (e9Var == d9Var.f3571a) {
                String str = this.f3461b;
                return str == null || str.equals(d9Var.f3574d);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && af.class == obj.getClass()) {
            af afVar = (af) obj;
            if (si.a(this.f3460a, afVar.f3460a) && si.a((Object) this.f3461b, (Object) afVar.f3461b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f3460a, this.f3461b};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }
}
