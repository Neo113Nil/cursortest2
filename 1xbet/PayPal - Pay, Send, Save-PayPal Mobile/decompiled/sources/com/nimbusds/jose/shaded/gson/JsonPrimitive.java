package com.nimbusds.jose.shaded.gson;

/* loaded from: classes4.dex */
public final class JsonPrimitive extends com.nimbusds.jose.shaded.gson.JsonElement {
    private final java.lang.Object value;

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final com.nimbusds.jose.shaded.gson.JsonPrimitive deepCopy() {
        return this;
    }

    public JsonPrimitive(java.lang.Boolean bool) {
        this.value = java.util.Objects.requireNonNull(bool);
    }

    public JsonPrimitive(java.lang.Number number) {
        this.value = java.util.Objects.requireNonNull(number);
    }

    public JsonPrimitive(java.lang.String str) {
        this.value = java.util.Objects.requireNonNull(str);
    }

    public JsonPrimitive(java.lang.Character ch) {
        this.value = ((java.lang.Character) java.util.Objects.requireNonNull(ch)).toString();
    }

    public final boolean isBoolean() {
        return this.value instanceof java.lang.Boolean;
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final boolean getAsBoolean() {
        if (isBoolean()) {
            return ((java.lang.Boolean) this.value).booleanValue();
        }
        return java.lang.Boolean.parseBoolean(getAsString());
    }

    public final boolean isNumber() {
        return this.value instanceof java.lang.Number;
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final java.lang.Number getAsNumber() {
        java.lang.Object obj = this.value;
        if (obj instanceof java.lang.Number) {
            return (java.lang.Number) obj;
        }
        if (obj instanceof java.lang.String) {
            return new com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber((java.lang.String) obj);
        }
        throw new java.lang.UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final boolean isString() {
        return this.value instanceof java.lang.String;
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final java.lang.String getAsString() {
        java.lang.Object obj = this.value;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (isNumber()) {
            return getAsNumber().toString();
        }
        if (isBoolean()) {
            return ((java.lang.Boolean) this.value).toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected value type: ");
        sb.append(this.value.getClass());
        throw new java.lang.AssertionError(sb.toString());
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final double getAsDouble() {
        return isNumber() ? getAsNumber().doubleValue() : java.lang.Double.parseDouble(getAsString());
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final java.math.BigDecimal getAsBigDecimal() {
        java.lang.Object obj = this.value;
        return obj instanceof java.math.BigDecimal ? (java.math.BigDecimal) obj : new java.math.BigDecimal(getAsString());
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final java.math.BigInteger getAsBigInteger() {
        java.lang.Object obj = this.value;
        return obj instanceof java.math.BigInteger ? (java.math.BigInteger) obj : new java.math.BigInteger(getAsString());
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final float getAsFloat() {
        return isNumber() ? getAsNumber().floatValue() : java.lang.Float.parseFloat(getAsString());
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final long getAsLong() {
        return isNumber() ? getAsNumber().longValue() : java.lang.Long.parseLong(getAsString());
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final short getAsShort() {
        return isNumber() ? getAsNumber().shortValue() : java.lang.Short.parseShort(getAsString());
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final int getAsInt() {
        return isNumber() ? getAsNumber().intValue() : java.lang.Integer.parseInt(getAsString());
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    public final byte getAsByte() {
        return isNumber() ? getAsNumber().byteValue() : java.lang.Byte.parseByte(getAsString());
    }

    @Override // com.nimbusds.jose.shaded.gson.JsonElement
    @java.lang.Deprecated
    public final char getAsCharacter() {
        java.lang.String asString = getAsString();
        if (asString.isEmpty()) {
            throw new java.lang.UnsupportedOperationException("String value is empty");
        }
        return asString.charAt(0);
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.value == null) {
            return 31;
        }
        if (isIntegral(this)) {
            doubleToLongBits = getAsNumber().longValue();
        } else {
            java.lang.Object obj = this.value;
            if (obj instanceof java.lang.Number) {
                doubleToLongBits = java.lang.Double.doubleToLongBits(getAsNumber().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.nimbusds.jose.shaded.gson.JsonPrimitive jsonPrimitive = (com.nimbusds.jose.shaded.gson.JsonPrimitive) obj;
        if (this.value == null) {
            return jsonPrimitive.value == null;
        }
        if (isIntegral(this) && isIntegral(jsonPrimitive)) {
            return getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue();
        }
        java.lang.Object obj2 = this.value;
        if ((obj2 instanceof java.lang.Number) && (jsonPrimitive.value instanceof java.lang.Number)) {
            double doubleValue = getAsNumber().doubleValue();
            double doubleValue2 = jsonPrimitive.getAsNumber().doubleValue();
            return doubleValue == doubleValue2 || (java.lang.Double.isNaN(doubleValue) && java.lang.Double.isNaN(doubleValue2));
        }
        return obj2.equals(jsonPrimitive.value);
    }

    private static boolean isIntegral(com.nimbusds.jose.shaded.gson.JsonPrimitive jsonPrimitive) {
        java.lang.Object obj = jsonPrimitive.value;
        if (!(obj instanceof java.lang.Number)) {
            return false;
        }
        java.lang.Number number = (java.lang.Number) obj;
        return (number instanceof java.math.BigInteger) || (number instanceof java.lang.Long) || (number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte);
    }
}
