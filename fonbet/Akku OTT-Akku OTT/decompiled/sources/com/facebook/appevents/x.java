package com.facebook.appevents;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class x {
    public static final x a;
    public static final x b;
    public static final x c;
    public static final /* synthetic */ x[] d;

    static {
        x xVar = new x("SUCCESS", 0);
        a = xVar;
        x xVar2 = new x("SERVER_ERROR", 1);
        b = xVar2;
        x xVar3 = new x("NO_CONNECTIVITY", 2);
        c = xVar3;
        d = new x[]{xVar, xVar2, xVar3, new x("UNKNOWN_ERROR", 3)};
    }

    public x() {
        throw null;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) d.clone();
    }
}
