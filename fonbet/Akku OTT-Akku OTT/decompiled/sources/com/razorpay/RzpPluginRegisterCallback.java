package com.razorpay;

import proguard.annotation.Keep;
import proguard.annotation.KeepClassMembers;

@Keep
@KeepClassMembers
/* loaded from: classes4.dex */
public interface RzpPluginRegisterCallback {
    void onResponse(boolean z);
}
