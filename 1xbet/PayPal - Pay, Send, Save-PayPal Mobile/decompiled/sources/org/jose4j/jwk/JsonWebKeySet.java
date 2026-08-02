package org.jose4j.jwk;

/* loaded from: classes18.dex */
public class JsonWebKeySet {
    private static final org.slf4j.Logger Camera2StreamConfigurationMap = org.slf4j.LoggerFactory.getLogger((java.lang.Class<?>) org.jose4j.jwk.JsonWebKeySet.class);
    public static final java.lang.String JWK_SET_MEMBER_NAME = "keys";
    private java.util.List<org.jose4j.jwk.JsonWebKey> getHighSpeedVideoFpsRangesFor;

    public JsonWebKeySet(java.lang.String str) throws org.jose4j.lang.JoseException {
        java.util.List<java.util.Map> list = (java.util.List) org.jose4j.json.JsonUtil.parseJson(str).get(JWK_SET_MEMBER_NAME);
        if (list == null) {
            throw new org.jose4j.lang.JoseException("The JSON JWKS content does not include the keys member.");
        }
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(list.size());
        for (java.util.Map map : list) {
            try {
                this.getHighSpeedVideoFpsRangesFor.add(org.jose4j.jwk.JsonWebKey.Factory.newJwk((java.util.Map<java.lang.String, java.lang.Object>) map));
            } catch (java.lang.Exception e) {
                Camera2StreamConfigurationMap.debug("Ignoring an individual JWK in a JWKS due to a problem processing it ({}). JWK params: {} and the full JWKS content: {}.", org.jose4j.lang.ExceptionHelp.toStringWithCauses(e), map, str);
            }
        }
    }

    public JsonWebKeySet(org.jose4j.jwk.JsonWebKey... jsonWebKeyArr) {
        this((java.util.List<? extends org.jose4j.jwk.JsonWebKey>) java.util.Arrays.asList(jsonWebKeyArr));
    }

    public JsonWebKeySet(java.util.List<? extends org.jose4j.jwk.JsonWebKey> list) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(list.size());
        java.util.Iterator<? extends org.jose4j.jwk.JsonWebKey> it = list.iterator();
        while (it.hasNext()) {
            this.getHighSpeedVideoFpsRangesFor.add(it.next());
        }
    }

    public void addJsonWebKey(org.jose4j.jwk.JsonWebKey jsonWebKey) {
        this.getHighSpeedVideoFpsRangesFor.add(jsonWebKey);
    }

    public java.util.List<org.jose4j.jwk.JsonWebKey> getJsonWebKeys() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.jose4j.jwk.JsonWebKey findJsonWebKey(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.util.List<org.jose4j.jwk.JsonWebKey> findJsonWebKeys = findJsonWebKeys(str, str2, str3, str4);
        if (findJsonWebKeys.isEmpty()) {
            return null;
        }
        return findJsonWebKeys.iterator().next();
    }

    public java.util.List<org.jose4j.jwk.JsonWebKey> findJsonWebKeys(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (org.jose4j.jwk.JsonWebKey jsonWebKey : this.getHighSpeedVideoFpsRangesFor) {
            boolean equals = str != null ? str.equals(jsonWebKey.getKeyId()) : true;
            if (str3 != null) {
                equals &= str3.equals(jsonWebKey.getUse());
            }
            if (str2 != null) {
                equals &= str2.equals(jsonWebKey.getKeyType());
            }
            if (str4 != null) {
                equals &= str4.equals(jsonWebKey.getAlgorithm());
            }
            if (equals) {
                arrayList.add(jsonWebKey);
            }
        }
        return arrayList;
    }

    public java.lang.String toJson() {
        return toJson(org.jose4j.jwk.JsonWebKey.OutputControlLevel.INCLUDE_SYMMETRIC);
    }

    public java.lang.String toJson(org.jose4j.jwk.JsonWebKey.OutputControlLevel outputControlLevel) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor.size());
        java.util.Iterator<org.jose4j.jwk.JsonWebKey> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toParams(outputControlLevel));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(JWK_SET_MEMBER_NAME, arrayList);
        return org.jose4j.json.JsonUtil.toJson(linkedHashMap);
    }
}
