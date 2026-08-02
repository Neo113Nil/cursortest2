package o;

/* loaded from: classes4.dex */
public final class onUnminimized extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRanges;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoSizes;

    public onUnminimized(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoFpsRanges = camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.paypal.android.threeds.data.model.ChallengeImage challengeImage = (com.paypal.android.threeds.data.model.ChallengeImage) obj;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoSizes;
        jsonWriter.beginObject();
        java.lang.String str = challengeImage.extraHigh;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE);
        jsonWriter.value(challengeImage.extraHigh);
        java.lang.String str2 = challengeImage.high;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 337);
        jsonWriter.value(challengeImage.high);
        java.lang.String str3 = challengeImage.medium;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 17);
        jsonWriter.value(challengeImage.medium);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.paypal.android.threeds.data.model.ChallengeImage challengeImage = new com.paypal.android.threeds.data.model.ChallengeImage();
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 83) {
                if (highResolutionOutputSizeshNQ4ISI != 120) {
                    if (highResolutionOutputSizeshNQ4ISI != 220) {
                        jsonReader.skipValue();
                    } else if (z) {
                        challengeImage.high = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        challengeImage.high = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    challengeImage.medium = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    challengeImage.medium = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                challengeImage.extraHigh = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                challengeImage.extraHigh = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return challengeImage;
    }
}
