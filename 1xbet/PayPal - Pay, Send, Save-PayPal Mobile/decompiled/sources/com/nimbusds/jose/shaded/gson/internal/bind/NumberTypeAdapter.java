package com.nimbusds.jose.shaded.gson.internal.bind;

/* loaded from: classes4.dex */
public final class NumberTypeAdapter extends com.nimbusds.jose.shaded.gson.TypeAdapter<java.lang.Number> {
    private static final com.nimbusds.jose.shaded.gson.TypeAdapterFactory LAZILY_PARSED_NUMBER_FACTORY = newFactory(com.nimbusds.jose.shaded.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER);
    private final com.nimbusds.jose.shaded.gson.ToNumberStrategy toNumberStrategy;

    private NumberTypeAdapter(com.nimbusds.jose.shaded.gson.ToNumberStrategy toNumberStrategy) {
        this.toNumberStrategy = toNumberStrategy;
    }

    private static com.nimbusds.jose.shaded.gson.TypeAdapterFactory newFactory(com.nimbusds.jose.shaded.gson.ToNumberStrategy toNumberStrategy) {
        return new com.nimbusds.jose.shaded.gson.TypeAdapterFactory() { // from class: com.nimbusds.jose.shaded.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
            public <T> com.nimbusds.jose.shaded.gson.TypeAdapter<T> create(com.nimbusds.jose.shaded.gson.Gson gson, com.nimbusds.jose.shaded.gson.reflect.TypeToken<T> typeToken) {
                if (typeToken.getRawType() == java.lang.Number.class) {
                    return com.nimbusds.jose.shaded.gson.internal.bind.NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    public static com.nimbusds.jose.shaded.gson.TypeAdapterFactory getFactory(com.nimbusds.jose.shaded.gson.ToNumberStrategy toNumberStrategy) {
        if (toNumberStrategy == com.nimbusds.jose.shaded.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER) {
            return LAZILY_PARSED_NUMBER_FACTORY;
        }
        return newFactory(toNumberStrategy);
    }

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.bind.NumberTypeAdapter$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[com.nimbusds.jose.shaded.gson.stream.JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[com.nimbusds.jose.shaded.gson.stream.JsonToken.NULL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.nimbusds.jose.shaded.gson.stream.JsonToken.NUMBER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.nimbusds.jose.shaded.gson.stream.JsonToken.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Number read2(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        com.nimbusds.jose.shaded.gson.stream.JsonToken peek = jsonReader.peek();
        int i = com.nimbusds.jose.shaded.gson.internal.bind.NumberTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()];
        if (i == 1) {
            jsonReader.nextNull();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.toNumberStrategy.readNumber(jsonReader);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expecting number, got: ");
        sb.append(peek);
        sb.append("; at path ");
        sb.append(jsonReader.getPath());
        throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(sb.toString());
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final void write(com.nimbusds.jose.shaded.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
        jsonWriter.value(number);
    }
}
