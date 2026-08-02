package androidx.compose.ui.text.platform;

@kotlin.Deprecated(message = "Only used by deprecated APIs in this file, remove with them.")
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidResourceFontLoaderHelper;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Landroid/graphics/Typeface;", "Camera2StreamConfigurationMap", "(Landroid/content/Context;I)Landroid/graphics/Typeface;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidResourceFontLoaderHelper {
    public static final androidx.compose.ui.text.platform.AndroidResourceFontLoaderHelper INSTANCE = new androidx.compose.ui.text.platform.AndroidResourceFontLoaderHelper();

    private AndroidResourceFontLoaderHelper() {
    }

    public static android.graphics.Typeface Camera2StreamConfigurationMap(android.content.Context p0, int p1) {
        return p0.getResources().getFont(p1);
    }
}
