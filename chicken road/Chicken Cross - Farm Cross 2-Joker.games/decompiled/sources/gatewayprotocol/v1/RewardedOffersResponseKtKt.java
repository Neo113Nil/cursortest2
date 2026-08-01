package gatewayprotocol.v1;

import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.RewardedOffersResponseKt;
import gatewayprotocol.v1.RewardedOffersResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardedOffersResponseKt.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"rewardedOffersResponse", "Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/RewardedOffersResponseKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializerewardedOffersResponse", "copy", "errorOrNull", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponseOrBuilder;", "getErrorOrNull", "(Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardedOffersResponseKtKt {
    /* renamed from: -initializerewardedOffersResponse, reason: not valid java name */
    public static final RewardedOffersResponseOuterClass.RewardedOffersResponse m7848initializerewardedOffersResponse(Function1<? super RewardedOffersResponseKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        RewardedOffersResponseKt.Dsl.Companion companion = RewardedOffersResponseKt.Dsl.INSTANCE;
        RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder newBuilder = RewardedOffersResponseOuterClass.RewardedOffersResponse.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        RewardedOffersResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final RewardedOffersResponseOuterClass.RewardedOffersResponse copy(RewardedOffersResponseOuterClass.RewardedOffersResponse rewardedOffersResponse, Function1<? super RewardedOffersResponseKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(rewardedOffersResponse, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        RewardedOffersResponseKt.Dsl.Companion companion = RewardedOffersResponseKt.Dsl.INSTANCE;
        RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder builder = rewardedOffersResponse.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        RewardedOffersResponseKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder rewardedOffersResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(rewardedOffersResponseOrBuilder, "<this>");
        if (rewardedOffersResponseOrBuilder.hasError()) {
            return rewardedOffersResponseOrBuilder.getError();
        }
        return null;
    }
}
