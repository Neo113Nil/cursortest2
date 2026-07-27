package com.onesignal.inAppMessages.internal.repositories;

import com.onesignal.inAppMessages.internal.InAppMessage;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface IInAppRepository {
    Object cleanCachedInAppMessages(InterfaceC1218d interfaceC1218d);

    Object listInAppMessages(InterfaceC1218d interfaceC1218d);

    Object saveInAppMessage(InAppMessage inAppMessage, InterfaceC1218d interfaceC1218d);
}
