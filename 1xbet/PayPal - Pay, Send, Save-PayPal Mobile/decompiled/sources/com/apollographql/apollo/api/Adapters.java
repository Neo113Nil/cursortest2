package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\u0007\u001a;\u0010\u000e\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\b\b\u0000\u0010\u0000*\u00020\u0010*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001d\u0010\u0004\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001e\u0010\u0004\u001a%\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001f\u0010\u0004\"\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u00018\u0006¢\u0006\u0006\n\u0004\b \u0010!\"\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0006¢\u0006\u0006\n\u0004\b#\u0010!\"\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0006¢\u0006\u0006\n\u0004\b%\u0010!\"\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0006¢\u0006\u0006\n\u0004\b'\u0010!\"\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00018\u0006¢\u0006\u0006\n\u0004\b)\u0010!\"\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0006¢\u0006\u0006\n\u0004\b*\u0010!\"\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0006¢\u0006\f\n\u0004\b+\u0010!\u0012\u0004\b,\u0010-\"\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00018\u0006¢\u0006\u0006\n\u0004\b/\u0010!\"\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0006¢\u0006\u0006\n\u0004\b0\u00101\"\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020$0\u00118\u0006¢\u0006\u0006\n\u0004\b2\u00101\"\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\"0\u00118\u0006¢\u0006\u0006\n\u0004\b3\u00101\"\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u00170\u00118\u0006¢\u0006\u0006\n\u0004\b4\u00101\"\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\u00118\u0006¢\u0006\u0006\n\u0004\b5\u00101\"\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\f068\u0006¢\u0006\u0006\n\u0004\b7\u00108\"\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020$068\u0006¢\u0006\u0006\n\u0004\b9\u00108\"\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\"068\u0006¢\u0006\u0006\n\u0004\b:\u00108\"\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0017068\u0006¢\u0006\u0006\n\u0004\b;\u00108\"\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0010068\u0006¢\u0006\u0006\n\u0004\b<\u00108"}, d2 = {"T", "Lcom/apollographql/apollo/api/Adapter;", "", "-array", "(Lcom/apollographql/apollo/api/Adapter;)Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/PresentAdapter;", "-optional", "(Lcom/apollographql/apollo/api/Adapter;)Lcom/apollographql/apollo/api/PresentAdapter;", "-present", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "indent", "-toJson", "(Lcom/apollographql/apollo/api/Adapter;Ljava/lang/Object;Lcom/apollographql/apollo/api/CustomScalarAdapters;Ljava/lang/String;)Ljava/lang/String;", "", "Lcom/apollographql/apollo/api/NullableAdapter;", "-nullable", "(Lcom/apollographql/apollo/api/Adapter;)Lcom/apollographql/apollo/api/NullableAdapter;", "Lcom/apollographql/apollo/api/ListAdapter;", "-list", "(Lcom/apollographql/apollo/api/Adapter;)Lcom/apollographql/apollo/api/ListAdapter;", "", "buffered", "Lcom/apollographql/apollo/api/ObjectAdapter;", "-obj", "(Lcom/apollographql/apollo/api/Adapter;Z)Lcom/apollographql/apollo/api/ObjectAdapter;", "Lcom/apollographql/apollo/api/FieldResult;", "-catchToResult", "-errorAware", "-catchToNull", "StringAdapter", "Lcom/apollographql/apollo/api/Adapter;", "", "IntAdapter", "", "DoubleAdapter", "", "FloatAdapter", "", "LongAdapter", "BooleanAdapter", "AnyAdapter", "getAnyAdapter$annotations", "()V", "Lcom/apollographql/apollo/api/Upload;", "UploadAdapter", "NullableStringAdapter", "Lcom/apollographql/apollo/api/NullableAdapter;", "NullableDoubleAdapter", "NullableIntAdapter", "NullableBooleanAdapter", "NullableAnyAdapter", "Lcom/apollographql/apollo/api/ApolloOptionalAdapter;", "ApolloOptionalStringAdapter", "Lcom/apollographql/apollo/api/ApolloOptionalAdapter;", "ApolloOptionalDoubleAdapter", "ApolloOptionalIntAdapter", "ApolloOptionalBooleanAdapter", "ApolloOptionalAnyAdapter"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Adapters {
    public static final com.apollographql.apollo.api.Adapter<java.lang.Object> AnyAdapter;
    public static final com.apollographql.apollo.api.ApolloOptionalAdapter<java.lang.Object> ApolloOptionalAnyAdapter;
    public static final com.apollographql.apollo.api.ApolloOptionalAdapter<java.lang.Boolean> ApolloOptionalBooleanAdapter;
    public static final com.apollographql.apollo.api.ApolloOptionalAdapter<java.lang.Double> ApolloOptionalDoubleAdapter;
    public static final com.apollographql.apollo.api.ApolloOptionalAdapter<java.lang.Integer> ApolloOptionalIntAdapter;
    public static final com.apollographql.apollo.api.ApolloOptionalAdapter<java.lang.String> ApolloOptionalStringAdapter;
    public static final com.apollographql.apollo.api.Adapter<java.lang.Boolean> BooleanAdapter;
    public static final com.apollographql.apollo.api.Adapter<java.lang.Double> DoubleAdapter;
    public static final com.apollographql.apollo.api.Adapter<java.lang.Float> FloatAdapter;
    public static final com.apollographql.apollo.api.Adapter<java.lang.Integer> IntAdapter;
    public static final com.apollographql.apollo.api.Adapter<java.lang.Long> LongAdapter;
    public static final com.apollographql.apollo.api.NullableAdapter<java.lang.Object> NullableAnyAdapter;
    public static final com.apollographql.apollo.api.NullableAdapter<java.lang.Boolean> NullableBooleanAdapter;
    public static final com.apollographql.apollo.api.NullableAdapter<java.lang.Double> NullableDoubleAdapter;
    public static final com.apollographql.apollo.api.NullableAdapter<java.lang.Integer> NullableIntAdapter;
    public static final com.apollographql.apollo.api.NullableAdapter<java.lang.String> NullableStringAdapter;
    public static final com.apollographql.apollo.api.Adapter<java.lang.String> StringAdapter;
    public static final com.apollographql.apollo.api.Adapter<com.apollographql.apollo.api.Upload> UploadAdapter;

    public static /* synthetic */ void getAnyAdapter$annotations() {
    }

    static {
        com.apollographql.apollo.api.Adapter<java.lang.String> adapter = new com.apollographql.apollo.api.Adapter<java.lang.String>() { // from class: com.apollographql.apollo.api.Adapters$StringAdapter$1
            @Override // com.apollographql.apollo.api.Adapter
            public final java.lang.String fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                java.lang.String nextString = reader.nextString();
                kotlin.jvm.internal.Intrinsics.checkNotNull(nextString);
                return nextString;
            }

            @Override // com.apollographql.apollo.api.Adapter
            public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                writer.value(value);
            }
        };
        StringAdapter = adapter;
        com.apollographql.apollo.api.Adapter<java.lang.Integer> adapter2 = new com.apollographql.apollo.api.Adapter<java.lang.Integer>() { // from class: com.apollographql.apollo.api.Adapters$IntAdapter$1
            @Override // com.apollographql.apollo.api.Adapter
            public final /* synthetic */ void toJson(com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.Integer num) {
                toJson(jsonWriter, customScalarAdapters, num.intValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.Adapter
            public final java.lang.Integer fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                return java.lang.Integer.valueOf(reader.nextInt());
            }

            public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, int value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                writer.value(value);
            }
        };
        IntAdapter = adapter2;
        com.apollographql.apollo.api.Adapter<java.lang.Double> adapter3 = new com.apollographql.apollo.api.Adapter<java.lang.Double>() { // from class: com.apollographql.apollo.api.Adapters$DoubleAdapter$1
            @Override // com.apollographql.apollo.api.Adapter
            public final /* synthetic */ void toJson(com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.Double d) {
                toJson(jsonWriter, customScalarAdapters, d.doubleValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.Adapter
            public final java.lang.Double fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                return java.lang.Double.valueOf(reader.nextDouble());
            }

            public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, double value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                writer.value(value);
            }
        };
        DoubleAdapter = adapter3;
        FloatAdapter = new com.apollographql.apollo.api.Adapter<java.lang.Float>() { // from class: com.apollographql.apollo.api.Adapters$FloatAdapter$1
            @Override // com.apollographql.apollo.api.Adapter
            public final /* synthetic */ void toJson(com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.Float f) {
                toJson(jsonWriter, customScalarAdapters, f.floatValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.Adapter
            public final java.lang.Float fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                return java.lang.Float.valueOf((float) reader.nextDouble());
            }

            public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, float value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                writer.value(value);
            }
        };
        LongAdapter = new com.apollographql.apollo.api.Adapter<java.lang.Long>() { // from class: com.apollographql.apollo.api.Adapters$LongAdapter$1
            @Override // com.apollographql.apollo.api.Adapter
            public final /* synthetic */ void toJson(com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.Long l) {
                toJson(jsonWriter, customScalarAdapters, l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.Adapter
            public final java.lang.Long fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                return java.lang.Long.valueOf(reader.nextLong());
            }

            public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, long value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                writer.value(value);
            }
        };
        com.apollographql.apollo.api.Adapter<java.lang.Boolean> adapter4 = new com.apollographql.apollo.api.Adapter<java.lang.Boolean>() { // from class: com.apollographql.apollo.api.Adapters$BooleanAdapter$1
            @Override // com.apollographql.apollo.api.Adapter
            public final /* synthetic */ void toJson(com.apollographql.apollo.api.json.JsonWriter jsonWriter, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.Boolean bool) {
                toJson(jsonWriter, customScalarAdapters, bool.booleanValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.Adapter
            public final java.lang.Boolean fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                return java.lang.Boolean.valueOf(reader.nextBoolean());
            }

            public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                writer.value(value);
            }
        };
        BooleanAdapter = adapter4;
        com.apollographql.apollo.api.Adapter<java.lang.Object> adapter5 = new com.apollographql.apollo.api.Adapter<java.lang.Object>() { // from class: com.apollographql.apollo.api.Adapters$AnyAdapter$1
            public final java.lang.Object fromJson(com.apollographql.apollo.api.json.JsonReader reader) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
                java.lang.Object readAny = com.apollographql.apollo.api.json.JsonReaders.readAny(reader);
                kotlin.jvm.internal.Intrinsics.checkNotNull(readAny);
                return readAny;
            }

            public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, java.lang.Object value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                com.apollographql.apollo.api.json.JsonWriters.writeAny(writer, value);
            }

            @Override // com.apollographql.apollo.api.Adapter
            public final java.lang.Object fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                return fromJson(reader);
            }

            @Override // com.apollographql.apollo.api.Adapter
            public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.Object value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                toJson(writer, value);
            }
        };
        AnyAdapter = adapter5;
        UploadAdapter = new com.apollographql.apollo.api.Adapter<com.apollographql.apollo.api.Upload>() { // from class: com.apollographql.apollo.api.Adapters$UploadAdapter$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.apollographql.apollo.api.Adapter
            public final com.apollographql.apollo.api.Upload fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                throw new java.lang.IllegalStateException("File Upload used in output position".toString());
            }

            @Override // com.apollographql.apollo.api.Adapter
            public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.api.Upload value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                writer.value(value);
            }
        };
        NullableStringAdapter = m9938nullable(adapter);
        NullableDoubleAdapter = m9938nullable(adapter3);
        NullableIntAdapter = m9938nullable(adapter2);
        NullableBooleanAdapter = m9938nullable(adapter4);
        NullableAnyAdapter = m9938nullable(adapter5);
        ApolloOptionalStringAdapter = new com.apollographql.apollo.api.ApolloOptionalAdapter<>(adapter);
        ApolloOptionalDoubleAdapter = new com.apollographql.apollo.api.ApolloOptionalAdapter<>(adapter3);
        ApolloOptionalIntAdapter = new com.apollographql.apollo.api.ApolloOptionalAdapter<>(adapter2);
        ApolloOptionalBooleanAdapter = new com.apollographql.apollo.api.ApolloOptionalAdapter<>(adapter4);
        ApolloOptionalAnyAdapter = new com.apollographql.apollo.api.ApolloOptionalAdapter<>(adapter5);
    }

    /* renamed from: -array, reason: not valid java name */
    public static final /* synthetic */ <T> com.apollographql.apollo.api.Adapter<T[]> m9933array(final com.apollographql.apollo.api.Adapter<T> adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return new com.apollographql.apollo.api.Adapter<T[]>() { // from class: com.apollographql.apollo.api.Adapters$array$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.Adapter
            public final T[] fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                com.apollographql.apollo.api.Adapter<T> adapter2 = adapter;
                reader.beginArray();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (reader.hasNext()) {
                    arrayList.add(adapter2.fromJson(reader, customScalarAdapters));
                }
                reader.endArray();
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "T?");
                return (T[]) arrayList.toArray(new java.lang.Object[0]);
            }

            @Override // com.apollographql.apollo.api.Adapter
            public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, T[] value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                com.apollographql.apollo.api.Adapter<T> adapter2 = adapter;
                writer.beginArray();
                for (T t : value) {
                    adapter2.toJson(writer, customScalarAdapters, t);
                }
                writer.endArray();
            }
        };
    }

    @kotlin.Deprecated(message = "Use present instead", replaceWith = @kotlin.ReplaceWith(expression = "present()", imports = {}))
    /* renamed from: -optional, reason: not valid java name */
    public static final <T> com.apollographql.apollo.api.PresentAdapter<T> m9941optional(com.apollographql.apollo.api.Adapter<T> adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        return new com.apollographql.apollo.api.PresentAdapter<>(adapter);
    }

    /* renamed from: -present, reason: not valid java name */
    public static final <T> com.apollographql.apollo.api.PresentAdapter<T> m9942present(com.apollographql.apollo.api.Adapter<T> adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        return new com.apollographql.apollo.api.PresentAdapter<>(adapter);
    }

    /* renamed from: -toJson$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m9946toJson$default(com.apollographql.apollo.api.Adapter adapter, java.lang.Object obj, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.String str, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            customScalarAdapters = com.apollographql.apollo.api.CustomScalarAdapters.Empty;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return m9945toJson(adapter, obj, customScalarAdapters, str);
    }

    /* renamed from: -nullable, reason: not valid java name */
    public static final <T> com.apollographql.apollo.api.NullableAdapter<T> m9938nullable(com.apollographql.apollo.api.Adapter<T> adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        return new com.apollographql.apollo.api.NullableAdapter<>(adapter);
    }

    /* renamed from: -list, reason: not valid java name */
    public static final <T> com.apollographql.apollo.api.ListAdapter<T> m9937list(com.apollographql.apollo.api.Adapter<T> adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        return new com.apollographql.apollo.api.ListAdapter<>(adapter);
    }

    /* renamed from: -obj$default, reason: not valid java name */
    public static /* synthetic */ com.apollographql.apollo.api.ObjectAdapter m9940obj$default(com.apollographql.apollo.api.Adapter adapter, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m9939obj(adapter, z);
    }

    /* renamed from: -obj, reason: not valid java name */
    public static final <T> com.apollographql.apollo.api.ObjectAdapter<T> m9939obj(com.apollographql.apollo.api.Adapter<T> adapter, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        return new com.apollographql.apollo.api.ObjectAdapter<>(adapter, z);
    }

    /* renamed from: -catchToResult, reason: not valid java name */
    public static final <T> com.apollographql.apollo.api.Adapter<com.apollographql.apollo.api.FieldResult<T>> m9935catchToResult(com.apollographql.apollo.api.Adapter<T> adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        return new com.apollographql.apollo.api.CatchToResultAdapter(adapter);
    }

    /* renamed from: -errorAware, reason: not valid java name */
    public static final <T> com.apollographql.apollo.api.Adapter<T> m9936errorAware(com.apollographql.apollo.api.Adapter<T> adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        return new com.apollographql.apollo.api.ErrorAwareAdapter(adapter);
    }

    /* renamed from: -catchToNull, reason: not valid java name */
    public static final <T> com.apollographql.apollo.api.Adapter<T> m9934catchToNull(com.apollographql.apollo.api.Adapter<T> adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        return new com.apollographql.apollo.api.CatchToNullAdapter(adapter);
    }

    /* renamed from: -toJson, reason: not valid java name */
    public static final <T> java.lang.String m9945toJson(com.apollographql.apollo.api.Adapter<T> adapter, T t, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        okio.Buffer buffer = new okio.Buffer();
        adapter.toJson(new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, str), customScalarAdapters, t);
        return buffer.readUtf8();
    }

    /* renamed from: -toJson, reason: not valid java name */
    public static final <T> java.lang.String m9944toJson(com.apollographql.apollo.api.Adapter<T> adapter, T t, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        return m9946toJson$default(adapter, t, customScalarAdapters, null, 4, null);
    }

    /* renamed from: -toJson, reason: not valid java name */
    public static final <T> java.lang.String m9943toJson(com.apollographql.apollo.api.Adapter<T> adapter, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "");
        return m9946toJson$default(adapter, t, null, null, 6, null);
    }
}
