package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Yn {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.Yn f5073a;
    public static final com.inmobi.media.Yn b;
    public static final com.inmobi.media.Yn c;
    public static final /* synthetic */ com.inmobi.media.Yn[] d;

    static {
        com.inmobi.media.Yn yn = new com.inmobi.media.Yn("UNKNOWN", 0);
        f5073a = yn;
        com.inmobi.media.Yn yn2 = new com.inmobi.media.Yn("HIDDEN", 1);
        b = yn2;
        com.inmobi.media.Yn yn3 = new com.inmobi.media.Yn("VISIBLE", 2);
        c = yn3;
        com.inmobi.media.Yn[] ynArr = {yn, yn2, yn3};
        d = ynArr;
        kotlin.enums.EnumEntriesKt.enumEntries(ynArr);
    }

    public Yn(java.lang.String str, int i) {
    }

    public static com.inmobi.media.Yn valueOf(java.lang.String str) {
        return (com.inmobi.media.Yn) java.lang.Enum.valueOf(com.inmobi.media.Yn.class, str);
    }

    public static com.inmobi.media.Yn[] values() {
        return (com.inmobi.media.Yn[]) d.clone();
    }
}
