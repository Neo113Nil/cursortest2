package androidx.compose.foundation.content;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/content/TransferableContent;", "Lkotlin/Function1;", "Landroid/content/ClipData$Item;", "", "predicate", "consume", "(Landroidx/compose/foundation/content/TransferableContent;Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/content/TransferableContent;", "Landroidx/compose/foundation/content/MediaType;", "mediaType", "hasMediaType", "(Landroidx/compose/foundation/content/TransferableContent;Landroidx/compose/foundation/content/MediaType;)Z", "Landroidx/compose/ui/platform/ClipEntry;", "", "readPlainText", "(Landroidx/compose/ui/platform/ClipEntry;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransferableContent_androidKt {
    public static final androidx.compose.foundation.content.TransferableContent consume(androidx.compose.foundation.content.TransferableContent transferableContent, kotlin.jvm.functions.Function1<? super android.content.ClipData.Item, java.lang.Boolean> function1) {
        android.content.ClipData clipData = transferableContent.getClipEntry().getClipData();
        if (clipData.getItemCount() == 1) {
            if (function1.invoke(clipData.getItemAt(0)).booleanValue()) {
                return null;
            }
        } else {
            int itemCount = clipData.getItemCount();
            java.util.ArrayList arrayList = null;
            for (int i = 0; i < itemCount; i++) {
                android.content.ClipData.Item itemAt = clipData.getItemAt(i);
                if (!function1.invoke(itemAt).booleanValue()) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(itemAt);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                return null;
            }
            if (arrayList.size() != clipData.getItemCount()) {
                android.content.ClipDescription clipDescription = new android.content.ClipDescription(transferableContent.getClipMetadata().getClipDescription());
                android.content.ClipData clipData2 = new android.content.ClipData(clipDescription, (android.content.ClipData.Item) kotlin.collections.CollectionsKt.first((java.util.List) arrayList));
                int size = arrayList.size();
                for (int i2 = 1; i2 < size; i2++) {
                    clipData2.addItem((android.content.ClipData.Item) arrayList.get(i2));
                }
                return new androidx.compose.foundation.content.TransferableContent(androidx.compose.ui.platform.AndroidClipboardManager_androidKt.toClipEntry(clipData2), androidx.compose.ui.platform.AndroidClipboardManager_androidKt.toClipMetadata(clipDescription), transferableContent.getSource(), transferableContent.getPlatformTransferableContent(), null);
            }
        }
        return transferableContent;
    }

    public static final boolean hasMediaType(androidx.compose.foundation.content.TransferableContent transferableContent, androidx.compose.foundation.content.MediaType mediaType) {
        return transferableContent.getClipMetadata().getClipDescription().hasMimeType(mediaType.getRepresentation());
    }

    public static final java.lang.String readPlainText(androidx.compose.ui.platform.ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || clipEntry.getClipData().getItemAt(i).getText() != null;
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int itemCount2 = clipEntry.getClipData().getItemCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < itemCount2; i2++) {
            java.lang.CharSequence text = clipEntry.getClipData().getItemAt(i2).getText();
            if (text != null) {
                if (z2) {
                    sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                }
                sb.append(text);
                z2 = true;
            }
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
