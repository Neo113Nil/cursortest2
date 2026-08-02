package com.odehbros.flutter_file_downloader.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    public static final d a;
    public static final d b;
    public static final /* synthetic */ d[] c;

    static {
        d dVar = new d("HTTP_CONNECTION", 0);
        a = dVar;
        d dVar2 = new d("DOWNLOAD_MANAGER", 1);
        b = dVar2;
        c = new d[]{dVar, dVar2};
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
