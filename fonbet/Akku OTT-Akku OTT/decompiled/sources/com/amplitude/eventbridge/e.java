package com.amplitude.eventbridge;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    public static final e a;
    public static final /* synthetic */ e[] b;
    public static final /* synthetic */ EnumEntries c;

    static {
        e eVar = new e("EVENT", 0);
        e eVar2 = new e("IDENTIFY", 1);
        a = eVar2;
        e[] eVarArr = {eVar, eVar2};
        b = eVarArr;
        c = EnumEntriesKt.enumEntries(eVarArr);
    }

    public e() {
        throw null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) b.clone();
    }
}
