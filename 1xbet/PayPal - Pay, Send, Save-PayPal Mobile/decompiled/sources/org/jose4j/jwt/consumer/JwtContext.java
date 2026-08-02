package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public class JwtContext {
    private java.util.List<org.jose4j.jwx.JsonWebStructure> Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    org.jose4j.jwt.JwtClaims getHighSpeedVideoSizes;

    public JwtContext(org.jose4j.jwt.JwtClaims jwtClaims, java.util.List<org.jose4j.jwx.JsonWebStructure> list) {
        this.getHighSpeedVideoSizes = jwtClaims;
        this.Camera2StreamConfigurationMap = list;
    }

    public JwtContext(java.lang.String str, org.jose4j.jwt.JwtClaims jwtClaims, java.util.List<org.jose4j.jwx.JsonWebStructure> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = jwtClaims;
        this.Camera2StreamConfigurationMap = list;
    }

    public org.jose4j.jwt.JwtClaims getJwtClaims() {
        return this.getHighSpeedVideoSizes;
    }

    public java.util.List<org.jose4j.jwx.JsonWebStructure> getJoseObjects() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getJwt() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
