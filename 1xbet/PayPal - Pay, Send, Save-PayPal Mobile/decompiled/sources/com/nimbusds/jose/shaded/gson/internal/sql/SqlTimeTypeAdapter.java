package com.nimbusds.jose.shaded.gson.internal.sql;

/* loaded from: classes4.dex */
final class SqlTimeTypeAdapter extends com.nimbusds.jose.shaded.gson.TypeAdapter<java.sql.Time> {
    static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory FACTORY = new com.nimbusds.jose.shaded.gson.TypeAdapterFactory() { // from class: com.nimbusds.jose.shaded.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
        public <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
            if (typeToken.getRawType() == java.sql.Time.class) {
                return new com.nimbusds.jose.shaded.gson.internal.sql.SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final java.text.DateFormat format;

    private SqlTimeTypeAdapter() {
        this.format = new java.text.SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public final java.sql.Time read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        java.sql.Time time;
        if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        java.lang.String nextString = jsonReader.nextString();
        try {
            synchronized (this) {
                time = new java.sql.Time(this.format.parse(nextString).getTime());
            }
            return time;
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
            sb.append(nextString);
            sb.append("' as SQL Time; at path ");
            sb.append(jsonReader.getPreviousPath());
            throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb.toString(), e);
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.sql.Time time) throws java.io.IOException {
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
