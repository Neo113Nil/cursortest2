package com.helpshift.user;

/* loaded from: classes5.dex */
public class UpdatePushSyncStatus implements com.helpshift.util.ValueListener<java.lang.Boolean> {
    private final com.helpshift.user.UserManager userManager;

    public UpdatePushSyncStatus(com.helpshift.user.UserManager userManager) {
        this.userManager = userManager;
    }

    @Override // com.helpshift.util.ValueListener
    public void update(java.lang.Boolean bool) {
        this.userManager.setPushTokenSynced(bool.booleanValue());
    }
}
