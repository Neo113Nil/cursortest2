package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ba0 {

    /* JADX INFO: renamed from: l */
    public static final ba0 f800l;

    /* JADX INFO: renamed from: m */
    public static final ba0[] f801m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ ba0[] f802n;

    /* JADX INFO: renamed from: j */
    public final int f803j;

    /* JADX INFO: renamed from: k */
    public final ja1 f804k;

    /* JADX INFO: Fake field, exist only in values array */
    ba0 EF0;

    static {
        ja1 ja1Var = ja1.f3883m;
        ba0 ba0Var = new ba0("NO_ERROR", 0, 0, ja1Var);
        ja1 ja1Var2 = ja1.f3882l;
        ba0 ba0Var2 = new ba0("PROTOCOL_ERROR", 1, 1, ja1Var2);
        ba0 ba0Var3 = new ba0("INTERNAL_ERROR", 2, 2, ja1Var2);
        f800l = ba0Var3;
        f802n = new ba0[]{ba0Var, ba0Var2, ba0Var3, new ba0("FLOW_CONTROL_ERROR", 3, 3, ja1Var2), new ba0("SETTINGS_TIMEOUT", 4, 4, ja1Var2), new ba0("STREAM_CLOSED", 5, 5, ja1Var2), new ba0("FRAME_SIZE_ERROR", 6, 6, ja1Var2), new ba0("REFUSED_STREAM", 7, 7, ja1Var), new ba0("CANCEL", 8, 8, ja1.f3876f), new ba0("COMPRESSION_ERROR", 9, 9, ja1Var2), new ba0("CONNECT_ERROR", 10, 10, ja1Var2), new ba0("ENHANCE_YOUR_CALM", 11, 11, ja1.f3880j.m2840h("Bandwidth exhausted")), new ba0("INADEQUATE_SECURITY", 12, 12, ja1.f3879i.m2840h("Permission denied as protocol is not secure enough to call")), new ba0("HTTP_1_1_REQUIRED", 13, 13, ja1.f3877g)};
        ba0[] ba0VarArrValues = values();
        ba0[] ba0VarArr = new ba0[ba0VarArrValues[ba0VarArrValues.length - 1].f803j + 1];
        for (ba0 ba0Var4 : ba0VarArrValues) {
            ba0VarArr[ba0Var4.f803j] = ba0Var4;
        }
        f801m = ba0VarArr;
    }

    public ba0(String str, int i, int i2, ja1 ja1Var) {
        super(str, i);
        this.f803j = i2;
        String strM285h = "HTTP/2 error code: " + name();
        if (ja1Var.f3887b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(strM285h);
            sb.append(" (");
            strM285h = AbstractC0024an.m285h(sb, ja1Var.f3887b, ")");
        }
        this.f804k = ja1Var.m2840h(strM285h);
    }

    public static ba0 valueOf(String str) {
        return (ba0) Enum.valueOf(ba0.class, str);
    }

    public static ba0[] values() {
        return (ba0[]) f802n.clone();
    }
}
