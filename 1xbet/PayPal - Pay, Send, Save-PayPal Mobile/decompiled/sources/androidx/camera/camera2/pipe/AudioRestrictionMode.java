package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/AudioRestrictionMode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class AudioRestrictionMode {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.AudioRestrictionMode.Companion INSTANCE = new androidx.camera.camera2.pipe.AudioRestrictionMode.Companion(null);
    private static final int AUDIO_RESTRICTION_NONE = m185constructorimpl(0);
    private static final int AUDIO_RESTRICTION_VIBRATION = m185constructorimpl(1);
    private static final int AUDIO_RESTRICTION_VIBRATION_SOUND = m185constructorimpl(3);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m185constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m187equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/AudioRestrictionMode$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/AudioRestrictionMode;", "AUDIO_RESTRICTION_NONE", com.visa.cbp.getEncExpo.warmup, "getAUDIO_RESTRICTION_NONE-_b5Q8KE", "()I", "AUDIO_RESTRICTION_VIBRATION", "getAUDIO_RESTRICTION_VIBRATION-_b5Q8KE", "AUDIO_RESTRICTION_VIBRATION_SOUND", "getAUDIO_RESTRICTION_VIBRATION_SOUND-_b5Q8KE"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAUDIO_RESTRICTION_NONE-_b5Q8KE, reason: not valid java name */
        public final int m191getAUDIO_RESTRICTION_NONE_b5Q8KE() {
            return androidx.camera.camera2.pipe.AudioRestrictionMode.AUDIO_RESTRICTION_NONE;
        }

        /* renamed from: getAUDIO_RESTRICTION_VIBRATION-_b5Q8KE, reason: not valid java name */
        public final int m192getAUDIO_RESTRICTION_VIBRATION_b5Q8KE() {
            return androidx.camera.camera2.pipe.AudioRestrictionMode.AUDIO_RESTRICTION_VIBRATION;
        }

        /* renamed from: getAUDIO_RESTRICTION_VIBRATION_SOUND-_b5Q8KE, reason: not valid java name */
        public final int m193getAUDIO_RESTRICTION_VIBRATION_SOUND_b5Q8KE() {
            return androidx.camera.camera2.pipe.AudioRestrictionMode.AUDIO_RESTRICTION_VIBRATION_SOUND;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ AudioRestrictionMode(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m190unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m189toStringimpl(this.value);
    }

    public final int hashCode() {
        return m188hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m186equalsimpl(this.value, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m189toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioRestrictionMode(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m188hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m186equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.AudioRestrictionMode) && i == ((androidx.camera.camera2.pipe.AudioRestrictionMode) obj).m190unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.AudioRestrictionMode m184boximpl(int i) {
        return new androidx.camera.camera2.pipe.AudioRestrictionMode(i);
    }
}
