package com.zettle.sdk.core.os;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/core/os/LocationInfo;", "", "Lcom/zettle/sdk/core/os/LocationData;", "getLastKnown", "()Lcom/zettle/sdk/core/os/LocationData;", "lastKnown", "Lcom/zettle/sdk/commons/state/State;", "Lcom/zettle/sdk/core/os/LocationInfo$State;", "getState", "()Lcom/zettle/sdk/commons/state/State;", "state", "State"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface LocationInfo {
    com.zettle.sdk.core.os.LocationData getLastKnown();

    com.zettle.sdk.commons.state.State<com.zettle.sdk.core.os.LocationInfo.State> getState();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/core/os/LocationInfo$State;", "", "<init>", "()V", "Denied", "Disabled", "Enabled", "Lcom/zettle/sdk/core/os/LocationInfo$State$Denied;", "Lcom/zettle/sdk/core/os/LocationInfo$State$Disabled;", "Lcom/zettle/sdk/core/os/LocationInfo$State$Enabled;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class State {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/os/LocationInfo$State$Denied;", "Lcom/zettle/sdk/core/os/LocationInfo$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Denied extends com.zettle.sdk.core.os.LocationInfo.State {
            public static final com.zettle.sdk.core.os.LocationInfo.State.Denied INSTANCE = new com.zettle.sdk.core.os.LocationInfo.State.Denied();

            private Denied() {
                super(null);
            }
        }

        private State() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/os/LocationInfo$State$Disabled;", "Lcom/zettle/sdk/core/os/LocationInfo$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Disabled extends com.zettle.sdk.core.os.LocationInfo.State {
            public static final com.zettle.sdk.core.os.LocationInfo.State.Disabled INSTANCE = new com.zettle.sdk.core.os.LocationInfo.State.Disabled();

            private Disabled() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/os/LocationInfo$State$Enabled;", "Lcom/zettle/sdk/core/os/LocationInfo$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Enabled extends com.zettle.sdk.core.os.LocationInfo.State {
            public static final com.zettle.sdk.core.os.LocationInfo.State.Enabled INSTANCE = new com.zettle.sdk.core.os.LocationInfo.State.Enabled();

            private Enabled() {
                super(null);
            }
        }

        public /* synthetic */ State(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
