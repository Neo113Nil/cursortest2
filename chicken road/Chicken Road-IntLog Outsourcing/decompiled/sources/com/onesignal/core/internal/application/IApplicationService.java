package com.onesignal.core.internal.application;

import android.app.Activity;
import android.content.Context;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface IApplicationService {
    void addActivityLifecycleHandler(IActivityLifecycleHandler iActivityLifecycleHandler);

    void addApplicationLifecycleHandler(IApplicationLifecycleHandler iApplicationLifecycleHandler);

    Context getAppContext();

    Activity getCurrent();

    AppEntryAction getEntryState();

    boolean isInForeground();

    void removeActivityLifecycleHandler(IActivityLifecycleHandler iActivityLifecycleHandler);

    void removeApplicationLifecycleHandler(IApplicationLifecycleHandler iApplicationLifecycleHandler);

    void setEntryState(AppEntryAction appEntryAction);

    Object waitUntilActivityReady(InterfaceC1218d interfaceC1218d);

    Object waitUntilSystemConditionsAvailable(InterfaceC1218d interfaceC1218d);
}
