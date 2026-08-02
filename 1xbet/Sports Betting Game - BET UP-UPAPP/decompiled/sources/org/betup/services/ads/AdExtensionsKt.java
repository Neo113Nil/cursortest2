package org.betup.services.ads;

import com.google.android.libraries.ads.mobile.sdk.common.Ad;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"mediationAdapterClassName", "", "Lcom/google/android/libraries/ads/mobile/sdk/common/Ad;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdExtensionsKt {
    public static final String mediationAdapterClassName(Ad ad) {
        Intrinsics.checkNotNullParameter(ad, "<this>");
        return ad.getResponseInfo().getAdapterClassName();
    }
}
