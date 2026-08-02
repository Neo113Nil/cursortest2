package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001aE\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"rememberNavigationEventState", "Landroidx/navigationevent/compose/NavigationEventState;", "T", "Landroidx/navigationevent/NavigationEventInfo;", "currentInfo", "backInfo", "", "forwardInfo", "(Landroidx/navigationevent/NavigationEventInfo;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/Composer;II)Landroidx/navigationevent/compose/NavigationEventState;", "navigationevent-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RememberNavigationEventStateKt {
    public static final <T extends androidx.view.NavigationEventInfo> androidx.view.compose.NavigationEventState<T> rememberNavigationEventState(final T t, final java.util.List<? extends T> list, final java.util.List<? extends T> list2, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i2 & 4) != 0) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(116613162, i, -1, "androidx.navigationevent.compose.rememberNavigationEventState (RememberNavigationEventState.kt:44)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.view.compose.NavigationEventState(t, list, list2);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.view.compose.NavigationEventState<T> navigationEventState = (androidx.view.compose.NavigationEventState) rememberedValue;
        boolean z = (((i & 14) ^ 6) > 4 && composer.changedInstance(t)) || (i & 6) == 4;
        boolean changedInstance = composer.changedInstance(list);
        boolean changedInstance2 = composer.changedInstance(list2);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((z | changedInstance | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.RememberNavigationEventStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.compose.RememberNavigationEventStateKt.$r8$lambda$cM_OMNAq88vymjHUYRQ3oPDuQx4(androidx.view.compose.NavigationEventState.this, t, list, list2);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return navigationEventState;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cM_OMNAq88vymjHUYRQ3oPDuQx4(androidx.view.compose.NavigationEventState navigationEventState, androidx.view.NavigationEventInfo navigationEventInfo, java.util.List list, java.util.List list2) {
        navigationEventState.setCurrentInfo$navigationevent_compose(navigationEventInfo);
        navigationEventState.setBackInfo$navigationevent_compose(list);
        navigationEventState.setForwardInfo$navigationevent_compose(list2);
        return kotlin.Unit.INSTANCE;
    }
}
