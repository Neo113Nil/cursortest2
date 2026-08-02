package androidx.glance.session;

import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.session.SessionManagerImpl", f = "SessionManager.kt", i = {0, 0, 0}, l = {142}, m = "isSessionRunning", n = {"this", Constants.KEY, "$this$await$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class SessionManagerImpl$isSessionRunning$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManagerImpl$isSessionRunning$1(SessionManagerImpl sessionManagerImpl, Continuation<? super SessionManagerImpl$isSessionRunning$1> continuation) {
        super(continuation);
        this.this$0 = sessionManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.isSessionRunning(null, null, this);
    }
}
