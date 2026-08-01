package gatewayprotocol.v1;

import gatewayprotocol.v1.MediationInfoKt;
import gatewayprotocol.v1.MediationInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediationInfoKt.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"mediationInfo", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/MediationInfoKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializemediationInfo", "copy", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediationInfoKtKt {
    /* renamed from: -initializemediationInfo, reason: not valid java name */
    public static final MediationInfoOuterClass.MediationInfo m7830initializemediationInfo(Function1<? super MediationInfoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MediationInfoKt.Dsl.Companion companion = MediationInfoKt.Dsl.INSTANCE;
        MediationInfoOuterClass.MediationInfo.Builder newBuilder = MediationInfoOuterClass.MediationInfo.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        MediationInfoKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final MediationInfoOuterClass.MediationInfo copy(MediationInfoOuterClass.MediationInfo mediationInfo, Function1<? super MediationInfoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(mediationInfo, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        MediationInfoKt.Dsl.Companion companion = MediationInfoKt.Dsl.INSTANCE;
        MediationInfoOuterClass.MediationInfo.Builder builder = mediationInfo.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        MediationInfoKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
