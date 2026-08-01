package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CIOMultipartDataBase.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {}, l = {39, 45}, m = "readPart", n = {}, s = {})
/* loaded from: classes7.dex */
final class CIOMultipartDataBase$readPart$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CIOMultipartDataBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOMultipartDataBase$readPart$1(CIOMultipartDataBase cIOMultipartDataBase, Continuation<? super CIOMultipartDataBase$readPart$1> continuation) {
        super(continuation);
        this.this$0 = cIOMultipartDataBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readPart(this);
    }
}
