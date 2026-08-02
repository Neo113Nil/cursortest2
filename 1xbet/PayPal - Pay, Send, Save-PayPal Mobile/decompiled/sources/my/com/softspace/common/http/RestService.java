package my.com.softspace.common.http;

/* loaded from: classes17.dex */
public interface RestService {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface RestServiceType {
        public static final int Attestation = 1;
        public static final int KeyLoading = 2;
    }

    my.com.softspace.common.http.HttpResponse request(int i, my.com.softspace.common.http.HttpRequest httpRequest);

    default my.com.softspace.common.http.HttpResponse get(java.lang.String str) {
        return request(1, new my.com.softspace.common.http.HttpRequest(my.com.softspace.common.http.HttpRequest.HttpMethod.GET, str));
    }

    default my.com.softspace.common.http.HttpResponse post(java.lang.String str, java.lang.String str2) {
        return request(1, new my.com.softspace.common.http.HttpRequest(my.com.softspace.common.http.HttpRequest.HttpMethod.POST, str, str2));
    }

    default my.com.softspace.common.http.HttpResponse put(java.lang.String str, java.lang.String str2) {
        return request(1, new my.com.softspace.common.http.HttpRequest(my.com.softspace.common.http.HttpRequest.HttpMethod.PUT, str, str2));
    }

    default my.com.softspace.common.http.HttpResponse delete(java.lang.String str) {
        return request(1, new my.com.softspace.common.http.HttpRequest(my.com.softspace.common.http.HttpRequest.HttpMethod.DELETE, str));
    }

    default my.com.softspace.common.http.HttpResponse delete(java.lang.String str, java.lang.String str2) {
        return request(1, new my.com.softspace.common.http.HttpRequest(my.com.softspace.common.http.HttpRequest.HttpMethod.DELETE, str, str2));
    }
}
