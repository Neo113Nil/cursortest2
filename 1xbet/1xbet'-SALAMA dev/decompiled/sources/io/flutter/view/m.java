package io.flutter.view;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f14350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14351b;

    public m(View view, int i7) {
        this.f14350a = view;
        this.f14351b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f14351b == mVar.f14351b && this.f14350a.equals(mVar.f14350a);
    }

    public final int hashCode() {
        return ((this.f14350a.hashCode() + 31) * 31) + this.f14351b;
    }
}
