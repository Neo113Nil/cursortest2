package com.onesignal.core.internal.config;

import com.onesignal.core.internal.http.OneSignalService;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class ConfigModel$apiUrl$1 extends j implements InterfaceC1430a {
    public static final ConfigModel$apiUrl$1 INSTANCE = new ConfigModel$apiUrl$1();

    public ConfigModel$apiUrl$1() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final String invoke() {
        return OneSignalService.ONESIGNAL_API_BASE_URL;
    }
}
