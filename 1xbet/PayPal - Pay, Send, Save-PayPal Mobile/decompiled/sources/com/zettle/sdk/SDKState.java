package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/SDKState;", "", "<init>", "()V", "DELAYED", "STARTED", "STOPPED", "Lcom/zettle/sdk/SDKState$DELAYED;", "Lcom/zettle/sdk/SDKState$STARTED;", "Lcom/zettle/sdk/SDKState$STOPPED;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
abstract class SDKState {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/SDKState$STOPPED;", "Lcom/zettle/sdk/SDKState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class STOPPED extends com.zettle.sdk.SDKState {
        public static final com.zettle.sdk.SDKState.STOPPED INSTANCE = new com.zettle.sdk.SDKState.STOPPED();

        private STOPPED() {
            super(null);
        }
    }

    private SDKState() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/SDKState$DELAYED;", "Lcom/zettle/sdk/SDKState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DELAYED extends com.zettle.sdk.SDKState {
        public static final com.zettle.sdk.SDKState.DELAYED INSTANCE = new com.zettle.sdk.SDKState.DELAYED();

        private DELAYED() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/SDKState$STARTED;", "Lcom/zettle/sdk/SDKState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class STARTED extends com.zettle.sdk.SDKState {
        public static final com.zettle.sdk.SDKState.STARTED INSTANCE = new com.zettle.sdk.SDKState.STARTED();

        private STARTED() {
            super(null);
        }
    }

    public /* synthetic */ SDKState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
