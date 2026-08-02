package com.paypal.oslo.feature.identity.shared.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/data/mapper/GraphQLErrorMapper;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "stringProvider", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;)V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "", "mapCallErrorToString", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GraphQLErrorMapper {

    @java.lang.Deprecated
    public static final java.lang.String KEY_DETAILS = "details";

    @java.lang.Deprecated
    public static final java.lang.String KEY_ISSUE = "issue";

    @java.lang.Deprecated
    public static final java.lang.String KEY_NAME = "name";

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.Companion Companion = new com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public GraphQLErrorMapper(com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        this.getHighSpeedVideoFpsRangesFor = stringProvider;
    }

    public final java.lang.String mapCallErrorToString(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        int i;
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            i = com.paypal.oslo.feature.identity.R.string.feature_identity_common_something_went_wrong_retry;
        } else {
            java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))).getExtensions();
            java.lang.String str = null;
            if (extensions != null) {
                java.lang.Object obj = extensions.get("details");
                java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
                java.lang.Object firstOrNull = list != null ? kotlin.collections.CollectionsKt.firstOrNull(list) : null;
                java.util.Map map = firstOrNull instanceof java.util.Map ? (java.util.Map) firstOrNull : null;
                java.lang.Object obj2 = map != null ? map.get(KEY_ISSUE) : null;
                java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                if (str2 == null) {
                    java.lang.Object obj3 = extensions.get("name");
                    if (obj3 instanceof java.lang.String) {
                        str = (java.lang.String) obj3;
                    }
                } else {
                    str = str2;
                }
            }
            i = kotlin.jvm.internal.Intrinsics.areEqual(str, "INVALID_CREDENTIALS") ? com.paypal.oslo.feature.identity.R.string.feature_identity_invalid_password_error : com.paypal.oslo.feature.identity.R.string.feature_identity_common_something_went_wrong_retry;
        }
        return this.getHighSpeedVideoFpsRangesFor.getString(i);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/data/mapper/GraphQLErrorMapper$Companion;", "", "<init>", "()V", "", "KEY_NAME", "Ljava/lang/String;", "KEY_DETAILS", "KEY_ISSUE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
