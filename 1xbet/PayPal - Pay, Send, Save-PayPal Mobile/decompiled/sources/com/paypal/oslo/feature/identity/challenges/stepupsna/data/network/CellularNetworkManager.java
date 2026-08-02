package com.paypal.oslo.feature.identity.challenges.stepupsna.data.network;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\tH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0013\u001a\u00020\u00188CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/data/network/CellularNetworkManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "url", "requestBody", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "makeRequestOnCellular", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Network;", "Camera2StreamConfigurationMap", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/net/Network;Ljava/lang/String;Ljava/lang/String;)Larrow/core/Either;", "getHighSpeedVideoSizes", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "Landroid/net/ConnectivityManager;", "Lkotlin/Lazy;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CellularNetworkManager {

    @java.lang.Deprecated
    public static final long HTTP_CONNECT_TIMEOUT_MS = 15000;

    @java.lang.Deprecated
    public static final long HTTP_READ_TIMEOUT_MS = 15000;

    @java.lang.Deprecated
    public static final int HTTP_SUCCESS_RANGE_END = 299;

    @java.lang.Deprecated
    public static final int HTTP_SUCCESS_RANGE_START = 200;

    @java.lang.Deprecated
    public static final long NETWORK_REQUEST_TIMEOUT_MS = 30000;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager.Companion Companion = new com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CellularNetworkManager(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager.m15099$r8$lambda$d0Coiq3USxwkYJB6pDdpUM6F70(com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager.this);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object makeRequestOnCellular(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$makeRequestOnCellular$1 cellularNetworkManager$makeRequestOnCellular$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$makeRequestOnCellular$1) {
            cellularNetworkManager$makeRequestOnCellular$1 = (com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$makeRequestOnCellular$1) continuation;
            if ((cellularNetworkManager$makeRequestOnCellular$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                cellularNetworkManager$makeRequestOnCellular$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = cellularNetworkManager$makeRequestOnCellular$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cellularNetworkManager$makeRequestOnCellular$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Object systemService = this.getHighSpeedVideoFpsRangesFor.getSystemService("phone");
                    android.telephony.TelephonyManager telephonyManager = systemService instanceof android.telephony.TelephonyManager ? (android.telephony.TelephonyManager) systemService : null;
                    if (telephonyManager == null || !telephonyManager.isDataEnabled()) {
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.MobileDataDisabled.INSTANCE);
                    }
                    cellularNetworkManager$makeRequestOnCellular$1.getHighSpeedVideoFpsRangesFor = str;
                    cellularNetworkManager$makeRequestOnCellular$1.Camera2StreamConfigurationMap = str2;
                    cellularNetworkManager$makeRequestOnCellular$1.getHighSpeedVideoFpsRanges = 1;
                    obj = Camera2StreamConfigurationMap(cellularNetworkManager$makeRequestOnCellular$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) cellularNetworkManager$makeRequestOnCellular$1.Camera2StreamConfigurationMap;
                    str = (java.lang.String) cellularNetworkManager$makeRequestOnCellular$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    return either;
                }
                if (!(either instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return getHighResolutionOutputSizeshNQ4ISI((android.net.Network) ((arrow.core.Either.Right) either).getValue(), str, str2);
            }
        }
        cellularNetworkManager$makeRequestOnCellular$1 = new com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$makeRequestOnCellular$1(this, continuation);
        java.lang.Object obj2 = cellularNetworkManager$makeRequestOnCellular$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cellularNetworkManager$makeRequestOnCellular$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError, ? extends android.net.Network>> continuation) {
        com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$1 cellularNetworkManager$requestCellularNetwork$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$1) {
                cellularNetworkManager$requestCellularNetwork$1 = (com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$1) continuation;
                if ((cellularNetworkManager$requestCellularNetwork$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    cellularNetworkManager$requestCellularNetwork$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = cellularNetworkManager$requestCellularNetwork$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cellularNetworkManager$requestCellularNetwork$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
                        com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2 cellularNetworkManager$requestCellularNetwork$2 = new com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$2(this, build, null);
                        cellularNetworkManager$requestCellularNetwork$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(build);
                        cellularNetworkManager$requestCellularNetwork$1.getHighSpeedVideoSizes = 1;
                        obj = kotlinx.coroutines.TimeoutKt.withTimeout(30000L, cellularNetworkManager$requestCellularNetwork$2, cellularNetworkManager$requestCellularNetwork$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (arrow.core.Either) obj;
                }
            }
            if (i != 0) {
            }
            return (arrow.core.Either) obj;
        } catch (java.lang.Exception e) {
            return e instanceof kotlinx.coroutines.TimeoutCancellationException ? arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.NetworkTimeout.INSTANCE) : arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.UnknownError(e));
        }
        cellularNetworkManager$requestCellularNetwork$1 = new com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager$requestCellularNetwork$1(this, continuation);
        java.lang.Object obj2 = cellularNetworkManager$requestCellularNetwork$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cellularNetworkManager$requestCellularNetwork$1.getHighSpeedVideoSizes;
    }

    private static arrow.core.Either<com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError, java.lang.String> getHighResolutionOutputSizeshNQ4ISI(android.net.Network p0, java.lang.String p1, java.lang.String p2) {
        try {
            java.net.URLConnection openConnection = p0.openConnection(new java.net.URL(p1));
            kotlin.jvm.internal.Intrinsics.checkNotNull(openConnection, "");
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", com.statsig.androidsdk.HttpUtils.CONTENT_TYPE_HEADER_VALUE);
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(15000);
            java.io.BufferedReader outputStreamWriter = new java.io.OutputStreamWriter(httpURLConnection.getOutputStream());
            try {
                java.io.OutputStreamWriter outputStreamWriter2 = outputStreamWriter;
                outputStreamWriter2.write(p2);
                outputStreamWriter2.flush();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                java.lang.String str = null;
                kotlin.io.CloseableKt.closeFinally(outputStreamWriter, null);
                int responseCode = httpURLConnection.getResponseCode();
                if (200 <= responseCode && responseCode < 300) {
                    outputStreamWriter = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream()));
                    try {
                        java.lang.String readText = kotlin.io.TextStreamsKt.readText(outputStreamWriter);
                        kotlin.io.CloseableKt.closeFinally(outputStreamWriter, null);
                        httpURLConnection.disconnect();
                        return arrow.core.EitherKt.right(readText);
                    } finally {
                    }
                } else {
                    try {
                        outputStreamWriter = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getErrorStream()));
                        try {
                            java.lang.String readText2 = kotlin.io.TextStreamsKt.readText(outputStreamWriter);
                            kotlin.io.CloseableKt.closeFinally(outputStreamWriter, null);
                            str = readText2;
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    httpURLConnection.disconnect();
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.HttpError(responseCode, str));
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (java.lang.Exception e) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError.UnknownError(e));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/data/network/CellularNetworkManager$Companion;", "", "<init>", "()V", "", "NETWORK_REQUEST_TIMEOUT_MS", "J", "HTTP_CONNECT_TIMEOUT_MS", "HTTP_READ_TIMEOUT_MS", "", "HTTP_SUCCESS_RANGE_START", com.visa.cbp.getEncExpo.warmup, "HTTP_SUCCESS_RANGE_END"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$d0Coiq3USxw-kYJB6pDdpUM6F70, reason: not valid java name */
    public static /* synthetic */ android.net.ConnectivityManager m15099$r8$lambda$d0Coiq3USxwkYJB6pDdpUM6F70(com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager cellularNetworkManager) {
        java.lang.Object systemService = cellularNetworkManager.getHighSpeedVideoFpsRangesFor.getSystemService("connectivity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        return (android.net.ConnectivityManager) systemService;
    }

    public static final /* synthetic */ android.net.ConnectivityManager access$getConnectivityManager(com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager cellularNetworkManager) {
        return (android.net.ConnectivityManager) cellularNetworkManager.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }
}
