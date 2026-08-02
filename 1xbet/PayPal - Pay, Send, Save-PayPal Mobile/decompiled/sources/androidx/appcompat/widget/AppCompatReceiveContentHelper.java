package androidx.appcompat.widget;

/* loaded from: classes3.dex */
final class AppCompatReceiveContentHelper {
    private AppCompatReceiveContentHelper() {
    }

    static boolean Camera2StreamConfigurationMap(android.widget.TextView textView, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 31 || androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) textView.getContext().getSystemService("clipboard");
        android.content.ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            androidx.core.view.ViewCompat.performReceiveContent(textView, new androidx.core.view.ContentInfoCompat.Builder(primaryClip, 1).setFlags(i != 16908322 ? 1 : 0).build());
        }
        return true;
    }

    static boolean getHighSpeedVideoSizes(android.view.View view, android.view.DragEvent dragEvent) {
        android.app.Activity highResolutionOutputSizeshNQ4ISI;
        if (android.os.Build.VERSION.SDK_INT >= 31 || dragEvent.getLocalState() != null || androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(view) == null || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(view)) == null) {
            return false;
        }
        if (dragEvent.getAction() == 1) {
            return !(view instanceof android.widget.TextView);
        }
        if (dragEvent.getAction() == 3) {
            if (view instanceof android.widget.TextView) {
                return androidx.appcompat.widget.AppCompatReceiveContentHelper.OnDropApi24Impl.getHighSpeedVideoFpsRangesFor(dragEvent, (android.widget.TextView) view, highResolutionOutputSizeshNQ4ISI);
            }
            return androidx.appcompat.widget.AppCompatReceiveContentHelper.OnDropApi24Impl.Camera2StreamConfigurationMap(dragEvent, view, highResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    static final class OnDropApi24Impl {
        private OnDropApi24Impl() {
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.view.DragEvent dragEvent, android.widget.TextView textView, android.app.Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                android.text.Selection.setSelection((android.text.Spannable) textView.getText(), offsetForPosition);
                androidx.core.view.ViewCompat.performReceiveContent(textView, new androidx.core.view.ContentInfoCompat.Builder(dragEvent.getClipData(), 3).build());
                textView.endBatchEdit();
                return true;
            } catch (java.lang.Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        static boolean Camera2StreamConfigurationMap(android.view.DragEvent dragEvent, android.view.View view, android.app.Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            androidx.core.view.ViewCompat.performReceiveContent(view, new androidx.core.view.ContentInfoCompat.Builder(dragEvent.getClipData(), 3).build());
            return true;
        }
    }

    static android.app.Activity getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        }
        return null;
    }
}
