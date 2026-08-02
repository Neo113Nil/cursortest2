package p000;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0422l6 {
    /* JADX INFO: renamed from: a */
    public static boolean m3181a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0438lm c0401km;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0401km = new C0401km(clipData, 3);
            } else {
                C0475mm c0475mm = new C0475mm();
                c0475mm.f5090b = clipData;
                c0475mm.f5091c = 3;
                c0401km = c0475mm;
            }
            ai1.m251d(textView, c0401km.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3182b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0438lm c0401km;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0401km = new C0401km(clipData, 3);
        } else {
            C0475mm c0475mm = new C0475mm();
            c0475mm.f5090b = clipData;
            c0475mm.f5091c = 3;
            c0401km = c0475mm;
        }
        ai1.m251d(view, c0401km.build());
        return true;
    }
}
