package p116q;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15721b;

    public a(boolean z4, int i7) {
        this.f15720a = z4;
        this.f15721b = i7;
    }

    @Override // p116q.b
    public final Bundle q() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
        bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f15720a);
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.f15721b);
        return bundle;
    }
}
