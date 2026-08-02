package com.csdcorp.speech_to_text;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    public static final d a;
    public static final d b;
    public static final /* synthetic */ d[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        d dVar = new d("deviceDefault", 0);
        a = dVar;
        d dVar2 = new d("dictation", 1);
        d dVar3 = new d(FirebaseAnalytics.Event.SEARCH, 2);
        b = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3, new d("confirmation", 3)};
        c = dVarArr;
        d = EnumEntriesKt.enumEntries(dVarArr);
    }

    public d() {
        throw null;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) c.clone();
    }
}
