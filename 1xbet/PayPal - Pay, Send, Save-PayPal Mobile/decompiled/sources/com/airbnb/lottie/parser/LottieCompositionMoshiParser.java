package com.airbnb.lottie.parser;

/* loaded from: classes7.dex */
public class LottieCompositionMoshiParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighResolutionOutputSizeshNQ4ISI = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    static com.airbnb.lottie.parser.moshi.JsonReader.Options Camera2StreamConfigurationMap = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("id", "layers", "w", "h", "p", "u");
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoFpsRanges = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("list");
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options getHighSpeedVideoFpsRangesFor = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("cm", "tm", "dr");

    public static com.airbnb.lottie.LottieComposition parse(com.airbnb.lottie.parser.moshi.JsonReader jsonReader) throws java.io.IOException {
        float f;
        float f2;
        java.util.HashMap hashMap;
        java.util.ArrayList arrayList;
        java.util.HashMap hashMap2;
        float f3;
        float dpScale = com.airbnb.lottie.utils.Utils.dpScale();
        androidx.collection.LongSparseArray<com.airbnb.lottie.model.layer.Layer> longSparseArray = new androidx.collection.LongSparseArray<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.HashMap hashMap4 = new java.util.HashMap();
        java.util.HashMap hashMap5 = new java.util.HashMap();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        androidx.collection.SparseArrayCompat<com.airbnb.lottie.model.FontCharacter> sparseArrayCompat = new androidx.collection.SparseArrayCompat<>();
        com.airbnb.lottie.LottieComposition lottieComposition = new com.airbnb.lottie.LottieComposition();
        jsonReader.beginObject();
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(getHighResolutionOutputSizeshNQ4ISI)) {
                case 0:
                    i = (int) jsonReader.nextDouble();
                    break;
                case 1:
                    i2 = (int) jsonReader.nextDouble();
                    break;
                case 2:
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    f5 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case 4:
                    f6 = (float) jsonReader.nextDouble();
                    break;
                case 5:
                    f = f5;
                    f2 = f6;
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    java.lang.String[] split = jsonReader.nextString().split("\\.");
                    if (!com.airbnb.lottie.utils.Utils.isAtLeastVersion(java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]), java.lang.Integer.parseInt(split[2]), 4, 4, 0)) {
                        lottieComposition.addWarning("Lottie only supports bodymovin >= 4.4.0");
                    }
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f6 = f2;
                    f5 = f;
                    break;
                case 6:
                    f = f5;
                    f2 = f6;
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    jsonReader.beginArray();
                    int i3 = 0;
                    while (jsonReader.hasNext()) {
                        com.airbnb.lottie.model.layer.Layer parse = com.airbnb.lottie.parser.LayerParser.parse(jsonReader, lottieComposition);
                        if (parse.getLayerType() == com.airbnb.lottie.model.layer.Layer.LayerType.IMAGE) {
                            i3++;
                        }
                        arrayList2.add(parse);
                        longSparseArray.put(parse.getId(), parse);
                        if (i3 > 4) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("You have ");
                            sb.append(i3);
                            sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                            com.airbnb.lottie.utils.Logger.warning(sb.toString());
                        }
                    }
                    jsonReader.endArray();
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f6 = f2;
                    f5 = f;
                    break;
                case 7:
                    f = f5;
                    f2 = f6;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        androidx.collection.LongSparseArray longSparseArray2 = new androidx.collection.LongSparseArray();
                        jsonReader.beginObject();
                        java.lang.String str = null;
                        java.lang.String str2 = null;
                        java.lang.String str3 = null;
                        int i4 = 0;
                        int i5 = 0;
                        while (jsonReader.hasNext()) {
                            int selectName = jsonReader.selectName(Camera2StreamConfigurationMap);
                            if (selectName != 0) {
                                java.util.ArrayList arrayList5 = arrayList3;
                                if (selectName != 1) {
                                    if (selectName == 2) {
                                        i4 = jsonReader.nextInt();
                                    } else if (selectName == 3) {
                                        i5 = jsonReader.nextInt();
                                    } else if (selectName == 4) {
                                        str2 = jsonReader.nextString();
                                    } else if (selectName == 5) {
                                        str3 = jsonReader.nextString();
                                    } else {
                                        jsonReader.skipName();
                                        jsonReader.skipValue();
                                        hashMap2 = hashMap5;
                                    }
                                    arrayList3 = arrayList5;
                                } else {
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        com.airbnb.lottie.model.layer.Layer parse2 = com.airbnb.lottie.parser.LayerParser.parse(jsonReader, lottieComposition);
                                        longSparseArray2.put(parse2.getId(), parse2);
                                        arrayList4.add(parse2);
                                        hashMap5 = hashMap5;
                                    }
                                    hashMap2 = hashMap5;
                                    jsonReader.endArray();
                                }
                                arrayList3 = arrayList5;
                                hashMap5 = hashMap2;
                            } else {
                                str = jsonReader.nextString();
                            }
                        }
                        java.util.HashMap hashMap6 = hashMap5;
                        java.util.ArrayList arrayList6 = arrayList3;
                        jsonReader.endObject();
                        if (str2 != null) {
                            com.airbnb.lottie.LottieImageAsset lottieImageAsset = new com.airbnb.lottie.LottieImageAsset(i4, i5, str, str2, str3);
                            hashMap4.put(lottieImageAsset.getId(), lottieImageAsset);
                        } else {
                            hashMap3.put(str, arrayList4);
                        }
                        arrayList3 = arrayList6;
                        hashMap5 = hashMap6;
                    }
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    jsonReader.endArray();
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f6 = f2;
                    f5 = f;
                    break;
                case 8:
                    f = f5;
                    f2 = f6;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.selectName(getHighSpeedVideoFpsRanges) == 0) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                com.airbnb.lottie.model.Font highSpeedVideoFpsRanges = com.airbnb.lottie.parser.FontParser.getHighSpeedVideoFpsRanges(jsonReader);
                                hashMap5.put(highSpeedVideoFpsRanges.getName(), highSpeedVideoFpsRanges);
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f6 = f2;
                    f5 = f;
                    break;
                case 9:
                    f = f5;
                    f2 = f6;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.airbnb.lottie.model.FontCharacter highSpeedVideoFpsRangesFor = com.airbnb.lottie.parser.FontCharacterParser.getHighSpeedVideoFpsRangesFor(jsonReader, lottieComposition);
                        sparseArrayCompat.put(highSpeedVideoFpsRangesFor.hashCode(), highSpeedVideoFpsRangesFor);
                    }
                    jsonReader.endArray();
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f6 = f2;
                    f5 = f;
                    break;
                case 10:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        java.lang.String str4 = null;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int selectName2 = jsonReader.selectName(getHighSpeedVideoFpsRangesFor);
                            if (selectName2 != 0) {
                                float f9 = f6;
                                if (selectName2 == 1) {
                                    f3 = f5;
                                    f7 = (float) jsonReader.nextDouble();
                                } else if (selectName2 == 2) {
                                    f3 = f5;
                                    f8 = (float) jsonReader.nextDouble();
                                } else {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                    f6 = f9;
                                }
                                f6 = f9;
                                f5 = f3;
                            } else {
                                str4 = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        arrayList3.add(new com.airbnb.lottie.model.Marker(str4, f7, f8));
                        f6 = f6;
                        f5 = f5;
                    }
                    f = f5;
                    f2 = f6;
                    jsonReader.endArray();
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f6 = f2;
                    f5 = f;
                    break;
                default:
                    f = f5;
                    f2 = f6;
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    arrayList3 = arrayList;
                    hashMap5 = hashMap;
                    f6 = f2;
                    f5 = f;
                    break;
            }
        }
        lottieComposition.init(new android.graphics.Rect(0, 0, (int) (i * dpScale), (int) (i2 * dpScale)), f4, f5, f6, arrayList2, longSparseArray, hashMap3, hashMap4, com.airbnb.lottie.utils.Utils.dpScale(), sparseArrayCompat, hashMap5, arrayList3, i, i2);
        return lottieComposition;
    }
}
