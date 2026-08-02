package ae;

import I0.C3173b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import qd.p;

/* renamed from: ae.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC5003e {
    BOOLEAN(p.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(p.CHAR, "char", "C", "java.lang.Character"),
    BYTE(p.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(p.SHORT, "short", "S", "java.lang.Short"),
    INT(p.INT, "int", "I", "java.lang.Integer"),
    FLOAT(p.FLOAT, "float", "F", "java.lang.Float"),
    LONG(p.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(p.DOUBLE, "double", "D", "java.lang.Double");

    private final String desc;
    private final String name;
    private final p primitiveType;
    private final Sd.c wrapperFqName;
    private static final Map<String, EnumC5003e> TYPE_BY_NAME = new HashMap();
    private static final Map<p, EnumC5003e> TYPE_BY_PRIMITIVE_TYPE = new EnumMap(p.class);
    private static final Map<String, EnumC5003e> TYPE_BY_DESC = new HashMap();
    private static final Set<String> WRAPPER_CLASS_INTERNAL_NAMES = new HashSet();
    private static final Map<String, String> OWNER_TO_BOXING_METHOD_DESCRIPTOR = new HashMap();

    static {
        for (EnumC5003e enumC5003e : values()) {
            TYPE_BY_NAME.put(enumC5003e.f(), enumC5003e);
            TYPE_BY_PRIMITIVE_TYPE.put(enumC5003e.g(), enumC5003e);
            TYPE_BY_DESC.put(enumC5003e.e(), enumC5003e);
            String replace = enumC5003e.wrapperFqName.b().replace('.', '/');
            WRAPPER_CLASS_INTERNAL_NAMES.add(replace);
            OWNER_TO_BOXING_METHOD_DESCRIPTOR.put(replace, C3173b.c(new StringBuilder("("), enumC5003e.desc, ")L", replace, ";"));
        }
    }

    EnumC5003e(@NotNull p pVar, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        if (pVar == null) {
            a(8);
            throw null;
        }
        this.primitiveType = pVar;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new Sd.c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        Object[] objArr;
        if (i11 != 4 && i11 != 6) {
            switch (i11) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i11 != 4 && i11 != 6) {
                switch (i11) {
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        i12 = 3;
                        break;
                }
                objArr = new Object[i12];
                switch (i11) {
                    case 1:
                        objArr[0] = "owner";
                        break;
                    case 2:
                        objArr[0] = "methodDescriptor";
                        break;
                    case 3:
                    case 9:
                        objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                        break;
                    case 4:
                    case 6:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                        break;
                    case 5:
                        objArr[0] = "type";
                        break;
                    case 7:
                    case 10:
                        objArr[0] = "desc";
                        break;
                    case 8:
                        objArr[0] = "primitiveType";
                        break;
                    case 11:
                        objArr[0] = "wrapperClassName";
                        break;
                    default:
                        objArr[0] = "internalName";
                        break;
                }
                if (i11 == 4 && i11 != 6) {
                    switch (i11) {
                        case 12:
                            objArr[1] = "getPrimitiveType";
                            break;
                        case 13:
                            objArr[1] = "getJavaKeywordName";
                            break;
                        case 14:
                            objArr[1] = "getDesc";
                            break;
                        case 15:
                            objArr[1] = "getWrapperFqName";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                            break;
                    }
                } else {
                    objArr[1] = "get";
                }
                switch (i11) {
                    case 1:
                    case 2:
                        objArr[2] = "isBoxingMethodDescriptor";
                        break;
                    case 3:
                    case 5:
                        objArr[2] = "get";
                        break;
                    case 4:
                    case 6:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 7:
                        objArr[2] = "getByDesc";
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "isWrapperClassInternalName";
                        break;
                }
                String format = String.format(str, objArr);
                if (i11 != 4 && i11 != 6) {
                    switch (i11) {
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i12 = 2;
            objArr = new Object[i12];
            switch (i11) {
            }
            if (i11 == 4) {
            }
            objArr[1] = "get";
            switch (i11) {
            }
            String format2 = String.format(str, objArr);
            if (i11 != 4) {
                switch (i11) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i11 != 4) {
            switch (i11) {
            }
            objArr = new Object[i12];
            switch (i11) {
            }
            if (i11 == 4) {
            }
            objArr[1] = "get";
            switch (i11) {
            }
            String format22 = String.format(str, objArr);
            if (i11 != 4) {
            }
            throw new IllegalStateException(format22);
        }
        i12 = 2;
        objArr = new Object[i12];
        switch (i11) {
        }
        if (i11 == 4) {
        }
        objArr[1] = "get";
        switch (i11) {
        }
        String format222 = String.format(str, objArr);
        if (i11 != 4) {
        }
        throw new IllegalStateException(format222);
    }

    @NotNull
    public static EnumC5003e b(@NotNull String str) {
        EnumC5003e enumC5003e = TYPE_BY_NAME.get(str);
        if (enumC5003e != null) {
            return enumC5003e;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    @NotNull
    public static EnumC5003e d(@NotNull p pVar) {
        EnumC5003e enumC5003e = TYPE_BY_PRIMITIVE_TYPE.get(pVar);
        if (enumC5003e != null) {
            return enumC5003e;
        }
        a(6);
        throw null;
    }

    @NotNull
    public final String e() {
        String str = this.desc;
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    @NotNull
    public final String f() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        a(13);
        throw null;
    }

    @NotNull
    public final p g() {
        p pVar = this.primitiveType;
        if (pVar != null) {
            return pVar;
        }
        a(12);
        throw null;
    }

    @NotNull
    public final Sd.c h() {
        Sd.c cVar = this.wrapperFqName;
        if (cVar != null) {
            return cVar;
        }
        a(15);
        throw null;
    }
}
