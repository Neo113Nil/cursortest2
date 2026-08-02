package com.zettle.sdk.headless.readers;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderConnectionState;", "", "Connected", "Disconnected", "Sleeping", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected;", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Disconnected;", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Sleeping;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ReaderConnectionState {

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected;", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState;", "ConfigurationFailed", "Configured", "Configuring", "Idle", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected$ConfigurationFailed;", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected$Configured;", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected$Configuring;", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected$Idle;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Connected extends com.zettle.sdk.headless.readers.ReaderConnectionState {

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected$Idle;", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Idle implements com.zettle.sdk.headless.readers.ReaderConnectionState.Connected {
            public static final com.zettle.sdk.headless.readers.ReaderConnectionState.Connected.Idle INSTANCE = new com.zettle.sdk.headless.readers.ReaderConnectionState.Connected.Idle();

            private Idle() {
            }

            public final java.lang.String toString() {
                return "Connected[Idle]";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected$Configuring;", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Configuring implements com.zettle.sdk.headless.readers.ReaderConnectionState.Connected {
            public static final com.zettle.sdk.headless.readers.ReaderConnectionState.Connected.Configuring INSTANCE = new com.zettle.sdk.headless.readers.ReaderConnectionState.Connected.Configuring();

            private Configuring() {
            }

            public final java.lang.String toString() {
                return "Connected[Configuring]";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected$Configured;", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Configured implements com.zettle.sdk.headless.readers.ReaderConnectionState.Connected {
            public static final com.zettle.sdk.headless.readers.ReaderConnectionState.Connected.Configured INSTANCE = new com.zettle.sdk.headless.readers.ReaderConnectionState.Connected.Configured();

            private Configured() {
            }

            public final java.lang.String toString() {
                return "Connected[Configured]";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected$ConfigurationFailed;", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected;", "", "error", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Connected$ConfigurationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ConfigurationFailed implements com.zettle.sdk.headless.readers.ReaderConnectionState.Connected {
            private final java.lang.String error;

            public ConfigurationFailed(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.error = str;
            }

            public final java.lang.String getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Connected[ConfigurationFailed: ");
                sb.append(str);
                sb.append("]");
                return sb.toString();
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.zettle.sdk.headless.readers.ReaderConnectionState.Connected.ConfigurationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.zettle.sdk.headless.readers.ReaderConnectionState.Connected.ConfigurationFailed) other).error);
            }

            public final com.zettle.sdk.headless.readers.ReaderConnectionState.Connected.ConfigurationFailed copy(java.lang.String error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.zettle.sdk.headless.readers.ReaderConnectionState.Connected.ConfigurationFailed(error);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getError() {
                return this.error;
            }

            public static /* synthetic */ com.zettle.sdk.headless.readers.ReaderConnectionState.Connected.ConfigurationFailed copy$default(com.zettle.sdk.headless.readers.ReaderConnectionState.Connected.ConfigurationFailed configurationFailed, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = configurationFailed.error;
                }
                return configurationFailed.copy(str);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Disconnected;", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState;", "Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason;", "reason", "<init>", "(Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason;)V", "component1", "()Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason;", "copy", "(Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason;)Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Disconnected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason;", "getReason"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Disconnected implements com.zettle.sdk.headless.readers.ReaderConnectionState {
        private final com.zettle.sdk.headless.readers.ReaderDisconnectionReason reason;

        public Disconnected(com.zettle.sdk.headless.readers.ReaderDisconnectionReason readerDisconnectionReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerDisconnectionReason, "");
            this.reason = readerDisconnectionReason;
        }

        public final com.zettle.sdk.headless.readers.ReaderDisconnectionReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.headless.readers.ReaderDisconnectionReason readerDisconnectionReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Disconnected[Reason = ");
            sb.append(readerDisconnectionReason);
            sb.append("]");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.headless.readers.ReaderConnectionState.Disconnected) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.zettle.sdk.headless.readers.ReaderConnectionState.Disconnected) other).reason);
        }

        public final com.zettle.sdk.headless.readers.ReaderConnectionState.Disconnected copy(com.zettle.sdk.headless.readers.ReaderDisconnectionReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.zettle.sdk.headless.readers.ReaderConnectionState.Disconnected(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.headless.readers.ReaderDisconnectionReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.zettle.sdk.headless.readers.ReaderConnectionState.Disconnected copy$default(com.zettle.sdk.headless.readers.ReaderConnectionState.Disconnected disconnected, com.zettle.sdk.headless.readers.ReaderDisconnectionReason readerDisconnectionReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                readerDisconnectionReason = disconnected.reason;
            }
            return disconnected.copy(readerDisconnectionReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderConnectionState$Sleeping;", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Sleeping implements com.zettle.sdk.headless.readers.ReaderConnectionState {
        public static final com.zettle.sdk.headless.readers.ReaderConnectionState.Sleeping INSTANCE = new com.zettle.sdk.headless.readers.ReaderConnectionState.Sleeping();

        private Sleeping() {
        }

        public final java.lang.String toString() {
            return "Sleeping";
        }
    }
}
