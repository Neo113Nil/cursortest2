package com.google.gson.internal.sql;

/* loaded from: classes4.dex */
class SqlTimestampTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Timestamp> {
    static final com.google.gson.TypeAdapterFactory FACTORY = new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
            if (typeToken.getRawType() == java.sql.Timestamp.class) {
                return new com.google.gson.internal.sql.SqlTimestampTypeAdapter(gson.getAdapter(java.util.Date.class));
            }
            return null;
        }
    };
    private final com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter;

    private SqlTimestampTypeAdapter(com.google.gson.TypeAdapter<java.util.Date> typeAdapter) {
        this.dateTypeAdapter = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public java.sql.Timestamp read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        java.util.Date read2 = this.dateTypeAdapter.read2(jsonReader);
        if (read2 != null) {
            return new java.sql.Timestamp(read2.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter jsonWriter, java.sql.Timestamp timestamp) throws java.io.IOException {
        this.dateTypeAdapter.write(jsonWriter, timestamp);
    }
}
