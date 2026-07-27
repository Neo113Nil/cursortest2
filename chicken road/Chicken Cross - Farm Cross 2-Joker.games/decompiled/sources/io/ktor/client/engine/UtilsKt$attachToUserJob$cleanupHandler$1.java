package io.ktor.client.engine;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;

/* compiled from: Utils.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class UtilsKt$attachToUserJob$cleanupHandler$1 implements Function1<Throwable, Unit> {
    final /* synthetic */ Job $callJob;

    public UtilsKt$attachToUserJob$cleanupHandler$1(Job job) {
        this.$callJob = job;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        if (th == null) {
            return;
        }
        this.$callJob.cancel(new CancellationException(th.getMessage()));
    }
}
