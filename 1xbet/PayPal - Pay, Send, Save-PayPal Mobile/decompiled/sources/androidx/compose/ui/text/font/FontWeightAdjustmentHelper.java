package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/font/FontWeightAdjustmentHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "getFontWeightAdjustment", "(Landroid/content/Context;)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FontWeightAdjustmentHelper {
    public static final int $stable = 0;
    public static final androidx.compose.ui.text.font.FontWeightAdjustmentHelper INSTANCE = new androidx.compose.ui.text.font.FontWeightAdjustmentHelper();

    private FontWeightAdjustmentHelper() {
    }

    public final int getFontWeightAdjustment(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.compose.ui.text.font.FontWeightAdjustmentHelperApi31.INSTANCE.fontWeightAdjustment(context);
        }
        return 0;
    }
}
