package com.nimbusds.jose.util;

/* loaded from: classes4.dex */
public class X509CertChainUtils {
    public static java.util.List<com.nimbusds.jose.util.Base64> toBase64List(java.util.List<java.lang.Object> list) throws java.text.ParseException {
        if (list == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i = 0; i < list.size(); i++) {
            java.lang.Object obj = list.get(i);
            if (obj == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The X.509 certificate at position ");
                sb.append(i);
                sb.append(" must not be null");
                throw new java.text.ParseException(sb.toString(), 0);
            }
            if (!(obj instanceof java.lang.String)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The X.509 certificate at position ");
                sb2.append(i);
                sb2.append(" must be encoded as a Base64 string");
                throw new java.text.ParseException(sb2.toString(), 0);
            }
            linkedList.add(new com.nimbusds.jose.util.Base64((java.lang.String) obj));
        }
        return linkedList;
    }

    public static java.util.List<java.security.cert.X509Certificate> parse(java.util.List<com.nimbusds.jose.util.Base64> list) throws java.text.ParseException {
        if (list == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                java.security.cert.X509Certificate parse = com.nimbusds.jose.util.X509CertUtils.parse(list.get(i).decode());
                if (parse == null) {
                    throw new java.text.ParseException("Invalid X.509 certificate at position ".concat(java.lang.String.valueOf(i)), 0);
                }
                linkedList.add(parse);
            }
        }
        return linkedList;
    }

    public static java.util.List<java.security.cert.X509Certificate> parse(java.io.File file) throws java.io.IOException, java.security.cert.CertificateException {
        return parse(new java.lang.String(java.nio.file.Files.readAllBytes(file.toPath()), com.nimbusds.jose.util.StandardCharset.UTF_8));
    }

    public static java.util.List<java.security.cert.X509Certificate> parse(java.lang.String str) throws java.io.IOException, java.security.cert.CertificateException {
        java.lang.Object readObject;
        org.bouncycastle.openssl.PEMParser pEMParser = new org.bouncycastle.openssl.PEMParser(new java.io.StringReader(str));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        do {
            readObject = pEMParser.readObject();
            if (readObject instanceof org.bouncycastle.cert.X509CertificateHolder) {
                linkedList.add(com.nimbusds.jose.util.X509CertUtils.parseWithException(((org.bouncycastle.cert.X509CertificateHolder) readObject).getEncoded()));
            }
        } while (readObject != null);
        return linkedList;
    }

    public static java.util.List<java.util.UUID> store(java.security.KeyStore keyStore, java.util.List<java.security.cert.X509Certificate> list) throws java.security.KeyStoreException {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.security.cert.X509Certificate x509Certificate : list) {
            java.util.UUID randomUUID = java.util.UUID.randomUUID();
            keyStore.setCertificateEntry(randomUUID.toString(), x509Certificate);
            linkedList.add(randomUUID);
        }
        return linkedList;
    }

    private X509CertChainUtils() {
    }
}
