package com.nimbusds.jose.proc;

/* loaded from: classes10.dex */
public class JOSEMatcher {
    private final java.util.Set<com.nimbusds.jose.Algorithm> algs;
    private final java.util.Set<java.lang.Class<? extends com.nimbusds.jose.JOSEObject>> classes;
    private final java.util.Set<com.nimbusds.jose.EncryptionMethod> encs;
    private final java.util.Set<java.net.URI> jkus;
    private final java.util.Set<java.lang.String> kids;

    public static class Builder {
        private java.util.Set<com.nimbusds.jose.Algorithm> algs;
        private java.util.Set<java.lang.Class<? extends com.nimbusds.jose.JOSEObject>> classes;
        private java.util.Set<com.nimbusds.jose.EncryptionMethod> encs;
        private java.util.Set<java.net.URI> jkus;
        private java.util.Set<java.lang.String> kids;

        public com.nimbusds.jose.proc.JOSEMatcher.Builder joseClass(java.lang.Class<? extends com.nimbusds.jose.JOSEObject> cls) {
            if (cls == null) {
                this.classes = null;
                return this;
            }
            this.classes = new java.util.HashSet(java.util.Collections.singletonList(cls));
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder joseClasses(java.lang.Class<? extends com.nimbusds.jose.JOSEObject>... clsArr) {
            joseClasses(new java.util.HashSet(java.util.Arrays.asList(clsArr)));
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder joseClasses(java.util.Set<java.lang.Class<? extends com.nimbusds.jose.JOSEObject>> set) {
            this.classes = set;
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder algorithm(com.nimbusds.jose.Algorithm algorithm) {
            if (algorithm == null) {
                this.algs = null;
                return this;
            }
            this.algs = new java.util.HashSet(java.util.Collections.singletonList(algorithm));
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder algorithms(com.nimbusds.jose.Algorithm... algorithmArr) {
            algorithms(new java.util.HashSet(java.util.Arrays.asList(algorithmArr)));
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder algorithms(java.util.Set<com.nimbusds.jose.Algorithm> set) {
            this.algs = set;
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder encryptionMethod(com.nimbusds.jose.EncryptionMethod encryptionMethod) {
            if (encryptionMethod == null) {
                this.encs = null;
                return this;
            }
            this.encs = new java.util.HashSet(java.util.Collections.singletonList(encryptionMethod));
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder encryptionMethods(com.nimbusds.jose.EncryptionMethod... encryptionMethodArr) {
            encryptionMethods(new java.util.HashSet(java.util.Arrays.asList(encryptionMethodArr)));
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder encryptionMethods(java.util.Set<com.nimbusds.jose.EncryptionMethod> set) {
            this.encs = set;
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder jwkURL(java.net.URI uri) {
            if (uri == null) {
                this.jkus = null;
                return this;
            }
            this.jkus = new java.util.HashSet(java.util.Collections.singletonList(uri));
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder jwkURLs(java.net.URI... uriArr) {
            jwkURLs(new java.util.HashSet(java.util.Arrays.asList(uriArr)));
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder jwkURLs(java.util.Set<java.net.URI> set) {
            this.jkus = set;
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder keyID(java.lang.String str) {
            if (str == null) {
                this.kids = null;
                return this;
            }
            this.kids = new java.util.HashSet(java.util.Collections.singletonList(str));
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder keyIDs(java.lang.String... strArr) {
            keyIDs(new java.util.HashSet(java.util.Arrays.asList(strArr)));
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher.Builder keyIDs(java.util.Set<java.lang.String> set) {
            this.kids = set;
            return this;
        }

        public com.nimbusds.jose.proc.JOSEMatcher build() {
            return new com.nimbusds.jose.proc.JOSEMatcher(this.classes, this.algs, this.encs, this.jkus, this.kids);
        }
    }

    public JOSEMatcher(java.util.Set<java.lang.Class<? extends com.nimbusds.jose.JOSEObject>> set, java.util.Set<com.nimbusds.jose.Algorithm> set2, java.util.Set<com.nimbusds.jose.EncryptionMethod> set3, java.util.Set<java.net.URI> set4, java.util.Set<java.lang.String> set5) {
        this.classes = set;
        this.algs = set2;
        this.encs = set3;
        this.jkus = set4;
        this.kids = set5;
    }

    public java.util.Set<java.lang.Class<? extends com.nimbusds.jose.JOSEObject>> getJOSEClasses() {
        return this.classes;
    }

    public java.util.Set<com.nimbusds.jose.Algorithm> getAlgorithms() {
        return this.algs;
    }

    public java.util.Set<com.nimbusds.jose.EncryptionMethod> getEncryptionMethods() {
        return this.encs;
    }

    public java.util.Set<java.net.URI> getJWKURLs() {
        return this.jkus;
    }

    public java.util.Set<java.lang.String> getKeyIDs() {
        return this.kids;
    }

    public boolean matches(com.nimbusds.jose.JOSEObject jOSEObject) {
        java.net.URI jwkurl;
        java.util.Set<java.lang.Class<? extends com.nimbusds.jose.JOSEObject>> set = this.classes;
        if (set != null) {
            for (java.lang.Class<? extends com.nimbusds.jose.JOSEObject> cls : set) {
                if (cls == null || !cls.isInstance(jOSEObject)) {
                }
            }
            return false;
        }
        java.util.Set<com.nimbusds.jose.Algorithm> set2 = this.algs;
        if (set2 != null && !set2.contains(jOSEObject.getHeader().getAlgorithm())) {
            return false;
        }
        java.util.Set<com.nimbusds.jose.EncryptionMethod> set3 = this.encs;
        if (set3 != null && (!(jOSEObject instanceof com.nimbusds.jose.JWEObject) || !set3.contains(((com.nimbusds.jose.JWEObject) jOSEObject).getHeader().getEncryptionMethod()))) {
            return false;
        }
        java.lang.String str = null;
        if (this.jkus != null) {
            if (jOSEObject instanceof com.nimbusds.jose.JWSObject) {
                jwkurl = ((com.nimbusds.jose.JWSObject) jOSEObject).getHeader().getJWKURL();
            } else {
                jwkurl = jOSEObject instanceof com.nimbusds.jose.JWEObject ? ((com.nimbusds.jose.JWEObject) jOSEObject).getHeader().getJWKURL() : null;
            }
            if (!this.jkus.contains(jwkurl)) {
                return false;
            }
        }
        if (this.kids == null) {
            return true;
        }
        if (jOSEObject instanceof com.nimbusds.jose.JWSObject) {
            str = ((com.nimbusds.jose.JWSObject) jOSEObject).getHeader().getKeyID();
        } else if (jOSEObject instanceof com.nimbusds.jose.JWEObject) {
            str = ((com.nimbusds.jose.JWEObject) jOSEObject).getHeader().getKeyID();
        }
        return this.kids.contains(str);
    }
}
