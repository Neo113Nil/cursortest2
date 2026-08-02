package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/NameMetadataError;", "Lcom/paypal/oslo/core/i18n/domain/model/name/NameMetadata;", "countryMetadata", "Lkotlinx/serialization/json/JsonObject;", "labelMetadata"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl$getNameMetadata$1", f = "NameRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes2.dex */
final class NameRepositoryImpl$getNameMetadata$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.NameMetadataError, ? extends kotlinx.serialization.json.JsonObject>, arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.NameMetadataError, ? extends kotlinx.serialization.json.JsonObject>, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.NameMetadataError, ? extends com.paypal.oslo.core.i18n.domain.model.name.NameMetadata>>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Locale getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String languageTag;
        java.lang.String languageTag2;
        java.lang.String str = "null";
        arrow.core.Either either = (arrow.core.Either) this.getHighSpeedVideoFpsRangesFor;
        arrow.core.Either either2 = (arrow.core.Either) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (either instanceof arrow.core.Either.Left) {
            return arrow.core.EitherKt.left(((arrow.core.Either.Left) either).getValue());
        }
        if (either2 instanceof arrow.core.Either.Left) {
            return arrow.core.EitherKt.left(((arrow.core.Either.Left) either2).getValue());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(either, "");
        kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) ((arrow.core.Either.Right) either).getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(either2, "");
        try {
            return arrow.core.EitherKt.right(com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl.access$processMetadata(this.getHighSpeedVideoSizesFor, jsonObject, (kotlinx.serialization.json.JsonObject) ((arrow.core.Either.Right) either2).getValue(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI));
        } catch (java.lang.IllegalStateException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.i18n.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to("errorType", "illegal_state");
            java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (str2 == null) {
                str2 = "null";
            }
            pairArr[1] = kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, str2);
            java.util.Locale locale = this.getHighSpeedVideoFpsRanges;
            if (locale != null && (languageTag2 = locale.toLanguageTag()) != null) {
                str = languageTag2;
            }
            pairArr[2] = kotlin.TuplesKt.to("locale", str);
            java.lang.IllegalStateException illegalStateException = e;
            com.paypal.android.logger.Logger.e$default(logger, "Failed to parse name metadata", kotlin.collections.MapsKt.mapOf(pairArr), null, illegalStateException, 4, null);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Illegal state failure";
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.NameMetadataError.ParsingFailure(message, illegalStateException));
        } catch (kotlinx.serialization.SerializationException e2) {
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.i18n.LoggerKt.log;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
            pairArr2[0] = kotlin.TuplesKt.to("errorType", "serialization");
            java.lang.String str3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (str3 == null) {
                str3 = "null";
            }
            pairArr2[1] = kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, str3);
            java.util.Locale locale2 = this.getHighSpeedVideoFpsRanges;
            if (locale2 != null && (languageTag = locale2.toLanguageTag()) != null) {
                str = languageTag;
            }
            pairArr2[2] = kotlin.TuplesKt.to("locale", str);
            kotlinx.serialization.SerializationException serializationException = e2;
            com.paypal.android.logger.Logger.e$default(logger2, "Failed to parse name metadata", kotlin.collections.MapsKt.mapOf(pairArr2), null, serializationException, 4, null);
            java.lang.String message2 = e2.getMessage();
            if (message2 == null) {
                message2 = "Serialization failure";
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.NameMetadataError.ParsingFailure(message2, serializationException));
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.NameMetadataError, ? extends kotlinx.serialization.json.JsonObject> either, arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.NameMetadataError, ? extends kotlinx.serialization.json.JsonObject> either2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.NameMetadataError, ? extends com.paypal.oslo.core.i18n.domain.model.name.NameMetadata>> continuation) {
        com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl$getNameMetadata$1 nameRepositoryImpl$getNameMetadata$1 = new com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl$getNameMetadata$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        nameRepositoryImpl$getNameMetadata$1.getHighSpeedVideoFpsRangesFor = either;
        nameRepositoryImpl$getNameMetadata$1.Camera2StreamConfigurationMap = either2;
        return nameRepositoryImpl$getNameMetadata$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NameRepositoryImpl$getNameMetadata$1(com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl nameRepositoryImpl, java.util.Locale locale, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl$getNameMetadata$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizesFor = nameRepositoryImpl;
        this.getHighSpeedVideoFpsRanges = locale;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
