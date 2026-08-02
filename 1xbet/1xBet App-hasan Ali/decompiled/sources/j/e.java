package j;

import A0.C;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.StateSet;
import b2.p;
import f1.AbstractC1940b;
import n.m0;
import org.xmlpull.v1.XmlPullParserException;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class e extends Drawable implements Drawable.Callback {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f17385D = 0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f17388C;

    /* renamed from: k, reason: collision with root package name */
    public b f17389k;

    /* renamed from: l, reason: collision with root package name */
    public Rect f17390l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f17391m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f17392n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17394p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17396r;

    /* renamed from: s, reason: collision with root package name */
    public C f17397s;

    /* renamed from: t, reason: collision with root package name */
    public long f17398t;

    /* renamed from: u, reason: collision with root package name */
    public long f17399u;

    /* renamed from: v, reason: collision with root package name */
    public I2.a f17400v;

    /* renamed from: w, reason: collision with root package name */
    public b f17401w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f17402x;

    /* renamed from: y, reason: collision with root package name */
    public b f17403y;

    /* renamed from: z, reason: collision with root package name */
    public AbstractC2349a f17404z;

    /* renamed from: o, reason: collision with root package name */
    public int f17393o = 255;

    /* renamed from: q, reason: collision with root package name */
    public int f17395q = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f17386A = -1;

    /* renamed from: B, reason: collision with root package name */
    public int f17387B = -1;

    public e(b bVar, Resources resources) {
        i(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0272, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0279, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e c(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        e eVar = new e(null, null);
        TypedArray f = AbstractC1940b.f(resources2, theme, attributeSet, k.b.f17532a);
        int i = 1;
        eVar.setVisible(f.getBoolean(1, true), true);
        b bVar = eVar.f17403y;
        bVar.f17359d |= k.a.b(f);
        int i5 = 2;
        bVar.i = f.getBoolean(2, bVar.i);
        int i6 = 3;
        bVar.f17365l = f.getBoolean(3, bVar.f17365l);
        bVar.f17378y = f.getInt(4, bVar.f17378y);
        bVar.f17379z = f.getInt(5, bVar.f17379z);
        boolean z3 = false;
        eVar.setDither(f.getBoolean(0, bVar.f17376w));
        b bVar2 = eVar.f17389k;
        if (resources2 != null) {
            bVar2.f17357b = resources2;
            int i7 = resources2.getDisplayMetrics().densityDpi;
            if (i7 == 0) {
                i7 = 160;
            }
            int i8 = bVar2.f17358c;
            bVar2.f17358c = i7;
            if (i8 != i7) {
                bVar2.f17366m = false;
                bVar2.f17363j = false;
            }
        } else {
            bVar2.getClass();
        }
        f.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i6)) {
                break;
            }
            if (next3 == i5 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray f5 = AbstractC1940b.f(resources2, theme, attributeSet, k.b.f17533b);
                    int resourceId = f5.getResourceId(z3 ? 1 : 0, z3 ? 1 : 0);
                    int resourceId2 = f5.getResourceId(i, -1);
                    Drawable f6 = resourceId2 > 0 ? m0.d().f(context2, resourceId2) : null;
                    f5.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i9 = z3 ? 1 : 0;
                    for (int i10 = i9; i10 < attributeCount; i10++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i11 = i9 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i10, z3)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i9] = attributeNameResource;
                            i9 = i11;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr, i9);
                    if (f6 == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            f6 = new p();
                            f6.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            f6 = k.a.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (f6 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar3 = eVar.f17403y;
                    int a5 = bVar3.a(f6);
                    bVar3.f17354H[a5] = trimStateSet;
                    bVar3.J.i(a5, Integer.valueOf(resourceId));
                } else if (xmlResourceParser.getName().equals("transition")) {
                    TypedArray f7 = AbstractC1940b.f(resources2, theme, attributeSet, k.b.f17534c);
                    int resourceId3 = f7.getResourceId(2, -1);
                    int resourceId4 = f7.getResourceId(1, -1);
                    int resourceId5 = f7.getResourceId(z3 ? 1 : 0, -1);
                    Drawable f8 = resourceId5 > 0 ? m0.d().f(context2, resourceId5) : null;
                    boolean z5 = f7.getBoolean(3, z3);
                    f7.recycle();
                    if (f8 == null) {
                        do {
                            next = xmlResourceParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("animated-vector")) {
                            f8 = new b2.d(context2);
                            f8.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            f8 = k.a.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (f8 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    if (resourceId3 == -1 || resourceId4 == -1) {
                        break;
                    }
                    b bVar4 = eVar.f17403y;
                    int a6 = bVar4.a(f8);
                    long j5 = resourceId3;
                    long j6 = resourceId4;
                    long j7 = (j5 << 32) | j6;
                    long j8 = z5 ? 8589934592L : 0L;
                    long j9 = a6;
                    bVar4.f17355I.a(j7, Long.valueOf(j9 | j8));
                    if (z5) {
                        bVar4.f17355I.a((j6 << 32) | j5, Long.valueOf(j9 | 4294967296L | j8));
                    }
                    context2 = context;
                    resources2 = resources;
                    i = 1;
                    z3 = false;
                    i5 = 2;
                    i6 = 3;
                } else {
                    context2 = context;
                    resources2 = resources;
                }
                i = 1;
                i5 = 2;
                i6 = 3;
            }
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z3) {
        boolean z5;
        Drawable drawable;
        boolean z6 = true;
        this.f17394p = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f17391m;
        if (drawable2 != null) {
            long j5 = this.f17398t;
            if (j5 != 0) {
                if (j5 > uptimeMillis) {
                    drawable2.setAlpha(((255 - (((int) ((j5 - uptimeMillis) * 255)) / this.f17389k.f17378y)) * this.f17393o) / 255);
                    z5 = true;
                    drawable = this.f17392n;
                    if (drawable == null) {
                        long j6 = this.f17399u;
                        if (j6 != 0) {
                            if (j6 > uptimeMillis) {
                                drawable.setAlpha(((((int) ((j6 - uptimeMillis) * 255)) / this.f17389k.f17379z) * this.f17393o) / 255);
                                if (z3 && z6) {
                                    scheduleSelf(this.f17397s, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                            drawable.setVisible(false, false);
                            this.f17392n = null;
                            this.f17399u = 0L;
                        }
                    } else {
                        this.f17399u = 0L;
                    }
                    z6 = z5;
                    if (z3) {
                        return;
                    } else {
                        return;
                    }
                }
                drawable2.setAlpha(this.f17393o);
                this.f17398t = 0L;
            }
        } else {
            this.f17398t = 0L;
        }
        z5 = false;
        drawable = this.f17392n;
        if (drawable == null) {
        }
        z6 = z5;
        if (z3) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        b bVar = this.f17389k;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i = bVar.f17362h;
        Drawable[] drawableArr = bVar.f17361g;
        for (int i5 = 0; i5 < i; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i5].applyTheme(theme);
                bVar.f17360e |= drawableArr[i5].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.f17357b = resources;
            int i6 = resources.getDisplayMetrics().densityDpi;
            if (i6 == 0) {
                i6 = 160;
            }
            int i7 = bVar.f17358c;
            bVar.f17358c = i6;
            if (i7 != i6) {
                bVar.f17366m = false;
                bVar.f17363j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f17389k.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f17400v == null) {
            this.f17400v = new I2.a();
        }
        I2.a aVar = this.f17400v;
        aVar.f2598l = drawable.getCallback();
        drawable.setCallback(aVar);
        try {
            if (this.f17389k.f17378y <= 0 && this.f17394p) {
                drawable.setAlpha(this.f17393o);
            }
            b bVar = this.f17389k;
            if (bVar.f17349C) {
                drawable.setColorFilter(bVar.f17348B);
            } else {
                if (bVar.f17352F) {
                    drawable.setTintList(bVar.f17350D);
                }
                b bVar2 = this.f17389k;
                if (bVar2.f17353G) {
                    drawable.setTintMode(bVar2.f17351E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f17389k.f17376w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f17389k.f17347A);
            Rect rect = this.f17390l;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            I2.a aVar2 = this.f17400v;
            Drawable.Callback callback = (Drawable.Callback) aVar2.f2598l;
            aVar2.f2598l = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            I2.a aVar3 = this.f17400v;
            Drawable.Callback callback2 = (Drawable.Callback) aVar3.f2598l;
            aVar3.f2598l = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f17391m;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f17392n;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z3;
        Drawable drawable = this.f17392n;
        boolean z5 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f17392n = null;
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.f17391m;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f17394p) {
                this.f17391m.setAlpha(this.f17393o);
            }
        }
        if (this.f17399u != 0) {
            this.f17399u = 0L;
            z3 = true;
        }
        if (this.f17398t != 0) {
            this.f17398t = 0L;
        } else {
            z5 = z3;
        }
        if (z5) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f17396r && super.mutate() == this) {
            b bVar = new b(this.f17403y, this, null);
            bVar.f17355I = bVar.f17355I.clone();
            bVar.J = bVar.J.clone();
            i(bVar);
            this.f17396r = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f17402x) {
            f();
            b bVar = this.f17401w;
            bVar.f17355I = bVar.f17355I.clone();
            bVar.J = bVar.J.clone();
            this.f17402x = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f17393o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f17389k.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z3;
        b bVar = this.f17389k;
        if (!bVar.f17374u) {
            bVar.c();
            bVar.f17374u = true;
            int i = bVar.f17362h;
            Drawable[] drawableArr = bVar.f17361g;
            int i5 = 0;
            while (true) {
                if (i5 >= i) {
                    bVar.f17375v = true;
                    z3 = true;
                    break;
                }
                if (drawableArr[i5].getConstantState() == null) {
                    bVar.f17375v = false;
                    z3 = false;
                    break;
                }
                i5++;
            }
        } else {
            z3 = bVar.f17375v;
        }
        if (!z3) {
            return null;
        }
        this.f17389k.f17359d = getChangingConfigurations();
        return this.f17389k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f17391m;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f17390l;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f17389k;
        if (bVar.f17365l) {
            if (!bVar.f17366m) {
                bVar.b();
            }
            return bVar.f17368o;
        }
        Drawable drawable = this.f17391m;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f17389k;
        if (bVar.f17365l) {
            if (!bVar.f17366m) {
                bVar.b();
            }
            return bVar.f17367n;
        }
        Drawable drawable = this.f17391m;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f17389k;
        if (bVar.f17365l) {
            if (!bVar.f17366m) {
                bVar.b();
            }
            return bVar.f17370q;
        }
        Drawable drawable = this.f17391m;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f17389k;
        if (bVar.f17365l) {
            if (!bVar.f17366m) {
                bVar.b();
            }
            return bVar.f17369p;
        }
        Drawable drawable = this.f17391m;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f17391m;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f17389k;
            if (bVar.f17371r) {
                return bVar.f17372s;
            }
            bVar.c();
            int i = bVar.f17362h;
            Drawable[] drawableArr = bVar.f17361g;
            r1 = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i5 = 1; i5 < i; i5++) {
                r1 = Drawable.resolveOpacity(r1, drawableArr[i5].getOpacity());
            }
            bVar.f17372s = r1;
            bVar.f17371r = true;
        }
        return r1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f17391m;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f17389k;
        boolean z3 = false;
        Rect rect2 = null;
        if (!bVar.i) {
            Rect rect3 = bVar.f17364k;
            if (rect3 != null || bVar.f17363j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i = bVar.f17362h;
                Drawable[] drawableArr = bVar.f17361g;
                for (int i5 = 0; i5 < i; i5++) {
                    if (drawableArr[i5].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i6 = rect4.left;
                        if (i6 > rect2.left) {
                            rect2.left = i6;
                        }
                        int i7 = rect4.top;
                        if (i7 > rect2.top) {
                            rect2.top = i7;
                        }
                        int i8 = rect4.right;
                        if (i8 > rect2.right) {
                            rect2.right = i8;
                        }
                        int i9 = rect4.bottom;
                        if (i9 > rect2.bottom) {
                            rect2.bottom = i9;
                        }
                    }
                }
                bVar.f17363j = true;
                bVar.f17364k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z3 = true;
            }
        } else {
            Drawable drawable = this.f17391m;
            z3 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f17389k.f17347A && getLayoutDirection() == 1) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i) {
        C c5;
        if (i == this.f17395q) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f17389k.f17379z > 0) {
            Drawable drawable = this.f17392n;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f17391m;
            if (drawable2 != null) {
                this.f17392n = drawable2;
                this.f17399u = this.f17389k.f17379z + uptimeMillis;
            } else {
                this.f17392n = null;
                this.f17399u = 0L;
            }
        } else {
            Drawable drawable3 = this.f17391m;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            b bVar = this.f17389k;
            if (i < bVar.f17362h) {
                Drawable d5 = bVar.d(i);
                this.f17391m = d5;
                this.f17395q = i;
                if (d5 != null) {
                    int i5 = this.f17389k.f17378y;
                    if (i5 > 0) {
                        this.f17398t = uptimeMillis + i5;
                    }
                    d(d5);
                }
                if (this.f17398t == 0 || this.f17399u != 0) {
                    c5 = this.f17397s;
                    if (c5 != null) {
                        this.f17397s = new C(12, this);
                    } else {
                        unscheduleSelf(c5);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.f17391m = null;
        this.f17395q = -1;
        if (this.f17398t == 0) {
        }
        c5 = this.f17397s;
        if (c5 != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    public final void i(b bVar) {
        this.f17389k = bVar;
        int i = this.f17395q;
        if (i >= 0) {
            Drawable d5 = bVar.d(i);
            this.f17391m = d5;
            if (d5 != null) {
                d(d5);
            }
        }
        this.f17392n = null;
        this.f17401w = bVar;
        this.f17403y = bVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f17389k;
        if (bVar != null) {
            bVar.f17371r = false;
            bVar.f17373t = false;
        }
        if (drawable != this.f17391m || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f17389k.f17347A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z3, boolean z5) {
        boolean visible = super.setVisible(z3, z5);
        Drawable drawable = this.f17392n;
        if (drawable != null) {
            drawable.setVisible(z3, z5);
        }
        Drawable drawable2 = this.f17391m;
        if (drawable2 != null) {
            drawable2.setVisible(z3, z5);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        AbstractC2349a abstractC2349a = this.f17404z;
        if (abstractC2349a != null) {
            abstractC2349a.P();
            this.f17404z = null;
            h(this.f17386A);
            this.f17386A = -1;
            this.f17387B = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f17388C) {
            g();
            b bVar = this.f17403y;
            bVar.f17355I = bVar.f17355I.clone();
            bVar.J = bVar.J.clone();
            this.f17388C = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17392n;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f17391m;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        b bVar = this.f17389k;
        int i5 = this.f17395q;
        int i6 = bVar.f17362h;
        Drawable[] drawableArr = bVar.f17361g;
        boolean z3 = false;
        for (int i7 = 0; i7 < i6; i7++) {
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i);
                if (i7 == i5) {
                    z3 = layoutDirection;
                }
            }
        }
        bVar.f17377x = i;
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f17392n;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f17391m;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (h(r1) != false) goto L45;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        AbstractC2349a aVar;
        b bVar = this.f17403y;
        int f = bVar.f(iArr);
        if (f < 0) {
            f = bVar.f(StateSet.WILD_CARD);
        }
        int i = this.f17395q;
        if (f != i) {
            AbstractC2349a abstractC2349a = this.f17404z;
            if (abstractC2349a != null) {
                if (f != this.f17386A) {
                    if (f == this.f17387B && abstractC2349a.n()) {
                        abstractC2349a.M();
                        this.f17386A = this.f17387B;
                        this.f17387B = f;
                    } else {
                        i = this.f17386A;
                        abstractC2349a.P();
                    }
                }
                r2 = true;
            }
            this.f17404z = null;
            this.f17387B = -1;
            this.f17386A = -1;
            b bVar2 = this.f17403y;
            int e3 = bVar2.e(i);
            int e5 = bVar2.e(f);
            if (e5 != 0 && e3 != 0) {
                long j5 = e5 | (e3 << 32);
                int longValue = (int) ((Long) bVar2.f17355I.c(j5)).longValue();
                if (longValue >= 0) {
                    boolean z3 = (((Long) bVar2.f17355I.c(j5)).longValue() & 8589934592L) != 0;
                    h(longValue);
                    Object obj = this.f17391m;
                    if (obj instanceof AnimationDrawable) {
                        aVar = new c((AnimationDrawable) obj, (((Long) bVar2.f17355I.c(j5)).longValue() & 4294967296L) != 0, z3);
                    } else if (obj instanceof b2.d) {
                        aVar = new a((b2.d) obj, 1);
                    } else if (obj instanceof Animatable) {
                        aVar = new a((Animatable) obj, 0);
                    }
                    aVar.O();
                    this.f17404z = aVar;
                    this.f17387B = i;
                    this.f17386A = f;
                    r2 = true;
                }
            }
        }
        Drawable drawable = this.f17391m;
        return drawable != null ? drawable.setState(iArr) | r2 : r2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        if (drawable != this.f17391m || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f17394p && this.f17393o == i) {
            return;
        }
        this.f17394p = true;
        this.f17393o = i;
        Drawable drawable = this.f17391m;
        if (drawable != null) {
            if (this.f17398t == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        b bVar = this.f17389k;
        if (bVar.f17347A != z3) {
            bVar.f17347A = z3;
            Drawable drawable = this.f17391m;
            if (drawable != null) {
                drawable.setAutoMirrored(z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f17389k;
        bVar.f17349C = true;
        if (bVar.f17348B != colorFilter) {
            bVar.f17348B = colorFilter;
            Drawable drawable = this.f17391m;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        b bVar = this.f17389k;
        if (bVar.f17376w != z3) {
            bVar.f17376w = z3;
            Drawable drawable = this.f17391m;
            if (drawable != null) {
                drawable.setDither(z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f5) {
        Drawable drawable = this.f17391m;
        if (drawable != null) {
            drawable.setHotspot(f, f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i5, int i6, int i7) {
        Rect rect = this.f17390l;
        if (rect == null) {
            this.f17390l = new Rect(i, i5, i6, i7);
        } else {
            rect.set(i, i5, i6, i7);
        }
        Drawable drawable = this.f17391m;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i5, i6, i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f17389k;
        bVar.f17352F = true;
        if (bVar.f17350D != colorStateList) {
            bVar.f17350D = colorStateList;
            this.f17391m.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f17389k;
        bVar.f17353G = true;
        if (bVar.f17351E != mode) {
            bVar.f17351E = mode;
            this.f17391m.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z5) {
        boolean j5 = j(z3, z5);
        AbstractC2349a abstractC2349a = this.f17404z;
        if (abstractC2349a != null && (j5 || z5)) {
            if (z3) {
                abstractC2349a.O();
                return j5;
            }
            jumpToCurrentState();
        }
        return j5;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f17391m || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
