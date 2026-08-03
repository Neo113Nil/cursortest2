package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public interface UnderlyingNetworkTask {
    java.lang.String description();

    io.appmetrica.analytics.networktasks.internal.FullUrlFormer<?> getFullUrlFormer();

    io.appmetrica.analytics.networktasks.internal.RequestDataHolder getRequestDataHolder();

    io.appmetrica.analytics.networktasks.internal.ResponseDataHolder getResponseDataHolder();

    io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig getRetryPolicyConfig();

    javax.net.ssl.SSLSocketFactory getSslSocketFactory();

    boolean onCreateTask();

    void onPerformRequest();

    void onPostRequestComplete(boolean z2);

    boolean onRequestComplete();

    void onRequestError(java.lang.Throwable th);

    void onShouldNotExecute();

    void onSuccessfulTaskFinished();

    void onTaskAdded();

    void onTaskFinished();

    void onTaskRemoved();

    void onUnsuccessfulTaskFinished();
}
