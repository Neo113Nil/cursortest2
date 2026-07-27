package gatewayprotocol.v1;

import gatewayprotocol.v1.AudienceManagementRequestKt;
import gatewayprotocol.v1.AudienceManagementRequestOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudienceManagementRequestKt.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"audienceManagementRequest", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/AudienceManagementRequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeaudienceManagementRequest", "copy", "sessionCountersOrNull", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequestOrBuilder;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequestOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AudienceManagementRequestKtKt {
    /* renamed from: -initializeaudienceManagementRequest, reason: not valid java name */
    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest m7797initializeaudienceManagementRequest(Function1<? super AudienceManagementRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AudienceManagementRequestKt.Dsl.Companion companion = AudienceManagementRequestKt.Dsl.INSTANCE;
        AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder newBuilder = AudienceManagementRequestOuterClass.AudienceManagementRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        AudienceManagementRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest copy(AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest, Function1<? super AudienceManagementRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(audienceManagementRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        AudienceManagementRequestKt.Dsl.Companion companion = AudienceManagementRequestKt.Dsl.INSTANCE;
        AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder = audienceManagementRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        AudienceManagementRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasSessionCounters()) {
            return audienceManagementRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasStaticDeviceInfo()) {
            return audienceManagementRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasDynamicDeviceInfo()) {
            return audienceManagementRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }
}
