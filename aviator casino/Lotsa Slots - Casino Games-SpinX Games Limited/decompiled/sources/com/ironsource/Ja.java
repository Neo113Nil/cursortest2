package com.ironsource;

/* loaded from: classes5.dex */
public final class Ja {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String b(com.ironsource.InterfaceC3187nb<com.unity3d.mediation.LevelPlayAdInfo> interfaceC3187nb) {
        if (interfaceC3187nb instanceof com.ironsource.InterfaceC3187nb.b) {
            return "success";
        }
        if (interfaceC3187nb instanceof com.ironsource.InterfaceC3187nb.a) {
            return com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
