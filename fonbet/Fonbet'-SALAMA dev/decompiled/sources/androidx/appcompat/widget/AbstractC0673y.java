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
import e3.C1023h;

/* renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0673y {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0349e interfaceC0349e;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0349e = new C1023h(clipData, 3);
            } else {
                C0350f c0350f = new C0350f();
                c0350f.f5056b = clipData;
                c0350f.f5057c = 3;
                interfaceC0349e = c0350f;
            }
            P.U.f(textView, interfaceC0349e.b());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0349e interfaceC0349e;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0349e = new C1023h(clipData, 3);
        } else {
            C0350f c0350f = new C0350f();
            c0350f.f5056b = clipData;
            c0350f.f5057c = 3;
            interfaceC0349e = c0350f;
        }
        P.U.f(view, interfaceC0349e.b());
        return true;
    }
}
