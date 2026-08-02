package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/core/auth/LoggedInState;", "", "<init>", "()V", "Initializing", "LoggedIn", "LoggedOut", "Lcom/zettle/sdk/core/auth/LoggedInState$Initializing;", "Lcom/zettle/sdk/core/auth/LoggedInState$LoggedIn;", "Lcom/zettle/sdk/core/auth/LoggedInState$LoggedOut;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class LoggedInState {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/auth/LoggedInState$Initializing;", "Lcom/zettle/sdk/core/auth/LoggedInState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Initializing extends com.zettle.sdk.core.auth.LoggedInState {
        public static final com.zettle.sdk.core.auth.LoggedInState.Initializing INSTANCE = new com.zettle.sdk.core.auth.LoggedInState.Initializing();

        private Initializing() {
            super(null);
        }
    }

    private LoggedInState() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/auth/LoggedInState$LoggedOut;", "Lcom/zettle/sdk/core/auth/LoggedInState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LoggedOut extends com.zettle.sdk.core.auth.LoggedInState {
        public static final com.zettle.sdk.core.auth.LoggedInState.LoggedOut INSTANCE = new com.zettle.sdk.core.auth.LoggedInState.LoggedOut();

        private LoggedOut() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/auth/LoggedInState$LoggedIn;", "Lcom/zettle/sdk/core/auth/LoggedInState;", "", "failedToRetrieveToken", "<init>", "(Z)V", "Z", "getFailedToRetrieveToken", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LoggedIn extends com.zettle.sdk.core.auth.LoggedInState {
        private final boolean failedToRetrieveToken;

        public LoggedIn(boolean z) {
            super(null);
            this.failedToRetrieveToken = z;
        }

        public /* synthetic */ LoggedIn(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getFailedToRetrieveToken() {
            return this.failedToRetrieveToken;
        }

        public LoggedIn() {
            this(false, 1, null);
        }
    }

    public /* synthetic */ LoggedInState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
