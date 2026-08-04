package androidx.constraintlayout.utils.widget;

import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f8919A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f8920B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f8921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f8922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f8923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f8926f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f8927x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f8928y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f8929z;

    public MockView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8921a = new Paint();
        this.f8922b = new Paint();
        this.f8923c = new Paint();
        this.f8924d = true;
        this.f8925e = true;
        this.f8926f = null;
        this.f8927x = new Rect();
        this.f8928y = Color.argb(255, 0, 0, 0);
        this.f8929z = Color.argb(255, 200, 200, 200);
        this.f8919A = Color.argb(255, 50, 50, 50);
        this.f8920B = 4;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f941m);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == 1) {
                    this.f8926f = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.f8924d = typedArrayObtainStyledAttributes.getBoolean(index, this.f8924d);
                } else if (index == 0) {
                    this.f8928y = typedArrayObtainStyledAttributes.getColor(index, this.f8928y);
                } else if (index == 2) {
                    this.f8919A = typedArrayObtainStyledAttributes.getColor(index, this.f8919A);
                } else if (index == 3) {
                    this.f8929z = typedArrayObtainStyledAttributes.getColor(index, this.f8929z);
                } else if (index == 5) {
                    this.f8925e = typedArrayObtainStyledAttributes.getBoolean(index, this.f8925e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f8926f == null) {
            try {
                this.f8926f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i9 = this.f8928y;
        Paint paint = this.f8921a;
        paint.setColor(i9);
        paint.setAntiAlias(true);
        int i10 = this.f8929z;
        Paint paint2 = this.f8922b;
        paint2.setColor(i10);
        paint2.setAntiAlias(true);
        this.f8923c.setColor(this.f8919A);
        this.f8920B = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f8920B);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f8924d) {
            width--;
            height--;
            float f7 = width;
            float f8 = height;
            Paint paint = this.f8921a;
            canvas.drawLine(0.0f, 0.0f, f7, f8, paint);
            canvas.drawLine(0.0f, f8, f7, 0.0f, paint);
            canvas.drawLine(0.0f, 0.0f, f7, 0.0f, paint);
            canvas.drawLine(f7, 0.0f, f7, f8, paint);
            canvas.drawLine(f7, f8, 0.0f, f8, paint);
            canvas.drawLine(0.0f, f8, 0.0f, 0.0f, paint);
        }
        String str = this.f8926f;
        if (str == null || !this.f8925e) {
            return;
        }
        Paint paint2 = this.f8922b;
        int length = str.length();
        Rect rect = this.f8927x;
        paint2.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i7 = rect.left;
        int i8 = this.f8920B;
        rect.set(i7 - i8, rect.top - i8, rect.right + i8, rect.bottom + i8);
        canvas.drawRect(rect, this.f8923c);
        canvas.drawText(this.f8926f, fWidth, fHeight, paint2);
    }
}
