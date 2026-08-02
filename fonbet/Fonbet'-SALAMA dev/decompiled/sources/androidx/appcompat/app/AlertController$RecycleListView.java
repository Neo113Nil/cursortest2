package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import h.AbstractC1174a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f8142a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8143b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1174a.f13342u);
        this.f8143b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f8142a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
