package com.paypal.oslo.feature.bnplservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Channel;", "Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/CreditFlowContextChannel;", "toCreditFlowContextChannel", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Channel;)Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChannelMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel toCreditFlowContextChannel(com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        int i = com.paypal.oslo.feature.bnplservicing.data.mapper.common.ChannelMapperKt.WhenMappings.$EnumSwitchMapping$0[channel.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.MOBILE_APP;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.MOBILE_WEB;
        }
        if (i == 3) {
            return com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.WEB;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.UNKNOWN__;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel.MOBILE_APP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel.MOBILE_WEB.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel.WEB.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
