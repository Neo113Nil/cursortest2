package com.amplitude.core.platform;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o {
    public static final o a;
    public static final o b;
    public static final /* synthetic */ o[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        o oVar = new o("EVENT", 0);
        a = oVar;
        o oVar2 = new o("FLUSH", 1);
        b = oVar2;
        o[] oVarArr = {oVar, oVar2};
        c = oVarArr;
        d = EnumEntriesKt.enumEntries(oVarArr);
    }

    public o() {
        throw null;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) c.clone();
    }
}
