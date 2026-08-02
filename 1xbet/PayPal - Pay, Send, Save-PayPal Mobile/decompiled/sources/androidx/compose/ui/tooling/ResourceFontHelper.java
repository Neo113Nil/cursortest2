package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/tooling/ResourceFontHelper;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroidx/compose/ui/text/font/ResourceFont;", "p1", "Landroid/graphics/Typeface;", "getHighSpeedVideoSizes", "(Landroid/content/Context;Landroidx/compose/ui/text/font/ResourceFont;)Landroid/graphics/Typeface;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ResourceFontHelper {
    public static final androidx.compose.ui.tooling.ResourceFontHelper INSTANCE = new androidx.compose.ui.tooling.ResourceFontHelper();

    private ResourceFontHelper() {
    }

    public static android.graphics.Typeface getHighSpeedVideoSizes(android.content.Context p0, androidx.compose.ui.text.font.ResourceFont p1) {
        return p0.getResources().getFont(p1.getResId());
    }
}
