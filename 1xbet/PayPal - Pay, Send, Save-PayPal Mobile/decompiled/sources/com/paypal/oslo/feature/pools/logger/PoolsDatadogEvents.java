package com.paypal.oslo.feature.pools.logger;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pools/logger/PoolsDatadogEvents;", "", "<init>", "()V", "", "GET_POOLS_REQUEST_TRIGGERED", "Ljava/lang/String;", "GET_POOLS_RESPONSE_COMPLETE_USER_HAS_POOLS", "GET_POOLS_WILL_START_POOLING", "LIST_POOLS_SCREEN_CREATED_LIST_DISPLAYED", "GET_POOLS_RESPONSE_NETWORK_ERROR", "GET_POOLS_RESPONSE_PARSE_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolsDatadogEvents {
    public static final int $stable = 0;
    public static final java.lang.String GET_POOLS_REQUEST_TRIGGERED = "GetPools Request, triggered";
    public static final java.lang.String GET_POOLS_RESPONSE_COMPLETE_USER_HAS_POOLS = "GetPools Response, user has pools";
    public static final java.lang.String GET_POOLS_RESPONSE_NETWORK_ERROR = "GetPools Response, network error";
    public static final java.lang.String GET_POOLS_RESPONSE_PARSE_ERROR = "GetPools Response, parse error";
    public static final java.lang.String GET_POOLS_WILL_START_POOLING = "GetPools Response, user will start pooling";
    public static final com.paypal.oslo.feature.pools.logger.PoolsDatadogEvents INSTANCE = new com.paypal.oslo.feature.pools.logger.PoolsDatadogEvents();
    public static final java.lang.String LIST_POOLS_SCREEN_CREATED_LIST_DISPLAYED = "ListPools Screen, created list displayed";

    private PoolsDatadogEvents() {
    }
}
