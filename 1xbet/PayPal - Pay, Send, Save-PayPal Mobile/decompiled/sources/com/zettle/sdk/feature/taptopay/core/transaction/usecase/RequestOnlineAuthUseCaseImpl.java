package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JD\u0010\u000e\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u0010*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase;", "Lcom/zettle/sdk/core/log/Loggable;", "<init>", "()V", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "", "", "map", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase$Result;", "", "block", "invoke", "([BLjava/util/Map;Lkotlin/jvm/functions/Function1;)V", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RequestOnlineAuthUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase, com.zettle.sdk.core.log.Loggable {
    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(byte[] bArr, java.util.Map<java.lang.String, byte[]> map, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result, ? extends kotlin.Unit> function1) {
        invoke2(bArr, map, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(byte[] bytes, java.util.Map<java.lang.String, byte[]> map, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result, kotlin.Unit> block) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String hexString$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        if (map == null || map.isEmpty()) {
            block.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.MapWithEMVTagsEmptyOrNull.INSTANCE));
            return;
        }
        if (!map.containsKey(my.com.softspace.ssfasstapsdk.common.Utils.Constants.ONLINE_HOST_MSG_GROUPING) || !map.containsKey("D01E")) {
            block.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.CVMorEMVTagsMissing.INSTANCE));
            return;
        }
        byte[] bArr = bytes != null ? (byte[]) bytes.clone() : null;
        byte[] bArr2 = map.get(my.com.softspace.ssfasstapsdk.common.Utils.Constants.ONLINE_HOST_MSG_GROUPING);
        byte[] bArr3 = bArr2 != null ? (byte[]) bArr2.clone() : null;
        byte[] bArr4 = map.get("D01E");
        byte[] bArr5 = bArr4 != null ? (byte[]) bArr4.clone() : null;
        byte[] bArr6 = map.get("D023");
        byte[] bArr7 = bArr6 != null ? (byte[]) bArr6.clone() : null;
        byte[] bArr8 = map.get("DF28");
        byte[] bArr9 = bArr8 != null ? (byte[]) bArr8.clone() : null;
        com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType from = (bArr5 == null || (hexString$default = com.zettle.sdk.io.BuffersKt.toHexString$default(bArr5, 0, 0, 3, null)) == null) ? null : com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType.INSTANCE.from(hexString$default);
        java.lang.String hexString$default2 = bArr != null ? com.zettle.sdk.io.BuffersKt.toHexString$default(bArr, 0, 0, 3, null) : null;
        if (!getHighSpeedVideoFpsRanges(hexString$default2)) {
            block.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidKSN.INSTANCE));
            return;
        }
        java.lang.String hexString$default3 = bArr3 != null ? com.zettle.sdk.io.BuffersKt.toHexString$default(bArr3, 0, 0, 3, null) : null;
        if (!getHighSpeedVideoFpsRanges(hexString$default3)) {
            block.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidCardPayload.INSTANCE));
            return;
        }
        java.lang.String hexString$default4 = bArr9 != null ? com.zettle.sdk.io.BuffersKt.toHexString$default(bArr9, 0, 0, 3, null) : null;
        if (!getHighSpeedVideoFpsRanges(hexString$default4)) {
            block.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidMAC.INSTANCE));
            return;
        }
        if (from != null && bArr7 != null && (str = hexString$default2) != null && str.length() != 0 && (str2 = hexString$default3) != null && str2.length() != 0 && (str3 = hexString$default4) != null && str3.length() != 0) {
            block.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result.RequestOnlineAuth(new com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage(hexString$default2, hexString$default3, bArr7, from, hexString$default4)));
        } else {
            block.invoke(new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.InvalidArguments.INSTANCE));
        }
    }

    private static boolean getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String replace = kotlin.text.Regex.INSTANCE.fromLiteral("0").replace(str, "");
        return replace != null && replace.length() > 0;
    }
}
