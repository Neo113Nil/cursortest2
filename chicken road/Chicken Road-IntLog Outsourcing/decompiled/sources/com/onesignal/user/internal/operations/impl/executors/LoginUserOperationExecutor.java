package com.onesignal.user.internal.operations.impl.executors;

import B4.k;
import K1.b;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.IDManager;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.RootToolsInternalMethods;
import com.onesignal.common.TimeUtils;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.enums.IamFetchRywTokenKey;
import com.onesignal.common.consistency.models.IConsistencyManager;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.user.internal.backend.CreateUserResponse;
import com.onesignal.user.internal.backend.IUserBackendService;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.CreateSubscriptionOperation;
import com.onesignal.user.internal.operations.DeleteSubscriptionOperation;
import com.onesignal.user.internal.operations.LoginUserOperation;
import com.onesignal.user.internal.operations.RefreshUserOperation;
import com.onesignal.user.internal.operations.SetAliasOperation;
import com.onesignal.user.internal.operations.TransferSubscriptionOperation;
import com.onesignal.user.internal.operations.UpdateSubscriptionOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import e5.g;
import f4.C0430g;
import g4.AbstractC0465j;
import g4.AbstractC0467l;
import g4.AbstractC0476u;
import g4.C0471p;
import g4.C0472q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.v;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class LoginUserOperationExecutor implements IOperationExecutor {
    public static final Companion Companion = new Companion(null);
    public static final String LOGIN_USER = "login-user";
    private final IApplicationService _application;
    private final ConfigModelStore _configModelStore;
    private final IConsistencyManager _consistencyManager;
    private final IDeviceService _deviceService;
    private final IdentityModelStore _identityModelStore;
    private final IdentityOperationExecutor _identityOperationExecutor;
    private final IdentityVerificationService _identityVerificationService;
    private final JwtTokenStore _jwtTokenStore;
    private final ILanguageContext _languageContext;
    private final PropertiesModelStore _propertiesModelStore;
    private final SubscriptionModelStore _subscriptionsModelStore;
    private final IUserBackendService _userBackend;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ExecutionResult.values().length];
            try {
                iArr[ExecutionResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExecutionResult.FAIL_CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExecutionResult.FAIL_NORETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NetworkUtils.ResponseStatusType.values().length];
            try {
                iArr2[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SubscriptionType.values().length];
            try {
                iArr3[SubscriptionType.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[SubscriptionType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public LoginUserOperationExecutor(IdentityOperationExecutor _identityOperationExecutor, IApplicationService _application, IDeviceService _deviceService, IUserBackendService _userBackend, IdentityModelStore _identityModelStore, PropertiesModelStore _propertiesModelStore, SubscriptionModelStore _subscriptionsModelStore, ConfigModelStore _configModelStore, ILanguageContext _languageContext, JwtTokenStore _jwtTokenStore, IdentityVerificationService _identityVerificationService, IConsistencyManager _consistencyManager) {
        i.e(_identityOperationExecutor, "_identityOperationExecutor");
        i.e(_application, "_application");
        i.e(_deviceService, "_deviceService");
        i.e(_userBackend, "_userBackend");
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_propertiesModelStore, "_propertiesModelStore");
        i.e(_subscriptionsModelStore, "_subscriptionsModelStore");
        i.e(_configModelStore, "_configModelStore");
        i.e(_languageContext, "_languageContext");
        i.e(_jwtTokenStore, "_jwtTokenStore");
        i.e(_identityVerificationService, "_identityVerificationService");
        i.e(_consistencyManager, "_consistencyManager");
        this._identityOperationExecutor = _identityOperationExecutor;
        this._application = _application;
        this._deviceService = _deviceService;
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
        this._languageContext = _languageContext;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
        this._consistencyManager = _consistencyManager;
    }

    private final Map<String, SubscriptionObject> createSubscriptionsFromOperation(TransferSubscriptionOperation transferSubscriptionOperation, Map<String, SubscriptionObject> map) {
        LinkedHashMap e02 = AbstractC0476u.e0(map);
        if (e02.containsKey(transferSubscriptionOperation.getSubscriptionId())) {
            String subscriptionId = transferSubscriptionOperation.getSubscriptionId();
            String subscriptionId2 = transferSubscriptionOperation.getSubscriptionId();
            SubscriptionObject subscriptionObject = map.get(transferSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject);
            SubscriptionObjectType type = subscriptionObject.getType();
            SubscriptionObject subscriptionObject2 = map.get(transferSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject2);
            String token = subscriptionObject2.getToken();
            SubscriptionObject subscriptionObject3 = map.get(transferSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject3);
            Boolean enabled = subscriptionObject3.getEnabled();
            SubscriptionObject subscriptionObject4 = map.get(transferSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject4);
            Integer notificationTypes = subscriptionObject4.getNotificationTypes();
            SubscriptionObject subscriptionObject5 = map.get(transferSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject5);
            String sdk = subscriptionObject5.getSdk();
            SubscriptionObject subscriptionObject6 = map.get(transferSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject6);
            String deviceModel = subscriptionObject6.getDeviceModel();
            SubscriptionObject subscriptionObject7 = map.get(transferSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject7);
            String deviceOS = subscriptionObject7.getDeviceOS();
            SubscriptionObject subscriptionObject8 = map.get(transferSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject8);
            Boolean rooted = subscriptionObject8.getRooted();
            SubscriptionObject subscriptionObject9 = map.get(transferSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject9);
            Integer netType = subscriptionObject9.getNetType();
            SubscriptionObject subscriptionObject10 = map.get(transferSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject10);
            String carrier = subscriptionObject10.getCarrier();
            SubscriptionObject subscriptionObject11 = map.get(transferSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject11);
            e02.put(subscriptionId, new SubscriptionObject(subscriptionId2, type, token, enabled, notificationTypes, sdk, deviceModel, deviceOS, rooted, netType, carrier, subscriptionObject11.getAppVersion()));
        } else {
            e02.put(transferSubscriptionOperation.getSubscriptionId(), new SubscriptionObject(transferSubscriptionOperation.getSubscriptionId(), null, null, null, null, null, null, null, null, null, null, null, 4094, null));
        }
        return e02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02ec A[Catch: BackendException -> 0x0042, TryCatch #0 {BackendException -> 0x0042, blocks: (B:12:0x003c, B:15:0x02e6, B:17:0x02ec, B:18:0x0302, B:26:0x005d, B:28:0x013c, B:30:0x0178, B:31:0x0187, B:33:0x0195, B:34:0x01a5, B:35:0x01b1, B:37:0x01b7, B:38:0x01c1, B:40:0x01c7, B:45:0x01df, B:47:0x01e3, B:48:0x01e7, B:50:0x01ed, B:52:0x0206, B:54:0x020c, B:57:0x0216, B:65:0x021b, B:66:0x021f, B:68:0x0225, B:72:0x023c, B:77:0x0241, B:79:0x025f, B:80:0x026e, B:82:0x027c, B:85:0x02ac, B:86:0x0292, B:91:0x02b7, B:93:0x02c0, B:95:0x02c6, B:133:0x00f2, B:134:0x0113, B:136:0x0119, B:138:0x0127), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0178 A[Catch: BackendException -> 0x0042, TryCatch #0 {BackendException -> 0x0042, blocks: (B:12:0x003c, B:15:0x02e6, B:17:0x02ec, B:18:0x0302, B:26:0x005d, B:28:0x013c, B:30:0x0178, B:31:0x0187, B:33:0x0195, B:34:0x01a5, B:35:0x01b1, B:37:0x01b7, B:38:0x01c1, B:40:0x01c7, B:45:0x01df, B:47:0x01e3, B:48:0x01e7, B:50:0x01ed, B:52:0x0206, B:54:0x020c, B:57:0x0216, B:65:0x021b, B:66:0x021f, B:68:0x0225, B:72:0x023c, B:77:0x0241, B:79:0x025f, B:80:0x026e, B:82:0x027c, B:85:0x02ac, B:86:0x0292, B:91:0x02b7, B:93:0x02c0, B:95:0x02c6, B:133:0x00f2, B:134:0x0113, B:136:0x0119, B:138:0x0127), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0195 A[Catch: BackendException -> 0x0042, TryCatch #0 {BackendException -> 0x0042, blocks: (B:12:0x003c, B:15:0x02e6, B:17:0x02ec, B:18:0x0302, B:26:0x005d, B:28:0x013c, B:30:0x0178, B:31:0x0187, B:33:0x0195, B:34:0x01a5, B:35:0x01b1, B:37:0x01b7, B:38:0x01c1, B:40:0x01c7, B:45:0x01df, B:47:0x01e3, B:48:0x01e7, B:50:0x01ed, B:52:0x0206, B:54:0x020c, B:57:0x0216, B:65:0x021b, B:66:0x021f, B:68:0x0225, B:72:0x023c, B:77:0x0241, B:79:0x025f, B:80:0x026e, B:82:0x027c, B:85:0x02ac, B:86:0x0292, B:91:0x02b7, B:93:0x02c0, B:95:0x02c6, B:133:0x00f2, B:134:0x0113, B:136:0x0119, B:138:0x0127), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b7 A[Catch: BackendException -> 0x0042, TryCatch #0 {BackendException -> 0x0042, blocks: (B:12:0x003c, B:15:0x02e6, B:17:0x02ec, B:18:0x0302, B:26:0x005d, B:28:0x013c, B:30:0x0178, B:31:0x0187, B:33:0x0195, B:34:0x01a5, B:35:0x01b1, B:37:0x01b7, B:38:0x01c1, B:40:0x01c7, B:45:0x01df, B:47:0x01e3, B:48:0x01e7, B:50:0x01ed, B:52:0x0206, B:54:0x020c, B:57:0x0216, B:65:0x021b, B:66:0x021f, B:68:0x0225, B:72:0x023c, B:77:0x0241, B:79:0x025f, B:80:0x026e, B:82:0x027c, B:85:0x02ac, B:86:0x0292, B:91:0x02b7, B:93:0x02c0, B:95:0x02c6, B:133:0x00f2, B:134:0x0113, B:136:0x0119, B:138:0x0127), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createUser(LoginUserOperation loginUserOperation, List<? extends Operation> list, InterfaceC1218d interfaceC1218d) {
        LoginUserOperationExecutor$createUser$1 loginUserOperationExecutor$createUser$1;
        int i2;
        ExecutionResponse executionResponse;
        Map<String, SubscriptionObject> map;
        List<C0430g> b02;
        Object createUser;
        LoginUserOperationExecutor loginUserOperationExecutor;
        Map<String, SubscriptionObject> map2;
        LinkedHashMap linkedHashMap;
        String str;
        IdentityModel model;
        PropertiesModel model2;
        List list2;
        LinkedHashMap linkedHashMap2;
        RywData rywData;
        LoginUserOperation loginUserOperation2;
        LinkedHashMap linkedHashMap3;
        String str2;
        Object obj;
        SubscriptionObject subscriptionObject;
        SubscriptionObject subscriptionObject2;
        String token;
        LoginUserOperation loginUserOperation3 = loginUserOperation;
        try {
            if (interfaceC1218d instanceof LoginUserOperationExecutor$createUser$1) {
                loginUserOperationExecutor$createUser$1 = (LoginUserOperationExecutor$createUser$1) interfaceC1218d;
                int i3 = loginUserOperationExecutor$createUser$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    loginUserOperationExecutor$createUser$1.label = i3 - Integer.MIN_VALUE;
                    Object obj2 = loginUserOperationExecutor$createUser$1.result;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = loginUserOperationExecutor$createUser$1.label;
                    if (i2 != 0) {
                        g.y(obj2);
                        Map<String, SubscriptionObject> map3 = C0472q.f5751a;
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        linkedHashMap4.put("timezone_id", TimeUtils.INSTANCE.getTimeZoneId());
                        linkedHashMap4.put("language", this._languageContext.getLanguage());
                        if (loginUserOperation.getExternalId() != null) {
                            LinkedHashMap e02 = AbstractC0476u.e0(map3);
                            String externalId = loginUserOperation.getExternalId();
                            i.b(externalId);
                            e02.put(IdentityConstants.EXTERNAL_ID, externalId);
                            map = e02;
                        } else {
                            map = map3;
                        }
                        for (Operation operation : list) {
                            if (operation instanceof CreateSubscriptionOperation) {
                                map3 = createSubscriptionsFromOperation((CreateSubscriptionOperation) operation, map3);
                            } else if (operation instanceof TransferSubscriptionOperation) {
                                map3 = createSubscriptionsFromOperation((TransferSubscriptionOperation) operation, map3);
                            } else if (operation instanceof UpdateSubscriptionOperation) {
                                map3 = createSubscriptionsFromOperation((UpdateSubscriptionOperation) operation, map3);
                            } else {
                                if (!(operation instanceof DeleteSubscriptionOperation)) {
                                    throw new Exception("Unrecognized operation: " + operation);
                                }
                                map3 = createSubscriptionsFromOperation((DeleteSubscriptionOperation) operation, map3);
                            }
                        }
                        b02 = AbstractC0476u.b0(map3);
                        String resolveJwt = ExecutorsIvExtensionsKt.resolveJwt(loginUserOperation3, this._jwtTokenStore, this._identityVerificationService);
                        IUserBackendService iUserBackendService = this._userBackend;
                        String appId = loginUserOperation.getAppId();
                        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(b02, 10));
                        Iterator it = b02.iterator();
                        while (it.hasNext()) {
                            arrayList.add((SubscriptionObject) ((C0430g) it.next()).f5669b);
                        }
                        loginUserOperationExecutor$createUser$1.L$0 = this;
                        loginUserOperationExecutor$createUser$1.L$1 = loginUserOperation3;
                        loginUserOperationExecutor$createUser$1.L$2 = map;
                        loginUserOperationExecutor$createUser$1.L$3 = b02;
                        loginUserOperationExecutor$createUser$1.label = 1;
                        createUser = iUserBackendService.createUser(appId, map, arrayList, linkedHashMap4, resolveJwt, loginUserOperationExecutor$createUser$1);
                        if (createUser == enumC1260a) {
                            return enumC1260a;
                        }
                        loginUserOperationExecutor = this;
                        map2 = map;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str2 = (String) loginUserOperationExecutor$createUser$1.L$3;
                            ?? r42 = (Map) loginUserOperationExecutor$createUser$1.L$2;
                            map2 = (Map) loginUserOperationExecutor$createUser$1.L$1;
                            loginUserOperation2 = (LoginUserOperation) loginUserOperationExecutor$createUser$1.L$0;
                            g.y(obj2);
                            list2 = null;
                            linkedHashMap3 = r42;
                            str = str2;
                            loginUserOperation3 = loginUserOperation2;
                            linkedHashMap2 = linkedHashMap3;
                            return new ExecutionResponse(ExecutionResult.SUCCESS, linkedHashMap2, map2.isEmpty() ? b.W(new RefreshUserOperation(loginUserOperation3.getAppId(), str, loginUserOperation3.getExternalId())) : list2, null, 8, null);
                        }
                        List list3 = (List) loginUserOperationExecutor$createUser$1.L$3;
                        Map<String, SubscriptionObject> map4 = (Map) loginUserOperationExecutor$createUser$1.L$2;
                        LoginUserOperation loginUserOperation4 = (LoginUserOperation) loginUserOperationExecutor$createUser$1.L$1;
                        loginUserOperationExecutor = (LoginUserOperationExecutor) loginUserOperationExecutor$createUser$1.L$0;
                        g.y(obj2);
                        b02 = list3;
                        loginUserOperation3 = loginUserOperation4;
                        map2 = map4;
                        createUser = obj2;
                    }
                    CreateUserResponse createUserResponse = (CreateUserResponse) createUser;
                    linkedHashMap = new LinkedHashMap();
                    String str3 = createUserResponse.getIdentities().get(IdentityConstants.ONESIGNAL_ID);
                    i.b(str3);
                    str = str3;
                    linkedHashMap.put(loginUserOperation3.getOnesignalId(), str);
                    model = loginUserOperationExecutor._identityModelStore.getModel();
                    model2 = loginUserOperationExecutor._propertiesModelStore.getModel();
                    if (i.a(model.getOnesignalId(), loginUserOperation3.getOnesignalId())) {
                        Model.setStringProperty$default(model, IdentityConstants.ONESIGNAL_ID, str, ModelChangeTags.HYDRATE, false, 8, null);
                    }
                    if (i.a(model2.getOnesignalId(), loginUserOperation3.getOnesignalId())) {
                        Model.setStringProperty$default(model2, "onesignalId", str, ModelChangeTags.HYDRATE, false, 8, null);
                    }
                    Set W02 = AbstractC0465j.W0(createUserResponse.getSubscriptions());
                    for (C0430g c0430g : b02) {
                        Iterator it2 = W02.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (i.a(((SubscriptionObject) obj).getId(), c0430g.f5668a)) {
                                break;
                            }
                        }
                        SubscriptionObject subscriptionObject3 = (SubscriptionObject) obj;
                        if (subscriptionObject3 == null) {
                            Iterator it3 = W02.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    subscriptionObject2 = 0;
                                    break;
                                }
                                subscriptionObject2 = it3.next();
                                SubscriptionObject subscriptionObject4 = (SubscriptionObject) subscriptionObject2;
                                if (i.a(subscriptionObject4.getToken(), ((SubscriptionObject) c0430g.f5669b).getToken()) && (token = subscriptionObject4.getToken()) != null && !k.Z(token)) {
                                    break;
                                }
                            }
                            subscriptionObject3 = subscriptionObject2;
                        }
                        if (subscriptionObject3 == null) {
                            Iterator it4 = W02.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    subscriptionObject = null;
                                    break;
                                }
                                ?? next = it4.next();
                                if (((SubscriptionObject) next).getType() == ((SubscriptionObject) c0430g.f5669b).getType()) {
                                    subscriptionObject = next;
                                    break;
                                }
                            }
                            subscriptionObject3 = subscriptionObject;
                        }
                        if (subscriptionObject3 != null) {
                            Object obj3 = c0430g.f5668a;
                            String id = subscriptionObject3.getId();
                            i.b(id);
                            linkedHashMap.put(obj3, id);
                            if (i.a(loginUserOperationExecutor._configModelStore.getModel().getPushSubscriptionId(), obj3)) {
                                loginUserOperationExecutor._configModelStore.getModel().setPushSubscriptionId(subscriptionObject3.getId());
                            }
                            SubscriptionModel subscriptionModel = (SubscriptionModel) loginUserOperationExecutor._subscriptionsModelStore.get((String) obj3);
                            if (subscriptionModel != null) {
                                String id2 = subscriptionObject3.getId();
                                i.b(id2);
                                Model.setStringProperty$default(subscriptionModel, OutcomeConstants.OUTCOME_ID, id2, ModelChangeTags.HYDRATE, false, 8, null);
                            }
                        } else {
                            Logging.error$default("LoginUserOperationExecutor.createUser response is missing subscription data for " + ((String) c0430g.f5668a), null, 2, null);
                        }
                        v.a(W02);
                        W02.remove(subscriptionObject3);
                    }
                    list2 = null;
                    if (loginUserOperationExecutor._identityVerificationService.getNewCodePathsRun() || (rywData = createUserResponse.getRywData()) == null) {
                        linkedHashMap2 = linkedHashMap;
                        return new ExecutionResponse(ExecutionResult.SUCCESS, linkedHashMap2, map2.isEmpty() ? b.W(new RefreshUserOperation(loginUserOperation3.getAppId(), str, loginUserOperation3.getExternalId())) : list2, null, 8, null);
                    }
                    IConsistencyManager iConsistencyManager = loginUserOperationExecutor._consistencyManager;
                    IamFetchRywTokenKey iamFetchRywTokenKey = IamFetchRywTokenKey.USER;
                    loginUserOperationExecutor$createUser$1.L$0 = loginUserOperation3;
                    loginUserOperationExecutor$createUser$1.L$1 = map2;
                    loginUserOperationExecutor$createUser$1.L$2 = linkedHashMap;
                    loginUserOperationExecutor$createUser$1.L$3 = str;
                    loginUserOperationExecutor$createUser$1.label = 2;
                    if (iConsistencyManager.setRywData(str, iamFetchRywTokenKey, rywData, loginUserOperationExecutor$createUser$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    loginUserOperation2 = loginUserOperation3;
                    linkedHashMap3 = linkedHashMap;
                    str2 = str;
                    str = str2;
                    loginUserOperation3 = loginUserOperation2;
                    linkedHashMap2 = linkedHashMap3;
                    return new ExecutionResponse(ExecutionResult.SUCCESS, linkedHashMap2, map2.isEmpty() ? b.W(new RefreshUserOperation(loginUserOperation3.getAppId(), str, loginUserOperation3.getExternalId())) : list2, null, 8, null);
                }
            }
            if (i2 != 0) {
            }
            CreateUserResponse createUserResponse2 = (CreateUserResponse) createUser;
            linkedHashMap = new LinkedHashMap();
            String str32 = createUserResponse2.getIdentities().get(IdentityConstants.ONESIGNAL_ID);
            i.b(str32);
            str = str32;
            linkedHashMap.put(loginUserOperation3.getOnesignalId(), str);
            model = loginUserOperationExecutor._identityModelStore.getModel();
            model2 = loginUserOperationExecutor._propertiesModelStore.getModel();
            if (i.a(model.getOnesignalId(), loginUserOperation3.getOnesignalId())) {
            }
            if (i.a(model2.getOnesignalId(), loginUserOperation3.getOnesignalId())) {
            }
            Set W022 = AbstractC0465j.W0(createUserResponse2.getSubscriptions());
            while (r2.hasNext()) {
            }
            list2 = null;
            if (loginUserOperationExecutor._identityVerificationService.getNewCodePathsRun()) {
            }
            linkedHashMap2 = linkedHashMap;
            return new ExecutionResponse(ExecutionResult.SUCCESS, linkedHashMap2, map2.isEmpty() ? b.W(new RefreshUserOperation(loginUserOperation3.getAppId(), str, loginUserOperation3.getExternalId())) : list2, null, 8, null);
        } catch (BackendException e3) {
            int i6 = WhenMappings.$EnumSwitchMapping$1[NetworkUtils.INSTANCE.getResponseStatusType(e3.getStatusCode()).ordinal()];
            if (i6 == 1) {
                executionResponse = new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e3.getRetryAfterSeconds(), 6, null);
            } else {
                if (i6 != 2) {
                    return new ExecutionResponse(ExecutionResult.FAIL_PAUSE_OPREPO, null, null, null, 14, null);
                }
                executionResponse = new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e3.getRetryAfterSeconds(), 6, null);
            }
            return executionResponse;
        }
        loginUserOperationExecutor$createUser$1 = new LoginUserOperationExecutor$createUser$1(this, interfaceC1218d);
        Object obj22 = loginUserOperationExecutor$createUser$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = loginUserOperationExecutor$createUser$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginUser(LoginUserOperation loginUserOperation, List<? extends Operation> list, InterfaceC1218d interfaceC1218d) {
        LoginUserOperationExecutor$loginUser$1 loginUserOperationExecutor$loginUser$1;
        int i2;
        LoginUserOperationExecutor loginUserOperationExecutor;
        int i3;
        LoginUserOperation loginUserOperation2 = loginUserOperation;
        List<? extends Operation> list2 = list;
        if (interfaceC1218d instanceof LoginUserOperationExecutor$loginUser$1) {
            loginUserOperationExecutor$loginUser$1 = (LoginUserOperationExecutor$loginUser$1) interfaceC1218d;
            int i6 = loginUserOperationExecutor$loginUser$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                loginUserOperationExecutor$loginUser$1.label = i6 - Integer.MIN_VALUE;
                Object obj = loginUserOperationExecutor$loginUser$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = loginUserOperationExecutor$loginUser$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        g.y(obj);
                    }
                    if (i2 != 2) {
                        if (i2 == 3) {
                            g.y(obj);
                        }
                        if (i2 == 4) {
                            g.y(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List<? extends Operation> list3 = (List) loginUserOperationExecutor$loginUser$1.L$2;
                    LoginUserOperation loginUserOperation3 = (LoginUserOperation) loginUserOperationExecutor$loginUser$1.L$1;
                    loginUserOperationExecutor = (LoginUserOperationExecutor) loginUserOperationExecutor$loginUser$1.L$0;
                    g.y(obj);
                    list2 = list3;
                    loginUserOperation2 = loginUserOperation3;
                    ExecutionResponse executionResponse = (ExecutionResponse) obj;
                    i3 = WhenMappings.$EnumSwitchMapping$0[executionResponse.getResult().ordinal()];
                    if (i3 != 1) {
                        String existingOnesignalId = loginUserOperation2.getExistingOnesignalId();
                        i.b(existingOnesignalId);
                        if (i.a(loginUserOperationExecutor._identityModelStore.getModel().getOnesignalId(), loginUserOperation2.getOnesignalId())) {
                            Model.setStringProperty$default(loginUserOperationExecutor._identityModelStore.getModel(), IdentityConstants.ONESIGNAL_ID, existingOnesignalId, ModelChangeTags.HYDRATE, false, 8, null);
                        }
                        if (i.a(loginUserOperationExecutor._propertiesModelStore.getModel().getOnesignalId(), loginUserOperation2.getOnesignalId())) {
                            Model.setStringProperty$default(loginUserOperationExecutor._propertiesModelStore.getModel(), "onesignalId", existingOnesignalId, ModelChangeTags.HYDRATE, false, 8, null);
                        }
                        return new ExecutionResponse(ExecutionResult.SUCCESS_STARTING_ONLY, AbstractC0476u.X(new C0430g(loginUserOperation2.getOnesignalId(), existingOnesignalId)), null, null, 12, null);
                    }
                    if (i3 == 2) {
                        Logging.debug$default("LoginUserOperationExecutor now handling 409 response with \"code\": \"user-2\" by switching to user with \"external_id\": \"" + loginUserOperation2.getExternalId() + '\"', null, 2, null);
                        loginUserOperationExecutor$loginUser$1.L$0 = null;
                        loginUserOperationExecutor$loginUser$1.L$1 = null;
                        loginUserOperationExecutor$loginUser$1.L$2 = null;
                        loginUserOperationExecutor$loginUser$1.label = 3;
                        obj = loginUserOperationExecutor.createUser(loginUserOperation2, list2, loginUserOperationExecutor$loginUser$1);
                        return obj == enumC1260a ? enumC1260a : obj;
                    }
                    if (i3 != 3) {
                        return new ExecutionResponse(executionResponse.getResult(), null, null, null, 14, null);
                    }
                    Logging.error$default("LoginUserOperationExecutor encountered error. Attempt to recover by switching to user with \"external_id\": \"" + loginUserOperation2.getExternalId() + '\"', null, 2, null);
                    loginUserOperationExecutor$loginUser$1.L$0 = null;
                    loginUserOperationExecutor$loginUser$1.L$1 = null;
                    loginUserOperationExecutor$loginUser$1.L$2 = null;
                    loginUserOperationExecutor$loginUser$1.label = 4;
                    obj = loginUserOperationExecutor.createUser(loginUserOperation2, list2, loginUserOperationExecutor$loginUser$1);
                    return obj == enumC1260a ? enumC1260a : obj;
                }
                g.y(obj);
                if (list2 == null || !list.isEmpty()) {
                    for (Operation operation : list) {
                        if ((operation instanceof CreateSubscriptionOperation) || (operation instanceof TransferSubscriptionOperation)) {
                            break;
                        }
                    }
                }
                if (loginUserOperation.getExternalId() == null) {
                    return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (loginUserOperation.getExistingOnesignalId() == null || loginUserOperation.getExternalId() == null || this._identityVerificationService.getIvBehaviorActive()) {
                    loginUserOperationExecutor$loginUser$1.label = 1;
                    obj = createUser(loginUserOperation2, list2, loginUserOperationExecutor$loginUser$1);
                    return obj == enumC1260a ? enumC1260a : obj;
                }
                IdentityOperationExecutor identityOperationExecutor = this._identityOperationExecutor;
                String appId = loginUserOperation.getAppId();
                String existingOnesignalId2 = loginUserOperation.getExistingOnesignalId();
                i.b(existingOnesignalId2);
                String externalId = loginUserOperation.getExternalId();
                String externalId2 = loginUserOperation.getExternalId();
                i.b(externalId2);
                List<? extends Operation> W5 = b.W(new SetAliasOperation(appId, existingOnesignalId2, externalId, IdentityConstants.EXTERNAL_ID, externalId2));
                loginUserOperationExecutor$loginUser$1.L$0 = this;
                loginUserOperationExecutor$loginUser$1.L$1 = loginUserOperation2;
                loginUserOperationExecutor$loginUser$1.L$2 = list2;
                loginUserOperationExecutor$loginUser$1.label = 2;
                obj = identityOperationExecutor.execute(W5, loginUserOperationExecutor$loginUser$1);
                if (obj == enumC1260a) {
                    return enumC1260a;
                }
                loginUserOperationExecutor = this;
                ExecutionResponse executionResponse2 = (ExecutionResponse) obj;
                i3 = WhenMappings.$EnumSwitchMapping$0[executionResponse2.getResult().ordinal()];
                if (i3 != 1) {
                }
            }
        }
        loginUserOperationExecutor$loginUser$1 = new LoginUserOperationExecutor$loginUser$1(this, interfaceC1218d);
        Object obj2 = loginUserOperationExecutor$loginUser$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = loginUserOperationExecutor$loginUser$1.label;
        if (i2 == 0) {
        }
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public Object execute(List<? extends Operation> list, InterfaceC1218d interfaceC1218d) {
        List<? extends Operation> list2;
        Logging.debug$default("LoginUserOperationExecutor(operation: " + list + ')', null, 2, null);
        Operation operation = (Operation) AbstractC0465j.F0(list);
        if (!(operation instanceof LoginUserOperation)) {
            throw new Exception("Unrecognized operation: " + operation);
        }
        LoginUserOperation loginUserOperation = (LoginUserOperation) operation;
        int size = list.size() - 1;
        if (size <= 0) {
            list2 = C0471p.f5750a;
        } else if (size == 1) {
            list2 = b.W(AbstractC0465j.L0(list));
        } else {
            ArrayList arrayList = new ArrayList(size);
            if (list instanceof RandomAccess) {
                int size2 = list.size();
                for (int i2 = 1; i2 < size2; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator<? extends Operation> listIterator = list.listIterator(1);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            list2 = arrayList;
        }
        return loginUser(loginUserOperation, list2, interfaceC1218d);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return b.W(LOGIN_USER);
    }

    private final Map<String, SubscriptionObject> createSubscriptionsFromOperation(CreateSubscriptionOperation createSubscriptionOperation, Map<String, SubscriptionObject> map) {
        SubscriptionObjectType subscriptionObjectType;
        LinkedHashMap e02 = AbstractC0476u.e0(map);
        int i2 = WhenMappings.$EnumSwitchMapping$2[createSubscriptionOperation.getType().ordinal()];
        if (i2 == 1) {
            subscriptionObjectType = SubscriptionObjectType.SMS;
        } else if (i2 != 2) {
            subscriptionObjectType = SubscriptionObjectType.Companion.fromDeviceType(this._deviceService.getDeviceType());
        } else {
            subscriptionObjectType = SubscriptionObjectType.EMAIL;
        }
        SubscriptionObjectType subscriptionObjectType2 = subscriptionObjectType;
        String subscriptionId = !IDManager.INSTANCE.isLocalId(createSubscriptionOperation.getSubscriptionId()) ? createSubscriptionOperation.getSubscriptionId() : null;
        String subscriptionId2 = createSubscriptionOperation.getSubscriptionId();
        String address = createSubscriptionOperation.getAddress();
        Boolean valueOf = Boolean.valueOf(createSubscriptionOperation.getEnabled());
        Integer valueOf2 = Integer.valueOf(createSubscriptionOperation.getStatus().getValue());
        String sdkVersion = OneSignalUtils.INSTANCE.getSdkVersion();
        String str = Build.MODEL;
        String str2 = Build.VERSION.RELEASE;
        Boolean valueOf3 = Boolean.valueOf(RootToolsInternalMethods.INSTANCE.isRooted());
        DeviceUtils deviceUtils = DeviceUtils.INSTANCE;
        e02.put(subscriptionId2, new SubscriptionObject(subscriptionId, subscriptionObjectType2, address, valueOf, valueOf2, sdkVersion, str, str2, valueOf3, deviceUtils.getNetType(this._application.getAppContext()), deviceUtils.getCarrierName(this._application.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._application.getAppContext())));
        return e02;
    }

    private final Map<String, SubscriptionObject> createSubscriptionsFromOperation(UpdateSubscriptionOperation updateSubscriptionOperation, Map<String, SubscriptionObject> map) {
        LinkedHashMap e02 = AbstractC0476u.e0(map);
        if (e02.containsKey(updateSubscriptionOperation.getSubscriptionId())) {
            String subscriptionId = updateSubscriptionOperation.getSubscriptionId();
            SubscriptionObject subscriptionObject = map.get(updateSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject);
            String id = subscriptionObject.getId();
            SubscriptionObject subscriptionObject2 = map.get(updateSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject2);
            SubscriptionObjectType type = subscriptionObject2.getType();
            String address = updateSubscriptionOperation.getAddress();
            Boolean valueOf = Boolean.valueOf(updateSubscriptionOperation.getEnabled());
            Integer valueOf2 = Integer.valueOf(updateSubscriptionOperation.getStatus().getValue());
            SubscriptionObject subscriptionObject3 = map.get(updateSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject3);
            String sdk = subscriptionObject3.getSdk();
            SubscriptionObject subscriptionObject4 = map.get(updateSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject4);
            String deviceModel = subscriptionObject4.getDeviceModel();
            SubscriptionObject subscriptionObject5 = map.get(updateSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject5);
            String deviceOS = subscriptionObject5.getDeviceOS();
            SubscriptionObject subscriptionObject6 = map.get(updateSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject6);
            Boolean rooted = subscriptionObject6.getRooted();
            SubscriptionObject subscriptionObject7 = map.get(updateSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject7);
            Integer netType = subscriptionObject7.getNetType();
            SubscriptionObject subscriptionObject8 = map.get(updateSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject8);
            String carrier = subscriptionObject8.getCarrier();
            SubscriptionObject subscriptionObject9 = map.get(updateSubscriptionOperation.getSubscriptionId());
            i.b(subscriptionObject9);
            e02.put(subscriptionId, new SubscriptionObject(id, type, address, valueOf, valueOf2, sdk, deviceModel, deviceOS, rooted, netType, carrier, subscriptionObject9.getAppVersion()));
        }
        return e02;
    }

    private final Map<String, SubscriptionObject> createSubscriptionsFromOperation(DeleteSubscriptionOperation deleteSubscriptionOperation, Map<String, SubscriptionObject> map) {
        LinkedHashMap e02 = AbstractC0476u.e0(map);
        e02.remove(deleteSubscriptionOperation.getSubscriptionId());
        return e02;
    }
}
