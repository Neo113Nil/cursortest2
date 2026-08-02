package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum b0 implements com.google.protobuf.Internal.EnumLite {
    WEBVIEW_FALLBACK_MODE_UNKNOWN(0),
    WEBVIEW_FALLBACK_MODE_IN_PROCESS(1),
    WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS(2),
    UNRECOGNIZED(-1);

    public static final int WEBVIEW_FALLBACK_MODE_IN_PROCESS_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS_VALUE = 2;
    public static final int WEBVIEW_FALLBACK_MODE_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6289a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.b0> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.b0 findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.b f6290a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.forNumber(i) != null;
        }
    }

    b0(int i) {
        this.f6289a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.b0 forNumber(int i) {
        if (i == 0) {
            return WEBVIEW_FALLBACK_MODE_UNKNOWN;
        }
        if (i == 1) {
            return WEBVIEW_FALLBACK_MODE_IN_PROCESS;
        }
        if (i != 2) {
            return null;
        }
        return WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.b0> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.b.f6290a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6289a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.b0 valueOf(int i) {
        return forNumber(i);
    }
}
