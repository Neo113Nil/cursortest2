package q;

import android.os.Bundle;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1541a implements InterfaceC1542b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15714a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15715b;

    public C1541a(boolean z4, int i7) {
        this.f15714a = z4;
        this.f15715b = i7;
    }

    @Override // q.InterfaceC1542b
    public final Bundle q() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
        bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f15714a);
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.f15715b);
        return bundle;
    }
}
