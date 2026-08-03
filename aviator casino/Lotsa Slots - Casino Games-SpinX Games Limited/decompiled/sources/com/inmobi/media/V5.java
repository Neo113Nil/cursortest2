package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class V5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.V5 f5008a;
    public static final /* synthetic */ com.inmobi.media.V5[] b;

    static {
        com.inmobi.media.V5 v5 = new com.inmobi.media.V5("URL", 0);
        f5008a = v5;
        com.inmobi.media.V5[] v5Arr = {v5, new com.inmobi.media.V5("HTML", 1)};
        b = v5Arr;
        kotlin.enums.EnumEntriesKt.enumEntries(v5Arr);
    }

    public V5(java.lang.String str, int i) {
    }

    public static com.inmobi.media.V5 valueOf(java.lang.String str) {
        return (com.inmobi.media.V5) java.lang.Enum.valueOf(com.inmobi.media.V5.class, str);
    }

    public static com.inmobi.media.V5[] values() {
        return (com.inmobi.media.V5[]) b.clone();
    }
}
