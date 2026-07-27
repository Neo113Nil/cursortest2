package com.onesignal.notifications.internal.summary;

import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface INotificationSummaryManager {
    Object clearNotificationOnSummaryClick(String str, InterfaceC1218d interfaceC1218d);

    Object updatePossibleDependentSummaryOnDismiss(int i2, InterfaceC1218d interfaceC1218d);

    Object updateSummaryNotificationAfterChildRemoved(String str, boolean z, InterfaceC1218d interfaceC1218d);
}
