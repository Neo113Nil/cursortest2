package rx.exceptions;

/* loaded from: classes18.dex */
public final class OnErrorThrowable extends java.lang.RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final java.lang.Object getHighSpeedVideoSizes;

    private OnErrorThrowable(java.lang.Throwable th) {
        super(th);
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighSpeedVideoSizes = null;
    }

    private OnErrorThrowable(java.lang.Throwable th, java.lang.Object obj) {
        super(th);
        this.getHighSpeedVideoFpsRangesFor = true;
        if (!(obj instanceof java.io.Serializable)) {
            try {
                obj = java.lang.String.valueOf(obj);
            } catch (java.lang.Throwable th2) {
                obj = th2.getMessage();
            }
        }
        this.getHighSpeedVideoSizes = obj;
    }

    public final java.lang.Object getValue() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean isValueNull() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static rx.exceptions.OnErrorThrowable from(java.lang.Throwable th) {
        if (th == null) {
            th = new java.lang.NullPointerException();
        }
        java.lang.Throwable finalCause = rx.exceptions.Exceptions.getFinalCause(th);
        if (finalCause instanceof rx.exceptions.OnErrorThrowable.OnNextValue) {
            return new rx.exceptions.OnErrorThrowable(th, ((rx.exceptions.OnErrorThrowable.OnNextValue) finalCause).getValue());
        }
        return new rx.exceptions.OnErrorThrowable(th);
    }

    public static java.lang.Throwable addValueAsLastCause(java.lang.Throwable th, java.lang.Object obj) {
        if (th == null) {
            th = new java.lang.NullPointerException();
        }
        java.lang.Throwable finalCause = rx.exceptions.Exceptions.getFinalCause(th);
        if ((finalCause instanceof rx.exceptions.OnErrorThrowable.OnNextValue) && ((rx.exceptions.OnErrorThrowable.OnNextValue) finalCause).getValue() == obj) {
            return th;
        }
        rx.exceptions.Exceptions.addCause(th, new rx.exceptions.OnErrorThrowable.OnNextValue(obj));
        return th;
    }

    public static class OnNextValue extends java.lang.RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        private final java.lang.Object getHighSpeedVideoSizes;

        static final class Primitives {
            static final java.util.Set<java.lang.Class<?>> getHighSpeedVideoFpsRanges;

            Primitives() {
            }

            static {
                java.util.HashSet hashSet = new java.util.HashSet();
                hashSet.add(java.lang.Boolean.class);
                hashSet.add(java.lang.Character.class);
                hashSet.add(java.lang.Byte.class);
                hashSet.add(java.lang.Short.class);
                hashSet.add(java.lang.Integer.class);
                hashSet.add(java.lang.Long.class);
                hashSet.add(java.lang.Float.class);
                hashSet.add(java.lang.Double.class);
                getHighSpeedVideoFpsRanges = hashSet;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public OnNextValue(java.lang.Object obj) {
            super(r0.toString());
            java.lang.String handleOnNextValueRendering;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnError while emitting onNext value: ");
            if (obj == null) {
                handleOnNextValueRendering = "null";
            } else if (rx.exceptions.OnErrorThrowable.OnNextValue.Primitives.getHighSpeedVideoFpsRanges.contains(obj.getClass())) {
                handleOnNextValueRendering = obj.toString();
            } else if (obj instanceof java.lang.String) {
                handleOnNextValueRendering = (java.lang.String) obj;
            } else if (obj instanceof java.lang.Enum) {
                handleOnNextValueRendering = ((java.lang.Enum) obj).name();
            } else {
                handleOnNextValueRendering = rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleOnNextValueRendering(obj);
                if (handleOnNextValueRendering == null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(obj.getClass().getName());
                    sb2.append(".class");
                    handleOnNextValueRendering = sb2.toString();
                }
            }
            sb.append(handleOnNextValueRendering);
            if (!(obj instanceof java.io.Serializable)) {
                try {
                    obj = java.lang.String.valueOf(obj);
                } catch (java.lang.Throwable th) {
                    obj = th.getMessage();
                }
            }
            this.getHighSpeedVideoSizes = obj;
        }

        public java.lang.Object getValue() {
            return this.getHighSpeedVideoSizes;
        }
    }
}
