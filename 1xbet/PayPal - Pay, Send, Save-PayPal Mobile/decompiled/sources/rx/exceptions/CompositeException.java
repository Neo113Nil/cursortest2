package rx.exceptions;

/* loaded from: classes18.dex */
public final class CompositeException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.util.List<java.lang.Throwable> getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Throwable getHighSpeedVideoFpsRangesFor;

    @java.lang.Deprecated
    public CompositeException(java.lang.String str, java.util.Collection<? extends java.lang.Throwable> collection) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (collection != null) {
            for (java.lang.Throwable th : collection) {
                if (th instanceof rx.exceptions.CompositeException) {
                    linkedHashSet.addAll(((rx.exceptions.CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new java.lang.NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new java.lang.NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        java.util.List<java.lang.Throwable> unmodifiableList = java.util.Collections.unmodifiableList(arrayList);
        this.getHighResolutionOutputSizeshNQ4ISI = unmodifiableList;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(unmodifiableList.size());
        sb.append(" exceptions occurred. ");
        this.Camera2StreamConfigurationMap = sb.toString();
    }

    public CompositeException(java.util.Collection<? extends java.lang.Throwable> collection) {
        this(null, collection);
    }

    public CompositeException(java.lang.Throwable... thArr) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (thArr != null) {
            for (java.lang.Throwable th : thArr) {
                if (th instanceof rx.exceptions.CompositeException) {
                    linkedHashSet.addAll(((rx.exceptions.CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new java.lang.NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new java.lang.NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        java.util.List<java.lang.Throwable> unmodifiableList = java.util.Collections.unmodifiableList(arrayList);
        this.getHighResolutionOutputSizeshNQ4ISI = unmodifiableList;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(unmodifiableList.size());
        sb.append(" exceptions occurred. ");
        this.Camera2StreamConfigurationMap = sb.toString();
    }

    public final java.util.List<java.lang.Throwable> getExceptions() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        java.lang.Throwable th;
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                rx.exceptions.CompositeException.CompositeExceptionCausalChain compositeExceptionCausalChain = new rx.exceptions.CompositeException.CompositeExceptionCausalChain();
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator<java.lang.Throwable> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                rx.exceptions.CompositeException.CompositeExceptionCausalChain compositeExceptionCausalChain2 = compositeExceptionCausalChain;
                while (it.hasNext()) {
                    java.lang.Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        java.util.ArrayList<java.lang.Throwable> arrayList = new java.util.ArrayList();
                        java.lang.Throwable cause = next.getCause();
                        if (cause != null && cause != next) {
                            while (true) {
                                arrayList.add(cause);
                                java.lang.Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause.getCause();
                            }
                        }
                        for (java.lang.Throwable th2 : arrayList) {
                            if (hashSet.contains(th2)) {
                                next = new java.lang.RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            compositeExceptionCausalChain2.initCause(next);
                        } catch (java.lang.Throwable unused) {
                        }
                        java.lang.Throwable cause3 = compositeExceptionCausalChain2.getCause();
                        if (cause3 != null && cause3 != compositeExceptionCausalChain2) {
                            while (true) {
                                java.lang.Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause3.getCause();
                            }
                            compositeExceptionCausalChain2 = cause3;
                        }
                    }
                }
                this.getHighSpeedVideoFpsRangesFor = compositeExceptionCausalChain;
            }
            th = this.getHighSpeedVideoFpsRangesFor;
        }
        return th;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(java.lang.System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintStream printStream) {
        getHighResolutionOutputSizeshNQ4ISI(new rx.exceptions.CompositeException.WrappedPrintStream(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintWriter printWriter) {
        getHighResolutionOutputSizeshNQ4ISI(new rx.exceptions.CompositeException.WrappedPrintWriter(printWriter));
    }

    private void getHighResolutionOutputSizeshNQ4ISI(rx.exceptions.CompositeException.PrintStreamOrWriter printStreamOrWriter) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (java.lang.StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (java.lang.Throwable th : this.getHighResolutionOutputSizeshNQ4ISI) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            java.lang.String str = "\t";
            while (true) {
                sb.append(str);
                sb.append(th);
                sb.append('\n');
                for (java.lang.StackTraceElement stackTraceElement2 : th.getStackTrace()) {
                    sb.append("\t\tat ");
                    sb.append(stackTraceElement2);
                    sb.append('\n');
                }
                if (th.getCause() != null) {
                    sb.append("\tCaused by: ");
                    th = th.getCause();
                    str = "";
                }
            }
            i++;
        }
        synchronized (printStreamOrWriter.getHighSpeedVideoFpsRanges()) {
            printStreamOrWriter.getHighResolutionOutputSizeshNQ4ISI(sb.toString());
        }
    }

    static abstract class PrintStreamOrWriter {
        abstract void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj);

        abstract java.lang.Object getHighSpeedVideoFpsRanges();

        PrintStreamOrWriter() {
        }
    }

    static final class WrappedPrintStream extends rx.exceptions.CompositeException.PrintStreamOrWriter {
        private final java.io.PrintStream getHighSpeedVideoSizes;

        WrappedPrintStream(java.io.PrintStream printStream) {
            this.getHighSpeedVideoSizes = printStream;
        }

        @Override // rx.exceptions.CompositeException.PrintStreamOrWriter
        final java.lang.Object getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // rx.exceptions.CompositeException.PrintStreamOrWriter
        final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
            this.getHighSpeedVideoSizes.println(obj);
        }
    }

    static final class WrappedPrintWriter extends rx.exceptions.CompositeException.PrintStreamOrWriter {
        private final java.io.PrintWriter getHighResolutionOutputSizeshNQ4ISI;

        WrappedPrintWriter(java.io.PrintWriter printWriter) {
            this.getHighResolutionOutputSizeshNQ4ISI = printWriter;
        }

        @Override // rx.exceptions.CompositeException.PrintStreamOrWriter
        final java.lang.Object getHighSpeedVideoFpsRanges() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // rx.exceptions.CompositeException.PrintStreamOrWriter
        final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
            this.getHighResolutionOutputSizeshNQ4ISI.println(obj);
        }
    }

    static final class CompositeExceptionCausalChain extends java.lang.RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        CompositeExceptionCausalChain() {
        }

        @Override // java.lang.Throwable
        public final java.lang.String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }
}
