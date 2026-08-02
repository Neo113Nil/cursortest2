package com.adobe.marketing.mobile.aepcomposeui;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0019\b\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0001\u0003\u0018\u0019\u001a"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/BaseAepUI;", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplate;", "T", "Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;", "S", "Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "p0", "p1", "<init>", "(Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplate;Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;)V", "getState", "()Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;", "getTemplate", "()Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplate;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "", "updateState", "(Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;)V", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplate;", "Lcom/adobe/marketing/mobile/aepcomposeui/ImageOnlyUI;", "Lcom/adobe/marketing/mobile/aepcomposeui/LargeImageUI;", "Lcom/adobe/marketing/mobile/aepcomposeui/SmallImageUI;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseAepUI<T extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate, S extends com.adobe.marketing.mobile.aepcomposeui.state.AepCardUIState> implements com.adobe.marketing.mobile.aepcomposeui.AepUI<T, S> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<S> getHighSpeedVideoSizes;
    private final T getHighSpeedVideoFpsRangesFor;

    private BaseAepUI(T t, S s) {
        this.getHighSpeedVideoFpsRangesFor = t;
        this.getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
    }

    @Override // com.adobe.marketing.mobile.aepcomposeui.AepUI
    public void updateState(S newState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "");
        this.getHighSpeedVideoSizes.setValue(newState);
    }

    @Override // com.adobe.marketing.mobile.aepcomposeui.AepUI
    public T getTemplate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.adobe.marketing.mobile.aepcomposeui.AepUI
    public S getState() {
        return this.getHighSpeedVideoSizes.getValue();
    }

    public /* synthetic */ BaseAepUI(com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate aepUITemplate, com.adobe.marketing.mobile.aepcomposeui.state.AepCardUIState aepCardUIState, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(aepUITemplate, aepCardUIState);
    }
}
