package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/datastore/core/Api26Impl;", "", "<init>", "()V", "Ljava/io/File;", "p0", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/io/File;Ljava/io/File;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class Api26Impl {
    public static final androidx.content.core.Api26Impl INSTANCE = new androidx.content.core.Api26Impl();

    private Api26Impl() {
    }

    public final boolean getHighSpeedVideoFpsRangesFor(java.io.File p0, java.io.File p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        try {
            java.nio.file.Files.move(p0.toPath(), p1.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }
}
