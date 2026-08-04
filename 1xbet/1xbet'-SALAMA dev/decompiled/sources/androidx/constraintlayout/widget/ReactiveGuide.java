package androidx.constraintlayout.widget;

import B.c;
import B.q;
import B.r;
import B.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9024d;

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f9021a = -1;
        this.f9022b = false;
        this.f9023c = 0;
        this.f9024d = true;
        super.setVisibility(8);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f933d);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == 3) {
                    this.f9021a = typedArrayObtainStyledAttributes.getResourceId(index, this.f9021a);
                } else if (index == 0) {
                    this.f9022b = typedArrayObtainStyledAttributes.getBoolean(index, this.f9022b);
                } else if (index == 2) {
                    this.f9023c = typedArrayObtainStyledAttributes.getResourceId(index, this.f9023c);
                } else if (index == 1) {
                    this.f9024d = typedArrayObtainStyledAttributes.getBoolean(index, this.f9024d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f9021a != -1) {
            ConstraintLayout.getSharedValues().a(this.f9021a, this);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f9023c;
    }

    public int getAttributeId() {
        return this.f9021a;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z4) {
        this.f9022b = z4;
    }

    public void setApplyToConstraintSetId(int i7) {
        this.f9023c = i7;
    }

    public void setAttributeId(int i7) {
        HashSet<WeakReference> hashSet;
        s sharedValues = ConstraintLayout.getSharedValues();
        int i8 = this.f9021a;
        if (i8 != -1 && (hashSet = (HashSet) sharedValues.f955a.get(Integer.valueOf(i8))) != null) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference weakReference : hashSet) {
                r rVar = (r) weakReference.get();
                if (rVar == null || rVar == this) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.f9021a = i7;
        if (i7 != -1) {
            sharedValues.a(i7, this);
        }
    }

    public void setGuidelineBegin(int i7) {
        c cVar = (c) getLayoutParams();
        cVar.f727a = i7;
        setLayoutParams(cVar);
    }

    public void setGuidelineEnd(int i7) {
        c cVar = (c) getLayoutParams();
        cVar.f729b = i7;
        setLayoutParams(cVar);
    }

    public void setGuidelinePercent(float f7) {
        c cVar = (c) getLayoutParams();
        cVar.f731c = f7;
        setLayoutParams(cVar);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
    }
}
