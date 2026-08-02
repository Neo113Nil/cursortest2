package com.paypal.oslo.feature.identity.sso.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/sso/data/mapper/TokenExchangeIntentMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/TokenExchangeIntent;", "intent", "", "toGraphQL", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/TokenExchangeIntent;)Ljava/lang/String;", "intentString", "toDomain", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/shared/domain/model/TokenExchangeIntent;", "GraphQLIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TokenExchangeIntentMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper INSTANCE = new com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper();

    private TokenExchangeIntentMapper() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/sso/data/mapper/TokenExchangeIntentMapper$GraphQLIntent;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class GraphQLIntent {
        public static final com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent getHighResolutionOutputSizeshNQ4ISI;
        public static final com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent[] getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoFpsRanges;

        private GraphQLIntent(java.lang.String str, int i, java.lang.String str2) {
            this.getHighSpeedVideoFpsRanges = str2;
        }

        static {
            com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent graphQLIntent = new com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent("WEB_SINGLE_SIGN_ON", 0, "WEB_SINGLE_SIGN_ON");
            getHighSpeedVideoFpsRanges = graphQLIntent;
            com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent graphQLIntent2 = new com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent("INTERAPP_SINGLE_SIGN_ON", 1, "INTERAPP_SINGLE_SIGN_ON");
            getHighResolutionOutputSizeshNQ4ISI = graphQLIntent2;
            com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent[] graphQLIntentArr = {graphQLIntent, graphQLIntent2};
            getHighSpeedVideoFpsRangesFor = graphQLIntentArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(graphQLIntentArr);
        }

        public static com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent[] values() {
            return (com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent.class, str);
        }
    }

    public static /* synthetic */ java.lang.String toGraphQL$default(com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper tokenExchangeIntentMapper, com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent tokenExchangeIntent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tokenExchangeIntent = com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent.WEB_SINGLE_SIGN_ON;
        }
        return tokenExchangeIntentMapper.toGraphQL(tokenExchangeIntent);
    }

    public final java.lang.String toGraphQL(com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        int i = com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.WhenMappings.$EnumSwitchMapping$0[intent.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
    }

    public final com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent toDomain(java.lang.String intentString) {
        return kotlin.jvm.internal.Intrinsics.areEqual(intentString, com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges) ? com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent.WEB_SINGLE_SIGN_ON : kotlin.jvm.internal.Intrinsics.areEqual(intentString, com.paypal.oslo.feature.identity.sso.data.mapper.TokenExchangeIntentMapper.GraphQLIntent.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges) ? com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent.INTERAPP_SINGLE_SIGN_ON : com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent.WEB_SINGLE_SIGN_ON;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent.WEB_SINGLE_SIGN_ON.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.TokenExchangeIntent.INTERAPP_SINGLE_SIGN_ON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
