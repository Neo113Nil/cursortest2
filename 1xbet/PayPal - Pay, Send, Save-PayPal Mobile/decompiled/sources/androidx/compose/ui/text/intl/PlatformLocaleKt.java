package androidx.compose.ui.text.intl;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "platformLocaleDelegate", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "getPlatformLocaleDelegate", "()Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlatformLocaleKt {
    private static final androidx.compose.ui.text.intl.PlatformLocaleDelegate platformLocaleDelegate = androidx.compose.ui.text.intl.AndroidPlatformLocale_androidKt.createPlatformLocaleDelegate();

    public static final androidx.compose.ui.text.intl.PlatformLocaleDelegate getPlatformLocaleDelegate() {
        return platformLocaleDelegate;
    }
}
