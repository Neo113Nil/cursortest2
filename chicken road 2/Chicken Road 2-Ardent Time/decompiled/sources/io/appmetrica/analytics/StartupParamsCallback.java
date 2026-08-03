package io.appmetrica.analytics;

/* loaded from: classes.dex */
public interface StartupParamsCallback {
    public static final java.lang.String APPMETRICA_DEVICE_ID = "appmetrica_device_id";
    public static final java.lang.String APPMETRICA_DEVICE_ID_HASH = "appmetrica_device_id_hash";
    public static final java.lang.String APPMETRICA_UUID = "appmetrica_uuid";

    public static final class Reason {
        public final java.lang.String value;
        public static io.appmetrica.analytics.StartupParamsCallback.Reason UNKNOWN = new io.appmetrica.analytics.StartupParamsCallback.Reason("UNKNOWN");
        public static io.appmetrica.analytics.StartupParamsCallback.Reason NETWORK = new io.appmetrica.analytics.StartupParamsCallback.Reason("NETWORK");
        public static io.appmetrica.analytics.StartupParamsCallback.Reason INVALID_RESPONSE = new io.appmetrica.analytics.StartupParamsCallback.Reason("INVALID_RESPONSE");

        public Reason(java.lang.String str) {
            this.value = str;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || io.appmetrica.analytics.StartupParamsCallback.Reason.class != obj.getClass()) {
                return false;
            }
            return this.value.equals(((io.appmetrica.analytics.StartupParamsCallback.Reason) obj).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public java.lang.String toString() {
            return B1.a.j(new java.lang.StringBuilder("Reason{value='"), this.value, "'}");
        }
    }

    public static final class Result {
        public final java.util.Map<java.lang.String, io.appmetrica.analytics.StartupParamsItem> parameters;
        public final java.lang.String uuid = parameterForKey(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_UUID);
        public final java.lang.String deviceId = parameterForKey(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID);
        public final java.lang.String deviceIdHash = parameterForKey(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);

        public Result(java.util.Map<java.lang.String, io.appmetrica.analytics.StartupParamsItem> map) {
            this.parameters = map;
        }

        public java.lang.String parameterForKey(java.lang.String str) {
            io.appmetrica.analytics.StartupParamsItem startupParamsItem = this.parameters.get(str);
            if (startupParamsItem != null) {
                return startupParamsItem.getId();
            }
            return null;
        }
    }

    void onReceive(io.appmetrica.analytics.StartupParamsCallback.Result result);

    void onRequestError(io.appmetrica.analytics.StartupParamsCallback.Reason reason, io.appmetrica.analytics.StartupParamsCallback.Result result);
}
