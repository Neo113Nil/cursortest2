package com.paypal.oslo.feature.home.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001a2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00120\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiEffect;", "Lcom/paypal/oslo/feature/home/ui/navigation/HomeNavigationRouter;", "navigationRouter", "Lcom/paypal/oslo/feature/home/domain/loading/LoadingSectionProvider;", "loadingSectionProvider", "<init>", "(Lcom/paypal/oslo/feature/home/ui/navigation/HomeNavigationRouter;Lcom/paypal/oslo/feature/home/domain/loading/LoadingSectionProvider;)V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState;Lcom/paypal/oslo/feature/home/ui/mvi/HomeEvent;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/home/ui/navigation/HomeNavigationRouter;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/home/domain/loading/LoadingSectionProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HomeReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.home.ui.mvi.HomeUiState, com.paypal.oslo.feature.home.ui.mvi.HomeEvent, com.paypal.oslo.feature.home.ui.mvi.HomeUiEffect> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;

    @javax.inject.Inject
    public HomeReducer(com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter homeNavigationRouter, com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider loadingSectionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeNavigationRouter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingSectionProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = homeNavigationRouter;
        this.getHighSpeedVideoFpsRanges = loadingSectionProvider;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "HomeReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.home.ui.mvi.HomeUiState, com.paypal.oslo.feature.home.ui.mvi.HomeUiEffect>> reduce(com.paypal.oslo.feature.home.ui.mvi.HomeUiState state, final com.paypal.oslo.feature.home.ui.mvi.HomeEvent event) {
        java.util.List listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success)) {
                if (!(state instanceof com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Error error = (com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Error) state;
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.mvi.HomeEvent.LoadContent.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RefreshContent.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Loading(com.paypal.oslo.feature.home.ui.loading.FullScreenLoadingSkeleton.INSTANCE.create(this.getHighSpeedVideoFpsRanges)), null, 2, null);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.mvi.HomeEvent.SilentRefreshWalletSnapshot.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.mvi.HomeEvent.SilentRefreshHomeFeedSections.INSTANCE) || (event instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.WalletSnapshotRefreshed)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded) {
                    com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded contentLoaded = (com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded) event;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success(contentLoaded.getSections(), 0, 0, contentLoaded.getHapticFeedbackEnabled(), 6, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoadFailed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Error.copy$default(error, ((com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoadFailed) event).getErrorMessage(), null, 2, null), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
            com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success success = (com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RefreshContent.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Loading(com.paypal.oslo.feature.home.ui.loading.FullScreenLoadingSkeleton.INSTANCE.create(this.getHighSpeedVideoFpsRanges)), null, 2, null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.mvi.HomeEvent.SilentRefreshHomeFeedSections.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RetrySectionLoad) {
                java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> sections = success.getSections();
                java.lang.String sectionId = ((com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RetrySectionLoad) event).getSectionId();
                kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.mvi.HomeReducer$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.mvi.HomeReducer.m14980$r8$lambda$GF72mMUylB23mv3WswZ5UmPH5U(com.paypal.oslo.feature.home.ui.mvi.HomeReducer.this, event, (com.paypal.oslo.feature.home.domain.model.Section) obj);
                    }
                };
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<T> it = sections.iterator();
                while (it.hasNext()) {
                    com.paypal.oslo.feature.home.domain.model.Section section = (com.paypal.oslo.feature.home.domain.model.Section) it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(section.getId(), sectionId)) {
                        listOf = (java.util.List) function1.invoke(section);
                    } else {
                        listOf = kotlin.collections.CollectionsKt.listOf(section);
                    }
                    kotlin.collections.CollectionsKt.addAll(arrayList, listOf);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success.copy$default(success, arrayList, 0, 0, false, 14, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionItemClicked) {
                com.paypal.oslo.feature.home.ui.navigation.HomeNavigationEvent routeToCollectionItem = this.getHighResolutionOutputSizeshNQ4ISI.routeToCollectionItem(((com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionItemClicked) event).getParams());
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, routeToCollectionItem != null ? new com.paypal.oslo.feature.home.ui.mvi.HomeUiEffect.Navigate(routeToCollectionItem.getDestination()) : null);
            }
            if (event instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionViewAllClicked) {
                com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionViewAllClicked collectionViewAllClicked = (com.paypal.oslo.feature.home.ui.mvi.HomeEvent.CollectionViewAllClicked) event;
                com.paypal.oslo.feature.home.ui.navigation.HomeNavigationEvent routeToCollection = this.getHighResolutionOutputSizeshNQ4ISI.routeToCollection(collectionViewAllClicked.getCollectionType(), collectionViewAllClicked.getCtaPrompt());
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, routeToCollection != null ? new com.paypal.oslo.feature.home.ui.mvi.HomeUiEffect.Navigate(routeToCollection.getDestination()) : null);
            }
            if (event instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded) {
                com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded contentLoaded2 = (com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success(contentLoaded2.getSections(), success.getScrollIndex(), success.getScrollOffset(), contentLoaded2.getHapticFeedbackEnabled()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoadFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Error(((com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoadFailed) event).getErrorMessage(), success.getSections()), null, 2, null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.mvi.HomeEvent.SilentRefreshWalletSnapshot.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.WalletSnapshotRefreshed) {
                java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> sections2 = success.getSections();
                com.paypal.oslo.feature.home.domain.model.Section<?> snapshotSection = ((com.paypal.oslo.feature.home.ui.mvi.HomeEvent.WalletSnapshotRefreshed) event).getSnapshotSection();
                java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> list = sections2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.paypal.oslo.feature.home.domain.model.Section<?> section2 : list) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(section2.getId(), com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository.ACCOUNT_SNAPSHOT_SECTION_ID)) {
                        section2 = snapshotSection;
                    }
                    arrayList2.add(section2);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success.copy$default(success, arrayList2, 0, 0, false, 14, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ScrollPositionChanged) {
                com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ScrollPositionChanged scrollPositionChanged = (com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ScrollPositionChanged) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success.copy$default(success, null, scrollPositionChanged.getIndex(), scrollPositionChanged.getOffset(), false, 9, null), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
        }
        com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Loading loading = (com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Loading) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.mvi.HomeEvent.LoadContent.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.mvi.HomeEvent.SilentRefreshWalletSnapshot.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.home.ui.mvi.HomeEvent.SilentRefreshHomeFeedSections.INSTANCE) || (event instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.WalletSnapshotRefreshed)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded) {
            com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded contentLoaded3 = (com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoaded) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success(contentLoaded3.getSections(), 0, 0, contentLoaded3.getHapticFeedbackEnabled(), 6, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoadFailed) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Error(((com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ContentLoadFailed) event).getErrorMessage(), kotlin.collections.CollectionsKt.emptyList()), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }

    /* renamed from: $r8$lambda$-GF72mMUylB23mv3WswZ5UmPH5U, reason: not valid java name */
    public static /* synthetic */ java.util.List m14980$r8$lambda$GF72mMUylB23mv3WswZ5UmPH5U(com.paypal.oslo.feature.home.ui.mvi.HomeReducer homeReducer, com.paypal.oslo.feature.home.ui.mvi.HomeEvent homeEvent, com.paypal.oslo.feature.home.domain.model.Section section) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RetrySectionLoad retrySectionLoad = (com.paypal.oslo.feature.home.ui.mvi.HomeEvent.RetrySectionLoad) homeEvent;
        return homeReducer.getHighSpeedVideoFpsRanges.createLoadingSections(retrySectionLoad.getSectionId(), retrySectionLoad.getSectionType());
    }
}
