package com.apollographql.apollo.api.http;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Get", "Post"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpMethod {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.apollographql.apollo.api.http.HttpMethod Get;
    public static final com.apollographql.apollo.api.http.HttpMethod Post;
    private static final /* synthetic */ com.apollographql.apollo.api.http.HttpMethod[] getHighResolutionOutputSizeshNQ4ISI;

    private HttpMethod(java.lang.String str, int i) {
    }

    static {
        com.apollographql.apollo.api.http.HttpMethod httpMethod = new com.apollographql.apollo.api.http.HttpMethod("Get", 0);
        Get = httpMethod;
        com.apollographql.apollo.api.http.HttpMethod httpMethod2 = new com.apollographql.apollo.api.http.HttpMethod("Post", 1);
        Post = httpMethod2;
        com.apollographql.apollo.api.http.HttpMethod[] httpMethodArr = {httpMethod, httpMethod2};
        getHighResolutionOutputSizeshNQ4ISI = httpMethodArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(httpMethodArr);
    }

    public static com.apollographql.apollo.api.http.HttpMethod valueOf(java.lang.String str) {
        return (com.apollographql.apollo.api.http.HttpMethod) java.lang.Enum.valueOf(com.apollographql.apollo.api.http.HttpMethod.class, str);
    }

    public static com.apollographql.apollo.api.http.HttpMethod[] values() {
        return (com.apollographql.apollo.api.http.HttpMethod[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.enums.EnumEntries<com.apollographql.apollo.api.http.HttpMethod> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
