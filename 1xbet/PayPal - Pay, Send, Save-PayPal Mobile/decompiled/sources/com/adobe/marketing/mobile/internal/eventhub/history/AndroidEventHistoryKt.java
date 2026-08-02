package com.adobe.marketing.mobile.internal.eventhub.history;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidEventHistoryKt {
    public static final /* synthetic */ long access$adjustedFromDate(com.adobe.marketing.mobile.EventHistoryRequest eventHistoryRequest, java.lang.Long l) {
        if (l == null) {
            return eventHistoryRequest.getFromDate();
        }
        return java.lang.Math.max(l.longValue(), eventHistoryRequest.getFromDate());
    }

    public static final /* synthetic */ long access$getAdjustedToDate(com.adobe.marketing.mobile.EventHistoryRequest eventHistoryRequest) {
        return eventHistoryRequest.getToDate() == 0 ? java.lang.System.currentTimeMillis() : eventHistoryRequest.getToDate();
    }
}
