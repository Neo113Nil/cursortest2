package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0005\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/window/layout/util/DensityCompatHelper;", "", "Landroid/content/Context;", "context", "", "density", "(Landroid/content/Context;)F", "Landroid/content/res/Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroid/view/WindowMetrics;", "windowMetrics", "(Landroid/content/res/Configuration;Landroid/view/WindowMetrics;)F", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DensityCompatHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.util.DensityCompatHelper.Companion INSTANCE = androidx.window.layout.util.DensityCompatHelper.Companion.getHighSpeedVideoSizes;

    float density(android.content.Context context);

    float density(android.content.res.Configuration configuration, android.view.WindowMetrics windowMetrics);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/window/layout/util/DensityCompatHelper$Companion;", "", "<init>", "()V", "Landroidx/window/layout/util/DensityCompatHelper;", "getInstance", "()Landroidx/window/layout/util/DensityCompatHelper;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.window.layout.util.DensityCompatHelper.Companion getHighSpeedVideoSizes = new androidx.window.layout.util.DensityCompatHelper.Companion();

        private Companion() {
        }

        public final androidx.window.layout.util.DensityCompatHelper getInstance() {
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.window.layout.util.DensityCompatHelperApi34Impl.INSTANCE;
            }
            return androidx.window.layout.util.DensityCompatHelperBaseImpl.INSTANCE;
        }
    }
}
