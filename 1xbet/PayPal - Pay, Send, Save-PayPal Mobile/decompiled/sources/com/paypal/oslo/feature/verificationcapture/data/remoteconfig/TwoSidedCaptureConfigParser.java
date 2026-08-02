package com.paypal.oslo.feature.verificationcapture.data.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/remoteconfig/TwoSidedCaptureConfigParser;", "", "<init>", "()V", "", "configString", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/TwoSidedCaptureRule;", "parse", "(Ljava/lang/String;)Ljava/util/List;", "client", "product", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "documentType", "", "matches", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TwoSidedCaptureConfigParser {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.data.remoteconfig.TwoSidedCaptureConfigParser INSTANCE = new com.paypal.oslo.feature.verificationcapture.data.remoteconfig.TwoSidedCaptureConfigParser();

    private TwoSidedCaptureConfigParser() {
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.TwoSidedCaptureRule> parse(java.lang.String configString) {
        com.paypal.android.logger.Logger logger;
        com.paypal.android.logger.Logger logger2;
        com.paypal.android.logger.Logger logger3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configString, "");
        java.lang.String str = configString;
        if (kotlin.text.StringsKt.isBlank(str)) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"#"}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = split$default.iterator();
        while (it.hasNext()) {
            java.lang.String obj = kotlin.text.StringsKt.trim((java.lang.String) it.next()).toString();
            java.lang.String str2 = obj;
            com.paypal.oslo.feature.verificationcapture.domain.model.TwoSidedCaptureRule twoSidedCaptureRule = null;
            if (!kotlin.text.StringsKt.isBlank(str2)) {
                java.util.List split$default2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER}, false, 0, 6, (java.lang.Object) null);
                if (split$default2.size() != 2) {
                    logger3 = com.paypal.oslo.feature.verificationcapture.data.remoteconfig.TwoSidedCaptureConfigParserKt.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.android.logger.Logger.w$default(logger3, "Invalid two-sided capture rule format: missing '|' separator", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("rule", obj)), null, 4, null);
                } else {
                    java.lang.String obj2 = kotlin.text.StringsKt.trim((java.lang.String) split$default2.get(0)).toString();
                    java.lang.String obj3 = kotlin.text.StringsKt.trim((java.lang.String) split$default2.get(1)).toString();
                    java.util.List split$default3 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) obj2, new java.lang.String[]{io.ktor.sse.ServerSentEventKt.COLON}, false, 0, 6, (java.lang.Object) null);
                    if (split$default3.size() != 4) {
                        logger2 = com.paypal.oslo.feature.verificationcapture.data.remoteconfig.TwoSidedCaptureConfigParserKt.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.android.logger.Logger.w$default(logger2, "Invalid two-sided capture rule target context: expected 4 parts (client:product:flowName:country)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("rule", obj), kotlin.TuplesKt.to("parts_found", java.lang.Integer.valueOf(split$default3.size()))), null, 4, null);
                    } else {
                        java.util.List split$default4 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) obj3, new java.lang.String[]{";"}, false, 0, 6, (java.lang.Object) null);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(split$default4, 10));
                        java.util.Iterator it2 = split$default4.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(kotlin.text.StringsKt.trim((java.lang.String) it2.next()).toString());
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj4 : arrayList2) {
                            if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj4)) {
                                arrayList3.add(obj4);
                            }
                        }
                        java.util.ArrayList arrayList4 = arrayList3;
                        if (arrayList4.isEmpty()) {
                            logger = com.paypal.oslo.feature.verificationcapture.data.remoteconfig.TwoSidedCaptureConfigParserKt.getHighResolutionOutputSizeshNQ4ISI;
                            com.paypal.android.logger.Logger.w$default(logger, "Invalid two-sided capture rule: no document types found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("rule", obj)), null, 4, null);
                        } else {
                            twoSidedCaptureRule = new com.paypal.oslo.feature.verificationcapture.domain.model.TwoSidedCaptureRule(kotlin.text.StringsKt.trim((java.lang.String) split$default3.get(0)).toString(), kotlin.text.StringsKt.trim((java.lang.String) split$default3.get(1)).toString(), kotlin.text.StringsKt.trim((java.lang.String) split$default3.get(2)).toString(), kotlin.text.StringsKt.trim((java.lang.String) split$default3.get(3)).toString(), arrayList4);
                        }
                    }
                }
            }
            if (twoSidedCaptureRule != null) {
                arrayList.add(twoSidedCaptureRule);
            }
        }
        return arrayList;
    }

    public final boolean matches(java.lang.String configString, java.lang.String client, java.lang.String product, java.lang.String flowName, java.lang.String country, java.lang.String documentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.TwoSidedCaptureRule> parse = parse(configString);
        if ((parse instanceof java.util.Collection) && parse.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = parse.iterator();
        while (it.hasNext()) {
            if (((com.paypal.oslo.feature.verificationcapture.domain.model.TwoSidedCaptureRule) it.next()).matches(client, product, flowName, country, documentType)) {
                return true;
            }
        }
        return false;
    }
}
