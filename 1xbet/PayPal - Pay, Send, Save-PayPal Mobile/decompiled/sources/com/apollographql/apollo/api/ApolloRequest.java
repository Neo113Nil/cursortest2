package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001KB\u0093\u0001\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\b\b\u0001\u0010\u001e*\u00020\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u001c\u0010 R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0007¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00060\u0006j\u0002`\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00100\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u00010\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u00010\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u001c\u0010:\u001a\u0004\u0018\u00010\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107R\u001c\u0010<\u001a\u0004\u0018\u00010\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u00107R\u001c\u0010>\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b?\u00107R\u001f\u0010@\u001a\u0004\u0018\u00010\u00108\u0007¢\u0006\u0012\n\u0004\b@\u00105\u0012\u0004\bB\u0010C\u001a\u0004\bA\u00107R\u001f\u0010D\u001a\u0004\u0018\u00010\u00108\u0007¢\u0006\u0012\n\u0004\bD\u00105\u0012\u0004\bF\u0010C\u001a\u0004\bE\u00107R\u001a\u0010G\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J"}, d2 = {"Lcom/apollographql/apollo/api/ApolloRequest;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ExecutionOptions;", "Lcom/apollographql/apollo/api/Operation;", "p0", "Ljava/util/UUID;", "Lcom/benasher44/uuid/getHighSpeedVideoFpsRangesFor;", "p1", "Lcom/apollographql/apollo/api/ExecutionContext;", "p2", "Lcom/apollographql/apollo/api/http/HttpMethod;", "p3", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "p4", "", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "<init>", "(Lcom/apollographql/apollo/api/Operation;Ljava/util/UUID;Lcom/apollographql/apollo/api/ExecutionContext;Lcom/apollographql/apollo/api/http/HttpMethod;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V", "Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "newBuilder", "()Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "E", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "(Lcom/apollographql/apollo/api/Operation;)Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "Lcom/apollographql/apollo/api/Operation;", "getOperation", "()Lcom/apollographql/apollo/api/Operation;", "requestUuid", "Ljava/util/UUID;", "getRequestUuid", "()Ljava/util/UUID;", "executionContext", "Lcom/apollographql/apollo/api/ExecutionContext;", "getExecutionContext", "()Lcom/apollographql/apollo/api/ExecutionContext;", "httpMethod", "Lcom/apollographql/apollo/api/http/HttpMethod;", "getHttpMethod", "()Lcom/apollographql/apollo/api/http/HttpMethod;", "httpHeaders", "Ljava/util/List;", "getHttpHeaders", "()Ljava/util/List;", "sendApqExtensions", "Ljava/lang/Boolean;", "getSendApqExtensions", "()Ljava/lang/Boolean;", "sendDocument", "getSendDocument", "enableAutoPersistedQueries", "getEnableAutoPersistedQueries", "canBeBatched", "getCanBeBatched", "ignoreApolloClientHttpHeaders", "getIgnoreApolloClientHttpHeaders", "retryOnError", "getRetryOnError", "getRetryOnError$annotations", "()V", "failFastIfOffline", "getFailFastIfOffline", "getFailFastIfOffline$annotations", "sendEnhancedClientAwareness", "Z", "getSendEnhancedClientAwareness", "()Z", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloRequest<D extends com.apollographql.apollo.api.Operation.Data> implements com.apollographql.apollo.api.ExecutionOptions {
    private final java.lang.Boolean canBeBatched;
    private final java.lang.Boolean enableAutoPersistedQueries;
    private final com.apollographql.apollo.api.ExecutionContext executionContext;
    private final java.lang.Boolean failFastIfOffline;
    private final java.util.List<com.apollographql.apollo.api.http.HttpHeader> httpHeaders;
    private final com.apollographql.apollo.api.http.HttpMethod httpMethod;
    private final java.lang.Boolean ignoreApolloClientHttpHeaders;
    private final com.apollographql.apollo.api.Operation<D> operation;
    private final java.util.UUID requestUuid;
    private final java.lang.Boolean retryOnError;
    private final java.lang.Boolean sendApqExtensions;
    private final java.lang.Boolean sendDocument;
    private final boolean sendEnhancedClientAwareness;

    public static /* synthetic */ void getFailFastIfOffline$annotations() {
    }

    public static /* synthetic */ void getRetryOnError$annotations() {
    }

    private ApolloRequest(com.apollographql.apollo.api.Operation<D> operation, java.util.UUID uuid, com.apollographql.apollo.api.ExecutionContext executionContext, com.apollographql.apollo.api.http.HttpMethod httpMethod, java.util.List<com.apollographql.apollo.api.http.HttpHeader> list, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Boolean bool5, java.lang.Boolean bool6, java.lang.Boolean bool7, boolean z) {
        this.operation = operation;
        this.requestUuid = uuid;
        this.executionContext = executionContext;
        this.httpMethod = httpMethod;
        this.httpHeaders = list;
        this.sendApqExtensions = bool;
        this.sendDocument = bool2;
        this.enableAutoPersistedQueries = bool3;
        this.canBeBatched = bool4;
        this.ignoreApolloClientHttpHeaders = bool5;
        this.retryOnError = bool6;
        this.failFastIfOffline = bool7;
        this.sendEnhancedClientAwareness = z;
    }

    public final com.apollographql.apollo.api.Operation<D> getOperation() {
        return this.operation;
    }

    public final java.util.UUID getRequestUuid() {
        return this.requestUuid;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final com.apollographql.apollo.api.ExecutionContext getExecutionContext() {
        return this.executionContext;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final com.apollographql.apollo.api.http.HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHttpHeaders() {
        return this.httpHeaders;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final java.lang.Boolean getSendApqExtensions() {
        return this.sendApqExtensions;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final java.lang.Boolean getSendDocument() {
        return this.sendDocument;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final java.lang.Boolean getEnableAutoPersistedQueries() {
        return this.enableAutoPersistedQueries;
    }

    @Override // com.apollographql.apollo.api.ExecutionOptions
    public final java.lang.Boolean getCanBeBatched() {
        return this.canBeBatched;
    }

    public final java.lang.Boolean getIgnoreApolloClientHttpHeaders() {
        return this.ignoreApolloClientHttpHeaders;
    }

    public final java.lang.Boolean getRetryOnError() {
        return this.retryOnError;
    }

    public final java.lang.Boolean getFailFastIfOffline() {
        return this.failFastIfOffline;
    }

    public final boolean getSendEnhancedClientAwareness() {
        return this.sendEnhancedClientAwareness;
    }

    public final com.apollographql.apollo.api.ApolloRequest.Builder<D> newBuilder() {
        return (com.apollographql.apollo.api.ApolloRequest.Builder<D>) newBuilder(this.operation);
    }

    public final <E extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloRequest.Builder<E> newBuilder(com.apollographql.apollo.api.Operation<E> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        return new com.apollographql.apollo.api.ApolloRequest.Builder(operation).requestUuid(this.requestUuid).executionContext(getExecutionContext()).httpMethod(getHttpMethod()).httpHeaders(getHttpHeaders()).sendApqExtensions(getSendApqExtensions()).sendDocument(getSendDocument()).enableAutoPersistedQueries(getEnableAutoPersistedQueries()).canBeBatched(getCanBeBatched()).retryOnError(this.retryOnError).failFastIfOffline(this.failFastIfOffline).ignoreApolloClientHttpHeaders(this.ignoreApolloClientHttpHeaders).sendEnhancedClientAwareness(this.sendEnhancedClientAwareness);
    }

    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b!\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b \u0010\u0012J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b!\u0010\u0012J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\"\u0010\u0012J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b#\u0010\u0012J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b$\u0010\u0012J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'¢\u0006\u0004\b(\u0010)R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R4\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u000e\u0010-\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R$\u0010\r\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010-\u001a\u0004\u0018\u00010\u00138\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106R4\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b\u0018\u00107\u001a\u0004\b8\u00109R(\u0010!\u001a\u0004\u0018\u00010\u00102\b\u0010-\u001a\u0004\u0018\u00010\u00108\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b!\u0010:\u001a\u0004\b;\u0010<R(\u0010\u001f\u001a\u0004\u0018\u00010\u00102\b\u0010-\u001a\u0004\u0018\u00010\u00108\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b=\u0010<R(\u0010 \u001a\u0004\u0018\u00010\u00102\b\u0010-\u001a\u0004\u0018\u00010\u00108\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b \u0010:\u001a\u0004\b>\u0010<R(\u0010\"\u001a\u0004\u0018\u00010\u00102\b\u0010-\u001a\u0004\u0018\u00010\u00108\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b\"\u0010:\u001a\u0004\b?\u0010<R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010-\u001a\u0004\u0018\u00010\u00108\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b@\u0010<R.\u0010#\u001a\u0004\u0018\u00010\u00102\b\u0010-\u001a\u0004\u0018\u00010\u00108\u0007@BX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010:\u0012\u0004\bB\u0010C\u001a\u0004\bA\u0010<R.\u0010$\u001a\u0004\u0018\u00010\u00102\b\u0010-\u001a\u0004\u0018\u00010\u00108\u0007@BX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010:\u0012\u0004\bE\u0010C\u001a\u0004\bD\u0010<R$\u0010%\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00108\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b%\u0010F\u001a\u0004\bG\u0010H"}, d2 = {"Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/MutableExecutionOptions;", "Lcom/apollographql/apollo/api/Operation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "<init>", "(Lcom/apollographql/apollo/api/Operation;)V", "Ljava/util/UUID;", "Lcom/benasher44/uuid/getHighSpeedVideoFpsRangesFor;", "requestUuid", "(Ljava/util/UUID;)Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "Lcom/apollographql/apollo/api/ExecutionContext;", "executionContext", "(Lcom/apollographql/apollo/api/ExecutionContext;)Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "addExecutionContext", "", "ignoreApolloClientHttpHeaders", "(Ljava/lang/Boolean;)Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "Lcom/apollographql/apollo/api/http/HttpMethod;", "httpMethod", "(Lcom/apollographql/apollo/api/http/HttpMethod;)Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "httpHeaders", "(Ljava/util/List;)Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addHttpHeader", "(Ljava/lang/String;Ljava/lang/String;)Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "sendApqExtensions", "sendDocument", "enableAutoPersistedQueries", "canBeBatched", "retryOnError", "failFastIfOffline", "sendEnhancedClientAwareness", "(Z)Lcom/apollographql/apollo/api/ApolloRequest$Builder;", "Lcom/apollographql/apollo/api/ApolloRequest;", "build", "()Lcom/apollographql/apollo/api/ApolloRequest;", "Lcom/apollographql/apollo/api/Operation;", "getOperation", "()Lcom/apollographql/apollo/api/Operation;", "p0", "Ljava/util/UUID;", "getRequestUuid", "()Ljava/util/UUID;", "Lcom/apollographql/apollo/api/ExecutionContext;", "getExecutionContext", "()Lcom/apollographql/apollo/api/ExecutionContext;", "Lcom/apollographql/apollo/api/http/HttpMethod;", "getHttpMethod", "()Lcom/apollographql/apollo/api/http/HttpMethod;", "Ljava/util/List;", "getHttpHeaders", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getEnableAutoPersistedQueries", "()Ljava/lang/Boolean;", "getSendApqExtensions", "getSendDocument", "getCanBeBatched", "getIgnoreApolloClientHttpHeaders", "getRetryOnError", "getRetryOnError$annotations", "()V", "getFailFastIfOffline", "getFailFastIfOffline$annotations", "Z", "getSendEnhancedClientAwareness", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder<D extends com.apollographql.apollo.api.Operation.Data> implements com.apollographql.apollo.api.MutableExecutionOptions<com.apollographql.apollo.api.ApolloRequest.Builder<D>> {
        private java.lang.Boolean canBeBatched;
        private java.lang.Boolean enableAutoPersistedQueries;
        private com.apollographql.apollo.api.ExecutionContext executionContext;
        private java.lang.Boolean failFastIfOffline;
        private java.util.List<com.apollographql.apollo.api.http.HttpHeader> httpHeaders;
        private com.apollographql.apollo.api.http.HttpMethod httpMethod;
        private java.lang.Boolean ignoreApolloClientHttpHeaders;
        private final com.apollographql.apollo.api.Operation<D> operation;
        private java.util.UUID requestUuid;
        private java.lang.Boolean retryOnError;
        private java.lang.Boolean sendApqExtensions;
        private java.lang.Boolean sendDocument;
        private boolean sendEnhancedClientAwareness;

        public static /* synthetic */ void getFailFastIfOffline$annotations() {
        }

        public static /* synthetic */ void getRetryOnError$annotations() {
        }

        public Builder(com.apollographql.apollo.api.Operation<D> operation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
            this.operation = operation;
            this.executionContext = com.apollographql.apollo.api.ExecutionContext.Empty;
            this.sendEnhancedClientAwareness = true;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public final /* bridge */ /* synthetic */ java.lang.Object httpHeaders(java.util.List list) {
            return httpHeaders((java.util.List<com.apollographql.apollo.api.http.HttpHeader>) list);
        }

        public final com.apollographql.apollo.api.Operation<D> getOperation() {
            return this.operation;
        }

        public final java.util.UUID getRequestUuid() {
            return this.requestUuid;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public final com.apollographql.apollo.api.ExecutionContext getExecutionContext() {
            return this.executionContext;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public final com.apollographql.apollo.api.http.HttpMethod getHttpMethod() {
            return this.httpMethod;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHttpHeaders() {
            return this.httpHeaders;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public final java.lang.Boolean getEnableAutoPersistedQueries() {
            return this.enableAutoPersistedQueries;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public final java.lang.Boolean getSendApqExtensions() {
            return this.sendApqExtensions;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public final java.lang.Boolean getSendDocument() {
            return this.sendDocument;
        }

        @Override // com.apollographql.apollo.api.ExecutionOptions
        public final java.lang.Boolean getCanBeBatched() {
            return this.canBeBatched;
        }

        public final java.lang.Boolean getIgnoreApolloClientHttpHeaders() {
            return this.ignoreApolloClientHttpHeaders;
        }

        public final java.lang.Boolean getRetryOnError() {
            return this.retryOnError;
        }

        public final java.lang.Boolean getFailFastIfOffline() {
            return this.failFastIfOffline;
        }

        public final boolean getSendEnhancedClientAwareness() {
            return this.sendEnhancedClientAwareness;
        }

        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> requestUuid(java.util.UUID requestUuid) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestUuid, "");
            this.requestUuid = requestUuid;
            return this;
        }

        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> executionContext(com.apollographql.apollo.api.ExecutionContext executionContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionContext, "");
            this.executionContext = executionContext;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> addExecutionContext(com.apollographql.apollo.api.ExecutionContext executionContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionContext, "");
            this.executionContext = getExecutionContext().plus(executionContext);
            return this;
        }

        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> ignoreApolloClientHttpHeaders(java.lang.Boolean ignoreApolloClientHttpHeaders) {
            this.ignoreApolloClientHttpHeaders = ignoreApolloClientHttpHeaders;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> httpMethod(com.apollographql.apollo.api.http.HttpMethod httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> httpHeaders(java.util.List<com.apollographql.apollo.api.http.HttpHeader> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> addHttpHeader(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.List<com.apollographql.apollo.api.http.HttpHeader> httpHeaders = getHttpHeaders();
            if (httpHeaders == null) {
                httpHeaders = kotlin.collections.CollectionsKt.emptyList();
            }
            this.httpHeaders = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.apollographql.apollo.api.http.HttpHeader>) httpHeaders, new com.apollographql.apollo.api.http.HttpHeader(name2, value));
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> sendApqExtensions(java.lang.Boolean sendApqExtensions) {
            this.sendApqExtensions = sendApqExtensions;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> sendDocument(java.lang.Boolean sendDocument) {
            this.sendDocument = sendDocument;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> enableAutoPersistedQueries(java.lang.Boolean enableAutoPersistedQueries) {
            this.enableAutoPersistedQueries = enableAutoPersistedQueries;
            return this;
        }

        @Override // com.apollographql.apollo.api.MutableExecutionOptions
        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> canBeBatched(java.lang.Boolean canBeBatched) {
            this.canBeBatched = canBeBatched;
            return this;
        }

        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> retryOnError(java.lang.Boolean retryOnError) {
            this.retryOnError = retryOnError;
            return this;
        }

        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> failFastIfOffline(java.lang.Boolean failFastIfOffline) {
            this.failFastIfOffline = failFastIfOffline;
            return this;
        }

        public final com.apollographql.apollo.api.ApolloRequest.Builder<D> sendEnhancedClientAwareness(boolean sendEnhancedClientAwareness) {
            this.sendEnhancedClientAwareness = sendEnhancedClientAwareness;
            return this;
        }

        public final com.apollographql.apollo.api.ApolloRequest<D> build() {
            com.apollographql.apollo.api.Operation<D> operation = this.operation;
            java.util.UUID uuid = this.requestUuid;
            if (uuid == null) {
                uuid = java.util.UUID.randomUUID();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "");
            }
            return new com.apollographql.apollo.api.ApolloRequest<>(operation, uuid, getExecutionContext(), getHttpMethod(), getHttpHeaders(), getSendApqExtensions(), getSendDocument(), getEnableAutoPersistedQueries(), getCanBeBatched(), this.ignoreApolloClientHttpHeaders, this.retryOnError, this.failFastIfOffline, this.sendEnhancedClientAwareness, null);
        }
    }

    public /* synthetic */ ApolloRequest(com.apollographql.apollo.api.Operation operation, java.util.UUID uuid, com.apollographql.apollo.api.ExecutionContext executionContext, com.apollographql.apollo.api.http.HttpMethod httpMethod, java.util.List list, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Boolean bool5, java.lang.Boolean bool6, java.lang.Boolean bool7, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(operation, uuid, executionContext, httpMethod, list, bool, bool2, bool3, bool4, bool5, bool6, bool7, z);
    }
}
