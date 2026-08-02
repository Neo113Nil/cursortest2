package com.zettle.sdk.headless.readers;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason;", "", "Initial", "LostConnection", "Restarting", "UnexpectedReaderState", "Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason$Initial;", "Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason$LostConnection;", "Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason$Restarting;", "Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason$UnexpectedReaderState;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ReaderDisconnectionReason {

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason$Initial;", "Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Initial implements com.zettle.sdk.headless.readers.ReaderDisconnectionReason {
        public static final com.zettle.sdk.headless.readers.ReaderDisconnectionReason.Initial INSTANCE = new com.zettle.sdk.headless.readers.ReaderDisconnectionReason.Initial();

        private Initial() {
        }

        public final java.lang.String toString() {
            return "Initial";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason$LostConnection;", "Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason;", "Lcom/zettle/sdk/headless/readers/ConnectionType;", "type", "<init>", "(Lcom/zettle/sdk/headless/readers/ConnectionType;)V", "component1", "()Lcom/zettle/sdk/headless/readers/ConnectionType;", "copy", "(Lcom/zettle/sdk/headless/readers/ConnectionType;)Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason$LostConnection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/headless/readers/ConnectionType;", "getType"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LostConnection implements com.zettle.sdk.headless.readers.ReaderDisconnectionReason {
        private final com.zettle.sdk.headless.readers.ConnectionType type;

        public LostConnection(com.zettle.sdk.headless.readers.ConnectionType connectionType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionType, "");
            this.type = connectionType;
        }

        public final com.zettle.sdk.headless.readers.ConnectionType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.headless.readers.ConnectionType connectionType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LostConnection[Type = ");
            sb.append(connectionType);
            sb.append("]");
            return sb.toString();
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.headless.readers.ReaderDisconnectionReason.LostConnection) && this.type == ((com.zettle.sdk.headless.readers.ReaderDisconnectionReason.LostConnection) other).type;
        }

        public final com.zettle.sdk.headless.readers.ReaderDisconnectionReason.LostConnection copy(com.zettle.sdk.headless.readers.ConnectionType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.zettle.sdk.headless.readers.ReaderDisconnectionReason.LostConnection(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.headless.readers.ConnectionType getType() {
            return this.type;
        }

        public static /* synthetic */ com.zettle.sdk.headless.readers.ReaderDisconnectionReason.LostConnection copy$default(com.zettle.sdk.headless.readers.ReaderDisconnectionReason.LostConnection lostConnection, com.zettle.sdk.headless.readers.ConnectionType connectionType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                connectionType = lostConnection.type;
            }
            return lostConnection.copy(connectionType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason$Restarting;", "Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Restarting implements com.zettle.sdk.headless.readers.ReaderDisconnectionReason {
        public static final com.zettle.sdk.headless.readers.ReaderDisconnectionReason.Restarting INSTANCE = new com.zettle.sdk.headless.readers.ReaderDisconnectionReason.Restarting();

        private Restarting() {
        }

        public final java.lang.String toString() {
            return "Restarting";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason$UnexpectedReaderState;", "Lcom/zettle/sdk/headless/readers/ReaderDisconnectionReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnexpectedReaderState implements com.zettle.sdk.headless.readers.ReaderDisconnectionReason {
        public static final com.zettle.sdk.headless.readers.ReaderDisconnectionReason.UnexpectedReaderState INSTANCE = new com.zettle.sdk.headless.readers.ReaderDisconnectionReason.UnexpectedReaderState();

        private UnexpectedReaderState() {
        }

        public final java.lang.String toString() {
            return "UnexpectedReaderState";
        }
    }
}
