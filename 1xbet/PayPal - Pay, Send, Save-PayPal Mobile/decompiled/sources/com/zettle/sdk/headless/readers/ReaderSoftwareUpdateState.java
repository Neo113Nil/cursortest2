package com.zettle.sdk.headless.readers;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState;", "", "<init>", "()V", "Failed", "InProgress", "Rebooting", "Unknown", "UpToDate", "Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState$Failed;", "Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState$InProgress;", "Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState$Rebooting;", "Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState$Unknown;", "Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState$UpToDate;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ReaderSoftwareUpdateState {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState$Unknown;", "Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown extends com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState {
        public static final com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState.Unknown INSTANCE = new com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState.Unknown();

        private Unknown() {
            super(null);
        }
    }

    private ReaderSoftwareUpdateState() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState$UpToDate;", "Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UpToDate extends com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState {
        public static final com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState.UpToDate INSTANCE = new com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState.UpToDate();

        private UpToDate() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState$InProgress;", "Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState;", "", "percent", "<init>", "(D)V", "D", "getPercent", "()D"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InProgress extends com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState {
        private final double percent;

        public InProgress(double d) {
            super(null);
            this.percent = d;
        }

        public final double getPercent() {
            return this.percent;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState$Failed;", "Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Failed extends com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState {
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState$Rebooting;", "Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Rebooting extends com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState {
        public static final com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState.Rebooting INSTANCE = new com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState.Rebooting();

        private Rebooting() {
            super(null);
        }
    }

    public /* synthetic */ ReaderSoftwareUpdateState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
