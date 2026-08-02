package io.flutter.view;

import android.view.View;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final View f14344a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14345b;

    public m(View view, int i7) {
        this.f14344a = view;
        this.f14345b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f14345b == mVar.f14345b && this.f14344a.equals(mVar.f14344a);
    }

    public final int hashCode() {
        return ((this.f14344a.hashCode() + 31) * 31) + this.f14345b;
    }
}
