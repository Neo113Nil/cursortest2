package AY;

import F3.J;
import N3.u;
import com.google.gson.internal.o;
import j3.Q;
import j3.y;
import kotlin.jvm.functions.Function1;
import m1.InterfaceC8038i;
import m1.p;
import m3.r;
import qc.g;
import ru.ozon.app.android.ui.start.AppHostActivity;
import ru.ozon.app.android.video.player.fromexoplayer.OzProgressiveMediaSource;
import u3.P;
import w2.C10411b;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements J.a, o, C10411b.c, InterfaceC8038i, r.a, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f677a;

    @Override // F3.J.a
    public J a(P p11) {
        J lambda$new$0;
        lambda$new$0 = OzProgressiveMediaSource.Factory.lambda$new$0((u) this.f677a, p11);
        return lambda$new$0;
    }

    @Override // qc.g
    public void accept(Object obj) {
        ((Function1) this.f677a).invoke(obj);
    }

    @Override // w2.C10411b.c
    public boolean b() {
        boolean onCreate$lambda$1$lambda$0;
        onCreate$lambda$1$lambda$0 = AppHostActivity.onCreate$lambda$1$lambda$0((AppHostActivity) this.f677a);
        return onCreate$lambda$1$lambda$0;
    }

    @Override // m1.InterfaceC8038i
    public double c(double d11) {
        return p.m((p) this.f677a, d11);
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        return ((com.google.gson.g) this.f677a).a();
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((y.c) obj).onVideoSizeChanged((Q) this.f677a);
    }

    public /* synthetic */ a(Object obj) {
        this.f677a = obj;
    }
}
