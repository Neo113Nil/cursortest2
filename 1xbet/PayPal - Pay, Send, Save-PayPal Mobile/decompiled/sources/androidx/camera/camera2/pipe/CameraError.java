package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0012\u0092\u0001\u00020\u000e"}, d2 = {"Landroidx/camera/camera2/pipe/CameraError;", "", "", "isDisconnected-impl", "(I)Z", "isDisconnected", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(I)I", "hashCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class CameraError {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.CameraError.Companion INSTANCE = new androidx.camera.camera2.pipe.CameraError.Companion(null);
    private static final int ERROR_UNDETERMINED = 0;
    private static final int ERROR_CAMERA_IN_USE = 1;
    private static final int ERROR_CAMERA_LIMIT_EXCEEDED = 2;
    private static final int ERROR_CAMERA_DISABLED = 3;
    private static final int ERROR_CAMERA_DEVICE = 4;
    private static final int ERROR_CAMERA_SERVICE = 5;
    private static final int ERROR_CAMERA_DISCONNECTED = 6;
    private static final int ERROR_ILLEGAL_ARGUMENT_EXCEPTION = 7;
    private static final int ERROR_SECURITY_EXCEPTION = 8;
    private static final int ERROR_GRAPH_CONFIG = 9;
    private static final int ERROR_DO_NOT_DISTURB_ENABLED = 10;
    private static final int ERROR_UNKNOWN_EXCEPTION = 11;
    private static final int ERROR_CAMERA_OPENER = 12;
    private static final int ERROR_CAMERA_OPEN_TIMEOUT = 13;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m322equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ CameraError(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* renamed from: isDisconnected-impl, reason: not valid java name */
    public static final boolean m324isDisconnectedimpl(int i) {
        return m322equalsimpl0(i, ERROR_CAMERA_DISCONNECTED) || m322equalsimpl0(i, ERROR_CAMERA_IN_USE) || m322equalsimpl0(i, ERROR_CAMERA_LIMIT_EXCEEDED);
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0007\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u001a\u0010!\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u001a\u0010#\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u001a\u0010%\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\u001a\u0010'\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\u0016R\u001a\u0010)\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b*\u0010\u0016R\u001a\u0010+\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0014\u001a\u0004\b,\u0010\u0016R\u001a\u0010-\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0014\u001a\u0004\b.\u0010\u0016R\u001a\u0010/\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0014\u001a\u0004\b0\u0010\u0016"}, d2 = {"Landroidx/camera/camera2/pipe/CameraError$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "Landroidx/camera/camera2/pipe/CameraError;", "from-PVuDhNw$camera_camera2_pipe", "(Ljava/lang/Throwable;)I", "from", "Landroid/hardware/camera2/CameraAccessException;", "exception", "(Landroid/hardware/camera2/CameraAccessException;)I", "", "stateCallbackError", "(I)I", "", "shouldHandleDoNotDisturbException$camera_camera2_pipe", "(Ljava/lang/Throwable;)Z", "ERROR_UNDETERMINED", com.visa.cbp.getEncExpo.warmup, "getERROR_UNDETERMINED-v7Vf74A", "()I", "ERROR_CAMERA_IN_USE", "getERROR_CAMERA_IN_USE-v7Vf74A", "ERROR_CAMERA_LIMIT_EXCEEDED", "getERROR_CAMERA_LIMIT_EXCEEDED-v7Vf74A", "ERROR_CAMERA_DISABLED", "getERROR_CAMERA_DISABLED-v7Vf74A", "ERROR_CAMERA_DEVICE", "getERROR_CAMERA_DEVICE-v7Vf74A", "ERROR_CAMERA_SERVICE", "getERROR_CAMERA_SERVICE-v7Vf74A", "ERROR_CAMERA_DISCONNECTED", "getERROR_CAMERA_DISCONNECTED-v7Vf74A", "ERROR_ILLEGAL_ARGUMENT_EXCEPTION", "getERROR_ILLEGAL_ARGUMENT_EXCEPTION-v7Vf74A", "ERROR_SECURITY_EXCEPTION", "getERROR_SECURITY_EXCEPTION-v7Vf74A", "ERROR_GRAPH_CONFIG", "getERROR_GRAPH_CONFIG-v7Vf74A", "ERROR_DO_NOT_DISTURB_ENABLED", "getERROR_DO_NOT_DISTURB_ENABLED-v7Vf74A", "ERROR_UNKNOWN_EXCEPTION", "getERROR_UNKNOWN_EXCEPTION-v7Vf74A", "ERROR_CAMERA_OPENER", "getERROR_CAMERA_OPENER-v7Vf74A", "ERROR_CAMERA_OPEN_TIMEOUT", "getERROR_CAMERA_OPEN_TIMEOUT-v7Vf74A"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getERROR_UNDETERMINED-v7Vf74A, reason: not valid java name */
        public final int m342getERROR_UNDETERMINEDv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_UNDETERMINED;
        }

        /* renamed from: getERROR_CAMERA_IN_USE-v7Vf74A, reason: not valid java name */
        public final int m333getERROR_CAMERA_IN_USEv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_CAMERA_IN_USE;
        }

        /* renamed from: getERROR_CAMERA_LIMIT_EXCEEDED-v7Vf74A, reason: not valid java name */
        public final int m334getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_CAMERA_LIMIT_EXCEEDED;
        }

        /* renamed from: getERROR_CAMERA_DISABLED-v7Vf74A, reason: not valid java name */
        public final int m331getERROR_CAMERA_DISABLEDv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_CAMERA_DISABLED;
        }

        /* renamed from: getERROR_CAMERA_DEVICE-v7Vf74A, reason: not valid java name */
        public final int m330getERROR_CAMERA_DEVICEv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_CAMERA_DEVICE;
        }

        /* renamed from: getERROR_CAMERA_SERVICE-v7Vf74A, reason: not valid java name */
        public final int m337getERROR_CAMERA_SERVICEv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_CAMERA_SERVICE;
        }

        /* renamed from: getERROR_CAMERA_DISCONNECTED-v7Vf74A, reason: not valid java name */
        public final int m332getERROR_CAMERA_DISCONNECTEDv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_CAMERA_DISCONNECTED;
        }

        /* renamed from: getERROR_ILLEGAL_ARGUMENT_EXCEPTION-v7Vf74A, reason: not valid java name */
        public final int m340getERROR_ILLEGAL_ARGUMENT_EXCEPTIONv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_ILLEGAL_ARGUMENT_EXCEPTION;
        }

        /* renamed from: getERROR_SECURITY_EXCEPTION-v7Vf74A, reason: not valid java name */
        public final int m341getERROR_SECURITY_EXCEPTIONv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_SECURITY_EXCEPTION;
        }

        /* renamed from: getERROR_GRAPH_CONFIG-v7Vf74A, reason: not valid java name */
        public final int m339getERROR_GRAPH_CONFIGv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_GRAPH_CONFIG;
        }

        /* renamed from: getERROR_DO_NOT_DISTURB_ENABLED-v7Vf74A, reason: not valid java name */
        public final int m338getERROR_DO_NOT_DISTURB_ENABLEDv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_DO_NOT_DISTURB_ENABLED;
        }

        /* renamed from: getERROR_UNKNOWN_EXCEPTION-v7Vf74A, reason: not valid java name */
        public final int m343getERROR_UNKNOWN_EXCEPTIONv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_UNKNOWN_EXCEPTION;
        }

        /* renamed from: getERROR_CAMERA_OPENER-v7Vf74A, reason: not valid java name */
        public final int m335getERROR_CAMERA_OPENERv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_CAMERA_OPENER;
        }

        /* renamed from: getERROR_CAMERA_OPEN_TIMEOUT-v7Vf74A, reason: not valid java name */
        public final int m336getERROR_CAMERA_OPEN_TIMEOUTv7Vf74A() {
            return androidx.camera.camera2.pipe.CameraError.ERROR_CAMERA_OPEN_TIMEOUT;
        }

        /* renamed from: from-PVuDhNw$camera_camera2_pipe, reason: not valid java name */
        public final int m329fromPVuDhNw$camera_camera2_pipe(java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
            if (throwable instanceof android.hardware.camera2.CameraAccessException) {
                return m328fromPVuDhNw$camera_camera2_pipe((android.hardware.camera2.CameraAccessException) throwable);
            }
            if (throwable instanceof java.lang.IllegalArgumentException) {
                return m340getERROR_ILLEGAL_ARGUMENT_EXCEPTIONv7Vf74A();
            }
            if (throwable instanceof java.lang.SecurityException) {
                return m341getERROR_SECURITY_EXCEPTIONv7Vf74A();
            }
            if (shouldHandleDoNotDisturbException$camera_camera2_pipe(throwable)) {
                return m338getERROR_DO_NOT_DISTURB_ENABLEDv7Vf74A();
            }
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
            return m343getERROR_UNKNOWN_EXCEPTIONv7Vf74A();
        }

        /* renamed from: from-PVuDhNw$camera_camera2_pipe, reason: not valid java name */
        public final int m328fromPVuDhNw$camera_camera2_pipe(android.hardware.camera2.CameraAccessException exception) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
            int reason = exception.getReason();
            if (reason == 1) {
                return m331getERROR_CAMERA_DISABLEDv7Vf74A();
            }
            if (reason == 2) {
                return m332getERROR_CAMERA_DISCONNECTEDv7Vf74A();
            }
            if (reason == 3) {
                return m342getERROR_UNDETERMINEDv7Vf74A();
            }
            if (reason == 4) {
                return m333getERROR_CAMERA_IN_USEv7Vf74A();
            }
            if (reason == 5) {
                return m334getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A();
            }
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
            return m343getERROR_UNKNOWN_EXCEPTIONv7Vf74A();
        }

        /* renamed from: from-PVuDhNw$camera_camera2_pipe, reason: not valid java name */
        public final int m327fromPVuDhNw$camera_camera2_pipe(int stateCallbackError) {
            if (stateCallbackError == 1) {
                return m333getERROR_CAMERA_IN_USEv7Vf74A();
            }
            if (stateCallbackError == 2) {
                return m334getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A();
            }
            if (stateCallbackError == 3) {
                return m331getERROR_CAMERA_DISABLEDv7Vf74A();
            }
            if (stateCallbackError == 4) {
                return m330getERROR_CAMERA_DEVICEv7Vf74A();
            }
            if (stateCallbackError == 5) {
                return m337getERROR_CAMERA_SERVICEv7Vf74A();
            }
            throw new java.lang.IllegalArgumentException("Unexpected StateCallback error code: ".concat(java.lang.String.valueOf(stateCallbackError)));
        }

        public final boolean shouldHandleDoNotDisturbException$camera_camera2_pipe(java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
            if (android.os.Build.VERSION.SDK_INT == 28 && (throwable instanceof java.lang.RuntimeException)) {
                java.lang.StackTraceElement[] stackTrace = ((java.lang.RuntimeException) throwable).getStackTrace();
                kotlin.jvm.internal.Intrinsics.checkNotNull(stackTrace);
                if (kotlin.jvm.internal.Intrinsics.areEqual(stackTrace.length == 0 ? null : stackTrace[0].getMethodName(), "_enableShutterSound")) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        return m325toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m325toStringimpl(int i) {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraError(");
        if (m322equalsimpl0(i, ERROR_UNDETERMINED)) {
            str = "ERROR_UNDETERMINED";
        } else if (m322equalsimpl0(i, ERROR_CAMERA_IN_USE)) {
            str = "ERROR_CAMERA_IN_USE";
        } else if (m322equalsimpl0(i, ERROR_CAMERA_LIMIT_EXCEEDED)) {
            str = "ERROR_CAMERA_LIMIT_EXCEEDED";
        } else if (m322equalsimpl0(i, ERROR_CAMERA_DISABLED)) {
            str = "ERROR_CAMERA_DISABLED";
        } else if (m322equalsimpl0(i, ERROR_CAMERA_DEVICE)) {
            str = "ERROR_CAMERA_DEVICE";
        } else if (m322equalsimpl0(i, ERROR_CAMERA_SERVICE)) {
            str = "ERROR_CAMERA_SERVICE";
        } else if (m322equalsimpl0(i, ERROR_CAMERA_DISCONNECTED)) {
            str = "ERROR_CAMERA_DISCONNECTED";
        } else if (m322equalsimpl0(i, ERROR_ILLEGAL_ARGUMENT_EXCEPTION)) {
            str = "ERROR_ILLEGAL_ARGUMENT_EXCEPTION";
        } else if (m322equalsimpl0(i, ERROR_SECURITY_EXCEPTION)) {
            str = "ERROR_SECURITY_EXCEPTION";
        } else if (m322equalsimpl0(i, ERROR_GRAPH_CONFIG)) {
            str = "ERROR_GRAPH_CONFIG";
        } else if (m322equalsimpl0(i, ERROR_DO_NOT_DISTURB_ENABLED)) {
            str = "ERROR_DO_NOT_DISTURB_ENABLED";
        } else if (m322equalsimpl0(i, ERROR_UNKNOWN_EXCEPTION)) {
            str = "ERROR_UNKNOWN_EXCEPTION";
        } else if (m322equalsimpl0(i, ERROR_CAMERA_OPENER)) {
            str = "ERROR_CAMERA_OPENER";
        } else {
            str = m322equalsimpl0(i, ERROR_CAMERA_OPEN_TIMEOUT) ? "ERROR_CAMERA_OPEN_TIMEOUT" : "ERROR_UNKNOWN";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m326unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m323hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m321equalsimpl(this.value, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m323hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m321equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.CameraError) && i == ((androidx.camera.camera2.pipe.CameraError) obj).m326unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.CameraError m320boximpl(int i) {
        return new androidx.camera.camera2.pipe.CameraError(i);
    }
}
