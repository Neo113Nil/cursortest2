package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p000.mz0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: j */
    public final int f298j;

    /* JADX INFO: renamed from: k */
    public final int f299k;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mz0.f5206t);
        this.f299k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f298j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
