package com.paypal.oslo.feature.helpcenter.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchEducationalSheetDataUseCase;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchIpsArticlesUseCase;", "fetchIpsArticlesUseCase", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchArticleUseCase;", "fetchArticleUseCase", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchIpsArticlesUseCase;Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchArticleUseCase;)V", "", "productReferenceId", "pageReferenceId", "fieldReferenceId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterDomainError;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/EducationalSheetData;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchIpsArticlesUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchArticleUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FetchEducationalSheetDataUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public FetchEducationalSheetDataUseCase(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase fetchIpsArticlesUseCase, com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase fetchArticleUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchIpsArticlesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchArticleUseCase, "");
        this.getHighSpeedVideoSizes = fetchIpsArticlesUseCase;
        this.getHighSpeedVideoFpsRanges = fetchArticleUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0152 A[Catch: all -> 0x005a, RaiseCancellationException -> 0x005d, TryCatch #3 {RaiseCancellationException -> 0x005d, all -> 0x005a, blocks: (B:13:0x0055, B:14:0x0133, B:15:0x014c, B:17:0x0152, B:20:0x016f, B:25:0x0173), top: B:12:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2 A[Catch: all -> 0x0094, RaiseCancellationException -> 0x0097, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0097, all -> 0x0094, blocks: (B:40:0x0088, B:42:0x00de, B:44:0x00f2, B:48:0x0189, B:49:0x019a, B:51:0x00a3), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0189 A[Catch: all -> 0x0094, RaiseCancellationException -> 0x0097, TRY_ENTER, TryCatch #4 {RaiseCancellationException -> 0x0097, all -> 0x0094, blocks: (B:40:0x0088, B:42:0x00de, B:44:0x00f2, B:48:0x0189, B:49:0x019a, B:51:0x00a3), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError, com.paypal.oslo.feature.helpcenter.domain.models.EducationalSheetData>> continuation) {
        com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase$invoke$1 fetchEducationalSheetDataUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        int i2;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        int i3;
        int i4;
        int i5;
        com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData ipsArticleData;
        java.util.List list;
        com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData ipsArticleData2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase$invoke$1) {
                fetchEducationalSheetDataUseCase$invoke$1 = (com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase$invoke$1) continuation;
                if ((fetchEducationalSheetDataUseCase$invoke$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    fetchEducationalSheetDataUseCase$invoke$1.getOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = fetchEducationalSheetDataUseCase$invoke$1.getOutputStallDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fetchEducationalSheetDataUseCase$invoke$1.getOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i2 = 0;
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase fetchIpsArticlesUseCase = this.getHighSpeedVideoSizes;
                        fetchEducationalSheetDataUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        fetchEducationalSheetDataUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        fetchEducationalSheetDataUseCase$invoke$1.getOutputFormats = defaultRaise;
                        fetchEducationalSheetDataUseCase$invoke$1.getInputFormats = defaultRaise3;
                        fetchEducationalSheetDataUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise3;
                        fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        fetchEducationalSheetDataUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        fetchEducationalSheetDataUseCase$invoke$1.getOutputSizeshNQ4ISI = 1;
                        obj = fetchIpsArticlesUseCase.invoke(str, str2, str3, fetchEducationalSheetDataUseCase$invoke$1);
                        if (obj != coroutine_suspended) {
                            str4 = str;
                            str5 = str2;
                            str6 = str3;
                            raise = defaultRaise3;
                            raise2 = raise;
                            i3 = 0;
                            i4 = 0;
                            i5 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i7 = fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i8 = fetchEducationalSheetDataUseCase$invoke$1.Camera2StreamConfigurationMap;
                        int i9 = fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        ipsArticleData2 = (com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData) fetchEducationalSheetDataUseCase$invoke$1.getOutputSizes;
                        list = (java.util.List) fetchEducationalSheetDataUseCase$invoke$1.getOutputStallDuration;
                        raise = (arrow.core.raise.Raise) fetchEducationalSheetDataUseCase$invoke$1.getOutputMinFrameDuration;
                        defaultRaise2 = (arrow.core.raise.DefaultRaise) fetchEducationalSheetDataUseCase$invoke$1.getOutputFormats;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.paypal.oslo.feature.helpcenter.domain.models.Article article = (com.paypal.oslo.feature.helpcenter.domain.models.Article) raise.bind(((arrow.core.Ior) obj).toEither());
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj2 : list) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData) obj2).getArticlePreview().getId(), ipsArticleData2.getArticlePreview().getId())) {
                                    arrayList.add(obj2);
                                }
                            }
                            com.paypal.oslo.feature.helpcenter.domain.models.EducationalSheetData educationalSheetData = new com.paypal.oslo.feature.helpcenter.domain.models.EducationalSheetData(article, arrayList);
                            defaultRaise2.complete();
                            return new arrow.core.Either.Right(educationalSheetData);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise2;
                            defaultRaise4.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise4));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise2;
                            defaultRaise5.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    i2 = fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i10 = fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i11 = fetchEducationalSheetDataUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i12 = fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    arrow.core.raise.Raise raise3 = (arrow.core.raise.Raise) fetchEducationalSheetDataUseCase$invoke$1.getOutputMinFrameDuration;
                    arrow.core.raise.Raise raise4 = (arrow.core.raise.Raise) fetchEducationalSheetDataUseCase$invoke$1.getInputFormats;
                    defaultRaise = (arrow.core.raise.DefaultRaise) fetchEducationalSheetDataUseCase$invoke$1.getOutputFormats;
                    str6 = (java.lang.String) fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    str5 = (java.lang.String) fetchEducationalSheetDataUseCase$invoke$1.getInputSizeshNQ4ISI;
                    str4 = (java.lang.String) fetchEducationalSheetDataUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i3 = i10;
                    raise = raise4;
                    raise2 = raise3;
                    i5 = i12;
                    i4 = i11;
                    java.util.List list2 = (java.util.List) raise2.bind(((arrow.core.Ior) obj).toEither());
                    ipsArticleData = (com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData) kotlin.collections.CollectionsKt.firstOrNull(list2);
                    if (ipsArticleData != null) {
                        raise.raise(new com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError("No IPS articles found", null, 2, null));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase fetchArticleUseCase = this.getHighSpeedVideoFpsRanges;
                    java.lang.String id = ipsArticleData.getArticlePreview().getId();
                    fetchEducationalSheetDataUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                    fetchEducationalSheetDataUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                    fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                    fetchEducationalSheetDataUseCase$invoke$1.getOutputFormats = defaultRaise;
                    fetchEducationalSheetDataUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                    fetchEducationalSheetDataUseCase$invoke$1.getOutputMinFrameDuration = raise;
                    fetchEducationalSheetDataUseCase$invoke$1.getOutputStallDuration = list2;
                    fetchEducationalSheetDataUseCase$invoke$1.getOutputSizes = ipsArticleData;
                    fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoFpsRanges = i5;
                    fetchEducationalSheetDataUseCase$invoke$1.Camera2StreamConfigurationMap = i4;
                    fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoSizes = i3;
                    fetchEducationalSheetDataUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
                    fetchEducationalSheetDataUseCase$invoke$1.getOutputSizeshNQ4ISI = 2;
                    java.lang.Object invoke = fetchArticleUseCase.invoke(id, fetchEducationalSheetDataUseCase$invoke$1);
                    if (invoke != coroutine_suspended) {
                        list = list2;
                        obj = invoke;
                        ipsArticleData2 = ipsArticleData;
                        defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.helpcenter.domain.models.Article article2 = (com.paypal.oslo.feature.helpcenter.domain.models.Article) raise.bind(((arrow.core.Ior) obj).toEither());
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        while (r4.hasNext()) {
                        }
                        com.paypal.oslo.feature.helpcenter.domain.models.EducationalSheetData educationalSheetData2 = new com.paypal.oslo.feature.helpcenter.domain.models.EducationalSheetData(article2, arrayList2);
                        defaultRaise2.complete();
                        return new arrow.core.Either.Right(educationalSheetData2);
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            java.util.List list22 = (java.util.List) raise2.bind(((arrow.core.Ior) obj).toEither());
            ipsArticleData = (com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData) kotlin.collections.CollectionsKt.firstOrNull(list22);
            if (ipsArticleData != null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        fetchEducationalSheetDataUseCase$invoke$1 = new com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase$invoke$1(this, continuation);
        java.lang.Object obj3 = fetchEducationalSheetDataUseCase$invoke$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchEducationalSheetDataUseCase$invoke$1.getOutputSizeshNQ4ISI;
    }
}
