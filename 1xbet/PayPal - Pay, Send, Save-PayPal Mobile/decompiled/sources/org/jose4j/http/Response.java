package org.jose4j.http;

/* loaded from: classes18.dex */
public class Response implements org.jose4j.http.SimpleResponse {
    private java.lang.String Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHighSpeedVideoFpsRanges = new java.util.HashMap();
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    public Response(int i, java.lang.String str, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, java.lang.String str2) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = str;
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            this.getHighSpeedVideoFpsRanges.put(key != null ? key.toLowerCase().trim() : null, entry.getValue());
        }
        this.Camera2StreamConfigurationMap = str2;
    }

    @Override // org.jose4j.http.SimpleResponse
    public int getStatusCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.jose4j.http.SimpleResponse
    public java.lang.String getStatusMessage() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.jose4j.http.SimpleResponse
    public java.util.Collection<java.lang.String> getHeaderNames() {
        return this.getHighSpeedVideoFpsRanges.keySet();
    }

    @Override // org.jose4j.http.SimpleResponse
    public java.lang.String getBody() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SimpleResponse{statusCode=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", statusMessage='");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("', headers=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", body='");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("'}");
        return sb.toString();
    }

    @Override // org.jose4j.http.SimpleResponse
    public java.util.List<java.lang.String> getHeaderValues(java.lang.String str) {
        return this.getHighSpeedVideoFpsRanges.get(str != null ? str.toLowerCase().trim() : null);
    }
}
