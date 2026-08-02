package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum Z implements com.google.protobuf.Internal.EnumLite {
    WEBVIEW_FALLBACK_BACKGROUND_DEFAULT(0),
    WEBVIEW_FALLBACK_BACKGROUND_LIGHT(1),
    WEBVIEW_FALLBACK_BACKGROUND_DARK(2),
    WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT(3),
    UNRECOGNIZED(-1);

    public static final int WEBVIEW_FALLBACK_BACKGROUND_DARK_VALUE = 2;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_DEFAULT_VALUE = 0;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_LIGHT_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT_VALUE = 3;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6283a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Z> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Z findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.b f6284a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.forNumber(i) != null;
        }
    }

    Z(int i) {
        this.f6283a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Z forNumber(int i) {
        if (i == 0) {
            return WEBVIEW_FALLBACK_BACKGROUND_DEFAULT;
        }
        if (i == 1) {
            return WEBVIEW_FALLBACK_BACKGROUND_LIGHT;
        }
        if (i == 2) {
            return WEBVIEW_FALLBACK_BACKGROUND_DARK;
        }
        if (i != 3) {
            return null;
        }
        return WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Z> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.b.f6284a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6283a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Z valueOf(int i) {
        return forNumber(i);
    }
}
