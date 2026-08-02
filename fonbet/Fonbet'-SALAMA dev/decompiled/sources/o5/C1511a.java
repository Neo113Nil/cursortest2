package o5;

import A5.s;
import I4.j;
import Q3.o;
import android.content.Context;
import com.google.android.gms.common.internal.w;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import q5.AbstractActivityC1559c;
import t6.h;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;
import x5.InterfaceC1790b;

/* renamed from: o5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1511a implements InterfaceC1783c, InterfaceC1789a {

    /* renamed from: a, reason: collision with root package name */
    public j f15611a;

    /* renamed from: b, reason: collision with root package name */
    public C1512b f15612b;

    /* renamed from: c, reason: collision with root package name */
    public s f15613c;

    @Override // x5.InterfaceC1789a
    public final void onAttachedToActivity(InterfaceC1790b interfaceC1790b) {
        h.e(interfaceC1790b, "binding");
        C1512b c1512b = this.f15612b;
        if (c1512b == null) {
            h.h("manager");
            throw null;
        }
        o oVar = (o) interfaceC1790b;
        ((HashSet) oVar.f5824c).add(c1512b);
        j jVar = this.f15611a;
        if (jVar != null) {
            jVar.f3679c = (AbstractActivityC1559c) oVar.f5822a;
        } else {
            h.h("share");
            throw null;
        }
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        h.e(c1782b, "binding");
        this.f15613c = new s(c1782b.f18077c, "dev.fluttercommunity.plus/share");
        Context context = c1782b.f18075a;
        h.d(context, "getApplicationContext(...)");
        C1512b c1512b = new C1512b();
        c1512b.f15615b = new AtomicBoolean(true);
        this.f15612b = c1512b;
        j jVar = new j(context, c1512b);
        this.f15611a = jVar;
        C1512b c1512b2 = this.f15612b;
        if (c1512b2 == null) {
            h.h("manager");
            throw null;
        }
        w wVar = new w(jVar, c1512b2);
        s sVar = this.f15613c;
        if (sVar != null) {
            sVar.b(wVar);
        } else {
            h.h("methodChannel");
            throw null;
        }
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivity() {
        j jVar = this.f15611a;
        if (jVar != null) {
            jVar.f3679c = null;
        } else {
            h.h("share");
            throw null;
        }
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        h.e(c1782b, "binding");
        s sVar = this.f15613c;
        if (sVar != null) {
            sVar.b(null);
        } else {
            h.h("methodChannel");
            throw null;
        }
    }

    @Override // x5.InterfaceC1789a
    public final void onReattachedToActivityForConfigChanges(InterfaceC1790b interfaceC1790b) {
        h.e(interfaceC1790b, "binding");
        onAttachedToActivity(interfaceC1790b);
    }
}
