package gatewayprotocol.v1;

import gatewayprotocol.v1.AdRevenueEventRequestKt;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdRevenueEventRequestKt.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"adRevenueEventRequest", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/AdRevenueEventRequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeadRevenueEventRequest", "copy", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequestOrBuilder;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "adRevenueDataOrNull", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "getAdRevenueDataOrNull", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequestOrBuilder;)Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdRevenueEventRequestKtKt {
    /* renamed from: -initializeadRevenueEventRequest, reason: not valid java name */
    public static final AdRevenueEventRequestOuterClass.AdRevenueEventRequest m7795initializeadRevenueEventRequest(Function1<? super AdRevenueEventRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AdRevenueEventRequestKt.Dsl.Companion companion = AdRevenueEventRequestKt.Dsl.INSTANCE;
        AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder newBuilder = AdRevenueEventRequestOuterClass.AdRevenueEventRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        AdRevenueEventRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdRevenueEventRequestOuterClass.AdRevenueEventRequest copy(AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest, Function1<? super AdRevenueEventRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(adRevenueEventRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        AdRevenueEventRequestKt.Dsl.Companion companion = AdRevenueEventRequestKt.Dsl.INSTANCE;
        AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder builder = adRevenueEventRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        AdRevenueEventRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder adRevenueEventRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRevenueEventRequestOrBuilder, "<this>");
        if (adRevenueEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return adRevenueEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder adRevenueEventRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRevenueEventRequestOrBuilder, "<this>");
        if (adRevenueEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adRevenueEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final AdRevenueEventRequestOuterClass.AdRevenueData getAdRevenueDataOrNull(AdRevenueEventRequestOuterClass.AdRevenueEventRequestOrBuilder adRevenueEventRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRevenueEventRequestOrBuilder, "<this>");
        if (adRevenueEventRequestOrBuilder.hasAdRevenueData()) {
            return adRevenueEventRequestOrBuilder.getAdRevenueData();
        }
        return null;
    }
}
