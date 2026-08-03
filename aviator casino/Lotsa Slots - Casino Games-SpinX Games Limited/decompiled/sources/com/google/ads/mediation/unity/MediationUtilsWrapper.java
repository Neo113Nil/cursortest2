package com.google.ads.mediation.unity;

/* compiled from: MediationUtilsWrapper.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¨\u0006\u000b"}, d2 = {"Lcom/google/ads/mediation/unity/MediationUtilsWrapper;", "", "<init>", "()V", "findClosestSize", "Lcom/google/android/gms/ads/AdSize;", "context", "Landroid/content/Context;", com.ironsource.X3.i.O, "potentials", "", "unity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediationUtilsWrapper {
    public final com.google.android.gms.ads.AdSize findClosestSize(android.content.Context context, com.google.android.gms.ads.AdSize adSize, java.util.List<com.google.android.gms.ads.AdSize> potentials) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(potentials, "potentials");
        return com.google.android.gms.ads.MediationUtils.findClosestSize(context, adSize, potentials);
    }
}
