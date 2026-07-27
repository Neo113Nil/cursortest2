package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f2277c;

    /* renamed from: d, reason: collision with root package name */
    public static final o0 f2278d;

    /* renamed from: e, reason: collision with root package name */
    public static final p0 f2279e;
    public static final /* synthetic */ r0[] f;

    /* renamed from: a, reason: collision with root package name */
    public final s0 f2280a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2281b;

    /* JADX INFO: Fake field, exist only in values array */
    r0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    r0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    r0 EF12;

    static {
        r0 r0Var = new r0("DOUBLE", 0, s0.DOUBLE, 1);
        r0 r0Var2 = new r0("FLOAT", 1, s0.FLOAT, 5);
        s0 s0Var = s0.LONG;
        r0 r0Var3 = new r0("INT64", 2, s0Var, 0);
        r0 r0Var4 = new r0("UINT64", 3, s0Var, 0);
        s0 s0Var2 = s0.INT;
        r0 r0Var5 = new r0("INT32", 4, s0Var2, 0);
        r0 r0Var6 = new r0("FIXED64", 5, s0Var, 1);
        r0 r0Var7 = new r0("FIXED32", 6, s0Var2, 5);
        r0 r0Var8 = new r0("BOOL", 7, s0.BOOLEAN, 0);
        n0 n0Var = new n0("STRING", 8, s0.STRING, 2);
        f2277c = n0Var;
        s0 s0Var3 = s0.MESSAGE;
        o0 o0Var = new o0("GROUP", 9, s0Var3, 3);
        f2278d = o0Var;
        p0 p0Var = new p0("MESSAGE", 10, s0Var3, 2);
        f2279e = p0Var;
        f = new r0[]{r0Var, r0Var2, r0Var3, r0Var4, r0Var5, r0Var6, r0Var7, r0Var8, n0Var, o0Var, p0Var, new q0("BYTES", 11, s0.BYTE_STRING, 2), new r0("UINT32", 12, s0Var2, 0), new r0("ENUM", 13, s0.ENUM, 0), new r0("SFIXED32", 14, s0Var2, 5), new r0("SFIXED64", 15, s0Var, 1), new r0("SINT32", 16, s0Var2, 0), new r0("SINT64", 17, s0Var, 0)};
    }

    public r0(String str, int i3, s0 s0Var, int i4) {
        this.f2280a = s0Var;
        this.f2281b = i4;
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f.clone();
    }
}
