package androidx.core.view;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.view.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5350x {
    public static boolean a(@NonNull MotionEvent motionEvent, int i11) {
        return (motionEvent.getSource() & i11) == i11;
    }
}
