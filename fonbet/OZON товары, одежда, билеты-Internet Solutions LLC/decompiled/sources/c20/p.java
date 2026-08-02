package c20;

import B0.A0;
import a00.C4908c;
import androidx.collection.F;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import c20.m;
import d20.AbstractC6065b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class p implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m.b.d f56426a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.composer.ui.widget.l f56427b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC6065b<l20.c> f56428c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ F<m.a> f56429d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4908c f56430e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n f56431f;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6065b<l20.c> f56432b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m.b.d f56433c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC6065b<l20.c> abstractC6065b, m.b.d dVar) {
            super(0);
            this.f56432b = abstractC6065b;
            this.f56433c = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AbstractC6065b<l20.c> abstractC6065b = this.f56432b;
            if (abstractC6065b.getLifecycle().b() != AbstractC5434v.b.DESTROYED) {
                abstractC6065b.trackView$composer_recycler_ui_release(this.f56433c.b());
            }
            return Unit.f71690a;
        }
    }

    p(m.b.d dVar, ru.ozon.composer.ui.widget.l lVar, AbstractC6065b abstractC6065b, F f7, C4908c c4908c, n nVar) {
        this.f56426a = dVar;
        this.f56427b = lVar;
        this.f56428c = abstractC6065b;
        this.f56429d = f7;
        this.f56430e = c4908c;
        this.f56431f = nVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
        boolean c11 = H00.b.c();
        AbstractC6065b<l20.c> abstractC6065b = this.f56428c;
        if (c11) {
            ru.ozon.android.ozonLogger.core.h b11 = H00.b.b();
            Thread currentThread = Thread.currentThread();
            ru.ozon.composer.ui.widget.l viewItem = abstractC6065b.getViewItem();
            b11.e(cVar, Pk0.g.c(currentThread, ": ", A0.b("widget destroyed item=[", viewItem != null ? C5735c.a(viewItem) : null, "]")), "OverlayWidgetContainer", null, Boolean.TRUE);
        }
        this.f56426a.getClass();
        ru.ozon.composer.ui.widget.l viewItem2 = abstractC6065b.getViewItem();
        Long valueOf = viewItem2 != null ? Long.valueOf(viewItem2.f()) : null;
        if (valueOf != null) {
            m.a i11 = this.f56429d.i(valueOf.longValue());
            AbstractC6065b b12 = i11 != null ? i11.b() : null;
            if (b12 != null) {
                b12.dispatchDestroy$composer_recycler_ui_release();
            }
        } else {
            abstractC6065b.dispatchDestroy$composer_recycler_ui_release();
        }
        this.f56430e.getLifecycle().e(this.f56431f);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
        boolean c11 = H00.b.c();
        AbstractC6065b<l20.c> abstractC6065b = this.f56428c;
        if (c11) {
            ru.ozon.android.ozonLogger.core.h b11 = H00.b.b();
            Thread currentThread = Thread.currentThread();
            ru.ozon.composer.ui.widget.l viewItem = abstractC6065b.getViewItem();
            b11.e(cVar, Pk0.g.c(currentThread, ": ", A0.b("track widget view item=[", viewItem != null ? C5735c.a(viewItem) : null, "]")), "OverlayWidgetContainer", null, Boolean.TRUE);
        }
        m.b.d dVar = this.f56426a;
        if (dVar.d().a()) {
            abstractC6065b.trackView$composer_recycler_ui_release(dVar.b());
        } else {
            dVar.d().c(this.f56427b.f(), new a(abstractC6065b, dVar));
        }
    }
}
