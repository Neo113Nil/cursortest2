package io.reactivex.exceptions;

/* loaded from: classes17.dex */
public final class CompositeException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private final java.util.List<java.lang.Throwable> Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.Throwable getHighSpeedVideoSizes;

    public CompositeException(java.lang.Throwable... thArr) {
        this(thArr == null ? java.util.Collections.singletonList(new java.lang.NullPointerException("exceptions was null")) : java.util.Arrays.asList(thArr));
    }

    public CompositeException(java.lang.Iterable<? extends java.lang.Throwable> iterable) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (iterable != null) {
            for (java.lang.Throwable th : iterable) {
                if (th instanceof io.reactivex.exceptions.CompositeException) {
                    linkedHashSet.addAll(((io.reactivex.exceptions.CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new java.lang.NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new java.lang.NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new java.lang.IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        java.util.List<java.lang.Throwable> unmodifiableList = java.util.Collections.unmodifiableList(arrayList);
        this.Camera2StreamConfigurationMap = unmodifiableList;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(unmodifiableList.size());
        sb.append(" exceptions occurred. ");
        this.getHighSpeedVideoFpsRangesFor = sb.toString();
    }

    public final java.util.List<java.lang.Throwable> getExceptions() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        java.lang.Throwable th;
        synchronized (this) {
            if (this.getHighSpeedVideoSizes == null) {
                io.reactivex.exceptions.CompositeException.CompositeExceptionCausalChain compositeExceptionCausalChain = new io.reactivex.exceptions.CompositeException.CompositeExceptionCausalChain();
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator<java.lang.Throwable> it = this.Camera2StreamConfigurationMap.iterator();
                io.reactivex.exceptions.CompositeException.CompositeExceptionCausalChain compositeExceptionCausalChain2 = compositeExceptionCausalChain;
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
                                cause = cause2;
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
                        if (cause3 != null && this.getHighSpeedVideoSizes != cause3) {
                            while (true) {
                                java.lang.Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause4;
                            }
                            compositeExceptionCausalChain2 = cause3;
                        }
                    }
                }
                this.getHighSpeedVideoSizes = compositeExceptionCausalChain;
            }
            th = this.getHighSpeedVideoSizes;
        }
        return th;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(java.lang.System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintStream printStream) {
        getHighResolutionOutputSizeshNQ4ISI(new io.reactivex.exceptions.CompositeException.WrappedPrintStream(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintWriter printWriter) {
        getHighResolutionOutputSizeshNQ4ISI(new io.reactivex.exceptions.CompositeException.WrappedPrintWriter(printWriter));
    }

    private void getHighResolutionOutputSizeshNQ4ISI(io.reactivex.exceptions.CompositeException.PrintStreamOrWriter printStreamOrWriter) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (java.lang.StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (java.lang.Throwable th : this.Camera2StreamConfigurationMap) {
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
        printStreamOrWriter.getHighSpeedVideoFpsRangesFor(sb.toString());
    }

    static abstract class PrintStreamOrWriter {
        abstract void getHighSpeedVideoFpsRangesFor(java.lang.Object obj);

        PrintStreamOrWriter() {
        }
    }

    static final class WrappedPrintStream extends io.reactivex.exceptions.CompositeException.PrintStreamOrWriter {
        private final java.io.PrintStream Camera2StreamConfigurationMap;

        WrappedPrintStream(java.io.PrintStream printStream) {
            this.Camera2StreamConfigurationMap = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        final void getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
            this.Camera2StreamConfigurationMap.println(obj);
        }
    }

    static final class WrappedPrintWriter extends io.reactivex.exceptions.CompositeException.PrintStreamOrWriter {
        private final java.io.PrintWriter getHighSpeedVideoFpsRanges;

        WrappedPrintWriter(java.io.PrintWriter printWriter) {
            this.getHighSpeedVideoFpsRanges = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        final void getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
            this.getHighSpeedVideoFpsRanges.println(obj);
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

    public final int size() {
        return this.Camera2StreamConfigurationMap.size();
    }
}
