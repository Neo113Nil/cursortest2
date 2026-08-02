package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public enum ProcessingStatus {
    Success,
    DetectionFailed,
    ImagePreprocessingFailed,
    StabilityTestFailed,
    ScanningWrongSide,
    FieldIdentificationFailed,
    MandatoryFieldMissing,
    InvalidCharactersFound,
    ImageReturnFailed,
    BarcodeRecognitionFailed,
    MrzParsingFailed,
    ClassFiltered,
    UnsupportedClass,
    UnsupportedByLicense,
    AwaitingOtherSide,
    NotScanned,
    BarcodeDetectionFailed
}
