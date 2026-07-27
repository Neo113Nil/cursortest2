package com.moloco.sdk.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.C4787b;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.BannerAdSize;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.moloco.sdk.publisher.Moloco$createMolocoBanner$1", f = "Moloco.kt", i = {}, l = {326, 327, 328, 329, 330}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class Moloco$createMolocoBanner$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $adUnitId;
    final /* synthetic */ Function2<Banner, MolocoAdError.AdCreateError, Unit> $callback;
    final /* synthetic */ MediationInfo $mediationInfo;
    final /* synthetic */ BannerAdSize $size;
    final /* synthetic */ String $watermarkString;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Moloco$createMolocoBanner$1(MediationInfo mediationInfo, BannerAdSize bannerAdSize, String str, String str2, Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> function2, Continuation<? super Moloco$createMolocoBanner$1> continuation) {
        super(2, continuation);
        this.$mediationInfo = mediationInfo;
        this.$size = bannerAdSize;
        this.$adUnitId = str;
        this.$watermarkString = str2;
        this.$callback = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Moloco$createMolocoBanner$1(this.$mediationInfo, this.$size, this.$adUnitId, this.$watermarkString, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C4787b adCreator;
        C4787b adCreator2;
        C4787b adCreator3;
        C4787b adCreator4;
        C4787b adCreator5;
        x xVar;
        Pair pair;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MetricsRecorder create = MetricsRecorder.INSTANCE.create(this.$mediationInfo.getName());
            BannerAdSize bannerAdSize = this.$size;
            if (Intrinsics.areEqual(bannerAdSize, BannerAdSize.Standard.INSTANCE)) {
                adCreator5 = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                obj = adCreator5.a(name, str, create, str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                xVar = (x) obj;
            } else if (Intrinsics.areEqual(bannerAdSize, BannerAdSize.Tablet.INSTANCE)) {
                adCreator4 = Moloco.INSTANCE.getAdCreator();
                String name2 = this.$mediationInfo.getName();
                String str3 = this.$adUnitId;
                String str4 = this.$watermarkString;
                this.label = 2;
                obj = adCreator4.b(name2, str3, create, str4, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                xVar = (x) obj;
            } else if (Intrinsics.areEqual(bannerAdSize, BannerAdSize.MREC.INSTANCE)) {
                adCreator3 = Moloco.INSTANCE.getAdCreator();
                String name3 = this.$mediationInfo.getName();
                String str5 = this.$adUnitId;
                String str6 = this.$watermarkString;
                this.label = 3;
                obj = adCreator3.d(name3, str5, create, str6, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                xVar = (x) obj;
            } else if (bannerAdSize instanceof BannerAdSize.InlineAdaptive) {
                adCreator2 = Moloco.INSTANCE.getAdCreator();
                String name4 = this.$mediationInfo.getName();
                Integer availableWidth = ((BannerAdSize.InlineAdaptive) this.$size).getAvailableWidth();
                String str7 = this.$adUnitId;
                String str8 = this.$watermarkString;
                this.label = 4;
                obj = adCreator2.a(name4, availableWidth, str7, create, str8, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                xVar = (x) obj;
            } else {
                if (!(bannerAdSize instanceof BannerAdSize.AnchoredAdaptive)) {
                    throw new NoWhenBranchMatchedException();
                }
                adCreator = Moloco.INSTANCE.getAdCreator();
                String name5 = this.$mediationInfo.getName();
                Integer availableWidth2 = ((BannerAdSize.AnchoredAdaptive) this.$size).getAvailableWidth();
                String str9 = this.$adUnitId;
                String str10 = this.$watermarkString;
                this.label = 5;
                obj = adCreator.b(name5, availableWidth2, str9, create, str10, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                xVar = (x) obj;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            xVar = (x) obj;
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            xVar = (x) obj;
        } else if (i == 3) {
            ResultKt.throwOnFailure(obj);
            xVar = (x) obj;
        } else if (i == 4) {
            ResultKt.throwOnFailure(obj);
            xVar = (x) obj;
        } else {
            if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            xVar = (x) obj;
        }
        if (xVar instanceof x.b) {
            pair = TuplesKt.to(((x.b) xVar).a(), null);
        } else {
            if (!(xVar instanceof x.a)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = TuplesKt.to(null, ((x.a) xVar).a());
        }
        Banner banner = (Banner) pair.component1();
        MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pair.component2();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Moloco banner for adUnitId: " + this.$adUnitId + " has error: " + (banner == null), null, false, 12, null);
        this.$callback.invoke(banner, adCreateError);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Moloco$createMolocoBanner$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
