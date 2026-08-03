package gatewayprotocol.v1;

/* compiled from: AllowedPiiKt.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"allowedPii", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/AllowedPiiKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeallowedPii", "copy", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AllowedPiiKtKt {
    /* renamed from: -initializeallowedPii, reason: not valid java name */
    public static final gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii m10526initializeallowedPii(kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.AllowedPiiKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.AllowedPiiKt.Dsl.Companion companion = gatewayprotocol.v1.AllowedPiiKt.Dsl.INSTANCE;
        gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder newBuilder = gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        gatewayprotocol.v1.AllowedPiiKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii copy(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii, kotlin.jvm.functions.Function1<? super gatewayprotocol.v1.AllowedPiiKt.Dsl, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedPii, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        gatewayprotocol.v1.AllowedPiiKt.Dsl.Companion companion = gatewayprotocol.v1.AllowedPiiKt.Dsl.INSTANCE;
        gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.Builder builder = allowedPii.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.AllowedPiiKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
