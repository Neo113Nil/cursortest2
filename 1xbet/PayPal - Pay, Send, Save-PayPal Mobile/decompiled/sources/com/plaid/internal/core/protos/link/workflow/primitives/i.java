package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public enum i implements com.google.protobuf.Internal.EnumLite {
    INTEGRATION_MODE_UNKNOWN(0),
    INTEGRATION_MODE_IFRAME(1),
    INTEGRATION_MODE_WEBVIEW(2),
    INTEGRATION_MODE_IOS_SDK_WEBVIEW(3),
    INTEGRATION_MODE_ANDROID_SDK_WEBVIEW(4),
    INTEGRATION_MODE_IOS_SDK_OUT_OF_PROCESS_WEBVIEW(5),
    INTEGRATION_MODE_ANDROID_SDK_OUT_OF_PROCESS_WEBVIEW(6),
    INTEGRATION_MODE_TAB_WINDOW(7),
    INTEGRATION_MODE_REDIRECT_URI(8),
    INTEGRATION_MODE_TRUSTED_AUTH_FRONT_END(9),
    UNRECOGNIZED(-1);

    public static final int INTEGRATION_MODE_ANDROID_SDK_OUT_OF_PROCESS_WEBVIEW_VALUE = 6;
    public static final int INTEGRATION_MODE_ANDROID_SDK_WEBVIEW_VALUE = 4;
    public static final int INTEGRATION_MODE_IFRAME_VALUE = 1;
    public static final int INTEGRATION_MODE_IOS_SDK_OUT_OF_PROCESS_WEBVIEW_VALUE = 5;
    public static final int INTEGRATION_MODE_IOS_SDK_WEBVIEW_VALUE = 3;
    public static final int INTEGRATION_MODE_REDIRECT_URI_VALUE = 8;
    public static final int INTEGRATION_MODE_TAB_WINDOW_VALUE = 7;
    public static final int INTEGRATION_MODE_TRUSTED_AUTH_FRONT_END_VALUE = 9;
    public static final int INTEGRATION_MODE_UNKNOWN_VALUE = 0;
    public static final int INTEGRATION_MODE_WEBVIEW_VALUE = 2;
    public static final com.plaid.internal.core.protos.link.workflow.primitives.i.a b = new com.plaid.internal.core.protos.link.workflow.primitives.i.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6368a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.i> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.primitives.i findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.i.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.primitives.i.b f6369a = new com.plaid.internal.core.protos.link.workflow.primitives.i.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.i.forNumber(i) != null;
        }
    }

    i(int i) {
        this.f6368a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.i forNumber(int i) {
        switch (i) {
            case 0:
                return INTEGRATION_MODE_UNKNOWN;
            case 1:
                return INTEGRATION_MODE_IFRAME;
            case 2:
                return INTEGRATION_MODE_WEBVIEW;
            case 3:
                return INTEGRATION_MODE_IOS_SDK_WEBVIEW;
            case 4:
                return INTEGRATION_MODE_ANDROID_SDK_WEBVIEW;
            case 5:
                return INTEGRATION_MODE_IOS_SDK_OUT_OF_PROCESS_WEBVIEW;
            case 6:
                return INTEGRATION_MODE_ANDROID_SDK_OUT_OF_PROCESS_WEBVIEW;
            case 7:
                return INTEGRATION_MODE_TAB_WINDOW;
            case 8:
                return INTEGRATION_MODE_REDIRECT_URI;
            case 9:
                return INTEGRATION_MODE_TRUSTED_AUTH_FRONT_END;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.i> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.primitives.i.b.f6369a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6368a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.primitives.i valueOf(int i) {
        return forNumber(i);
    }
}
