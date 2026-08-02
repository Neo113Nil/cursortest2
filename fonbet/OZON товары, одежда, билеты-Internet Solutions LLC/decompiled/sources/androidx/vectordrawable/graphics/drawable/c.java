package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import androidx.core.content.res.g;
import androidx.core.content.res.k;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class c extends d implements Animatable {

    /* renamed from: b, reason: collision with root package name */
    private b f45062b;

    /* renamed from: c, reason: collision with root package name */
    private Context f45063c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable.Callback f45064d;

    final class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
            c.this.scheduleSelf(runnable, j11);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    private static class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        e f45066a;

        /* renamed from: b, reason: collision with root package name */
        AnimatorSet f45067b;

        /* renamed from: c, reason: collision with root package name */
        ArrayList<Animator> f45068c;

        /* renamed from: d, reason: collision with root package name */
        C5132a<Animator, String> f45069d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private c(Context context) {
        this.f45064d = new a();
        this.f45063c = context;
        this.f45062b = new b();
    }

    public static c a(int i11, @NonNull Context context) {
        c cVar = new c(context);
        Drawable d11 = g.d(context.getResources(), i11, context.getTheme());
        cVar.f45071a = d11;
        d11.setCallback(cVar.f45064d);
        new C0818c(cVar.f45071a.getConstantState());
        return cVar;
    }

    @Override // androidx.vectordrawable.graphics.drawable.d, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f45062b;
        bVar.f45066a.draw(canvas);
        if (bVar.f45067b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.getAlpha() : this.f45062b.f45066a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f45062b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f45071a;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f45062b.f45066a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f45071a != null) {
            return new C0818c(this.f45071a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f45062b.f45066a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f45062b.f45066a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.getOpacity() : this.f45062b.f45066a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b1, code lost:
    
        if (r3.f45067b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b3, code lost:
    
        r3.f45067b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ba, code lost:
    
        r3.f45067b.playTogether(r3.f45068c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c1, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.e(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            b bVar = this.f45062b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray e11 = k.e(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f45060e);
                    int resourceId = e11.getResourceId(0, 0);
                    if (resourceId != 0) {
                        e a11 = e.a(resources, resourceId, theme);
                        a11.c();
                        a11.setCallback(this.f45064d);
                        e eVar = bVar.f45066a;
                        if (eVar != null) {
                            eVar.setCallback(null);
                        }
                        bVar.f45066a = a11;
                    }
                    e11.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f45061f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f45063c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(bVar.f45066a.b(string));
                        if (bVar.f45068c == null) {
                            bVar.f45068c = new ArrayList<>();
                            bVar.f45069d = new C5132a<>();
                        }
                        bVar.f45068c.add(loadAnimator);
                        bVar.f45069d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.isAutoMirrored() : this.f45062b.f45066a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f45071a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f45062b.f45067b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.isStateful() : this.f45062b.f45066a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f45062b.f45066a.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.d, android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i11) {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.setLevel(i11) : this.f45062b.f45066a.setLevel(i11);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.setState(iArr) : this.f45062b.f45066a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else {
            this.f45062b.f45066a.setAlpha(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.setAutoMirrored(z11);
        } else {
            this.f45062b.f45066a.setAutoMirrored(z11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f45062b.f45066a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i11) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, i11);
        } else {
            this.f45062b.f45066a.setTint(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, colorStateList);
        } else {
            this.f45062b.f45066a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, mode);
        } else {
            this.f45062b.f45066a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            return drawable.setVisible(z11, z12);
        }
        this.f45062b.f45066a.setVisible(z11, z12);
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f45062b;
        if (bVar.f45067b.isStarted()) {
            return;
        }
        bVar.f45067b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f45062b.f45067b.end();
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C0818c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f45070a;

        public C0818c(Drawable.ConstantState constantState) {
            this.f45070a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f45070a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f45070a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f45070a.newDrawable();
            cVar.f45071a = newDrawable;
            newDrawable.setCallback(cVar.f45064d);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f45070a.newDrawable(resources);
            cVar.f45071a = newDrawable;
            newDrawable.setCallback(cVar.f45064d);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f45070a.newDrawable(resources, theme);
            cVar.f45071a = newDrawable;
            newDrawable.setCallback(cVar.f45064d);
            return cVar;
        }
    }

    c() {
        this(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
