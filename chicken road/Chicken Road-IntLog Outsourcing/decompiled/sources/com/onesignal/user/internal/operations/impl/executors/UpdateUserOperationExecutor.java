package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.NetworkUtils;
import com.onesignal.common.consistency.IamFetchReadyCondition;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.enums.IamFetchRywTokenKey;
import com.onesignal.common.consistency.models.IConsistencyManager;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.core.internal.operations.ExecutionResult;
import com.onesignal.core.internal.operations.IOperationExecutor;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.IUserBackendService;
import com.onesignal.user.internal.backend.PropertiesDeltasObject;
import com.onesignal.user.internal.backend.PropertiesObject;
import com.onesignal.user.internal.backend.PurchaseObject;
import com.onesignal.user.internal.builduser.IRebuildUserService;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.DeleteTagOperation;
import com.onesignal.user.internal.operations.PurchaseInfo;
import com.onesignal.user.internal.operations.SetPropertyOperation;
import com.onesignal.user.internal.operations.SetTagOperation;
import com.onesignal.user.internal.operations.TrackPurchaseOperation;
import com.onesignal.user.internal.operations.TrackSessionEndOperation;
import com.onesignal.user.internal.operations.TrackSessionStartOperation;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import e5.g;
import g4.AbstractC0465j;
import g4.AbstractC0466k;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class UpdateUserOperationExecutor implements IOperationExecutor {
    public static final Companion Companion = new Companion(null);
    public static final String DELETE_TAG = "delete-tag";
    public static final String SET_PROPERTY = "set-property";
    public static final String SET_TAG = "set-tag";
    public static final String TRACK_PURCHASE = "track-purchase";
    public static final String TRACK_SESSION_END = "track-session-end";
    public static final String TRACK_SESSION_START = "track-session-start";
    private final IRebuildUserService _buildUserService;
    private final IConsistencyManager _consistencyManager;
    private final IdentityModelStore _identityModelStore;
    private final IdentityVerificationService _identityVerificationService;
    private final JwtTokenStore _jwtTokenStore;
    private final NewRecordsState _newRecordState;
    private final PropertiesModelStore _propertiesModelStore;
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
            try {
                iArr[NetworkUtils.ResponseStatusType.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UpdateUserOperationExecutor(IUserBackendService _userBackend, IdentityModelStore _identityModelStore, PropertiesModelStore _propertiesModelStore, IRebuildUserService _buildUserService, NewRecordsState _newRecordState, IConsistencyManager _consistencyManager, JwtTokenStore _jwtTokenStore, IdentityVerificationService _identityVerificationService) {
        i.e(_userBackend, "_userBackend");
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_propertiesModelStore, "_propertiesModelStore");
        i.e(_buildUserService, "_buildUserService");
        i.e(_newRecordState, "_newRecordState");
        i.e(_consistencyManager, "_consistencyManager");
        i.e(_jwtTokenStore, "_jwtTokenStore");
        i.e(_identityVerificationService, "_identityVerificationService");
        this._userBackend = _userBackend;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._consistencyManager = _consistencyManager;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|(6:(9:(1:(1:11)(2:74|75))(1:76)|12|13|14|15|16|(3:18|(4:21|(3:37|38|39)(3:23|24|(3:34|35|36)(3:26|27|(3:29|30|31)(1:33)))|32|19)|40)|42|43)(4:77|78|79|80)|73|47|(2:49|(2:51|(2:53|54)(2:55|(2:61|(2:63|64)(2:65|66))(2:59|60)))(1:67))(1:70)|68|69)(6:96|(4:99|(4:166|(1:168)|169|170)(3:101|102|(4:161|(1:163)|164|165)(3:104|105|(4:156|(1:158)|159|160)(3:107|108|(6:147|(1:149)|150|(1:152)(1:155)|153|154)(3:110|111|(7:137|(1:139)|140|(1:142)(1:146)|143|144|145)(3:113|114|(10:(1:117)|118|(1:120)(1:133)|121|(1:123)(1:132)|124|(2:127|125)|128|129|130)(3:134|135|136))))))|131|97)|171|(10:174|175|176|177|178|179|180|181|182|(1:184)(1:185))|42|43)|81|82|(2:84|(1:86))(2:88|(1:90))|87|15|16|(0)|42|43))|195|6|(0)(0)|81|82|(0)(0)|87|15|16|(0)|42|43|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0317, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02b4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02b5, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02e0 A[Catch: BackendException -> 0x0317, TryCatch #5 {BackendException -> 0x0317, blocks: (B:16:0x02ce, B:18:0x02e0, B:19:0x02e4, B:21:0x02ea, B:38:0x02f4, B:24:0x0319, B:35:0x031d, B:27:0x033a, B:30:0x033e), top: B:15:0x02ce }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x029c A[Catch: BackendException -> 0x02b4, TryCatch #3 {BackendException -> 0x02b4, blocks: (B:82:0x0298, B:84:0x029c, B:88:0x02b8), top: B:81:0x0298 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b8 A[Catch: BackendException -> 0x02b4, TRY_LEAVE, TryCatch #3 {BackendException -> 0x02b4, blocks: (B:82:0x0298, B:84:0x029c, B:88:0x02b8), top: B:81:0x0298 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0082  */
    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends Operation> list, InterfaceC1218d interfaceC1218d) {
        UpdateUserOperationExecutor$execute$1 updateUserOperationExecutor$execute$1;
        int i2;
        String str;
        int i3;
        UpdateUserOperationExecutor updateUserOperationExecutor;
        String str2;
        String str3;
        IUserBackendService iUserBackendService;
        String aliasLabel;
        String aliasValue;
        String jwt;
        UpdateUserOperationExecutor updateUserOperationExecutor2;
        int i6;
        long sessionTime;
        BigDecimal amountSpent;
        ArrayList arrayList;
        RywData rywData;
        int i7;
        ExecutionResponse executionResponse;
        List<? extends Operation> list2 = list;
        if (interfaceC1218d instanceof UpdateUserOperationExecutor$execute$1) {
            updateUserOperationExecutor$execute$1 = (UpdateUserOperationExecutor$execute$1) interfaceC1218d;
            int i8 = updateUserOperationExecutor$execute$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                updateUserOperationExecutor$execute$1.label = i8 - Integer.MIN_VALUE;
                Object obj = updateUserOperationExecutor$execute$1.result;
                Object obj2 = EnumC1260a.f11058a;
                i2 = updateUserOperationExecutor$execute$1.label;
                int i9 = 1;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            str2 = (String) updateUserOperationExecutor$execute$1.L$3;
                            str3 = (String) updateUserOperationExecutor$execute$1.L$2;
                            list2 = (List) updateUserOperationExecutor$execute$1.L$1;
                            updateUserOperationExecutor = (UpdateUserOperationExecutor) updateUserOperationExecutor$execute$1.L$0;
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str2 = (String) updateUserOperationExecutor$execute$1.L$3;
                            str3 = (String) updateUserOperationExecutor$execute$1.L$2;
                            list2 = (List) updateUserOperationExecutor$execute$1.L$1;
                            updateUserOperationExecutor = (UpdateUserOperationExecutor) updateUserOperationExecutor$execute$1.L$0;
                        }
                        try {
                            g.y(obj);
                            i3 = 1;
                            if (i.a(updateUserOperationExecutor._identityModelStore.getModel().getOnesignalId(), str2)) {
                                for (Operation operation : list2) {
                                    if (operation instanceof SetTagOperation) {
                                        Model.setStringProperty$default(updateUserOperationExecutor._propertiesModelStore.getModel().getTags(), ((SetTagOperation) operation).getKey(), ((SetTagOperation) operation).getValue(), ModelChangeTags.HYDRATE, false, 8, null);
                                    } else if (operation instanceof DeleteTagOperation) {
                                        Model.setOptStringProperty$default(updateUserOperationExecutor._propertiesModelStore.getModel().getTags(), ((DeleteTagOperation) operation).getKey(), null, ModelChangeTags.HYDRATE, false, 8, null);
                                    } else if (operation instanceof SetPropertyOperation) {
                                        Model.setOptAnyProperty$default(updateUserOperationExecutor._propertiesModelStore.getModel(), ((SetPropertyOperation) operation).getProperty(), ((SetPropertyOperation) operation).getValue(), ModelChangeTags.HYDRATE, false, 8, null);
                                    }
                                }
                            }
                            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                        } catch (BackendException e3) {
                            e = e3;
                        }
                    } else {
                        str2 = (String) updateUserOperationExecutor$execute$1.L$3;
                        str3 = (String) updateUserOperationExecutor$execute$1.L$2;
                        list2 = (List) updateUserOperationExecutor$execute$1.L$1;
                        updateUserOperationExecutor2 = (UpdateUserOperationExecutor) updateUserOperationExecutor$execute$1.L$0;
                        try {
                            g.y(obj);
                            i3 = 1;
                        } catch (BackendException e6) {
                            e = e6;
                            updateUserOperationExecutor = updateUserOperationExecutor2;
                        }
                    }
                    i3 = 1;
                    i7 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                    if (i7 != i3) {
                        executionResponse = new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                    } else {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                            }
                            if (e.getStatusCode() == 404 && updateUserOperationExecutor._newRecordState.isInMissingRetryWindow(str2)) {
                                return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                            }
                            List<Operation> rebuildOperationsIfCurrentUser = updateUserOperationExecutor._buildUserService.getRebuildOperationsIfCurrentUser(str3, str2);
                            return rebuildOperationsIfCurrentUser == null ? new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null) : new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                        }
                        executionResponse = new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                    }
                    return executionResponse;
                }
                g.y(obj);
                Logging.log(LogLevel.DEBUG, "UpdateUserOperationExecutor(operation: " + list2 + ')');
                PropertiesObject propertiesObject = new PropertiesObject(null, null, null, null, null, null, 63, null);
                PropertiesDeltasObject propertiesDeltasObject = new PropertiesDeltasObject(null, null, null, null, 15, null);
                PropertiesObject propertiesObject2 = propertiesObject;
                boolean z = 0;
                String str4 = null;
                PropertiesDeltasObject propertiesDeltasObject2 = propertiesDeltasObject;
                String str5 = null;
                for (Operation operation2 : list) {
                    if (operation2 instanceof SetTagOperation) {
                        if (str5 == null) {
                            SetTagOperation setTagOperation = (SetTagOperation) operation2;
                            str5 = setTagOperation.getAppId();
                            str4 = setTagOperation.getOnesignalId();
                        }
                        propertiesObject2 = PropertyOperationHelper.INSTANCE.createPropertiesFromOperation((SetTagOperation) operation2, propertiesObject2);
                    } else if (operation2 instanceof DeleteTagOperation) {
                        if (str5 == null) {
                            DeleteTagOperation deleteTagOperation = (DeleteTagOperation) operation2;
                            str5 = deleteTagOperation.getAppId();
                            str4 = deleteTagOperation.getOnesignalId();
                        }
                        propertiesObject2 = PropertyOperationHelper.INSTANCE.createPropertiesFromOperation((DeleteTagOperation) operation2, propertiesObject2);
                    } else if (operation2 instanceof SetPropertyOperation) {
                        if (str5 == null) {
                            SetPropertyOperation setPropertyOperation = (SetPropertyOperation) operation2;
                            str5 = setPropertyOperation.getAppId();
                            str4 = setPropertyOperation.getOnesignalId();
                        }
                        propertiesObject2 = PropertyOperationHelper.INSTANCE.createPropertiesFromOperation((SetPropertyOperation) operation2, propertiesObject2);
                    } else if (operation2 instanceof TrackSessionStartOperation) {
                        if (str5 == null) {
                            TrackSessionStartOperation trackSessionStartOperation = (TrackSessionStartOperation) operation2;
                            str5 = trackSessionStartOperation.getAppId();
                            str4 = trackSessionStartOperation.getOnesignalId();
                        }
                        if (propertiesDeltasObject2.getSessionCount() != null) {
                            Integer sessionCount = propertiesDeltasObject2.getSessionCount();
                            i.b(sessionCount);
                            i6 = sessionCount.intValue() + i9;
                        } else {
                            i6 = i9;
                        }
                        propertiesDeltasObject2 = new PropertiesDeltasObject(propertiesDeltasObject2.getSessionTime(), new Integer(i6), propertiesDeltasObject2.getAmountSpent(), propertiesDeltasObject2.getPurchases());
                        z = i9;
                    } else if (operation2 instanceof TrackSessionEndOperation) {
                        if (str5 == null) {
                            TrackSessionEndOperation trackSessionEndOperation = (TrackSessionEndOperation) operation2;
                            str5 = trackSessionEndOperation.getAppId();
                            str4 = trackSessionEndOperation.getOnesignalId();
                        }
                        if (propertiesDeltasObject2.getSessionTime() != null) {
                            Long sessionTime2 = propertiesDeltasObject2.getSessionTime();
                            i.b(sessionTime2);
                            sessionTime = ((TrackSessionEndOperation) operation2).getSessionTime() + sessionTime2.longValue();
                        } else {
                            sessionTime = ((TrackSessionEndOperation) operation2).getSessionTime();
                        }
                        propertiesDeltasObject2 = new PropertiesDeltasObject(new Long(sessionTime), propertiesDeltasObject2.getSessionCount(), propertiesDeltasObject2.getAmountSpent(), propertiesDeltasObject2.getPurchases());
                    } else {
                        if (!(operation2 instanceof TrackPurchaseOperation)) {
                            throw new Exception("Unrecognized operation: " + operation2);
                        }
                        if (str5 == null) {
                            TrackPurchaseOperation trackPurchaseOperation = (TrackPurchaseOperation) operation2;
                            str5 = trackPurchaseOperation.getAppId();
                            str4 = trackPurchaseOperation.getOnesignalId();
                        }
                        if (propertiesDeltasObject2.getAmountSpent() != null) {
                            BigDecimal amountSpent2 = propertiesDeltasObject2.getAmountSpent();
                            i.b(amountSpent2);
                            amountSpent = amountSpent2.add(((TrackPurchaseOperation) operation2).getAmountSpent());
                            i.d(amountSpent, "add(...)");
                        } else {
                            amountSpent = ((TrackPurchaseOperation) operation2).getAmountSpent();
                        }
                        if (propertiesDeltasObject2.getPurchases() != null) {
                            List<PurchaseObject> purchases = propertiesDeltasObject2.getPurchases();
                            i.b(purchases);
                            arrayList = AbstractC0465j.U0(purchases);
                        } else {
                            arrayList = new ArrayList();
                        }
                        for (PurchaseInfo purchaseInfo : ((TrackPurchaseOperation) operation2).getPurchases()) {
                            arrayList.add(new PurchaseObject(purchaseInfo.getSku(), purchaseInfo.getIso(), purchaseInfo.getAmount()));
                            str4 = str4;
                        }
                        propertiesDeltasObject2 = new PropertiesDeltasObject(propertiesDeltasObject2.getSessionTime(), propertiesDeltasObject2.getSessionCount(), amountSpent, arrayList);
                        str4 = str4;
                        i9 = 1;
                    }
                }
                if (str5 != null && str4 != null) {
                    IvBackendParams resolveBackendParams = ExecutorsIvExtensionsKt.resolveBackendParams((Operation) AbstractC0465j.F0(list), str4, this._jwtTokenStore, this._identityVerificationService);
                    try {
                        iUserBackendService = this._userBackend;
                        aliasLabel = resolveBackendParams.getAliasLabel();
                        aliasValue = resolveBackendParams.getAliasValue();
                        jwt = resolveBackendParams.getJwt();
                        updateUserOperationExecutor$execute$1.L$0 = this;
                        updateUserOperationExecutor$execute$1.L$1 = list2;
                        updateUserOperationExecutor$execute$1.L$2 = str5;
                        updateUserOperationExecutor$execute$1.L$3 = str4;
                        i3 = 1;
                        try {
                            updateUserOperationExecutor$execute$1.label = 1;
                            str = str5;
                        } catch (BackendException e7) {
                            e = e7;
                            str = str5;
                        }
                    } catch (BackendException e8) {
                        e = e8;
                        str = str5;
                        i3 = 1;
                    }
                    try {
                        Object updateUser = iUserBackendService.updateUser(str5, aliasLabel, aliasValue, propertiesObject2, z, propertiesDeltasObject2, jwt, updateUserOperationExecutor$execute$1);
                        if (updateUser == obj2) {
                            return obj2;
                        }
                        updateUserOperationExecutor2 = this;
                        str3 = str;
                        str2 = str4;
                        obj = updateUser;
                    } catch (BackendException e9) {
                        e = e9;
                        updateUserOperationExecutor = this;
                        str2 = str4;
                        str3 = str;
                        i7 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i7 != i3) {
                        }
                        return executionResponse;
                    }
                }
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                rywData = (RywData) obj;
                if (rywData == null) {
                    IConsistencyManager iConsistencyManager = updateUserOperationExecutor2._consistencyManager;
                    IamFetchRywTokenKey iamFetchRywTokenKey = IamFetchRywTokenKey.USER;
                    updateUserOperationExecutor$execute$1.L$0 = updateUserOperationExecutor2;
                    updateUserOperationExecutor$execute$1.L$1 = list2;
                    updateUserOperationExecutor$execute$1.L$2 = str3;
                    updateUserOperationExecutor$execute$1.L$3 = str2;
                    updateUserOperationExecutor$execute$1.label = 2;
                    if (iConsistencyManager.setRywData(str2, iamFetchRywTokenKey, rywData, updateUserOperationExecutor$execute$1) == obj2) {
                        return obj2;
                    }
                } else {
                    IConsistencyManager iConsistencyManager2 = updateUserOperationExecutor2._consistencyManager;
                    updateUserOperationExecutor$execute$1.L$0 = updateUserOperationExecutor2;
                    updateUserOperationExecutor$execute$1.L$1 = list2;
                    updateUserOperationExecutor$execute$1.L$2 = str3;
                    updateUserOperationExecutor$execute$1.L$3 = str2;
                    updateUserOperationExecutor$execute$1.label = 3;
                    if (iConsistencyManager2.resolveConditionsWithID(IamFetchReadyCondition.ID, updateUserOperationExecutor$execute$1) == obj2) {
                        return obj2;
                    }
                }
                updateUserOperationExecutor = updateUserOperationExecutor2;
                if (i.a(updateUserOperationExecutor._identityModelStore.getModel().getOnesignalId(), str2)) {
                }
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
            }
        }
        updateUserOperationExecutor$execute$1 = new UpdateUserOperationExecutor$execute$1(this, interfaceC1218d);
        Object obj3 = updateUserOperationExecutor$execute$1.result;
        Object obj22 = EnumC1260a.f11058a;
        i2 = updateUserOperationExecutor$execute$1.label;
        int i92 = 1;
        if (i2 == 0) {
        }
        rywData = (RywData) obj3;
        if (rywData == null) {
        }
        updateUserOperationExecutor = updateUserOperationExecutor2;
        if (i.a(updateUserOperationExecutor._identityModelStore.getModel().getOnesignalId(), str2)) {
        }
        return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return AbstractC0466k.A0(SET_TAG, DELETE_TAG, SET_PROPERTY, TRACK_SESSION_START, TRACK_SESSION_END, TRACK_PURCHASE);
    }
}
