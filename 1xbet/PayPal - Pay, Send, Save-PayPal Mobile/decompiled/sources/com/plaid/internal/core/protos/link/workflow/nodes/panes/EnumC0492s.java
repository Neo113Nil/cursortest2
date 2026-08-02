package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC0492s implements com.google.protobuf.Internal.EnumLite {
    CONTENT_JUSTIFY_UNKNOWN(0),
    CONTENT_JUSTIFY_CENTER(1),
    CONTENT_JUSTIFY_SPACE_BETWEEN(2),
    CONTENT_JUSTIFY_SPACE_AROUND(3),
    CONTENT_JUSTIFY_SPACE_EVENLY(4),
    CONTENT_JUSTIFY_START(5),
    UNRECOGNIZED(-1);

    public static final int CONTENT_JUSTIFY_CENTER_VALUE = 1;
    public static final int CONTENT_JUSTIFY_SPACE_AROUND_VALUE = 3;
    public static final int CONTENT_JUSTIFY_SPACE_BETWEEN_VALUE = 2;
    public static final int CONTENT_JUSTIFY_SPACE_EVENLY_VALUE = 4;
    public static final int CONTENT_JUSTIFY_START_VALUE = 5;
    public static final int CONTENT_JUSTIFY_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6324a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s$a */
    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s$b */
    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.b f6325a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.forNumber(i) != null;
        }
    }

    EnumC0492s(int i) {
        this.f6324a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s forNumber(int i) {
        if (i == 0) {
            return CONTENT_JUSTIFY_UNKNOWN;
        }
        if (i == 1) {
            return CONTENT_JUSTIFY_CENTER;
        }
        if (i == 2) {
            return CONTENT_JUSTIFY_SPACE_BETWEEN;
        }
        if (i == 3) {
            return CONTENT_JUSTIFY_SPACE_AROUND;
        }
        if (i == 4) {
            return CONTENT_JUSTIFY_SPACE_EVENLY;
        }
        if (i != 5) {
            return null;
        }
        return CONTENT_JUSTIFY_START;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.b.f6325a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6324a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s valueOf(int i) {
        return forNumber(i);
    }
}
