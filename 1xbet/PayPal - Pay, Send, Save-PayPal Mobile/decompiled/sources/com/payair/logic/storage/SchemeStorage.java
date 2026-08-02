package com.payair.logic.storage;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H¦@¢\u0006\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010"}, d2 = {"Lcom/payair/logic/storage/SchemeStorage;", "", "", "deleteCurrentScheme", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEnrolledMastercard", "deleteEnrolledSchemes", "deleteEnrolledVisa", "mastercardEnrolled", "Lcom/payair/model/CardScheme;", "scheme", "storeScheme", "(Lcom/payair/model/CardScheme;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "visaEnrolled", "Lkotlinx/coroutines/flow/Flow;", "getCurrentScheme", "()Lkotlinx/coroutines/flow/Flow;", "currentScheme", "", "isMastercardEnrolled", "isVisaEnrolled"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SchemeStorage {
    java.lang.Object deleteCurrentScheme(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object deleteEnrolledMastercard(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object deleteEnrolledSchemes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object deleteEnrolledVisa(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    kotlinx.coroutines.flow.Flow<com.payair.model.CardScheme> getCurrentScheme();

    kotlinx.coroutines.flow.Flow<java.lang.Boolean> isMastercardEnrolled();

    kotlinx.coroutines.flow.Flow<java.lang.Boolean> isVisaEnrolled();

    java.lang.Object mastercardEnrolled(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object storeScheme(com.payair.model.CardScheme cardScheme, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object visaEnrolled(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
