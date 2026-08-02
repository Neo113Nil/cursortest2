package com.microblink.blinkid.entities.ocrengine.deep;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class DeepOCRModel {
    public static final com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel BlinkInput;
    private static final /* synthetic */ com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel[] getHighSpeedVideoSizes;

    static {
        com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel deepOCRModel = new com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel();
        BlinkInput = deepOCRModel;
        getHighSpeedVideoSizes = new com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel[]{deepOCRModel};
    }

    private DeepOCRModel() {
    }

    public static com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel valueOf(java.lang.String str) {
        return (com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel) java.lang.Enum.valueOf(com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel.class, str);
    }

    public static com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel[] values() {
        return (com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel[]) getHighSpeedVideoSizes.clone();
    }
}
