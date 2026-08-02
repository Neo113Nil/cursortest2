package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\" \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005"}, d2 = {"Landroidx/camera/camera2/pipe/Metadata$Key;", "Landroidx/camera/core/impl/TagBundle;", "CAMERAX_TAG_BUNDLE", "Landroidx/camera/camera2/pipe/Metadata$Key;", "getCAMERAX_TAG_BUNDLE", "()Landroidx/camera/camera2/pipe/Metadata$Key;", "", "USE_CASE_CAMERA_STATE_CUSTOM_TAG", "getUSE_CASE_CAMERA_STATE_CUSTOM_TAG"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TagsKt {
    private static final androidx.camera.camera2.pipe.Metadata.Key<androidx.camera.core.impl.TagBundle> CAMERAX_TAG_BUNDLE = androidx.camera.camera2.pipe.Metadata.Key.INSTANCE.create("camerax.tag_bundle", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.core.impl.TagBundle.class));
    private static final androidx.camera.camera2.pipe.Metadata.Key<java.lang.Integer> USE_CASE_CAMERA_STATE_CUSTOM_TAG = androidx.camera.camera2.pipe.Metadata.Key.INSTANCE.create("use_case_camera_state.tag", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.class));

    public static final androidx.camera.camera2.pipe.Metadata.Key<androidx.camera.core.impl.TagBundle> getCAMERAX_TAG_BUNDLE() {
        return CAMERAX_TAG_BUNDLE;
    }

    public static final androidx.camera.camera2.pipe.Metadata.Key<java.lang.Integer> getUSE_CASE_CAMERA_STATE_CUSTOM_TAG() {
        return USE_CASE_CAMERA_STATE_CUSTOM_TAG;
    }
}
