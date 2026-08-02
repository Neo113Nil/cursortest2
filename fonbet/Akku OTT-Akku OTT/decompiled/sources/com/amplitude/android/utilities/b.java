package com.amplitude.android.utilities;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final /* synthetic */ b[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        b bVar = new b("Created", 0);
        a = bVar;
        b bVar2 = new b("Started", 1);
        b = bVar2;
        b bVar3 = new b("Resumed", 2);
        c = bVar3;
        b bVar4 = new b("Paused", 3);
        d = bVar4;
        b bVar5 = new b("Stopped", 4);
        e = bVar5;
        b bVar6 = new b("Destroyed", 5);
        f = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        i = bVarArr;
        j = EnumEntriesKt.enumEntries(bVarArr);
    }

    public b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) i.clone();
    }
}
