package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a(\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/platform/Clipboard;", "", "label", "plainText", "", "copyPlainText", "(Landroidx/compose/ui/platform/Clipboard;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ClipboardExtensionsKt {
    public static /* synthetic */ java.lang.Object copyPlainText$default(androidx.compose.ui.platform.Clipboard clipboard, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return copyPlainText(clipboard, str, str2, continuation);
    }

    public static final java.lang.Object copyPlainText(androidx.compose.ui.platform.Clipboard clipboard, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        android.content.ClipData newPlainText = android.content.ClipData.newPlainText(str, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(newPlainText);
        java.lang.Object clipEntry = clipboard.setClipEntry(androidx.compose.ui.platform.AndroidClipboardManager_androidKt.toClipEntry(newPlainText), continuation);
        return clipEntry == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? clipEntry : kotlin.Unit.INSTANCE;
    }
}
