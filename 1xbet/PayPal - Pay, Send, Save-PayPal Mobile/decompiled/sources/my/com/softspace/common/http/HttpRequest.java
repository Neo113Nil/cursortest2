package my.com.softspace.common.http;

/* loaded from: classes17.dex */
public class HttpRequest {
    private my.com.softspace.common.http.HttpRequest.HttpMethod Camera2StreamConfigurationMap;
    private java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;

    public enum HttpMethod {
        GET,
        POST,
        PUT,
        DELETE
    }

    public static my.com.softspace.common.http.HttpRequest get(java.lang.String str) {
        return new my.com.softspace.common.http.HttpRequest(str);
    }

    public static my.com.softspace.common.http.HttpRequest post(java.lang.String str) {
        return new my.com.softspace.common.http.HttpRequest(my.com.softspace.common.http.HttpRequest.HttpMethod.POST, str);
    }

    public static my.com.softspace.common.http.HttpRequest put(java.lang.String str) {
        return new my.com.softspace.common.http.HttpRequest(my.com.softspace.common.http.HttpRequest.HttpMethod.PUT, str);
    }

    public static my.com.softspace.common.http.HttpRequest delete(java.lang.String str) {
        return new my.com.softspace.common.http.HttpRequest(my.com.softspace.common.http.HttpRequest.HttpMethod.DELETE, str);
    }

    public HttpRequest(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = my.com.softspace.common.http.HttpRequest.HttpMethod.GET;
    }

    public HttpRequest(my.com.softspace.common.http.HttpRequest.HttpMethod httpMethod, java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = httpMethod;
    }

    public HttpRequest(my.com.softspace.common.http.HttpRequest.HttpMethod httpMethod, java.lang.String str, java.lang.String str2) {
        this(httpMethod, str);
        this.getHighSpeedVideoFpsRangesFor = str2;
    }

    public java.lang.String getUrl() {
        return this.getHighSpeedVideoSizes;
    }

    public my.com.softspace.common.http.HttpRequest setUrl(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
        return this;
    }

    public java.lang.String getBody() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public my.com.softspace.common.http.HttpRequest setBody(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
        return this;
    }

    public my.com.softspace.common.http.HttpRequest.HttpMethod getMethod() {
        return this.Camera2StreamConfigurationMap;
    }

    public my.com.softspace.common.http.HttpRequest setMethod(my.com.softspace.common.http.HttpRequest.HttpMethod httpMethod) {
        this.Camera2StreamConfigurationMap = httpMethod;
        return this;
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeader() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public my.com.softspace.common.http.HttpRequest setHeader(java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighResolutionOutputSizeshNQ4ISI = map;
        return this;
    }
}
