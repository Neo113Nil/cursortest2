package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.ff, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3710ff implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4135uf f7105a;

    public C3710ff(CoroutineScope coroutineScope, C4135uf c4135uf) {
        this.f7105a = c4135uf;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC3595bd mediaEvent = (AbstractC3595bd) obj;
        Nd nd = this.f7105a.b.f;
        nd.getClass();
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof So) {
            nd.f6742a.d = AbstractC4114tn.a(((So) mediaEvent).f6859a);
        } else if (mediaEvent instanceof C3891lp) {
            nd.f6742a.e = ((C3891lp) mediaEvent).f7233a;
        }
        if (!(mediaEvent instanceof C3891lp)) {
            Y9 l = this.f7105a.l();
            if (l != null) {
                ((Z9) l).a("NativeRenderedState", "listenMediaEvents - processing media event: " + mediaEvent);
            }
            ((Sd) this.f7105a.b.m.getValue()).a(mediaEvent);
            Pj pj = (Pj) this.f7105a.b.n.getValue();
            pj.getClass();
            Intrinsics.checkNotNullParameter(mediaEvent, "event");
            if (mediaEvent instanceof AbstractC3691eo) {
                pj.b.a((AbstractC3691eo) mediaEvent);
            }
            Pj pj2 = (Pj) this.f7105a.b.n.getValue();
            pj2.getClass();
            Intrinsics.checkNotNullParameter(mediaEvent, "event");
            Ad ad = pj2.c.c;
            if (mediaEvent instanceof C4253yp) {
                ad.f();
            } else if (mediaEvent instanceof C4172vp) {
                ad.i();
            } else if (mediaEvent instanceof C3636cp) {
                ad.b();
            } else if (mediaEvent instanceof C3607bo) {
                ad.h();
            } else if (mediaEvent instanceof C3866l2) {
                ad.a(((C3866l2) mediaEvent).f7213a);
            }
            Pj pj3 = (Pj) this.f7105a.b.n.getValue();
            pj3.getClass();
            Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
            if (mediaEvent instanceof C3607bo) {
                pj3.f6786a.g();
            }
        }
        return Unit.INSTANCE;
    }
}
