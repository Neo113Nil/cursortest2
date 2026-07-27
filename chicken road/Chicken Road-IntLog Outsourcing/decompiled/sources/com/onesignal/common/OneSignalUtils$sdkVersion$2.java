package com.onesignal.common;

import com.onesignal.core.BuildConfig;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalUtils$sdkVersion$2 extends j implements InterfaceC1430a {
    public static final OneSignalUtils$sdkVersion$2 INSTANCE = new OneSignalUtils$sdkVersion$2();

    public OneSignalUtils$sdkVersion$2() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final String invoke() {
        return OneSignalUtils.INSTANCE.formatVersion$com_onesignal_core(BuildConfig.SDK_VERSION);
    }
}
