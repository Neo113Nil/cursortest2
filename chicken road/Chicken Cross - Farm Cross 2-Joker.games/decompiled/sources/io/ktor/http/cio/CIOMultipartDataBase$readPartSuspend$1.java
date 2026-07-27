package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CIOMultipartDataBase.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {}, l = {51, 52}, m = "readPartSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class CIOMultipartDataBase$readPartSuspend$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CIOMultipartDataBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOMultipartDataBase$readPartSuspend$1(CIOMultipartDataBase cIOMultipartDataBase, Continuation<? super CIOMultipartDataBase$readPartSuspend$1> continuation) {
        super(continuation);
        this.this$0 = cIOMultipartDataBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object readPartSuspend;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readPartSuspend = this.this$0.readPartSuspend(this);
        return readPartSuspend;
    }
}
