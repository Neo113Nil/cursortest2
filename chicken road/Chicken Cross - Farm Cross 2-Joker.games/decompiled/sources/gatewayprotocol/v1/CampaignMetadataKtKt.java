package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignMetadataKt;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CampaignMetadataKt.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"campaignMetadata", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/CampaignMetadataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializecampaignMetadata", "copy", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CampaignMetadataKtKt {
    /* renamed from: -initializecampaignMetadata, reason: not valid java name */
    public static final CampaignMetadataOuterClass.CampaignMetadata m7803initializecampaignMetadata(Function1<? super CampaignMetadataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        CampaignMetadataKt.Dsl.Companion companion = CampaignMetadataKt.Dsl.INSTANCE;
        CampaignMetadataOuterClass.CampaignMetadata.Builder newBuilder = CampaignMetadataOuterClass.CampaignMetadata.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        CampaignMetadataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final CampaignMetadataOuterClass.CampaignMetadata copy(CampaignMetadataOuterClass.CampaignMetadata campaignMetadata, Function1<? super CampaignMetadataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(campaignMetadata, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        CampaignMetadataKt.Dsl.Companion companion = CampaignMetadataKt.Dsl.INSTANCE;
        CampaignMetadataOuterClass.CampaignMetadata.Builder builder = campaignMetadata.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        CampaignMetadataKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
