package com.onesignal.inAppMessages;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public interface IInAppMessagesManager {
    /* renamed from: addClickListener */
    void mo10addClickListener(IInAppMessageClickListener iInAppMessageClickListener);

    /* renamed from: addLifecycleListener */
    void mo11addLifecycleListener(IInAppMessageLifecycleListener iInAppMessageLifecycleListener);

    /* renamed from: addTrigger */
    void mo12addTrigger(String str, String str2);

    /* renamed from: addTriggers */
    void mo13addTriggers(Map<String, String> map);

    /* renamed from: clearTriggers */
    void mo14clearTriggers();

    boolean getPaused();

    /* renamed from: removeClickListener */
    void mo15removeClickListener(IInAppMessageClickListener iInAppMessageClickListener);

    /* renamed from: removeLifecycleListener */
    void mo16removeLifecycleListener(IInAppMessageLifecycleListener iInAppMessageLifecycleListener);

    /* renamed from: removeTrigger */
    void mo17removeTrigger(String str);

    /* renamed from: removeTriggers */
    void mo18removeTriggers(Collection<String> collection);

    void setPaused(boolean z);
}
