package com.paypal.oslo.feature.settings.ui.mvi.reducer;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c\u001a5\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a5\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020 ¢\u0006\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;", "state", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$NetworkError;", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect;", "handleScreenError", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$NetworkError;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "section", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Loaded;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleSectionLoaded", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState$SectionState$Loaded;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$SectionLoadFailedResult;", "handleSectionLoadFailed", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$SectionLoadFailedResult;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$BiometricsToggleFailed;", "handleBiometricsToggleFailed", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$BiometricsToggleFailed;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$LLSToggleFailed;", "handleLLSToggleFailed", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$LLSToggleFailed;)Larrow/core/Either;", "", "appVersion", "handleAppVersionLoaded", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Ljava/lang/String;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$UserStoreError;", "handleUserStoreError", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$UserStoreError;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$ItemStatusRefreshed;", "handleItemStatusRefreshed", "(Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsState;Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEvent$DataEvent$ItemStatusRefreshed;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DataEventReducerHelperKt {
    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleScreenError(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.NetworkError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Error(networkError.getMessage()), null, null, null, networkError.getMessage(), null, 46, null), null, 2, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleSectionLoaded(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection, com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded loaded) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingSection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loaded, "");
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Ready ready = com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Ready.INSTANCE;
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(settingsState.getSections());
        mutableMap.put(settingSection, loaded);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, ready, mutableMap, null, null, null, null, 60, null), null, 2, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleSectionLoadFailed(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadFailedResult sectionLoadFailedResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionLoadFailedResult, "");
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Ready ready = com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Ready.INSTANCE;
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(settingsState.getSections());
        mutableMap.put(sectionLoadFailedResult.getSection(), sectionLoadFailedResult.getError());
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, ready, mutableMap, null, null, null, null, 60, null), null, 2, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleBiometricsToggleFailed(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleFailed biometricsToggleFailed) {
        java.util.Map map;
        int i;
        java.lang.Class<?> cls;
        java.util.ArrayList arrayList;
        java.util.Map map2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricsToggleFailed, "");
        java.lang.String errorMessage = biometricsToggleFailed.getErrorMessage();
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(settingsState.getSections());
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState sectionState = (com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState) mutableMap.get(com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY);
        char c = 2;
        if (sectionState instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) {
            com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded loaded = (com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) sectionState;
            java.util.List<com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData> items = loaded.getData().getItems();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
            for (com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData : items) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(settingsItemUiData.getId(), com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.FINGERPRINT_SCAN) && (settingsItemUiData.getStatus() instanceof com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle)) {
                    arrayList = arrayList2;
                    map2 = mutableMap;
                    settingsItemUiData = settingsItemUiData.copy((r24 & 1) != 0 ? settingsItemUiData.id : null, (r24 & 2) != 0 ? settingsItemUiData.title : null, (r24 & 4) != 0 ? settingsItemUiData.subtitle : null, (r24 & 8) != 0 ? settingsItemUiData.status : new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle(biometricsToggleFailed.getEnabled()), (r24 & 16) != 0 ? settingsItemUiData.statusText : null, (r24 & 32) != 0 ? settingsItemUiData.showChevron : false, (r24 & 64) != 0 ? settingsItemUiData.showDivider : false, (r24 & 128) != 0 ? settingsItemUiData.isSubHeader : false, (r24 & 256) != 0 ? settingsItemUiData.destination : null, (r24 & 512) != 0 ? settingsItemUiData.isLoading : false, (r24 & 1024) != 0 ? settingsItemUiData.errorMessage : errorMessage);
                } else {
                    arrayList = arrayList2;
                    map2 = mutableMap;
                }
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(settingsItemUiData);
                mutableMap = map2;
                arrayList2 = arrayList3;
                c = 2;
            }
            map = mutableMap;
            map.put(com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY, new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded(com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData.copy$default(loaded.getData(), null, null, arrayList2, 3, null)));
            i = 2;
        } else {
            map = mutableMap;
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.settings.LoggerKt.log;
            i = 2;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("section", "DATA_PRIVACY");
            com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState sectionState2 = settingsState.getSections().get(com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY);
            pairArr[1] = kotlin.TuplesKt.to("currentState", (sectionState2 == null || (cls = sectionState2.getClass()) == null) ? null : cls.getSimpleName());
            com.paypal.android.logger.Logger.e$default(logger, "BiometricsToggleFailed: Section not in expected state", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, null, map, null, null, null, null, 61, null), null, i, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleLLSToggleFailed(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.LLSToggleFailed lLSToggleFailed) {
        java.util.Map map;
        int i;
        java.lang.Class<?> cls;
        java.util.ArrayList arrayList;
        java.util.Map map2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lLSToggleFailed, "");
        java.lang.String errorMessage = lLSToggleFailed.getErrorMessage();
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(settingsState.getSections());
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState sectionState = (com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState) mutableMap.get(com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY);
        char c = 2;
        if (sectionState instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) {
            com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded loaded = (com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) sectionState;
            java.util.List<com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData> items = loaded.getData().getItems();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
            for (com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData : items) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(settingsItemUiData.getId(), com.paypal.oslo.feature.settings.domain.model.SettingsItemId.DataAndPrivacy.LLS) && (settingsItemUiData.getStatus() instanceof com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle)) {
                    arrayList = arrayList2;
                    map2 = mutableMap;
                    settingsItemUiData = settingsItemUiData.copy((r24 & 1) != 0 ? settingsItemUiData.id : null, (r24 & 2) != 0 ? settingsItemUiData.title : null, (r24 & 4) != 0 ? settingsItemUiData.subtitle : null, (r24 & 8) != 0 ? settingsItemUiData.status : new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle(lLSToggleFailed.getEnabled()), (r24 & 16) != 0 ? settingsItemUiData.statusText : null, (r24 & 32) != 0 ? settingsItemUiData.showChevron : false, (r24 & 64) != 0 ? settingsItemUiData.showDivider : false, (r24 & 128) != 0 ? settingsItemUiData.isSubHeader : false, (r24 & 256) != 0 ? settingsItemUiData.destination : null, (r24 & 512) != 0 ? settingsItemUiData.isLoading : false, (r24 & 1024) != 0 ? settingsItemUiData.errorMessage : errorMessage);
                } else {
                    arrayList = arrayList2;
                    map2 = mutableMap;
                }
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(settingsItemUiData);
                mutableMap = map2;
                arrayList2 = arrayList3;
                c = 2;
            }
            map = mutableMap;
            map.put(com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY, new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded(com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData.copy$default(loaded.getData(), null, null, arrayList2, 3, null)));
            i = 2;
        } else {
            map = mutableMap;
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.settings.LoggerKt.log;
            i = 2;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("section", "DATA_PRIVACY");
            com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState sectionState2 = settingsState.getSections().get(com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY);
            pairArr[1] = kotlin.TuplesKt.to("currentState", (sectionState2 == null || (cls = sectionState2.getClass()) == null) ? null : cls.getSimpleName());
            com.paypal.android.logger.Logger.e$default(logger, "LLSToggleFailed: Section not in expected state", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, null, map, null, null, null, null, 61, null), null, i, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleAppVersionLoaded(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, null, null, str, null, null, null, 59, null), null, 2, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleUserStoreError(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.UserStoreError userStoreError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStoreError, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.ScreenState.Error(userStoreError.getMessage()), null, null, null, null, null, 62, null), null, 2, null);
    }

    public static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.settings.ui.mvi.SettingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect>> handleItemStatusRefreshed(com.paypal.oslo.feature.settings.ui.mvi.SettingsState settingsState, com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.ItemStatusRefreshed itemStatusRefreshed) {
        java.lang.Class<?> cls;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemStatusRefreshed, "");
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(settingsState.getSections());
        com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState sectionState = (com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState) mutableMap.get(itemStatusRefreshed.getSection());
        if (sectionState instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) {
            com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded loaded = (com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded) sectionState;
            java.util.List<com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData> items = loaded.getData().getItems();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
            for (com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData : items) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(settingsItemUiData.getId(), itemStatusRefreshed.getItemId())) {
                    com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status = itemStatusRefreshed.getStatus();
                    java.lang.String statusText = itemStatusRefreshed.getStatusText();
                    java.lang.String subtitle = itemStatusRefreshed.getSubtitle();
                    if (subtitle == null) {
                        subtitle = settingsItemUiData.getSubtitle();
                    }
                    settingsItemUiData = settingsItemUiData.copy((r24 & 1) != 0 ? settingsItemUiData.id : null, (r24 & 2) != 0 ? settingsItemUiData.title : null, (r24 & 4) != 0 ? settingsItemUiData.subtitle : subtitle, (r24 & 8) != 0 ? settingsItemUiData.status : status, (r24 & 16) != 0 ? settingsItemUiData.statusText : statusText, (r24 & 32) != 0 ? settingsItemUiData.showChevron : false, (r24 & 64) != 0 ? settingsItemUiData.showDivider : false, (r24 & 128) != 0 ? settingsItemUiData.isSubHeader : false, (r24 & 256) != 0 ? settingsItemUiData.destination : null, (r24 & 512) != 0 ? settingsItemUiData.isLoading : kotlin.jvm.internal.Intrinsics.areEqual(itemStatusRefreshed.getStatus(), new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge(com.paypal.oslo.feature.settings.domain.model.BadgeType.Loading)), (r24 & 1024) != 0 ? settingsItemUiData.errorMessage : null);
                }
                arrayList.add(settingsItemUiData);
            }
            mutableMap.put(itemStatusRefreshed.getSection(), new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded(com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData.copy$default(loaded.getData(), null, null, arrayList, 3, null)));
        } else {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.settings.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to("section", itemStatusRefreshed.getSection().name());
            pairArr[1] = kotlin.TuplesKt.to("itemId", itemStatusRefreshed.getItemId());
            com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState sectionState2 = settingsState.getSections().get(itemStatusRefreshed.getSection());
            pairArr[2] = kotlin.TuplesKt.to("currentState", (sectionState2 == null || (cls = sectionState2.getClass()) == null) ? null : cls.getSimpleName());
            com.paypal.android.logger.Logger.e$default(logger, "ItemStatusRefreshed: Section not in expected state", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.settings.ui.mvi.SettingsState.copy$default(settingsState, null, mutableMap, null, null, null, null, 61, null), null, 2, null);
    }
}
