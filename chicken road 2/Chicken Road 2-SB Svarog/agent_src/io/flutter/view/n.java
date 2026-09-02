package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final View f840a;

    /* renamed from: b, reason: collision with root package name */
    public final int f841b;

    public n(View view, int i2) {
        this.f840a = view;
        this.f841b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f841b == nVar.f841b && this.f840a.equals(nVar.f840a);
    }

    public final int hashCode() {
        return ((this.f840a.hashCode() + 31) * 31) + this.f841b;
    }
}
