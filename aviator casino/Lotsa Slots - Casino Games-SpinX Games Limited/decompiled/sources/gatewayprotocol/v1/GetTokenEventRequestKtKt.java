package gatewayprotocol.v1;

/* compiled from: GetTokenEventRequestKt.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"getTokenEventRequest", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/GetTokenEventRequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializegetTokenEventRequest", "copy", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetTokenEventRequestKtKt {
    /* renamed from: -initializegetTokenEventRequest, reason: not valid java name */
    public static final gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest m10546initializegetTokenEventRequest(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.GetTokenEventRequestKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.GetTokenEventRequestKt.Dsl.Companion companion = gatewayprotocol.v1.GetTokenEventRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder newBuilder = gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        gatewayprotocol.v1.GetTokenEventRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest copy(gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.GetTokenEventRequestKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTokenEventRequest, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.GetTokenEventRequestKt.Dsl.Companion companion = gatewayprotocol.v1.GetTokenEventRequestKt.Dsl.INSTANCE;
        gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder = getTokenEventRequest.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.GetTokenEventRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
