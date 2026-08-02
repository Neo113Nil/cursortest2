package o;

/* loaded from: classes4.dex */
public final class newAuthTabSession extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI getHighResolutionOutputSizeshNQ4ISI;
    private com.google.gson.Gson getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;

    public newAuthTabSession(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighSpeedVideoFpsRanges = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.paypal.android.threeds.data.model.MessageExtension messageExtension = (com.paypal.android.threeds.data.model.MessageExtension) obj;
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonWriter.beginObject();
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 450);
        jsonWriter.value(messageExtension.criticalityIndicator);
        if (messageExtension != messageExtension.data) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 111);
            o.ICustomTabsCallbackStubProxy iCustomTabsCallbackStubProxy = new o.ICustomTabsCallbackStubProxy();
            java.util.Map<java.lang.String, java.lang.String> map = messageExtension.data;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(gson, iCustomTabsCallbackStubProxy, map).write(jsonWriter, map);
        }
        java.lang.String str = messageExtension.id;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 83);
        jsonWriter.value(messageExtension.id);
        java.lang.String str2 = messageExtension.name;
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 373);
        jsonWriter.value(messageExtension.name);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.paypal.android.threeds.data.model.MessageExtension messageExtension = new com.paypal.android.threeds.data.model.MessageExtension();
        com.google.gson.Gson gson = this.getHighSpeedVideoFpsRanges;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 9) {
                if (highResolutionOutputSizeshNQ4ISI != 15) {
                    if (highResolutionOutputSizeshNQ4ISI != 48) {
                        if (highResolutionOutputSizeshNQ4ISI != 63) {
                            jsonReader.skipValue();
                        } else if (z) {
                            messageExtension.criticalityIndicator = ((java.lang.Boolean) gson.getAdapter(java.lang.Boolean.class).read2(jsonReader)).booleanValue();
                        } else {
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        messageExtension.id = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        messageExtension.id = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    messageExtension.name = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    messageExtension.name = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                messageExtension.data = (java.util.Map) gson.getAdapter(new o.ICustomTabsCallbackStubProxy()).read2(jsonReader);
            } else {
                messageExtension.data = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return messageExtension;
    }
}
