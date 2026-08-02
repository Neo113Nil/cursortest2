package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/window/layout/util/BoundsHelper;", "", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "currentWindowBounds", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "Landroid/content/Context;", "context", "maximumWindowBounds", "(Landroid/content/Context;)Landroid/graphics/Rect;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BoundsHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.util.BoundsHelper.Companion INSTANCE = androidx.window.layout.util.BoundsHelper.Companion.getHighSpeedVideoFpsRanges;

    android.graphics.Rect currentWindowBounds(android.app.Activity activity);

    android.graphics.Rect maximumWindowBounds(android.content.Context context);

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/window/layout/util/BoundsHelper$Companion;", "", "<init>", "()V", "Landroidx/window/layout/util/BoundsHelper;", "getInstance", "()Landroidx/window/layout/util/BoundsHelper;", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static final java.lang.String TAG;
        static final /* synthetic */ androidx.window.layout.util.BoundsHelper.Companion getHighSpeedVideoFpsRanges = new androidx.window.layout.util.BoundsHelper.Companion();

        private Companion() {
        }

        static {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("BoundsHelper", "");
            TAG = "BoundsHelper";
        }

        public final java.lang.String getTAG() {
            return TAG;
        }

        public final androidx.window.layout.util.BoundsHelper getInstance() {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                return androidx.window.layout.util.BoundsHelperApi30Impl.INSTANCE;
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                return androidx.window.layout.util.BoundsHelperApi29Impl.INSTANCE;
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.window.layout.util.BoundsHelperApi28Impl.INSTANCE;
            }
            return androidx.window.layout.util.BoundsHelperApi24Impl.INSTANCE;
        }
    }
}
