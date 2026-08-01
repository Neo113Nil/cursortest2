package gatewayprotocol.v1;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.LifecycleEventRequestKt;
import gatewayprotocol.v1.LifecycleEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LifecycleEventRequestKt.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"lifecycleEventRequest", "Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/LifecycleEventRequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializelifecycleEventRequest", "copy", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequestOrBuilder;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LifecycleEventRequestKtKt {
    /* renamed from: -initializelifecycleEventRequest, reason: not valid java name */
    public static final LifecycleEventRequestOuterClass.LifecycleEventRequest m7828initializelifecycleEventRequest(Function1<? super LifecycleEventRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        LifecycleEventRequestKt.Dsl.Companion companion = LifecycleEventRequestKt.Dsl.INSTANCE;
        LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder newBuilder = LifecycleEventRequestOuterClass.LifecycleEventRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        LifecycleEventRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final LifecycleEventRequestOuterClass.LifecycleEventRequest copy(LifecycleEventRequestOuterClass.LifecycleEventRequest lifecycleEventRequest, Function1<? super LifecycleEventRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(lifecycleEventRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        LifecycleEventRequestKt.Dsl.Companion companion = LifecycleEventRequestKt.Dsl.INSTANCE;
        LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder builder = lifecycleEventRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        LifecycleEventRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder lifecycleEventRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(lifecycleEventRequestOrBuilder, "<this>");
        if (lifecycleEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return lifecycleEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(LifecycleEventRequestOuterClass.LifecycleEventRequestOrBuilder lifecycleEventRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(lifecycleEventRequestOrBuilder, "<this>");
        if (lifecycleEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return lifecycleEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }
}
