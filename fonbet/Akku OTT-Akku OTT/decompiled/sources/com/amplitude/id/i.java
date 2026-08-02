package com.amplitude.id;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {
    public static final i a;
    public static final i b;
    public static final /* synthetic */ i[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        i iVar = new i("Initialized", 0);
        a = iVar;
        i iVar2 = new i("Updated", 1);
        b = iVar2;
        i[] iVarArr = {iVar, iVar2};
        c = iVarArr;
        d = EnumEntriesKt.enumEntries(iVarArr);
    }

    public i() {
        throw null;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) c.clone();
    }
}
