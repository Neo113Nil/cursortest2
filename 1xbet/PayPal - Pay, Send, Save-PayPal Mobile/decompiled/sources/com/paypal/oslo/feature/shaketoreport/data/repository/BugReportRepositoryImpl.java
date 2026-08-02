package com.paypal.oslo.feature.shaketoreport.data.repository;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0017\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/data/repository/BugReportRepositoryImpl;", "Lcom/paypal/oslo/feature/shaketoreport/domain/repository/BugReportRepository;", "Lcom/paypal/oslo/feature/shaketoreport/network/PayPalJiraCredentialApi;", "payPalJiraCredentialApi", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lcom/paypal/oslo/feature/shaketoreport/network/PayPalJiraCredentialApi;Lkotlinx/serialization/json/Json;)V", "Lcom/paypal/oslo/feature/shaketoreport/domain/IssueData;", "issueData", "Ljava/io/File;", "file", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportError;", "Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportSuccess;", "sendBugReport", "(Lcom/paypal/oslo/feature/shaketoreport/domain/IssueData;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "Lretrofit2/Response;", "Lcom/paypal/oslo/feature/shaketoreport/data/response/CreateBugReportResponse;", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/shaketoreport/domain/IssueData;)Ljava/lang/String;", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shaketoreport/data/response/CreateBugReportResponse;", "Lcom/paypal/oslo/feature/shaketoreport/network/PayPalJiraCredentialApi;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/json/Json;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BugReportRepositoryImpl implements com.paypal.oslo.feature.shaketoreport.domain.repository.BugReportRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public BugReportRepositoryImpl(com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi payPalJiraCredentialApi, @com.paypal.oslo.feature.shaketoreport.di.JiraJson kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalJiraCredentialApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.Camera2StreamConfigurationMap = payPalJiraCredentialApi;
        this.getHighResolutionOutputSizeshNQ4ISI = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2 A[Catch: HttpException -> 0x0252, IOException -> 0x02c3, TRY_ENTER, TryCatch #2 {IOException -> 0x02c3, HttpException -> 0x0252, blocks: (B:11:0x003c, B:12:0x00a6, B:15:0x00b2, B:16:0x00de, B:18:0x00e4, B:20:0x0101, B:22:0x011e, B:25:0x0128, B:26:0x012e, B:31:0x0138, B:33:0x013e, B:34:0x0144, B:35:0x016e, B:37:0x0174, B:39:0x0191, B:43:0x019a, B:46:0x01a4, B:48:0x01d2, B:49:0x01d7, B:51:0x01d5, B:57:0x004b, B:60:0x005e), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0138 A[Catch: HttpException -> 0x0252, IOException -> 0x02c3, TryCatch #2 {IOException -> 0x02c3, HttpException -> 0x0252, blocks: (B:11:0x003c, B:12:0x00a6, B:15:0x00b2, B:16:0x00de, B:18:0x00e4, B:20:0x0101, B:22:0x011e, B:25:0x0128, B:26:0x012e, B:31:0x0138, B:33:0x013e, B:34:0x0144, B:35:0x016e, B:37:0x0174, B:39:0x0191, B:43:0x019a, B:46:0x01a4, B:48:0x01d2, B:49:0x01d7, B:51:0x01d5, B:57:0x004b, B:60:0x005e), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.paypal.oslo.feature.shaketoreport.domain.repository.BugReportRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendBugReport(com.paypal.oslo.feature.shaketoreport.domain.IssueData issueData, java.io.File file, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.shaketoreport.domain.BugReportError, com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess>> continuation) {
        com.paypal.oslo.feature.shaketoreport.data.repository.BugReportRepositoryImpl$sendBugReport$1 bugReportRepositoryImpl$sendBugReport$1;
        int i;
        com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType bugReportErrorType;
        retrofit2.Response response;
        com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType bugReportErrorType2;
        java.lang.String str;
        try {
            if (continuation instanceof com.paypal.oslo.feature.shaketoreport.data.repository.BugReportRepositoryImpl$sendBugReport$1) {
                bugReportRepositoryImpl$sendBugReport$1 = (com.paypal.oslo.feature.shaketoreport.data.repository.BugReportRepositoryImpl$sendBugReport$1) continuation;
                if ((bugReportRepositoryImpl$sendBugReport$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    bugReportRepositoryImpl$sendBugReport$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = bugReportRepositoryImpl$sendBugReport$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bugReportRepositoryImpl$sendBugReport$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.shaketoreport.LoggerKt.log;
                        java.lang.String title = issueData.getTitle();
                        java.lang.String agileTeamName = issueData.getAgileTeamName();
                        java.lang.String employeeId = issueData.getEmployeeId();
                        boolean z = file != null;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Submitting bug report to JIRA - Title: ");
                        sb.append(title);
                        sb.append(", Agile Team: ");
                        sb.append(agileTeamName);
                        sb.append(", Employee Email: ");
                        sb.append(employeeId);
                        sb.append(", Screenshot attached: ");
                        sb.append(z);
                        com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
                        bugReportRepositoryImpl$sendBugReport$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(issueData);
                        bugReportRepositoryImpl$sendBugReport$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                        bugReportRepositoryImpl$sendBugReport$1.Camera2StreamConfigurationMap = 1;
                        obj = getHighResolutionOutputSizeshNQ4ISI(issueData, file, bugReportRepositoryImpl$sendBugReport$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    response = (retrofit2.Response) obj;
                    if (!response.isSuccessful()) {
                        com.paypal.oslo.feature.shaketoreport.data.response.CreateBugReportResponse createBugReportResponse = (com.paypal.oslo.feature.shaketoreport.data.response.CreateBugReportResponse) response.body();
                        okhttp3.Headers headers = response.headers();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(headers, "");
                        java.util.Map map = kotlin.collections.MapsKt.toMap(headers);
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            java.lang.String lowerCase = ((java.lang.String) entry.getKey()).toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                            linkedHashMap.put(lowerCase, entry.getValue());
                        }
                        java.lang.String str2 = (java.lang.String) linkedHashMap.get(com.paypal.oslo.core.network.http.NetworkConstants.PAYPAL_DEBUG_ID_HEADER);
                        java.lang.String str3 = (java.lang.String) linkedHashMap.get(lib.android.paypal.com.magnessdk.c.b.b);
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "shake_to_send_success_submit_bug_report", null, null, 6, null);
                        if (createBugReportResponse == null || (str = createBugReportResponse.getMessage()) == null) {
                            str = "Created JIRA ticket successfully but no message from the request.";
                        }
                        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess(str, createBugReportResponse != null ? createBugReportResponse.getMediaAttached() : false, str3, str2));
                    }
                    okhttp3.ResponseBody errorBody = response.errorBody();
                    com.paypal.oslo.feature.shaketoreport.data.response.CreateBugReportResponse highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(errorBody != null ? errorBody.string() : null);
                    okhttp3.Headers headers2 = response.headers();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(headers2, "");
                    java.util.Map map2 = kotlin.collections.MapsKt.toMap(headers2);
                    java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map2.size()));
                    for (java.util.Map.Entry entry2 : map2.entrySet()) {
                        java.lang.String lowerCase2 = ((java.lang.String) entry2.getKey()).toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                        linkedHashMap2.put(lowerCase2, entry2.getValue());
                    }
                    java.lang.Object obj2 = linkedHashMap2.get(com.paypal.oslo.core.network.http.NetworkConstants.PAYPAL_DEBUG_ID_HEADER);
                    java.lang.Object obj3 = "no-id";
                    if (obj2 == null) {
                        obj2 = "no-id";
                    }
                    java.lang.String str4 = (java.lang.String) obj2;
                    java.lang.Object obj4 = linkedHashMap2.get(lib.android.paypal.com.magnessdk.c.b.b);
                    if (obj4 != null) {
                        obj3 = obj4;
                    }
                    java.lang.String str5 = (java.lang.String) obj3;
                    java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(highSpeedVideoFpsRanges.getDetails(), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shaketoreport.data.repository.BugReportRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj5) {
                            return com.paypal.oslo.feature.shaketoreport.data.repository.BugReportRepositoryImpl.m19315$r8$lambda$AnGtJY6jJUrhkL_a4uXZDky1Fk((com.paypal.oslo.feature.shaketoreport.data.response.Detail) obj5);
                        }
                    }, 30, null);
                    if (response.code() == 401) {
                        bugReportErrorType2 = com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType.AUTHENTICATION;
                    } else {
                        bugReportErrorType2 = com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType.API;
                    }
                    com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType bugReportErrorType3 = bugReportErrorType2;
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "shake_to_send_failed_to_api_error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("code", java.lang.Integer.valueOf(response.code())), kotlin.TuplesKt.to("name", highSpeedVideoFpsRanges.getName()), kotlin.TuplesKt.to("message", highSpeedVideoFpsRanges.getMessage()), kotlin.TuplesKt.to("details", joinToString$default), kotlin.TuplesKt.to("paypal_debug_id", str4), kotlin.TuplesKt.to("correlation_id", str5)), null, null, 12, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.shaketoreport.domain.BugReportError(bugReportErrorType3, java.lang.Integer.valueOf(response.code()), highSpeedVideoFpsRanges.getName(), highSpeedVideoFpsRanges.getMessage(), joinToString$default, str4, str5));
                }
            }
            if (i != 0) {
            }
            response = (retrofit2.Response) obj;
            if (!response.isSuccessful()) {
            }
        } catch (java.io.IOException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "shake_to_send_failed_to_submit_bug_report", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message", e.getMessage()), kotlin.TuplesKt.to("type", "network")), null, e, 4, null);
            com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType bugReportErrorType4 = com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType.NETWORK;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown network error";
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.shaketoreport.domain.BugReportError(bugReportErrorType4, null, null, message, null, null, null, 118, null));
        } catch (retrofit2.HttpException e2) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "shake_to_send_failed_to_submit_bug_report", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message", e2.getMessage()), kotlin.TuplesKt.to("type", "http"), kotlin.TuplesKt.to("code", kotlin.coroutines.jvm.internal.Boxing.boxInt(e2.code()))), null, e2, 4, null);
            if (e2.code() == 401) {
                bugReportErrorType = com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType.AUTHENTICATION;
            } else {
                bugReportErrorType = com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType.HTTP;
            }
            com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType bugReportErrorType5 = bugReportErrorType;
            java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(e2.code());
            java.lang.String message2 = e2.message();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message2, "");
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.shaketoreport.domain.BugReportError(bugReportErrorType5, boxInt, null, message2, null, null, null, 116, null));
        }
        bugReportRepositoryImpl$sendBugReport$1 = new com.paypal.oslo.feature.shaketoreport.data.repository.BugReportRepositoryImpl$sendBugReport$1(this, continuation);
        java.lang.Object obj5 = bugReportRepositoryImpl$sendBugReport$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bugReportRepositoryImpl$sendBugReport$1.Camera2StreamConfigurationMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.shaketoreport.domain.IssueData issueData, java.io.File file, kotlin.coroutines.Continuation<? super retrofit2.Response<com.paypal.oslo.feature.shaketoreport.data.response.CreateBugReportResponse>> continuation) {
        com.paypal.oslo.feature.shaketoreport.network.PayPalJiraCredentialApi payPalJiraCredentialApi = this.Camera2StreamConfigurationMap;
        java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(issueData);
        java.lang.String title = issueData.getTitle();
        okhttp3.RequestBody create = title != null ? okhttp3.RequestBody.INSTANCE.create(title, okhttp3.MediaType.INSTANCE.parse("text/plain")) : null;
        java.lang.String stepsToReproduce = issueData.getStepsToReproduce();
        okhttp3.RequestBody create2 = stepsToReproduce != null ? okhttp3.RequestBody.INSTANCE.create(stepsToReproduce, okhttp3.MediaType.INSTANCE.parse("text/plain")) : null;
        java.lang.String chanceToReproduce = issueData.getChanceToReproduce();
        okhttp3.RequestBody create3 = chanceToReproduce != null ? okhttp3.RequestBody.INSTANCE.create(chanceToReproduce, okhttp3.MediaType.INSTANCE.parse("text/plain")) : null;
        java.lang.String employeeId = issueData.getEmployeeId();
        okhttp3.RequestBody create4 = employeeId != null ? okhttp3.RequestBody.INSTANCE.create(employeeId, okhttp3.MediaType.INSTANCE.parse("text/plain")) : null;
        okhttp3.RequestBody create5 = okhttp3.RequestBody.INSTANCE.create("PAYPAL", okhttp3.MediaType.INSTANCE.parse("text/plain"));
        java.lang.String agileTeamName = issueData.getAgileTeamName();
        return payPalJiraCredentialApi.createBugReport(highSpeedVideoFpsRanges, create, create3, create2, create4, create5, agileTeamName != null ? okhttp3.RequestBody.INSTANCE.create(agileTeamName, okhttp3.MediaType.INSTANCE.parse("text/plain")) : null, file != null ? okhttp3.MultipartBody.Part.INSTANCE.createFormData("screenshot", file.getName(), okhttp3.RequestBody.INSTANCE.create(file, okhttp3.MediaType.INSTANCE.parse("image/*"))) : null, continuation);
    }

    private final com.paypal.oslo.feature.shaketoreport.data.response.CreateBugReportResponse getHighSpeedVideoFpsRanges(java.lang.String p0) {
        if (p0 != null) {
            try {
                kotlinx.serialization.json.Json json = this.getHighResolutionOutputSizeshNQ4ISI;
                json.getSerializersModule();
                com.paypal.oslo.feature.shaketoreport.data.response.CreateBugReportResponse createBugReportResponse = (com.paypal.oslo.feature.shaketoreport.data.response.CreateBugReportResponse) json.decodeFromString(com.paypal.oslo.feature.shaketoreport.data.response.CreateBugReportResponse.INSTANCE.serializer(), p0);
                if (createBugReportResponse != null) {
                    return createBugReportResponse;
                }
            } catch (kotlinx.serialization.SerializationException e) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "shake_to_send_failed_to_jira_parse", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message", e.getMessage())), null, e, 4, null);
                return new com.paypal.oslo.feature.shaketoreport.data.response.CreateBugReportResponse((java.lang.String) null, (java.lang.String) null, "Failed to parse JIRA error response: ".concat(java.lang.String.valueOf(e.getMessage())), false, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, 251, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
        }
        return new com.paypal.oslo.feature.shaketoreport.data.response.CreateBugReportResponse((java.lang.String) null, (java.lang.String) null, "Failed to parse JIRA error response", false, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, 251, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.shaketoreport.domain.IssueData p0) {
        kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "deviceOS", p0.getDeviceOS());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "deviceLocale", p0.getDeviceLocale());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "deviceModel", p0.getDeviceModel());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "deviceMake", p0.getDeviceMake());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "deviceOSVersion", p0.getDeviceOSVersion());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "deviceType", p0.getDeviceType());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "deviceNetworkType", p0.getDeviceNetworkType());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "deviceNetworkCarrier", p0.getDeviceNetworkCarrier());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "deviceLocationCountry", p0.getDeviceLocationCountry());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "deviceLanguage", p0.getDeviceLanguage());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "appVersion", p0.getAppVersion());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "sdkVersion", p0.getVersionCode());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "appName", p0.getAppName());
        return jsonObjectBuilder.build().toString();
    }

    /* renamed from: $r8$lambda$AnGt-JY6jJUrhkL_a4uXZDky1Fk, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m19315$r8$lambda$AnGtJY6jJUrhkL_a4uXZDky1Fk(com.paypal.oslo.feature.shaketoreport.data.response.Detail detail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "");
        java.lang.String issue = detail.getIssue();
        java.lang.String description = detail.getDescription();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(issue);
        sb.append(": ");
        sb.append(description);
        return sb.toString();
    }
}
