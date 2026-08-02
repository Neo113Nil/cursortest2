package rx;

/* loaded from: classes18.dex */
public final class BackpressureOverflow {
    public static final rx.BackpressureOverflow.Strategy ON_OVERFLOW_DEFAULT;
    public static final rx.BackpressureOverflow.Strategy ON_OVERFLOW_DROP_LATEST;
    public static final rx.BackpressureOverflow.Strategy ON_OVERFLOW_DROP_OLDEST;
    public static final rx.BackpressureOverflow.Strategy ON_OVERFLOW_ERROR;

    public interface Strategy {
        boolean mayAttemptDrop() throws rx.exceptions.MissingBackpressureException;
    }

    private BackpressureOverflow() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    static {
        rx.BackpressureOverflow.Error error = rx.BackpressureOverflow.Error.getHighResolutionOutputSizeshNQ4ISI;
        ON_OVERFLOW_ERROR = error;
        ON_OVERFLOW_DEFAULT = error;
        ON_OVERFLOW_DROP_OLDEST = rx.BackpressureOverflow.DropOldest.getHighResolutionOutputSizeshNQ4ISI;
        ON_OVERFLOW_DROP_LATEST = rx.BackpressureOverflow.DropLatest.Camera2StreamConfigurationMap;
    }

    static final class DropOldest implements rx.BackpressureOverflow.Strategy {
        static final rx.BackpressureOverflow.DropOldest getHighResolutionOutputSizeshNQ4ISI = new rx.BackpressureOverflow.DropOldest();

        @Override // rx.BackpressureOverflow.Strategy
        public final boolean mayAttemptDrop() {
            return true;
        }

        private DropOldest() {
        }
    }

    static final class DropLatest implements rx.BackpressureOverflow.Strategy {
        static final rx.BackpressureOverflow.DropLatest Camera2StreamConfigurationMap = new rx.BackpressureOverflow.DropLatest();

        @Override // rx.BackpressureOverflow.Strategy
        public final boolean mayAttemptDrop() {
            return false;
        }

        private DropLatest() {
        }
    }

    static final class Error implements rx.BackpressureOverflow.Strategy {
        static final rx.BackpressureOverflow.Error getHighResolutionOutputSizeshNQ4ISI = new rx.BackpressureOverflow.Error();

        private Error() {
        }

        @Override // rx.BackpressureOverflow.Strategy
        public final boolean mayAttemptDrop() throws rx.exceptions.MissingBackpressureException {
            throw new rx.exceptions.MissingBackpressureException("Overflowed buffer");
        }
    }
}
