package com.adobe.marketing.mobile.internal.eventhub.history;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/history/EventHistoryDatabase;", "", "", "hash", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(JJJ)I", "timestampMS", "", "insert", "(JJ)Z", "Lcom/adobe/marketing/mobile/EventHistoryResult;", "query", "(JJJ)Lcom/adobe/marketing/mobile/EventHistoryResult;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface EventHistoryDatabase {
    int delete(long hash, long from, long to);

    boolean insert(long hash, long timestampMS);

    com.adobe.marketing.mobile.EventHistoryResult query(long hash, long from, long to);
}
