package com.paypal.oslo.feature.oneonboarding.data.mapper;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/data/mapper/CallErrorMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "toFlowStepError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CallErrorMapper {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"INVALID_REQUEST", "UNPROCESSABLE_ENTITY"});

    @javax.inject.Inject
    public CallErrorMapper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError toFlowStepError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        ?? r5;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo contextualInfo;
        com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata addressCorrectionMetadata;
        com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata addressCorrectionMetadata2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
            arrow.core.NonEmptyList m9567boximpl = arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = m9567boximpl.iterator();
            while (true) {
                java.lang.String str = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) next;
                java.lang.String errorCode = graphQLError.getErrorCode();
                if (errorCode == null) {
                    java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
                    java.lang.Object obj = extensions != null ? extensions.get("name") : null;
                    if (obj instanceof java.lang.String) {
                        str = obj;
                    }
                } else {
                    str = errorCode;
                }
                if (kotlin.collections.CollectionsKt.contains(this.getHighResolutionOutputSizeshNQ4ISI, str)) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                java.util.Map<java.lang.String, java.lang.Object> extensions2 = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) it2.next()).getExtensions();
                java.lang.Object obj2 = extensions2 != null ? extensions2.get("details") : null;
                java.util.List list = obj2 instanceof java.util.List ? (java.util.List) obj2 : null;
                if (list == null) {
                    arrayList = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.lang.Object obj3 : list) {
                        java.util.Map map = obj3 instanceof java.util.Map ? (java.util.Map) obj3 : null;
                        if (map != null) {
                            java.lang.Object obj4 = map.get("submitId");
                            java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                            if (str2 != null) {
                                java.lang.Object obj5 = map.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
                                java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                                if (str3 != null) {
                                    java.lang.String m16608constructorimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(str2);
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(str3, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.AddressUserVerificationNeeded)) {
                                        java.lang.Object obj6 = map.get("addressMetadata");
                                        java.util.Map map2 = obj6 instanceof java.util.Map ? (java.util.Map) obj6 : null;
                                        java.lang.Object obj7 = map2 != null ? map2.get("originalAddressId") : null;
                                        java.lang.String str4 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                                        java.lang.Object obj8 = map2 != null ? map2.get("correctedAddressId") : null;
                                        java.lang.String str5 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                                        java.lang.Object obj9 = map2 != null ? map2.get("correctedAddress") : null;
                                        java.util.Map map3 = obj9 instanceof java.util.Map ? (java.util.Map) obj9 : null;
                                        if (str4 == null || str5 == null || map3 == null) {
                                            addressCorrectionMetadata2 = null;
                                        } else {
                                            java.lang.String m16694constructorimpl = com.paypal.oslo.feature.oneonboarding.domain.AddressId.m16694constructorimpl(str4);
                                            java.lang.String m16694constructorimpl2 = com.paypal.oslo.feature.oneonboarding.domain.AddressId.m16694constructorimpl(str5);
                                            java.lang.Object obj10 = map3.get("addressLine1");
                                            java.lang.String str6 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                                            java.lang.String m11273constructorimpl = str6 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(str6) : null;
                                            java.lang.Object obj11 = map3.get("addressLine2");
                                            java.lang.String str7 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
                                            java.lang.String m11282constructorimpl = str7 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(str7) : null;
                                            java.lang.Object obj12 = map3.get("addressLine3");
                                            java.lang.String str8 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
                                            java.lang.String m11291constructorimpl = str8 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11291constructorimpl(str8) : null;
                                            java.lang.Object obj13 = map3.get("adminArea4");
                                            java.lang.String str9 = obj13 instanceof java.lang.String ? (java.lang.String) obj13 : null;
                                            java.lang.String m11327constructorimpl = str9 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea4.m11327constructorimpl(str9) : null;
                                            java.lang.Object obj14 = map3.get("adminArea3");
                                            java.lang.String str10 = obj14 instanceof java.lang.String ? (java.lang.String) obj14 : null;
                                            java.lang.String m11318constructorimpl = str10 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea3.m11318constructorimpl(str10) : null;
                                            java.lang.Object obj15 = map3.get("adminArea2");
                                            java.lang.String str11 = obj15 instanceof java.lang.String ? (java.lang.String) obj15 : null;
                                            java.lang.String m11309constructorimpl = str11 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(str11) : null;
                                            java.lang.Object obj16 = map3.get("adminArea1");
                                            java.lang.String str12 = obj16 instanceof java.lang.String ? (java.lang.String) obj16 : null;
                                            java.lang.String m11300constructorimpl = str12 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(str12) : null;
                                            java.lang.Object obj17 = map3.get(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE);
                                            java.lang.String str13 = obj17 instanceof java.lang.String ? (java.lang.String) obj17 : null;
                                            java.lang.String m11460constructorimpl = str13 != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(str13) : null;
                                            java.lang.Object obj18 = map3.get("countryCode");
                                            java.lang.String str14 = obj18 instanceof java.lang.String ? (java.lang.String) obj18 : null;
                                            addressCorrectionMetadata2 = new com.paypal.oslo.feature.oneonboarding.domain.AddressCorrectionMetadata(m16694constructorimpl, m16694constructorimpl2, new com.paypal.oslo.core.i18n.domain.model.Address(m11273constructorimpl, m11282constructorimpl, m11291constructorimpl, m11327constructorimpl, m11318constructorimpl, m11309constructorimpl, m11300constructorimpl, m11460constructorimpl, str14 != null ? com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(str14) : null, null, 512, null), (kotlin.jvm.internal.DefaultConstructorMarker) r5);
                                        }
                                        addressCorrectionMetadata = addressCorrectionMetadata2;
                                    } else {
                                        addressCorrectionMetadata = null;
                                    }
                                    contextualInfo = new com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo(m16608constructorimpl, str3, addressCorrectionMetadata, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                                    if (contextualInfo == null) {
                                        arrayList4.add(contextualInfo);
                                    }
                                }
                            }
                        }
                        contextualInfo = null;
                        if (contextualInfo == null) {
                        }
                    }
                    arrayList = arrayList4;
                }
                kotlin.collections.CollectionsKt.addAll(arrayList3, arrayList);
            }
            java.util.ArrayList arrayList5 = arrayList3;
            r5 = arrayList5.isEmpty() ? 0 : new com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.CollectedItemsError(arrayList5);
            if (r5 != 0) {
                return (com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError) r5;
            }
            return new com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GraphQLError("GraphQL errors: ".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.data.mapper.CallErrorMapper$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj19) {
                    return com.paypal.oslo.feature.oneonboarding.data.mapper.CallErrorMapper.m16674$r8$lambda$JNMMuIsq9FnyIRAf16mHAn7aZ0((com.paypal.oslo.core.network.graphql.error.GraphQLError) obj19);
                }
            }, 31, null))));
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return new com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.NetworkError(new com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.NoInternet(((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause()));
        }
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            return new com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.NetworkError(new com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.HttpError(((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error).getCode()));
        }
        if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String message = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause().getMessage();
        if (message == null) {
            message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
        }
        return new com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GenericError(message);
    }

    /* renamed from: $r8$lambda$JNMM-uIsq9FnyIRAf16mHAn7aZ0, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m16674$r8$lambda$JNMMuIsq9FnyIRAf16mHAn7aZ0(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLError, "");
        return graphQLError.getMessage();
    }
}
