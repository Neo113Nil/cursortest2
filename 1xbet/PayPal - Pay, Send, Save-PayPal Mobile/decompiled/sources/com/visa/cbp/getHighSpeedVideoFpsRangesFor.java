package com.visa.cbp;

/* loaded from: classes5.dex */
public final class getHighSpeedVideoFpsRangesFor extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoSizes;

    public getHighSpeedVideoFpsRangesFor(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.getDeviceId getdeviceid = (com.visa.cbp.getDeviceId) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (getdeviceid != getdeviceid.getHighResolutionOutputSizeshNQ4ISI) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 430);
            jsonWriter.value(getdeviceid.getHighResolutionOutputSizeshNQ4ISI);
        }
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 345);
        java.lang.Class cls = java.lang.Long.TYPE;
        java.lang.Long valueOf = java.lang.Long.valueOf(getdeviceid.getHighSpeedVideoSizes);
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, cls, valueOf).write(jsonWriter, valueOf);
        if (getdeviceid != getdeviceid.getHighSpeedVideoFpsRangesFor) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 316);
            jsonWriter.value(getdeviceid.getHighSpeedVideoFpsRangesFor);
        }
        if (getdeviceid != getdeviceid.getHighSpeedVideoFpsRanges) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 105);
            jsonWriter.value(getdeviceid.getHighSpeedVideoFpsRanges);
        }
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 176);
        java.lang.Class cls2 = java.lang.Long.TYPE;
        java.lang.Long valueOf2 = java.lang.Long.valueOf(getdeviceid.Camera2StreamConfigurationMap);
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, cls2, valueOf2).write(jsonWriter, valueOf2);
        if (getdeviceid != getdeviceid.getHighSpeedVideoSizesFor) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 453);
            jsonWriter.value(getdeviceid.getHighSpeedVideoSizesFor);
        }
        if (getdeviceid != getdeviceid.getInputSizeshNQ4ISI) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 389);
            jsonWriter.value(getdeviceid.getInputSizeshNQ4ISI);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com.visa.cbp.getDeviceId getdeviceid = new com.visa.cbp.getDeviceId();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 33) {
                if (highResolutionOutputSizeshNQ4ISI != 160) {
                    if (highResolutionOutputSizeshNQ4ISI != 181) {
                        if (highResolutionOutputSizeshNQ4ISI != 247) {
                            if (highResolutionOutputSizeshNQ4ISI != 284) {
                                if (highResolutionOutputSizeshNQ4ISI != 287) {
                                    if (highResolutionOutputSizeshNQ4ISI != 416) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        getdeviceid.getHighResolutionOutputSizeshNQ4ISI = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        getdeviceid.getHighResolutionOutputSizeshNQ4ISI = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    getdeviceid.getHighSpeedVideoSizesFor = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    getdeviceid.getHighSpeedVideoSizesFor = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                getdeviceid.getInputSizeshNQ4ISI = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                getdeviceid.getInputSizeshNQ4ISI = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            getdeviceid.getHighSpeedVideoSizes = ((java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader)).longValue();
                        } else {
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        getdeviceid.Camera2StreamConfigurationMap = ((java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader)).longValue();
                    } else {
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    getdeviceid.getHighSpeedVideoFpsRangesFor = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                } else {
                    getdeviceid.getHighSpeedVideoFpsRangesFor = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                getdeviceid.getHighSpeedVideoFpsRanges = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
            } else {
                getdeviceid.getHighSpeedVideoFpsRanges = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return getdeviceid;
    }
}
