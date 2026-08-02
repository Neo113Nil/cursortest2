package b2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import f1.AbstractC1940b;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r.C2327e;

/* loaded from: classes.dex */
public final class d extends g implements Animatable {

    /* renamed from: m, reason: collision with root package name */
    public final Context f7229m;

    /* renamed from: n, reason: collision with root package name */
    public final I2.a f7230n = new I2.a(1, this);

    /* renamed from: l, reason: collision with root package name */
    public final b f7228l = new b();

    public d(Context context) {
        this.f7229m = context;
    }

    @Override // b2.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f7228l;
        bVar.f7223a.draw(canvas);
        if (bVar.f7224b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.getAlpha() : this.f7228l.f7223a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f7228l.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.getColorFilter() : this.f7228l.f7223a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f7233k == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f7233k.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f7228l.f7223a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f7228l.f7223a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.getOpacity() : this.f7228l.f7223a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x017f, code lost:
    
        if (r8.f7224b != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0181, code lost:
    
        r8.f7224b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0188, code lost:
    
        r8.f7224b.playTogether(r8.f7225c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x018f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser animation;
        Animator a5;
        p pVar;
        int next;
        p pVar2;
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            b bVar = this.f7228l;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f = AbstractC1940b.f(resources, theme, attributeSet, AbstractC0509a.f7218e);
                    int resourceId = f.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = p.f7280t;
                        if (Build.VERSION.SDK_INT >= 24) {
                            pVar = new p();
                            ThreadLocal threadLocal = f1.j.f16961a;
                            pVar.f7233k = resources.getDrawable(resourceId, theme);
                            new o(pVar.f7233k.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                pVar = new p();
                                pVar.inflate(resources, xml, asAttributeSet, theme);
                            } catch (IOException e3) {
                                Log.e("VectorDrawableCompat", "parser error", e3);
                                pVar = null;
                                pVar.f7285p = false;
                                pVar.setCallback(this.f7230n);
                                pVar2 = bVar.f7223a;
                                if (pVar2 != null) {
                                }
                                bVar.f7223a = pVar;
                                f.recycle();
                                eventType = xmlPullParser.next();
                            } catch (XmlPullParserException e5) {
                                Log.e("VectorDrawableCompat", "parser error", e5);
                                pVar = null;
                                pVar.f7285p = false;
                                pVar.setCallback(this.f7230n);
                                pVar2 = bVar.f7223a;
                                if (pVar2 != null) {
                                }
                                bVar.f7223a = pVar;
                                f.recycle();
                                eventType = xmlPullParser.next();
                            }
                        }
                        pVar.f7285p = false;
                        pVar.setCallback(this.f7230n);
                        pVar2 = bVar.f7223a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        bVar.f7223a = pVar;
                    }
                    f.recycle();
                } else {
                    XmlResourceParser xmlResourceParser = null;
                    if ("target".equals(name)) {
                        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0509a.f);
                        String string = obtainAttributes.getString(0);
                        int resourceId2 = obtainAttributes.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.f7229m;
                            if (context == null) {
                                obtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                a5 = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        animation = resources2.getAnimation(resourceId2);
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (IOException e6) {
                                    e = e6;
                                } catch (XmlPullParserException e7) {
                                    e = e7;
                                }
                                try {
                                    a5 = AbstractC0509a.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                    animation.close();
                                } catch (IOException e8) {
                                    e = e8;
                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException.initCause(e);
                                    throw notFoundException;
                                } catch (XmlPullParserException e9) {
                                    e = e9;
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException2.initCause(e);
                                    throw notFoundException2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = animation;
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            }
                            a5.setTarget(bVar.f7223a.f7281l.f7270b.f7268o.get(string));
                            if (bVar.f7225c == null) {
                                bVar.f7225c = new ArrayList();
                                bVar.f7226d = new C2327e(0);
                            }
                            bVar.f7225c.add(a5);
                            bVar.f7226d.put(a5, string);
                        }
                        obtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.isAutoMirrored() : this.f7228l.f7223a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f7233k;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f7228l.f7224b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.isStateful() : this.f7228l.f7223a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f7228l.f7223a.setBounds(rect);
        }
    }

    @Override // b2.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.setLevel(i) : this.f7228l.f7223a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.setState(iArr) : this.f7228l.f7223a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f7228l.f7223a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f7228l.f7223a.setAutoMirrored(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7228l.f7223a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.f7228l.f7223a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f7228l.f7223a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f7228l.f7223a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z5) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            return drawable.setVisible(z3, z5);
        }
        this.f7228l.f7223a.setVisible(z3, z5);
        return super.setVisible(z3, z5);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f7228l;
        if (bVar.f7224b.isStarted()) {
            return;
        }
        bVar.f7224b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f7228l.f7224b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
