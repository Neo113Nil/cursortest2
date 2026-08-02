package com.paypal.oslo.feature.taxanddocumentcenter.ui.download.util;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\u000b2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/util/FileOpener;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "fileUri", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Lkotlin/Function1;", "", "onError", "openFile", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Exception;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FileOpener {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.download.util.FileOpener INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.util.FileOpener();

    private FileOpener() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openFile$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.download.util.FileOpener fileOpener, android.content.Context context, android.net.Uri uri, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.download.util.FileOpener$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.download.util.FileOpener.$r8$lambda$0QPqVL1lfLPLLN1JNZFerIVemfU((java.lang.String) obj2);
                }
            };
        }
        fileOpener.openFile(context, uri, str, function1);
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.Exception p0, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> p1) {
        java.lang.String message = p0.getMessage();
        if (message == null) {
            message = "Unable to open file";
        }
        if ((p0 instanceof android.content.ActivityNotFoundException) || (p0 instanceof java.lang.SecurityException)) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(p0.getClass()).getSimpleName();
            pairArr[0] = kotlin.TuplesKt.to("errorType", simpleName != null ? simpleName : "");
            pairArr[1] = kotlin.TuplesKt.to("errorMessage", message);
            com.paypal.android.logger.Logger.w$default(logger, "Failed to open downloaded file - expected error", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        } else {
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
            java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(p0.getClass()).getSimpleName();
            pairArr2[0] = kotlin.TuplesKt.to("errorType", simpleName2 != null ? simpleName2 : "");
            pairArr2[1] = kotlin.TuplesKt.to("errorMessage", message);
            com.paypal.android.logger.Logger.e$default(logger2, "Failed to open downloaded file - unexpected error", kotlin.collections.MapsKt.mapOf(pairArr2), null, p0, 4, null);
        }
        p1.invoke(message);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0QPqVL1lfLPLLN1JNZFerIVemfU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public final void openFile(android.content.Context context, android.net.Uri fileUri, java.lang.String mimeType, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
        android.content.Intent intent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileUri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "");
        try {
            if (kotlin.jvm.internal.Intrinsics.areEqual(mimeType, "application/zip")) {
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.SEND");
                intent2.setType("application/zip");
                intent2.putExtra("android.intent.extra.STREAM", fileUri);
                intent2.addFlags(1);
                intent = android.content.Intent.createChooser(intent2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNull(intent);
            } else {
                android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW");
                if (mimeType == null) {
                    mimeType = com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM;
                }
                intent3.setDataAndType(fileUri, mimeType);
                intent3.addFlags(268435457);
                intent = intent3;
            }
            context.startActivity(intent);
        } catch (android.content.ActivityNotFoundException e) {
            getHighSpeedVideoFpsRangesFor(e, onError);
        } catch (java.lang.IllegalArgumentException e2) {
            getHighSpeedVideoFpsRangesFor(e2, onError);
        } catch (java.lang.SecurityException e3) {
            getHighSpeedVideoFpsRangesFor(e3, onError);
        }
    }
}
