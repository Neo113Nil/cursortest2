package com.miteksystems.misnap.document.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0004B\u0019\b\u0002\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011B\u0019\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u000f\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0004\u0010\tR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/miteksystems/misnap/document/internal/SpikeNormalizer;", "", "", "finalize", "a", "()V", "", "iqaResult", "", "(I)Z", "", "J", "swigCPtr", util.h.xy.cb.b.f1091, "Z", "swigCMemOwn", "<init>", "(JZ)V", "threshold", "numFramesRequired", "(II)V", "c", "document-analysis_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class SpikeNormalizer {
    private static final com.miteksystems.misnap.document.internal.SpikeNormalizer.a getHighSpeedVideoFpsRangesFor = new com.miteksystems.misnap.document.internal.SpikeNormalizer.a(null);
    private transient long Camera2StreamConfigurationMap;
    private transient boolean getHighResolutionOutputSizeshNQ4ISI;

    public SpikeNormalizer(int i, int i2) {
        this(com.miteksystems.misnap.document.internal.SpikeNormalizerSwigModuleJNI.getHighSpeedVideoSizes.new_SpikeNormalizer(i, i2));
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void finalize() {
        synchronized (this) {
            long j = this.Camera2StreamConfigurationMap;
            if (j != 0) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighResolutionOutputSizeshNQ4ISI = false;
                    com.miteksystems.misnap.document.internal.SpikeNormalizerSwigModuleJNI.getHighSpeedVideoSizes.delete_SpikeNormalizer(j);
                }
                this.Camera2StreamConfigurationMap = 0L;
            }
        }
    }

    private SpikeNormalizer(long j) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    public final /* synthetic */ boolean a(int iqaResult) {
        return com.miteksystems.misnap.document.internal.SpikeNormalizerSwigModuleJNI.getHighSpeedVideoSizes.SpikeNormalizer_isSpike(this.Camera2StreamConfigurationMap, this, iqaResult);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/miteksystems/misnap/document/internal/SpikeNormalizer$a;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0})
    static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
