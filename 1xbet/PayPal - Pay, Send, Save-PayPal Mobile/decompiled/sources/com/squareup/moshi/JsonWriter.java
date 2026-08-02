package com.squareup.moshi;

/* loaded from: classes3.dex */
public abstract class JsonWriter implements java.io.Closeable, java.io.Flushable {
    private java.util.Map<java.lang.Class<?>, java.lang.Object> Camera2StreamConfigurationMap;
    java.lang.String getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizesFor;
    boolean getOutputFormats;
    int getInputSizeshNQ4ISI = 0;
    int[] getInputFormats = new int[32];
    java.lang.String[] getOutputMinFrameDuration = new java.lang.String[32];
    int[] getHighResolutionOutputSizeshNQ4ISI = new int[32];
    int getHighSpeedVideoSizes = -1;

    public abstract com.squareup.moshi.JsonWriter beginArray() throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter beginObject() throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter endArray() throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter endObject() throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter name(java.lang.String str) throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter nullValue() throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter value(double d) throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter value(long j) throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter value(@javax.annotation.Nullable java.lang.Boolean bool) throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter value(@javax.annotation.Nullable java.lang.Number number) throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter value(@javax.annotation.Nullable java.lang.String str) throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter value(boolean z) throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract okio.BufferedSink valueSink() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public static com.squareup.moshi.JsonWriter of(okio.BufferedSink bufferedSink) {
        return new com.squareup.moshi.JsonUtf8Writer(bufferedSink);
    }

    JsonWriter() {
    }

    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = this.getInputSizeshNQ4ISI;
        int[] iArr = this.getInputFormats;
        if (i != iArr.length) {
            return false;
        }
        if (i == 256) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Nesting too deep at ");
            sb.append(getPath());
            sb.append(": circular reference?");
            throw new com.squareup.moshi.JsonDataException(sb.toString());
        }
        this.getInputFormats = java.util.Arrays.copyOf(iArr, iArr.length * 2);
        java.lang.String[] strArr = this.getOutputMinFrameDuration;
        this.getOutputMinFrameDuration = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof com.squareup.moshi.JsonValueWriter)) {
            return true;
        }
        com.squareup.moshi.JsonValueWriter jsonValueWriter = (com.squareup.moshi.JsonValueWriter) this;
        jsonValueWriter.Camera2StreamConfigurationMap = java.util.Arrays.copyOf(jsonValueWriter.Camera2StreamConfigurationMap, jsonValueWriter.Camera2StreamConfigurationMap.length * 2);
        return true;
    }

    public void setIndent(java.lang.String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.getHighSpeedVideoFpsRanges = str;
    }

    @javax.annotation.CheckReturnValue
    public final java.lang.String getIndent() {
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        return str != null ? str : "";
    }

    public final void setLenient(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @javax.annotation.CheckReturnValue
    public final boolean isLenient() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setSerializeNulls(boolean z) {
        this.getHighSpeedVideoSizesFor = z;
    }

    @javax.annotation.CheckReturnValue
    public final boolean getSerializeNulls() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final com.squareup.moshi.JsonWriter value(okio.BufferedSource bufferedSource) throws java.io.IOException {
        if (this.getOutputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BufferedSource cannot be used as a map key in JSON at path ");
            sb.append(getPath());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        okio.BufferedSink valueSink = valueSink();
        try {
            bufferedSource.readAll(valueSink);
            if (valueSink != null) {
                valueSink.close();
            }
            return this;
        } catch (java.lang.Throwable th) {
            if (valueSink != null) {
                try {
                    valueSink.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final com.squareup.moshi.JsonWriter jsonValue(@javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
        java.lang.String obj2;
        if (obj instanceof java.util.Map) {
            beginObject();
            for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                java.lang.Object key = entry.getKey();
                if (!(key instanceof java.lang.String)) {
                    if (key == null) {
                        obj2 = "Map keys must be non-null";
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Map keys must be of type String: ");
                        sb.append(key.getClass().getName());
                        obj2 = sb.toString();
                    }
                    throw new java.lang.IllegalArgumentException(obj2);
                }
                name((java.lang.String) key);
                jsonValue(entry.getValue());
            }
            endObject();
            return this;
        }
        if (obj instanceof java.util.List) {
            beginArray();
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                jsonValue(it.next());
            }
            endArray();
            return this;
        }
        if (obj instanceof java.lang.String) {
            value((java.lang.String) obj);
            return this;
        }
        if (obj instanceof java.lang.Boolean) {
            value(((java.lang.Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof java.lang.Double) {
            value(((java.lang.Double) obj).doubleValue());
            return this;
        }
        if (obj instanceof java.lang.Long) {
            value(((java.lang.Long) obj).longValue());
            return this;
        }
        if (obj instanceof java.lang.Number) {
            value((java.lang.Number) obj);
            return this;
        }
        if (obj == null) {
            nullValue();
            return this;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported type: ");
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public final void endFlatten(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    @javax.annotation.CheckReturnValue
    public final java.lang.String getPath() {
        return com.squareup.moshi.JsonScope.getHighSpeedVideoFpsRanges(this.getInputSizeshNQ4ISI, this.getInputFormats, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @javax.annotation.CheckReturnValue
    @javax.annotation.Nullable
    public final <T> T tag(java.lang.Class<T> cls) {
        java.util.Map<java.lang.Class<?>, java.lang.Object> map = this.Camera2StreamConfigurationMap;
        if (map == null) {
            return null;
        }
        return (T) map.get(cls);
    }

    public final <T> void setTag(java.lang.Class<T> cls, T t) {
        if (!cls.isAssignableFrom(t.getClass())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag value must be of type ");
            sb.append(cls.getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
        }
        this.Camera2StreamConfigurationMap.put(cls, t);
    }

    @javax.annotation.CheckReturnValue
    public final int beginFlatten() {
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        int i2 = this.getInputFormats[i - 1];
        if (i2 != 5 && i2 != 3 && i2 != 2 && i2 != 1) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        int i3 = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = i;
        return i3;
    }

    public final void promoteValueToName() throws java.io.IOException {
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        int i2 = this.getInputFormats[i - 1];
        if (i2 != 5 && i2 != 3) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        this.getOutputFormats = true;
    }
}
