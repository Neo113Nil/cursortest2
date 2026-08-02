package com.nimbusds.jose.jwk;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public class JWKSet implements java.io.Serializable {
    public static final java.lang.String MIME_TYPE = "application/jwk-set+json; charset=UTF-8";
    private static final long serialVersionUID = 1;
    private final java.util.Map<java.lang.String, java.lang.Object> customMembers;
    private final java.util.List<com.nimbusds.jose.jwk.JWK> keys;

    public JWKSet() {
        this((java.util.List<com.nimbusds.jose.jwk.JWK>) java.util.Collections.emptyList());
    }

    public JWKSet(com.nimbusds.jose.jwk.JWK jwk) {
        this((java.util.List<com.nimbusds.jose.jwk.JWK>) java.util.Collections.singletonList(jwk));
        if (jwk == null) {
            throw new java.lang.IllegalArgumentException("The JWK must not be null");
        }
    }

    public JWKSet(java.util.List<com.nimbusds.jose.jwk.JWK> list) {
        this(list, java.util.Collections.emptyMap());
    }

    public JWKSet(java.util.List<com.nimbusds.jose.jwk.JWK> list, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("The JWK list must not be null");
        }
        this.keys = java.util.Collections.unmodifiableList(list);
        this.customMembers = java.util.Collections.unmodifiableMap(map);
    }

    public java.util.List<com.nimbusds.jose.jwk.JWK> getKeys() {
        return this.keys;
    }

    public boolean isEmpty() {
        return this.keys.isEmpty();
    }

    public int size() {
        return this.keys.size();
    }

    public com.nimbusds.jose.jwk.JWK getKeyByKeyId(java.lang.String str) {
        for (com.nimbusds.jose.jwk.JWK jwk : getKeys()) {
            if (jwk.getKeyID() != null && jwk.getKeyID().equals(str)) {
                return jwk;
            }
        }
        return null;
    }

    public boolean containsJWK(com.nimbusds.jose.jwk.JWK jwk) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.util.Base64URL computeThumbprint = jwk.computeThumbprint();
        java.util.Iterator<com.nimbusds.jose.jwk.JWK> it = getKeys().iterator();
        while (it.hasNext()) {
            if (computeThumbprint.equals(it.next().computeThumbprint())) {
                return true;
            }
        }
        return false;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getAdditionalMembers() {
        return this.customMembers;
    }

    public com.nimbusds.jose.jwk.JWKSet toPublicJWKSet() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator<com.nimbusds.jose.jwk.JWK> it = this.keys.iterator();
        while (it.hasNext()) {
            com.nimbusds.jose.jwk.JWK publicJWK = it.next().toPublicJWK();
            if (publicJWK != null) {
                linkedList.add(publicJWK);
            }
        }
        return new com.nimbusds.jose.jwk.JWKSet(linkedList, this.customMembers);
    }

    public com.nimbusds.jose.jwk.JWKSet filter(com.nimbusds.jose.jwk.JWKMatcher jWKMatcher) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (com.nimbusds.jose.jwk.JWK jwk : this.keys) {
            if (jWKMatcher.matches(jwk)) {
                linkedList.add(jwk);
            }
        }
        return new com.nimbusds.jose.jwk.JWKSet(linkedList, this.customMembers);
    }

    public java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
        return toJSONObject(true);
    }

    public java.util.Map<java.lang.String, java.lang.Object> toJSONObject(boolean z) {
        java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
        newJSONObject.putAll(this.customMembers);
        java.util.List<java.lang.Object> newJSONArray = com.nimbusds.jose.util.JSONArrayUtils.newJSONArray();
        for (com.nimbusds.jose.jwk.JWK jwk : this.keys) {
            if (z) {
                com.nimbusds.jose.jwk.JWK publicJWK = jwk.toPublicJWK();
                if (publicJWK != null) {
                    newJSONArray.add(publicJWK.toJSONObject());
                }
            } else {
                newJSONArray.add(jwk.toJSONObject());
            }
        }
        newJSONObject.put(org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, newJSONArray);
        return newJSONObject;
    }

    public java.lang.String toString(boolean z) {
        return com.nimbusds.jose.util.JSONObjectUtils.toJSONString(toJSONObject(z));
    }

    public java.lang.String toString() {
        return toString(true);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.nimbusds.jose.jwk.JWKSet)) {
            return false;
        }
        com.nimbusds.jose.jwk.JWKSet jWKSet = (com.nimbusds.jose.jwk.JWKSet) obj;
        return getKeys().equals(jWKSet.getKeys()) && this.customMembers.equals(jWKSet.customMembers);
    }

    public int hashCode() {
        return java.util.Objects.hash(getKeys(), this.customMembers);
    }

    public static com.nimbusds.jose.jwk.JWKSet parse(java.lang.String str) throws java.text.ParseException {
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str));
    }

    public static com.nimbusds.jose.jwk.JWKSet parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        java.util.List<java.lang.Object> jSONArray = com.nimbusds.jose.util.JSONObjectUtils.getJSONArray(map, org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME);
        if (jSONArray == null) {
            throw new java.text.ParseException("Missing required \"keys\" member", 0);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i = 0; i < jSONArray.size(); i++) {
            try {
                linkedList.add(com.nimbusds.jose.jwk.JWK.parse((java.util.Map<java.lang.String, java.lang.Object>) jSONArray.get(i)));
            } catch (java.lang.ClassCastException unused) {
                throw new java.text.ParseException("The \"keys\" JSON array must contain JSON objects only", 0);
            } catch (java.text.ParseException e) {
                if (e.getMessage() == null || !e.getMessage().startsWith("Unsupported key type")) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid JWK at position ");
                    sb.append(i);
                    sb.append(": ");
                    sb.append(e.getMessage());
                    throw new java.text.ParseException(sb.toString(), 0);
                }
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            if (entry.getKey() != null && !entry.getKey().equals(org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME)) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new com.nimbusds.jose.jwk.JWKSet(linkedList, hashMap);
    }

    public static com.nimbusds.jose.jwk.JWKSet load(java.io.InputStream inputStream) throws java.io.IOException, java.text.ParseException {
        return parse(com.nimbusds.jose.util.IOUtils.readInputStreamToString(inputStream, com.nimbusds.jose.util.StandardCharset.UTF_8));
    }

    public static com.nimbusds.jose.jwk.JWKSet load(java.io.File file) throws java.io.IOException, java.text.ParseException {
        return parse(com.nimbusds.jose.util.IOUtils.readFileToString(file, com.nimbusds.jose.util.StandardCharset.UTF_8));
    }

    public static com.nimbusds.jose.jwk.JWKSet load(java.net.URL url, int i, int i2, int i3) throws java.io.IOException, java.text.ParseException {
        return load(url, i, i2, i3, null);
    }

    public static com.nimbusds.jose.jwk.JWKSet load(java.net.URL url, int i, int i2, int i3, java.net.Proxy proxy) throws java.io.IOException, java.text.ParseException {
        com.nimbusds.jose.util.DefaultResourceRetriever defaultResourceRetriever = new com.nimbusds.jose.util.DefaultResourceRetriever(i, i2, i3);
        defaultResourceRetriever.setProxy(proxy);
        return parse(defaultResourceRetriever.retrieveResource(url).getContent());
    }

    public static com.nimbusds.jose.jwk.JWKSet load(java.net.URL url) throws java.io.IOException, java.text.ParseException {
        return load(url, 0, 0, 0);
    }

    public static com.nimbusds.jose.jwk.JWKSet load(java.security.KeyStore keyStore, com.nimbusds.jose.jwk.PasswordLookup passwordLookup) throws java.security.KeyStoreException {
        com.nimbusds.jose.jwk.ECKey load;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Enumeration<java.lang.String> aliases = keyStore.aliases();
        while (aliases.hasMoreElements()) {
            java.lang.String nextElement = aliases.nextElement();
            char[] charArray = passwordLookup == null ? "".toCharArray() : passwordLookup.lookupPassword(nextElement);
            java.security.cert.Certificate certificate = keyStore.getCertificate(nextElement);
            if (certificate != null) {
                if (certificate.getPublicKey() instanceof java.security.interfaces.RSAPublicKey) {
                    try {
                        com.nimbusds.jose.jwk.RSAKey load2 = com.nimbusds.jose.jwk.RSAKey.load(keyStore, nextElement, charArray);
                        if (load2 != null) {
                            linkedList.add(load2);
                        }
                    } catch (com.nimbusds.jose.JOSEException unused) {
                    }
                } else if ((certificate.getPublicKey() instanceof java.security.interfaces.ECPublicKey) && (load = com.nimbusds.jose.jwk.ECKey.load(keyStore, nextElement, charArray)) != null) {
                    linkedList.add(load);
                }
            }
        }
        java.util.Enumeration<java.lang.String> aliases2 = keyStore.aliases();
        while (aliases2.hasMoreElements()) {
            java.lang.String nextElement2 = aliases2.nextElement();
            try {
                com.nimbusds.jose.jwk.OctetSequenceKey load3 = com.nimbusds.jose.jwk.OctetSequenceKey.load(keyStore, nextElement2, passwordLookup == null ? "".toCharArray() : passwordLookup.lookupPassword(nextElement2));
                if (load3 != null) {
                    linkedList.add(load3);
                }
            } catch (com.nimbusds.jose.JOSEException unused2) {
            }
        }
        return new com.nimbusds.jose.jwk.JWKSet(linkedList);
    }
}
