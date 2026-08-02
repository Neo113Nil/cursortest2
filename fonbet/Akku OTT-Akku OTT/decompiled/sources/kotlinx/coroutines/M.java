package kotlinx.coroutines;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class M {
    public static final M a;
    public static final M b;
    public static final M c;
    public static final M d;
    public static final /* synthetic */ M[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        M m = new M("DEFAULT", 0);
        a = m;
        M m2 = new M("LAZY", 1);
        b = m2;
        M m3 = new M("ATOMIC", 2);
        c = m3;
        M m4 = new M("UNDISPATCHED", 3);
        d = m4;
        M[] mArr = {m, m2, m3, m4};
        e = mArr;
        f = EnumEntriesKt.enumEntries(mArr);
    }

    public M() {
        throw null;
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) e.clone();
    }
}
