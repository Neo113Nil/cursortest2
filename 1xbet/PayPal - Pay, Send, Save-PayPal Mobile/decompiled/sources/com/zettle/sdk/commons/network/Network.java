package com.zettle.sdk.commons.network;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/commons/network/Network;", "", "Lcom/zettle/sdk/commons/state/State;", "Lcom/zettle/sdk/commons/network/Network$State;", "getState", "()Lcom/zettle/sdk/commons/state/State;", "state", "Companion", "State", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Network {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.commons.network.Network.Companion INSTANCE = com.zettle.sdk.commons.network.Network.Companion.getHighResolutionOutputSizeshNQ4ISI;
    public static final java.lang.String HEADER_CLIENT_SESSION_ID = "Client-Session-Id";
    public static final java.lang.String HEADER_PLANET_API_VERSION = "API-Version";
    public static final java.lang.String HEADER_SDK_APPLICATIONID = "X-SDK-APPLICATIONID";
    public static final java.lang.String HEADER_UNIQUE_DEVICE_ID = "UDID";
    public static final java.lang.String HEADER_USER_AGENT = "User-Agent";
    public static final int PLANET_PROTOCOL_VERSION = 22;
    public static final java.lang.String RETRY_TAG = "NETWORK_A11";
    public static final java.lang.String USER_AGENT_NAME = "Android SDK/";

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/zettle/sdk/commons/network/Network$Type;", "", "<init>", "(Ljava/lang/String;I)V", "Unknown", "Limited", "Unlimited"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        Unknown,
        Limited,
        Unlimited
    }

    com.zettle.sdk.commons.state.State<com.zettle.sdk.commons.network.Network.State> getState();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/commons/network/Network$State;", "", "<init>", "()V", "Connected", "Disconnected", "Unknown", "Lcom/zettle/sdk/commons/network/Network$State$Connected;", "Lcom/zettle/sdk/commons/network/Network$State$Disconnected;", "Lcom/zettle/sdk/commons/network/Network$State$Unknown;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class State {

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/commons/network/Network$State$Unknown;", "Lcom/zettle/sdk/commons/network/Network$State;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Unknown extends com.zettle.sdk.commons.network.Network.State {
            public static final com.zettle.sdk.commons.network.Network.State.Unknown INSTANCE = new com.zettle.sdk.commons.network.Network.State.Unknown();

            private Unknown() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Unknown";
            }
        }

        private State() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/commons/network/Network$State$Disconnected;", "Lcom/zettle/sdk/commons/network/Network$State;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Disconnected extends com.zettle.sdk.commons.network.Network.State {
            public static final com.zettle.sdk.commons.network.Network.State.Disconnected INSTANCE = new com.zettle.sdk.commons.network.Network.State.Disconnected();

            private Disconnected() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Disconnected";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0004\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/commons/network/Network$State$Connected;", "Lcom/zettle/sdk/commons/network/Network$State;", "Lcom/zettle/sdk/commons/network/Network$Type;", "type", "<init>", "(Lcom/zettle/sdk/commons/network/Network$Type;)V", "", "Lcom/zettle/sdk/commons/network/ActiveNetworkInfo;", "network", "(Lcom/zettle/sdk/commons/network/Network$Type;Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getNetwork$core_publicRelease", "()Ljava/util/Set;", "Lcom/zettle/sdk/commons/network/Network$Type;", "getType", "()Lcom/zettle/sdk/commons/network/Network$Type;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Connected extends com.zettle.sdk.commons.network.Network.State {
            private final java.util.Set<com.zettle.sdk.commons.network.ActiveNetworkInfo> network;
            private final com.zettle.sdk.commons.network.Network.Type type;

            public final com.zettle.sdk.commons.network.Network.Type getType() {
                return this.type;
            }

            public /* synthetic */ Connected(com.zettle.sdk.commons.network.Network.Type type, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(type, (i & 2) != 0 ? kotlin.collections.SetsKt.emptySet() : set);
            }

            public final java.util.Set<com.zettle.sdk.commons.network.ActiveNetworkInfo> getNetwork$core_publicRelease() {
                return this.network;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Connected(com.zettle.sdk.commons.network.Network.Type type, java.util.Set<com.zettle.sdk.commons.network.ActiveNetworkInfo> set) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
                this.type = type;
                this.network = set;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Connected(com.zettle.sdk.commons.network.Network.Type type) {
                this(type, kotlin.collections.SetsKt.emptySet());
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            }

            public final java.lang.String toString() {
                com.zettle.sdk.commons.network.Network.Type type = this.type;
                java.util.Set<com.zettle.sdk.commons.network.ActiveNetworkInfo> set = this.network;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Connected(");
                sb.append(type);
                sb.append(", ");
                sb.append(set);
                sb.append(")");
                return sb.toString();
            }
        }

        public /* synthetic */ State(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/commons/network/Network$Companion;", "", "<init>", "()V", "", "HEADER_CLIENT_SESSION_ID", "Ljava/lang/String;", "HEADER_PLANET_API_VERSION", "HEADER_SDK_APPLICATIONID", "HEADER_UNIQUE_DEVICE_ID", "HEADER_USER_AGENT", "", "PLANET_PROTOCOL_VERSION", com.visa.cbp.getEncExpo.warmup, "RETRY_TAG", "USER_AGENT_NAME"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String HEADER_CLIENT_SESSION_ID = "Client-Session-Id";
        public static final java.lang.String HEADER_PLANET_API_VERSION = "API-Version";
        public static final java.lang.String HEADER_SDK_APPLICATIONID = "X-SDK-APPLICATIONID";
        public static final java.lang.String HEADER_UNIQUE_DEVICE_ID = "UDID";
        public static final java.lang.String HEADER_USER_AGENT = "User-Agent";
        public static final int PLANET_PROTOCOL_VERSION = 22;
        public static final java.lang.String RETRY_TAG = "NETWORK_A11";
        public static final java.lang.String USER_AGENT_NAME = "Android SDK/";
        static final /* synthetic */ com.zettle.sdk.commons.network.Network.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.commons.network.Network.Companion();

        private Companion() {
        }
    }
}
