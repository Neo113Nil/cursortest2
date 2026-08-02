package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xb1 extends AbstractC0882xm implements f70 {

    /* JADX INFO: renamed from: m */
    public final int f8877m;

    public xb1(int i, InterfaceC0808vm interfaceC0808vm) {
        super(interfaceC0808vm);
        this.f8877m = i;
    }

    @Override // p000.f70
    /* JADX INFO: renamed from: b */
    public final int mo667b() {
        return this.f8877m;
    }

    @Override // p000.AbstractC0243gb
    public final String toString() {
        if (this.f2682j != null) {
            return super.toString();
        }
        l01.f4622a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
