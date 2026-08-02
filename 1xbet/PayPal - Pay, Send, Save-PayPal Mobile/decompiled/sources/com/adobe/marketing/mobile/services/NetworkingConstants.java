package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
public class NetworkingConstants {
    public static java.util.ArrayList<java.lang.Integer> RECOVERABLE_ERROR_CODES = new java.util.ArrayList<>(java.util.Arrays.asList(408, 504, 503));

    public class HeaderValues {
        public static final java.lang.String ACCEPT_TEXT_HTML = "text/html";
        public static final java.lang.String CONTENT_TYPE_JSON_APPLICATION = "application/json";
        public static final java.lang.String CONTENT_TYPE_URL_ENCODED = "application/x-www-form-urlencoded";
    }

    public class Headers {
        public static final java.lang.String ACCEPT = "Accept";
        public static final java.lang.String ACCEPT_LANGUAGE = "Accept-Language";
        public static final java.lang.String CONTENT_TYPE = "Content-Type";
        public static final java.lang.String ETAG = "Etag";
        public static final java.lang.String IF_MODIFIED_SINCE = "If-Modified-Since";
        public static final java.lang.String IF_NONE_MATCH = "If-None-Match";
        public static final java.lang.String LAST_MODIFIED = "Last-Modified";
    }

    private NetworkingConstants() {
    }
}
