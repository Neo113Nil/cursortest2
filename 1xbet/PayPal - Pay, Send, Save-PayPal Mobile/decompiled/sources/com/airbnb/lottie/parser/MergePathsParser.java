package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
class MergePathsParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighResolutionOutputSizeshNQ4ISI = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("nm", "mm", "hd");

    private MergePathsParser() {
    }

    static com.airbnb.lottie.model.content.MergePaths getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.JsonReader jsonReader) throws java.io.IOException {
        java.lang.String str = null;
        boolean z = false;
        com.airbnb.lottie.model.content.MergePaths.MergePathsMode mergePathsMode = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(getHighResolutionOutputSizeshNQ4ISI);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                mergePathsMode = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.forId(jsonReader.nextInt());
            } else if (selectName == 2) {
                z = jsonReader.nextBoolean();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        return new com.airbnb.lottie.model.content.MergePaths(str, mergePathsMode, z);
    }
}
