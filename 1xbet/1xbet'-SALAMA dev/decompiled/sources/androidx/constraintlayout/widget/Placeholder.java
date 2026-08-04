package androidx.constraintlayout.widget;

import B.c;
import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f9019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9020c;

    public Placeholder(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f9018a = -1;
        this.f9019b = null;
        this.f9020c = 4;
        super.setVisibility(4);
        this.f9018a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f934e);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == 0) {
                    this.f9018a = typedArrayObtainStyledAttributes.getResourceId(index, this.f9018a);
                } else if (index == 1) {
                    this.f9020c = typedArrayObtainStyledAttributes.getInt(index, this.f9020c);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f9019b;
    }

    public int getEmptyVisibility() {
        return this.f9020c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i7) {
        View viewFindViewById;
        if (this.f9018a == i7) {
            return;
        }
        View view = this.f9019b;
        if (view != null) {
            view.setVisibility(0);
            ((c) this.f9019b.getLayoutParams()).f737f0 = false;
            this.f9019b = null;
        }
        this.f9018a = i7;
        if (i7 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i7)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i7) {
        this.f9020c = i7;
    }
}
