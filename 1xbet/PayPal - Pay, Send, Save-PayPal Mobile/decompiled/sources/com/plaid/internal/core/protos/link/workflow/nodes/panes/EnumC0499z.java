package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC0499z implements com.google.protobuf.Internal.EnumLite {
    HAPTIC_TYPE_UNKNOWN(0),
    HAPTIC_TYPE_BUTTON_NAVIGATION(1),
    HAPTIC_TYPE_BUTTON_INPUT(2),
    HAPTIC_TYPE_BUTTON_ACTION(3),
    HAPTIC_TYPE_EVENT_SUCCESS(4),
    HAPTIC_TYPE_EVENT_ERROR(5),
    UNRECOGNIZED(-1);

    public static final int HAPTIC_TYPE_BUTTON_ACTION_VALUE = 3;
    public static final int HAPTIC_TYPE_BUTTON_INPUT_VALUE = 2;
    public static final int HAPTIC_TYPE_BUTTON_NAVIGATION_VALUE = 1;
    public static final int HAPTIC_TYPE_EVENT_ERROR_VALUE = 5;
    public static final int HAPTIC_TYPE_EVENT_SUCCESS_VALUE = 4;
    public static final int HAPTIC_TYPE_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6341a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z$a */
    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z$b */
    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z.b f6342a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z.forNumber(i) != null;
        }
    }

    EnumC0499z(int i) {
        this.f6341a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z forNumber(int i) {
        if (i == 0) {
            return HAPTIC_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return HAPTIC_TYPE_BUTTON_NAVIGATION;
        }
        if (i == 2) {
            return HAPTIC_TYPE_BUTTON_INPUT;
        }
        if (i == 3) {
            return HAPTIC_TYPE_BUTTON_ACTION;
        }
        if (i == 4) {
            return HAPTIC_TYPE_EVENT_SUCCESS;
        }
        if (i != 5) {
            return null;
        }
        return HAPTIC_TYPE_EVENT_ERROR;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z.b.f6342a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6341a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z valueOf(int i) {
        return forNumber(i);
    }
}
