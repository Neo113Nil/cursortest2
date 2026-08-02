package kotlin.reflect.jvm.internal.impl.platform;

/* loaded from: classes5.dex */
public final class PlatformUtilKt {
    public static final java.lang.String getPresentableDescription(kotlin.reflect.jvm.internal.impl.platform.TargetPlatform targetPlatform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetPlatform, "");
        return kotlin.collections.CollectionsKt.joinToString$default(targetPlatform.getComponentPlatforms(), androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, null, null, 0, null, null, 62, null);
    }
}
