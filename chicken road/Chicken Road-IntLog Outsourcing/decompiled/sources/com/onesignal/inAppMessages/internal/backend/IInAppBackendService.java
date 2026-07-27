package com.onesignal.inAppMessages.internal.backend;

import com.onesignal.common.consistency.RywData;
import k4.InterfaceC1218d;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public interface IInAppBackendService {
    Object getIAMData(String str, String str2, String str3, InterfaceC1218d interfaceC1218d);

    Object getIAMPreviewData(String str, String str2, InterfaceC1218d interfaceC1218d);

    Object listInAppMessages(String str, String str2, RywData rywData, InterfaceC1430a interfaceC1430a, InterfaceC1218d interfaceC1218d);

    Object listInAppMessagesIv(String str, String str2, String str3, String str4, RywData rywData, InterfaceC1430a interfaceC1430a, String str5, InterfaceC1218d interfaceC1218d);

    Object sendIAMClick(String str, String str2, String str3, String str4, String str5, boolean z, InterfaceC1218d interfaceC1218d);

    Object sendIAMImpression(String str, String str2, String str3, String str4, InterfaceC1218d interfaceC1218d);

    Object sendIAMPageImpression(String str, String str2, String str3, String str4, String str5, InterfaceC1218d interfaceC1218d);
}
