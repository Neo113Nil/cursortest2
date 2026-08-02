package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gu */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0262gu implements InterfaceC0187eu {

    /* JADX INFO: renamed from: j */
    public static final EnumC0262gu f2872j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0262gu[] f2873k;

    static {
        EnumC0262gu enumC0262gu = new EnumC0262gu("DISPOSED", 0);
        f2872j = enumC0262gu;
        f2873k = new EnumC0262gu[]{enumC0262gu};
    }

    /* JADX INFO: renamed from: a */
    public static void m2146a(AtomicReference atomicReference) {
        InterfaceC0187eu interfaceC0187eu;
        InterfaceC0187eu interfaceC0187eu2 = (InterfaceC0187eu) atomicReference.get();
        EnumC0262gu enumC0262gu = f2872j;
        if (interfaceC0187eu2 == enumC0262gu || (interfaceC0187eu = (InterfaceC0187eu) atomicReference.getAndSet(enumC0262gu)) == enumC0262gu || interfaceC0187eu == null) {
            return;
        }
        interfaceC0187eu.mo480c();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2147b(InterfaceC0187eu interfaceC0187eu) {
        return interfaceC0187eu == f2872j;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2148d(AtomicReference atomicReference, InterfaceC0187eu interfaceC0187eu) {
        while (true) {
            InterfaceC0187eu interfaceC0187eu2 = (InterfaceC0187eu) atomicReference.get();
            if (interfaceC0187eu2 != f2872j) {
                while (!atomicReference.compareAndSet(interfaceC0187eu2, interfaceC0187eu)) {
                    if (atomicReference.get() != interfaceC0187eu2) {
                    }
                }
                return true;
            }
            if (interfaceC0187eu == null) {
                return false;
            }
            interfaceC0187eu.mo480c();
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2149e(AtomicReference atomicReference, InterfaceC0187eu interfaceC0187eu) {
        zg1.m5905p(interfaceC0187eu, "d is null");
        while (!atomicReference.compareAndSet(null, interfaceC0187eu)) {
            if (atomicReference.get() != null) {
                interfaceC0187eu.mo480c();
                if (atomicReference.get() == f2872j) {
                    return false;
                }
                vt1.m5196h(new C0877xh("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2150f(InterfaceC0187eu interfaceC0187eu, InterfaceC0187eu interfaceC0187eu2) {
        if (interfaceC0187eu2 == null) {
            vt1.m5196h(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC0187eu == null) {
            return true;
        }
        interfaceC0187eu2.mo480c();
        vt1.m5196h(new C0877xh("Disposable already set!"));
        return false;
    }

    public static EnumC0262gu valueOf(String str) {
        return (EnumC0262gu) Enum.valueOf(EnumC0262gu.class, str);
    }

    public static EnumC0262gu[] values() {
        return (EnumC0262gu[]) f2873k.clone();
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
    }
}
