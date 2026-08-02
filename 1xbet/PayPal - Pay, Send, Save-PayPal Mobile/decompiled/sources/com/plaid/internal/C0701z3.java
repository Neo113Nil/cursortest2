package com.plaid.internal;

/* renamed from: com.plaid.internal.z3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0701z3 implements com.plaid.internal.A3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.Y7 f6644a;

    @javax.inject.Inject
    public C0701z3(com.plaid.internal.workflow.persistence.database.WorkflowDatabase workflowDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workflowDatabase, "");
        this.f6644a = workflowDatabase.c();
    }

    @Override // com.plaid.internal.A3
    public final java.lang.Object a(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, com.plaid.internal.C0674w3.a aVar) {
        com.plaid.internal.Y7 y7 = this.f6644a;
        java.lang.String workflowSessionId = clientEventOuterClass$ClientEvent.getWorkflowSessionId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workflowSessionId, "");
        int hashCode = clientEventOuterClass$ClientEvent.hashCode();
        byte[] byteArray = clientEventOuterClass$ClientEvent.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
        java.lang.Object a2 = y7.a(workflowSessionId, java.lang.String.valueOf(hashCode), byteArray, aVar);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[LOOP:0: B:11:0x0050->B:13:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.plaid.internal.A3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0692y3 c0692y3;
        int i;
        java.util.Iterator it;
        if (continuationImpl instanceof com.plaid.internal.C0692y3) {
            c0692y3 = (com.plaid.internal.C0692y3) continuationImpl;
            int i2 = c0692y3.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0692y3.c = i2 - 2147483648;
                java.lang.Object obj = c0692y3.f6628a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0692y3.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.Y7 y7 = this.f6644a;
                    c0692y3.c = 1;
                    obj = y7.a(c0692y3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Iterable iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.parseFrom(((com.plaid.internal.h8) it.next()).c));
                }
                return arrayList;
            }
        }
        c0692y3 = new com.plaid.internal.C0692y3(this, continuationImpl);
        java.lang.Object obj2 = c0692y3.f6628a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0692y3.c;
        if (i != 0) {
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    @Override // com.plaid.internal.A3
    public final java.lang.Object a(java.util.List list, com.plaid.internal.C0656u3 c0656u3) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent = (com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent) it.next();
            java.lang.String workflowSessionId = clientEventOuterClass$ClientEvent.getWorkflowSessionId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workflowSessionId, "");
            int hashCode = clientEventOuterClass$ClientEvent.hashCode();
            byte[] byteArray = clientEventOuterClass$ClientEvent.toByteArray();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
            arrayList.add(new com.plaid.internal.h8(workflowSessionId, java.lang.String.valueOf(hashCode), byteArray));
        }
        java.lang.Object a2 = this.f6644a.a(arrayList, c0656u3);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
