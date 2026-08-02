package Z0;

import P.C0310p;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import i4.InterfaceC2015a;
import z0.n0;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f6319l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i4.c f6320m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0310p f6321n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y.f f6322o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f6323p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ View f6324q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, i4.c cVar, C0310p c0310p, Y.f fVar, int i, View view) {
        super(0);
        this.f6319l = context;
        this.f6320m = cVar;
        this.f6321n = c0310p;
        this.f6322o = fVar;
        this.f6323p = i;
        this.f6324q = view;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f6324q;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.node.Owner", callback);
        n0 n0Var = (n0) callback;
        return new q(this.f6319l, this.f6320m, this.f6321n, this.f6322o, this.f6323p, n0Var).getLayoutNode();
    }
}
