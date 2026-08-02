package com.izettle.android.net;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/izettle/android/net/HttpMethod;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "GET", "POST", com.datadog.android.internal.network.HttpSpec.Method.PUT, com.datadog.android.internal.network.HttpSpec.Method.DELETE}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HttpMethod {
    public static final com.izettle.android.net.HttpMethod DELETE;
    public static final com.izettle.android.net.HttpMethod GET;
    public static final com.izettle.android.net.HttpMethod POST;
    public static final com.izettle.android.net.HttpMethod PUT;
    private static final /* synthetic */ com.izettle.android.net.HttpMethod[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private HttpMethod(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.izettle.android.net.HttpMethod httpMethod = new com.izettle.android.net.HttpMethod("GET", 0, "GET");
        GET = httpMethod;
        com.izettle.android.net.HttpMethod httpMethod2 = new com.izettle.android.net.HttpMethod("POST", 1, "POST");
        POST = httpMethod2;
        com.izettle.android.net.HttpMethod httpMethod3 = new com.izettle.android.net.HttpMethod(com.datadog.android.internal.network.HttpSpec.Method.PUT, 2, com.datadog.android.internal.network.HttpSpec.Method.PUT);
        PUT = httpMethod3;
        com.izettle.android.net.HttpMethod httpMethod4 = new com.izettle.android.net.HttpMethod(com.datadog.android.internal.network.HttpSpec.Method.DELETE, 3, com.datadog.android.internal.network.HttpSpec.Method.DELETE);
        DELETE = httpMethod4;
        com.izettle.android.net.HttpMethod[] httpMethodArr = {httpMethod, httpMethod2, httpMethod3, httpMethod4};
        getHighSpeedVideoFpsRanges = httpMethodArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(httpMethodArr);
    }

    public static com.izettle.android.net.HttpMethod[] values() {
        return (com.izettle.android.net.HttpMethod[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.izettle.android.net.HttpMethod valueOf(java.lang.String str) {
        return (com.izettle.android.net.HttpMethod) java.lang.Enum.valueOf(com.izettle.android.net.HttpMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.izettle.android.net.HttpMethod> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
