package com.google.android.gms.internal.ads;

import I2.C0303k;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzdnt extends FrameLayout {
    private final C0303k zza;

    public zzdnt(Context context, View view, C0303k c0303k) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = c0303k;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zza.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            KeyEvent.Callback childAt = getChildAt(i7);
            if (childAt != null && (childAt instanceof zzceb)) {
                arrayList.add((zzceb) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((zzceb) arrayList.get(i8)).destroy();
        }
    }
}
