package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CampaignKt.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\n*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"campaign", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/CampaignKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializecampaign", "copy", "loadTimestampOrNull", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignOrBuilder;", "getLoadTimestampOrNull", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignOrBuilder;)Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "showTimestampOrNull", "getShowTimestampOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CampaignKtKt {
    /* renamed from: -initializecampaign, reason: not valid java name */
    public static final CampaignStateOuterClass.Campaign m7802initializecampaign(Function1<? super CampaignKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.INSTANCE;
        CampaignStateOuterClass.Campaign.Builder newBuilder = CampaignStateOuterClass.Campaign.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        CampaignKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.Campaign copy(CampaignStateOuterClass.Campaign campaign, Function1<? super CampaignKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(campaign, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.INSTANCE;
        CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        CampaignKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TimestampsOuterClass.Timestamps getLoadTimestampOrNull(CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        Intrinsics.checkNotNullParameter(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasLoadTimestamp()) {
            return campaignOrBuilder.getLoadTimestamp();
        }
        return null;
    }

    public static final TimestampsOuterClass.Timestamps getShowTimestampOrNull(CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        Intrinsics.checkNotNullParameter(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasShowTimestamp()) {
            return campaignOrBuilder.getShowTimestamp();
        }
        return null;
    }
}
