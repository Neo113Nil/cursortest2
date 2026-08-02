package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.g;
import j.C7232a;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f37865a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f37866b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f37867c;

    private b0(TypedArray typedArray, Context context) {
        this.f37865a = context;
        this.f37866b = typedArray;
    }

    public static b0 t(Context context, int i11, int[] iArr) {
        return new b0(context.obtainStyledAttributes(i11, iArr), context);
    }

    public static b0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new b0(context.obtainStyledAttributes(attributeSet, iArr), context);
    }

    public static b0 v(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12) {
        return new b0(context.obtainStyledAttributes(attributeSet, iArr, i11, i12), context);
    }

    public final boolean a(int i11, boolean z11) {
        return this.f37866b.getBoolean(i11, z11);
    }

    public final int b(int i11) {
        return this.f37866b.getColor(i11, 0);
    }

    public final ColorStateList c(int i11) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.f37866b;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (colorStateList = androidx.core.content.a.getColorStateList(this.f37865a, resourceId)) == null) ? typedArray.getColorStateList(i11) : colorStateList;
    }

    public final float d(int i11) {
        return this.f37866b.getDimension(i11, -1.0f);
    }

    public final int e(int i11, int i12) {
        return this.f37866b.getDimensionPixelOffset(i11, i12);
    }

    public final int f(int i11, int i12) {
        return this.f37866b.getDimensionPixelSize(i11, i12);
    }

    public final Drawable g(int i11) {
        int resourceId;
        TypedArray typedArray = this.f37866b;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0) ? typedArray.getDrawable(i11) : C7232a.a(this.f37865a, resourceId);
    }

    public final Drawable h(int i11) {
        int resourceId;
        TypedArray typedArray = this.f37866b;
        if (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0) {
            return null;
        }
        return C5064i.b().d(resourceId, this.f37865a);
    }

    public final float i() {
        return this.f37866b.getFloat(4, -1.0f);
    }

    public final Typeface j(int i11, int i12, g.e eVar) {
        int resourceId = this.f37866b.getResourceId(i11, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f37867c == null) {
            this.f37867c = new TypedValue();
        }
        return androidx.core.content.res.g.f(this.f37865a, resourceId, this.f37867c, i12, eVar);
    }

    public final int k(int i11, int i12) {
        return this.f37866b.getInt(i11, i12);
    }

    public final int l(int i11, int i12) {
        return this.f37866b.getInteger(i11, i12);
    }

    public final int m(int i11, int i12) {
        return this.f37866b.getLayoutDimension(i11, i12);
    }

    public final int n(int i11, int i12) {
        return this.f37866b.getResourceId(i11, i12);
    }

    public final String o(int i11) {
        return this.f37866b.getString(i11);
    }

    public final CharSequence p(int i11) {
        return this.f37866b.getText(i11);
    }

    public final CharSequence[] q() {
        return this.f37866b.getTextArray(0);
    }

    public final TypedArray r() {
        return this.f37866b;
    }

    public final boolean s(int i11) {
        return this.f37866b.hasValue(i11);
    }

    public final TypedValue w() {
        return this.f37866b.peekValue(19);
    }

    public final void x() {
        this.f37866b.recycle();
    }
}
