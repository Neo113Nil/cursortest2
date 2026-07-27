package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final View f9459a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9460b;

    public n(View view, int i3) {
        this.f9459a = view;
        this.f9460b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f9460b == nVar.f9460b && this.f9459a.equals(nVar.f9459a);
    }

    public final int hashCode() {
        return ((this.f9459a.hashCode() + 31) * 31) + this.f9460b;
    }
}
