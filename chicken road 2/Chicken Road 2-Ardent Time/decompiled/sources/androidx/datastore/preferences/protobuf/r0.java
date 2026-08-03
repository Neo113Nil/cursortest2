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
    public static final androidx.datastore.preferences.protobuf.n0 f2351c;

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.o0 f2352d;

    /* renamed from: e, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.p0 f2353e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ androidx.datastore.preferences.protobuf.r0[] f2354f;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.s0 f2355a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2356b;

    /* JADX INFO: Fake field, exist only in values array */
    androidx.datastore.preferences.protobuf.r0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    androidx.datastore.preferences.protobuf.r0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    androidx.datastore.preferences.protobuf.r0 EF12;

    static {
        androidx.datastore.preferences.protobuf.r0 r0Var = new androidx.datastore.preferences.protobuf.r0("DOUBLE", 0, androidx.datastore.preferences.protobuf.s0.DOUBLE, 1);
        androidx.datastore.preferences.protobuf.r0 r0Var2 = new androidx.datastore.preferences.protobuf.r0("FLOAT", 1, androidx.datastore.preferences.protobuf.s0.FLOAT, 5);
        androidx.datastore.preferences.protobuf.s0 s0Var = androidx.datastore.preferences.protobuf.s0.LONG;
        androidx.datastore.preferences.protobuf.r0 r0Var3 = new androidx.datastore.preferences.protobuf.r0("INT64", 2, s0Var, 0);
        androidx.datastore.preferences.protobuf.r0 r0Var4 = new androidx.datastore.preferences.protobuf.r0("UINT64", 3, s0Var, 0);
        androidx.datastore.preferences.protobuf.s0 s0Var2 = androidx.datastore.preferences.protobuf.s0.INT;
        androidx.datastore.preferences.protobuf.r0 r0Var5 = new androidx.datastore.preferences.protobuf.r0("INT32", 4, s0Var2, 0);
        androidx.datastore.preferences.protobuf.r0 r0Var6 = new androidx.datastore.preferences.protobuf.r0("FIXED64", 5, s0Var, 1);
        androidx.datastore.preferences.protobuf.r0 r0Var7 = new androidx.datastore.preferences.protobuf.r0("FIXED32", 6, s0Var2, 5);
        androidx.datastore.preferences.protobuf.r0 r0Var8 = new androidx.datastore.preferences.protobuf.r0("BOOL", 7, androidx.datastore.preferences.protobuf.s0.BOOLEAN, 0);
        androidx.datastore.preferences.protobuf.n0 n0Var = new androidx.datastore.preferences.protobuf.n0("STRING", 8, androidx.datastore.preferences.protobuf.s0.STRING, 2);
        f2351c = n0Var;
        androidx.datastore.preferences.protobuf.s0 s0Var3 = androidx.datastore.preferences.protobuf.s0.MESSAGE;
        androidx.datastore.preferences.protobuf.o0 o0Var = new androidx.datastore.preferences.protobuf.o0("GROUP", 9, s0Var3, 3);
        f2352d = o0Var;
        androidx.datastore.preferences.protobuf.p0 p0Var = new androidx.datastore.preferences.protobuf.p0("MESSAGE", 10, s0Var3, 2);
        f2353e = p0Var;
        f2354f = new androidx.datastore.preferences.protobuf.r0[]{r0Var, r0Var2, r0Var3, r0Var4, r0Var5, r0Var6, r0Var7, r0Var8, n0Var, o0Var, p0Var, new androidx.datastore.preferences.protobuf.q0("BYTES", 11, androidx.datastore.preferences.protobuf.s0.BYTE_STRING, 2), new androidx.datastore.preferences.protobuf.r0("UINT32", 12, s0Var2, 0), new androidx.datastore.preferences.protobuf.r0("ENUM", 13, androidx.datastore.preferences.protobuf.s0.ENUM, 0), new androidx.datastore.preferences.protobuf.r0("SFIXED32", 14, s0Var2, 5), new androidx.datastore.preferences.protobuf.r0("SFIXED64", 15, s0Var, 1), new androidx.datastore.preferences.protobuf.r0("SINT32", 16, s0Var2, 0), new androidx.datastore.preferences.protobuf.r0("SINT64", 17, s0Var, 0)};
    }

    public r0(java.lang.String str, int i2, androidx.datastore.preferences.protobuf.s0 s0Var, int i3) {
        this.f2355a = s0Var;
        this.f2356b = i3;
    }

    public static androidx.datastore.preferences.protobuf.r0 valueOf(java.lang.String str) {
        return (androidx.datastore.preferences.protobuf.r0) java.lang.Enum.valueOf(androidx.datastore.preferences.protobuf.r0.class, str);
    }

    public static androidx.datastore.preferences.protobuf.r0[] values() {
        return (androidx.datastore.preferences.protobuf.r0[]) f2354f.clone();
    }
}
