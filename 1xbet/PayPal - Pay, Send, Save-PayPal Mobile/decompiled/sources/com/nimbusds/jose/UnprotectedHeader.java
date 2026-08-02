package com.nimbusds.jose;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public final class UnprotectedHeader {
    private final java.util.Map<java.lang.String, java.lang.Object> params;

    private UnprotectedHeader(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.Objects.requireNonNull(map);
        this.params = map;
    }

    public final java.lang.String getKeyID() {
        return (java.lang.String) this.params.get("kid");
    }

    public final java.lang.Object getParam(java.lang.String str) {
        return this.params.get(str);
    }

    public final java.util.Set<java.lang.String> getIncludedParams() {
        return this.params.keySet();
    }

    public final java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
        java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
        newJSONObject.putAll(this.params);
        return newJSONObject;
    }

    public static com.nimbusds.jose.UnprotectedHeader parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        if (map == null) {
            return null;
        }
        com.nimbusds.jose.UnprotectedHeader.Builder builder = new com.nimbusds.jose.UnprotectedHeader.Builder();
        for (java.lang.String str : map.keySet()) {
            builder = builder.param(str, map.get(str));
        }
        return builder.build();
    }

    public static class Builder {
        private final java.util.Map<java.lang.String, java.lang.Object> params = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();

        public com.nimbusds.jose.UnprotectedHeader.Builder keyID(java.lang.String str) {
            this.params.put("kid", str);
            return this;
        }

        public com.nimbusds.jose.UnprotectedHeader.Builder param(java.lang.String str, java.lang.Object obj) {
            this.params.put(str, obj);
            return this;
        }

        public com.nimbusds.jose.UnprotectedHeader build() {
            return new com.nimbusds.jose.UnprotectedHeader(this.params);
        }
    }
}
