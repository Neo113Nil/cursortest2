package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
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
    private static final /* synthetic */ r0[] $VALUES;
    public static final r0 BOOL;
    public static final r0 BYTES;
    public static final r0 DOUBLE;
    public static final r0 ENUM;
    public static final r0 FIXED32;
    public static final r0 FIXED64;
    public static final r0 FLOAT;
    public static final r0 GROUP;
    public static final r0 INT32;
    public static final r0 INT64;
    public static final r0 MESSAGE;
    public static final r0 SFIXED32;
    public static final r0 SFIXED64;
    public static final r0 SINT32;
    public static final r0 SINT64;
    public static final r0 STRING;
    public static final r0 UINT32;
    public static final r0 UINT64;
    private final s0 javaType;
    private final int wireType;

    enum a extends r0 {
    }

    enum b extends r0 {
    }

    enum c extends r0 {
    }

    enum d extends r0 {
    }

    static {
        r0 r0Var = new r0("DOUBLE", 0, s0.DOUBLE, 1);
        DOUBLE = r0Var;
        r0 r0Var2 = new r0("FLOAT", 1, s0.FLOAT, 5);
        FLOAT = r0Var2;
        s0 s0Var = s0.LONG;
        r0 r0Var3 = new r0("INT64", 2, s0Var, 0);
        INT64 = r0Var3;
        r0 r0Var4 = new r0("UINT64", 3, s0Var, 0);
        UINT64 = r0Var4;
        s0 s0Var2 = s0.INT;
        r0 r0Var5 = new r0("INT32", 4, s0Var2, 0);
        INT32 = r0Var5;
        r0 r0Var6 = new r0("FIXED64", 5, s0Var, 1);
        FIXED64 = r0Var6;
        r0 r0Var7 = new r0("FIXED32", 6, s0Var2, 5);
        FIXED32 = r0Var7;
        r0 r0Var8 = new r0("BOOL", 7, s0.BOOLEAN, 0);
        BOOL = r0Var8;
        a aVar = new a("STRING", 8, s0.STRING, 2);
        STRING = aVar;
        s0 s0Var3 = s0.MESSAGE;
        b bVar = new b("GROUP", 9, s0Var3, 3);
        GROUP = bVar;
        c cVar = new c("MESSAGE", 10, s0Var3, 2);
        MESSAGE = cVar;
        d dVar = new d("BYTES", 11, s0.BYTE_STRING, 2);
        BYTES = dVar;
        r0 r0Var9 = new r0("UINT32", 12, s0Var2, 0);
        UINT32 = r0Var9;
        r0 r0Var10 = new r0("ENUM", 13, s0.ENUM, 0);
        ENUM = r0Var10;
        r0 r0Var11 = new r0("SFIXED32", 14, s0Var2, 5);
        SFIXED32 = r0Var11;
        r0 r0Var12 = new r0("SFIXED64", 15, s0Var, 1);
        SFIXED64 = r0Var12;
        r0 r0Var13 = new r0("SINT32", 16, s0Var2, 0);
        SINT32 = r0Var13;
        r0 r0Var14 = new r0("SINT64", 17, s0Var, 0);
        SINT64 = r0Var14;
        $VALUES = new r0[]{r0Var, r0Var2, r0Var3, r0Var4, r0Var5, r0Var6, r0Var7, r0Var8, aVar, bVar, cVar, dVar, r0Var9, r0Var10, r0Var11, r0Var12, r0Var13, r0Var14};
    }

    private r0(String str, int i11, s0 s0Var, int i12) {
        this.javaType = s0Var;
        this.wireType = i12;
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }

    public final s0 a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }
}
