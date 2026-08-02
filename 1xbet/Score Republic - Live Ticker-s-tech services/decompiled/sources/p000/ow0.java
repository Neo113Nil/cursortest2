package p000;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ow0 extends xb1 implements v60 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f5926n;

    /* JADX INFO: renamed from: o */
    public int f5927o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f5928p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ v60 f5929q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow0(v60 v60Var, InterfaceC0808vm interfaceC0808vm, int i) {
        super(2, interfaceC0808vm);
        this.f5926n = i;
        this.f5929q = v60Var;
    }

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        int i = this.f5926n;
        kf1 kf1Var = kf1.f4365a;
        zq0 zq0Var = (zq0) obj;
        InterfaceC0808vm interfaceC0808vm = (InterfaceC0808vm) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((ow0) mo1491k(interfaceC0808vm, zq0Var)).mo17m(kf1Var);
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: k */
    public final InterfaceC0808vm mo1491k(InterfaceC0808vm interfaceC0808vm, Object obj) {
        int i = this.f5926n;
        v60 v60Var = this.f5929q;
        switch (i) {
            case 0:
                ow0 ow0Var = new ow0(v60Var, interfaceC0808vm, 0);
                ow0Var.f5928p = obj;
                return ow0Var;
            default:
                ow0 ow0Var2 = new ow0(v60Var, interfaceC0808vm, 1);
                ow0Var2.f5928p = obj;
                return ow0Var2;
        }
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        int i = this.f5926n;
        v60 v60Var = this.f5929q;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        switch (i) {
            case 0:
                int i2 = this.f5927o;
                if (i2 == 0) {
                    wo1.m5395v(obj);
                    zq0 zq0Var = (zq0) this.f5928p;
                    this.f5927o = 1;
                    obj = v60Var.mo1490g(zq0Var, this);
                    if (obj == enumC0513nn) {
                        return enumC0513nn;
                    }
                } else {
                    if (i2 != 1) {
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wo1.m5395v(obj);
                }
                zq0 zq0Var2 = (zq0) obj;
                zq0Var2.getClass();
                ((AtomicBoolean) zq0Var2.f9908b.f793k).set(true);
                return zq0Var2;
            default:
                int i3 = this.f5927o;
                if (i3 == 0) {
                    wo1.m5395v(obj);
                    zq0 zq0Var3 = new zq0(new LinkedHashMap(((zq0) this.f5928p).m6022a()), false);
                    this.f5928p = zq0Var3;
                    this.f5927o = 1;
                    return v60Var.mo1490g(zq0Var3, this) == enumC0513nn ? enumC0513nn : zq0Var3;
                }
                if (i3 != 1) {
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zq0 zq0Var4 = (zq0) this.f5928p;
                wo1.m5395v(obj);
                return zq0Var4;
        }
    }
}
