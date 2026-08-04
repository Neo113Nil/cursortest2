package p044f6;

import p003a.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c[] f13005a;

    /* JADX INFO: Fake field, exist only in values array */
    c EF5;

    static {
        c[] cVarArr = {new c("SYNCHRONIZED", 0), new c("PUBLICATION", 1), new c("NONE", 2)};
        f13005a = cVarArr;
        a.T(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f13005a.clone();
    }
}
