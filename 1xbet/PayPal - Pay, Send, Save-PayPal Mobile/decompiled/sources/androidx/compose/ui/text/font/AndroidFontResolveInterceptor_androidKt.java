package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/AndroidFontResolveInterceptor;", "AndroidFontResolveInterceptor", "(Landroid/content/Context;)Landroidx/compose/ui/text/font/AndroidFontResolveInterceptor;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidFontResolveInterceptor_androidKt {
    public static final androidx.compose.ui.text.font.AndroidFontResolveInterceptor AndroidFontResolveInterceptor(android.content.Context context) {
        return new androidx.compose.ui.text.font.AndroidFontResolveInterceptor(androidx.compose.ui.text.font.FontWeightAdjustmentHelper.INSTANCE.getFontWeightAdjustment(context));
    }
}
