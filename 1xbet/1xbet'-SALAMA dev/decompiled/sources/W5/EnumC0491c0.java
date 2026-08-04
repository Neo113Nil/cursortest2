package W5;

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
/* JADX INFO: renamed from: W5.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0491c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0491c0 f7148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0491c0[] f7149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0491c0[] f7150e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U5.l0 f7152b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0491c0 EF0;

    static {
        U5.l0 l0Var = U5.l0.f6544n;
        EnumC0491c0 enumC0491c0 = new EnumC0491c0("NO_ERROR", 0, 0, l0Var);
        U5.l0 l0Var2 = U5.l0.f6543m;
        EnumC0491c0 enumC0491c1 = new EnumC0491c0("PROTOCOL_ERROR", 1, 1, l0Var2);
        EnumC0491c0 enumC0491c2 = new EnumC0491c0("INTERNAL_ERROR", 2, 2, l0Var2);
        f7148c = enumC0491c2;
        f7150e = new EnumC0491c0[]{enumC0491c0, enumC0491c1, enumC0491c2, new EnumC0491c0("FLOW_CONTROL_ERROR", 3, 3, l0Var2), new EnumC0491c0("SETTINGS_TIMEOUT", 4, 4, l0Var2), new EnumC0491c0("STREAM_CLOSED", 5, 5, l0Var2), new EnumC0491c0("FRAME_SIZE_ERROR", 6, 6, l0Var2), new EnumC0491c0("REFUSED_STREAM", 7, 7, l0Var), new EnumC0491c0("CANCEL", 8, 8, U5.l0.f6537f), new EnumC0491c0("COMPRESSION_ERROR", 9, 9, l0Var2), new EnumC0491c0("CONNECT_ERROR", 10, 10, l0Var2), new EnumC0491c0("ENHANCE_YOUR_CALM", 11, 11, U5.l0.f6541k.g("Bandwidth exhausted")), new EnumC0491c0("INADEQUATE_SECURITY", 12, 12, U5.l0.f6540i.g("Permission denied as protocol is not secure enough to call")), new EnumC0491c0("HTTP_1_1_REQUIRED", 13, 13, U5.l0.f6538g)};
        EnumC0491c0[] enumC0491c0ArrValues = values();
        EnumC0491c0[] enumC0491c0Arr = new EnumC0491c0[enumC0491c0ArrValues[enumC0491c0ArrValues.length - 1].f7151a + 1];
        for (EnumC0491c0 enumC0491c3 : enumC0491c0ArrValues) {
            enumC0491c0Arr[enumC0491c3.f7151a] = enumC0491c3;
        }
        f7149d = enumC0491c0Arr;
    }

    public EnumC0491c0(String str, int i7, int i8, U5.l0 l0Var) {
        super(str, i7);
        this.f7151a = i8;
        String str2 = "HTTP/2 error code: " + name();
        this.f7152b = l0Var.g(l0Var.f6548b != null ? p031e1.k.i(p136t.e.d(str2, " ("), l0Var.f6548b, ")") : str2);
    }

    public static EnumC0491c0 valueOf(String str) {
        return (EnumC0491c0) Enum.valueOf(EnumC0491c0.class, str);
    }

    public static EnumC0491c0[] values() {
        return (EnumC0491c0[]) f7150e.clone();
    }
}
