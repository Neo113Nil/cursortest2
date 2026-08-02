package com.odehbros.flutter_file_downloader.permissions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    public static final b a;
    public static final b b;
    public static final b c;
    public static final /* synthetic */ b[] d;

    static {
        b bVar = new b("denied", 0);
        a = bVar;
        b bVar2 = new b("deniedForever", 1);
        b = bVar2;
        b bVar3 = new b("always", 2);
        c = bVar3;
        d = new b[]{bVar, bVar2, bVar3};
    }

    public b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) d.clone();
    }
}
