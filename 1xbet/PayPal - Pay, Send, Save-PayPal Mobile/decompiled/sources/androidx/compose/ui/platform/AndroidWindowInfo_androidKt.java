package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Landroidx/compose/ui/platform/DerivedSize;", "calculateWindowSize", "(Landroid/view/View;)Landroidx/compose/ui/platform/DerivedSize;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidWindowInfo_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        r8 = androidx.window.layout.WindowMetricsCalculator.INSTANCE.getOrCreate().computeCurrentWindowMetrics(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return androidx.compose.ui.platform.DerivedSize.INSTANCE.m7738fromPxSizeviCIZxY(androidx.compose.ui.unit.IntSize.m8767constructorimpl((r8.getBounds().width() << 32) | (r8.getBounds().height() & 4294967295L)), androidx.compose.ui.unit.AndroidDensity_androidKt.Density(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.platform.DerivedSize calculateWindowSize(android.view.View view) {
        android.content.Context context = view.getContext();
        android.content.Context context2 = context;
        while (context2 instanceof android.content.ContextWrapper) {
            if (!(context2 instanceof android.app.Activity) && !(context2 instanceof android.inputmethodservice.InputMethodService) && !(context2 instanceof android.app.Application)) {
                android.content.ContextWrapper contextWrapper = (android.content.ContextWrapper) context2;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                context2 = contextWrapper.getBaseContext();
            } else {
                break;
            }
        }
        context2 = null;
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        return androidx.compose.ui.platform.DerivedSize.INSTANCE.m7737fromDpSizeitqla9I(androidx.compose.ui.unit.DpKt.m8623DpSizeYgX7TsA(androidx.compose.ui.unit.Dp.m8601constructorimpl(configuration.screenWidthDp), androidx.compose.ui.unit.Dp.m8601constructorimpl(configuration.screenHeightDp)), androidx.compose.ui.unit.AndroidDensity_androidKt.Density(context));
    }
}
