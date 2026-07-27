package io.ktor.client.plugins.cookies;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AcceptAllCookiesStorage.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0}, l = {79}, m = "get", n = {IronSourceConstants.REQUEST_URL, "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
final class AcceptAllCookiesStorage$get$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AcceptAllCookiesStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcceptAllCookiesStorage$get$1(AcceptAllCookiesStorage acceptAllCookiesStorage, Continuation<? super AcceptAllCookiesStorage$get$1> continuation) {
        super(continuation);
        this.this$0 = acceptAllCookiesStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.get(null, this);
    }
}
