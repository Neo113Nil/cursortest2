package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Pn implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.CoroutineScope f4904a;
    public final /* synthetic */ com.inmobi.media.Sn b;

    public Pn(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.Sn sn) {
        this.b = sn;
        this.f4904a = coroutineScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.Job job;
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.CoroutineScope coroutineScope = this.f4904a;
        if (((com.inmobi.media.EnumC2391eo) obj) == com.inmobi.media.EnumC2391eo.b) {
            com.inmobi.media.Tn tn = this.b.d;
            if (!tn.b && ((job = tn.f4983a) == null || !job.isActive())) {
                com.inmobi.media.Tn tn2 = this.b.d;
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.inmobi.media.Rn(this.b, null), 3, null);
                tn2.f4983a = launch$default;
            }
        } else {
            com.inmobi.media.Sn sn = this.b;
            kotlinx.coroutines.Job job2 = sn.d.f4983a;
            if (job2 != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            sn.d.f4983a = null;
        }
        return kotlin.Unit.INSTANCE;
    }
}
