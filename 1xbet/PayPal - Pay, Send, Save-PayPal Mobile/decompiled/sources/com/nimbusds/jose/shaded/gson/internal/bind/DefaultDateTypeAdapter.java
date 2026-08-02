package com.nimbusds.jose.shaded.gson.internal.bind;

/* loaded from: classes4.dex */
public final class DefaultDateTypeAdapter<T extends java.util.Date> extends com.nimbusds.jose.shaded.gson.TypeAdapter<T> {
    private static final java.lang.String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final java.util.List<java.text.DateFormat> dateFormats;
    private final com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> dateType;

    public static abstract class DateType<T extends java.util.Date> {
        public static final com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter.DateType<java.util.Date> DATE = new com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter.DateType<java.util.Date>(java.util.Date.class) { // from class: com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter.DateType.1
            @Override // com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter.DateType
            protected java.util.Date deserialize(java.util.Date date) {
                return date;
            }
        };
        private final java.lang.Class<T> dateClass;

        protected abstract T deserialize(java.util.Date date);

        public DateType(java.lang.Class<T> cls) {
            this.dateClass = cls;
        }

        private com.nimbusds.jose.shaded.gson.TypeAdapterFactory createFactory(com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters.newFactory(this.dateClass, defaultDateTypeAdapter);
        }

        public final com.nimbusds.jose.shaded.gson.TypeAdapterFactory createAdapterFactory(java.lang.String str) {
            return createFactory(new com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter<>(this, str));
        }

        public final com.nimbusds.jose.shaded.gson.TypeAdapterFactory createAdapterFactory(int i) {
            return createFactory(new com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter<>(this, i));
        }

        public final com.nimbusds.jose.shaded.gson.TypeAdapterFactory createAdapterFactory(int i, int i2) {
            return createFactory(new com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter<>(this, i, i2));
        }

        public final com.nimbusds.jose.shaded.gson.TypeAdapterFactory createDefaultsAdapterFactory() {
            int i = 2;
            return createFactory(new com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter<>(this, i, i));
        }
    }

    private DefaultDateTypeAdapter(com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> dateType, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.dateFormats = arrayList;
        this.dateType = (com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter.DateType) java.util.Objects.requireNonNull(dateType);
        arrayList.add(new java.text.SimpleDateFormat(str, java.util.Locale.US));
        if (java.util.Locale.getDefault().equals(java.util.Locale.US)) {
            return;
        }
        arrayList.add(new java.text.SimpleDateFormat(str));
    }

    private DefaultDateTypeAdapter(com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> dateType, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.dateFormats = arrayList;
        this.dateType = (com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter.DateType) java.util.Objects.requireNonNull(dateType);
        arrayList.add(java.text.DateFormat.getDateInstance(i, java.util.Locale.US));
        if (!java.util.Locale.getDefault().equals(java.util.Locale.US)) {
            arrayList.add(java.text.DateFormat.getDateInstance(i));
        }
        if (com.nimbusds.jose.shaded.gson.internal.JavaVersion.isJava9OrLater()) {
            arrayList.add(com.nimbusds.jose.shaded.gson.internal.PreJava9DateFormatProvider.getUSDateFormat(i));
        }
    }

    private DefaultDateTypeAdapter(com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> dateType, int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.dateFormats = arrayList;
        this.dateType = (com.nimbusds.jose.shaded.gson.internal.bind.DefaultDateTypeAdapter.DateType) java.util.Objects.requireNonNull(dateType);
        arrayList.add(java.text.DateFormat.getDateTimeInstance(i, i2, java.util.Locale.US));
        if (!java.util.Locale.getDefault().equals(java.util.Locale.US)) {
            arrayList.add(java.text.DateFormat.getDateTimeInstance(i, i2));
        }
        if (com.nimbusds.jose.shaded.gson.internal.JavaVersion.isJava9OrLater()) {
            arrayList.add(com.nimbusds.jose.shaded.gson.internal.PreJava9DateFormatProvider.getUSDateTimeFormat(i, i2));
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

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    /* renamed from: read */
    public final T read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.dateType.deserialize(deserializeToDate(jsonReader));
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

    public final java.lang.String toString() {
        java.text.DateFormat dateFormat = this.dateFormats.get(0);
        if (dateFormat instanceof java.text.SimpleDateFormat) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DefaultDateTypeAdapter(");
            sb.append(((java.text.SimpleDateFormat) dateFormat).toPattern());
            sb.append(')');
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("DefaultDateTypeAdapter(");
        sb2.append(dateFormat.getClass().getSimpleName());
        sb2.append(')');
        return sb2.toString();
    }
}
