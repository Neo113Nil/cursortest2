package Ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class u {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u NEED_SELECTION_REFRESH;
    public static final u NONE;
    public static final u READY_TO_RESTORE_SCROLL;

    static {
        u uVar = new u("NONE", 0);
        NONE = uVar;
        u uVar2 = new u("NEED_SELECTION_REFRESH", 1);
        NEED_SELECTION_REFRESH = uVar2;
        u uVar3 = new u("READY_TO_RESTORE_SCROLL", 2);
        READY_TO_RESTORE_SCROLL = uVar3;
        u[] uVarArr = {uVar, uVar2, uVar3};
        $VALUES = uVarArr;
        $ENTRIES = Xc.b.a(uVarArr);
    }

    private u() {
        throw null;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
