package com.paypal.oslo.core.captcha.interceptor;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\b0\u0007\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016JZ\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002J\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018\"\b\b\u0000\u0010\t*\u00020\n*\b\u0012\u0004\u0012\u0002H\t0\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/paypal/oslo/core/captcha/interceptor/CaptchaInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "captchaChallengeHandler", "Lcom/paypal/oslo/core/captcha/CaptchaChallengeHandler;", "<init>", "(Lcom/paypal/oslo/core/captcha/CaptchaChallengeHandler;)V", "intercept", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "chain", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "buildCaptchaErrorResponse", "code", "", "message", "reason", "responseExtensions", "", "", "extractCaptchaMetadata", "Lcom/paypal/oslo/core/captcha/interceptor/CaptchaInterceptor$CaptchaMetadata;", "CaptchaMetadata", "Companion", "captcha_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CaptchaInterceptor implements com.apollographql.apollo.interceptor.ApolloInterceptor {
    private final com.paypal.oslo.core.captcha.CaptchaChallengeHandler getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CaptchaInterceptor(com.paypal.oslo.core.captcha.CaptchaChallengeHandler captchaChallengeHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captchaChallengeHandler, "");
        this.getHighSpeedVideoFpsRangesFor = captchaChallengeHandler;
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor$intercept$1(chain, request, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.api.ApolloResponse<D> getHighSpeedVideoSizes(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("code", str);
        if (str3 != null) {
            createMapBuilder.put("reason", str3);
        }
        return new com.apollographql.apollo.api.ApolloResponse.Builder(apolloRequest.getOperation(), apolloRequest.getRequestUuid()).data(null).errors(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.Error(str2, null, null, kotlin.collections.MapsKt.build(createMapBuilder), null))).extensions(map).build();
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/captcha/interceptor/CaptchaInterceptor$CaptchaMetadata;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class CaptchaMetadata {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoSizes;

        public CaptchaMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoSizes = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = str3;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String str2 = this.getHighSpeedVideoSizes;
            java.lang.String str3 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CaptchaMetadata(getHighSpeedVideoFpsRangesFor=");
            sb.append(str);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(str2);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor.CaptchaMetadata)) {
                return false;
            }
            com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor.CaptchaMetadata captchaMetadata = (com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor.CaptchaMetadata) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, captchaMetadata.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, captchaMetadata.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, captchaMetadata.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/captcha/interceptor/CaptchaInterceptor$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor.CaptchaMetadata access$extractCaptchaMetadata(com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor captchaInterceptor, com.apollographql.apollo.api.ApolloResponse apolloResponse) {
        com.apollographql.apollo.api.Error error;
        java.util.Map<java.lang.String, java.lang.Object> extensions;
        java.lang.Object obj;
        java.util.List<com.apollographql.apollo.api.Error> list = apolloResponse.errors;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.util.Map<java.lang.String, java.lang.Object> extensions2 = ((com.apollographql.apollo.api.Error) obj).getExtensions();
                if (kotlin.jvm.internal.Intrinsics.areEqual(extensions2 != null ? extensions2.get("code") : null, "CAPTCHA_REQUIRED")) {
                    break;
                }
            }
            error = (com.apollographql.apollo.api.Error) obj;
        } else {
            error = null;
        }
        java.lang.Object obj2 = (error == null || (extensions = error.getExtensions()) == null) ? null : extensions.get("details");
        java.util.List list2 = obj2 instanceof java.util.List ? (java.util.List) obj2 : null;
        java.lang.Object firstOrNull = list2 != null ? kotlin.collections.CollectionsKt.firstOrNull(list2) : null;
        java.util.Map map = firstOrNull instanceof java.util.Map ? (java.util.Map) firstOrNull : null;
        java.lang.Object obj3 = map != null ? map.get("challengeUri") : null;
        java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.Object obj4 = map != null ? map.get("returnUri") : null;
        java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.lang.Object obj5 = map != null ? map.get("returnUriParam") : null;
        java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        if (str != null && str2 != null && str3 != null) {
            return new com.paypal.oslo.core.captcha.interceptor.CaptchaInterceptor.CaptchaMetadata(str, str2, str3);
        }
        if (error != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.captcha.LoggerKt.log, "CAPTCHA_REQUIRED error with incomplete metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("challengeUri", str), kotlin.TuplesKt.to("returnUri", str2), kotlin.TuplesKt.to("returnUriParam", str3), kotlin.TuplesKt.to("details", list2), kotlin.TuplesKt.to("captchaData", map)), null, 4, null);
        }
        return null;
    }
}
