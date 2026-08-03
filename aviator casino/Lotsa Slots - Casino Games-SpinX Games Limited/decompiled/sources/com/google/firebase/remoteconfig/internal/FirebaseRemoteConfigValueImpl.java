package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigValueImpl implements com.google.firebase.remoteconfig.FirebaseRemoteConfigValue {
    private static final java.lang.String ILLEGAL_ARGUMENT_STRING_FORMAT = "[Value: %s] cannot be converted to a %s.";
    private final int source;
    private final java.lang.String value;

    FirebaseRemoteConfigValueImpl(java.lang.String str, int i) {
        this.value = str;
        this.source = i;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public long asLong() {
        if (this.source == 0) {
            return 0L;
        }
        java.lang.String asTrimmedString = asTrimmedString();
        try {
            return java.lang.Long.valueOf(asTrimmedString).longValue();
        } catch (java.lang.NumberFormatException e) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(ILLEGAL_ARGUMENT_STRING_FORMAT, asTrimmedString, com.adjust.sdk.Constants.LONG), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public double asDouble() {
        if (this.source == 0) {
            return 0.0d;
        }
        java.lang.String asTrimmedString = asTrimmedString();
        try {
            return java.lang.Double.valueOf(asTrimmedString).doubleValue();
        } catch (java.lang.NumberFormatException e) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(ILLEGAL_ARGUMENT_STRING_FORMAT, asTrimmedString, "double"), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public java.lang.String asString() {
        if (this.source == 0) {
            return "";
        }
        throwIfNullValue();
        return this.value;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public byte[] asByteArray() {
        if (this.source == 0) {
            return com.google.firebase.remoteconfig.FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
        }
        return this.value.getBytes(com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING);
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public boolean asBoolean() throws java.lang.IllegalArgumentException {
        if (this.source == 0) {
            return false;
        }
        java.lang.String asTrimmedString = asTrimmedString();
        if (com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.TRUE_REGEX.matcher(asTrimmedString).matches()) {
            return true;
        }
        if (com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.FALSE_REGEX.matcher(asTrimmedString).matches()) {
            return false;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(ILLEGAL_ARGUMENT_STRING_FORMAT, asTrimmedString, "boolean"));
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public int getSource() {
        return this.source;
    }

    private void throwIfNullValue() {
        if (this.value == null) {
            throw new java.lang.IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    private java.lang.String asTrimmedString() {
        return asString().trim();
    }
}
