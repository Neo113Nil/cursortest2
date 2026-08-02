package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidFontResourceLoaderHelper;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Landroid/graphics/Typeface;", "Camera2StreamConfigurationMap", "(Landroid/content/Context;I)Landroid/graphics/Typeface;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidFontResourceLoaderHelper {
    public static final androidx.compose.ui.platform.AndroidFontResourceLoaderHelper INSTANCE = new androidx.compose.ui.platform.AndroidFontResourceLoaderHelper();

    private AndroidFontResourceLoaderHelper() {
    }

    public static android.graphics.Typeface Camera2StreamConfigurationMap(android.content.Context p0, int p1) {
        return p0.getResources().getFont(p1);
    }
}
