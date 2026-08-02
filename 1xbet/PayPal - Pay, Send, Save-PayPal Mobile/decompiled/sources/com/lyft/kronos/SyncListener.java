package com.lyft.kronos;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/lyft/kronos/SyncListener;", "", "", com.datadog.android.log.LogAttributes.HOST, "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "onError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "onStartSync", "(Ljava/lang/String;)V", "", "ticksDelta", "responseTimeMs", "onSuccess", "(JJ)V"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public interface SyncListener {
    void onError(java.lang.String host, java.lang.Throwable throwable);

    void onStartSync(java.lang.String host);

    void onSuccess(long ticksDelta, long responseTimeMs);
}
