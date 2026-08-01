package io.ktor.client.statement;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpResponse.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {}, l = {147}, m = "bodyAsBytes", n = {}, s = {})
/* loaded from: classes7.dex */
final class HttpResponseKt$bodyAsBytes$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    HttpResponseKt$bodyAsBytes$1(Continuation<? super HttpResponseKt$bodyAsBytes$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpResponseKt.bodyAsBytes(null, this);
    }
}
