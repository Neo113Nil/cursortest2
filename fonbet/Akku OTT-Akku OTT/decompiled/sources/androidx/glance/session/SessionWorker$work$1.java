package androidx.glance.session;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.session.SessionWorker", f = "SessionWorker.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {ModuleDescriptor.MODULE_VERSION, 156, 168}, m = "work", n = {"this", "$this$work", "session", "frameClock", "snapshotMonitor", "recomposer", "composition", "frameClock", "snapshotMonitor", "recomposer", "composition"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes.dex */
public final class SessionWorker$work$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorker$work$1(SessionWorker sessionWorker, Continuation<? super SessionWorker$work$1> continuation) {
        super(continuation);
        this.this$0 = sessionWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object work;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        work = this.this$0.work(null, this);
        return work;
    }
}
