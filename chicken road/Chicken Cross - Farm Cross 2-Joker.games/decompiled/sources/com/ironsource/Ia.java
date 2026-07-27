package com.ironsource;

import com.facebook.login.LoginLogger;
import com.ironsource.InterfaceC4516lb;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes6.dex */
public final class Ia {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC4516lb<LevelPlayAdInfo> interfaceC4516lb) {
        if (interfaceC4516lb instanceof InterfaceC4516lb.b) {
            return "success";
        }
        if (interfaceC4516lb instanceof InterfaceC4516lb.a) {
            return LoginLogger.EVENT_EXTRAS_FAILURE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
