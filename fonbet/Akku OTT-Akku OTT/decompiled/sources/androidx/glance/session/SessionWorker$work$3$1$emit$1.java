package androidx.glance.session;

import androidx.compose.runtime.Recomposer;
import androidx.glance.session.SessionWorker$work$3;
import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.session.SessionWorker$work$3$1", f = "SessionWorker.kt", i = {0, 1}, l = {TsExtractor.TS_STREAM_TYPE_DTS_HD, 143}, m = "emit", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
public final class SessionWorker$work$3$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionWorker$work$3.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorker$work$3$1$emit$1(SessionWorker$work$3.AnonymousClass1 anonymousClass1, Continuation<? super SessionWorker$work$3$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit2((Recomposer.State) null, (Continuation<? super Unit>) this);
    }
}
