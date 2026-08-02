package com.paypal.oslo.feature.invoicing.domain.extensions;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "", "shouldUseViewInvoiceWebView", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)Z", "Landroid/content/Context;", "", "url", "", "openPdfInExternalViewer", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/net/Uri;", "uri", "launchExternalUri", "(Landroid/content/Context;Landroid/net/Uri;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InvoicingExtensionsKt {
    public static final boolean shouldUseViewInvoiceWebView(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        return featureGate.checkGate(com.paypal.oslo.feature.invoicing.domain.remoteconfig.InvoicingFeatureGates.INSTANCE.getViewInvoiceEnabled());
    }

    public static final void launchExternalUri(android.content.Context context, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        java.lang.String scheme = uri.getScheme();
        if (scheme != null && !kotlin.text.StringsKt.isBlank(scheme)) {
            try {
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
                intent.setFlags(268435456);
                context.startActivity(intent);
                return;
            } catch (java.lang.Exception e) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.invoicing.LoggerKt.log, "Failed to open invoice URI in external app", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", uri.toString()), kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
                return;
            }
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.invoicing.LoggerKt.log, "Invalid invoice URL: missing scheme", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", uri.toString())), null, 4, null);
    }

    public static final void openPdfInExternalViewer(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setDataAndType(parse, "application/pdf");
            intent.setFlags(268435456);
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", parse);
            intent2.setFlags(268435456);
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, null);
            createChooser.setFlags(268435456);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new android.content.Intent[]{intent2});
            context.startActivity(createChooser);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.invoicing.LoggerKt.log, "Failed to open PDF in external viewer", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str), kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
        }
    }
}
