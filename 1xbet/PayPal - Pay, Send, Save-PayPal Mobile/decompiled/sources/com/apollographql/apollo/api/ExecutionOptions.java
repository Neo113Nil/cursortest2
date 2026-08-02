package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionOptions;", "", "Lcom/apollographql/apollo/api/ExecutionContext;", "getExecutionContext", "()Lcom/apollographql/apollo/api/ExecutionContext;", "executionContext", "Lcom/apollographql/apollo/api/http/HttpMethod;", "getHttpMethod", "()Lcom/apollographql/apollo/api/http/HttpMethod;", "httpMethod", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "getHttpHeaders", "()Ljava/util/List;", "httpHeaders", "", "getSendApqExtensions", "()Ljava/lang/Boolean;", "sendApqExtensions", "getSendDocument", "sendDocument", "getEnableAutoPersistedQueries", "enableAutoPersistedQueries", "getCanBeBatched", "canBeBatched", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ExecutionOptions {
    public static final java.lang.String CAN_BE_BATCHED = "X-APOLLO-CAN-BE-BATCHED";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.api.ExecutionOptions.Companion INSTANCE = com.apollographql.apollo.api.ExecutionOptions.Companion.getHighSpeedVideoFpsRangesFor;

    java.lang.Boolean getCanBeBatched();

    java.lang.Boolean getEnableAutoPersistedQueries();

    com.apollographql.apollo.api.ExecutionContext getExecutionContext();

    java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHttpHeaders();

    com.apollographql.apollo.api.http.HttpMethod getHttpMethod();

    java.lang.Boolean getSendApqExtensions();

    java.lang.Boolean getSendDocument();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/apollographql/apollo/api/ExecutionOptions$Companion;", "", "<init>", "()V", "", "CAN_BE_BATCHED", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final java.lang.String CAN_BE_BATCHED = "X-APOLLO-CAN-BE-BATCHED";
        static final /* synthetic */ com.apollographql.apollo.api.ExecutionOptions.Companion getHighSpeedVideoFpsRangesFor = new com.apollographql.apollo.api.ExecutionOptions.Companion();

        private Companion() {
        }
    }
}
