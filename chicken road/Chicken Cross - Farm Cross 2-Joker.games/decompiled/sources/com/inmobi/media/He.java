package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class He implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Je f6603a;
    public final /* synthetic */ ProducerScope b;

    public He(Je je, ProducerScope producerScope) {
        this.f6603a = je;
        this.b = producerScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC3595bd abstractC3595bd = (AbstractC3595bd) obj;
        if (abstractC3595bd instanceof C3891lp) {
            Je je = this.f6603a;
            C3891lp c3891lp = (C3891lp) abstractC3595bd;
            ProducerScope producerScope = this.b;
            if (!je.c) {
                Long l = je.d;
                if (l != null) {
                    if (c3891lp.f7233a >= l.longValue() + je.f6650a.b && ChannelResult.m9608isSuccessimpl(producerScope.mo7997trySendJP2dKIU(Unit.INSTANCE))) {
                        je.c = true;
                        je.d = null;
                        je.b.set(false);
                    }
                } else {
                    je.d = Long.valueOf(c3891lp.f7233a);
                    je.b.set(true);
                }
            }
        } else if ((abstractC3595bd instanceof C4253yp) || (abstractC3595bd instanceof C3636cp)) {
            Je je2 = this.f6603a;
            je2.d = null;
            je2.b.set(false);
        }
        return Unit.INSTANCE;
    }
}
