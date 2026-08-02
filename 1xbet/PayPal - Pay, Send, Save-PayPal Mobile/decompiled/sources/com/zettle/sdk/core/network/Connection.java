package com.zettle.sdk.core.network;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/core/network/Connection;", "", "<init>", "()V", "Connected", "Disconnected", "Lcom/zettle/sdk/core/network/Connection$Connected;", "Lcom/zettle/sdk/core/network/Connection$Disconnected;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Connection {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/network/Connection$Connected;", "Lcom/zettle/sdk/core/network/Connection;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Connected extends com.zettle.sdk.core.network.Connection {
        public static final com.zettle.sdk.core.network.Connection.Connected INSTANCE = new com.zettle.sdk.core.network.Connection.Connected();

        private Connected() {
            super(null);
        }
    }

    private Connection() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/network/Connection$Disconnected;", "Lcom/zettle/sdk/core/network/Connection;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Disconnected extends com.zettle.sdk.core.network.Connection {
        public static final com.zettle.sdk.core.network.Connection.Disconnected INSTANCE = new com.zettle.sdk.core.network.Connection.Disconnected();

        private Disconnected() {
            super(null);
        }
    }

    public /* synthetic */ Connection(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
