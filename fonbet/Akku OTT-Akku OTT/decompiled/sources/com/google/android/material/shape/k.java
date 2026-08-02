package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

/* loaded from: classes4.dex */
public final class k {
    public d a = new j();
    public d b = new j();
    public d c = new j();
    public d d = new j();
    public c e = new com.google.android.material.shape.a(0.0f);
    public c f = new com.google.android.material.shape.a(0.0f);
    public c g = new com.google.android.material.shape.a(0.0f);
    public c h = new com.google.android.material.shape.a(0.0f);
    public f i = new f();
    public f j = new f();
    public f k = new f();
    public f l = new f();

    public static final class a {

        @NonNull
        public d a = new j();

        @NonNull
        public d b = new j();

        @NonNull
        public d c = new j();

        @NonNull
        public d d = new j();

        @NonNull
        public c e = new com.google.android.material.shape.a(0.0f);

        @NonNull
        public c f = new com.google.android.material.shape.a(0.0f);

        @NonNull
        public c g = new com.google.android.material.shape.a(0.0f);

        @NonNull
        public c h = new com.google.android.material.shape.a(0.0f);

        @NonNull
        public f i = new f();

        @NonNull
        public f j = new f();

        @NonNull
        public f k = new f();

        @NonNull
        public f l = new f();

        public static float b(d dVar) {
            if (dVar instanceof j) {
                ((j) dVar).getClass();
                return -1.0f;
            }
            if (dVar instanceof e) {
                ((e) dVar).getClass();
            }
            return -1.0f;
        }

        @NonNull
        public final k a() {
            k kVar = new k();
            kVar.a = this.a;
            kVar.b = this.b;
            kVar.c = this.c;
            kVar.d = this.d;
            kVar.e = this.e;
            kVar.f = this.f;
            kVar.g = this.g;
            kVar.h = this.h;
            kVar.i = this.i;
            kVar.j = this.j;
            kVar.k = this.k;
            kVar.l = this.l;
            return kVar;
        }
    }

    @NonNull
    public static a a(Context context, @StyleRes int i, @StyleRes int i2, @NonNull com.google.android.material.shape.a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(com.google.android.material.a.w);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            c c = c(obtainStyledAttributes, 5, aVar);
            c c2 = c(obtainStyledAttributes, 8, c);
            c c3 = c(obtainStyledAttributes, 9, c);
            c c4 = c(obtainStyledAttributes, 7, c);
            c c5 = c(obtainStyledAttributes, 6, c);
            a aVar2 = new a();
            d a2 = h.a(i4);
            aVar2.a = a2;
            a.b(a2);
            aVar2.e = c2;
            d a3 = h.a(i5);
            aVar2.b = a3;
            a.b(a3);
            aVar2.f = c3;
            d a4 = h.a(i6);
            aVar2.c = a4;
            a.b(a4);
            aVar2.g = c4;
            d a5 = h.a(i7);
            aVar2.d = a5;
            a.b(a5);
            aVar2.h = c5;
            return aVar2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static a b(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        com.google.android.material.shape.a aVar = new com.google.android.material.shape.a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.q, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    @NonNull
    public static c c(TypedArray typedArray, int i, @NonNull c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new com.google.android.material.shape.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new i(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean d(@NonNull RectF rectF) {
        boolean z = this.l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.b instanceof j) && (this.a instanceof j) && (this.c instanceof j) && (this.d instanceof j));
    }

    @NonNull
    public final a e() {
        a aVar = new a();
        aVar.a = new j();
        aVar.b = new j();
        aVar.c = new j();
        aVar.d = new j();
        aVar.e = new com.google.android.material.shape.a(0.0f);
        aVar.f = new com.google.android.material.shape.a(0.0f);
        aVar.g = new com.google.android.material.shape.a(0.0f);
        aVar.h = new com.google.android.material.shape.a(0.0f);
        aVar.i = new f();
        aVar.j = new f();
        aVar.k = new f();
        new f();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.l;
        return aVar;
    }
}
