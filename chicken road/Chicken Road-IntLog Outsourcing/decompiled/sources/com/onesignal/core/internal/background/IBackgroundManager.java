package com.onesignal.core.internal.background;

import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface IBackgroundManager {
    boolean cancelRunBackgroundServices();

    boolean getNeedsJobReschedule();

    Object runBackgroundServices(InterfaceC1218d interfaceC1218d);

    void setNeedsJobReschedule(boolean z);
}
