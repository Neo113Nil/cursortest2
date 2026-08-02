package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.view.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5333o {

    /* renamed from: androidx.core.view.o$a */
    static class a {
        static void a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        static DragAndDropPermissions b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    public static void a(@NonNull Activity activity, @NonNull DragEvent dragEvent) {
        a.b(activity, dragEvent);
    }
}
