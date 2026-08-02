package o;

/* loaded from: classes5.dex */
public final class viewModels extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private com.google.gson.Gson Camera2StreamConfigurationMap;
    private o.Camera2StreamConfigurationMap getHighResolutionOutputSizeshNQ4ISI;
    private o.getInputSizeshNQ4ISI getHighSpeedVideoFpsRanges;

    public viewModels(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.Camera2StreamConfigurationMap = gson;
        this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        com.visa.cbp.sdk.j.b.d.C0206 c0206 = (com.visa.cbp.sdk.j.b.d.C0206) obj;
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.getInputSizeshNQ4ISI getinputsizeshnq4isi = this.getHighSpeedVideoFpsRanges;
        jsonWriter.beginObject();
        if (c0206 != c0206.getHighSpeedVideoFpsRanges) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 400);
            java.lang.Long l = c0206.getHighSpeedVideoFpsRanges;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.Long.class, l).write(jsonWriter, l);
        }
        if (c0206 != c0206.getHighSpeedVideoSizes) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 422);
            jsonWriter.value(c0206.getHighSpeedVideoSizes);
        }
        if (c0206 != c0206.Camera2StreamConfigurationMap) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 318);
            java.lang.Integer num = c0206.Camera2StreamConfigurationMap;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.Integer.class, num).write(jsonWriter, num);
        }
        if (c0206 != c0206.getHighSpeedVideoFpsRangesFor) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
            java.lang.Integer num2 = c0206.getHighSpeedVideoFpsRangesFor;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.Integer.class, num2).write(jsonWriter, num2);
        }
        getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        java.lang.Class cls = java.lang.Long.TYPE;
        java.lang.Long valueOf = java.lang.Long.valueOf(c0206.getHighResolutionOutputSizeshNQ4ISI);
        o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, cls, valueOf).write(jsonWriter, valueOf);
        if (c0206 != c0206.getOutputMinFrameDuration) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 429);
            java.lang.Integer num3 = c0206.getOutputMinFrameDuration;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.Integer.class, num3).write(jsonWriter, num3);
        }
        if (c0206 != c0206.getHighSpeedVideoSizesFor) {
            getinputsizeshnq4isi.getHighSpeedVideoSizes(jsonWriter, 97);
            java.lang.Integer num4 = c0206.getHighSpeedVideoSizesFor;
            o.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(gson, java.lang.Integer.class, num4).write(jsonWriter, num4);
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
        com.visa.cbp.sdk.j.b.d.C0206 c0206 = new com.visa.cbp.sdk.j.b.d.C0206();
        com.google.gson.Gson gson = this.Camera2StreamConfigurationMap;
        o.Camera2StreamConfigurationMap camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int highResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
            boolean z = jsonReader.peek() != com.google.gson.stream.JsonToken.NULL;
            if (highResolutionOutputSizeshNQ4ISI != 168) {
                if (highResolutionOutputSizeshNQ4ISI != 187) {
                    if (highResolutionOutputSizeshNQ4ISI != 283) {
                        if (highResolutionOutputSizeshNQ4ISI != 298) {
                            if (highResolutionOutputSizeshNQ4ISI != 359) {
                                if (highResolutionOutputSizeshNQ4ISI != 394) {
                                    if (highResolutionOutputSizeshNQ4ISI != 432) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        c0206.getHighSpeedVideoFpsRanges = (java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader);
                                    } else {
                                        c0206.getHighSpeedVideoFpsRanges = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    c0206.getHighSpeedVideoSizes = jsonReader.peek() != com.google.gson.stream.JsonToken.BOOLEAN ? jsonReader.nextString() : java.lang.Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    c0206.getHighSpeedVideoSizes = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                c0206.getOutputMinFrameDuration = (java.lang.Integer) gson.getAdapter(java.lang.Integer.class).read2(jsonReader);
                            } else {
                                c0206.getOutputMinFrameDuration = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            c0206.getHighSpeedVideoFpsRangesFor = (java.lang.Integer) gson.getAdapter(java.lang.Integer.class).read2(jsonReader);
                        } else {
                            c0206.getHighSpeedVideoFpsRangesFor = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        c0206.getHighSpeedVideoSizesFor = (java.lang.Integer) gson.getAdapter(java.lang.Integer.class).read2(jsonReader);
                    } else {
                        c0206.getHighSpeedVideoSizesFor = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    c0206.getHighResolutionOutputSizeshNQ4ISI = ((java.lang.Long) gson.getAdapter(java.lang.Long.class).read2(jsonReader)).longValue();
                } else {
                    jsonReader.nextNull();
                }
            } else if (z) {
                c0206.Camera2StreamConfigurationMap = (java.lang.Integer) gson.getAdapter(java.lang.Integer.class).read2(jsonReader);
            } else {
                c0206.Camera2StreamConfigurationMap = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return c0206;
    }
}
