package org.tensorflow.lite;

/* loaded from: classes18.dex */
class DataTypeUtils {
    private DataTypeUtils() {
    }

    /* renamed from: org.tensorflow.lite.DataTypeUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[org.tensorflow.lite.DataType.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[org.tensorflow.lite.DataType.FLOAT32.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.tensorflow.lite.DataType.INT32.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.tensorflow.lite.DataType.INT16.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.tensorflow.lite.DataType.INT8.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.tensorflow.lite.DataType.UINT8.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.tensorflow.lite.DataType.INT64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.tensorflow.lite.DataType.BOOL.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.tensorflow.lite.DataType.STRING.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(org.tensorflow.lite.DataType dataType) {
        switch (org.tensorflow.lite.DataTypeUtils.AnonymousClass1.getHighSpeedVideoFpsRanges[dataType.ordinal()]) {
            case 1:
                return androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT;
            case 2:
                return com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT;
            case 3:
                return "short";
            case 4:
            case 5:
                return "byte";
            case 6:
                return com.adjust.sdk.Constants.LONG;
            case 7:
                return com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_BOOL;
            case 8:
                return "string";
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DataType error: DataType ");
                sb.append(dataType);
                sb.append(" is not supported yet");
                throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    static org.tensorflow.lite.DataType getHighResolutionOutputSizeshNQ4ISI(int i) {
        switch (i) {
            case 1:
                return org.tensorflow.lite.DataType.FLOAT32;
            case 2:
                return org.tensorflow.lite.DataType.INT32;
            case 3:
                return org.tensorflow.lite.DataType.UINT8;
            case 4:
                return org.tensorflow.lite.DataType.INT64;
            case 5:
                return org.tensorflow.lite.DataType.STRING;
            case 6:
                return org.tensorflow.lite.DataType.BOOL;
            case 7:
                return org.tensorflow.lite.DataType.INT16;
            case 8:
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DataType error: DataType ");
                sb.append(i);
                sb.append(" is not recognized in Java.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            case 9:
                return org.tensorflow.lite.DataType.INT8;
        }
    }
}
