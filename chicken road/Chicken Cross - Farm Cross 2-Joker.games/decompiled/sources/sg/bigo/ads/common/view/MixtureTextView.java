package sg.bigo.ads.common.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.L0.h;
import sg.bigo.ads.L0.i;
import sg.bigo.ads.m0.C5353f;
import sg.bigo.ads.m0.k;

/* loaded from: classes3.dex */
public class MixtureTextView extends RelativeLayout {
    public static final int[] v = {R.attr.textSize, R.attr.textColor, R.attr.text};

    /* renamed from: a, reason: collision with root package name */
    public StaticLayout f12710a;
    public int b;
    public int c;
    public int d;
    public CharSequence e;
    public final TextPaint f;
    public ArrayList g;
    public ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final HashSet k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public int r;
    public final HashMap s;
    public i t;
    public boolean u;

    public MixtureTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12710a = null;
        this.c = -9601400;
        this.g = new ArrayList();
        this.h = null;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new HashSet();
        this.s = new HashMap();
        this.u = true;
        this.d = (int) ((getContext().getResources().getDisplayMetrics().scaledDensity * 14) + 0.5d);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v);
        this.d = obtainStyledAttributes.getDimensionPixelSize(0, this.d);
        this.c = obtainStyledAttributes.getColor(1, this.c);
        this.e = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setDither(true);
        textPaint.setAntiAlias(true);
        textPaint.setColor(this.c);
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        this.q = true;
    }

    private void getAllYCors() {
        int i = this.b;
        HashSet hashSet = this.k;
        hashSet.clear();
        this.s.clear();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                childAt.getTop();
                int paddingTop = getPaddingTop() + (((childAt.getTop() - getPaddingTop()) / i) * i);
                hashSet.add(Integer.valueOf(paddingTop));
                int bottom = childAt.getBottom() - getPaddingTop();
                if (bottom % i != 0) {
                    bottom = ((bottom / i) + 1) * i;
                }
                int paddingTop2 = getPaddingTop() + bottom;
                hashSet.add(Integer.valueOf(paddingTop2));
                this.s.put(Integer.valueOf(i2), new Point(paddingTop, paddingTop2));
            }
        }
        hashSet.add(Integer.valueOf(getPaddingTop()));
        hashSet.add(Integer.valueOf(this.n == 1073741824 ? getHeight() : Integer.MAX_VALUE));
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.h = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Canvas canvas) {
        ArrayList arrayList;
        String substring;
        StaticLayout staticLayout;
        int i = 1;
        int i2 = 0;
        boolean z = canvas == null;
        int i3 = this.b;
        ArrayList arrayList2 = this.g;
        CharSequence charSequence = this.e;
        int length = charSequence != null ? charSequence.length() : 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < arrayList2.size()) {
            Rect rect = (Rect) ((List) arrayList2.get(i4)).get(i2);
            int width = rect.width();
            int height = rect.height();
            CharSequence charSequence2 = this.e;
            if (I.a(charSequence2)) {
                arrayList = arrayList2;
            } else {
                if (charSequence2 instanceof SpannableString) {
                    SpannableString spannableString = (SpannableString) charSequence2;
                    SpannableString spannableString2 = new SpannableString(TextUtils.substring(spannableString, i5, length));
                    Object[] spans = spannableString.getSpans(i5, length, Object.class);
                    int length2 = spans.length - i;
                    while (length2 >= 0) {
                        Object obj = spans[length2];
                        ArrayList arrayList3 = arrayList2;
                        int spanStart = spannableString.getSpanStart(obj) - i5;
                        SpannableString spannableString3 = spannableString;
                        int spanEnd = spannableString.getSpanEnd(obj) - i5;
                        Object[] objArr = spans;
                        try {
                            int length3 = spannableString2.length();
                            if (spanEnd >= spanStart && spanStart <= length3 && spanEnd <= length3 && spanStart >= 0) {
                                spannableString2.setSpan(obj, spanStart, spanEnd, 33);
                            }
                        } catch (Exception unused) {
                        }
                        length2--;
                        spannableString = spannableString3;
                        spans = objArr;
                        arrayList2 = arrayList3;
                    }
                    arrayList = arrayList2;
                    substring = spannableString2;
                } else {
                    arrayList = arrayList2;
                    if (charSequence2 instanceof String) {
                        substring = ((String) charSequence2).substring(i5, length);
                    }
                }
                staticLayout = (!I.a((CharSequence) substring) || this.f == null) ? null : new StaticLayout(substring, this.f, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f12710a = staticLayout;
                if (staticLayout == null) {
                    int min = Math.min(staticLayout.getLineCount(), height / i3);
                    if (!z) {
                        canvas.save();
                        canvas.translate(rect.left, rect.top);
                        canvas.clipRect(0, 0, rect.width(), this.f12710a.getLineBottom(min - 1) - this.f12710a.getLineTop(0));
                        this.f12710a.draw(canvas);
                        canvas.restore();
                    }
                    i5 += this.f12710a.getLineEnd(min - 1);
                    if (canvas != null) {
                        this.i.add(this.f12710a);
                        this.j.add(Integer.valueOf(min));
                    }
                    i6 += min;
                    if (i5 >= length) {
                        break;
                    }
                }
                i4++;
                arrayList2 = arrayList;
                i = 1;
                i2 = 0;
            }
            substring = null;
            if (I.a((CharSequence) substring)) {
            }
            this.f12710a = staticLayout;
            if (staticLayout == null) {
            }
            i4++;
            arrayList2 = arrayList;
            i = 1;
            i2 = 0;
        }
        if (!z) {
            return false;
        }
        int i7 = (i6 * i3) + this.l;
        this.l = i7;
        if (i7 <= this.r) {
            return false;
        }
        int height2 = getHeight();
        int i8 = this.l;
        if (height2 == i8 || this.n == 1073741824) {
            return false;
        }
        this.o = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        this.p = true;
        requestLayout();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int i2;
        this.l = getPaddingTop() + getPaddingBottom();
        int i3 = this.b;
        ArrayList arrayList3 = this.g;
        ArrayList arrayList4 = this.h;
        arrayList3.clear();
        if (arrayList4 != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int i4 = 0;
            while (i4 < arrayList4.size() - 1) {
                int intValue = ((Integer) arrayList4.get(i4)).intValue();
                int i5 = i4 + 1;
                int intValue2 = ((Integer) arrayList4.get(i5)).intValue();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                int childCount = getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    Point point = (Point) this.s.get(Integer.valueOf(i6));
                    int i7 = point.x;
                    int i8 = point.y;
                    if (i7 <= intValue && i8 >= intValue2) {
                        arrayList6.add(new Rect(childAt.getLeft(), intValue, childAt.getRight(), intValue2));
                    }
                }
                Collections.sort(arrayList6, new h());
                if (arrayList6.size() >= 2) {
                    ArrayList arrayList7 = new ArrayList(arrayList6);
                    Rect rect = (Rect) arrayList6.get(0);
                    Rect rect2 = (Rect) arrayList6.get(1);
                    int i9 = 1;
                    while (true) {
                        if (i9 >= arrayList6.size()) {
                            arrayList2 = arrayList4;
                            i2 = i5;
                            break;
                        }
                        if (!Rect.intersects(rect, rect2)) {
                            arrayList2 = arrayList4;
                            i2 = i5;
                            if (arrayList7.size() - i9 < 2) {
                                break;
                            }
                            rect = rect2;
                            rect2 = (Rect) arrayList6.get(i9 + 1);
                            i9++;
                            arrayList4 = arrayList2;
                            i5 = i2;
                        } else {
                            arrayList2 = arrayList4;
                            int min = Math.min(rect.left, rect2.left);
                            i2 = i5;
                            int max = Math.max(rect.right, rect2.right);
                            arrayList7.remove(rect);
                            arrayList7.remove(rect2);
                            arrayList7.add(new Rect(min, intValue, max, intValue2));
                            if (arrayList7.size() < 2) {
                                break;
                            }
                            Rect rect3 = (Rect) arrayList6.get(0);
                            rect2 = (Rect) arrayList6.get(1);
                            rect = rect3;
                            i9++;
                            arrayList4 = arrayList2;
                            i5 = i2;
                        }
                    }
                    arrayList6 = arrayList7;
                } else {
                    arrayList2 = arrayList4;
                    i2 = i5;
                }
                int size = arrayList6.size();
                if (size == 0) {
                    arrayList5.add(new Rect(paddingLeft, intValue, width, intValue2));
                } else if (size != 1) {
                    Rect rect4 = (Rect) arrayList6.get(0);
                    if (rect4.left > paddingLeft) {
                        arrayList5.add(new Rect(paddingLeft, intValue, rect4.left, intValue2));
                    }
                    int i10 = 0;
                    while (i10 < arrayList6.size() - 1) {
                        Rect rect5 = (Rect) arrayList6.get(i10);
                        i10++;
                        Rect rect6 = (Rect) arrayList6.get(i10);
                        if (rect5.right < rect6.left) {
                            arrayList5.add(new Rect(rect5.right, intValue, rect6.left, intValue2));
                        }
                    }
                    Rect rect7 = (Rect) arrayList6.get(arrayList6.size() - 1);
                    if (rect7.right < width) {
                        arrayList5.add(new Rect(rect7.right, intValue, width, intValue2));
                    }
                } else {
                    Rect rect8 = (Rect) arrayList6.get(0);
                    if (rect8.left > paddingLeft) {
                        arrayList5.add(new Rect(paddingLeft, intValue, rect8.left, intValue2));
                    }
                    if (rect8.right < width) {
                        arrayList5.add(new Rect(rect8.right, intValue, width, intValue2));
                    }
                }
                arrayList3.add(arrayList5);
                arrayList4 = arrayList2;
                i4 = i2;
            }
            ArrayList arrayList8 = new ArrayList(arrayList3);
            int size2 = arrayList3.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size2) {
                List list = (List) arrayList3.get(i12);
                if (list.size() > 1) {
                    int i13 = i11 + i12;
                    arrayList8.remove(list);
                    i11--;
                    Rect rect9 = (Rect) list.get(0);
                    int height = rect9.height() / i3;
                    this.l -= ((list.size() - 1) * height) * i3;
                    int i14 = 0;
                    while (i14 < height) {
                        int i15 = 0;
                        while (i15 < list.size()) {
                            int i16 = i3 * i14;
                            arrayList8.add(i13, Arrays.asList(new Rect(((Rect) list.get(i15)).left, rect9.top + i16, ((Rect) list.get(i15)).right, rect9.top + i16 + i3)));
                            i15++;
                            i13++;
                            arrayList3 = arrayList3;
                            i11++;
                            size2 = size2;
                        }
                        i14++;
                        arrayList3 = arrayList3;
                    }
                    arrayList = arrayList3;
                    i = size2;
                } else {
                    arrayList = arrayList3;
                    i = size2;
                }
                i12++;
                arrayList3 = arrayList;
                size2 = i;
            }
            this.g = arrayList8;
        }
        if (a(null)) {
            return;
        }
        a(canvas);
        super.dispatchDraw(canvas);
    }

    public CharSequence getText() {
        return this.e;
    }

    public int getTextColor() {
        return this.c;
    }

    public int getTextSize() {
        return this.d;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        i iVar;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0 && !I.a(this.e)) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!this.i.isEmpty() && !this.j.isEmpty()) {
                int i2 = 0;
                i = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= this.i.size()) {
                        break;
                    }
                    Layout layout = (Layout) this.i.get(i2);
                    int intValue = ((Integer) this.j.get(i2)).intValue();
                    if (layout != null) {
                        int lineForVertical = layout.getLineForVertical(y);
                        if (lineForVertical + 1 <= intValue) {
                            i += layout.getOffsetForHorizontal(Math.min(lineForVertical, layout.getLineCount() - 1), x);
                            break;
                        }
                        i3 += intValue;
                        y -= this.b * i3;
                        i += layout.getLineEnd(intValue - 1);
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            if (i < this.e.length()) {
                CharSequence charSequence = this.e;
                if (charSequence instanceof SpannableString) {
                    UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) ((SpannableString) charSequence).getSpans(i, i, UnderlineSpan.class);
                    if (underlineSpanArr.length > 0 && (iVar = this.t) != null) {
                        UnderlineSpan underlineSpan = underlineSpanArr[0];
                        k kVar = (k) iVar;
                        if (kVar.f13118a != null && underlineSpan != null) {
                            if ("BIGO".equals(kVar.b.subSequence(kVar.b.getSpanStart(underlineSpan), kVar.b.getSpanEnd(underlineSpan)).toString())) {
                                C5353f c5353f = kVar.f13118a;
                                c5353f.a(10, c5353f.i, System.currentTimeMillis() - c5353f.h);
                                c5353f.a("https://www.adsbigo.com/privacy.html");
                            } else {
                                C5353f c5353f2 = kVar.f13118a;
                                String str = kVar.c;
                                c5353f2.a(11, c5353f2.i, System.currentTimeMillis() - c5353f2.h);
                                c5353f2.a(str);
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return onInterceptTouchEvent;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.u) {
            this.n = View.MeasureSpec.getMode(this.m);
            this.u = false;
            this.r = getMeasuredHeight();
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.q) {
            getAllYCors();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.q) {
            super.onMeasure(i, i2);
            return;
        }
        this.m = i2;
        this.f.setTextSize(this.d);
        StaticLayout staticLayout = new StaticLayout("测量行高", this.f, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f12710a = staticLayout;
        this.b = staticLayout.getLineBottom(0) - this.f12710a.getLineTop(0);
        if (this.p) {
            i2 = this.o;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setClickListener(i iVar) {
        this.t = iVar;
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.q = false;
            requestLayout();
        } else {
            this.q = true;
            this.e = charSequence;
            requestLayout();
            invalidate();
        }
    }

    public void setTextColor(int i) {
        this.f.setColor(i);
        this.c = i;
        invalidate();
    }

    public void setTextSize(int i) {
        this.d = i;
        this.f.setTextSize(i);
        requestLayout();
        invalidate();
    }
}
