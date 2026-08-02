package com.daon.face.quality;

/* loaded from: classes7.dex */
public class DaonFaceQualityException extends java.lang.Exception {
    public static final int ERR_CONFIG_FILE_READ = 1258680764;
    public static final int ERR_EYE_DISTANCE_CALCULATION = 920532685;
    public static final int ERR_FACE_DETECTION = 1431114499;
    public static final int ERR_FACE_LANDMARKS = 425067705;
    public static final int ERR_FACE_TRACK_INIT = 254081734;
    public static final int ERR_FACE_TRACK_UPDATE = -295357185;
    public static final int ERR_FRAME_SIZE = 244098995;
    public static final int ERR_IMAGE_FORMAT = 1025929083;
    public static final int ERR_IMAGE_ORIENTATION = -1655924564;
    public static final int ERR_IMAGE_READ = -928192998;
    public static final int ERR_IMAGE_SIZE = -928158587;
    public static final int ERR_JNI = 73605;
    public static final int ERR_MODEL_FILE = -1675681550;
    public static final int ERR_NO_MODEL_FILE = -390366672;
    public static final int ERR_REGION_OF_INTEREST_EXTRACTION = 1926316895;
    public static final int ERR_SYS_ALLOC = -68035837;
    public static final int ERR_UNKNOWN = 433141802;
    public static final int ERR_WRONG_USAGE = -1815855025;
    private int errorCode;

    public int getErrorCode() {
        return this.errorCode;
    }

    public static java.lang.String errorToString(int i) {
        switch (i) {
            case ERR_WRONG_USAGE /* -1815855025 */:
                return "ERR_WRONG_USAGE";
            case ERR_MODEL_FILE /* -1675681550 */:
                return "ERR_MODEL_FILE";
            case ERR_IMAGE_ORIENTATION /* -1655924564 */:
                return "ERR_IMAGE_ORIENTATION";
            case ERR_IMAGE_READ /* -928192998 */:
                return "ERR_IMAGE_READ";
            case ERR_IMAGE_SIZE /* -928158587 */:
                return "ERR_IMAGE_SIZE";
            case ERR_NO_MODEL_FILE /* -390366672 */:
                return "ERR_NO_MODEL_FILE";
            case ERR_FACE_TRACK_UPDATE /* -295357185 */:
                return "ERR_FACE_TRACK_UPDATE";
            case ERR_SYS_ALLOC /* -68035837 */:
                return "ERR_SYS_ALLOC";
            case ERR_JNI /* 73605 */:
                return "ERR_JNI";
            case ERR_FRAME_SIZE /* 244098995 */:
                return "ERR_FRAME_SIZE";
            case ERR_FACE_TRACK_INIT /* 254081734 */:
                return "ERR_FACE_TRACK_INIT";
            case ERR_FACE_LANDMARKS /* 425067705 */:
                return "ERR_FACE_LANDMARKS";
            case ERR_UNKNOWN /* 433141802 */:
                return "ERR_UNKNOWN";
            case ERR_EYE_DISTANCE_CALCULATION /* 920532685 */:
                return "ERR_EYE_DISTANCE_CALCULATION";
            case ERR_IMAGE_FORMAT /* 1025929083 */:
                return "ERR_IMAGE_FORMAT";
            case ERR_CONFIG_FILE_READ /* 1258680764 */:
                return "ERR_CONFIG_FILE_READ";
            case ERR_FACE_DETECTION /* 1431114499 */:
                return "ERR_FACE_DETECTION";
            case ERR_REGION_OF_INTEREST_EXTRACTION /* 1926316895 */:
                return "ERR_REGION_OF_INTEREST_EXTRACTION";
            default:
                return "Unknown";
        }
    }

    public DaonFaceQualityException(int i, java.lang.String str) {
        super(str);
        this.errorCode = i;
    }
}
