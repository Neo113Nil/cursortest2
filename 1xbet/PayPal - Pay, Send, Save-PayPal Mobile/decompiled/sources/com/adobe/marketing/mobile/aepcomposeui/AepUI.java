package com.adobe.marketing.mobile.aepcomposeui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bv\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005J\u000f\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0001H&¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0001\u000e"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/AepUI;", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplate;", "T", "Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;", "S", "", "getState", "()Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;", "getTemplate", "()Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplate;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "", "updateState", "(Lcom/adobe/marketing/mobile/aepcomposeui/state/AepCardUIState;)V", "Lcom/adobe/marketing/mobile/aepcomposeui/BaseAepUI;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface AepUI<T extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate, S extends com.adobe.marketing.mobile.aepcomposeui.state.AepCardUIState> {
    S getState();

    T getTemplate();

    void updateState(S newState);
}
