package t1;

import A5.s;
import Q3.o;
import android.content.Context;
import com.google.android.gms.common.internal.w;
import java.util.HashSet;
import q5.AbstractActivityC1559c;
import w1.C1718l0;
import w1.C1722m0;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;
import x5.InterfaceC1790b;

/* loaded from: classes.dex */
public final class b implements InterfaceC1783c, InterfaceC1789a {

    /* renamed from: a, reason: collision with root package name */
    public c f16272a;

    /* renamed from: b, reason: collision with root package name */
    public s f16273b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1790b f16274c;

    @Override // x5.InterfaceC1789a
    public final void onAttachedToActivity(InterfaceC1790b interfaceC1790b) {
        o oVar = (o) interfaceC1790b;
        AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) oVar.f5822a;
        c cVar = this.f16272a;
        if (cVar != null) {
            cVar.f16277c = abstractActivityC1559c;
        }
        this.f16274c = interfaceC1790b;
        ((HashSet) oVar.f5824c).add(cVar);
        InterfaceC1790b interfaceC1790b2 = this.f16274c;
        ((HashSet) ((o) interfaceC1790b2).f5823b).add(this.f16272a);
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        Context context = c1782b.f18075a;
        this.f16272a = new c(context);
        s sVar = new s(c1782b.f18077c, "flutter.baseflow.com/permissions/methods");
        this.f16273b = sVar;
        sVar.b(new w(context, new C1718l0(24), this.f16272a, new C1722m0(24)));
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivity() {
        c cVar = this.f16272a;
        if (cVar != null) {
            cVar.f16277c = null;
        }
        InterfaceC1790b interfaceC1790b = this.f16274c;
        if (interfaceC1790b != null) {
            ((HashSet) ((o) interfaceC1790b).f5824c).remove(cVar);
            InterfaceC1790b interfaceC1790b2 = this.f16274c;
            ((HashSet) ((o) interfaceC1790b2).f5823b).remove(this.f16272a);
        }
        this.f16274c = null;
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        this.f16273b.b(null);
        this.f16273b = null;
    }

    @Override // x5.InterfaceC1789a
    public final void onReattachedToActivityForConfigChanges(InterfaceC1790b interfaceC1790b) {
        onAttachedToActivity(interfaceC1790b);
    }
}
