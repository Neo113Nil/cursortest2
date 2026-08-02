package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0019\u0010\b\u001a\u00070\u0000¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"", "className", "Landroidx/work/InputMerger;", "fromClassName", "(Ljava/lang/String;)Landroidx/work/InputMerger;", "Lorg/jspecify/annotations/NonNull;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputMergerKt {
    private static final java.lang.String Camera2StreamConfigurationMap;

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("InputMerger");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        Camera2StreamConfigurationMap = tagWithPrefix;
    }

    public static final androidx.work.InputMerger fromClassName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.Object newInstance = java.lang.Class.forName(str).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "");
            return (androidx.work.InputMerger) newInstance;
        } catch (java.lang.Exception e) {
            androidx.work.Logger.get().error(Camera2StreamConfigurationMap, "Trouble instantiating ".concat(java.lang.String.valueOf(str)), e);
            return null;
        }
    }
}
