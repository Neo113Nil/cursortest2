package org.chromium.net;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* loaded from: classes4.dex */
public abstract class UrlRequest {

    public static abstract class Builder {
        public static final int REQUEST_PRIORITY_HIGHEST = 4;
        public static final int REQUEST_PRIORITY_IDLE = 0;
        public static final int REQUEST_PRIORITY_LOW = 2;
        public static final int REQUEST_PRIORITY_LOWEST = 1;
        public static final int REQUEST_PRIORITY_MEDIUM = 3;

        public abstract Builder addHeader(String header, String value);

        public Builder addRequestAnnotation(Object annotation) {
            return this;
        }

        public abstract Builder allowDirectExecutor();

        public Builder bindToNetwork(long networkHandle) {
            return this;
        }

        public abstract UrlRequest build();

        public abstract Builder disableCache();

        public abstract Builder setHttpMethod(String method);

        public abstract Builder setPriority(int priority);

        public Builder setRawCompressionDictionary(byte[] dictionarySha256Hash, ByteBuffer dictionary, String dictionaryId) {
            return this;
        }

        public Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
            return this;
        }

        public Builder setTrafficStatsTag(int tag) {
            return this;
        }

        public Builder setTrafficStatsUid(int uid) {
            return this;
        }

        public abstract Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);
    }

    public static abstract class Callback {
        public void onCanceled(UrlRequest request, UrlResponseInfo info) {
        }

        public abstract void onFailed(UrlRequest request, UrlResponseInfo info, CronetException error);

        public abstract void onReadCompleted(UrlRequest request, UrlResponseInfo info, ByteBuffer byteBuffer) throws Exception;

        public abstract void onRedirectReceived(UrlRequest request, UrlResponseInfo info, String newLocationUrl) throws Exception;

        public abstract void onResponseStarted(UrlRequest request, UrlResponseInfo info) throws Exception;

        public abstract void onSucceeded(UrlRequest request, UrlResponseInfo info);
    }

    public @interface Experimental {
    }

    public static abstract class StatusListener {
        public abstract void onStatus(int status);
    }

    public abstract void cancel();

    public abstract void followRedirect();

    public abstract void getStatus(final StatusListener listener);

    public abstract boolean isDone();

    public abstract void read(ByteBuffer buffer);

    public abstract void start();

    public static class Status {
        public static final int CONNECTING = 10;
        public static final int DOWNLOADING_PAC_FILE = 5;
        public static final int ESTABLISHING_PROXY_TUNNEL = 8;
        public static final int IDLE = 0;
        public static final int INVALID = -1;
        public static final int READING_RESPONSE = 14;
        public static final int RESOLVING_HOST = 9;
        public static final int RESOLVING_HOST_IN_PAC_FILE = 7;
        public static final int RESOLVING_PROXY_FOR_URL = 6;
        public static final int SENDING_REQUEST = 12;
        public static final int SSL_HANDSHAKE = 11;
        public static final int WAITING_FOR_AVAILABLE_SOCKET = 2;
        public static final int WAITING_FOR_CACHE = 4;
        public static final int WAITING_FOR_DELEGATE = 3;
        public static final int WAITING_FOR_RESPONSE = 13;
        public static final int WAITING_FOR_STALLED_SOCKET_POOL = 1;

        private Status() {
        }
    }
}
