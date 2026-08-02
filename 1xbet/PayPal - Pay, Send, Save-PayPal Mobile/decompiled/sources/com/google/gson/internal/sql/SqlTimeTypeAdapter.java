package com.google.gson.internal.sql;

/* loaded from: classes4.dex */
final class SqlTimeTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Time> {
    static final com.google.gson.TypeAdapterFactory FACTORY = new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
            if (typeToken.getRawType() == java.sql.Time.class) {
                return new com.google.gson.internal.sql.SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final java.text.DateFormat format;

    private SqlTimeTypeAdapter() {
        this.format = new java.text.SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public final java.sql.Time read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        java.sql.Time time;
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        java.lang.String nextString = jsonReader.nextString();
        synchronized (this) {
            java.util.TimeZone timeZone = this.format.getTimeZone();
            try {
                try {
                    time = new java.sql.Time(this.format.parse(nextString).getTime());
                } catch (java.text.ParseException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                    sb.append(nextString);
                    sb.append("' as SQL Time; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new com.google.gson.JsonSyntaxException(sb.toString(), e);
                }
            } finally {
                this.format.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.sql.Time time) throws java.io.IOException {
        java.lang.String format;
        if (time == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format = this.format.format((java.util.Date) time);
        }
        jsonWriter.value(format);
    }
}
