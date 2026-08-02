package io.sentry.transport;

/* loaded from: classes2.dex */
public abstract class TransportResult {

    public static final class ErrorTransportResult extends TransportResult {
        private final int responseCode;

        public ErrorTransportResult(int i7) {
            super();
            this.responseCode = i7;
        }

        @Override // io.sentry.transport.TransportResult
        public int getResponseCode() {
            return this.responseCode;
        }

        @Override // io.sentry.transport.TransportResult
        public boolean isSuccess() {
            return false;
        }
    }

    public static final class SuccessTransportResult extends TransportResult {
        static final SuccessTransportResult INSTANCE = new SuccessTransportResult();

        private SuccessTransportResult() {
            super();
        }

        @Override // io.sentry.transport.TransportResult
        public int getResponseCode() {
            return -1;
        }

        @Override // io.sentry.transport.TransportResult
        public boolean isSuccess() {
            return true;
        }
    }

    public static TransportResult error(int i7) {
        return new ErrorTransportResult(i7);
    }

    public static TransportResult success() {
        return SuccessTransportResult.INSTANCE;
    }

    public abstract int getResponseCode();

    public abstract boolean isSuccess();

    private TransportResult() {
    }

    public static TransportResult error() {
        return error(-1);
    }
}
