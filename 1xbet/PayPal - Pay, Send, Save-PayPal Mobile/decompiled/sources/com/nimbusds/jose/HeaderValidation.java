package com.nimbusds.jose;

/* loaded from: classes10.dex */
class HeaderValidation {
    static void ensureDisjoint(com.nimbusds.jose.Header header, com.nimbusds.jose.UnprotectedHeader unprotectedHeader) throws com.nimbusds.jose.IllegalHeaderException {
        if (header == null || unprotectedHeader == null) {
            return;
        }
        java.util.Iterator<java.lang.String> it = unprotectedHeader.getIncludedParams().iterator();
        while (it.hasNext()) {
            if (header.getIncludedParams().contains(it.next())) {
                throw new com.nimbusds.jose.IllegalHeaderException("The parameters in the protected header and the unprotected header must be disjoint");
            }
        }
    }

    private HeaderValidation() {
    }
}
