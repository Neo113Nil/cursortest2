package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/NodeFlattener;", "", "Lcom/datadog/android/sessionreplay/internal/processor/WireframeUtils;", "wireframeUtils", "<init>", "(Lcom/datadog/android/sessionreplay/internal/processor/WireframeUtils;)V", "Lcom/datadog/android/sessionreplay/internal/recorder/Node;", "root", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "flattenNode$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/sessionreplay/internal/recorder/Node;)Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/processor/WireframeUtils;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NodeFlattener {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.processor.WireframeUtils Camera2StreamConfigurationMap;

    public NodeFlattener(com.datadog.android.sessionreplay.internal.processor.WireframeUtils wireframeUtils) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframeUtils, "");
        this.Camera2StreamConfigurationMap = wireframeUtils;
    }

    public /* synthetic */ NodeFlattener(com.datadog.android.sessionreplay.internal.processor.WireframeUtils wireframeUtils, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.datadog.android.sessionreplay.internal.processor.WireframeUtils(null, 1, null) : wireframeUtils);
    }

    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> flattenNode$dd_sdk_android_session_replay_release(com.datadog.android.sessionreplay.internal.recorder.Node root) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(root, "");
        java.util.Stack stack = new java.util.Stack();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        stack.push(root);
        while (!stack.isEmpty()) {
            com.datadog.android.sessionreplay.internal.recorder.Node node = (com.datadog.android.sessionreplay.internal.recorder.Node) stack.pop();
            java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> list = kotlin.collections.CollectionsKt.toList(node.getWireframes());
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe : list) {
                arrayList.add(com.datadog.android.sessionreplay.internal.processor.MobileSegmentExtKt.copy(wireframe, this.Camera2StreamConfigurationMap.resolveWireframeClip$dd_sdk_android_session_replay_release(wireframe, node.getParents())));
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedList.add((com.datadog.android.sessionreplay.model.MobileSegment.Wireframe) it.next());
            }
            for (int size = node.getChildren().size() - 1; size >= 0; size--) {
                stack.push(node.getChildren().get(size));
            }
        }
        java.util.LinkedList linkedList2 = linkedList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : linkedList2) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.datadog.android.sessionreplay.model.MobileSegment.Wireframe wireframe2 = (com.datadog.android.sessionreplay.model.MobileSegment.Wireframe) obj;
            if (this.Camera2StreamConfigurationMap.checkWireframeIsValid$dd_sdk_android_session_replay_release(wireframe2) && !this.Camera2StreamConfigurationMap.checkWireframeIsCovered$dd_sdk_android_session_replay_release(wireframe2, kotlin.collections.CollectionsKt.drop(linkedList2, i2))) {
                arrayList2.add(obj);
            }
            i = i2;
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NodeFlattener() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
