package androidx.webkit;

import androidx.annotation.RestrictTo;

/* loaded from: classes3.dex */
public abstract class SafeBrowsingResponseCompat {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public SafeBrowsingResponseCompat() {
    }

    public abstract void backToSafety(boolean z);

    public abstract void proceed(boolean z);

    public abstract void showInterstitial(boolean z);
}
