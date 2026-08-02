package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/miteksystems/misnap/core/ColorSpace;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "a", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Companion", "RGB", "ARGB", "GRAY", "BGRA", "NV21", "RGBA", "UNDEFINED"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public enum ColorSpace {
    RGB(0),
    ARGB(1),
    GRAY(2),
    BGRA(3),
    NV21(4),
    RGBA(5),
    UNDEFINED(-1);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.core.ColorSpace.Companion INSTANCE = new com.miteksystems.misnap.core.ColorSpace.Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    public final int getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/miteksystems/misnap/core/ColorSpace$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/miteksystems/misnap/core/ColorSpace;", "valueOf", "(I)Lcom/miteksystems/misnap/core/ColorSpace;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.miteksystems.misnap.core.ColorSpace valueOf(int value) {
            return (com.miteksystems.misnap.core.ColorSpace.values().length + (-1) <= value || value < 0) ? com.miteksystems.misnap.core.ColorSpace.UNDEFINED : com.miteksystems.misnap.core.ColorSpace.values()[value];
        }

        private Companion() {
        }
    }

    ColorSpace(int i) {
        this.value = i;
    }
}
