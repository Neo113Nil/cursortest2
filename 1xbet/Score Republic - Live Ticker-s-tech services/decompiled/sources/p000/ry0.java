package p000;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ry0 implements InterfaceC0826w3 {

    /* JADX INFO: renamed from: a */
    public volatile Object f6989a;

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: a */
    public final int mo4420a() {
        return 0;
    }

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: c */
    public final List mo4422c() {
        return Collections.EMPTY_LIST;
    }

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: d */
    public final void mo4423d(Object obj, String str) {
        Object obj2 = this.f6989a;
        InterfaceC0826w3 interfaceC0826w3 = obj2 instanceof InterfaceC0826w3 ? (InterfaceC0826w3) obj2 : null;
        if (interfaceC0826w3 != null) {
            interfaceC0826w3.mo4423d(obj, str);
        }
    }

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: f */
    public final void mo4425f(String str, String str2, Bundle bundle) {
        Object obj = this.f6989a;
        InterfaceC0826w3 interfaceC0826w3 = obj instanceof InterfaceC0826w3 ? (InterfaceC0826w3) obj : null;
        if (interfaceC0826w3 != null) {
            interfaceC0826w3.mo4425f(str, str2, bundle);
        }
    }

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: g */
    public final InterfaceC0752u3 mo4426g(b90 b90Var) {
        Object obj = this.f6989a;
        if (obj instanceof InterfaceC0826w3) {
            return ((InterfaceC0826w3) obj).mo4426g(b90Var);
        }
        p90 p90Var = new p90();
        p90Var.f6027j = new HashSet();
        ((tu0) obj).m4850a(new C0615qe(13, p90Var, b90Var));
        return p90Var;
    }

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: b */
    public final void mo4421b(String str) {
    }

    @Override // p000.InterfaceC0826w3
    /* JADX INFO: renamed from: e */
    public final void mo4424e(C0789v3 c0789v3) {
    }
}
