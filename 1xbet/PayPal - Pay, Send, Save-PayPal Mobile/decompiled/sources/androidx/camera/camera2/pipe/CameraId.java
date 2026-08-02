package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/CameraId;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "", "toCamera1Id-impl", "(Ljava/lang/String;)Ljava/lang/Integer;", "toCamera1Id", "toString-impl", "toString", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class CameraId {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.CameraId.Companion INSTANCE = new androidx.camera.camera2.pipe.CameraId.Companion(null);
    private final java.lang.String value;

    private /* synthetic */ CameraId(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m393constructorimpl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("CameraId cannot be null or blank!".toString());
        }
        return str;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0086\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/camera2/pipe/CameraId$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/camera/camera2/pipe/CameraId;", "fromCamera2Id-c9D3src", "(Ljava/lang/String;)Ljava/lang/String;", "fromCamera2Id", "", "fromCamera1Id-c9D3src", "(I)Ljava/lang/String;", "fromCamera1Id"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: fromCamera2Id-c9D3src, reason: not valid java name */
        public final java.lang.String m401fromCamera2Idc9D3src(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return androidx.camera.camera2.pipe.CameraId.m393constructorimpl(value);
        }

        /* renamed from: fromCamera1Id-c9D3src, reason: not valid java name */
        public final java.lang.String m400fromCamera1Idc9D3src(int value) {
            return androidx.camera.camera2.pipe.CameraId.m393constructorimpl(java.lang.String.valueOf(value));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: toCamera1Id-impl, reason: not valid java name */
    public static final java.lang.Integer m397toCamera1Idimpl(java.lang.String str) {
        return kotlin.text.StringsKt.toIntOrNull(str);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m398toStringimpl(java.lang.String str) {
        return "CameraId-".concat(java.lang.String.valueOf(str));
    }

    public final java.lang.String toString() {
        return m398toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m399unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m396hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m394equalsimpl(this.value, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m396hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m395equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m394equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.CameraId) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((androidx.camera.camera2.pipe.CameraId) obj).m399unboximpl());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.CameraId m392boximpl(java.lang.String str) {
        return new androidx.camera.camera2.pipe.CameraId(str);
    }
}
