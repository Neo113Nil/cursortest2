package com.nimbusds.jose.shaded.gson.internal.sql;

/* loaded from: classes4.dex */
class SqlTimestampTypeAdapter extends com.nimbusds.jose.shaded.gson.TypeAdapter<java.sql.Timestamp> {
    static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory FACTORY = new com.nimbusds.jose.shaded.gson.TypeAdapterFactory() { // from class: com.nimbusds.jose.shaded.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
        public <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
            if (typeToken.getRawType() == java.sql.Timestamp.class) {
                return new com.nimbusds.jose.shaded.gson.internal.sql.SqlTimestampTypeAdapter(gson.getAdapter(java.util.Date.class));
            }
            return null;
        }
    };
    private final com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Date> dateTypeAdapter;

    private SqlTimestampTypeAdapter(com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Date> typeAdapter) {
        this.dateTypeAdapter = typeAdapter;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public java.sql.Timestamp read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        java.util.Date read2 = this.dateTypeAdapter.read2(jsonReader);
        if (read2 != null) {
            return new java.sql.Timestamp(read2.getTime());
        }
        return null;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.sql.Timestamp timestamp) throws java.io.IOException {
        this.dateTypeAdapter.write(jsonWriter, timestamp);
    }
}
