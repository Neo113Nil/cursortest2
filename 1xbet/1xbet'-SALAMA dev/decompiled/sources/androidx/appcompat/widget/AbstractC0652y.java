package androidx.appcompat.widget;

import P.C0350f;
import P.InterfaceC0349e;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0652y {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0349e hVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                hVar = new p033e3.h(clipData, 3);
            } else {
                C0350f c0350f = new C0350f();
                c0350f.f5056b = clipData;
                c0350f.f5057c = 3;
                hVar = c0350f;
            }
            P.U.f(textView, hVar.b());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0349e hVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            hVar = new p033e3.h(clipData, 3);
        } else {
            C0350f c0350f = new C0350f();
            c0350f.f5056b = clipData;
            c0350f.f5057c = 3;
            hVar = c0350f;
        }
        P.U.f(view, hVar.b());
        return true;
    }
}
