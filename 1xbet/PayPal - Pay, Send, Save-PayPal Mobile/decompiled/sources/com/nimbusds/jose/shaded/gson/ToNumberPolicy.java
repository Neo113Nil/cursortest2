package com.nimbusds.jose.shaded.gson;

/* loaded from: classes4.dex */
public enum ToNumberPolicy implements com.nimbusds.jose.shaded.gson.ToNumberStrategy {
    DOUBLE { // from class: com.nimbusds.jose.shaded.gson.ToNumberPolicy.1
        @Override // com.nimbusds.jose.shaded.gson.ToNumberStrategy
        public final java.lang.Double readNumber(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            return java.lang.Double.valueOf(jsonReader.nextDouble());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.nimbusds.jose.shaded.gson.ToNumberPolicy.2
        @Override // com.nimbusds.jose.shaded.gson.ToNumberStrategy
        public final java.lang.Number readNumber(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            return new com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber(jsonReader.nextString());
        }
    },
    LONG_OR_DOUBLE { // from class: com.nimbusds.jose.shaded.gson.ToNumberPolicy.3
        @Override // com.nimbusds.jose.shaded.gson.ToNumberStrategy
        public final java.lang.Number readNumber(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException, com.nimbusds.jose.shaded.gson.JsonParseException {
            java.lang.String nextString = jsonReader.nextString();
            try {
                try {
                    return java.lang.Long.valueOf(java.lang.Long.parseLong(nextString));
                } catch (java.lang.NumberFormatException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot parse ");
                    sb.append(nextString);
                    sb.append("; at path ");
                    sb.append(jsonReader.getPreviousPath());
                    throw new com.nimbusds.jose.shaded.gson.JsonParseException(sb.toString(), e);
                }
            } catch (java.lang.NumberFormatException unused) {
                java.lang.Double valueOf = java.lang.Double.valueOf(nextString);
                if ((!valueOf.isInfinite() && !valueOf.isNaN()) || jsonReader.isLenient()) {
                    return valueOf;
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("JSON forbids NaN and infinities: ");
                sb2.append(valueOf);
                sb2.append("; at path ");
                sb2.append(jsonReader.getPreviousPath());
                throw new com.nimbusds.jose.shaded.gson.stream.MalformedJsonException(sb2.toString());
            }
        }
    },
    BIG_DECIMAL { // from class: com.nimbusds.jose.shaded.gson.ToNumberPolicy.4
        @Override // com.nimbusds.jose.shaded.gson.ToNumberStrategy
        public final java.math.BigDecimal readNumber(com.nimbusds.jose.shaded.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            java.lang.String nextString = jsonReader.nextString();
            try {
                return new java.math.BigDecimal(nextString);
            } catch (java.lang.NumberFormatException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot parse ");
                sb.append(nextString);
                sb.append("; at path ");
                sb.append(jsonReader.getPreviousPath());
                throw new com.nimbusds.jose.shaded.gson.JsonParseException(sb.toString(), e);
            }
        }
    }
}
