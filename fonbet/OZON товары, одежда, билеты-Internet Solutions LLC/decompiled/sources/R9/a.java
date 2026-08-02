package R9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a CAPACITY;
    public static final a EXTRACTED_VALUE_CAPACITY;
    public static final a PREFIX;
    public static final a WHOLE_STRING;

    /* renamed from: R9.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0493a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24813a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.WHOLE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.PREFIX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.CAPACITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.EXTRACTED_VALUE_CAPACITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f24813a = iArr;
        }
    }

    static {
        a aVar = new a("WHOLE_STRING", 0);
        WHOLE_STRING = aVar;
        a aVar2 = new a("PREFIX", 1);
        PREFIX = aVar2;
        a aVar3 = new a("CAPACITY", 2);
        CAPACITY = aVar3;
        a aVar4 = new a("EXTRACTED_VALUE_CAPACITY", 3);
        EXTRACTED_VALUE_CAPACITY = aVar4;
        $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
    }

    private a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
