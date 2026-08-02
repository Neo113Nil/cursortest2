package rx.exceptions;

/* loaded from: classes18.dex */
public final class Exceptions {
    private Exceptions() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static java.lang.RuntimeException propagate(java.lang.Throwable th) {
        if (th instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) th);
        }
        if (th instanceof java.lang.Error) {
            throw ((java.lang.Error) th);
        }
        throw new java.lang.RuntimeException(th);
    }

    public static void throwIfFatal(java.lang.Throwable th) {
        if (th instanceof rx.exceptions.OnErrorNotImplementedException) {
            throw ((rx.exceptions.OnErrorNotImplementedException) th);
        }
        if (th instanceof rx.exceptions.OnErrorFailedException) {
            throw ((rx.exceptions.OnErrorFailedException) th);
        }
        if (th instanceof rx.exceptions.OnCompletedFailedException) {
            throw ((rx.exceptions.OnCompletedFailedException) th);
        }
        if (th instanceof java.lang.VirtualMachineError) {
            throw ((java.lang.VirtualMachineError) th);
        }
        if (th instanceof java.lang.ThreadDeath) {
            throw ((java.lang.ThreadDeath) th);
        }
        if (th instanceof java.lang.LinkageError) {
            throw ((java.lang.LinkageError) th);
        }
    }

    public static void addCause(java.lang.Throwable th, java.lang.Throwable th2) {
        java.util.HashSet hashSet = new java.util.HashSet();
        int i = 0;
        while (th.getCause() != null) {
            if (i >= 25) {
                return;
            }
            th = th.getCause();
            if (!hashSet.contains(th.getCause())) {
                hashSet.add(th.getCause());
                i++;
            }
        }
        try {
            th.initCause(th2);
        } catch (java.lang.Throwable unused) {
        }
    }

    public static java.lang.Throwable getFinalCause(java.lang.Throwable th) {
        int i = 0;
        while (th.getCause() != null) {
            if (i >= 25) {
                return new java.lang.RuntimeException("Stack too deep to get final cause");
            }
            th = th.getCause();
            i++;
        }
        return th;
    }

    public static void throwIfAny(java.util.List<? extends java.lang.Throwable> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            java.lang.Throwable th = list.get(0);
            if (th instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) th);
            }
            if (th instanceof java.lang.Error) {
                throw ((java.lang.Error) th);
            }
            throw new java.lang.RuntimeException(th);
        }
        throw new rx.exceptions.CompositeException(list);
    }

    public static void throwOrReport(java.lang.Throwable th, rx.Observer<?> observer, java.lang.Object obj) {
        throwIfFatal(th);
        observer.onError(rx.exceptions.OnErrorThrowable.addValueAsLastCause(th, obj));
    }

    public static void throwOrReport(java.lang.Throwable th, rx.SingleSubscriber<?> singleSubscriber, java.lang.Object obj) {
        throwIfFatal(th);
        singleSubscriber.onError(rx.exceptions.OnErrorThrowable.addValueAsLastCause(th, obj));
    }

    public static void throwOrReport(java.lang.Throwable th, rx.Observer<?> observer) {
        throwIfFatal(th);
        observer.onError(th);
    }

    public static void throwOrReport(java.lang.Throwable th, rx.SingleSubscriber<?> singleSubscriber) {
        throwIfFatal(th);
        singleSubscriber.onError(th);
    }
}
