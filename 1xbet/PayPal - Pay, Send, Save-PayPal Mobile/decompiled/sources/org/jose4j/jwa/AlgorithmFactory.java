package org.jose4j.jwa;

/* loaded from: classes18.dex */
public class AlgorithmFactory<A extends org.jose4j.jwa.Algorithm> {
    private final org.slf4j.Logger Camera2StreamConfigurationMap;
    private final java.util.Map<java.lang.String, A> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    public AlgorithmFactory(java.lang.String str, java.lang.Class<A> cls) {
        this.getHighSpeedVideoFpsRangesFor = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append("->");
        sb.append(cls.getSimpleName());
        this.Camera2StreamConfigurationMap = org.slf4j.LoggerFactory.getLogger(sb.toString());
    }

    public A getAlgorithm(java.lang.String str) throws org.jose4j.lang.InvalidAlgorithmException {
        A a2 = this.getHighResolutionOutputSizeshNQ4ISI.get(str);
        if (a2 != null) {
            return a2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" is an unknown, unsupported or unavailable ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(" algorithm (not one of ");
        sb.append(getSupportedAlgorithms());
        sb.append(").");
        throw new org.jose4j.lang.InvalidAlgorithmException(sb.toString());
    }

    public boolean isAvailable(java.lang.String str) {
        return this.getHighResolutionOutputSizeshNQ4ISI.containsKey(str);
    }

    public java.util.Set<java.lang.String> getSupportedAlgorithms() {
        return java.util.Collections.unmodifiableSet(this.getHighResolutionOutputSizeshNQ4ISI.keySet());
    }

    public void registerAlgorithm(A a2) {
        java.lang.String algorithmIdentifier = a2.getAlgorithmIdentifier();
        if (Camera2StreamConfigurationMap(a2)) {
            this.getHighResolutionOutputSizeshNQ4ISI.put(algorithmIdentifier, a2);
            this.Camera2StreamConfigurationMap.debug("{} registered for {} algorithm {}", a2, this.getHighSpeedVideoFpsRangesFor, algorithmIdentifier);
        } else {
            this.Camera2StreamConfigurationMap.debug("{} is unavailable so will not be registered for {} algorithms.", algorithmIdentifier, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    private boolean Camera2StreamConfigurationMap(A a2) {
        try {
            return a2.isAvailable();
        } catch (java.lang.Throwable th) {
            org.slf4j.Logger logger = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected problem checking for availability of ");
            sb.append(a2.getAlgorithmIdentifier());
            sb.append(" algorithm: ");
            sb.append(org.jose4j.lang.ExceptionHelp.toStringWithCauses(th));
            logger.debug(sb.toString());
            return false;
        }
    }

    public void unregisterAlgorithm(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI.remove(str);
    }
}
