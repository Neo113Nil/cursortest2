package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Landroid/hardware/camera2/CaptureResult$Key;", "", "", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "toConditionChecker", "(Ljava/util/Map;)Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Result3AStateListenerKt {
    public static final kotlin.jvm.functions.Function1<androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> toConditionChecker(final java.util.Map<android.hardware.camera2.CaptureResult.Key<?>, ? extends java.util.List<? extends java.lang.Object>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.pipe.graph.Result3AStateListenerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.camera.camera2.pipe.graph.Result3AStateListenerKt.$r8$lambda$6eKrfLPahyf8ytTlPs2wBLGcMEY(map, (androidx.camera.camera2.pipe.FrameMetadata) obj));
            }
        };
    }

    public static /* synthetic */ boolean $r8$lambda$6eKrfLPahyf8ytTlPs2wBLGcMEY(java.util.Map map, androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameMetadata, "");
        for (java.util.Map.Entry entry : map.entrySet()) {
            android.hardware.camera2.CaptureResult.Key key = (android.hardware.camera2.CaptureResult.Key) entry.getKey();
            if (!kotlin.collections.CollectionsKt.contains((java.util.List) entry.getValue(), frameMetadata.get(key))) {
                return false;
            }
        }
        return true;
    }
}
