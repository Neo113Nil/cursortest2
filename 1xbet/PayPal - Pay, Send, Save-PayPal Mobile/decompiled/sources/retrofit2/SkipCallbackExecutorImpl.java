package retrofit2;

/* loaded from: classes5.dex */
final class SkipCallbackExecutorImpl implements retrofit2.SkipCallbackExecutor {
    private static final retrofit2.SkipCallbackExecutor Camera2StreamConfigurationMap = new retrofit2.SkipCallbackExecutorImpl();

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    SkipCallbackExecutorImpl() {
    }

    static java.lang.annotation.Annotation[] getHighSpeedVideoFpsRangesFor(java.lang.annotation.Annotation[] annotationArr) {
        if (retrofit2.Utils.Camera2StreamConfigurationMap(annotationArr, (java.lang.Class<? extends java.lang.annotation.Annotation>) retrofit2.SkipCallbackExecutor.class)) {
            return annotationArr;
        }
        java.lang.annotation.Annotation[] annotationArr2 = new java.lang.annotation.Annotation[annotationArr.length + 1];
        annotationArr2[0] = Camera2StreamConfigurationMap;
        java.lang.System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.Class<? extends java.lang.annotation.Annotation> annotationType() {
        return retrofit2.SkipCallbackExecutor.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(java.lang.Object obj) {
        return obj instanceof retrofit2.SkipCallbackExecutor;
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("@");
        sb.append(retrofit2.SkipCallbackExecutor.class.getName());
        sb.append("()");
        return sb.toString();
    }
}
