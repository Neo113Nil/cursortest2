package com.miteksystems.misnap.camera.a;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\t8\u0007X\u0087D¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\t8\u0007X\u0087D¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010 \u001a\u00020\t8\u0007X\u0087D¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\"\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/miteksystems/misnap/camera/a/f;", "", "Lcom/miteksystems/misnap/camera/a/o;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "<init>", "(Lcom/miteksystems/misnap/camera/a/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "getHighSpeedVideoFpsRanges", "Lcom/miteksystems/misnap/camera/a/o;", "Ljava/nio/FloatBuffer;", util.h.xy.cb.b.f1091, "Ljava/nio/FloatBuffer;", "d", "()Ljava/nio/FloatBuffer;", "vertexArray", "c", "texCoordArray", com.visa.cbp.getEncExpo.warmup, "a", "coordsPerVertex", "e", "f", "vertexStride", "texCoordStride", "g", "vertexCount"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final /* data */ class f {

    /* renamed from: b, reason: from kotlin metadata */
    private final java.nio.FloatBuffer vertexArray;

    /* renamed from: c, reason: from kotlin metadata */
    private final java.nio.FloatBuffer texCoordArray;

    /* renamed from: d, reason: from kotlin metadata */
    private final int coordsPerVertex;

    /* renamed from: e, reason: from kotlin metadata */
    private final int vertexStride;

    /* renamed from: f, reason: from kotlin metadata */
    private final int texCoordStride;

    /* renamed from: g, reason: from kotlin metadata */
    private final int vertexCount;
    private final com.miteksystems.misnap.camera.a.o getHighSpeedVideoFpsRanges;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EglShapes(getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    /* renamed from: f, reason: from getter */
    public final int getVertexStride() {
        return this.vertexStride;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.miteksystems.misnap.camera.a.f) && this.getHighSpeedVideoFpsRanges == ((com.miteksystems.misnap.camera.a.f) other).getHighSpeedVideoFpsRanges;
    }

    /* renamed from: e, reason: from getter */
    public final int getVertexCount() {
        return this.vertexCount;
    }

    /* renamed from: d, reason: from getter */
    public final java.nio.FloatBuffer getVertexArray() {
        return this.vertexArray;
    }

    /* renamed from: c, reason: from getter */
    public final int getTexCoordStride() {
        return this.texCoordStride;
    }

    /* renamed from: b, reason: from getter */
    public final java.nio.FloatBuffer getTexCoordArray() {
        return this.texCoordArray;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3964a;

        static {
            int[] iArr = new int[com.miteksystems.misnap.camera.a.o.values().length];
            try {
                iArr[com.miteksystems.misnap.camera.a.o.TRIANGLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.camera.a.o.RECTANGLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.camera.a.o.FULL_RECTANGLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f3964a = iArr;
        }
    }

    /* renamed from: a, reason: from getter */
    public final int getCoordsPerVertex() {
        return this.coordsPerVertex;
    }

    public f(com.miteksystems.misnap.camera.a.o oVar) {
        java.nio.FloatBuffer floatBuffer;
        java.nio.FloatBuffer floatBuffer2;
        float[] fArr;
        int length;
        java.nio.FloatBuffer floatBuffer3;
        java.nio.FloatBuffer floatBuffer4;
        float[] fArr2;
        java.nio.FloatBuffer floatBuffer5;
        java.nio.FloatBuffer floatBuffer6;
        float[] fArr3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "");
        this.getHighSpeedVideoFpsRanges = oVar;
        this.coordsPerVertex = 2;
        this.vertexStride = 8;
        this.texCoordStride = 8;
        int i = com.miteksystems.misnap.camera.a.f.a.f3964a[oVar.ordinal()];
        if (i == 1) {
            floatBuffer = com.miteksystems.misnap.camera.a.g.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(floatBuffer, "");
            this.vertexArray = floatBuffer;
            floatBuffer2 = com.miteksystems.misnap.camera.a.g.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(floatBuffer2, "");
            this.texCoordArray = floatBuffer2;
            fArr = com.miteksystems.misnap.camera.a.g.getHighSpeedVideoFpsRanges;
            length = fArr.length;
        } else if (i == 2) {
            floatBuffer3 = com.miteksystems.misnap.camera.a.g.getOutputMinFrameDuration;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(floatBuffer3, "");
            this.vertexArray = floatBuffer3;
            floatBuffer4 = com.miteksystems.misnap.camera.a.g.getHighSpeedVideoSizesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(floatBuffer4, "");
            this.texCoordArray = floatBuffer4;
            fArr2 = com.miteksystems.misnap.camera.a.g.getHighResolutionOutputSizeshNQ4ISI;
            length = fArr2.length;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            floatBuffer5 = com.miteksystems.misnap.camera.a.g.getOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(floatBuffer5, "");
            this.vertexArray = floatBuffer5;
            floatBuffer6 = com.miteksystems.misnap.camera.a.g.getOutputStallDuration;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(floatBuffer6, "");
            this.texCoordArray = floatBuffer6;
            fArr3 = com.miteksystems.misnap.camera.a.g.getInputFormats;
            length = fArr3.length;
        }
        this.vertexCount = length / 2;
    }
}
