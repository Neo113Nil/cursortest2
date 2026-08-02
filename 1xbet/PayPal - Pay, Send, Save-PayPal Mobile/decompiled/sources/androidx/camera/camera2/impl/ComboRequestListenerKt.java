package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/camera/camera2/pipe/RequestMetadata;", "", "tagKey", "", "tagValue", "", "containsTag", "(Landroidx/camera/camera2/pipe/RequestMetadata;Ljava/lang/String;Ljava/lang/Object;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComboRequestListenerKt {
    public static final boolean containsTag(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(((androidx.camera.core.impl.TagBundle) requestMetadata.getOrDefault((androidx.camera.camera2.pipe.Metadata.Key<androidx.camera.camera2.pipe.Metadata.Key<androidx.camera.core.impl.TagBundle>>) androidx.camera.camera2.impl.TagsKt.getCAMERAX_TAG_BUNDLE(), (androidx.camera.camera2.pipe.Metadata.Key<androidx.camera.core.impl.TagBundle>) androidx.camera.core.impl.TagBundle.emptyBundle())).getTag(str), obj);
    }
}
