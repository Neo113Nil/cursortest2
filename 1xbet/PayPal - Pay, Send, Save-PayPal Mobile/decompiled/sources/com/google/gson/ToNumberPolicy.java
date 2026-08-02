package com.google.gson;

/* loaded from: classes4.dex */
public enum ToNumberPolicy implements com.google.gson.ToNumberStrategy {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.ToNumberStrategy
        public final java.lang.Double readNumber(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            return java.lang.Double.valueOf(jsonReader.nextDouble());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.ToNumberStrategy
        public final java.lang.Number readNumber(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            return new com.google.gson.internal.LazilyParsedNumber(jsonReader.nextString());
        }
    },
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
        @Override // com.google.gson.ToNumberStrategy
        public final java.lang.Number readNumber(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException, com.google.gson.JsonParseException {
            java.lang.String nextString = jsonReader.nextString();
            if (nextString.indexOf(46) >= 0) {
                return parseAsDouble(nextString, jsonReader);
            }
            try {
                return java.lang.Long.valueOf(java.lang.Long.parseLong(nextString));
            } catch (java.lang.NumberFormatException unused) {
                return parseAsDouble(nextString, jsonReader);
            }
        }

        private java.lang.Number parseAsDouble(java.lang.String str, com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            try {
                java.lang.Double valueOf = java.lang.Double.valueOf(str);
                if ((!valueOf.isInfinite() && !valueOf.isNaN()) || jsonReader.isLenient()) {
                    return valueOf;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("JSON forbids NaN and infinities: ");
                sb.append(valueOf);
                sb.append("; at path ");
                sb.append(jsonReader.getPreviousPath());
                throw new com.google.gson.stream.MalformedJsonException(sb.toString());
            } catch (java.lang.NumberFormatException e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Cannot parse ");
                sb2.append(str);
                sb2.append("; at path ");
                sb2.append(jsonReader.getPreviousPath());
                throw new com.google.gson.JsonParseException(sb2.toString(), e);
            }
        }
    },
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.ToNumberStrategy
        public final java.math.BigDecimal readNumber(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            java.lang.String nextString = jsonReader.nextString();
            try {
                return com.google.gson.internal.NumberLimits.parseBigDecimal(nextString);
            } catch (java.lang.NumberFormatException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot parse ");
                sb.append(nextString);
                sb.append("; at path ");
                sb.append(jsonReader.getPreviousPath());
                throw new com.google.gson.JsonParseException(sb.toString(), e);
            }
        }
    }
}
