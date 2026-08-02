package com.miteksystems.misnap.camera.a;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/miteksystems/misnap/camera/a/d;", "", "", "a", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;II)V", util.h.xy.cb.b.f1091, "c", "d", "e", "f", "g", "h", "camera_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public enum d {
    LIMITED(0),
    FULL(1),
    LEGACY(2),
    LEVEL_3(3),
    EXTERNAL(4),
    UNDEFINED(-1);


    /* renamed from: b, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.camera.a.d.Companion INSTANCE = new com.miteksystems.misnap.camera.a.d.Companion(null);
    private final int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/miteksystems/misnap/camera/a/d$a;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/miteksystems/misnap/camera/a/d;", "a", "(I)Lcom/miteksystems/misnap/camera/a/d;"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.miteksystems.misnap.camera.a.d$a, reason: from kotlin metadata */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final /* synthetic */ com.miteksystems.misnap.camera.a.d a(int value) {
            return (com.miteksystems.misnap.camera.a.d.values().length + (-1) <= value || value < 0) ? com.miteksystems.misnap.camera.a.d.UNDEFINED : com.miteksystems.misnap.camera.a.d.values()[value];
        }

        private Companion() {
        }
    }

    d(int i) {
        this.getHighSpeedVideoSizes = i;
    }
}
