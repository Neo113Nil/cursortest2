package com.google.zxing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    public static final a a;
    public static final /* synthetic */ a[] b;

    /* JADX INFO: Fake field, exist only in values array */
    a EF1;

    static {
        a aVar = new a("AZTEC", 0);
        a aVar2 = new a("CODABAR", 1);
        a aVar3 = new a("CODE_39", 2);
        a aVar4 = new a("CODE_93", 3);
        a aVar5 = new a("CODE_128", 4);
        a aVar6 = new a("DATA_MATRIX", 5);
        a aVar7 = new a("EAN_8", 6);
        a aVar8 = new a("EAN_13", 7);
        a aVar9 = new a("ITF", 8);
        a aVar10 = new a("MAXICODE", 9);
        a aVar11 = new a("PDF_417", 10);
        a aVar12 = new a("QR_CODE", 11);
        a = aVar12;
        b = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, new a("RSS_14", 12), new a("RSS_EXPANDED", 13), new a("UPC_A", 14), new a("UPC_E", 15), new a("UPC_EAN_EXTENSION", 16)};
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) b.clone();
    }
}
