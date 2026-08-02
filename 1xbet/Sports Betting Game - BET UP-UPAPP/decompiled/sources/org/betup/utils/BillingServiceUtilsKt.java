package org.betup.utils;

import kotlin.Metadata;

/* compiled from: BillingServiceUtils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"isOfferExpired", "", "offerExpiration", "", "(Ljava/lang/Long;)Z", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BillingServiceUtilsKt {
    public static final boolean isOfferExpired(Long l) {
        if (l == null) {
            return true;
        }
        return l.longValue() - System.currentTimeMillis() <= 0;
    }
}
