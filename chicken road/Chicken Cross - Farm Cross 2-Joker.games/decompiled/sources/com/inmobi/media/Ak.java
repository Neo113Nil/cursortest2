package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Ak {

    /* renamed from: a, reason: collision with root package name */
    public static final Ak f6459a;
    public static final Ak b;
    public static final Ak c;
    public static final Ak d;
    public static final Ak e;
    public static final Ak f;
    public static final /* synthetic */ Ak[] g;

    static {
        Ak ak = new Ak("IDLE", 0);
        f6459a = ak;
        Ak ak2 = new Ak("LOADING", 1);
        b = ak2;
        Ak ak3 = new Ak("REDIRECTING", 2);
        c = ak3;
        Ak ak4 = new Ak("RESOLVE_IN_WEB_VIEW", 3);
        d = ak4;
        Ak ak5 = new Ak("EXTERNAL", 4);
        e = ak5;
        Ak ak6 = new Ak("DONE", 5);
        f = ak6;
        Ak[] akArr = {ak, ak2, ak3, ak4, ak5, ak6};
        g = akArr;
        EnumEntriesKt.enumEntries(akArr);
    }

    public Ak(String str, int i) {
    }

    public static Ak valueOf(String str) {
        return (Ak) Enum.valueOf(Ak.class, str);
    }

    public static Ak[] values() {
        return (Ak[]) g.clone();
    }
}
