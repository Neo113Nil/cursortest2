package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class ContentModelParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options Camera2StreamConfigurationMap = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("ty", "d");

    private ContentModelParser() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00eb, code lost:
    
        if (r2.equals("gf") == false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.airbnb.lottie.model.content.ContentModel getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.LottieComposition lottieComposition) throws java.io.IOException {
        com.airbnb.lottie.model.content.ContentModel contentModel;
        java.lang.String str;
        jsonReader.beginObject();
        char c = 2;
        int i = 2;
        while (true) {
            contentModel = null;
            if (!jsonReader.hasNext()) {
                str = null;
                break;
            }
            int selectName = jsonReader.selectName(Camera2StreamConfigurationMap);
            if (selectName == 0) {
                str = jsonReader.nextString();
                break;
            }
            if (selectName == 1) {
                i = jsonReader.nextInt();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        if (str == null) {
            return null;
        }
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == 3239) {
            if (str.equals("el")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 3270) {
            if (str.equals("fl")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 3295) {
            if (hashCode == 3488) {
                if (str.equals("mm")) {
                    c = 5;
                }
                c = 65535;
            } else if (hashCode == 3646) {
                if (str.equals("rp")) {
                    c = '\b';
                }
                c = 65535;
            } else if (hashCode == 3669) {
                if (str.equals("sh")) {
                    c = '\t';
                }
                c = 65535;
            } else if (hashCode == 3679) {
                if (str.equals(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.SR_TRACK_NAME)) {
                    c = '\n';
                }
                c = 65535;
            } else if (hashCode == 3681) {
                if (str.equals("st")) {
                    c = 11;
                }
                c = 65535;
            } else if (hashCode == 3705) {
                if (str.equals("tm")) {
                    c = '\f';
                }
                c = 65535;
            } else if (hashCode == 3710) {
                if (str.equals("tr")) {
                    c = '\r';
                }
                c = 65535;
            } else if (hashCode == 3307) {
                if (str.equals("gr")) {
                    c = 3;
                }
                c = 65535;
            } else if (hashCode == 3308) {
                if (str.equals("gs")) {
                    c = 4;
                }
                c = 65535;
            } else if (hashCode != 3633) {
                if (hashCode == 3634 && str.equals("rd")) {
                    c = 7;
                }
                c = 65535;
            } else {
                if (str.equals("rc")) {
                    c = 6;
                }
                c = 65535;
            }
        }
        switch (c) {
            case 0:
                contentModel = com.airbnb.lottie.parser.CircleShapeParser.getHighSpeedVideoSizes(jsonReader, lottieComposition, i);
                break;
            case 1:
                contentModel = com.airbnb.lottie.parser.ShapeFillParser.getHighSpeedVideoSizes(jsonReader, lottieComposition);
                break;
            case 2:
                contentModel = com.airbnb.lottie.parser.GradientFillParser.getHighResolutionOutputSizeshNQ4ISI(jsonReader, lottieComposition);
                break;
            case 3:
                contentModel = com.airbnb.lottie.parser.ShapeGroupParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition);
                break;
            case 4:
                contentModel = com.airbnb.lottie.parser.GradientStrokeParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition);
                break;
            case 5:
                contentModel = com.airbnb.lottie.parser.MergePathsParser.getHighSpeedVideoSizes(jsonReader);
                lottieComposition.addWarning("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                contentModel = com.airbnb.lottie.parser.RectangleShapeParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition);
                break;
            case 7:
                contentModel = com.airbnb.lottie.parser.RoundedCornersParser.getHighSpeedVideoFpsRanges(jsonReader, lottieComposition);
                break;
            case '\b':
                contentModel = com.airbnb.lottie.parser.RepeaterParser.getHighSpeedVideoSizes(jsonReader, lottieComposition);
                break;
            case '\t':
                contentModel = com.airbnb.lottie.parser.ShapePathParser.Camera2StreamConfigurationMap(jsonReader, lottieComposition);
                break;
            case '\n':
                contentModel = com.airbnb.lottie.parser.PolystarShapeParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition, i);
                break;
            case 11:
                contentModel = com.airbnb.lottie.parser.ShapeStrokeParser.getHighResolutionOutputSizeshNQ4ISI(jsonReader, lottieComposition);
                break;
            case '\f':
                contentModel = com.airbnb.lottie.parser.ShapeTrimPathParser.getHighSpeedVideoSizes(jsonReader, lottieComposition);
                break;
            case '\r':
                contentModel = com.airbnb.lottie.parser.AnimatableTransformParser.parse(jsonReader, lottieComposition);
                break;
            default:
                com.airbnb.lottie.utils.Logger.warning("Unknown shape type ".concat(java.lang.String.valueOf(str)));
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return contentModel;
    }
}
