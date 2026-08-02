package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0017J7\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState$Error;", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState$Error;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState$Content;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState$Content;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState$DownloadError;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState$DownloadError;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsEvent;)Larrow/core/Either;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/mvi/TaxDocumentsUiState;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxDocumentsReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public TaxDocumentsReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "TaxDocumentsReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect>> reduce(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState state, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Loading)) {
            if (state instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Error) {
                return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Error) state, event);
            }
            if (state instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content) {
                return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content) state, event);
            }
            if (!(state instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading)) {
                if (state instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.DownloadError) {
                    return getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.DownloadError) state, event);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading downloading = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading) state;
            if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted) {
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted downloadCompleted = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(downloading.getPreviousState(), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDownloadedFile(downloadCompleted.getFileUri(), downloadCompleted.getFileName(), downloadCompleted.getMimeType()));
            }
            if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.DownloadError(downloading.getDownloadUrl(), downloading.getPreviousState()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(downloading, null, 2, null);
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Loading loading = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Loading) state;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.Initialize.INSTANCE)) {
            if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.AvailableYearsLoaded) {
                java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear> yearList = ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.AvailableYearsLoaded) event).getData().getYearList();
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear taxYear = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) yearList);
                java.lang.String year = taxYear != null ? taxYear.getYear() : null;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content(yearList, year == null ? "" : year, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.ReportContentState.Loading.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.FaqState.Loading.INSTANCE, false, false, false, 112, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Loading.copy$default(loading, null, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected) event).getYear(), 1, null), null, 2, null);
            }
            if (!(event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ShowLoader)) {
                if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content(loading.getAvailableYears(), loading.getSelectedYear(), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.ReportContentState.Success(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded) event).getSections()), null, false, false, false, 120, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoadFailed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content(loading.getAvailableYears(), loading.getSelectedYear(), com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.ReportContentState.Error.INSTANCE, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.FaqState.Loading.INSTANCE, false, false, false, 112, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.InitializationFailed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Error(kotlin.collections.CollectionsKt.emptyList(), "", ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.InitializationFailed) event).getErrorMessage()), null, 2, null);
                }
            }
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect>> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Error p0, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent p1) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.Initialize.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Loading(null, null, 3, null), null, 2, null);
        }
        if (p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Error.copy$default(p0, null, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected) p1).getYear(), null, 5, null), null, 2, null);
        }
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            defaultRaise.raise(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(p0, p1));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01eb, code lost:
    
        if ((r2 != null ? r2.getType() : null) != com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.DOWNLOAD) goto L114;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect>> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content p0, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent p1) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect>> output;
        if (kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.Initialize.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
        }
        if (!(p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.AvailableYearsLoaded)) {
            if (p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.InitializationFailed) {
                arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
                try {
                    defaultRaise.raise(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(p0, p1));
                    throw new kotlin.KotlinNothingValueException();
                } catch (arrow.core.raise.RaiseCancellationException e) {
                    defaultRaise.complete();
                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                } catch (java.lang.Throwable th) {
                    defaultRaise.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                }
            }
            boolean z = p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected;
            if (z || (p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ShowLoader) || (p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded) || (p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoadFailed)) {
                if (!z) {
                    if (!(p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ShowLoader)) {
                        if (!(p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded)) {
                            if (!(p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoadFailed)) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content.copy$default(p0, null, null, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.ReportContentState.Error.INSTANCE, null, false, false, false, 91, null), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content.copy$default(p0, null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.ReportContentState.Success(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportsLoaded) p1).getSections()), null, false, false, false, 75, null), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content.copy$default(p0, null, null, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.ReportContentState.Loading.INSTANCE, null, false, !p0.isInitialLoad(), false, 91, null), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content.copy$default(p0, null, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.YearSelected) p1).getYear(), com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.ReportContentState.Loading.INSTANCE, null, !(p0.getReportContentState() instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.ReportContentState.Success), false, false, 105, null), null, 2, null);
            }
            boolean z2 = p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoaded;
            if (z2 || (p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoadFailed) || (p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqViewMoreClicked) || (p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqItemClicked)) {
                if (!z2) {
                    if (!(p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoadFailed)) {
                        if (!(p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqViewMoreClicked)) {
                            if (!(p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqItemClicked)) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDeeplink(com.paypal.oslo.feature.taxanddocumentcenter.ui.util.UrlUtils.INSTANCE.buildHelpCenterArticlePath$tax_and_document_center_prodRelease(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqItemClicked) p1).getItem().getId()), false));
                        }
                        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.FaqState faqState = p0.getFaqState();
                        if (faqState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.FaqState.Loaded) {
                            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.FaqState.Loaded loaded = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.FaqState.Loaded) faqState;
                            if (!loaded.isExpanded()) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content.copy$default(p0, null, null, null, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.FaqState.Loaded.copy$default(loaded, null, true, 1, null), false, false, false, 119, null), null, 2, null);
                            }
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content.copy$default(p0, null, null, null, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.FaqState.Error.INSTANCE, false, false, false, 119, null), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content.copy$default(p0, null, null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.FaqState.Loaded(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.FaqsLoaded) p1).getItems(), false, 2, null), false, false, false, 119, null), null, 2, null);
            }
            boolean z3 = p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked;
            if (z3 || (p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked)) {
                if (z3) {
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked reportCardClicked = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportCardClicked) p1;
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta = reportCardClicked.getCta();
                    com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus = reportCardClicked.getReportStatus();
                    if (reportStatus == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.INPROGRESS && reportCardClicked.getInlineNoteToastMessage() != null) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowToast(reportCardClicked.getInlineNoteToastMessage()));
                    }
                    if (reportStatus == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.DOWNLOADABLE) {
                    }
                    if ((cta != null ? cta.getType() : null) == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.HALF_SHEET && cta.getSheetType() == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain.MULTI_SAVING) {
                        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData multiSavingsSheetData = cta.getMultiSavingsSheetData();
                        return (multiSavingsSheetData == null || (output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenMultiSavingsSheet(multiSavingsSheetData))) == null) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null) : output;
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                }
                if (!(p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                }
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta cta2 = ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReportLinkClicked) p1).getCta();
                if ((cta2 != null ? cta2.getType() : null) == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.DEEPLINK && cta2.getLinkName() == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain.SELF_CORRECTION_1099K) {
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.LinkDescription linkDescription = cta2.getLinkDescription();
                    if ((linkDescription != null ? linkDescription.getHref() : null) != null) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDeeplink(cta2.getLinkDescription().getHref(), true));
                    }
                }
                if ((cta2 != null ? cta2.getType() : null) != com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.GRAPHQL || cta2.getLinkName() != com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain.SELF_CORRECTION_1099K) {
                    if ((cta2 != null ? cta2.getType() : null) == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.HALF_SHEET && cta2.getLinkName() == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain.REQUEST_STATEMENT && cta2.getSheetType() == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain.RECON && cta2.getSheetData() != null) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenReconSheet(cta2.getSheetData()));
                    }
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
            }
            boolean z4 = p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestInProgress;
            if (z4 || kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestSuccess.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestFailed.INSTANCE)) {
                if (!z4) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestSuccess.INSTANCE)) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestFailed.INSTANCE)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconciliationFailure.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconciliationSuccess.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconSheetLoading.INSTANCE);
            }
            boolean z5 = p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestInProgress;
            if (z5 || (p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestSuccess) || kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestFailed.INSTANCE)) {
                if (!z5) {
                    if (!(p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestSuccess)) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(p1, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestFailed.INSTANCE)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content.copy$default(p0, null, null, null, null, false, false, false, 63, null), com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowSelfCorrectionFailure.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content.copy$default(p0, null, null, null, null, false, false, false, 63, null), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.NavigateToSelfCorrectionFlow(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestSuccess) p1).getDeepLink()));
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content.copy$default(p0, null, null, null, null, false, false, true, 63, null), null, 2, null);
            }
            boolean z6 = p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadStarted;
            if (!z6 && !(p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted) && !(p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadFailed)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
            }
            if (!z6) {
                if (!(p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted)) {
                    return p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadFailed ? getHighSpeedVideoFpsRanges(p0) : com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
                }
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content content = p0;
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted downloadCompleted = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted) p1;
                android.net.Uri fileUri = downloadCompleted.getFileUri();
                java.lang.String fileName = downloadCompleted.getFileName();
                java.lang.String mimeType = downloadCompleted.getMimeType();
                if (content instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading) {
                    content = ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading) content).getPreviousState();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDownloadedFile(fileUri, fileName, mimeType));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadStarted) p1).getDownloadUrl(), p0), null, 2, null);
        }
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear> yearList = ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.AvailableYearsLoaded) p1).getData().getYearList();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear taxYear = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) yearList);
        java.lang.String year = taxYear != null ? taxYear.getYear() : null;
        if (year == null) {
            year = "";
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content(yearList, year, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.ReportContentState.Loading.INSTANCE, p0.getFaqState(), false, false, false, 112, null), null, 2, null);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect>> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.DownloadError p0, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent p1) {
        if (p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DismissDownloadError) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0.getPreviousState(), null, 2, null);
        }
        if (p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RetryDownload) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.RetryDownload) p1).getDownloadUrl(), p0.getPreviousState()), null, 2, null);
        }
        if (p1 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadStarted) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadStarted) p1).getDownloadUrl(), p0.getPreviousState()), null, 2, null);
        }
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            defaultRaise.raise(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(p0, p1));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect>> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState p0) {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content content;
        boolean z = p0 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading downloading = z ? (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading) p0 : null;
        java.lang.String downloadUrl = downloading != null ? downloading.getDownloadUrl() : null;
        if (downloadUrl == null) {
            downloadUrl = "";
        }
        if (z) {
            content = ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading) p0).getPreviousState();
        } else {
            content = p0 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content ? (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content) p0 : null;
        }
        if (content != null) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.DownloadError(downloadUrl, content), null, 2, null);
        }
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            defaultRaise.raise(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(p0, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadFailed("")));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
