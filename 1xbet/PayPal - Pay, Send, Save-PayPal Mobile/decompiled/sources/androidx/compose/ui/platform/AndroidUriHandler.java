package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/platform/AndroidUriHandler;", "Landroidx/compose/ui/platform/UriHandler;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "uri", "", "openUri", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidUriHandler implements androidx.compose.ui.platform.UriHandler {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    public AndroidUriHandler(android.content.Context context) {
        this.Camera2StreamConfigurationMap = context;
    }

    @Override // androidx.compose.ui.platform.UriHandler
    public final void openUri(java.lang.String uri) {
        try {
            this.Camera2StreamConfigurationMap.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(uri)));
        } catch (android.content.ActivityNotFoundException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't open ");
            sb.append(uri);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.lang.IllegalArgumentException(sb.toString(), e);
        }
    }
}
