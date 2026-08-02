package my.com.softspace.common.http;

/* loaded from: classes17.dex */
public class HttpResponse {
    public static final int HTTP_RESPONSE_CODE_FORBIDDEN = 403;
    public static final int HTTP_RESPONSE_CODE_SUCCESS = 200;
    private int Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHighSpeedVideoSizes;

    public HttpResponse() {
        this.Camera2StreamConfigurationMap = 200;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public HttpResponse(int i, java.lang.String str) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = null;
    }

    public int getCode() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getContent() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return this.getHighSpeedVideoSizes;
    }

    public my.com.softspace.common.http.HttpResponse setCode(int i) {
        this.Camera2StreamConfigurationMap = i;
        return this;
    }

    public my.com.softspace.common.http.HttpResponse setContent(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        return this;
    }

    public my.com.softspace.common.http.HttpResponse setHeaders(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        this.getHighSpeedVideoSizes = map;
        return this;
    }
}
