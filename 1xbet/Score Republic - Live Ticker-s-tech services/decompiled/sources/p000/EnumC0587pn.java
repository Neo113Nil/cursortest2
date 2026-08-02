package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pn */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0587pn {

    /* JADX INFO: renamed from: j */
    public static final EnumC0587pn f6215j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0587pn f6216k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ EnumC0587pn[] f6217l;

    static {
        EnumC0587pn enumC0587pn = new EnumC0587pn("DEFAULT", 0);
        f6215j = enumC0587pn;
        EnumC0587pn enumC0587pn2 = new EnumC0587pn("LAZY", 1);
        EnumC0587pn enumC0587pn3 = new EnumC0587pn("ATOMIC", 2);
        f6216k = enumC0587pn3;
        f6217l = new EnumC0587pn[]{enumC0587pn, enumC0587pn2, enumC0587pn3, new EnumC0587pn("UNDISPATCHED", 3)};
    }

    public static EnumC0587pn valueOf(String str) {
        return (EnumC0587pn) Enum.valueOf(EnumC0587pn.class, str);
    }

    public static EnumC0587pn[] values() {
        return (EnumC0587pn[]) f6217l.clone();
    }
}
