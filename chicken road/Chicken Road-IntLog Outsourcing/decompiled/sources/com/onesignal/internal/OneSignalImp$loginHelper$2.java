package com.onesignal.internal;

import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.user.internal.LoginHelper;
import com.onesignal.user.internal.UserSwitcher;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalImp$loginHelper$2 extends j implements InterfaceC1430a {
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$loginHelper$2(OneSignalImp oneSignalImp) {
        super(0);
        this.this$0 = oneSignalImp;
    }

    @Override // t4.InterfaceC1430a
    public final LoginHelper invoke() {
        IdentityModelStore identityModelStore;
        UserSwitcher userSwitcher;
        IOperationRepo operationRepo;
        ConfigModel configModel;
        JwtTokenStore jwtTokenStore;
        Object obj;
        identityModelStore = this.this$0.getIdentityModelStore();
        userSwitcher = this.this$0.getUserSwitcher();
        operationRepo = this.this$0.getOperationRepo();
        configModel = this.this$0.getConfigModel();
        jwtTokenStore = this.this$0.getJwtTokenStore();
        obj = this.this$0.loginLogoutLock;
        return new LoginHelper(identityModelStore, userSwitcher, operationRepo, configModel, jwtTokenStore, obj);
    }
}
