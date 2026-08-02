package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public enum g implements com.google.protobuf.Internal.EnumLite {
    CLIENT_TYPE_UNKNOWN(0),
    CLIENT_TYPE_ANDROID(1),
    CLIENT_TYPE_IOS(2),
    CLIENT_TYPE_WEB(3),
    CLIENT_TYPE_REACTNATIVEANDROID(4),
    CLIENT_TYPE_REACTNATIVEIOS(5),
    CLIENT_TYPE_LINK_WEB_SDK(6),
    CLIENT_TYPE_FLUTTERIOS(7),
    CLIENT_TYPE_FLUTTERANDROID(8),
    CLIENT_TYPE_HOSTED_LINK(9),
    UNRECOGNIZED(-1);

    public static final int CLIENT_TYPE_ANDROID_VALUE = 1;
    public static final int CLIENT_TYPE_FLUTTERANDROID_VALUE = 8;
    public static final int CLIENT_TYPE_FLUTTERIOS_VALUE = 7;
    public static final int CLIENT_TYPE_HOSTED_LINK_VALUE = 9;
    public static final int CLIENT_TYPE_IOS_VALUE = 2;
    public static final int CLIENT_TYPE_LINK_WEB_SDK_VALUE = 6;
    public static final int CLIENT_TYPE_REACTNATIVEANDROID_VALUE = 4;
    public static final int CLIENT_TYPE_REACTNATIVEIOS_VALUE = 5;
    public static final int CLIENT_TYPE_UNKNOWN_VALUE = 0;
    public static final int CLIENT_TYPE_WEB_VALUE = 3;
    public static final com.plaid.internal.core.protos.link.workflow.primitives.g.a b = new com.plaid.internal.core.protos.link.workflow.primitives.g.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6364a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.g> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.primitives.g findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.g.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.primitives.g.b f6365a = new com.plaid.internal.core.protos.link.workflow.primitives.g.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.g.forNumber(i) != null;
        }
    }

    g(int i) {
        this.f6364a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.g forNumber(int i) {
        switch (i) {
            case 0:
                return CLIENT_TYPE_UNKNOWN;
            case 1:
                return CLIENT_TYPE_ANDROID;
            case 2:
                return CLIENT_TYPE_IOS;
            case 3:
                return CLIENT_TYPE_WEB;
            case 4:
                return CLIENT_TYPE_REACTNATIVEANDROID;
            case 5:
                return CLIENT_TYPE_REACTNATIVEIOS;
            case 6:
                return CLIENT_TYPE_LINK_WEB_SDK;
            case 7:
                return CLIENT_TYPE_FLUTTERIOS;
            case 8:
                return CLIENT_TYPE_FLUTTERANDROID;
            case 9:
                return CLIENT_TYPE_HOSTED_LINK;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.g> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.primitives.g.b.f6365a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6364a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.primitives.g valueOf(int i) {
        return forNumber(i);
    }
}
