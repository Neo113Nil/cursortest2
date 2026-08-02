package my.com.softspace.common.http;

/* loaded from: classes17.dex */
public class RestServiceFactory {
    private static my.com.softspace.common.http.RestServiceFactory getHighSpeedVideoFpsRangesFor;
    private final my.com.softspace.common.http.RestService getHighSpeedVideoFpsRanges;

    private RestServiceFactory(my.com.softspace.common.CommonProperties commonProperties, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRanges = new my.com.softspace.common.http.OkHttpRestService(commonProperties, secureRandom);
    }

    public static my.com.softspace.common.http.RestServiceFactory init(my.com.softspace.common.CommonProperties commonProperties, java.security.SecureRandom secureRandom) {
        my.com.softspace.common.http.RestServiceFactory restServiceFactory = new my.com.softspace.common.http.RestServiceFactory(commonProperties, secureRandom);
        getHighSpeedVideoFpsRangesFor = restServiceFactory;
        return restServiceFactory;
    }

    public static my.com.softspace.common.http.RestService restService() {
        return getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
    }
}
