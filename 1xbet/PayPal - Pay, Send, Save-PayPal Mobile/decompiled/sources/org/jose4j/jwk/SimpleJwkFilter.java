package org.jose4j.jwk;

/* loaded from: classes18.dex */
public class SimpleJwkFilter {
    public static boolean OMITTED_OKAY = true;
    public static boolean VALUE_REQUIRED = false;
    private static final java.lang.String[] getHighSpeedVideoFpsRanges = new java.lang.String[2];
    private org.jose4j.jwk.SimpleJwkFilter.Criteria Camera2StreamConfigurationMap;
    private org.jose4j.jwk.SimpleJwkFilter.MultiValueCriteria getHighResolutionOutputSizeshNQ4ISI;
    private org.jose4j.jwk.SimpleJwkFilter.MultiValueCriteria getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private org.jose4j.jwk.SimpleJwkFilter.Criteria getHighSpeedVideoSizesFor;
    private org.jose4j.jwk.SimpleJwkFilter.Criteria getInputFormats;
    private org.jose4j.jwk.SimpleJwkFilter.Criteria getInputSizeshNQ4ISI;
    private org.jose4j.jwk.SimpleJwkFilter.Criteria getOutputFormats;
    private org.jose4j.jwk.SimpleJwkFilter.Criteria getOutputMinFrameDuration;

    public void setKid(java.lang.String str, boolean z) {
        this.getHighSpeedVideoSizesFor = new org.jose4j.jwk.SimpleJwkFilter.Criteria(str, z, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setKty(java.lang.String str) {
        this.getInputSizeshNQ4ISI = new org.jose4j.jwk.SimpleJwkFilter.Criteria(str, false, 0 == true ? 1 : 0);
    }

    public void setUse(java.lang.String str, boolean z) {
        this.getInputFormats = new org.jose4j.jwk.SimpleJwkFilter.Criteria(str, z, (byte) 0);
    }

    public void setKeyOperations(java.lang.String[] strArr, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = new org.jose4j.jwk.SimpleJwkFilter.MultiValueCriteria(strArr, z, (byte) 0);
    }

    public void setAlg(java.lang.String str, boolean z) {
        this.Camera2StreamConfigurationMap = new org.jose4j.jwk.SimpleJwkFilter.Criteria(str, z, (byte) 0);
    }

    public void setX5t(java.lang.String str, boolean z) {
        this.getOutputMinFrameDuration = new org.jose4j.jwk.SimpleJwkFilter.Criteria(str, z, (byte) 0);
    }

    public void setX5tS256(java.lang.String str, boolean z) {
        this.getOutputFormats = new org.jose4j.jwk.SimpleJwkFilter.Criteria(str, z, (byte) 0);
    }

    public void setAllowFallbackDeriveFromX5cForX5Thumbs(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public void setCrv(java.lang.String str, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.jose4j.jwk.SimpleJwkFilter.MultiValueCriteria(new java.lang.String[]{str}, z, (byte) 0);
    }

    public void setCrvs(java.lang.String[] strArr, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.jose4j.jwk.SimpleJwkFilter.MultiValueCriteria(strArr, z, (byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<org.jose4j.jwk.JsonWebKey> filter(java.util.Collection<org.jose4j.jwk.JsonWebKey> collection) {
        boolean z;
        org.jose4j.jwk.SimpleJwkFilter.Criteria criteria;
        boolean z2;
        org.jose4j.jwk.SimpleJwkFilter.Criteria criteria2;
        boolean z3;
        org.jose4j.jwk.SimpleJwkFilter.Criteria criteria3;
        boolean z4;
        java.lang.String[] strArr;
        org.jose4j.jwk.SimpleJwkFilter.Criteria criteria4;
        boolean z5;
        org.jose4j.jwk.SimpleJwkFilter.Criteria criteria5;
        boolean z6;
        org.jose4j.jwk.SimpleJwkFilter.MultiValueCriteria multiValueCriteria;
        boolean z7;
        org.jose4j.jwk.SimpleJwkFilter.MultiValueCriteria multiValueCriteria2;
        java.lang.String subtype;
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        boolean equals6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (org.jose4j.jwk.JsonWebKey jsonWebKey : collection) {
            org.jose4j.jwk.SimpleJwkFilter.Criteria criteria6 = this.getHighSpeedVideoSizesFor;
            java.lang.String keyId = jsonWebKey.getKeyId();
            if (criteria6 != null) {
                if (keyId == null) {
                    equals6 = criteria6.getHighSpeedVideoFpsRangesFor;
                } else {
                    equals6 = keyId.equals(criteria6.Camera2StreamConfigurationMap);
                }
                if (!equals6) {
                    z = false;
                    criteria = this.getInputSizeshNQ4ISI;
                    java.lang.String keyType = jsonWebKey.getKeyType();
                    if (criteria != null) {
                        if (keyType == null) {
                            equals5 = criteria.getHighSpeedVideoFpsRangesFor;
                        } else {
                            equals5 = keyType.equals(criteria.Camera2StreamConfigurationMap);
                        }
                        if (!equals5) {
                            z2 = false;
                            criteria2 = this.getInputFormats;
                            java.lang.String use = jsonWebKey.getUse();
                            if (criteria2 != null) {
                                if (use == null) {
                                    equals4 = criteria2.getHighSpeedVideoFpsRangesFor;
                                } else {
                                    equals4 = use.equals(criteria2.Camera2StreamConfigurationMap);
                                }
                                if (!equals4) {
                                    z3 = false;
                                    criteria3 = this.Camera2StreamConfigurationMap;
                                    java.lang.String algorithm = jsonWebKey.getAlgorithm();
                                    if (criteria3 != null) {
                                        if (algorithm == null) {
                                            equals3 = criteria3.getHighSpeedVideoFpsRangesFor;
                                        } else {
                                            equals3 = algorithm.equals(criteria3.Camera2StreamConfigurationMap);
                                        }
                                        if (!equals3) {
                                            z4 = false;
                                            boolean z8 = this.getHighSpeedVideoSizes;
                                            if ((this.getOutputMinFrameDuration == null || this.getOutputFormats != null) && (jsonWebKey instanceof org.jose4j.jwk.PublicJsonWebKey)) {
                                                org.jose4j.jwk.PublicJsonWebKey publicJsonWebKey = (org.jose4j.jwk.PublicJsonWebKey) jsonWebKey;
                                                strArr = new java.lang.String[]{publicJsonWebKey.getX509CertificateSha1Thumbprint(z8), publicJsonWebKey.getX509CertificateSha256Thumbprint(z8)};
                                            } else {
                                                strArr = getHighSpeedVideoFpsRanges;
                                            }
                                            criteria4 = this.getOutputMinFrameDuration;
                                            java.lang.String str = strArr[0];
                                            if (criteria4 != null) {
                                                if (str == null) {
                                                    equals2 = criteria4.getHighSpeedVideoFpsRangesFor;
                                                } else {
                                                    equals2 = str.equals(criteria4.Camera2StreamConfigurationMap);
                                                }
                                                if (!equals2) {
                                                    z5 = false;
                                                    criteria5 = this.getOutputFormats;
                                                    java.lang.String str2 = strArr[1];
                                                    if (criteria5 != null) {
                                                        if (str2 == null) {
                                                            equals = criteria5.getHighSpeedVideoFpsRangesFor;
                                                        } else {
                                                            equals = str2.equals(criteria5.Camera2StreamConfigurationMap);
                                                        }
                                                        if (!equals) {
                                                            z6 = false;
                                                            multiValueCriteria = this.getHighResolutionOutputSizeshNQ4ISI;
                                                            if (multiValueCriteria != null) {
                                                                if (jsonWebKey instanceof org.jose4j.jwk.EllipticCurveJsonWebKey) {
                                                                    subtype = ((org.jose4j.jwk.EllipticCurveJsonWebKey) jsonWebKey).getCurveName();
                                                                } else {
                                                                    subtype = jsonWebKey instanceof org.jose4j.jwk.OctetKeyPairJsonWebKey ? ((org.jose4j.jwk.OctetKeyPairJsonWebKey) jsonWebKey).getSubtype() : null;
                                                                }
                                                                if (!multiValueCriteria.getHighSpeedVideoSizes(java.util.Collections.singletonList(subtype))) {
                                                                    z7 = false;
                                                                    multiValueCriteria2 = this.getHighSpeedVideoFpsRangesFor;
                                                                    if (!(z & z2 & z3 & z4 & z5 & z6 & z7 & (multiValueCriteria2 != null || multiValueCriteria2.getHighSpeedVideoSizes(jsonWebKey.getKeyOps())))) {
                                                                        arrayList.add(jsonWebKey);
                                                                    }
                                                                }
                                                            }
                                                            z7 = true;
                                                            multiValueCriteria2 = this.getHighSpeedVideoFpsRangesFor;
                                                            if (!(z & z2 & z3 & z4 & z5 & z6 & z7 & (multiValueCriteria2 != null || multiValueCriteria2.getHighSpeedVideoSizes(jsonWebKey.getKeyOps())))) {
                                                            }
                                                        }
                                                    }
                                                    z6 = true;
                                                    multiValueCriteria = this.getHighResolutionOutputSizeshNQ4ISI;
                                                    if (multiValueCriteria != null) {
                                                    }
                                                    z7 = true;
                                                    multiValueCriteria2 = this.getHighSpeedVideoFpsRangesFor;
                                                    if (!(z & z2 & z3 & z4 & z5 & z6 & z7 & (multiValueCriteria2 != null || multiValueCriteria2.getHighSpeedVideoSizes(jsonWebKey.getKeyOps())))) {
                                                    }
                                                }
                                            }
                                            z5 = true;
                                            criteria5 = this.getOutputFormats;
                                            java.lang.String str22 = strArr[1];
                                            if (criteria5 != null) {
                                            }
                                            z6 = true;
                                            multiValueCriteria = this.getHighResolutionOutputSizeshNQ4ISI;
                                            if (multiValueCriteria != null) {
                                            }
                                            z7 = true;
                                            multiValueCriteria2 = this.getHighSpeedVideoFpsRangesFor;
                                            if (!(z & z2 & z3 & z4 & z5 & z6 & z7 & (multiValueCriteria2 != null || multiValueCriteria2.getHighSpeedVideoSizes(jsonWebKey.getKeyOps())))) {
                                            }
                                        }
                                    }
                                    z4 = true;
                                    boolean z82 = this.getHighSpeedVideoSizes;
                                    if (this.getOutputMinFrameDuration == null) {
                                    }
                                    org.jose4j.jwk.PublicJsonWebKey publicJsonWebKey2 = (org.jose4j.jwk.PublicJsonWebKey) jsonWebKey;
                                    strArr = new java.lang.String[]{publicJsonWebKey2.getX509CertificateSha1Thumbprint(z82), publicJsonWebKey2.getX509CertificateSha256Thumbprint(z82)};
                                    criteria4 = this.getOutputMinFrameDuration;
                                    java.lang.String str3 = strArr[0];
                                    if (criteria4 != null) {
                                    }
                                    z5 = true;
                                    criteria5 = this.getOutputFormats;
                                    java.lang.String str222 = strArr[1];
                                    if (criteria5 != null) {
                                    }
                                    z6 = true;
                                    multiValueCriteria = this.getHighResolutionOutputSizeshNQ4ISI;
                                    if (multiValueCriteria != null) {
                                    }
                                    z7 = true;
                                    multiValueCriteria2 = this.getHighSpeedVideoFpsRangesFor;
                                    if (!(z & z2 & z3 & z4 & z5 & z6 & z7 & (multiValueCriteria2 != null || multiValueCriteria2.getHighSpeedVideoSizes(jsonWebKey.getKeyOps())))) {
                                    }
                                }
                            }
                            z3 = true;
                            criteria3 = this.Camera2StreamConfigurationMap;
                            java.lang.String algorithm2 = jsonWebKey.getAlgorithm();
                            if (criteria3 != null) {
                            }
                            z4 = true;
                            boolean z822 = this.getHighSpeedVideoSizes;
                            if (this.getOutputMinFrameDuration == null) {
                            }
                            org.jose4j.jwk.PublicJsonWebKey publicJsonWebKey22 = (org.jose4j.jwk.PublicJsonWebKey) jsonWebKey;
                            strArr = new java.lang.String[]{publicJsonWebKey22.getX509CertificateSha1Thumbprint(z822), publicJsonWebKey22.getX509CertificateSha256Thumbprint(z822)};
                            criteria4 = this.getOutputMinFrameDuration;
                            java.lang.String str32 = strArr[0];
                            if (criteria4 != null) {
                            }
                            z5 = true;
                            criteria5 = this.getOutputFormats;
                            java.lang.String str2222 = strArr[1];
                            if (criteria5 != null) {
                            }
                            z6 = true;
                            multiValueCriteria = this.getHighResolutionOutputSizeshNQ4ISI;
                            if (multiValueCriteria != null) {
                            }
                            z7 = true;
                            multiValueCriteria2 = this.getHighSpeedVideoFpsRangesFor;
                            if (!(z & z2 & z3 & z4 & z5 & z6 & z7 & (multiValueCriteria2 != null || multiValueCriteria2.getHighSpeedVideoSizes(jsonWebKey.getKeyOps())))) {
                            }
                        }
                    }
                    z2 = true;
                    criteria2 = this.getInputFormats;
                    java.lang.String use2 = jsonWebKey.getUse();
                    if (criteria2 != null) {
                    }
                    z3 = true;
                    criteria3 = this.Camera2StreamConfigurationMap;
                    java.lang.String algorithm22 = jsonWebKey.getAlgorithm();
                    if (criteria3 != null) {
                    }
                    z4 = true;
                    boolean z8222 = this.getHighSpeedVideoSizes;
                    if (this.getOutputMinFrameDuration == null) {
                    }
                    org.jose4j.jwk.PublicJsonWebKey publicJsonWebKey222 = (org.jose4j.jwk.PublicJsonWebKey) jsonWebKey;
                    strArr = new java.lang.String[]{publicJsonWebKey222.getX509CertificateSha1Thumbprint(z8222), publicJsonWebKey222.getX509CertificateSha256Thumbprint(z8222)};
                    criteria4 = this.getOutputMinFrameDuration;
                    java.lang.String str322 = strArr[0];
                    if (criteria4 != null) {
                    }
                    z5 = true;
                    criteria5 = this.getOutputFormats;
                    java.lang.String str22222 = strArr[1];
                    if (criteria5 != null) {
                    }
                    z6 = true;
                    multiValueCriteria = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (multiValueCriteria != null) {
                    }
                    z7 = true;
                    multiValueCriteria2 = this.getHighSpeedVideoFpsRangesFor;
                    if (!(z & z2 & z3 & z4 & z5 & z6 & z7 & (multiValueCriteria2 != null || multiValueCriteria2.getHighSpeedVideoSizes(jsonWebKey.getKeyOps())))) {
                    }
                }
            }
            z = true;
            criteria = this.getInputSizeshNQ4ISI;
            java.lang.String keyType2 = jsonWebKey.getKeyType();
            if (criteria != null) {
            }
            z2 = true;
            criteria2 = this.getInputFormats;
            java.lang.String use22 = jsonWebKey.getUse();
            if (criteria2 != null) {
            }
            z3 = true;
            criteria3 = this.Camera2StreamConfigurationMap;
            java.lang.String algorithm222 = jsonWebKey.getAlgorithm();
            if (criteria3 != null) {
            }
            z4 = true;
            boolean z82222 = this.getHighSpeedVideoSizes;
            if (this.getOutputMinFrameDuration == null) {
            }
            org.jose4j.jwk.PublicJsonWebKey publicJsonWebKey2222 = (org.jose4j.jwk.PublicJsonWebKey) jsonWebKey;
            strArr = new java.lang.String[]{publicJsonWebKey2222.getX509CertificateSha1Thumbprint(z82222), publicJsonWebKey2222.getX509CertificateSha256Thumbprint(z82222)};
            criteria4 = this.getOutputMinFrameDuration;
            java.lang.String str3222 = strArr[0];
            if (criteria4 != null) {
            }
            z5 = true;
            criteria5 = this.getOutputFormats;
            java.lang.String str222222 = strArr[1];
            if (criteria5 != null) {
            }
            z6 = true;
            multiValueCriteria = this.getHighResolutionOutputSizeshNQ4ISI;
            if (multiValueCriteria != null) {
            }
            z7 = true;
            multiValueCriteria2 = this.getHighSpeedVideoFpsRangesFor;
            if (!(z & z2 & z3 & z4 & z5 & z6 & z7 & (multiValueCriteria2 != null || multiValueCriteria2.getHighSpeedVideoSizes(jsonWebKey.getKeyOps())))) {
            }
        }
        return arrayList;
    }

    static class Criteria {
        java.lang.String Camera2StreamConfigurationMap;
        boolean getHighSpeedVideoFpsRangesFor;

        /* synthetic */ Criteria(java.lang.String str, boolean z, byte b) {
            this(str, z);
        }

        private Criteria(java.lang.String str, boolean z) {
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRangesFor = z;
        }
    }

    static class MultiValueCriteria {
        boolean getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String[] getHighSpeedVideoFpsRanges;

        /* synthetic */ MultiValueCriteria(java.lang.String[] strArr, boolean z, byte b) {
            this(strArr, z);
        }

        private MultiValueCriteria(java.lang.String[] strArr, boolean z) {
            this.getHighSpeedVideoFpsRanges = strArr;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }

        public final boolean getHighSpeedVideoSizes(java.util.List<java.lang.String> list) {
            if (list == null) {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }
            for (java.lang.String str : this.getHighSpeedVideoFpsRanges) {
                if (list.contains(str)) {
                    return true;
                }
            }
            return false;
        }
    }
}
