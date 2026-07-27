package com.onesignal.user.internal.operations.impl.executors;

import C1.b;
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
import com.onesignal.user.internal.backend.IIdentityBackendService;
import com.onesignal.user.internal.builduser.IRebuildUserService;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.DeleteAliasOperation;
import com.onesignal.user.internal.operations.SetAliasOperation;
import com.onesignal.user.internal.operations.impl.states.NewRecordsState;
import e5.g;
import f4.C0430g;
import g4.AbstractC0465j;
import g4.AbstractC0466k;
import g4.AbstractC0476u;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class IdentityOperationExecutor implements IOperationExecutor {
    public static final Companion Companion = new Companion(null);
    public static final String DELETE_ALIAS = "delete-alias";
    public static final String SET_ALIAS = "set-alias";
    private final IRebuildUserService _buildUserService;
    private final IIdentityBackendService _identityBackend;
    private final IdentityModelStore _identityModelStore;
    private final IdentityVerificationService _identityVerificationService;
    private final JwtTokenStore _jwtTokenStore;
    private final NewRecordsState _newRecordState;

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
                iArr[NetworkUtils.ResponseStatusType.INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkUtils.ResponseStatusType.CONFLICT.ordinal()] = 3;
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
        }
    }

    public IdentityOperationExecutor(IIdentityBackendService _identityBackend, IdentityModelStore _identityModelStore, IRebuildUserService _buildUserService, NewRecordsState _newRecordState, JwtTokenStore _jwtTokenStore, IdentityVerificationService _identityVerificationService) {
        i.e(_identityBackend, "_identityBackend");
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_buildUserService, "_buildUserService");
        i.e(_newRecordState, "_newRecordState");
        i.e(_jwtTokenStore, "_jwtTokenStore");
        i.e(_identityVerificationService, "_identityVerificationService");
        this._identityBackend = _identityBackend;
        this._identityModelStore = _identityModelStore;
        this._buildUserService = _buildUserService;
        this._newRecordState = _newRecordState;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x02a8 A[Catch: BackendException -> 0x02c4, TRY_LEAVE, TryCatch #3 {BackendException -> 0x02c4, blocks: (B:16:0x028f, B:18:0x02a8), top: B:15:0x028f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164 A[Catch: BackendException -> 0x0185, TRY_LEAVE, TryCatch #4 {BackendException -> 0x0185, blocks: (B:58:0x014b, B:60:0x0164), top: B:57:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends Operation> list, InterfaceC1218d interfaceC1218d) {
        IdentityOperationExecutor$execute$1 identityOperationExecutor$execute$1;
        int i2;
        int i3;
        IdentityOperationExecutor identityOperationExecutor;
        Operation operation;
        int i6;
        IdentityOperationExecutor identityOperationExecutor2;
        Operation operation2;
        int i7;
        int i8;
        if (interfaceC1218d instanceof IdentityOperationExecutor$execute$1) {
            identityOperationExecutor$execute$1 = (IdentityOperationExecutor$execute$1) interfaceC1218d;
            int i9 = identityOperationExecutor$execute$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                identityOperationExecutor$execute$1.label = i9 - Integer.MIN_VALUE;
                IdentityOperationExecutor$execute$1 identityOperationExecutor$execute$12 = identityOperationExecutor$execute$1;
                Object obj = identityOperationExecutor$execute$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = identityOperationExecutor$execute$12.label;
                if (i2 != 0) {
                    g.y(obj);
                    Logging.debug$default("IdentityOperationExecutor(operations: " + list + ')', null, 2, null);
                    if (list == null || !list.isEmpty()) {
                        for (Operation operation3 : list) {
                            if (!(operation3 instanceof SetAliasOperation) && !(operation3 instanceof DeleteAliasOperation)) {
                                throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                            }
                        }
                    }
                    if (list == null || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((Operation) it.next()) instanceof SetAliasOperation) {
                                if (list == null || !list.isEmpty()) {
                                    Iterator<T> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        if (((Operation) it2.next()) instanceof DeleteAliasOperation) {
                                            throw new Exception("Can't process SetAliasOperation and DeleteAliasOperation at the same time.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Operation operation4 = (Operation) AbstractC0465j.L0(list);
                    if (operation4 instanceof SetAliasOperation) {
                        IvBackendParams resolveBackendParams = ExecutorsIvExtensionsKt.resolveBackendParams(operation4, ((SetAliasOperation) operation4).getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                        try {
                            IIdentityBackendService iIdentityBackendService = this._identityBackend;
                            String appId = ((SetAliasOperation) operation4).getAppId();
                            String aliasLabel = resolveBackendParams.getAliasLabel();
                            String aliasValue = resolveBackendParams.getAliasValue();
                            try {
                                Map<String, String> X5 = AbstractC0476u.X(new C0430g(((SetAliasOperation) operation4).getLabel(), ((SetAliasOperation) operation4).getValue()));
                                String jwt = resolveBackendParams.getJwt();
                                identityOperationExecutor$execute$12.L$0 = this;
                                identityOperationExecutor$execute$12.L$1 = operation4;
                                identityOperationExecutor$execute$12.label = 1;
                                i6 = 2;
                                try {
                                    if (iIdentityBackendService.setAlias(appId, aliasLabel, aliasValue, X5, jwt, identityOperationExecutor$execute$12) == enumC1260a) {
                                        return enumC1260a;
                                    }
                                    identityOperationExecutor2 = this;
                                    operation2 = operation4;
                                    if (i.a(identityOperationExecutor2._identityModelStore.getModel().getOnesignalId(), ((SetAliasOperation) operation2).getOnesignalId())) {
                                    }
                                } catch (BackendException e3) {
                                    e = e3;
                                    identityOperationExecutor2 = this;
                                    operation2 = operation4;
                                    i7 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                    if (i7 == 1) {
                                    }
                                }
                            } catch (BackendException e6) {
                                e = e6;
                                i6 = 2;
                            }
                        } catch (BackendException e7) {
                            e = e7;
                            i6 = 2;
                        }
                    } else {
                        i3 = 2;
                        if (operation4 instanceof DeleteAliasOperation) {
                            IvBackendParams resolveBackendParams2 = ExecutorsIvExtensionsKt.resolveBackendParams(operation4, ((DeleteAliasOperation) operation4).getOnesignalId(), this._jwtTokenStore, this._identityVerificationService);
                            try {
                                IIdentityBackendService iIdentityBackendService2 = this._identityBackend;
                                String appId2 = ((DeleteAliasOperation) operation4).getAppId();
                                String aliasLabel2 = resolveBackendParams2.getAliasLabel();
                                String aliasValue2 = resolveBackendParams2.getAliasValue();
                                String label = ((DeleteAliasOperation) operation4).getLabel();
                                String jwt2 = resolveBackendParams2.getJwt();
                                identityOperationExecutor$execute$12.L$0 = this;
                                identityOperationExecutor$execute$12.L$1 = operation4;
                                identityOperationExecutor$execute$12.label = 2;
                                if (iIdentityBackendService2.deleteAlias(appId2, aliasLabel2, aliasValue2, label, jwt2, identityOperationExecutor$execute$12) == enumC1260a) {
                                    return enumC1260a;
                                }
                                identityOperationExecutor = this;
                                operation = operation4;
                                if (i.a(identityOperationExecutor._identityModelStore.getModel().getOnesignalId(), ((DeleteAliasOperation) operation).getOnesignalId())) {
                                }
                            } catch (BackendException e8) {
                                e = e8;
                                identityOperationExecutor = this;
                                operation = operation4;
                                i8 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                                if (i8 == 1) {
                                }
                            }
                        }
                    }
                } else if (i2 == 1) {
                    operation2 = (Operation) identityOperationExecutor$execute$12.L$1;
                    identityOperationExecutor2 = (IdentityOperationExecutor) identityOperationExecutor$execute$12.L$0;
                    try {
                        g.y(obj);
                        i6 = 2;
                    } catch (BackendException e9) {
                        e = e9;
                        i6 = 2;
                        i7 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i7 == 1) {
                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i7 == i6) {
                            return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (i7 == 3) {
                            return new ExecutionResponse(ExecutionResult.FAIL_CONFLICT, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i7 == 4) {
                            return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i7 != 5) {
                            throw new b();
                        }
                        if (e.getStatusCode() == 404 && identityOperationExecutor2._newRecordState.isInMissingRetryWindow(((SetAliasOperation) operation2).getOnesignalId())) {
                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        SetAliasOperation setAliasOperation = (SetAliasOperation) operation2;
                        List<Operation> rebuildOperationsIfCurrentUser = identityOperationExecutor2._buildUserService.getRebuildOperationsIfCurrentUser(setAliasOperation.getAppId(), setAliasOperation.getOnesignalId());
                        return rebuildOperationsIfCurrentUser == null ? new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null) : new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
                    }
                    try {
                        if (i.a(identityOperationExecutor2._identityModelStore.getModel().getOnesignalId(), ((SetAliasOperation) operation2).getOnesignalId())) {
                            Model.setStringProperty$default(identityOperationExecutor2._identityModelStore.getModel(), ((SetAliasOperation) operation2).getLabel(), ((SetAliasOperation) operation2).getValue(), ModelChangeTags.HYDRATE, false, 8, null);
                        }
                    } catch (BackendException e10) {
                        e = e10;
                        i7 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i7 == 1) {
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    operation = (Operation) identityOperationExecutor$execute$12.L$1;
                    identityOperationExecutor = (IdentityOperationExecutor) identityOperationExecutor$execute$12.L$0;
                    try {
                        g.y(obj);
                        i3 = 2;
                    } catch (BackendException e11) {
                        e = e11;
                        i3 = 2;
                        i8 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i8 == 1) {
                            return new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i8 == i3) {
                            return new ExecutionResponse(ExecutionResult.FAIL_NORETRY, null, null, null, 14, null);
                        }
                        if (i8 == 3) {
                            return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                        }
                        if (i8 == 4) {
                            return new ExecutionResponse(ExecutionResult.FAIL_UNAUTHORIZED, null, null, e.getRetryAfterSeconds(), 6, null);
                        }
                        if (i8 == 5) {
                            return (e.getStatusCode() == 404 && identityOperationExecutor._newRecordState.isInMissingRetryWindow(((DeleteAliasOperation) operation).getOnesignalId())) ? new ExecutionResponse(ExecutionResult.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null) : new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
                        }
                        throw new b();
                    }
                    try {
                        if (i.a(identityOperationExecutor._identityModelStore.getModel().getOnesignalId(), ((DeleteAliasOperation) operation).getOnesignalId())) {
                            Model.setOptStringProperty$default(identityOperationExecutor._identityModelStore.getModel(), ((DeleteAliasOperation) operation).getLabel(), null, ModelChangeTags.HYDRATE, false, 8, null);
                        }
                    } catch (BackendException e12) {
                        e = e12;
                        i8 = WhenMappings.$EnumSwitchMapping$0[NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                        if (i8 == 1) {
                        }
                    }
                }
                return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
            }
        }
        identityOperationExecutor$execute$1 = new IdentityOperationExecutor$execute$1(this, interfaceC1218d);
        IdentityOperationExecutor$execute$1 identityOperationExecutor$execute$122 = identityOperationExecutor$execute$1;
        Object obj2 = identityOperationExecutor$execute$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = identityOperationExecutor$execute$122.label;
        if (i2 != 0) {
        }
        return new ExecutionResponse(ExecutionResult.SUCCESS, null, null, null, 14, null);
    }

    @Override // com.onesignal.core.internal.operations.IOperationExecutor
    public List<String> getOperations() {
        return AbstractC0466k.A0(SET_ALIAS, DELETE_ALIAS);
    }
}
