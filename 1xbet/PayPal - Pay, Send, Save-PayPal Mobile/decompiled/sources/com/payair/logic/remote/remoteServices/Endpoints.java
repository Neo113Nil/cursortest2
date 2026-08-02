package com.payair.logic.remote.remoteServices;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004"}, d2 = {"Lcom/payair/logic/remote/remoteServices/Endpoints;", "", "", "START_TOKENIZE", "Ljava/lang/String;", "COMPLETE_TOKENIZE", "AUTHENTICATION_CODE", "SEND_AUTHENTICATION_CODE", "GET_CSDK_CERTIFICATE", "DELETE_TOKEN", "GET_ASSET", "GET_ASSET_V2", "GET_HISTORY", "GET_HISTORY_WITH_TIMESTAMP", "START_TOKENIZE_ALL_CARDS"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Endpoints {
    public static final java.lang.String AUTHENTICATION_CODE = "/devices/%s/tokens/%s/authenticationMethod/";
    public static final java.lang.String COMPLETE_TOKENIZE = "/devices/%s/tokenizations/%s/";
    public static final java.lang.String DELETE_TOKEN = "/devices/%s/tokens/%s?reasonCode=%s&reason=%s";
    public static final java.lang.String GET_ASSET = "/assets/%s";
    public static final java.lang.String GET_ASSET_V2 = "/v2/assets/%s/network/%s";
    public static final java.lang.String GET_CSDK_CERTIFICATE = "/pkCertificates/CSDK";
    public static final java.lang.String GET_HISTORY = "/devices/%s/tokens/%s/history";
    public static final java.lang.String GET_HISTORY_WITH_TIMESTAMP = "/devices/%s/tokens/%s/history?transactionsFromTimestamp=%s";
    public static final com.payair.logic.remote.remoteServices.Endpoints INSTANCE = new com.payair.logic.remote.remoteServices.Endpoints();
    public static final java.lang.String SEND_AUTHENTICATION_CODE = "/devices/%s/tokens/%s/authenticationCode/";
    public static final java.lang.String START_TOKENIZE = "/v2/devices/%s/tokenizations/network/%s";
    public static final java.lang.String START_TOKENIZE_ALL_CARDS = "/devices/%s/tokenizations/startTokenizeAllCards/";
}
