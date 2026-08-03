package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Pd implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Rd f4896a;
    public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope b;

    public Pd(com.inmobi.media.Rd rd, kotlinx.coroutines.channels.ProducerScope producerScope) {
        this.f4896a = rd;
        this.b = producerScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.AbstractC2509jc abstractC2509jc = (com.inmobi.media.AbstractC2509jc) obj;
        if (abstractC2509jc instanceof com.inmobi.media.C2653on) {
            com.inmobi.media.Rd rd = this.f4896a;
            com.inmobi.media.C2653on c2653on = (com.inmobi.media.C2653on) abstractC2509jc;
            kotlinx.coroutines.channels.ProducerScope producerScope = this.b;
            if (!rd.c) {
                java.lang.Long l = rd.d;
                if (l != null) {
                    if (c2653on.f5380a >= l.longValue() + rd.f4938a.b && kotlinx.coroutines.channels.ChannelResult.m12328isSuccessimpl(producerScope.mo10716trySendJP2dKIU(kotlin.Unit.INSTANCE))) {
                        rd.c = true;
                        rd.d = null;
                        rd.b.set(false);
                    }
                } else {
                    rd.d = java.lang.Long.valueOf(c2653on.f5380a);
                    rd.b.set(true);
                }
            }
        } else if ((abstractC2509jc instanceof com.inmobi.media.Bn) || (abstractC2509jc instanceof com.inmobi.media.C2417fn)) {
            com.inmobi.media.Rd rd2 = this.f4896a;
            rd2.d = null;
            rd2.b.set(false);
        }
        return kotlin.Unit.INSTANCE;
    }
}
