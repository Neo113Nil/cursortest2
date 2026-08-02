package R20;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c Badge;
    public static final c Button;
    public static final c Chevron;
    public static final c ComposableFunction;
    public static final c Copy;
    public static final c CustomView;
    public static final c Header;
    public static final c Input;
    public static final c RadioGroup;
    public static final c Toggle;

    static {
        c cVar = new c("Header", 0);
        Header = cVar;
        c cVar2 = new c("Badge", 1);
        Badge = cVar2;
        c cVar3 = new c("Button", 2);
        Button = cVar3;
        c cVar4 = new c("Chevron", 3);
        Chevron = cVar4;
        c cVar5 = new c("Copy", 4);
        Copy = cVar5;
        c cVar6 = new c("RadioGroup", 5);
        RadioGroup = cVar6;
        c cVar7 = new c("Input", 6);
        Input = cVar7;
        c cVar8 = new c("Toggle", 7);
        Toggle = cVar8;
        c cVar9 = new c("ComposableFunction", 8);
        ComposableFunction = cVar9;
        c cVar10 = new c("CustomView", 9);
        CustomView = cVar10;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10};
        $VALUES = cVarArr;
        $ENTRIES = Xc.b.a(cVarArr);
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
}
