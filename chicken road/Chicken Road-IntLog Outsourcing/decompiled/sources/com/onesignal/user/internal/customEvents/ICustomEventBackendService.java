package com.onesignal.user.internal.customEvents;

import com.onesignal.user.internal.customEvents.impl.CustomEventMetadata;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface ICustomEventBackendService {

    public static final class DefaultImpls {
        public static /* synthetic */ Object sendCustomEvent$default(ICustomEventBackendService iCustomEventBackendService, String str, String str2, String str3, long j2, String str4, String str5, CustomEventMetadata customEventMetadata, String str6, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj == null) {
                return iCustomEventBackendService.sendCustomEvent(str, str2, str3, j2, str4, str5, customEventMetadata, (i2 & 128) != 0 ? null : str6, interfaceC1218d);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCustomEvent");
        }
    }

    Object sendCustomEvent(String str, String str2, String str3, long j2, String str4, String str5, CustomEventMetadata customEventMetadata, String str6, InterfaceC1218d interfaceC1218d);
}
