package com.onesignal.user.internal;

import B0.o;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.jwt.JwtRequirement;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.LoginUserOperation;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class LoginHelper {
    private final ConfigModel configModel;
    private final IdentityModelStore identityModelStore;
    private final JwtTokenStore jwtTokenStore;
    private final Object lock;
    private final IOperationRepo operationRepo;
    private final UserSwitcher userSwitcher;

    public static final class LoginEnqueueContext {
        private final String appId;
        private final String existingOneSignalId;
        private final String externalId;
        private final String newIdentityOneSignalId;

        public LoginEnqueueContext(String appId, String newIdentityOneSignalId, String externalId, String str) {
            i.e(appId, "appId");
            i.e(newIdentityOneSignalId, "newIdentityOneSignalId");
            i.e(externalId, "externalId");
            this.appId = appId;
            this.newIdentityOneSignalId = newIdentityOneSignalId;
            this.externalId = externalId;
            this.existingOneSignalId = str;
        }

        public static /* synthetic */ LoginEnqueueContext copy$default(LoginEnqueueContext loginEnqueueContext, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = loginEnqueueContext.appId;
            }
            if ((i2 & 2) != 0) {
                str2 = loginEnqueueContext.newIdentityOneSignalId;
            }
            if ((i2 & 4) != 0) {
                str3 = loginEnqueueContext.externalId;
            }
            if ((i2 & 8) != 0) {
                str4 = loginEnqueueContext.existingOneSignalId;
            }
            return loginEnqueueContext.copy(str, str2, str3, str4);
        }

        public final String component1() {
            return this.appId;
        }

        public final String component2() {
            return this.newIdentityOneSignalId;
        }

        public final String component3() {
            return this.externalId;
        }

        public final String component4() {
            return this.existingOneSignalId;
        }

        public final LoginEnqueueContext copy(String appId, String newIdentityOneSignalId, String externalId, String str) {
            i.e(appId, "appId");
            i.e(newIdentityOneSignalId, "newIdentityOneSignalId");
            i.e(externalId, "externalId");
            return new LoginEnqueueContext(appId, newIdentityOneSignalId, externalId, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoginEnqueueContext)) {
                return false;
            }
            LoginEnqueueContext loginEnqueueContext = (LoginEnqueueContext) obj;
            return i.a(this.appId, loginEnqueueContext.appId) && i.a(this.newIdentityOneSignalId, loginEnqueueContext.newIdentityOneSignalId) && i.a(this.externalId, loginEnqueueContext.externalId) && i.a(this.existingOneSignalId, loginEnqueueContext.existingOneSignalId);
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getExistingOneSignalId() {
            return this.existingOneSignalId;
        }

        public final String getExternalId() {
            return this.externalId;
        }

        public final String getNewIdentityOneSignalId() {
            return this.newIdentityOneSignalId;
        }

        public int hashCode() {
            int f3 = o.f(this.externalId, o.f(this.newIdentityOneSignalId, this.appId.hashCode() * 31, 31), 31);
            String str = this.existingOneSignalId;
            return f3 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LoginEnqueueContext(appId=");
            sb.append(this.appId);
            sb.append(", newIdentityOneSignalId=");
            sb.append(this.newIdentityOneSignalId);
            sb.append(", externalId=");
            sb.append(this.externalId);
            sb.append(", existingOneSignalId=");
            return o.l(sb, this.existingOneSignalId, ')');
        }
    }

    public LoginHelper(IdentityModelStore identityModelStore, UserSwitcher userSwitcher, IOperationRepo operationRepo, ConfigModel configModel, JwtTokenStore jwtTokenStore, Object lock) {
        i.e(identityModelStore, "identityModelStore");
        i.e(userSwitcher, "userSwitcher");
        i.e(operationRepo, "operationRepo");
        i.e(configModel, "configModel");
        i.e(jwtTokenStore, "jwtTokenStore");
        i.e(lock, "lock");
        this.identityModelStore = identityModelStore;
        this.userSwitcher = userSwitcher;
        this.operationRepo = operationRepo;
        this.configModel = configModel;
        this.jwtTokenStore = jwtTokenStore;
        this.lock = lock;
    }

    public static /* synthetic */ LoginEnqueueContext switchUser$com_onesignal_core$default(LoginHelper loginHelper, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return loginHelper.switchUser$com_onesignal_core(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object enqueueLogin$com_onesignal_core(LoginEnqueueContext loginEnqueueContext, InterfaceC1218d interfaceC1218d) {
        LoginHelper$enqueueLogin$1 loginHelper$enqueueLogin$1;
        Object obj;
        int i2;
        if (interfaceC1218d instanceof LoginHelper$enqueueLogin$1) {
            loginHelper$enqueueLogin$1 = (LoginHelper$enqueueLogin$1) interfaceC1218d;
            int i3 = loginHelper$enqueueLogin$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                loginHelper$enqueueLogin$1.label = i3 - Integer.MIN_VALUE;
                LoginHelper$enqueueLogin$1 loginHelper$enqueueLogin$12 = loginHelper$enqueueLogin$1;
                obj = loginHelper$enqueueLogin$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = loginHelper$enqueueLogin$12.label;
                if (i2 != 0) {
                    g.y(obj);
                    IOperationRepo iOperationRepo = this.operationRepo;
                    LoginUserOperation loginUserOperation = new LoginUserOperation(loginEnqueueContext.getAppId(), loginEnqueueContext.getNewIdentityOneSignalId(), loginEnqueueContext.getExternalId(), loginEnqueueContext.getExistingOneSignalId());
                    loginHelper$enqueueLogin$12.label = 1;
                    obj = IOperationRepo.DefaultImpls.enqueueAndWait$default(iOperationRepo, loginUserOperation, false, loginHelper$enqueueLogin$12, 2, null);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    Logging.warn$default("Could not login user", null, 2, null);
                }
                return v.f5689a;
            }
        }
        loginHelper$enqueueLogin$1 = new LoginHelper$enqueueLogin$1(this, interfaceC1218d);
        LoginHelper$enqueueLogin$1 loginHelper$enqueueLogin$122 = loginHelper$enqueueLogin$1;
        obj = loginHelper$enqueueLogin$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = loginHelper$enqueueLogin$122.label;
        if (i2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return v.f5689a;
    }

    public final LoginEnqueueContext switchUser$com_onesignal_core(String externalId, String str) {
        i.e(externalId, "externalId");
        synchronized (this.lock) {
            String externalId2 = this.identityModelStore.getModel().getExternalId();
            String onesignalId = this.identityModelStore.getModel().getOnesignalId();
            if (i.a(externalId2, externalId)) {
                if (str != null) {
                    this.jwtTokenStore.putJwt(externalId, str);
                    this.operationRepo.forceExecuteOperations();
                }
                return null;
            }
            this.jwtTokenStore.putJwt(externalId, str);
            UserSwitcher.createAndSwitchToNewUser$default(this.userSwitcher, false, new LoginHelper$switchUser$1$1(externalId), 1, null);
            String onesignalId2 = this.identityModelStore.getModel().getOnesignalId();
            if (this.configModel.getUseIdentityVerification$com_onesignal_core() == JwtRequirement.REQUIRED || externalId2 != null) {
                onesignalId = null;
            }
            return new LoginEnqueueContext(this.configModel.getAppId(), onesignalId2, externalId, onesignalId);
        }
    }
}
