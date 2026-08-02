package com.daon.sdk.renderscript;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class c {
    public static final com.daon.sdk.renderscript.c b;
    public static final com.daon.sdk.renderscript.c c;
    private static final /* synthetic */ com.daon.sdk.renderscript.c[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final int getHighResolutionOutputSizeshNQ4ISI;

    static {
        com.daon.sdk.renderscript.c cVar = new com.daon.sdk.renderscript.c("NV21", 0, 17);
        b = cVar;
        com.daon.sdk.renderscript.c cVar2 = new com.daon.sdk.renderscript.c("YV12", 1, com.google.mlkit.vision.common.InputImage.IMAGE_FORMAT_YV12);
        c = cVar2;
        com.daon.sdk.renderscript.c[] cVarArr = {cVar, cVar2};
        getHighSpeedVideoFpsRangesFor = cVarArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(cVarArr);
    }

    private c(java.lang.String str, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
    }

    public final int b() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.daon.sdk.renderscript.c[] values() {
        return (com.daon.sdk.renderscript.c[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.daon.sdk.renderscript.c valueOf(java.lang.String str) {
        return (com.daon.sdk.renderscript.c) java.lang.Enum.valueOf(com.daon.sdk.renderscript.c.class, str);
    }
}
