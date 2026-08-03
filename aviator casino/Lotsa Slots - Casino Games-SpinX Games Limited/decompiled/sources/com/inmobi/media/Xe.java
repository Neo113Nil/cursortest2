package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Xe {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.Xe f5048a;
    public static final com.inmobi.media.Xe b;
    public static final com.inmobi.media.Xe c;
    public static final com.inmobi.media.Xe d;
    public static final /* synthetic */ com.inmobi.media.Xe[] e;

    static {
        com.inmobi.media.Xe xe = new com.inmobi.media.Xe("UNAVAILABLE", 0);
        f5048a = xe;
        com.inmobi.media.Xe xe2 = new com.inmobi.media.Xe("SLOW", 1);
        b = xe2;
        com.inmobi.media.Xe xe3 = new com.inmobi.media.Xe("MEDIUM", 2);
        c = xe3;
        com.inmobi.media.Xe xe4 = new com.inmobi.media.Xe("FAST", 3);
        d = xe4;
        com.inmobi.media.Xe[] xeArr = {xe, xe2, xe3, xe4};
        e = xeArr;
        kotlin.enums.EnumEntriesKt.enumEntries(xeArr);
    }

    public Xe(java.lang.String str, int i) {
    }

    public static com.inmobi.media.Xe valueOf(java.lang.String str) {
        return (com.inmobi.media.Xe) java.lang.Enum.valueOf(com.inmobi.media.Xe.class, str);
    }

    public static com.inmobi.media.Xe[] values() {
        return (com.inmobi.media.Xe[]) e.clone();
    }
}
