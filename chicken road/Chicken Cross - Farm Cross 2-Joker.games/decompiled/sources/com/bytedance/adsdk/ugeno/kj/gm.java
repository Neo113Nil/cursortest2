package com.bytedance.adsdk.ugeno.kj;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public class gm extends ViewGroup {
    private boolean atb;
    private vj bg;
    private int dax;
    private boolean erj;
    private int ew;
    private EdgeEffect fmh;
    private float fum;
    private boolean gbb;
    private boolean gd;
    private final Runnable gdh;
    com.bytedance.adsdk.ugeno.kj.sf gm;
    private int gpj;
    private Scroller hc;
    private oo hoh;
    private EdgeEffect hpk;
    private int iv;
    private wh jr;
    private boolean jsj;
    private final sf kj;
    private VelocityTracker kun;
    private int kz;
    private float lo;
    private int lq;
    private int lrr;
    private int lu;
    private boolean mk;
    private float mu;
    private Drawable nac;
    private float nn;
    private int of;
    int oo;
    private int ork;
    private int otd;
    private int pcc;
    private float pq;
    private List<oo> ptr;
    private oo qcw;
    private final ArrayList<sf> qf;
    private boolean qy;
    private boolean ri;
    private int rj;
    private float rnn;
    private int se;
    private ClassLoader tmg;
    private ArrayList<View> tmh;
    private int tsx;
    private int tsz;
    private int tz;
    private Parcelable vh;
    private List<Object> vr;
    private final Rect vy;
    private int xb;
    private int ye;
    private boolean yt;
    private boolean zsj;
    private int zti;
    static final int[] sf = {R.attr.layout_gravity};
    private static final Comparator<sf> vj = new Comparator<sf>() { // from class: com.bytedance.adsdk.ugeno.kj.gm.1
        @Override // java.util.Comparator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public int compare(sf sfVar, sf sfVar2) {
            return sfVar.sf - sfVar2.sf;
        }
    };
    private static final Interpolator wh = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.kj.gm.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final kj gh = new kj();

    public interface oo {
        void hc(int i);

        void pcc(int i, float f, int i2);

        void tmg(int i);
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface pcc {
    }

    public interface vj {
        void pcc(View view, float f);
    }

    static class sf {
        boolean gm;
        float oo;
        Object pcc;
        int sf;
        float vj;

        sf() {
        }
    }

    public gm(Context context) {
        super(context);
        this.qf = new ArrayList<>();
        this.kj = new sf();
        this.vy = new Rect();
        this.ork = -1;
        this.vh = null;
        this.tmg = null;
        this.lo = -3.4028235E38f;
        this.fum = Float.MAX_VALUE;
        this.tsz = 1;
        this.tsx = -1;
        this.zsj = true;
        this.gd = false;
        this.gdh = new Runnable() { // from class: com.bytedance.adsdk.ugeno.kj.gm.3
            @Override // java.lang.Runnable
            public void run() {
                gm.this.setScrollState(0);
                gm.this.gm();
            }
        };
        this.otd = 0;
        pcc();
    }

    void pcc() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.hc = new Scroller(context, wh);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.zti = viewConfiguration.getScaledPagingTouchSlop();
        this.rj = (int) (400.0f * f);
        this.lrr = viewConfiguration.getScaledMaximumFlingVelocity();
        this.hpk = new EdgeEffect(context);
        this.fmh = new EdgeEffect(context);
        this.iv = (int) (25.0f * f);
        this.xb = (int) (2.0f * f);
        this.ye = (int) (f * 16.0f);
    }

    public void setScroller(Scroller scroller) {
        this.hc = scroller;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.gdh);
        Scroller scroller = this.hc;
        if (scroller != null && !scroller.isFinished()) {
            this.hc.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    void setScrollState(int i) {
        if (this.otd == i) {
            return;
        }
        this.otd = i;
        if (this.bg != null) {
            sf(i != 0);
        }
        wh(i);
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.kj.sf sfVar) {
        com.bytedance.adsdk.ugeno.kj.sf sfVar2 = this.gm;
        if (sfVar2 != null) {
            sfVar2.pcc((DataSetObserver) null);
            for (int i = 0; i < this.qf.size(); i++) {
                sf sfVar3 = this.qf.get(i);
                this.gm.pcc((ViewGroup) this, sfVar3.sf, sfVar3.pcc);
            }
            this.qf.clear();
            wh();
            this.oo = 0;
            scrollTo(0, 0);
        }
        this.gm = sfVar;
        this.pcc = 0;
        if (sfVar != null) {
            if (this.jr == null) {
                this.jr = new wh();
            }
            this.gm.pcc((DataSetObserver) this.jr);
            this.jsj = false;
            boolean z = this.zsj;
            this.zsj = true;
            this.pcc = this.gm.pcc();
            int i2 = this.ork;
            if (i2 >= 0) {
                pcc(i2, false, true);
                this.ork = -1;
                this.vh = null;
                this.tmg = null;
            } else if (!z) {
                gm();
            } else {
                requestLayout();
            }
        }
        List<Object> list = this.vr;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.vr.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.vr.get(i3);
        }
    }

    private void wh() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0104gm) getChildAt(i).getLayoutParams()).pcc) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public com.bytedance.adsdk.ugeno.kj.sf getAdapter() {
        return this.gm;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.jsj = false;
        pcc(i, !this.zsj, false);
    }

    public void pcc(int i, boolean z) {
        this.jsj = false;
        pcc(i, z, false);
    }

    public int getCurrentItem() {
        return this.oo;
    }

    void pcc(int i, boolean z, boolean z2) {
        pcc(i, z, z2, 0);
    }

    void pcc(int i, boolean z, boolean z2, int i2) {
        com.bytedance.adsdk.ugeno.kj.sf sfVar = this.gm;
        if (sfVar == null || sfVar.pcc() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.oo == i && this.qf.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.gm.pcc()) {
            i = this.gm.pcc() - 1;
        }
        int i3 = this.tsz;
        int i4 = this.oo;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.qf.size(); i5++) {
                this.qf.get(i5).gm = true;
            }
        }
        boolean z3 = this.oo != i;
        if (this.zsj) {
            this.oo = i;
            if (z3) {
                vj(i);
            }
            requestLayout();
            return;
        }
        pcc(i);
        pcc(i, z, i2, z3);
    }

    private void pcc(int i, boolean z, int i2, boolean z2) {
        sf sf2 = sf(i);
        int clientWidth = sf2 != null ? (int) (getClientWidth() * Math.max(this.lo, Math.min(sf2.vj, this.fum))) : 0;
        if (z) {
            pcc(clientWidth, 0, i2);
            if (z2) {
                vj(i);
                return;
            }
            return;
        }
        if (z2) {
            vj(i);
        }
        pcc(false);
        scrollTo(clientWidth, 0);
        oo(clientWidth);
    }

    @Deprecated
    public void setOnPageChangeListener(oo ooVar) {
        this.hoh = ooVar;
    }

    public void pcc(oo ooVar) {
        if (this.ptr == null) {
            this.ptr = new ArrayList();
        }
        this.ptr.add(ooVar);
    }

    public void sf(oo ooVar) {
        List<oo> list = this.ptr;
        if (list != null) {
            list.remove(ooVar);
        }
    }

    public void pcc(boolean z, vj vjVar) {
        pcc(z, vjVar, 2);
    }

    public void pcc(boolean z, vj vjVar, int i) {
        boolean z2 = vjVar != null;
        boolean z3 = z2 != (this.bg != null);
        this.bg = vjVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.ew = z ? 2 : 1;
            this.kz = i;
        } else {
            this.ew = 0;
        }
        if (z3) {
            gm();
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ew == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0104gm) this.tmh.get(i2).getLayoutParams()).wh;
    }

    public int getOffscreenPageLimit() {
        return this.tsz;
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.tsz) {
            this.tsz = i;
            gm();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.dax;
        this.dax = i;
        int width = getWidth();
        pcc(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.dax;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.nac = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.nac;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.nac;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    float pcc(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    void pcc(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.hc;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.gbb ? this.hc.getCurrX() : this.hc.getStartX();
            this.hc.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            pcc(false);
            gm();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float pcc2 = f2 + (pcc(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(pcc2 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i5) / ((f * this.gm.pcc(this.oo)) + this.dax)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.gbb = false;
        this.hc.startScroll(i4, scrollY, i5, i6, min);
        postInvalidateOnAnimation();
    }

    sf pcc(int i, int i2) {
        sf sfVar = new sf();
        sfVar.sf = i;
        sfVar.pcc = this.gm.pcc((ViewGroup) this, i);
        sfVar.oo = this.gm.pcc(i);
        if (i2 < 0 || i2 >= this.qf.size()) {
            this.qf.add(sfVar);
        } else {
            this.qf.add(i2, sfVar);
        }
        return sfVar;
    }

    void sf() {
        int pcc2 = this.gm.pcc();
        this.pcc = pcc2;
        boolean z = this.qf.size() < (this.tsz * 2) + 1 && this.qf.size() < pcc2;
        int i = this.oo;
        int i2 = 0;
        while (i2 < this.qf.size()) {
            sf sfVar = this.qf.get(i2);
            int pcc3 = this.gm.pcc(sfVar.pcc);
            if (pcc3 != -1) {
                if (pcc3 == -2) {
                    this.qf.remove(i2);
                    i2--;
                    this.gm.pcc((ViewGroup) this, sfVar.sf, sfVar.pcc);
                    if (this.oo == sfVar.sf) {
                        i = Math.max(0, Math.min(this.oo, pcc2 - 1));
                    }
                } else if (sfVar.sf != pcc3) {
                    if (sfVar.sf == this.oo) {
                        i = pcc3;
                    }
                    sfVar.sf = pcc3;
                }
                z = true;
            }
            i2++;
        }
        Collections.sort(this.qf, vj);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C0104gm c0104gm = (C0104gm) getChildAt(i3).getLayoutParams();
                if (!c0104gm.pcc) {
                    c0104gm.gm = 0.0f;
                }
            }
            pcc(i, false, true);
            requestLayout();
        }
    }

    void gm() {
        pcc(this.oo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r8.sf == r17.oo) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void pcc(int i) {
        sf sfVar;
        String hexString;
        sf sfVar2;
        sf pcc2;
        sf sfVar3;
        int i2 = this.oo;
        if (i2 != i) {
            sfVar = sf(i2);
            this.oo = i;
        } else {
            sfVar = null;
        }
        if (this.gm == null) {
            qf();
            return;
        }
        if (this.jsj) {
            qf();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i3 = this.tsz;
        int max = Math.max(0, this.oo - i3);
        int pcc3 = this.gm.pcc();
        int min = Math.min(pcc3 - 1, this.oo + i3);
        if (pcc3 != this.pcc) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.pcc + ", found: " + pcc3 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.gm.getClass());
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.qf.size()) {
                break;
            }
            sfVar2 = this.qf.get(i4);
            if (sfVar2.sf < this.oo) {
                i4++;
            }
        }
        sfVar2 = null;
        if (sfVar2 == null && pcc3 > 0) {
            sfVar2 = pcc(this.oo, i4);
        }
        if (sfVar2 != null) {
            int i5 = i4 - 1;
            sf sfVar4 = i5 >= 0 ? this.qf.get(i5) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - sfVar2.oo) + (getPaddingLeft() / clientWidth);
            float f = 0.0f;
            for (int i6 = this.oo - 1; i6 >= 0; i6--) {
                if (f >= paddingLeft && i6 < max) {
                    if (sfVar4 == null) {
                        break;
                    }
                    if (i6 == sfVar4.sf && !sfVar4.gm) {
                        this.qf.remove(i5);
                        this.gm.pcc((ViewGroup) this, i6, sfVar4.pcc);
                        i5--;
                        i4--;
                        if (i5 >= 0) {
                            sfVar3 = this.qf.get(i5);
                            sfVar4 = sfVar3;
                        }
                        sfVar3 = null;
                        sfVar4 = sfVar3;
                    }
                } else if (sfVar4 != null && i6 == sfVar4.sf) {
                    f += sfVar4.oo;
                    i5--;
                    if (i5 >= 0) {
                        sfVar3 = this.qf.get(i5);
                        sfVar4 = sfVar3;
                    }
                    sfVar3 = null;
                    sfVar4 = sfVar3;
                } else {
                    f += pcc(i6, i5 + 1).oo;
                    i4++;
                    if (i5 >= 0) {
                        sfVar3 = this.qf.get(i5);
                        sfVar4 = sfVar3;
                    }
                    sfVar3 = null;
                    sfVar4 = sfVar3;
                }
            }
            float f2 = sfVar2.oo;
            int i7 = i4 + 1;
            if (f2 < 2.0f) {
                sf sfVar5 = i7 < this.qf.size() ? this.qf.get(i7) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i8 = this.oo;
                while (true) {
                    i8++;
                    if (i8 >= pcc3) {
                        break;
                    }
                    if (f2 >= paddingRight && i8 > min) {
                        if (sfVar5 == null) {
                            break;
                        }
                        if (i8 == sfVar5.sf && !sfVar5.gm) {
                            this.qf.remove(i7);
                            this.gm.pcc((ViewGroup) this, i8, sfVar5.pcc);
                            if (i7 < this.qf.size()) {
                                sfVar5 = this.qf.get(i7);
                            }
                        }
                    } else if (sfVar5 != null && i8 == sfVar5.sf) {
                        f2 += sfVar5.oo;
                        i7++;
                        if (i7 < this.qf.size()) {
                            sfVar5 = this.qf.get(i7);
                        }
                    } else {
                        sf pcc4 = pcc(i8, i7);
                        i7++;
                        f2 += pcc4.oo;
                        sfVar5 = i7 < this.qf.size() ? this.qf.get(i7) : null;
                    }
                }
            }
            pcc(sfVar2, i4, sfVar);
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            C0104gm c0104gm = (C0104gm) childAt.getLayoutParams();
            c0104gm.wh = i9;
            if (!c0104gm.pcc && c0104gm.gm == 0.0f && (pcc2 = pcc(childAt)) != null) {
                c0104gm.gm = pcc2.oo;
                c0104gm.vj = pcc2.sf;
            }
        }
        qf();
        if (hasFocus()) {
            View findFocus = findFocus();
            sf sf2 = findFocus != null ? sf(findFocus) : null;
            if (sf2 == null || sf2.sf != this.oo) {
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt2 = getChildAt(i10);
                    sf pcc5 = pcc(childAt2);
                    if (pcc5 != null && pcc5.sf == this.oo && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    private void qf() {
        if (this.ew != 0) {
            ArrayList<View> arrayList = this.tmh;
            if (arrayList == null) {
                this.tmh = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.tmh.add(getChildAt(i));
            }
            Collections.sort(this.tmh, gh);
        }
    }

    private void pcc(sf sfVar, int i, sf sfVar2) {
        sf sfVar3;
        sf sfVar4;
        int pcc2 = this.gm.pcc();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.dax / clientWidth : 0.0f;
        if (sfVar2 != null) {
            int i2 = sfVar2.sf;
            if (i2 < sfVar.sf) {
                float f2 = sfVar2.vj + sfVar2.oo + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= sfVar.sf && i4 < this.qf.size()) {
                    sf sfVar5 = this.qf.get(i4);
                    while (true) {
                        sfVar4 = sfVar5;
                        if (i3 <= sfVar4.sf || i4 >= this.qf.size() - 1) {
                            break;
                        }
                        i4++;
                        sfVar5 = this.qf.get(i4);
                    }
                    while (i3 < sfVar4.sf) {
                        f2 += this.gm.pcc(i3) + f;
                        i3++;
                    }
                    sfVar4.vj = f2;
                    f2 += sfVar4.oo + f;
                    i3++;
                }
            } else if (i2 > sfVar.sf) {
                int size = this.qf.size() - 1;
                float f3 = sfVar2.vj;
                while (true) {
                    i2--;
                    if (i2 < sfVar.sf || size < 0) {
                        break;
                    }
                    sf sfVar6 = this.qf.get(size);
                    while (true) {
                        sfVar3 = sfVar6;
                        if (i2 >= sfVar3.sf || size <= 0) {
                            break;
                        }
                        size--;
                        sfVar6 = this.qf.get(size);
                    }
                    while (i2 > sfVar3.sf) {
                        f3 -= this.gm.pcc(i2) + f;
                        i2--;
                    }
                    f3 -= sfVar3.oo + f;
                    sfVar3.vj = f3;
                }
            }
        }
        int size2 = this.qf.size();
        float f4 = sfVar.vj;
        int i5 = sfVar.sf - 1;
        this.lo = sfVar.sf == 0 ? sfVar.vj : -3.4028235E38f;
        int i6 = pcc2 - 1;
        this.fum = sfVar.sf == i6 ? (sfVar.vj + sfVar.oo) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            sf sfVar7 = this.qf.get(i7);
            while (i5 > sfVar7.sf) {
                f4 -= this.gm.pcc(i5) + f;
                i5--;
            }
            f4 -= sfVar7.oo + f;
            sfVar7.vj = f4;
            if (sfVar7.sf == 0) {
                this.lo = f4;
            }
            i7--;
            i5--;
        }
        float f5 = sfVar.vj + sfVar.oo + f;
        int i8 = sfVar.sf + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            sf sfVar8 = this.qf.get(i9);
            while (i8 < sfVar8.sf) {
                f5 += this.gm.pcc(i8) + f;
                i8++;
            }
            if (sfVar8.sf == i6) {
                this.fum = (sfVar8.oo + f5) - 1.0f;
            }
            sfVar8.vj = f5;
            f5 += sfVar8.oo + f;
            i9++;
            i8++;
        }
        this.gd = false;
    }

    public static class qf extends com.bytedance.adsdk.ugeno.kj.pcc {
        public static final Parcelable.Creator<qf> CREATOR = new Parcelable.ClassLoaderCreator<qf>() { // from class: com.bytedance.adsdk.ugeno.kj.gm.qf.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public qf createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new qf(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public qf createFromParcel(Parcel parcel) {
                return new qf(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public qf[] newArray(int i) {
                return new qf[i];
            }
        };
        Parcelable gm;
        ClassLoader oo;
        int sf;

        public qf(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // com.bytedance.adsdk.ugeno.kj.pcc, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.sf);
            parcel.writeParcelable(this.gm, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.sf + "}";
        }

        qf(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.sf = parcel.readInt();
            this.gm = parcel.readParcelable(classLoader);
            this.oo = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        qf qfVar = new qf(super.onSaveInstanceState());
        qfVar.sf = this.oo;
        com.bytedance.adsdk.ugeno.kj.sf sfVar = this.gm;
        if (sfVar != null) {
            qfVar.gm = sfVar.sf();
        }
        return qfVar;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof qf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qf qfVar = (qf) parcelable;
        super.onRestoreInstanceState(qfVar.pcc());
        if (this.gm != null) {
            pcc(qfVar.sf, false, true);
            return;
        }
        this.ork = qfVar.sf;
        this.vh = qfVar.gm;
        this.tmg = qfVar.oo;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0104gm c0104gm = (C0104gm) layoutParams;
        c0104gm.pcc |= gm(view);
        if (this.yt) {
            if (c0104gm != null && c0104gm.pcc) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0104gm.oo = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    private static boolean gm(View view) {
        return view.getClass().getAnnotation(pcc.class) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.yt) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    sf pcc(View view) {
        for (int i = 0; i < this.qf.size(); i++) {
            sf sfVar = this.qf.get(i);
            if (this.gm.pcc(view, sfVar.pcc)) {
                return sfVar;
            }
        }
        return null;
    }

    sf sf(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return pcc(view);
            }
        }
    }

    sf sf(int i) {
        for (int i2 = 0; i2 < this.qf.size(); i2++) {
            sf sfVar = this.qf.get(i2);
            if (sfVar.sf == i) {
                return sfVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.zsj = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        C0104gm c0104gm;
        C0104gm c0104gm2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.lq = Math.min(measuredWidth / 10, this.ye);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z2 = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (c0104gm2 = (C0104gm) childAt.getLayoutParams()) != null && c0104gm2.pcc) {
                int i8 = c0104gm2.sf & 7;
                int i9 = c0104gm2.sf & 112;
                boolean z3 = (i9 == 48 || i9 == 80) ? true : z;
                if (i8 != 3 && i8 != 5) {
                    z2 = z;
                }
                int i10 = Integer.MIN_VALUE;
                if (z3) {
                    i3 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (c0104gm2.width != -2) {
                    i4 = c0104gm2.width != -1 ? c0104gm2.width : paddingLeft;
                    i10 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                if (c0104gm2.height != -2) {
                    i5 = c0104gm2.height != -1 ? c0104gm2.height : measuredHeight;
                } else {
                    i5 = measuredHeight;
                    i7 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i10), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
            z = false;
        }
        this.tz = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.of = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.yt = true;
        gm();
        this.yt = false;
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8 && ((c0104gm = (C0104gm) childAt2.getLayoutParams()) == null || !c0104gm.pcc)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0104gm.gm), 1073741824), this.of);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.dax;
            pcc(i, i3, i5, i5);
        }
    }

    private void pcc(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.qf.isEmpty()) {
            if (!this.hc.isFinished()) {
                this.hc.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        sf sf2 = sf(this.oo);
        int min = (int) ((sf2 != null ? Math.min(sf2.vj, this.fum) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            pcc(false);
            scrollTo(min, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        sf pcc2;
        int max;
        int i5;
        int max2;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0104gm c0104gm = (C0104gm) childAt.getLayoutParams();
                if (c0104gm.pcc) {
                    int i11 = c0104gm.sf & 7;
                    int i12 = c0104gm.sf & 112;
                    if (i11 == 1) {
                        max = Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i11 == 3) {
                            i5 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i11 != 5) {
                            i5 = paddingLeft;
                        } else {
                            max = (i7 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i12 != 16) {
                            max2 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        } else {
                            if (i12 == 48) {
                                i6 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i12 != 80) {
                                i6 = paddingTop;
                            } else {
                                max2 = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i13 = paddingLeft + scrollX;
                            childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, paddingTop + childAt.getMeasuredHeight());
                            i9++;
                            paddingTop = i6;
                            paddingLeft = i5;
                        }
                        int i14 = max2;
                        i6 = paddingTop;
                        paddingTop = i14;
                        int i132 = paddingLeft + scrollX;
                        childAt.layout(i132, paddingTop, childAt.getMeasuredWidth() + i132, paddingTop + childAt.getMeasuredHeight());
                        i9++;
                        paddingTop = i6;
                        paddingLeft = i5;
                    }
                    int i15 = max;
                    i5 = paddingLeft;
                    paddingLeft = i15;
                    if (i12 != 16) {
                    }
                    int i142 = max2;
                    i6 = paddingTop;
                    paddingTop = i142;
                    int i1322 = paddingLeft + scrollX;
                    childAt.layout(i1322, paddingTop, childAt.getMeasuredWidth() + i1322, paddingTop + childAt.getMeasuredHeight());
                    i9++;
                    paddingTop = i6;
                    paddingLeft = i5;
                }
            }
        }
        int i16 = (i7 - paddingLeft) - paddingRight;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                C0104gm c0104gm2 = (C0104gm) childAt2.getLayoutParams();
                if (!c0104gm2.pcc && (pcc2 = pcc(childAt2)) != null) {
                    float f = i16;
                    int i18 = ((int) (pcc2.vj * f)) + paddingLeft;
                    if (c0104gm2.oo) {
                        c0104gm2.oo = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c0104gm2.gm), 1073741824), View.MeasureSpec.makeMeasureSpec((i8 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i18, paddingTop, childAt2.getMeasuredWidth() + i18, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.lu = paddingTop;
        this.gpj = i8 - paddingBottom;
        this.se = i9;
        if (this.zsj) {
            z2 = false;
            pcc(this.oo, false, 0, false);
        } else {
            z2 = false;
        }
        this.zsj = z2;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.gbb = true;
        if (!this.hc.isFinished() && this.hc.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.hc.getCurrX();
            int currY = this.hc.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!oo(currX)) {
                    this.hc.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        pcc(true);
    }

    private boolean oo(int i) {
        if (this.qf.size() == 0) {
            if (this.zsj) {
                return false;
            }
            this.erj = false;
            pcc(0, 0.0f, 0);
            if (this.erj) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        sf vy = vy();
        int clientWidth = getClientWidth();
        int i2 = this.dax;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = vy.sf;
        float f2 = ((i / f) - vy.vj) / (vy.oo + (i2 / f));
        this.erj = false;
        pcc(i4, f2, (int) (i3 * f2));
        if (this.erj) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void pcc(int i, float f, int i2) {
        int max;
        int i3;
        int left;
        if (this.se > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                C0104gm c0104gm = (C0104gm) childAt.getLayoutParams();
                if (c0104gm.pcc) {
                    int i5 = c0104gm.sf & 7;
                    if (i5 == 1) {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i5 == 3) {
                            i3 = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            i3 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i3;
                    }
                    int i6 = max;
                    i3 = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i3;
                }
            }
        }
        sf(i, f, i2);
        if (this.bg != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((C0104gm) childAt2.getLayoutParams()).pcc) {
                    this.bg.pcc(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.erj = true;
    }

    private void sf(int i, float f, int i2) {
        oo ooVar = this.hoh;
        if (ooVar != null) {
            ooVar.pcc(i, f, i2);
        }
        List<oo> list = this.ptr;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                oo ooVar2 = this.ptr.get(i3);
                if (ooVar2 != null) {
                    ooVar2.pcc(i, f, i2);
                }
            }
        }
        oo ooVar3 = this.qcw;
        if (ooVar3 != null) {
            ooVar3.pcc(i, f, i2);
        }
    }

    private void vj(int i) {
        oo ooVar = this.hoh;
        if (ooVar != null) {
            ooVar.tmg(i);
        }
        List<oo> list = this.ptr;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                oo ooVar2 = this.ptr.get(i2);
                if (ooVar2 != null) {
                    ooVar2.tmg(i);
                }
            }
        }
        oo ooVar3 = this.qcw;
        if (ooVar3 != null) {
            ooVar3.tmg(i);
        }
    }

    private void wh(int i) {
        oo ooVar = this.hoh;
        if (ooVar != null) {
            ooVar.hc(i);
        }
        List<oo> list = this.ptr;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                oo ooVar2 = this.ptr.get(i2);
                if (ooVar2 != null) {
                    ooVar2.hc(i);
                }
            }
        }
        oo ooVar3 = this.qcw;
        if (ooVar3 != null) {
            ooVar3.hc(i);
        }
    }

    private void pcc(boolean z) {
        boolean z2 = this.otd == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.hc.isFinished()) {
                this.hc.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.hc.getCurrX();
                int currY = this.hc.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        oo(currX);
                    }
                }
            }
        }
        this.jsj = false;
        for (int i = 0; i < this.qf.size(); i++) {
            sf sfVar = this.qf.get(i);
            if (sfVar.gm) {
                sfVar.gm = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.gdh);
            } else {
                this.gdh.run();
            }
        }
    }

    private boolean pcc(float f, float f2) {
        if (f >= this.lq || f2 <= 0.0f) {
            return f > ((float) (getWidth() - this.lq)) && f2 < 0.0f;
        }
        return true;
    }

    private void sf(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.kz : 0, null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            kj();
            return false;
        }
        if (action != 0) {
            if (this.mk) {
                return true;
            }
            if (this.atb) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.nn = x;
            this.pq = x;
            float y = motionEvent.getY();
            this.rnn = y;
            this.mu = y;
            this.tsx = motionEvent.getPointerId(0);
            this.atb = false;
            this.gbb = true;
            this.hc.computeScrollOffset();
            if (this.otd == 2 && Math.abs(this.hc.getFinalX() - this.hc.getCurrX()) > this.xb) {
                this.hc.abortAnimation();
                this.jsj = false;
                gm();
                this.mk = true;
                gm(true);
                setScrollState(1);
            } else {
                pcc(false);
                this.mk = false;
            }
        } else if (action == 2) {
            int i = this.tsx;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.pq;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.rnn);
                if (f != 0.0f && !pcc(this.pq, f) && pcc(this, false, (int) f, (int) x2, (int) y2)) {
                    this.pq = x2;
                    this.mu = y2;
                    this.atb = true;
                    return false;
                }
                int i2 = this.zti;
                if (abs > i2 && abs * 0.5f > abs2) {
                    this.mk = true;
                    gm(true);
                    setScrollState(1);
                    this.pq = f > 0.0f ? this.nn + this.zti : this.nn - this.zti;
                    this.mu = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i2) {
                    this.atb = true;
                }
                if (this.mk && sf(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            pcc(motionEvent);
        }
        if (this.kun == null) {
            this.kun = VelocityTracker.obtain();
        }
        this.kun.addMovement(motionEvent);
        return this.mk;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.kj.sf sfVar;
        int findPointerIndex;
        if (this.ri) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (sfVar = this.gm) == null || sfVar.pcc() == 0) {
            return false;
        }
        if (this.kun == null) {
            this.kun = VelocityTracker.obtain();
        }
        this.kun.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.hc.abortAnimation();
            this.jsj = false;
            gm();
            float x = motionEvent.getX();
            this.nn = x;
            this.pq = x;
            float y = motionEvent.getY();
            this.rnn = y;
            this.mu = y;
            this.tsx = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mk) {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.tsx);
                    if (findPointerIndex2 == -1) {
                        z = kj();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex2);
                        float abs = Math.abs(x2 - this.pq);
                        float y2 = motionEvent.getY(findPointerIndex2);
                        float abs2 = Math.abs(y2 - this.mu);
                        if (abs > this.zti && abs > abs2) {
                            this.mk = true;
                            gm(true);
                            float f = this.nn;
                            this.pq = x2 - f > 0.0f ? f + this.zti : f - this.zti;
                            this.mu = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mk && (findPointerIndex = motionEvent.findPointerIndex(this.tsx)) != -1) {
                    z = sf(motionEvent.getX(findPointerIndex));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex != -1) {
                        this.pq = motionEvent.getX(actionIndex);
                        this.tsx = motionEvent.getPointerId(actionIndex);
                    }
                } else if (action == 6) {
                    pcc(motionEvent);
                    int findPointerIndex3 = motionEvent.findPointerIndex(this.tsx);
                    if (findPointerIndex3 != -1) {
                        this.pq = motionEvent.getX(findPointerIndex3);
                    }
                }
            } else if (this.mk) {
                pcc(this.oo, true, 0, false);
                z = kj();
            }
        } else if (this.mk) {
            VelocityTracker velocityTracker = this.kun;
            velocityTracker.computeCurrentVelocity(1000, this.lrr);
            int xVelocity = (int) velocityTracker.getXVelocity(this.tsx);
            this.jsj = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            sf vy = vy();
            float f2 = clientWidth;
            int i = vy.sf;
            float f3 = ((scrollX / f2) - vy.vj) / (vy.oo + (this.dax / f2));
            int findPointerIndex4 = motionEvent.findPointerIndex(this.tsx);
            if (findPointerIndex4 != -1) {
                pcc(pcc(i, f3, xVelocity, (int) (motionEvent.getX(findPointerIndex4) - this.nn)), true, true, xVelocity);
                z = kj();
            }
        }
        if (z) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    private boolean kj() {
        this.tsx = -1;
        ork();
        this.hpk.onRelease();
        this.fmh.onRelease();
        return this.hpk.isFinished() || this.fmh.isFinished();
    }

    private void gm(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean sf(float f) {
        boolean z;
        boolean z2;
        float f2 = this.pq - f;
        this.pq = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.lo * clientWidth;
        float f4 = this.fum * clientWidth;
        boolean z3 = false;
        sf sfVar = this.qf.get(0);
        ArrayList<sf> arrayList = this.qf;
        sf sfVar2 = arrayList.get(arrayList.size() - 1);
        if (sfVar.sf != 0) {
            f3 = sfVar.vj * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (sfVar2.sf != this.gm.pcc() - 1) {
            f4 = sfVar2.vj * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.hpk.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.fmh.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.pq += scrollX - i;
        scrollTo(i, getScrollY());
        oo(i);
        return z3;
    }

    private sf vy() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.dax / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        sf sfVar = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.qf.size()) {
            sf sfVar2 = this.qf.get(i2);
            if (!z && sfVar2.sf != (i = i3 + 1)) {
                sfVar2 = this.kj;
                sfVar2.vj = f + f3 + f2;
                sfVar2.sf = i;
                sfVar2.oo = this.gm.pcc(sfVar2.sf);
                i2--;
            }
            sf sfVar3 = sfVar2;
            f = sfVar3.vj;
            float f4 = sfVar3.oo + f + f2;
            if (!z && scrollX < f) {
                return sfVar;
            }
            if (scrollX < f4 || i2 == this.qf.size() - 1) {
                return sfVar3;
            }
            int i4 = sfVar3.sf;
            float f5 = sfVar3.oo;
            i2++;
            z = false;
            i3 = i4;
            f3 = f5;
            sfVar = sfVar3;
        }
        return sfVar;
    }

    private int pcc(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.iv || Math.abs(i2) <= this.rj) {
            i += (int) (f + (i >= this.oo ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.qf.size() <= 0) {
            return i;
        }
        return Math.max(this.qf.get(0).sf, Math.min(i, this.qf.get(r4.size() - 1).sf));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.kj.sf sfVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (sfVar = this.gm) != null && sfVar.pcc() > 1)) {
            if (!this.hpk.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.lo * width);
                this.hpk.setSize(height, width);
                z = this.hpk.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.fmh.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.fum + 1.0f)) * width2);
                this.fmh.setSize(height2, width2);
                z |= this.fmh.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.hpk.finish();
            this.fmh.finish();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.dax <= 0 || this.nac == null || this.qf.size() <= 0 || this.gm == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.dax / width;
        int i = 0;
        sf sfVar = this.qf.get(0);
        float f5 = sfVar.vj;
        int size = this.qf.size();
        int i2 = sfVar.sf;
        int i3 = this.qf.get(size - 1).sf;
        while (i2 < i3) {
            while (i2 > sfVar.sf && i < size) {
                i++;
                sfVar = this.qf.get(i);
            }
            if (i2 == sfVar.sf) {
                f2 = (sfVar.vj + sfVar.oo) * width;
                f = sfVar.vj + sfVar.oo + f4;
            } else {
                float pcc2 = this.gm.pcc(i2);
                float f6 = (f5 + pcc2) * width;
                f = f5 + pcc2 + f4;
                f2 = f6;
            }
            if (this.dax + f2 > scrollX) {
                f3 = f4;
                this.nac.setBounds(Math.round(f2), this.lu, Math.round(this.dax + f2), this.gpj);
                this.nac.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i2++;
            f5 = f;
            f4 = f3;
        }
    }

    private void pcc(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.tsx) {
            int i = actionIndex == 0 ? 1 : 0;
            this.pq = motionEvent.getX(i);
            this.tsx = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.kun;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void ork() {
        this.mk = false;
        this.atb = false;
        VelocityTracker velocityTracker = this.kun;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.kun = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.qy != z) {
            this.qy = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.gm == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.lo)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.fum));
    }

    protected boolean pcc(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && pcc(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || pcc(keyEvent);
    }

    public boolean pcc(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return oo();
                }
                return gm(17);
            }
            if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return vj();
                }
                return gm(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return gm(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return gm(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        if (r6 != 2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean gm(int i) {
        View findNextFocus;
        boolean oo2;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ").append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
            if (findNextFocus != null || findNextFocus == findFocus) {
                if (i != 17 || i == 1) {
                    oo2 = oo();
                } else {
                    if (i != 66) {
                    }
                    oo2 = vj();
                }
            } else if (i == 17) {
                int i2 = pcc(this.vy, findNextFocus).left;
                int i3 = pcc(this.vy, findFocus).left;
                if (findFocus != null && i2 >= i3) {
                    oo2 = oo();
                } else {
                    oo2 = findNextFocus.requestFocus();
                }
            } else {
                if (i == 66) {
                    int i4 = pcc(this.vy, findNextFocus).left;
                    int i5 = pcc(this.vy, findFocus).left;
                    if (findFocus == null || i4 > i5) {
                        oo2 = findNextFocus.requestFocus();
                    }
                    oo2 = vj();
                }
                oo2 = false;
            }
            if (oo2) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return oo2;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus != null) {
        }
        if (i != 17) {
        }
        oo2 = oo();
        if (oo2) {
        }
        return oo2;
    }

    private Rect pcc(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    boolean oo() {
        int i = this.oo;
        if (i <= 0) {
            return false;
        }
        pcc(i - 1, true);
        return true;
    }

    boolean vj() {
        com.bytedance.adsdk.ugeno.kj.sf sfVar = this.gm;
        if (sfVar == null || this.oo >= sfVar.pcc() - 1) {
            return false;
        }
        pcc(this.oo + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        sf pcc2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (pcc2 = pcc(childAt)) != null && pcc2.sf == this.oo) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        sf pcc2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (pcc2 = pcc(childAt)) != null && pcc2.sf == this.oo) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        sf pcc2;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (pcc2 = pcc(childAt)) != null && pcc2.sf == this.oo && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        sf pcc2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (pcc2 = pcc(childAt)) != null && pcc2.sf == this.oo && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0104gm();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0104gm) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0104gm(getContext(), attributeSet);
    }

    private class wh extends DataSetObserver {
        wh() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            gm.this.sf();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            gm.this.sf();
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.kj.gm$gm, reason: collision with other inner class name */
    public static class C0104gm extends ViewGroup.LayoutParams {
        float gm;
        boolean oo;
        public boolean pcc;
        public int sf;
        int vj;
        int wh;

        public C0104gm() {
            super(-1, -1);
            this.gm = 0.0f;
        }

        public C0104gm(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gm = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gm.sf);
            this.sf = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    static class kj implements Comparator<View> {
        kj() {
        }

        @Override // java.util.Comparator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0104gm c0104gm = (C0104gm) view.getLayoutParams();
            C0104gm c0104gm2 = (C0104gm) view2.getLayoutParams();
            if (c0104gm.pcc != c0104gm2.pcc) {
                return c0104gm.pcc ? 1 : -1;
            }
            return c0104gm.vj - c0104gm2.vj;
        }
    }
}
