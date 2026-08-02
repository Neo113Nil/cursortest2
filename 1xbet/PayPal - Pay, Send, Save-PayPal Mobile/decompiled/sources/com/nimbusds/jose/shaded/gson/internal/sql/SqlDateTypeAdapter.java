package com.nimbusds.jose.shaded.gson.internal.sql;

/* loaded from: classes4.dex */
final class SqlDateTypeAdapter extends com.nimbusds.jose.shaded.gson.TypeAdapter<java.sql.Date> {
    static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory FACTORY = new com.nimbusds.jose.shaded.gson.TypeAdapterFactory() { // from class: com.nimbusds.jose.shaded.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
        public <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
            if (typeToken.getRawType() == java.sql.Date.class) {
                return new com.nimbusds.jose.shaded.gson.internal.sql.SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final java.text.DateFormat format;

    private SqlDateTypeAdapter() {
        this.format = new java.text.SimpleDateFormat(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TRANSACTION_DATE_WITH_YEAR_FORMAT);
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public final java.sql.Date read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        java.util.Date parse;
        if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        java.lang.String nextString = jsonReader.nextString();
        try {
            synchronized (this) {
                parse = this.format.parse(nextString);
            }
            return new java.sql.Date(parse.getTime());
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
            sb.append(nextString);
            sb.append("' as SQL Date; at path ");
            sb.append(jsonReader.getPreviousPath());
            throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb.toString(), e);
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.sql.Date date) throws java.io.IOException {
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
