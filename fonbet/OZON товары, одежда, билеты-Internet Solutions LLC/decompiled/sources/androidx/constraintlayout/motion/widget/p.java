package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.m;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import h2.C6785c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p2.C8834a;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private int f41550a;

    /* renamed from: e, reason: collision with root package name */
    int f41554e;

    /* renamed from: f, reason: collision with root package name */
    d f41555f;

    /* renamed from: g, reason: collision with root package name */
    d.a f41556g;

    /* renamed from: j, reason: collision with root package name */
    private int f41559j;

    /* renamed from: k, reason: collision with root package name */
    private String f41560k;

    /* renamed from: o, reason: collision with root package name */
    Context f41564o;

    /* renamed from: b, reason: collision with root package name */
    private int f41551b = -1;

    /* renamed from: c, reason: collision with root package name */
    private boolean f41552c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f41553d = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f41557h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f41558i = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f41561l = 0;

    /* renamed from: m, reason: collision with root package name */
    private String f41562m = null;

    /* renamed from: n, reason: collision with root package name */
    private int f41563n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f41565p = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f41566q = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f41567r = -1;

    /* renamed from: s, reason: collision with root package name */
    private int f41568s = -1;

    /* renamed from: t, reason: collision with root package name */
    private int f41569t = -1;

    /* renamed from: u, reason: collision with root package name */
    private int f41570u = -1;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f41571a;

        /* renamed from: b, reason: collision with root package name */
        private final int f41572b;

        /* renamed from: c, reason: collision with root package name */
        k f41573c;

        /* renamed from: d, reason: collision with root package name */
        int f41574d;

        /* renamed from: f, reason: collision with root package name */
        r f41576f;

        /* renamed from: g, reason: collision with root package name */
        Interpolator f41577g;

        /* renamed from: i, reason: collision with root package name */
        float f41579i;

        /* renamed from: j, reason: collision with root package name */
        float f41580j;

        /* renamed from: m, reason: collision with root package name */
        boolean f41583m;

        /* renamed from: e, reason: collision with root package name */
        h2.d f41575e = new h2.d();

        /* renamed from: h, reason: collision with root package name */
        boolean f41578h = false;

        /* renamed from: l, reason: collision with root package name */
        Rect f41582l = new Rect();

        /* renamed from: k, reason: collision with root package name */
        long f41581k = System.nanoTime();

        a(r rVar, k kVar, int i11, int i12, int i13, Interpolator interpolator, int i14, int i15) {
            this.f41583m = false;
            this.f41576f = rVar;
            this.f41573c = kVar;
            this.f41574d = i12;
            if (rVar.f41588e == null) {
                rVar.f41588e = new ArrayList<>();
            }
            rVar.f41588e.add(this);
            this.f41577g = interpolator;
            this.f41571a = i14;
            this.f41572b = i15;
            if (i13 == 3) {
                this.f41583m = true;
            }
            this.f41580j = i11 == 0 ? Float.MAX_VALUE : 1.0f / i11;
            a();
        }

        final void a() {
            boolean z11 = this.f41578h;
            r rVar = this.f41576f;
            Interpolator interpolator = this.f41577g;
            k kVar = this.f41573c;
            int i11 = this.f41572b;
            int i12 = this.f41571a;
            if (!z11) {
                long nanoTime = System.nanoTime();
                long j11 = nanoTime - this.f41581k;
                this.f41581k = nanoTime;
                float f7 = (((float) (j11 * 1.0E-6d)) * this.f41580j) + this.f41579i;
                this.f41579i = f7;
                if (f7 >= 1.0f) {
                    this.f41579i = 1.0f;
                }
                boolean o11 = kVar.o(interpolator == null ? this.f41579i : interpolator.getInterpolation(this.f41579i), nanoTime, kVar.f41433b, this.f41575e);
                if (this.f41579i >= 1.0f) {
                    if (i12 != -1) {
                        kVar.f41433b.setTag(i12, Long.valueOf(System.nanoTime()));
                    }
                    if (i11 != -1) {
                        kVar.f41433b.setTag(i11, null);
                    }
                    if (!this.f41583m) {
                        rVar.f41589f.add(this);
                    }
                }
                if (this.f41579i < 1.0f || o11) {
                    rVar.b();
                    return;
                }
                return;
            }
            long nanoTime2 = System.nanoTime();
            long j12 = nanoTime2 - this.f41581k;
            this.f41581k = nanoTime2;
            float f11 = this.f41579i - (((float) (j12 * 1.0E-6d)) * this.f41580j);
            this.f41579i = f11;
            if (f11 < 0.0f) {
                this.f41579i = 0.0f;
            }
            float f12 = this.f41579i;
            if (interpolator != null) {
                f12 = interpolator.getInterpolation(f12);
            }
            boolean o12 = kVar.o(f12, nanoTime2, kVar.f41433b, this.f41575e);
            if (this.f41579i <= 0.0f) {
                if (i12 != -1) {
                    kVar.f41433b.setTag(i12, Long.valueOf(System.nanoTime()));
                }
                if (i11 != -1) {
                    kVar.f41433b.setTag(i11, null);
                }
                rVar.f41589f.add(this);
            }
            if (this.f41579i > 0.0f || o12) {
                rVar.b();
            }
        }

        final void b() {
            this.f41578h = true;
            int i11 = this.f41574d;
            if (i11 != -1) {
                this.f41580j = i11 == 0 ? Float.MAX_VALUE : 1.0f / i11;
            }
            this.f41576f.b();
            this.f41581k = System.nanoTime();
        }
    }

    p(Context context, XmlResourceParser xmlResourceParser) {
        char c11;
        this.f41564o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    if (c11 == 0) {
                        h(context, xmlResourceParser);
                    } else if (c11 == 1) {
                        this.f41555f = new d(context, xmlResourceParser);
                    } else if (c11 == 2) {
                        this.f41556g = androidx.constraintlayout.widget.d.j(context, xmlResourceParser);
                    } else if (c11 == 3 || c11 == 4) {
                        androidx.constraintlayout.widget.a.h(context, xmlResourceParser, this.f41556g.f41713g);
                    } else {
                        Log.e("ViewTransition", C8834a.a() + " unknown tag " + name);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(".xml:");
                        sb2.append(xmlResourceParser.getLineNumber());
                        Log.e("ViewTransition", sb2.toString());
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    public static /* synthetic */ void a(p pVar, View[] viewArr) {
        if (pVar.f41565p != -1) {
            for (View view : viewArr) {
                view.setTag(pVar.f41565p, Long.valueOf(System.nanoTime()));
            }
        }
        if (pVar.f41566q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(pVar.f41566q, null);
            }
        }
    }

    private void h(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.i.f41867x);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                this.f41550a = obtainStyledAttributes.getResourceId(index, this.f41550a);
            } else if (index == 8) {
                if (MotionLayout.f41220I0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f41559j);
                    this.f41559j = resourceId;
                    if (resourceId == -1) {
                        this.f41560k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f41560k = obtainStyledAttributes.getString(index);
                } else {
                    this.f41559j = obtainStyledAttributes.getResourceId(index, this.f41559j);
                }
            } else if (index == 9) {
                this.f41551b = obtainStyledAttributes.getInt(index, this.f41551b);
            } else if (index == 12) {
                this.f41552c = obtainStyledAttributes.getBoolean(index, this.f41552c);
            } else if (index == 10) {
                this.f41553d = obtainStyledAttributes.getInt(index, this.f41553d);
            } else if (index == 4) {
                this.f41557h = obtainStyledAttributes.getInt(index, this.f41557h);
            } else if (index == 13) {
                this.f41558i = obtainStyledAttributes.getInt(index, this.f41558i);
            } else if (index == 14) {
                this.f41554e = obtainStyledAttributes.getInt(index, this.f41554e);
            } else if (index == 7) {
                int i12 = obtainStyledAttributes.peekValue(index).type;
                if (i12 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f41563n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f41561l = -2;
                    }
                } else if (i12 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f41562m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f41561l = -1;
                    } else {
                        this.f41563n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f41561l = -2;
                    }
                } else {
                    this.f41561l = obtainStyledAttributes.getInteger(index, this.f41561l);
                }
            } else if (index == 11) {
                this.f41565p = obtainStyledAttributes.getResourceId(index, this.f41565p);
            } else if (index == 3) {
                this.f41566q = obtainStyledAttributes.getResourceId(index, this.f41566q);
            } else if (index == 6) {
                this.f41567r = obtainStyledAttributes.getResourceId(index, this.f41567r);
            } else if (index == 5) {
                this.f41568s = obtainStyledAttributes.getResourceId(index, this.f41568s);
            } else if (index == 2) {
                this.f41570u = obtainStyledAttributes.getResourceId(index, this.f41570u);
            } else if (index == 1) {
                this.f41569t = obtainStyledAttributes.getInteger(index, this.f41569t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    final void b(r rVar, MotionLayout motionLayout, int i11, androidx.constraintlayout.widget.d dVar, View... viewArr) {
        Interpolator loadInterpolator;
        Interpolator interpolator;
        if (this.f41552c) {
            return;
        }
        int i12 = this.f41554e;
        d dVar2 = this.f41555f;
        if (i12 == 2) {
            View view = viewArr[0];
            k kVar = new k(view);
            kVar.r(view);
            dVar2.a(kVar);
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            System.nanoTime();
            kVar.w(width, height);
            int i13 = this.f41557h;
            int i14 = this.f41558i;
            int i15 = this.f41551b;
            Context context = motionLayout.getContext();
            int i16 = this.f41561l;
            if (i16 == -2) {
                loadInterpolator = AnimationUtils.loadInterpolator(context, this.f41563n);
            } else if (i16 == -1) {
                loadInterpolator = new o(C6785c.c(this.f41562m));
            } else if (i16 == 0) {
                loadInterpolator = new AccelerateDecelerateInterpolator();
            } else if (i16 == 1) {
                loadInterpolator = new AccelerateInterpolator();
            } else if (i16 == 2) {
                loadInterpolator = new DecelerateInterpolator();
            } else if (i16 == 4) {
                loadInterpolator = new BounceInterpolator();
            } else if (i16 == 5) {
                loadInterpolator = new OvershootInterpolator();
            } else {
                if (i16 != 6) {
                    interpolator = null;
                    new a(rVar, kVar, i13, i14, i15, interpolator, this.f41565p, this.f41566q);
                    return;
                }
                loadInterpolator = new AnticipateInterpolator();
            }
            interpolator = loadInterpolator;
            new a(rVar, kVar, i13, i14, i15, interpolator, this.f41565p, this.f41566q);
            return;
        }
        d.a aVar = this.f41556g;
        if (i12 == 1) {
            m mVar = motionLayout.f41248c;
            for (int i17 : mVar == null ? null : mVar.i()) {
                if (i17 != i11) {
                    m mVar2 = motionLayout.f41248c;
                    androidx.constraintlayout.widget.d h11 = mVar2 == null ? null : mVar2.h(i17);
                    for (View view2 : viewArr) {
                        d.a I11 = h11.I(view2.getId());
                        if (aVar != null) {
                            aVar.d(I11);
                            I11.f41713g.putAll(aVar.f41713g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.d dVar3 = new androidx.constraintlayout.widget.d();
        dVar3.q(dVar);
        for (View view3 : viewArr) {
            d.a I12 = dVar3.I(view3.getId());
            if (aVar != null) {
                aVar.d(I12);
                I12.f41713g.putAll(aVar.f41713g);
            }
        }
        motionLayout.Q(dVar3, i11);
        motionLayout.Q(dVar, R.id.view_transition);
        motionLayout.setState(R.id.view_transition, -1, -1);
        m.b bVar = new m.b(motionLayout.f41248c, i11);
        for (View view4 : viewArr) {
            int i18 = this.f41557h;
            if (i18 != -1) {
                bVar.C(i18);
            }
            bVar.F(this.f41553d);
            bVar.E(this.f41561l, this.f41563n, this.f41562m);
            int id2 = view4.getId();
            if (dVar2 != null) {
                ArrayList d11 = dVar2.d();
                d dVar4 = new d();
                Iterator it = d11.iterator();
                while (it.hasNext()) {
                    androidx.constraintlayout.motion.widget.a clone = ((androidx.constraintlayout.motion.widget.a) it.next()).clone();
                    clone.f41315b = id2;
                    dVar4.c(clone);
                }
                bVar.t(dVar4);
            }
        }
        motionLayout.K(bVar);
        motionLayout.N(new J2.b(5, this, viewArr));
    }

    final boolean c(View view) {
        int i11 = this.f41567r;
        boolean z11 = i11 == -1 || view.getTag(i11) != null;
        int i12 = this.f41568s;
        return z11 && (i12 == -1 || view.getTag(i12) == null);
    }

    final int d() {
        return this.f41550a;
    }

    public final int e() {
        return this.f41570u;
    }

    public final int f() {
        return this.f41551b;
    }

    final boolean g(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f41559j == -1 && this.f41560k == null) || !c(view)) {
            return false;
        }
        if (view.getId() == this.f41559j) {
            return true;
        }
        return this.f41560k != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).f41618Y) != null && str.matches(this.f41560k);
    }

    final boolean i(int i11) {
        int i12 = this.f41551b;
        return i12 == 1 ? i11 == 0 : i12 == 2 ? i11 == 1 : i12 == 3 && i11 == 0;
    }

    public final String toString() {
        return "ViewTransition(" + C8834a.c(this.f41550a, this.f41564o) + ")";
    }
}
