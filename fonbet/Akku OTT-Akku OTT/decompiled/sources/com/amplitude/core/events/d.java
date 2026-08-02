package com.amplitude.core.events;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    public static final /* synthetic */ d[] a;
    public static final /* synthetic */ EnumEntries b;

    static {
        d[] dVarArr = {new d("SET", 0, "$set"), new d("SET_ONCE", 1, "$setOnce"), new d("ADD", 2, "$add"), new d("APPEND", 3, "$append"), new d("CLEAR_ALL", 4, "$clearAll"), new d("PREPEND", 5, "$prepend"), new d("UNSET", 6, "$unset"), new d("PRE_INSERT", 7, "$preInsert"), new d("POST_INSERT", 8, "$postInsert"), new d("REMOVE", 9, "$remove")};
        a = dVarArr;
        b = EnumEntriesKt.enumEntries(dVarArr);
    }

    public d(String str, int i, String str2) {
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) a.clone();
    }
}
