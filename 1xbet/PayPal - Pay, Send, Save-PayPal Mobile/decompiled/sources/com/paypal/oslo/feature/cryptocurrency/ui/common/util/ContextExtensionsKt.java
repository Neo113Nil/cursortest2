package com.paypal.oslo.feature.cryptocurrency.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\n\u0010\t"}, d2 = {"Landroid/content/Context;", "", "url", "", "openUrl", "(Landroid/content/Context;Ljava/lang/String;)V", "text", "label", "copyToClipboard", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "shareText", "title"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContextExtensionsKt {
    public static final void openUrl(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            intent.addFlags(268435456);
            context.startActivity(intent);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Launched URL in browser", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str)), null, 4, null);
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Failed to open URL - no app available to handle the URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str)), null, e, 4, null);
        } catch (java.lang.SecurityException e2) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Failed to open URL - security exception occurred", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str)), null, e2, 4, null);
        }
    }

    public static final void copyToClipboard(android.content.Context context, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(str2, str));
    }

    public static /* synthetic */ void shareText$default(android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        shareText(context, str, str2);
    }

    public static final void shareText(android.content.Context context, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        intent.setType("text/plain");
        context.startActivity(android.content.Intent.createChooser(intent, null));
    }
}
