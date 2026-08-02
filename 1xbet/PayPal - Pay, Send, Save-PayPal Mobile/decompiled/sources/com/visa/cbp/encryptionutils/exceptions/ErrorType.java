package com.visa.cbp.encryptionutils.exceptions;

/* loaded from: classes16.dex */
public enum ErrorType {
    ERROR_899(899, "There was an exception trying to invoke the getEncryptedDevicePersoData "),
    ERROR_900(900, "Input data is wrong. Input parameters must not be null or Empty"),
    ERROR_901(901, "Input validation failed - Device ID is either null or of invalid length"),
    ERROR_902(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR, "Input validation failed – WalletAccountId is either null or of invalid length"),
    ERROR_903(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING, "Input validation failed – DeviceSalt is either null or of invalid length."),
    ERROR_904(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN, "Input validation failed – Mapsalt is either null or of invalid length"),
    ERROR_905(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION, "Input validation failed – MapKey must not be null"),
    ERROR_906(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_REFERENCE, "Input validation failed – Encryption cert string is either null or empty"),
    ERROR_907(907, "Input validation failed – Encryption private key exponent cannot be null"),
    ERROR_908(908, "Input validation failed – Server entropy is either null or of invalid length"),
    ERROR_909(909, "No such algorithm exception – "),
    ERROR_910(910, "No such provider exception - "),
    ERROR_911(911, "DevicePersoData must be not null "),
    ERROR_912(912, "Unable to open ABK public key"),
    ERROR_913(913, "error while encrypting Personalization Data"),
    ERROR_914(914, "error while getting the timestamp formatting for DPM"),
    ERROR_915(915, "error while generating TxKey"),
    ERROR_916(916, "error while generating DK"),
    ERROR_917(917, "error while generating Device Key Pair"),
    ERROR_918(918, "error while get the Self Signed Cert"),
    ERROR_919(919, "Input validation failed – Hex private key exponent is of invalid length"),
    ERROR_920(920, "Enc certificate invalid - "),
    ERROR_921(921, "Sign certificate invalid - "),
    ERROR_922(922, "Certificate signing request subject must not be null"),
    ERROR_923(923, "Certificate meta data must not be null"),
    ERROR_924(924, "Certificate meta data - Issuer field value must not be null or empty"),
    ERROR_925(925, "Certificate meta data - Subject field value must not be null or empty"),
    ERROR_926(926, "Certificate meta data - Not before value is not valid"),
    ERROR_927(927, "Certificate meta data - Not after value is not valid"),
    ERROR_928(com.google.zxing.pdf417.PDF417Common.MAX_CODEWORDS_IN_BARCODE, "Certificate meta data - Serial field value must not be null or empty"),
    ERROR_929(com.google.zxing.pdf417.PDF417Common.NUMBER_OF_CODEWORDS, "Key Pair must not be null"),
    ERROR_930(930, "Key Pair - Private key must not be null"),
    ERROR_931(931, "Key Pair - Public key must not be null"),
    ERROR_932(932, "Certificate meta data - Not before and Not after values are not correct."),
    ERROR_933(933, "Input validation failed – Base64 format is invalid"),
    ERROR_934(934, "Private Master key must not be null"),
    ERROR_935(935, "No such encoding algorithm exception – "),
    ERROR_936(936, "The selected environment is unsupported in this build. ");

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoSizes;

    ErrorType(int i, java.lang.String str) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public final int getCode() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String getMessage() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
