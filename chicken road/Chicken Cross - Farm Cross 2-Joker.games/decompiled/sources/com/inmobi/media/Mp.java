package com.inmobi.media;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class Mp implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f6727a;
    public final /* synthetic */ Pp b;

    public Mp(CoroutineScope coroutineScope, Pp pp) {
        this.b = pp;
        this.f6727a = coroutineScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Job launch$default;
        CoroutineScope coroutineScope = this.f6727a;
        if (((EnumC3580aq) obj) == EnumC3580aq.b) {
            Qp qp = this.b.d;
            if (!qp.b) {
                Job job = qp.f6812a;
                if (!(job != null ? job.isActive() : false)) {
                    Qp qp2 = this.b.d;
                    launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new Op(this.b, null), 3, null);
                    qp2.f6812a = launch$default;
                }
            }
        } else {
            Pp pp = this.b;
            Job job2 = pp.d.f6812a;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            pp.d.f6812a = null;
        }
        return Unit.INSTANCE;
    }
}
