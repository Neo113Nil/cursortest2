package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
public class DocumentDataParser implements com.airbnb.lottie.parser.ValueParser<com.airbnb.lottie.model.DocumentData> {
    public static final com.airbnb.lottie.parser.DocumentDataParser INSTANCE = new com.airbnb.lottie.parser.DocumentDataParser();
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoSizes = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("t", "f", lib.android.paypal.com.magnessdk.g.n2, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private DocumentDataParser() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.parser.ValueParser
    public com.airbnb.lottie.model.DocumentData parse(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) throws java.io.IOException {
        com.airbnb.lottie.model.DocumentData.Justification justification = com.airbnb.lottie.model.DocumentData.Justification.CENTER;
        jsonReader.beginObject();
        com.airbnb.lottie.model.DocumentData.Justification justification2 = justification;
        java.lang.String str = null;
        java.lang.String str2 = null;
        android.graphics.PointF pointF = null;
        android.graphics.PointF pointF2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(getHighSpeedVideoSizes)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    int nextInt = jsonReader.nextInt();
                    if (nextInt > com.airbnb.lottie.model.DocumentData.Justification.CENTER.ordinal() || nextInt < 0) {
                        justification2 = com.airbnb.lottie.model.DocumentData.Justification.CENTER;
                        break;
                    } else {
                        justification2 = com.airbnb.lottie.model.DocumentData.Justification.values()[nextInt];
                        break;
                    }
                    break;
                case 4:
                    i = jsonReader.nextInt();
                    break;
                case 5:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    i2 = com.airbnb.lottie.parser.JsonUtils.getHighSpeedVideoSizes(jsonReader);
                    break;
                case 8:
                    i3 = com.airbnb.lottie.parser.JsonUtils.getHighSpeedVideoSizes(jsonReader);
                    break;
                case 9:
                    f5 = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    z = jsonReader.nextBoolean();
                    break;
                case 11:
                    jsonReader.beginArray();
                    android.graphics.PointF pointF3 = new android.graphics.PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case 12:
                    jsonReader.beginArray();
                    android.graphics.PointF pointF4 = new android.graphics.PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.airbnb.lottie.model.DocumentData(str, str2, f2, justification2, i, f3, f4, i2, i3, f5, z, pointF, pointF2);
    }
}
