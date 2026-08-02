package kotlinx.coroutines.selects;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {
    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final /* synthetic */ h[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        h hVar = new h("SUCCESSFUL", 0);
        a = hVar;
        h hVar2 = new h("REREGISTER", 1);
        b = hVar2;
        h hVar3 = new h("CANCELLED", 2);
        c = hVar3;
        h hVar4 = new h("ALREADY_SELECTED", 3);
        d = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        e = hVarArr;
        f = EnumEntriesKt.enumEntries(hVarArr);
    }

    public h() {
        throw null;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) e.clone();
    }
}
