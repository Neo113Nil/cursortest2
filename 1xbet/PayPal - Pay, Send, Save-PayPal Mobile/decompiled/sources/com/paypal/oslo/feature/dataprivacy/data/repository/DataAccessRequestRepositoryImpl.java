package com.paypal.oslo.feature.dataprivacy.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\nH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f0\nH\u0096@¢\u0006\u0004\b\u0014\u0010\u0012J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190\n2\u0006\u0010\u0018\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/data/repository/DataAccessRequestRepositoryImpl;", "Lcom/paypal/oslo/feature/dataprivacy/domain/repository/DataAccessRequestRepository;", "Lcom/paypal/oslo/feature/dataprivacy/data/source/DataPrivacyGraphQLDataSource;", "dataSource", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/dataprivacy/data/source/DataPrivacyGraphQLDataSource;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/CreateDARRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "", "createDataAccessRequest", "(Lcom/paypal/oslo/feature/dataprivacy/domain/model/CreateDARRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/DARRequest;", "getExistingRequests", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureRequest;", "getErasureRequests", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/CreateErasureRequest;", "createErasureRequest", "(Lcom/paypal/oslo/feature/dataprivacy/domain/model/CreateErasureRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileId", "", "downloadFile", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/dataprivacy/data/source/DataPrivacyGraphQLDataSource;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/userstore/UserStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DataAccessRequestRepositoryImpl implements com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DataAccessRequestRepositoryImpl(com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPrivacyGraphQLDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoFpsRangesFor = dataPrivacyGraphQLDataSource;
        this.getHighSpeedVideoSizes = userStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createDataAccessRequest(com.paypal.oslo.feature.dataprivacy.domain.model.CreateDARRequest createDARRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$createDataAccessRequest$1 dataAccessRequestRepositoryImpl$createDataAccessRequest$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$createDataAccessRequest$1) {
            dataAccessRequestRepositoryImpl$createDataAccessRequest$1 = (com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$createDataAccessRequest$1) continuation;
            if ((dataAccessRequestRepositoryImpl$createDataAccessRequest$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                dataAccessRequestRepositoryImpl$createDataAccessRequest$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = dataAccessRequestRepositoryImpl$createDataAccessRequest$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataAccessRequestRepositoryImpl$createDataAccessRequest$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes();
                    if (highSpeedVideoSizes == null) {
                        return new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NoPartyIdError.INSTANCE);
                    }
                    com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource = this.getHighSpeedVideoFpsRangesFor;
                    dataAccessRequestRepositoryImpl$createDataAccessRequest$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createDARRequest);
                    dataAccessRequestRepositoryImpl$createDataAccessRequest$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoSizes);
                    dataAccessRequestRepositoryImpl$createDataAccessRequest$1.getHighSpeedVideoSizes = 1;
                    obj = dataPrivacyGraphQLDataSource.createDataAccessRequest(highSpeedVideoSizes, createDARRequest, dataAccessRequestRepositoryImpl$createDataAccessRequest$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return ior;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return new arrow.core.Ior.Right(((com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data) ((arrow.core.Ior.Right) ior).getValue()).getCreateSubjectAccessRequest().getId());
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                return new arrow.core.Ior.Both(both.getLeftValue(), ((com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data) both.getRightValue()).getCreateSubjectAccessRequest().getId());
            }
        }
        dataAccessRequestRepositoryImpl$createDataAccessRequest$1 = new com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$createDataAccessRequest$1(this, continuation);
        java.lang.Object obj2 = dataAccessRequestRepositoryImpl$createDataAccessRequest$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataAccessRequestRepositoryImpl$createDataAccessRequest$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getExistingRequests(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, ? extends java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARRequest>>> continuation) {
        com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$getExistingRequests$1 dataAccessRequestRepositoryImpl$getExistingRequests$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$getExistingRequests$1) {
            dataAccessRequestRepositoryImpl$getExistingRequests$1 = (com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$getExistingRequests$1) continuation;
            if ((dataAccessRequestRepositoryImpl$getExistingRequests$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                dataAccessRequestRepositoryImpl$getExistingRequests$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = dataAccessRequestRepositoryImpl$getExistingRequests$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataAccessRequestRepositoryImpl$getExistingRequests$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes();
                    if (highSpeedVideoSizes == null) {
                        return new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NoPartyIdError.INSTANCE);
                    }
                    com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource = this.getHighSpeedVideoFpsRangesFor;
                    dataAccessRequestRepositoryImpl$getExistingRequests$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoSizes);
                    dataAccessRequestRepositoryImpl$getExistingRequests$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = dataPrivacyGraphQLDataSource.getExistingRequests(highSpeedVideoSizes, dataAccessRequestRepositoryImpl$getExistingRequests$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return ior;
                }
                java.util.ArrayList arrayList = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> subjectAccessRequests = ((com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data) ((arrow.core.Ior.Right) ior).getValue()).getSubjectAccessRequests();
                    if (subjectAccessRequests != null) {
                        java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> list = subjectAccessRequests;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        java.util.Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(com.paypal.oslo.feature.dataprivacy.data.mapper.DARMapperKt.toDomain((com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest) it.next()));
                        }
                        arrayList = arrayList2;
                    }
                    if (arrayList == null) {
                        arrayList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    return new arrow.core.Ior.Right(arrayList);
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> subjectAccessRequests2 = ((com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data) both.getRightValue()).getSubjectAccessRequests();
                if (subjectAccessRequests2 != null) {
                    java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> list2 = subjectAccessRequests2;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    java.util.Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(com.paypal.oslo.feature.dataprivacy.data.mapper.DARMapperKt.toDomain((com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest) it2.next()));
                    }
                    arrayList = arrayList3;
                }
                if (arrayList == null) {
                    arrayList = kotlin.collections.CollectionsKt.emptyList();
                }
                return new arrow.core.Ior.Both(leftValue, arrayList);
            }
        }
        dataAccessRequestRepositoryImpl$getExistingRequests$1 = new com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$getExistingRequests$1(this, continuation);
        java.lang.Object obj2 = dataAccessRequestRepositoryImpl$getExistingRequests$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataAccessRequestRepositoryImpl$getExistingRequests$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getErasureRequests(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, ? extends java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequest>>> continuation) {
        com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$getErasureRequests$1 dataAccessRequestRepositoryImpl$getErasureRequests$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$getErasureRequests$1) {
            dataAccessRequestRepositoryImpl$getErasureRequests$1 = (com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$getErasureRequests$1) continuation;
            if ((dataAccessRequestRepositoryImpl$getErasureRequests$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                dataAccessRequestRepositoryImpl$getErasureRequests$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = dataAccessRequestRepositoryImpl$getErasureRequests$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataAccessRequestRepositoryImpl$getErasureRequests$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes();
                    if (highSpeedVideoSizes == null) {
                        return new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NoPartyIdError.INSTANCE);
                    }
                    com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource = this.getHighSpeedVideoFpsRangesFor;
                    dataAccessRequestRepositoryImpl$getErasureRequests$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoSizes);
                    dataAccessRequestRepositoryImpl$getErasureRequests$1.getHighSpeedVideoFpsRanges = 1;
                    obj = dataPrivacyGraphQLDataSource.getErasureRequests(highSpeedVideoSizes, dataAccessRequestRepositoryImpl$getErasureRequests$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return ior;
                }
                java.util.ArrayList arrayList = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> subjectAccessRequests = ((com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data) ((arrow.core.Ior.Right) ior).getValue()).getSubjectAccessRequests();
                    if (subjectAccessRequests != null) {
                        java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> list = subjectAccessRequests;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        java.util.Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(com.paypal.oslo.feature.dataprivacy.data.mapper.ErasureMapperKt.toErasureDomain((com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest) it.next()));
                        }
                        arrayList = arrayList2;
                    }
                    if (arrayList == null) {
                        arrayList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    return new arrow.core.Ior.Right(arrayList);
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> subjectAccessRequests2 = ((com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.Data) both.getRightValue()).getSubjectAccessRequests();
                if (subjectAccessRequests2 != null) {
                    java.util.List<com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest> list2 = subjectAccessRequests2;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    java.util.Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(com.paypal.oslo.feature.dataprivacy.data.mapper.ErasureMapperKt.toErasureDomain((com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest) it2.next()));
                    }
                    arrayList = arrayList3;
                }
                if (arrayList == null) {
                    arrayList = kotlin.collections.CollectionsKt.emptyList();
                }
                return new arrow.core.Ior.Both(leftValue, arrayList);
            }
        }
        dataAccessRequestRepositoryImpl$getErasureRequests$1 = new com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$getErasureRequests$1(this, continuation);
        java.lang.Object obj2 = dataAccessRequestRepositoryImpl$getErasureRequests$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataAccessRequestRepositoryImpl$getErasureRequests$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        if (r8 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r8) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createErasureRequest(com.paypal.oslo.feature.dataprivacy.domain.model.CreateErasureRequest createErasureRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$createErasureRequest$1 dataAccessRequestRepositoryImpl$createErasureRequest$1;
        int i;
        java.lang.String primaryEmail;
        com.paypal.oslo.feature.dataprivacy.domain.model.CreateErasureRequest copy;
        arrow.core.Ior.Both both;
        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$createErasureRequest$1) {
            dataAccessRequestRepositoryImpl$createErasureRequest$1 = (com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$createErasureRequest$1) continuation;
            if ((dataAccessRequestRepositoryImpl$createErasureRequest$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                dataAccessRequestRepositoryImpl$createErasureRequest$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = dataAccessRequestRepositoryImpl$createErasureRequest$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataAccessRequestRepositoryImpl$createErasureRequest$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoSizes.getUserState().getValue();
                    java.lang.String str = null;
                    com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
                    if (profileLoaded == null) {
                        return new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NoPartyIdError.INSTANCE);
                    }
                    java.lang.String id = profileLoaded.getUser().getId();
                    java.lang.String email = createErasureRequest.getEmail();
                    if (kotlin.text.StringsKt.isBlank(email)) {
                        email = null;
                    }
                    com.paypal.oslo.core.userstore.model.ProfileEmail primaryEmailAddress = profileLoaded.getUser().getPrimaryEmailAddress();
                    if (primaryEmailAddress != null && (primaryEmail = primaryEmailAddress.getEmailAddress()) != null) {
                        if (kotlin.text.StringsKt.isBlank(primaryEmail)) {
                            primaryEmail = null;
                        }
                    }
                    primaryEmail = profileLoaded.getUser().getPrimaryEmail();
                    if (primaryEmail != null) {
                    }
                    java.lang.String str2 = email == null ? str : email;
                    if (str2 != null) {
                        com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource = this.getHighSpeedVideoFpsRangesFor;
                        copy = createErasureRequest.copy((r18 & 1) != 0 ? createErasureRequest.email : str2, (r18 & 2) != 0 ? createErasureRequest.source : null, (r18 & 4) != 0 ? createErasureRequest.channel : null, (r18 & 8) != 0 ? createErasureRequest.domain : null, (r18 & 16) != 0 ? createErasureRequest.actor : null, (r18 & 32) != 0 ? createErasureRequest.requestType : null, (r18 & 64) != 0 ? createErasureRequest.customer : null, (r18 & 128) != 0 ? createErasureRequest.feedback : null);
                        dataAccessRequestRepositoryImpl$createErasureRequest$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createErasureRequest);
                        dataAccessRequestRepositoryImpl$createErasureRequest$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(profileLoaded);
                        dataAccessRequestRepositoryImpl$createErasureRequest$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                        dataAccessRequestRepositoryImpl$createErasureRequest$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(email);
                        dataAccessRequestRepositoryImpl$createErasureRequest$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        dataAccessRequestRepositoryImpl$createErasureRequest$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        dataAccessRequestRepositoryImpl$createErasureRequest$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        dataAccessRequestRepositoryImpl$createErasureRequest$1.getHighSpeedVideoFpsRangesFor = 0;
                        dataAccessRequestRepositoryImpl$createErasureRequest$1.getInputSizeshNQ4ISI = 1;
                        obj = dataPrivacyGraphQLDataSource.createErasureRequest(id, copy, dataAccessRequestRepositoryImpl$createErasureRequest$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NoEmailError.INSTANCE);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i2 = dataAccessRequestRepositoryImpl$createErasureRequest$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    if (both instanceof arrow.core.Ior.Right) {
                        both = new arrow.core.Ior.Right(((com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data) ((arrow.core.Ior.Right) both).getValue()).getCreateSubjectAccessRequest().getId());
                    } else {
                        if (!(both instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                        both = new arrow.core.Ior.Both(both2.getLeftValue(), ((com.paypal.oslo.feature.dataprivacy.graphql.CreateSubjectAccessRequestMutation.Data) both2.getRightValue()).getCreateSubjectAccessRequest().getId());
                    }
                }
                if (both != null) {
                    return both;
                }
                return new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NoEmailError.INSTANCE);
            }
        }
        dataAccessRequestRepositoryImpl$createErasureRequest$1 = new com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl$createErasureRequest$1(this, continuation);
        java.lang.Object obj2 = dataAccessRequestRepositoryImpl$createErasureRequest$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataAccessRequestRepositoryImpl$createErasureRequest$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (both != null) {
        }
        return new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NoEmailError.INSTANCE);
    }

    @Override // com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository
    public final java.lang.Object downloadFile(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, byte[]>> continuation) {
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes();
        return highSpeedVideoSizes == null ? new arrow.core.Ior.Left(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.NoPartyIdError.INSTANCE) : this.getHighSpeedVideoFpsRangesFor.downloadFile(str, highSpeedVideoSizes, continuation);
    }

    private final java.lang.String getHighSpeedVideoSizes() {
        com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoSizes.getUserState().getValue();
        if (value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
            return ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser().getId();
        }
        return null;
    }
}
