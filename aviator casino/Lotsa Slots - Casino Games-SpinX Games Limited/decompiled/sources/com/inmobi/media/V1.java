package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class V1 {
    public static final com.inmobi.media.U1 b;
    public static final android.util.SparseArray c;
    public static final com.inmobi.media.V1 d;
    public static final com.inmobi.media.V1 e;
    public static final /* synthetic */ com.inmobi.media.V1[] f;

    /* renamed from: a, reason: collision with root package name */
    public final int f5006a;

    static {
        com.inmobi.media.V1 v1 = new com.inmobi.media.V1(0, 0, "UNKNOWN");
        d = v1;
        com.inmobi.media.V1 v12 = new com.inmobi.media.V1(1, 1, "PLAYING");
        e = v12;
        com.inmobi.media.V1[] v1Arr = {v1, v12, new com.inmobi.media.V1(2, 2, "PAUSED"), new com.inmobi.media.V1(3, 3, "COMPLETED")};
        f = v1Arr;
        kotlin.enums.EnumEntriesKt.enumEntries(v1Arr);
        b = new com.inmobi.media.U1();
        c = new android.util.SparseArray();
        for (com.inmobi.media.V1 v13 : values()) {
            c.put(v13.f5006a, v13);
        }
    }

    public V1(int i, int i2, java.lang.String str) {
        this.f5006a = i2;
    }

    public static com.inmobi.media.V1 valueOf(java.lang.String str) {
        return (com.inmobi.media.V1) java.lang.Enum.valueOf(com.inmobi.media.V1.class, str);
    }

    public static com.inmobi.media.V1[] values() {
        return (com.inmobi.media.V1[]) f.clone();
    }
}
