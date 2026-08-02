package org.chromium.net.impl;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* loaded from: classes4.dex */
public final class JavaUrlRequestUtils {

    public interface CheckedRunnable {
        void run() throws Exception;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
        public static final int AWAITING_FOLLOW_REDIRECT = 3;
        public static final int AWAITING_READ = 4;
        public static final int CANCELLED = 8;
        public static final int COMPLETE = 7;
        public static final int ERROR = 6;
        public static final int NOT_STARTED = 0;
        public static final int READING = 5;
        public static final int REDIRECT_RECEIVED = 2;
        public static final int STARTED = 1;
    }

    public static String stateToString(int state) {
        switch (state) {
            case 0:
                return "NOT_STARTED";
            case 1:
                return "STARTED";
            case 2:
                return "REDIRECT_RECEIVED";
            case 3:
                return "AWAITING_FOLLOW_REDIRECT";
            case 4:
                return "AWAITING_READ";
            case 5:
                return "READING";
            case 6:
                return "ERROR";
            case 7:
                return "COMPLETE";
            case 8:
                return "CANCELLED";
            default:
                throw new IllegalArgumentException("Unknown state " + state);
        }
    }

    public static final class DirectPreventingExecutor implements Executor {
        private final Executor mDelegate;

        public DirectPreventingExecutor(Executor delegate) {
            this.mDelegate = delegate;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            InlineCheckingRunnable inlineCheckingRunnable = new InlineCheckingRunnable(command, Thread.currentThread());
            this.mDelegate.execute(inlineCheckingRunnable);
            if (inlineCheckingRunnable.mExecutedInline != null) {
                throw inlineCheckingRunnable.mExecutedInline;
            }
            inlineCheckingRunnable.mCallingThread = null;
        }

        private static final class InlineCheckingRunnable implements Runnable {
            private Thread mCallingThread;
            private final Runnable mCommand;
            private InlineExecutionProhibitedException mExecutedInline;

            private InlineCheckingRunnable(Runnable command, Thread callingThread) {
                this.mCommand = command;
                this.mCallingThread = callingThread;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (Thread.currentThread() == this.mCallingThread) {
                    this.mExecutedInline = new InlineExecutionProhibitedException();
                } else {
                    this.mCommand.run();
                }
            }
        }
    }
}
