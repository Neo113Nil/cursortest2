package com.adobe.marketing.mobile.aepcomposeui.utils;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/utils/UIUtils;", "", "<init>", "()V", "", "url", "Lkotlin/Function1;", "Lkotlin/Result;", "Landroid/graphics/Bitmap;", "", "completion", "downloadImage", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class UIUtils {
    public static final com.adobe.marketing.mobile.aepcomposeui.utils.UIUtils INSTANCE = new com.adobe.marketing.mobile.aepcomposeui.utils.UIUtils();

    private UIUtils() {
    }

    public final void downloadImage(final java.lang.String url, final kotlin.jvm.functions.Function1<? super kotlin.Result<android.graphics.Bitmap>, kotlin.Unit> completion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completion, "");
        if (!com.adobe.marketing.mobile.util.UrlUtils.isValidUrl(url)) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.aepcomposeui.AepUIConstants.LOG_TAG, "UIUtils", "Failed to download image, the URL is null, empty or invalid.", new java.lang.Object[0]);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            completion.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("Failed to download image, the URL is null or empty.")))));
        } else {
            com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getNetworkService().connectAsync(new com.adobe.marketing.mobile.services.NetworkRequest(url, com.adobe.marketing.mobile.services.HttpMethod.GET, null, null, 10, 10), new com.adobe.marketing.mobile.services.NetworkCallback() { // from class: com.adobe.marketing.mobile.aepcomposeui.utils.UIUtils$$ExternalSyntheticLambda0
                @Override // com.adobe.marketing.mobile.services.NetworkCallback
                public final void call(com.adobe.marketing.mobile.services.HttpConnecting httpConnecting) {
                    com.adobe.marketing.mobile.aepcomposeui.utils.UIUtils.$r8$lambda$E33rYPiFGV4YJMC8ka0eI03kPg8(url, completion, httpConnecting);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$E33rYPiFGV4YJMC8ka0eI03kPg8(java.lang.String str, kotlin.jvm.functions.Function1 function1, com.adobe.marketing.mobile.services.HttpConnecting httpConnecting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        try {
            if (httpConnecting == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to download image from url (");
                sb.append(str);
                sb.append("), received a null connection.");
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.aepcomposeui.AepUIConstants.LOG_TAG, "UIUtils", sb.toString(), new java.lang.Object[0]);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to download image from url (");
                sb2.append(str);
                sb2.append("), received a null connection.");
                function1.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(sb2.toString())))));
                return;
            }
            if (httpConnecting.getResponseCode() == 200) {
                java.io.InputStream inputStream = httpConnecting.getInputStream();
                try {
                    android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(inputStream);
                    if (decodeStream == null) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to download image from url (");
                        sb3.append(str);
                        sb3.append("), decode image from input stream failed.");
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.aepcomposeui.AepUIConstants.LOG_TAG, "UIUtils", sb3.toString(), new java.lang.Object[0]);
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Failed to download image from url (");
                        sb4.append(str);
                        sb4.append("), decode image from input stream failed.");
                        function1.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(sb4.toString())))));
                    } else {
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        function1.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(decodeStream)));
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(inputStream, null);
                } finally {
                }
            } else {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Failed to download image from url (");
                sb5.append(str);
                sb5.append("). Response code was: ");
                sb5.append(httpConnecting.getResponseCode());
                sb5.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.aepcomposeui.AepUIConstants.LOG_TAG, "UIUtils", sb5.toString(), new java.lang.Object[0]);
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Failed to download image from url (");
                sb6.append(str);
                sb6.append("). Response code was: ");
                sb6.append(httpConnecting.getResponseCode());
                sb6.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                function1.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(sb6.toString())))));
            }
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Exception while processing image download: ");
            sb7.append(e.getLocalizedMessage());
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.aepcomposeui.AepUIConstants.LOG_TAG, "UIUtils", sb7.toString(), new java.lang.Object[0]);
            kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
            function1.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(e))));
        } finally {
            httpConnecting.close();
        }
    }
}
