package com.onesignal.user.internal.operations.impl.executors;

import C1.b;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.IDManager;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.RootToolsInternalMethods;
import com.onesignal.common.consistency.IamFetchReadyCondition;
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
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.user.internal.backend.ISubscriptionBackendService;
import com.onesignal.user.internal.backend.SubscriptionObject;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import com.onesignal.user.internal.builduser.IRebuildUserService;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.CreateSubscriptionOperation;
import com.onesignal.user.internal.operations.DeleteSubscriptionOperation;
import com.onesignal.user.internal.operations.TransferSubscriptionOperation;
import com.onesignal.user.internal.operations.UpdateSubscriptionOperation;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import e5.g;
import f4.C0430g;
import g4.AbstractC0465j;
import g4.AbstractC0466k;
import g4.AbstractC0476u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class SubscriptionOperationExecutor implements IOperationExecutor {
    public static final String CREATE_SUBSCRIPTION = "create-subscription";
    public static final Companion Companion = new Companion(null);
    public static final String DELETE_SUBSCRIPTION = "delete-subscription";
    public static final String TRANSFER_SUBSCRIPTION = "transfer-subscription";
    public static final String UPDATE_SUBSCRIPTION = "update-subscription";
    private final IApplicationService _applicationService;
    private final IRebuildUserService _buildUserService;
    private final ConfigModelStore _configModelStore;
    private final IConsistencyManager _consistencyManager;
    private final IDeviceService _deviceService;
    private final IdentityVerificationService _identityVerificationService;
    private final JwtTokenStore _jwtTokenStore;
    private final NewRecordsState _newRecordState;
    private final ISubscriptionBackendService _subscriptionBackend;
    private final SubscriptionModelStore _subscriptionModelStore;

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

        static {
            int[] iArr = new int[NetworkUtils.ResponseStatusType.values().length];
            try {
                iArr[NetworkUtils.ResponseStatusType.RETRYABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkUtils.ResponseStatusType.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkUtils.ResponseStatusType.INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkUtils.ResponseStatusType.UNAUTHORIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkUtils.ResponseStatusType.MISSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SubscriptionType.values().length];
            try {
                iArr2[SubscriptionType.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SubscriptionType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public SubscriptionOperationExecutor(ISubscriptionBackendService _subscriptionBackend, IDeviceService _deviceService, IApplicationService _applicationService, SubscriptionModelStore _subscriptionModelStore, ConfigModelStore _configModelStore, IRebuildUserService _buildUserService, NewRecordsState _newRecordState, IConsistencyManager _consistencyManager, JwtTokenStore _jwtTokenStore, IdentityVerificationService _identityVerificationService) {
        i.e(_subscriptionBackend, "_subscriptionBackend");
        i.e(_deviceService, "_deviceService");
        i.e(_applicationService, "_applicationService");
        i.e(_subscriptionModelStore, "_subscriptionModelStore");
        i.e(_configModelStore, "_configModelStore");
        i.e(_buildUserService, "_buildUserService");
        i.e(_newRecordState, "_newRecordState");
        i.e(_consistencyManager, "_consistencyManager");
        i.e(_jwtTokenStore, "_jwtTokenStore");
        i.e(_identityVerificationService, "_identityVerificationService");
        this._subscriptionBackend = _subscriptionBackend;
        this._deviceService = _deviceService;
        this._applicationService = _applicationService;
        this._subscriptionModelStore = _subscriptionModelStore;
        this._configModelStore = _configModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._consistencyManager = _consistencyManager;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    private final SubscriptionObjectType convert(SubscriptionType subscriptionType) {
        int i2 = WhenMappings.$EnumSwitchMapping$1[subscriptionType.ordinal()];
        return i2 != 1 ? i2 != 2 ? SubscriptionObjectType.Companion.fromDeviceType(this._deviceService.getDeviceType()) : SubscriptionObjectType.EMAIL : SubscriptionObjectType.SMS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c6 A[Catch: BackendException -> 0x01d3, TryCatch #1 {BackendException -> 0x01d3, blocks: (B:16:0x01b8, B:18:0x01c6, B:19:0x01d6, B:21:0x01ec, B:22:0x01f7), top: B:15:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ec A[Catch: BackendException -> 0x01d3, TryCatch #1 {BackendException -> 0x01d3, blocks: (B:16:0x01b8, B:18:0x01c6, B:19:0x01d6, B:21:0x01ec, B:22:0x01f7), top: B:15:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016d A[Catch: BackendException -> 0x0069, TryCatch #3 {BackendException -> 0x0069, blocks: (B:63:0x0064, B:64:0x0169, B:66:0x016d, B:68:0x0181, B:70:0x018b, B:74:0x01a5), top: B:62:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181 A[Catch: BackendException -> 0x0069, TryCatch #3 {BackendException -> 0x0069, blocks: (B:63:0x0064, B:64:0x0169, B:66:0x016d, B:68:0x0181, B:70:0x018b, B:74:0x01a5), top: B:62:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSubscription(CreateSubscriptionOperation createSubscriptionOperation, List<? extends Operation> list, InterfaceC1218d interfaceC1218d) {
        SubscriptionOperationExecutor$createSubscription$1 subscriptionOperationExecutor$createSubscription$1;
        int i2;
        Operation operation;
        String address;
        SubscriptionStatus status;
        SubscriptionOperationExecutor subscriptionOperationExecutor;
        SubscriptionOperationExecutor subscriptionOperationExecutor2;
        C0430g c0430g;
        String str;
        SubscriptionOperationExecutor subscriptionOperationExecutor3;
        SubscriptionModel subscriptionModel;
        CreateSubscriptionOperation createSubscriptionOperation2 = createSubscriptionOperation;
        if (interfaceC1218d instanceof SubscriptionOperationExecutor$createSubscription$1) {
            subscriptionOperationExecutor$createSubscription$1 = (SubscriptionOperationExecutor$createSubscription$1) interfaceC1218d;
            int i3 = subscriptionOperationExecutor$createSubscription$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                subscriptionOperationExecutor$createSubscription$1.label = i3 - Integer.MIN_VALUE;
                Object obj = subscriptionOperationExecutor$createSubscription$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = subscriptionOperationExecutor$createSubscription$1.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            str = (String) subscriptionOperationExecutor$createSubscription$1.L$2;
                            createSubscriptionOperation2 = (CreateSubscriptionOperation) subscriptionOperationExecutor$createSubscription$1.L$1;
                            subscriptionOperationExecutor = (SubscriptionOperationExecutor) subscriptionOperationExecutor$createSubscription$1.L$0;
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = (String) subscriptionOperationExecutor$createSubscription$1.L$2;
                            createSubscriptionOperation2 = (CreateSubscriptionOperation) subscriptionOperationExecutor$createSubscription$1.L$1;
                            subscriptionOperationExecutor = (SubscriptionOperationExecutor) subscriptionOperationExecutor$createSubscription$1.L$0;
                        }
                        try {
                            g.y(obj);
                            subscriptionOperationExecutor3 = subscriptionOperationExecutor;
                            try {
                                subscriptionModel = (SubscriptionModel) subscriptionOperationExecutor3._subscriptionModelStore.get(createSubscriptionOperation2.getSubscriptionId());
                                if (subscriptionModel != null) {
                                    Model.setStringProperty$default(subscriptionModel, OutcomeConstants.OUTCOME_ID, str, ModelChangeTags.HYDRATE, false, 8, null);
                                }
                                if (i.a(subscriptionOperationExecutor3._configModelStore.getModel().getPushSubscriptionId(), createSubscriptionOperation2.getSubscriptionId())) {
                                    subscriptionOperationExecutor3._configModelStore.getModel().setPushSubscriptionId(str);
                                }
                                return new ExecutionResponse(ExecutionResult.SUCCESS, AbstractC0476u.X(new C0430g(createSubscriptionOperation2.getSubscriptionId(), str)), null, null, 12, null);
                            } catch (BackendException e3) {
                                e = e3;
                                subscriptionOperationExecutor = subscriptionOperationExecutor3;
                            }
                        } catch (BackendException e6) {
                            e = e6;
                        }
                    } else {
                        createSubscriptionOperation2 = (CreateSubscriptionOperation) subscriptionOperationExecutor$createSubscription$1.L$1;
                        subscriptionOperationExecutor2 = (SubscriptionOperationExecutor) subscriptionOperationExecutor$createSubscription$1.L$0;
                        try {
                            g.y(obj);
                        } catch (BackendException e7) {
                            e = e7;
                            subscriptionOperationExecutor = subscriptionOperationExecutor2;
                        }
                    }
                    int i6 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i6 == 1) {
                        return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i6 == 2 || i6 == 3) {
                        return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                    }
                    if (i6 == 4) {
                        return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    if (i6 != 5) {
                        throw new b();
                    }
                    if (e.getStatusCode() == 404 && subscriptionOperationExecutor._newRecordState.isInMissingRetryWindow(createSubscriptionOperation2.getOnesignalId())) {
                        return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    List<Operation> rebuildOperationsIfCurrentUser = subscriptionOperationExecutor._buildUserService.getRebuildOperationsIfCurrentUser(createSubscriptionOperation2.getAppId(), createSubscriptionOperation2.getOnesignalId());
                    return rebuildOperationsIfCurrentUser == null ? new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null) : new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                }
                g.y(obj);
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((Operation) it.next()) instanceof DeleteSubscriptionOperation) {
                            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                        }
                    }
                }
                ListIterator<? extends Operation> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        operation = null;
                        break;
                    }
                    operation = listIterator.previous();
                    if (operation instanceof UpdateSubscriptionOperation) {
                        break;
                    }
                }
                UpdateSubscriptionOperation updateSubscriptionOperation = (UpdateSubscriptionOperation) operation;
                boolean enabled = updateSubscriptionOperation != null ? updateSubscriptionOperation.getEnabled() : createSubscriptionOperation.getEnabled();
                if (updateSubscriptionOperation == null || (address = updateSubscriptionOperation.getAddress()) == null) {
                    address = createSubscriptionOperation.getAddress();
                }
                String str2 = address;
                if (updateSubscriptionOperation == null || (status = updateSubscriptionOperation.getStatus()) == null) {
                    status = createSubscriptionOperation.getStatus();
                }
                try {
                    SubscriptionObjectType convert = convert(createSubscriptionOperation.getType());
                    Boolean valueOf = Boolean.valueOf(enabled);
                    Integer num = new Integer(status.getValue());
                    String sdkVersion = OneSignalUtils.INSTANCE.getSdkVersion();
                    String str3 = Build.MODEL;
                    String str4 = Build.VERSION.RELEASE;
                    Boolean valueOf2 = Boolean.valueOf(RootToolsInternalMethods.INSTANCE.isRooted());
                    DeviceUtils deviceUtils = DeviceUtils.INSTANCE;
                    SubscriptionObject subscriptionObject = new SubscriptionObject(null, convert, str2, valueOf, num, sdkVersion, str3, str4, valueOf2, deviceUtils.getNetType(this._applicationService.getAppContext()), deviceUtils.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                    IvBackendParams resolveBackendParams = ExecutorsIvExtensionsKt.resolveBackendParams(createSubscriptionOperation2, createSubscriptionOperation.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                    ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
                    String appId = createSubscriptionOperation.getAppId();
                    String aliasLabel = resolveBackendParams.getAliasLabel();
                    String aliasValue = resolveBackendParams.getAliasValue();
                    String jwt = resolveBackendParams.getJwt();
                    subscriptionOperationExecutor$createSubscription$1.L$0 = this;
                    subscriptionOperationExecutor$createSubscription$1.L$1 = createSubscriptionOperation2;
                    subscriptionOperationExecutor$createSubscription$1.label = 1;
                    obj = iSubscriptionBackendService.createSubscription(appId, aliasLabel, aliasValue, subscriptionObject, jwt, subscriptionOperationExecutor$createSubscription$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    subscriptionOperationExecutor2 = this;
                } catch (BackendException e8) {
                    e = e8;
                    subscriptionOperationExecutor = this;
                }
                c0430g = (C0430g) obj;
                if (c0430g != null) {
                    return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                }
                str = (String) c0430g.f5668a;
                RywData rywData = (RywData) c0430g.f5669b;
                if (rywData != null) {
                    IConsistencyManager iConsistencyManager = subscriptionOperationExecutor2._consistencyManager;
                    String onesignalId = createSubscriptionOperation2.getOnesignalId();
                    IamFetchRywTokenKey iamFetchRywTokenKey = IamFetchRywTokenKey.SUBSCRIPTION;
                    subscriptionOperationExecutor$createSubscription$1.L$0 = subscriptionOperationExecutor2;
                    subscriptionOperationExecutor$createSubscription$1.L$1 = createSubscriptionOperation2;
                    subscriptionOperationExecutor$createSubscription$1.L$2 = str;
                    subscriptionOperationExecutor$createSubscription$1.label = 2;
                    if (iConsistencyManager.setRywData(onesignalId, iamFetchRywTokenKey, rywData, subscriptionOperationExecutor$createSubscription$1) == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    IConsistencyManager iConsistencyManager2 = subscriptionOperationExecutor2._consistencyManager;
                    subscriptionOperationExecutor$createSubscription$1.L$0 = subscriptionOperationExecutor2;
                    subscriptionOperationExecutor$createSubscription$1.L$1 = createSubscriptionOperation2;
                    subscriptionOperationExecutor$createSubscription$1.L$2 = str;
                    subscriptionOperationExecutor$createSubscription$1.label = 3;
                    if (iConsistencyManager2.resolveConditionsWithID(IamFetchReadyCondition.ID, subscriptionOperationExecutor$createSubscription$1) == enumC1260a) {
                        return enumC1260a;
                    }
                }
                subscriptionOperationExecutor = subscriptionOperationExecutor2;
                subscriptionOperationExecutor3 = subscriptionOperationExecutor;
                subscriptionModel = (SubscriptionModel) subscriptionOperationExecutor3._subscriptionModelStore.get(createSubscriptionOperation2.getSubscriptionId());
                if (subscriptionModel != null) {
                }
                if (i.a(subscriptionOperationExecutor3._configModelStore.getModel().getPushSubscriptionId(), createSubscriptionOperation2.getSubscriptionId())) {
                }
                return new ExecutionResponse(ExecutionResult.SUCCESS, AbstractC0476u.X(new C0430g(createSubscriptionOperation2.getSubscriptionId(), str)), null, null, 12, null);
            }
        }
        subscriptionOperationExecutor$createSubscription$1 = new SubscriptionOperationExecutor$createSubscription$1(this, interfaceC1218d);
        Object obj2 = subscriptionOperationExecutor$createSubscription$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = subscriptionOperationExecutor$createSubscription$1.label;
        if (i2 == 0) {
        }
        c0430g = (C0430g) obj2;
        if (c0430g != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteSubscription(DeleteSubscriptionOperation deleteSubscriptionOperation, InterfaceC1218d interfaceC1218d) {
        SubscriptionOperationExecutor$deleteSubscription$1 subscriptionOperationExecutor$deleteSubscription$1;
        int i2;
        SubscriptionOperationExecutor subscriptionOperationExecutor;
        int i3;
        ExecutionResponse executionResponse;
        DeleteSubscriptionOperation deleteSubscriptionOperation2 = deleteSubscriptionOperation;
        if (interfaceC1218d instanceof SubscriptionOperationExecutor$deleteSubscription$1) {
            subscriptionOperationExecutor$deleteSubscription$1 = (SubscriptionOperationExecutor$deleteSubscription$1) interfaceC1218d;
            int i6 = subscriptionOperationExecutor$deleteSubscription$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                subscriptionOperationExecutor$deleteSubscription$1.label = i6 - Integer.MIN_VALUE;
                Object obj = subscriptionOperationExecutor$deleteSubscription$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = subscriptionOperationExecutor$deleteSubscription$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    String resolveJwt = ExecutorsIvExtensionsKt.resolveJwt(deleteSubscriptionOperation2, this._jwtTokenStore, this._identityVerificationService);
                    try {
                        ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
                        String appId = deleteSubscriptionOperation.getAppId();
                        String subscriptionId = deleteSubscriptionOperation.getSubscriptionId();
                        subscriptionOperationExecutor$deleteSubscription$1.L$0 = this;
                        subscriptionOperationExecutor$deleteSubscription$1.L$1 = deleteSubscriptionOperation2;
                        subscriptionOperationExecutor$deleteSubscription$1.label = 1;
                        if (iSubscriptionBackendService.deleteSubscription(appId, subscriptionId, resolveJwt, subscriptionOperationExecutor$deleteSubscription$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        subscriptionOperationExecutor = this;
                    } catch (BackendException e3) {
                        e = e3;
                        subscriptionOperationExecutor = this;
                        i3 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i3 == 1) {
                        }
                        return executionResponse;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    deleteSubscriptionOperation2 = (DeleteSubscriptionOperation) subscriptionOperationExecutor$deleteSubscription$1.L$1;
                    subscriptionOperationExecutor = (SubscriptionOperationExecutor) subscriptionOperationExecutor$deleteSubscription$1.L$0;
                    try {
                        g.y(obj);
                    } catch (BackendException e6) {
                        e = e6;
                        i3 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i3 == 1) {
                            if (i3 == 4) {
                                return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            if (i3 != 5) {
                                return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                            }
                            if (e.getStatusCode() == 404) {
                                List A02 = AbstractC0466k.A0(deleteSubscriptionOperation2.getOnesignalId(), deleteSubscriptionOperation2.getSubscriptionId());
                                if (!A02.isEmpty()) {
                                    Iterator it = A02.iterator();
                                    while (it.hasNext()) {
                                        if (subscriptionOperationExecutor._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                            executionResponse = new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                        }
                                    }
                                }
                            }
                            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                        }
                        executionResponse = new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        return executionResponse;
                    }
                }
                subscriptionOperationExecutor._subscriptionModelStore.remove(deleteSubscriptionOperation2.getSubscriptionId(), ModelChangeTags.HYDRATE);
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
            }
        }
        subscriptionOperationExecutor$deleteSubscription$1 = new SubscriptionOperationExecutor$deleteSubscription$1(this, interfaceC1218d);
        Object obj2 = subscriptionOperationExecutor$deleteSubscription$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = subscriptionOperationExecutor$deleteSubscription$1.label;
        if (i2 != 0) {
        }
        subscriptionOperationExecutor._subscriptionModelStore.remove(deleteSubscriptionOperation2.getSubscriptionId(), ModelChangeTags.HYDRATE);
        return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transferSubscription(TransferSubscriptionOperation transferSubscriptionOperation, InterfaceC1218d interfaceC1218d) {
        SubscriptionOperationExecutor$transferSubscription$1 subscriptionOperationExecutor$transferSubscription$1;
        int i2;
        ExecutionResponse executionResponse;
        try {
            if (interfaceC1218d instanceof SubscriptionOperationExecutor$transferSubscription$1) {
                subscriptionOperationExecutor$transferSubscription$1 = (SubscriptionOperationExecutor$transferSubscription$1) interfaceC1218d;
                int i3 = subscriptionOperationExecutor$transferSubscription$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    subscriptionOperationExecutor$transferSubscription$1.label = i3 - Integer.MIN_VALUE;
                    SubscriptionOperationExecutor$transferSubscription$1 subscriptionOperationExecutor$transferSubscription$12 = subscriptionOperationExecutor$transferSubscription$1;
                    Object obj = subscriptionOperationExecutor$transferSubscription$12.result;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = subscriptionOperationExecutor$transferSubscription$12.label;
                    if (i2 != 0) {
                        g.y(obj);
                        IvBackendParams resolveBackendParams = ExecutorsIvExtensionsKt.resolveBackendParams(transferSubscriptionOperation, transferSubscriptionOperation.getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                        ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
                        String appId = transferSubscriptionOperation.getAppId();
                        String subscriptionId = transferSubscriptionOperation.getSubscriptionId();
                        String aliasLabel = resolveBackendParams.getAliasLabel();
                        String aliasValue = resolveBackendParams.getAliasValue();
                        String jwt = resolveBackendParams.getJwt();
                        subscriptionOperationExecutor$transferSubscription$12.label = 1;
                        if (iSubscriptionBackendService.transferSubscription(appId, subscriptionId, aliasLabel, aliasValue, jwt, subscriptionOperationExecutor$transferSubscription$12) == enumC1260a) {
                            return enumC1260a;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.y(obj);
                    }
                    return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i2 != 0) {
            }
            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
        } catch (BackendException e3) {
            int i6 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e3.getStatusCode()).ordinal()];
            if (i6 == 1) {
                executionResponse = new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e3.getRetryAfterSeconds(), 6, null);
            } else {
                if (i6 != 4) {
                    return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                }
                executionResponse = new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e3.getRetryAfterSeconds(), 6, null);
            }
            return executionResponse;
        }
        subscriptionOperationExecutor$transferSubscription$1 = new SubscriptionOperationExecutor$transferSubscription$1(this, interfaceC1218d);
        SubscriptionOperationExecutor$transferSubscription$1 subscriptionOperationExecutor$transferSubscription$122 = subscriptionOperationExecutor$transferSubscription$1;
        Object obj2 = subscriptionOperationExecutor$transferSubscription$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = subscriptionOperationExecutor$transferSubscription$122.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateExistingSubscriptionFromCreate(CreateSubscriptionOperation createSubscriptionOperation, List<? extends Operation> list, InterfaceC1218d interfaceC1218d) {
        Operation operation;
        String address;
        SubscriptionStatus status;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Operation) it.next()) instanceof DeleteSubscriptionOperation) {
                    return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                }
            }
        }
        ListIterator<? extends Operation> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                operation = null;
                break;
            }
            operation = listIterator.previous();
            if (operation instanceof UpdateSubscriptionOperation) {
                break;
            }
        }
        UpdateSubscriptionOperation updateSubscriptionOperation = (UpdateSubscriptionOperation) operation;
        String appId = createSubscriptionOperation.getAppId();
        String onesignalId = createSubscriptionOperation.getOnesignalId();
        String externalId = createSubscriptionOperation.getExternalId();
        String subscriptionId = createSubscriptionOperation.getSubscriptionId();
        SubscriptionType type = createSubscriptionOperation.getType();
        boolean enabled = updateSubscriptionOperation != null ? updateSubscriptionOperation.getEnabled() : createSubscriptionOperation.getEnabled();
        if (updateSubscriptionOperation == null || (address = updateSubscriptionOperation.getAddress()) == null) {
            address = createSubscriptionOperation.getAddress();
        }
        UpdateSubscriptionOperation updateSubscriptionOperation2 = new UpdateSubscriptionOperation(appId, onesignalId, externalId, subscriptionId, type, enabled, address, (updateSubscriptionOperation == null || (status = updateSubscriptionOperation.getStatus()) == null) ? createSubscriptionOperation.getStatus() : status);
        return updateSubscription(updateSubscriptionOperation2, K1.b.W(updateSubscriptionOperation2), interfaceC1218d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|(5:(5:(1:(1:11)(2:52|53))(1:54)|12|13|14|15)(4:55|56|57|58)|19|(2:21|(2:23|(2:25|26)(7:27|(2:29|(3:31|(3:34|(3:36|37|38)(1:39)|32)|40))|41|(1:43)|44|(1:46)|47))(1:50))(1:51)|48|49)(4:76|77|78|(1:80)(1:81))|59|60|(2:62|(1:64))(2:67|(1:69))|65|14|15))|85|6|(0)(0)|59|60|(0)(0)|65|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0116, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0117, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff A[Catch: BackendException -> 0x0116, TryCatch #1 {BackendException -> 0x0116, blocks: (B:60:0x00fa, B:62:0x00ff, B:67:0x011a), top: B:59:0x00fa }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a A[Catch: BackendException -> 0x0116, TRY_LEAVE, TryCatch #1 {BackendException -> 0x0116, blocks: (B:60:0x00fa, B:62:0x00ff, B:67:0x011a), top: B:59:0x00fa }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSubscription(UpdateSubscriptionOperation updateSubscriptionOperation, List<? extends Operation> list, InterfaceC1218d interfaceC1218d) {
        SubscriptionOperationExecutor$updateSubscription$1 subscriptionOperationExecutor$updateSubscription$1;
        int i2;
        UpdateSubscriptionOperation updateSubscriptionOperation2;
        SubscriptionOperationExecutor subscriptionOperationExecutor;
        UpdateSubscriptionOperation updateSubscriptionOperation3;
        Object updateSubscription;
        SubscriptionOperationExecutor subscriptionOperationExecutor2;
        UpdateSubscriptionOperation updateSubscriptionOperation4;
        RywData rywData;
        int i3;
        ExecutionResponse executionResponse;
        if (interfaceC1218d instanceof SubscriptionOperationExecutor$updateSubscription$1) {
            subscriptionOperationExecutor$updateSubscription$1 = (SubscriptionOperationExecutor$updateSubscription$1) interfaceC1218d;
            int i6 = subscriptionOperationExecutor$updateSubscription$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                subscriptionOperationExecutor$updateSubscription$1.label = i6 - Integer.MIN_VALUE;
                Object obj = subscriptionOperationExecutor$updateSubscription$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = subscriptionOperationExecutor$updateSubscription$1.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            updateSubscriptionOperation4 = (UpdateSubscriptionOperation) subscriptionOperationExecutor$updateSubscription$1.L$1;
                            subscriptionOperationExecutor = (SubscriptionOperationExecutor) subscriptionOperationExecutor$updateSubscription$1.L$0;
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            updateSubscriptionOperation4 = (UpdateSubscriptionOperation) subscriptionOperationExecutor$updateSubscription$1.L$1;
                            subscriptionOperationExecutor = (SubscriptionOperationExecutor) subscriptionOperationExecutor$updateSubscription$1.L$0;
                        }
                        try {
                            g.y(obj);
                            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                        } catch (BackendException e3) {
                            e = e3;
                        }
                    } else {
                        updateSubscriptionOperation4 = (UpdateSubscriptionOperation) subscriptionOperationExecutor$updateSubscription$1.L$2;
                        UpdateSubscriptionOperation updateSubscriptionOperation5 = (UpdateSubscriptionOperation) subscriptionOperationExecutor$updateSubscription$1.L$1;
                        subscriptionOperationExecutor2 = (SubscriptionOperationExecutor) subscriptionOperationExecutor$updateSubscription$1.L$0;
                        try {
                            g.y(obj);
                            updateSubscriptionOperation2 = updateSubscriptionOperation4;
                            updateSubscription = obj;
                            updateSubscriptionOperation3 = updateSubscriptionOperation5;
                        } catch (BackendException e6) {
                            e = e6;
                            subscriptionOperationExecutor = subscriptionOperationExecutor2;
                        }
                    }
                    i3 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i3 == 1) {
                        executionResponse = new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    } else if (i3 == 4) {
                        executionResponse = new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    } else {
                        if (i3 != 5) {
                            return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (e.getStatusCode() == 404) {
                            List A02 = AbstractC0466k.A0(updateSubscriptionOperation4.getOnesignalId(), updateSubscriptionOperation4.getSubscriptionId());
                            if (!A02.isEmpty()) {
                                Iterator it = A02.iterator();
                                while (it.hasNext()) {
                                    if (subscriptionOperationExecutor._newRecordState.isInMissingRetryWindow((String) it.next())) {
                                        return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                                    }
                                }
                            }
                        }
                        String createLocalId = IDManager.INSTANCE.createLocalId();
                        String subscriptionId = updateSubscriptionOperation4.getSubscriptionId();
                        SubscriptionModel subscriptionModel = (SubscriptionModel) subscriptionOperationExecutor._subscriptionModelStore.get(subscriptionId);
                        if (subscriptionModel != null) {
                            Model.setStringProperty$default(subscriptionModel, OutcomeConstants.OUTCOME_ID, createLocalId, ModelChangeTags.HYDRATE, false, 8, null);
                        }
                        if (i.a(subscriptionOperationExecutor._configModelStore.getModel().getPushSubscriptionId(), subscriptionId)) {
                            subscriptionOperationExecutor._configModelStore.getModel().setPushSubscriptionId(createLocalId);
                        }
                        executionResponse = new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, K1.b.W(new CreateSubscriptionOperation(updateSubscriptionOperation4.getAppId(), updateSubscriptionOperation4.getOnesignalId(), updateSubscriptionOperation4.getExternalId(), createLocalId, updateSubscriptionOperation4.getType(), updateSubscriptionOperation4.getEnabled(), updateSubscriptionOperation4.getAddress(), updateSubscriptionOperation4.getStatus())), null, 10, null);
                    }
                    return executionResponse;
                }
                g.y(obj);
                Object L02 = AbstractC0465j.L0(list);
                i.c(L02, "null cannot be cast to non-null type com.onesignal.user.internal.operations.UpdateSubscriptionOperation");
                updateSubscriptionOperation2 = (UpdateSubscriptionOperation) L02;
                try {
                    SubscriptionObjectType convert = convert(updateSubscriptionOperation2.getType());
                    String address = updateSubscriptionOperation2.getAddress();
                    Boolean valueOf = Boolean.valueOf(updateSubscriptionOperation2.getEnabled());
                    Integer num = new Integer(updateSubscriptionOperation2.getStatus().getValue());
                    String sdkVersion = OneSignalUtils.INSTANCE.getSdkVersion();
                    String str = Build.MODEL;
                    String str2 = Build.VERSION.RELEASE;
                    Boolean valueOf2 = Boolean.valueOf(RootToolsInternalMethods.INSTANCE.isRooted());
                    DeviceUtils deviceUtils = DeviceUtils.INSTANCE;
                    SubscriptionObject subscriptionObject = new SubscriptionObject(null, convert, address, valueOf, num, sdkVersion, str, str2, valueOf2, deviceUtils.getNetType(this._applicationService.getAppContext()), deviceUtils.getCarrierName(this._applicationService.getAppContext()), AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext()));
                    String resolveJwt = ExecutorsIvExtensionsKt.resolveJwt(updateSubscriptionOperation2, this._jwtTokenStore, this._identityVerificationService);
                    ISubscriptionBackendService iSubscriptionBackendService = this._subscriptionBackend;
                    String appId = updateSubscriptionOperation2.getAppId();
                    String subscriptionId2 = updateSubscriptionOperation2.getSubscriptionId();
                    subscriptionOperationExecutor$updateSubscription$1.L$0 = this;
                    updateSubscriptionOperation3 = updateSubscriptionOperation;
                    subscriptionOperationExecutor$updateSubscription$1.L$1 = updateSubscriptionOperation3;
                    subscriptionOperationExecutor$updateSubscription$1.L$2 = updateSubscriptionOperation2;
                    subscriptionOperationExecutor$updateSubscription$1.label = 1;
                    updateSubscription = iSubscriptionBackendService.updateSubscription(appId, subscriptionId2, subscriptionObject, resolveJwt, subscriptionOperationExecutor$updateSubscription$1);
                    if (updateSubscription == enumC1260a) {
                        return enumC1260a;
                    }
                    subscriptionOperationExecutor2 = this;
                } catch (BackendException e7) {
                    e = e7;
                    subscriptionOperationExecutor = this;
                    updateSubscriptionOperation4 = updateSubscriptionOperation2;
                    i3 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i3 == 1) {
                    }
                    return executionResponse;
                }
                rywData = (RywData) updateSubscription;
                if (rywData == null) {
                    IConsistencyManager iConsistencyManager = subscriptionOperationExecutor2._consistencyManager;
                    String onesignalId = updateSubscriptionOperation3.getOnesignalId();
                    IamFetchRywTokenKey iamFetchRywTokenKey = IamFetchRywTokenKey.SUBSCRIPTION;
                    subscriptionOperationExecutor$updateSubscription$1.L$0 = subscriptionOperationExecutor2;
                    subscriptionOperationExecutor$updateSubscription$1.L$1 = updateSubscriptionOperation2;
                    subscriptionOperationExecutor$updateSubscription$1.L$2 = null;
                    subscriptionOperationExecutor$updateSubscription$1.label = 2;
                    if (iConsistencyManager.setRywData(onesignalId, iamFetchRywTokenKey, rywData, subscriptionOperationExecutor$updateSubscription$1) == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    IConsistencyManager iConsistencyManager2 = subscriptionOperationExecutor2._consistencyManager;
                    subscriptionOperationExecutor$updateSubscription$1.L$0 = subscriptionOperationExecutor2;
                    subscriptionOperationExecutor$updateSubscription$1.L$1 = updateSubscriptionOperation2;
                    subscriptionOperationExecutor$updateSubscription$1.L$2 = null;
                    subscriptionOperationExecutor$updateSubscription$1.label = 3;
                    if (iConsistencyManager2.resolveConditionsWithID(IamFetchReadyCondition.ID, subscriptionOperationExecutor$updateSubscription$1) == enumC1260a) {
                        return enumC1260a;
                    }
                }
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
            }
        }
        subscriptionOperationExecutor$updateSubscription$1 = new SubscriptionOperationExecutor$updateSubscription$1(this, interfaceC1218d);
        Object obj2 = subscriptionOperationExecutor$updateSubscription$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = subscriptionOperationExecutor$updateSubscription$1.label;
        if (i2 == 0) {
        }
        rywData = (RywData) updateSubscription;
        if (rywData == null) {
        }
        return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public Object execute(List<? extends Operation> list, InterfaceC1218d interfaceC1218d) {
        Logging.log(LogLevel.DEBUG, "SubscriptionOperationExecutor(operations: " + list + ')');
        Operation operation = (Operation) AbstractC0465j.F0(list);
        if (operation instanceof CreateSubscriptionOperation) {
            CreateSubscriptionOperation createSubscriptionOperation = (CreateSubscriptionOperation) operation;
            return !IDManager.INSTANCE.isLocalId(createSubscriptionOperation.getSubscriptionId()) ? updateExistingSubscriptionFromCreate(createSubscriptionOperation, list, interfaceC1218d) : createSubscription(createSubscriptionOperation, list, interfaceC1218d);
        }
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Operation) it.next()) instanceof DeleteSubscriptionOperation) {
                    if (list.size() > 1) {
                        throw new Exception("Only supports one operation! Attempted operations:\n" + list);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof DeleteSubscriptionOperation) {
                            arrayList.add(obj);
                        }
                    }
                    return deleteSubscription((DeleteSubscriptionOperation) AbstractC0465j.F0(arrayList), interfaceC1218d);
                }
            }
        }
        if (operation instanceof UpdateSubscriptionOperation) {
            return updateSubscription((UpdateSubscriptionOperation) operation, list, interfaceC1218d);
        }
        if (!(operation instanceof TransferSubscriptionOperation)) {
            throw new Exception("Unrecognized operation: " + operation);
        }
        if (list.size() <= 1) {
            return transferSubscription((TransferSubscriptionOperation) operation, interfaceC1218d);
        }
        throw new Exception("TransferSubscriptionOperation only supports one operation! Attempted operations:\n" + list);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return AbstractC0466k.A0(CREATE_SUBSCRIPTION, UPDATE_SUBSCRIPTION, DELETE_SUBSCRIPTION, TRANSFER_SUBSCRIPTION);
    }
}
