package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Landroidx/camera/camera2/pipe/Result3A;", "", "Landroidx/camera/camera2/pipe/Result3A$Status;", "status", "Landroidx/camera/camera2/pipe/FrameMetadata;", "frameMetadata", "<init>", "(ILandroidx/camera/camera2/pipe/FrameMetadata;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-JvTi9ms", "()I", "component1", "component2", "()Landroidx/camera/camera2/pipe/FrameMetadata;", "copy-XT8YZL4", "(ILandroidx/camera/camera2/pipe/FrameMetadata;)Landroidx/camera/camera2/pipe/Result3A;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStatus-JvTi9ms", "Landroidx/camera/camera2/pipe/FrameMetadata;", "getFrameMetadata", "Status"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Result3A {
    private final androidx.camera.camera2.pipe.FrameMetadata frameMetadata;
    private final int status;

    private Result3A(int i, androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        this.status = i;
        this.frameMetadata = frameMetadata;
    }

    public /* synthetic */ Result3A(int i, androidx.camera.camera2.pipe.FrameMetadata frameMetadata, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : frameMetadata, null);
    }

    public final androidx.camera.camera2.pipe.FrameMetadata getFrameMetadata() {
        return this.frameMetadata;
    }

    /* renamed from: getStatus-JvTi9ms, reason: not valid java name */
    public final int m690getStatusJvTi9ms() {
        return this.status;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u000f\u0092\u0001\u00020\u0007"}, d2 = {"Landroidx/camera/camera2/pipe/Result3A$Status;", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(I)I", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class Status {
        private final int value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.pipe.Result3A.Status.Companion INSTANCE = new androidx.camera.camera2.pipe.Result3A.Status.Companion(null);
        private static final int OK = 0;
        private static final int FRAME_LIMIT_REACHED = 1;
        private static final int TIME_LIMIT_REACHED = 2;
        private static final int SUBMIT_CANCELLED = 3;
        private static final int SUBMIT_FAILED = 4;

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m693equalsimpl0(int i, int i2) {
            return i == i2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/Result3A$Status$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/Result3A$Status;", com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton, com.visa.cbp.getEncExpo.warmup, "getOK-JvTi9ms", "()I", "FRAME_LIMIT_REACHED", "getFRAME_LIMIT_REACHED-JvTi9ms", "TIME_LIMIT_REACHED", "getTIME_LIMIT_REACHED-JvTi9ms", "SUBMIT_CANCELLED", "getSUBMIT_CANCELLED-JvTi9ms", "SUBMIT_FAILED", "getSUBMIT_FAILED-JvTi9ms"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getOK-JvTi9ms, reason: not valid java name */
            public final int m698getOKJvTi9ms() {
                return androidx.camera.camera2.pipe.Result3A.Status.OK;
            }

            /* renamed from: getFRAME_LIMIT_REACHED-JvTi9ms, reason: not valid java name */
            public final int m697getFRAME_LIMIT_REACHEDJvTi9ms() {
                return androidx.camera.camera2.pipe.Result3A.Status.FRAME_LIMIT_REACHED;
            }

            /* renamed from: getTIME_LIMIT_REACHED-JvTi9ms, reason: not valid java name */
            public final int m701getTIME_LIMIT_REACHEDJvTi9ms() {
                return androidx.camera.camera2.pipe.Result3A.Status.TIME_LIMIT_REACHED;
            }

            /* renamed from: getSUBMIT_CANCELLED-JvTi9ms, reason: not valid java name */
            public final int m699getSUBMIT_CANCELLEDJvTi9ms() {
                return androidx.camera.camera2.pipe.Result3A.Status.SUBMIT_CANCELLED;
            }

            /* renamed from: getSUBMIT_FAILED-JvTi9ms, reason: not valid java name */
            public final int m700getSUBMIT_FAILEDJvTi9ms() {
                return androidx.camera.camera2.pipe.Result3A.Status.SUBMIT_FAILED;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ Status(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m696unboximpl() {
            return this.value;
        }

        public final java.lang.String toString() {
            return m695toStringimpl(this.value);
        }

        public final int hashCode() {
            return m694hashCodeimpl(this.value);
        }

        public final boolean equals(java.lang.Object obj) {
            return m692equalsimpl(this.value, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m695toStringimpl(int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Status(value=");
            sb.append(i);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m694hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m692equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.camera.camera2.pipe.Result3A.Status) && i == ((androidx.camera.camera2.pipe.Result3A.Status) obj).m696unboximpl();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.camera.camera2.pipe.Result3A.Status m691boximpl(int i) {
            return new androidx.camera.camera2.pipe.Result3A.Status(i);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Result3A(status=");
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.Result3A.Status.m695toStringimpl(this.status));
        sb.append(", frameMetadata=");
        sb.append(this.frameMetadata);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int m694hashCodeimpl = androidx.camera.camera2.pipe.Result3A.Status.m694hashCodeimpl(this.status);
        androidx.camera.camera2.pipe.FrameMetadata frameMetadata = this.frameMetadata;
        return (m694hashCodeimpl * 31) + (frameMetadata == null ? 0 : frameMetadata.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.camera2.pipe.Result3A)) {
            return false;
        }
        androidx.camera.camera2.pipe.Result3A result3A = (androidx.camera.camera2.pipe.Result3A) other;
        return androidx.camera.camera2.pipe.Result3A.Status.m693equalsimpl0(this.status, result3A.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.frameMetadata, result3A.frameMetadata);
    }

    /* renamed from: copy-XT8YZL4, reason: not valid java name */
    public final androidx.camera.camera2.pipe.Result3A m689copyXT8YZL4(int status, androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        return new androidx.camera.camera2.pipe.Result3A(status, frameMetadata, null);
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.camera.camera2.pipe.FrameMetadata getFrameMetadata() {
        return this.frameMetadata;
    }

    /* renamed from: component1-JvTi9ms, reason: not valid java name and from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: copy-XT8YZL4$default, reason: not valid java name */
    public static /* synthetic */ androidx.camera.camera2.pipe.Result3A m687copyXT8YZL4$default(androidx.camera.camera2.pipe.Result3A result3A, int i, androidx.camera.camera2.pipe.FrameMetadata frameMetadata, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = result3A.status;
        }
        if ((i2 & 2) != 0) {
            frameMetadata = result3A.frameMetadata;
        }
        return result3A.m689copyXT8YZL4(i, frameMetadata);
    }

    public /* synthetic */ Result3A(int i, androidx.camera.camera2.pipe.FrameMetadata frameMetadata, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, frameMetadata);
    }
}
