package com.zettle.sdk.headless.readers;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/headless/readers/PairingState;", "", "<init>", "()V", "Cancelled", "ConfirmCode", "Connecting", "Failed", "Finalizing", "Initial", "Success", "Lcom/zettle/sdk/headless/readers/PairingState$Cancelled;", "Lcom/zettle/sdk/headless/readers/PairingState$ConfirmCode;", "Lcom/zettle/sdk/headless/readers/PairingState$Connecting;", "Lcom/zettle/sdk/headless/readers/PairingState$Failed;", "Lcom/zettle/sdk/headless/readers/PairingState$Finalizing;", "Lcom/zettle/sdk/headless/readers/PairingState$Initial;", "Lcom/zettle/sdk/headless/readers/PairingState$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PairingState {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/headless/readers/PairingState$Initial;", "Lcom/zettle/sdk/headless/readers/PairingState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Initial extends com.zettle.sdk.headless.readers.PairingState {
        public static final com.zettle.sdk.headless.readers.PairingState.Initial INSTANCE = new com.zettle.sdk.headless.readers.PairingState.Initial();

        private Initial() {
            super(null);
        }
    }

    private PairingState() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/headless/readers/PairingState$Connecting;", "Lcom/zettle/sdk/headless/readers/PairingState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Connecting extends com.zettle.sdk.headless.readers.PairingState {
        public static final com.zettle.sdk.headless.readers.PairingState.Connecting INSTANCE = new com.zettle.sdk.headless.readers.PairingState.Connecting();

        private Connecting() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/headless/readers/PairingState$ConfirmCode;", "Lcom/zettle/sdk/headless/readers/PairingState;", "", "code", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/zettle/sdk/headless/readers/PairingState$ConfirmCode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ConfirmCode extends com.zettle.sdk.headless.readers.PairingState {
        private final int code;

        public ConfirmCode(int i) {
            super(null);
            this.code = i;
        }

        public final int getCode() {
            return this.code;
        }

        public final java.lang.String toString() {
            int i = this.code;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmCode(code=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.code);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.headless.readers.PairingState.ConfirmCode) && this.code == ((com.zettle.sdk.headless.readers.PairingState.ConfirmCode) other).code;
        }

        public final com.zettle.sdk.headless.readers.PairingState.ConfirmCode copy(int code) {
            return new com.zettle.sdk.headless.readers.PairingState.ConfirmCode(code);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public static /* synthetic */ com.zettle.sdk.headless.readers.PairingState.ConfirmCode copy$default(com.zettle.sdk.headless.readers.PairingState.ConfirmCode confirmCode, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = confirmCode.code;
            }
            return confirmCode.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/headless/readers/PairingState$Finalizing;", "Lcom/zettle/sdk/headless/readers/PairingState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Finalizing extends com.zettle.sdk.headless.readers.PairingState {
        public static final com.zettle.sdk.headless.readers.PairingState.Finalizing INSTANCE = new com.zettle.sdk.headless.readers.PairingState.Finalizing();

        private Finalizing() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/headless/readers/PairingState$Success;", "Lcom/zettle/sdk/headless/readers/PairingState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Success extends com.zettle.sdk.headless.readers.PairingState {
        public static final com.zettle.sdk.headless.readers.PairingState.Success INSTANCE = new com.zettle.sdk.headless.readers.PairingState.Success();

        private Success() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/headless/readers/PairingState$Cancelled;", "Lcom/zettle/sdk/headless/readers/PairingState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Cancelled extends com.zettle.sdk.headless.readers.PairingState {
        public static final com.zettle.sdk.headless.readers.PairingState.Cancelled INSTANCE = new com.zettle.sdk.headless.readers.PairingState.Cancelled();

        private Cancelled() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/zettle/sdk/headless/readers/PairingState$Failed;", "Lcom/zettle/sdk/headless/readers/PairingState;", "", "error", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/zettle/sdk/headless/readers/PairingState$Failed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Throwable;", "getCause", "Ljava/lang/String;", "getError"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Failed extends com.zettle.sdk.headless.readers.PairingState {
        private final java.lang.Throwable cause;
        private final java.lang.String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
            this.cause = th;
        }

        public /* synthetic */ Failed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(error=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.error.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.headless.readers.PairingState.Failed)) {
                return false;
            }
            com.zettle.sdk.headless.readers.PairingState.Failed failed = (com.zettle.sdk.headless.readers.PairingState.Failed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.error, failed.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, failed.cause);
        }

        public final com.zettle.sdk.headless.readers.PairingState.Failed copy(java.lang.String error, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.zettle.sdk.headless.readers.PairingState.Failed(error, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.zettle.sdk.headless.readers.PairingState.Failed copy$default(com.zettle.sdk.headless.readers.PairingState.Failed failed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = failed.error;
            }
            if ((i & 2) != 0) {
                th = failed.cause;
            }
            return failed.copy(str, th);
        }
    }

    public /* synthetic */ PairingState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
