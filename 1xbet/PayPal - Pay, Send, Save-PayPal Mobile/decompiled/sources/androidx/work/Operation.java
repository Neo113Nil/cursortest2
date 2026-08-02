package androidx.work;

/* loaded from: classes.dex */
public interface Operation {
    public static final androidx.work.Operation.State.IN_PROGRESS IN_PROGRESS;
    public static final androidx.work.Operation.State.SUCCESS SUCCESS;

    com.google.common.util.concurrent.ListenableFuture<androidx.work.Operation.State.SUCCESS> getResult();

    androidx.view.LiveData<androidx.work.Operation.State> getState();

    static {
        byte b = 0;
        SUCCESS = new androidx.work.Operation.State.SUCCESS(b);
        IN_PROGRESS = new androidx.work.Operation.State.IN_PROGRESS(b);
    }

    /* loaded from: classes3.dex */
    public static abstract class State {
        State() {
        }

        public static final class SUCCESS extends androidx.work.Operation.State {
            /* synthetic */ SUCCESS(byte b) {
                this();
            }

            private SUCCESS() {
            }

            public final java.lang.String toString() {
                return "SUCCESS";
            }
        }

        public static final class IN_PROGRESS extends androidx.work.Operation.State {
            /* synthetic */ IN_PROGRESS(byte b) {
                this();
            }

            private IN_PROGRESS() {
            }

            public final java.lang.String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class FAILURE extends androidx.work.Operation.State {
            private final java.lang.Throwable Camera2StreamConfigurationMap;

            public FAILURE(java.lang.Throwable th) {
                this.Camera2StreamConfigurationMap = th;
            }

            public final java.lang.Throwable getThrowable() {
                return this.Camera2StreamConfigurationMap;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FAILURE (");
                sb.append(this.Camera2StreamConfigurationMap.getMessage());
                sb.append(")");
                return sb.toString();
            }
        }
    }
}
