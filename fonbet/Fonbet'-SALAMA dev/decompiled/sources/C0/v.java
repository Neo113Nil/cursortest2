package C0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class v extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f1321a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1322b;

    public v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1321a = new Rect();
        this.f1322b = true;
    }

    public v(int i7, int i8) {
        super(i7, i8);
        this.f1321a = new Rect();
        this.f1322b = true;
    }

    public v(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1321a = new Rect();
        this.f1322b = true;
    }

    public v(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1321a = new Rect();
        this.f1322b = true;
    }

    public v(v vVar) {
        super((ViewGroup.LayoutParams) vVar);
        this.f1321a = new Rect();
        this.f1322b = true;
    }
}
