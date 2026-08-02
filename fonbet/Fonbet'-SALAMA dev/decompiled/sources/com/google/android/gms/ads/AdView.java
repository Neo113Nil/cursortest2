package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.D;
import y2.l;

/* loaded from: classes.dex */
public final class AdView extends l {
    public AdView(Context context) {
        super(context);
        D.j(context, "Context cannot be null");
    }

    public AdView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
