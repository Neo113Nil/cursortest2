package com.inmobi.media;

import android.widget.ProgressBar;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.mp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3919mp implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4004pp f7254a;

    public C3919mp(CoroutineScope coroutineScope, C4004pp c4004pp) {
        this.f7254a = c4004pp;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        ProgressBar progressBar;
        AbstractC3691eo abstractC3691eo = (AbstractC3691eo) obj;
        C4004pp c4004pp = this.f7254a;
        c4004pp.getClass();
        if (abstractC3691eo instanceof C4253yp) {
            ProgressBar progressBar2 = c4004pp.e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        } else if (abstractC3691eo instanceof C3891lp) {
            int i = ((C3891lp) abstractC3691eo).b;
            ProgressBar progressBar3 = c4004pp.e;
            if (progressBar3 != null) {
                AbstractC3787i7.a(c4004pp.f);
                c4004pp.f = AbstractC4012q5.a(c4004pp.f7314a, new C3976op(progressBar3, c4004pp, i, null));
            }
        } else if ((abstractC3691eo instanceof C3607bo) && c4004pp.c.b && (progressBar = c4004pp.e) != null) {
            progressBar.setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
