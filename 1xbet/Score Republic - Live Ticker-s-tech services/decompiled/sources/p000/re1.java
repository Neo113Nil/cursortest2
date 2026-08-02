package p000;

import com.google.firebase.datatransport.TransportRegistrar;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class re1 implements InterfaceC0436lk {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6832j;

    public /* synthetic */ re1(int i) {
        this.f6832j = i;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m4347b() throws lp1 {
        throw new lp1();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m4348c(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4349d(int i, int i2, Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append((Object) " parameters found ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m4350e(String str) throws mp1 {
        throw new mp1(str);
    }

    @Override // p000.InterfaceC0436lk
    /* JADX INFO: renamed from: x */
    public Object mo532x(C0902y5 c0902y5) {
        switch (this.f6832j) {
            case 0:
                return TransportRegistrar.lambda$getComponents$1(c0902y5);
            default:
                return TransportRegistrar.lambda$getComponents$2(c0902y5);
        }
    }
}
