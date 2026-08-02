package Oj;

import Sc.InterfaceC3999a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
/* loaded from: classes10.dex */
public final class f {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f SIZE_200;
    public static final f SIZE_300;
    public static final f SIZE_350;
    public static final f SIZE_400;
    public static final f SIZE_500;
    public static final f SIZE_600;
    private final int cornerRadius;

    static {
        f fVar = new f("SIZE_200", 0, 4);
        SIZE_200 = fVar;
        f fVar2 = new f("SIZE_300", 1, 8);
        SIZE_300 = fVar2;
        f fVar3 = new f("SIZE_350", 2, 10);
        SIZE_350 = fVar3;
        f fVar4 = new f("SIZE_400", 3, 12);
        SIZE_400 = fVar4;
        f fVar5 = new f("SIZE_500", 4, 16);
        SIZE_500 = fVar5;
        f fVar6 = new f("SIZE_600", 5, 28);
        SIZE_600 = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        $VALUES = fVarArr;
        $ENTRIES = Xc.b.a(fVarArr);
    }

    private f(String str, int i11, int i12) {
        this.cornerRadius = i12;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
