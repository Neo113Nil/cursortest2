package com.google.zxing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final /* synthetic */ b[] f;

    static {
        b bVar = new b("ERROR_CORRECTION", 0);
        a = bVar;
        b bVar2 = new b("CHARACTER_SET", 1);
        b = bVar2;
        b bVar3 = new b("DATA_MATRIX_SHAPE", 2);
        b bVar4 = new b("MIN_SIZE", 3);
        b bVar5 = new b("MAX_SIZE", 4);
        b bVar6 = new b("MARGIN", 5);
        c = bVar6;
        b bVar7 = new b("PDF417_COMPACT", 6);
        b bVar8 = new b("PDF417_COMPACTION", 7);
        b bVar9 = new b("PDF417_DIMENSIONS", 8);
        b bVar10 = new b("AZTEC_LAYERS", 9);
        b bVar11 = new b("QR_VERSION", 10);
        d = bVar11;
        b bVar12 = new b("GS1_FORMAT", 11);
        e = bVar12;
        f = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12};
    }

    public b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f.clone();
    }
}
