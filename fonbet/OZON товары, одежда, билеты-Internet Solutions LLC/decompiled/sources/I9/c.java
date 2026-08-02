package I9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
abstract class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c DATA_MASK_000;
    public static final c DATA_MASK_001;
    public static final c DATA_MASK_010;
    public static final c DATA_MASK_011;
    public static final c DATA_MASK_100;
    public static final c DATA_MASK_101;
    public static final c DATA_MASK_110;
    public static final c DATA_MASK_111;

    static {
        c cVar = new c() { // from class: I9.c.a
            @Override // I9.c
            final boolean a(int i11, int i12) {
                return ((i11 + i12) & 1) == 0;
            }
        };
        DATA_MASK_000 = cVar;
        c cVar2 = new c() { // from class: I9.c.b
            @Override // I9.c
            final boolean a(int i11, int i12) {
                return (i11 & 1) == 0;
            }
        };
        DATA_MASK_001 = cVar2;
        c cVar3 = new c() { // from class: I9.c.c
            @Override // I9.c
            final boolean a(int i11, int i12) {
                return i12 % 3 == 0;
            }
        };
        DATA_MASK_010 = cVar3;
        c cVar4 = new c() { // from class: I9.c.d
            @Override // I9.c
            final boolean a(int i11, int i12) {
                return (i11 + i12) % 3 == 0;
            }
        };
        DATA_MASK_011 = cVar4;
        c cVar5 = new c() { // from class: I9.c.e
            @Override // I9.c
            final boolean a(int i11, int i12) {
                return (((i12 / 3) + (i11 / 2)) & 1) == 0;
            }
        };
        DATA_MASK_100 = cVar5;
        c cVar6 = new c() { // from class: I9.c.f
            @Override // I9.c
            final boolean a(int i11, int i12) {
                return (i11 * i12) % 6 == 0;
            }
        };
        DATA_MASK_101 = cVar6;
        c cVar7 = new c() { // from class: I9.c.g
            @Override // I9.c
            final boolean a(int i11, int i12) {
                return (i11 * i12) % 6 < 3;
            }
        };
        DATA_MASK_110 = cVar7;
        c cVar8 = new c() { // from class: I9.c.h
            @Override // I9.c
            final boolean a(int i11, int i12) {
                return ((((i11 * i12) % 3) + (i11 + i12)) & 1) == 0;
            }
        };
        DATA_MASK_111 = cVar8;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8};
    }

    private c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    abstract boolean a(int i11, int i12);
}
