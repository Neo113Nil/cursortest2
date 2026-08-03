package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigException extends com.google.firebase.FirebaseException {
    private final com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code code;

    public FirebaseRemoteConfigException(java.lang.String str) {
        super(str);
        this.code = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.code = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(java.lang.String str, com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code code) {
        super(str);
        this.code = code;
    }

    public FirebaseRemoteConfigException(java.lang.String str, java.lang.Throwable th, com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code code) {
        super(str, th);
        this.code = code;
    }

    public enum Code {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        Code(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }

    public com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code getCode() {
        return this.code;
    }
}
