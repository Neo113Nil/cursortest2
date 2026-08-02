package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer", f = "CardTokenResumer.kt", i = {0, 0, 0}, l = {76}, m = "executeResumeCardMutation", n = {"deviceWalletServiceCardId", "input", "mutation"}, nl = {131}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class CardTokenResumer$executeResumeCardMutation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputFormats.getHighSpeedVideoFpsRangesFor(null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardTokenResumer$executeResumeCardMutation$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer cardTokenResumer, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenResumer$executeResumeCardMutation$1> continuation) {
        super(continuation);
        this.getOutputFormats = cardTokenResumer;
    }
}
