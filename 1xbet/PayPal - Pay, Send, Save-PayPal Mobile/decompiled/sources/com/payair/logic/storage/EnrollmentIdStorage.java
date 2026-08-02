package com.payair.logic.storage;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000f\u0010\fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u000eJ\"\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00160\bH&¢\u0006\u0004\b\u0017\u0010\nJ\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0018\u0010\u000eJ\u001e\u0010\u001a\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H¦@¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/payair/logic/storage/EnrollmentIdStorage;", "", "", "enrollmentId", "networkTokenReference", "", "assignNtrToEnrollmentId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "currentPanEnrollmentId", "()Lkotlinx/coroutines/flow/Flow;", "deleteCurrent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEnrollmentId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEnrollmentIds", "panEnrollmentId", "", "isUnfinishedTokenizationRepeated", "handleTemporaryNtr", "markEnrollmentDone", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "panEnrollmentIds", "storeCurrent", "enrollmentIds", "storeEnrollmentIds", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface EnrollmentIdStorage {

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object markEnrollmentDone$default(com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage, java.lang.String str, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markEnrollmentDone");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return enrollmentIdStorage.markEnrollmentDone(str, z, continuation);
        }
    }

    java.lang.Object assignNtrToEnrollmentId(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    kotlinx.coroutines.flow.Flow<java.lang.String> currentPanEnrollmentId();

    java.lang.Object deleteCurrent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object deleteEnrollmentId(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object deleteEnrollmentIds(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object isUnfinishedTokenizationRepeated(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object markEnrollmentDone(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    kotlinx.coroutines.flow.Flow<java.util.Set<java.lang.String>> panEnrollmentIds();

    java.lang.Object storeCurrent(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object storeEnrollmentIds(java.util.Set<java.lang.String> set, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
