package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/utils/PdfIntentHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "filePath", "Landroid/content/Intent;", "createPdfIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PdfIntentHelper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.utils.PdfIntentHelper INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.utils.PdfIntentHelper();

    private PdfIntentHelper() {
    }

    public final android.content.Intent createPdfIntent(android.content.Context context, java.lang.String filePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "");
        java.io.File file = new java.io.File(filePath);
        if (!file.exists()) {
            return null;
        }
        try {
            java.lang.String packageName = context.getPackageName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(packageName);
            sb.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.FILE_PROVIDER_AUTHORITY_SUFFIX);
            android.net.Uri uriForFile = androidx.core.content.FileProvider.getUriForFile(context, sb.toString(), file);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, "application/pdf");
            intent.addFlags(1);
            intent.addFlags(1073741824);
            return intent;
        } catch (java.io.FileNotFoundException | java.lang.IllegalArgumentException unused) {
            return null;
        }
    }
}
