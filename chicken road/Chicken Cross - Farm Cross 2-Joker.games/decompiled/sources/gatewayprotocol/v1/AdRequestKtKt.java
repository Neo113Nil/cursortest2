package gatewayprotocol.v1;

import gatewayprotocol.v1.AdRequestKt;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdRequestKt.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"adRequest", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/AdRequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeadRequest", "copy", "sessionCountersOrNull", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "campaignStateOrNull", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "getCampaignStateOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "bannerSizeOrNull", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "getBannerSizeOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "mediationInfoOrNull", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestOrBuilder;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdRequestKtKt {
    /* renamed from: -initializeadRequest, reason: not valid java name */
    public static final AdRequestOuterClass.AdRequest m7792initializeadRequest(Function1<? super AdRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.INSTANCE;
        AdRequestOuterClass.AdRequest.Builder newBuilder = AdRequestOuterClass.AdRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        AdRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdRequestOuterClass.AdRequest copy(AdRequestOuterClass.AdRequest adRequest, Function1<? super AdRequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(adRequest, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.INSTANCE;
        AdRequestOuterClass.AdRequest.Builder builder = adRequest.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        AdRequestKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasSessionCounters()) {
            return adRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasStaticDeviceInfo()) {
            return adRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasCampaignState()) {
            return adRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final AdRequestOuterClass.BannerSize getBannerSizeOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasBannerSize()) {
            return adRequestOrBuilder.getBannerSize();
        }
        return null;
    }

    public static final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        Intrinsics.checkNotNullParameter(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasMediationInfo()) {
            return adRequestOrBuilder.getMediationInfo();
        }
        return null;
    }
}
