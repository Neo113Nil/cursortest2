package Fc0;

import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e LANDSCAPE;
    public static final e PORTRAIT;
    public static final e UNKNOWN;

    static {
        e eVar = new e("PORTRAIT", 0);
        PORTRAIT = eVar;
        e eVar2 = new e("LANDSCAPE", 1);
        LANDSCAPE = eVar2;
        e eVar3 = new e(FraudMonInfo.UNKNOWN, 2);
        UNKNOWN = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = Xc.b.a(eVarArr);
    }

    private e() {
        throw null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
