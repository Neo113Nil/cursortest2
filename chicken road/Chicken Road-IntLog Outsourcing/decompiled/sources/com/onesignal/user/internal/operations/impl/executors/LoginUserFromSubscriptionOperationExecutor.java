package com.onesignal.user.internal.operations.impl.executors;

import K1.b;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.ISubscriptionBackendService;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.LoginUserFromSubscriptionOperation;
import com.onesignal.user.internal.operations.RefreshUserOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import e5.g;
import g4.AbstractC0465j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class LoginUserFromSubscriptionOperationExecutor implements IOperationExecutor {
    public static final Companion Companion = new Companion(null);
    public static final String LOGIN_USER_FROM_SUBSCRIPTION_USER = "login-user-from-subscription";
    private final IdentityModelStore _identityModelStore;
    private final IdentityVerificationService _identityVerificationService;
    private final PropertiesModelStore _propertiesModelStore;
    private final ISubscriptionBackendService _subscriptionBackend;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkUtils.ResponseStatusType.values().length];
            try {
                iArr[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LoginUserFromSubscriptionOperationExecutor(ISubscriptionBackendService _subscriptionBackend, IdentityModelStore _identityModelStore, PropertiesModelStore _propertiesModelStore, IdentityVerificationService _identityVerificationService) {
        i.e(_subscriptionBackend, "_subscriptionBackend");
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_propertiesModelStore, "_propertiesModelStore");
        i.e(_identityVerificationService, "_identityVerificationService");
        this._subscriptionBackend = _subscriptionBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._identityVerificationService = _identityVerificationService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[Catch: BackendException -> 0x0036, TryCatch #0 {BackendException -> 0x0036, blocks: (B:11:0x0032, B:12:0x005f, B:16:0x006f, B:19:0x0096, B:21:0x00c1, B:22:0x00cd, B:24:0x00db, B:25:0x00e8, B:30:0x0044), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096 A[Catch: BackendException -> 0x0036, TryCatch #0 {BackendException -> 0x0036, blocks: (B:11:0x0032, B:12:0x005f, B:16:0x006f, B:19:0x0096, B:21:0x00c1, B:22:0x00cd, B:24:0x00db, B:25:0x00e8, B:30:0x0044), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(LoginUserFromSubscriptionOperation loginUserFromSubscriptionOperation, InterfaceC1218d interfaceC1218d) {
        LoginUserFromSubscriptionOperationExecutor$loginUser$1 loginUserFromSubscriptionOperationExecutor$loginUser$1;
        int i2;
        LoginUserFromSubscriptionOperationExecutor loginUserFromSubscriptionOperationExecutor;
        LoginUserFromSubscriptionOperation loginUserFromSubscriptionOperation2;
        String str;
        try {
            if (interfaceC1218d instanceof LoginUserFromSubscriptionOperationExecutor$loginUser$1) {
                loginUserFromSubscriptionOperationExecutor$loginUser$1 = (LoginUserFromSubscriptionOperationExecutor$loginUser$1) interfaceC1218d;
                int i3 = loginUserFromSubscriptionOperationExecutor$loginUser$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    loginUserFromSubscriptionOperationExecutor$loginUser$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = loginUserFromSubscriptionOperationExecutor$loginUser$1.result;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = loginUserFromSubscriptionOperationExecutor$loginUser$1.label;
                    if (i2 != 0) {
                        g.y(obj);
                        ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
                        String appId = loginUserFromSubscriptionOperation.getAppId();
                        String subscriptionId = loginUserFromSubscriptionOperation.getSubscriptionId();
                        loginUserFromSubscriptionOperationExecutor$loginUser$1.L$0 = this;
                        loginUserFromSubscriptionOperationExecutor$loginUser$1.L$1 = loginUserFromSubscriptionOperation;
                        loginUserFromSubscriptionOperationExecutor$loginUser$1.label = 1;
                        obj = iSubscriptionBackendService.getIdentityFromSubscription(appId, subscriptionId, loginUserFromSubscriptionOperationExecutor$loginUser$1);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                        loginUserFromSubscriptionOperationExecutor = this;
                        loginUserFromSubscriptionOperation2 = loginUserFromSubscriptionOperation;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        loginUserFromSubscriptionOperation2 = (LoginUserFromSubscriptionOperation) loginUserFromSubscriptionOperationExecutor$loginUser$1.L$1;
                        loginUserFromSubscriptionOperationExecutor = (LoginUserFromSubscriptionOperationExecutor) loginUserFromSubscriptionOperationExecutor$loginUser$1.L$0;
                        g.y(obj);
                    }
                    str = (String) ((Map) obj).get(IdentityConstants.ONESIGNAL_ID);
                    if (str == null) {
                        str = null;
                    }
                    if (str != null) {
                        Logging.warn$default("Subscription " + loginUserFromSubscriptionOperation2.getSubscriptionId() + " has no onesignal_id!", null, 2, null);
                        return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(loginUserFromSubscriptionOperation2.getOnesignalId(), str);
                    IdentityModel model = loginUserFromSubscriptionOperationExecutor._identityModelStore.getModel();
                    PropertiesModel model2 = loginUserFromSubscriptionOperationExecutor._propertiesModelStore.getModel();
                    if (i.a(model.getOnesignalId(), loginUserFromSubscriptionOperation2.getOnesignalId())) {
                        Model.setStringProperty$default(model, IdentityConstants.ONESIGNAL_ID, str, ModelChangeTags.HYDRATE, false, 8, null);
                    }
                    if (i.a(model2.getOnesignalId(), loginUserFromSubscriptionOperation2.getOnesignalId())) {
                        Model.setStringProperty$default(model2, "onesignalId", str, ModelChangeTags.HYDRATE, false, 8, null);
                    }
                    return new ExecutionResponse(ExecutionResult.SUCCESS, linkedHashMap, b.W(new RefreshUserOperation(loginUserFromSubscriptionOperation2.getAppId(), str, loginUserFromSubscriptionOperation2.getExternalId())), null, 8, null);
                }
            }
            if (i2 != 0) {
            }
            str = (String) ((Map) obj).get(IdentityConstants.ONESIGNAL_ID);
            if (str == null) {
            }
            if (str != null) {
            }
        } catch (BackendException e3) {
            int i6 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e3.getStatusCode()).ordinal()];
            return i6 != 1 ? i6 != 2 ? new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null) : new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, null, 14, null) : new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, null, 14, null);
        }
        loginUserFromSubscriptionOperationExecutor$loginUser$1 = new LoginUserFromSubscriptionOperationExecutor$loginUser$1(this, interfaceC1218d);
        Object obj2 = loginUserFromSubscriptionOperationExecutor$loginUser$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = loginUserFromSubscriptionOperationExecutor$loginUser$1.label;
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public Object execute(List<? extends Operation> list, InterfaceC1218d interfaceC1218d) {
        Logging.debug$default("LoginUserFromSubscriptionOperationExecutor(operation: " + list + ')', null, 2, null);
        if (this._identityVerificationService.getNewCodePathsRun() && ExecutorsIvExtensionsKt.shouldFailLoginUserFromSubscription(this._identityVerificationService.getIvBehaviorActive())) {
            Logging.warn$default("LoginUserFromSubscriptionOperation is not supported when identity verification is enabled. Dropping.", null, 2, null);
            return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
        }
        if (list.size() > 1) {
            throw new Exception("Only supports one operation! Attempted operations:\n" + list);
        }
        Operation operation = (Operation) AbstractC0465j.F0(list);
        if (operation instanceof LoginUserFromSubscriptionOperation) {
            return loginUser((LoginUserFromSubscriptionOperation) operation, interfaceC1218d);
        }
        throw new Exception("Unrecognized operation: " + operation);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return b.W(LOGIN_USER_FROM_SUBSCRIPTION_USER);
    }
}
