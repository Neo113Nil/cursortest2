package com.datadog.android.sessionreplay.recorder;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/datadog/android/sessionreplay/recorder/InteropViewCallback;", "", "Landroid/view/View;", "view", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "map", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/recorder/MappingContext;)Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface InteropViewCallback {
    java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> map(android.view.View view, com.datadog.android.sessionreplay.recorder.MappingContext mappingContext);
}
