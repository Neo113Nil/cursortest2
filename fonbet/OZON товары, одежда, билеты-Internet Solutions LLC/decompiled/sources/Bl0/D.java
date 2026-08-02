package Bl0;

import Cc.C2738a;
import N3.C3663n;
import nc.InterfaceC8487b;
import tc.InterfaceC9807i;

/* loaded from: classes8.dex */
public final class D implements N3.r {
    public static boolean a(boolean z11, boolean z12, Ic.e eVar, InterfaceC9807i interfaceC9807i, InterfaceC8487b interfaceC8487b, uc.s sVar) {
        if (sVar.b()) {
            interfaceC9807i.clear();
            interfaceC8487b.dispose();
            return true;
        }
        if (!z11) {
            return false;
        }
        Throwable e11 = sVar.e();
        if (e11 != null) {
            interfaceC9807i.clear();
            if (interfaceC8487b != null) {
                interfaceC8487b.dispose();
            }
            eVar.onError(e11);
            return true;
        }
        if (!z12) {
            return false;
        }
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        eVar.onComplete();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r1 = r7.i(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(C2738a c2738a, Ic.e eVar, InterfaceC8487b interfaceC8487b, uc.s sVar) {
        int i11 = 1;
        while (true) {
            C2738a c2738a2 = c2738a;
            Ic.e eVar2 = eVar;
            InterfaceC8487b interfaceC8487b2 = interfaceC8487b;
            uc.s sVar2 = sVar;
            if (a(sVar.c(), c2738a.isEmpty(), eVar2, c2738a2, interfaceC8487b2, sVar2)) {
                return;
            }
            while (true) {
                boolean c11 = sVar2.c();
                Object poll = c2738a2.poll();
                boolean z11 = poll == null;
                boolean z12 = z11;
                if (a(c11, z11, eVar2, c2738a2, interfaceC8487b2, sVar2)) {
                    return;
                }
                if (z12) {
                    break;
                } else {
                    sVar2.a(eVar2, poll);
                }
            }
            eVar = eVar2;
            c2738a = c2738a2;
            interfaceC8487b = interfaceC8487b2;
            sVar = sVar2;
        }
    }

    public static final int c(int i11, int i12) {
        return (i11 >> i12) & 31;
    }

    @Override // N3.r
    public void endTracks() {
    }

    @Override // N3.r
    public void seekMap(N3.H h11) {
    }

    @Override // N3.r
    public N3.M track(int i11, int i12) {
        return new C3663n();
    }
}
