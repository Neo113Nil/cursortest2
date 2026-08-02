package androidx.core.hardware.fingerprint;

import android.hardware.fingerprint.FingerprintManager;
import androidx.core.hardware.fingerprint.b;

/* loaded from: classes8.dex */
final class a extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b.AbstractC0770b f42172a;

    a(b.AbstractC0770b abstractC0770b) {
        this.f42172a = abstractC0770b;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i11, CharSequence charSequence) {
        this.f42172a.a(i11, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        this.f42172a.b();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i11, CharSequence charSequence) {
        this.f42172a.c(charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        this.f42172a.d(new b.c(b.a.f(b.a.b(authenticationResult))));
    }
}
