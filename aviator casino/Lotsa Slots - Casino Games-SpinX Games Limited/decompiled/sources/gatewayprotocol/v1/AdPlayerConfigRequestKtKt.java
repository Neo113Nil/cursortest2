package gatewayprotocol.v1;

/* compiled from: AdPlayerConfigRequestKt.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\f\u001a)\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"mediationInfoOrNull", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder;", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "adPlayerConfigRequest", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeadPlayerConfigRequest", "copy", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdPlayerConfigRequestKtKt {
    /* renamed from: -initializeadPlayerConfigRequest, reason: not valid java name */
    public static final gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest m10522initializeadPlayerConfigRequest(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl.Companion companion = gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder newBuilder = gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest copy(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayerConfigRequest, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl.Companion companion = gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder = adPlayerConfigRequest.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.AdPlayerConfigRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder adPlayerConfigRequestOrBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayerConfigRequestOrBuilder, "<this>");
        if (adPlayerConfigRequestOrBuilder.hasMediationInfo()) {
            return adPlayerConfigRequestOrBuilder.getMediationInfo();
        }
        return null;
    }
}
