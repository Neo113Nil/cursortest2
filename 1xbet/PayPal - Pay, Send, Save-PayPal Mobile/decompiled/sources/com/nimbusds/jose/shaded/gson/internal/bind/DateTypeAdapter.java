package com.nimbusds.jose.shaded.gson.internal.bind;

/* loaded from: classes4.dex */
public final class DateTypeAdapter extends com.nimbusds.jose.shaded.gson.TypeAdapter<java.util.Date> {
    public static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory FACTORY = new com.nimbusds.jose.shaded.gson.TypeAdapterFactory() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.DateTypeAdapter.1
        @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
        public <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
            if (typeToken.getRawType() == java.util.Date.class) {
                return new com.nimbusds.jose.shaded.gson.internal.bind.DateTypeAdapter();
            }
            return null;
        }
    };
    private final java.util.List<java.text.DateFormat> dateFormats;

    public DateTypeAdapter() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.dateFormats = arrayList;
        arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2, java.util.Locale.US));
        if (!java.util.Locale.getDefault().equals(java.util.Locale.US)) {
            arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.nimbusds.jose.shaded.gson.internal.JavaVersion.isJava9OrLater()) {
            arrayList.add(com.nimbusds.jose.shaded.gson.internal.PreJava9DateFormatProvider.getUSDateTimeFormat(2, 2));
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public final java.util.Date read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return deserializeToDate(jsonReader);
    }

    private java.util.Date deserializeToDate(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        java.lang.String nextString = jsonReader.nextString();
        synchronized (this.dateFormats) {
            java.util.Iterator<java.text.DateFormat> it = this.dateFormats.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(nextString);
                } catch (java.text.ParseException unused) {
                }
            }
            try {
                return com.nimbusds.jose.shaded.gson.internal.bind.util.ISO8601Utils.parse(nextString, new java.text.ParsePosition(0));
            } catch (java.text.ParseException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
                sb.append(nextString);
                sb.append("' as Date; at path ");
                sb.append(jsonReader.getPreviousPath());
                throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb.toString(), e);
            }
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.util.Date date) throws java.io.IOException {
        java.lang.String format;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        java.text.DateFormat dateFormat = this.dateFormats.get(0);
        synchronized (this.dateFormats) {
            format = dateFormat.format(date);
        }
        jsonWriter.value(format);
    }
}
