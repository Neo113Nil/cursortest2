package com.google.gson.internal.sql;

/* loaded from: classes4.dex */
final class SqlDateTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Date> {
    static final com.google.gson.TypeAdapterFactory FACTORY = new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
            if (typeToken.getRawType() == java.sql.Date.class) {
                return new com.google.gson.internal.sql.SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final java.text.DateFormat format;

    private SqlDateTypeAdapter() {
        this.format = new java.text.SimpleDateFormat(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TRANSACTION_DATE_WITH_YEAR_FORMAT);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public final java.sql.Date read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        java.sql.Date date;
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        java.lang.String nextString = jsonReader.nextString();
        synchronized (this) {
            java.util.TimeZone timeZone = this.format.getTimeZone();
            try {
                try {
                    date = new java.sql.Date(this.format.parse(nextString).getTime());
                } catch (java.text.ParseException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                    sb.append(nextString);
                    sb.append("' as SQL Date; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new com.google.gson.JsonSyntaxException(sb.toString(), e);
                }
            } finally {
                this.format.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.sql.Date date) throws java.io.IOException {
        java.lang.String format;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format = this.format.format((java.util.Date) date);
        }
        jsonWriter.value(format);
    }
}
