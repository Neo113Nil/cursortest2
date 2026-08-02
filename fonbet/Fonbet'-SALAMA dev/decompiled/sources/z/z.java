package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import io.sentry.MeasurementUnit;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import u.C1616e;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final MotionLayout f18409a;

    /* renamed from: b, reason: collision with root package name */
    public final B.v f18410b;

    /* renamed from: c, reason: collision with root package name */
    public y f18411c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18412d;

    /* renamed from: e, reason: collision with root package name */
    public final y f18413e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f18414f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f18415g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f18416h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseIntArray f18417i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f18418k;

    /* renamed from: l, reason: collision with root package name */
    public MotionEvent f18419l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18420m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18421n;

    /* renamed from: o, reason: collision with root package name */
    public s f18422o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18423p;

    /* renamed from: q, reason: collision with root package name */
    public final I4.j f18424q;

    /* renamed from: r, reason: collision with root package name */
    public float f18425r;

    /* renamed from: s, reason: collision with root package name */
    public float f18426s;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public z(Context context, MotionLayout motionLayout, int i7) {
        int eventType;
        y yVar;
        this.f18410b = null;
        this.f18411c = null;
        ArrayList arrayList = new ArrayList();
        this.f18412d = arrayList;
        this.f18413e = null;
        this.f18414f = new ArrayList();
        this.f18415g = new SparseArray();
        this.f18416h = new HashMap();
        this.f18417i = new SparseIntArray();
        this.j = 400;
        this.f18418k = 0;
        this.f18420m = false;
        this.f18421n = false;
        this.f18409a = motionLayout;
        this.f18424q = new I4.j(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            eventType = xml.getEventType();
            yVar = null;
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
        while (true) {
            char c3 = 1;
            if (eventType == 1) {
                this.f18415g.put(R.id.motion_base, new B.m());
                this.f18416h.put("motion_base", Integer.valueOf(R.id.motion_base));
                return;
            }
            if (eventType == 0) {
                xml.getName();
            } else if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1239391468:
                        if (name.equals("KeyFrameSet")) {
                            c3 = '\b';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -687739768:
                        if (name.equals("Include")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 61998586:
                        if (name.equals("ViewTransition")) {
                            c3 = '\t';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 269306229:
                        if (name.equals("Transition")) {
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 312750793:
                        if (name.equals("OnClick")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 327855227:
                        if (name.equals("OnSwipe")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 793277014:
                        if (name.equals("MotionScene")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1942574248:
                        if (name.equals("include")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        l(context, xml);
                        break;
                    case 1:
                        yVar = new y(this, context, xml);
                        arrayList.add(yVar);
                        if (this.f18411c == null && !yVar.f18393b) {
                            this.f18411c = yVar;
                            B b7 = yVar.f18402l;
                            if (b7 != null) {
                                b7.c(this.f18423p);
                            }
                        }
                        if (!yVar.f18393b) {
                            break;
                        } else {
                            if (yVar.f18394c == -1) {
                                this.f18413e = yVar;
                            } else {
                                this.f18414f.add(yVar);
                            }
                            arrayList.remove(yVar);
                            break;
                        }
                        break;
                    case 2:
                        if (yVar == null) {
                            Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i7) + ".xml:" + xml.getLineNumber() + ")");
                        }
                        if (yVar == null) {
                            break;
                        } else {
                            yVar.f18402l = new B(context, this.f18409a, xml);
                            break;
                        }
                    case 3:
                        if (yVar == null) {
                            break;
                        } else {
                            yVar.f18403m.add(new x(context, yVar, xml));
                            break;
                        }
                    case 4:
                        this.f18410b = new B.v(context, xml);
                        break;
                    case 5:
                        i(context, xml);
                        break;
                    case 6:
                    case 7:
                        k(context, xml);
                        break;
                    case '\b':
                        g gVar = new g(context, xml);
                        if (yVar == null) {
                            break;
                        } else {
                            yVar.f18401k.add(gVar);
                            break;
                        }
                    case '\t':
                        D d7 = new D(context, xml);
                        I4.j jVar = this.f18424q;
                        ((ArrayList) jVar.f3680d).add(d7);
                        jVar.f3679c = null;
                        int i8 = d7.f18240b;
                        if (i8 != 4) {
                            if (i8 != 5) {
                                break;
                            } else {
                                ConstraintLayout.getSharedValues().a(d7.f18258u, new E());
                                break;
                            }
                        } else {
                            ConstraintLayout.getSharedValues().a(d7.f18258u, new E());
                            break;
                        }
                }
            }
            eventType = xml.next();
        }
    }

    public final boolean a(int i7, MotionLayout motionLayout) {
        y yVar;
        if (this.f18422o != null) {
            return false;
        }
        Iterator it = this.f18412d.iterator();
        while (it.hasNext()) {
            y yVar2 = (y) it.next();
            int i8 = yVar2.f18404n;
            if (i8 != 0 && ((yVar = this.f18411c) != yVar2 || (yVar.f18408r & 2) == 0)) {
                int i9 = yVar2.f18395d;
                v vVar = v.f18369d;
                v vVar2 = v.f18368c;
                v vVar3 = v.f18367b;
                if (i7 == i9 && (i8 == 4 || i8 == 2)) {
                    motionLayout.setState(vVar);
                    motionLayout.setTransition(yVar2);
                    if (yVar2.f18404n == 4) {
                        motionLayout.k(1.0f);
                        motionLayout.f8845O0 = null;
                        motionLayout.setState(vVar3);
                        motionLayout.setState(vVar2);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.m(true);
                        motionLayout.setState(vVar3);
                        motionLayout.setState(vVar2);
                        motionLayout.setState(vVar);
                        motionLayout.s();
                    }
                    return true;
                }
                if (i7 == yVar2.f18394c && (i8 == 3 || i8 == 1)) {
                    motionLayout.setState(vVar);
                    motionLayout.setTransition(yVar2);
                    if (yVar2.f18404n == 3) {
                        motionLayout.k(0.0f);
                        motionLayout.setState(vVar3);
                        motionLayout.setState(vVar2);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.m(true);
                        motionLayout.setState(vVar3);
                        motionLayout.setState(vVar2);
                        motionLayout.setState(vVar);
                        motionLayout.s();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final B.m b(int i7) {
        int p5;
        B.v vVar = this.f18410b;
        if (vVar != null && (p5 = vVar.p(i7)) != -1) {
            i7 = p5;
        }
        SparseArray sparseArray = this.f18415g;
        if (sparseArray.get(i7) != null) {
            return (B.m) sparseArray.get(i7);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + p6.c.f(i7, this.f18409a.getContext()) + " In MotionScene");
        return (B.m) sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c() {
        y yVar = this.f18411c;
        return yVar != null ? yVar.f18399h : this.j;
    }

    public final int d(Context context, String str) {
        int i7;
        if (str.contains("/")) {
            i7 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i7 = -1;
        }
        if (i7 != -1) {
            return i7;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i7;
    }

    public final Interpolator e() {
        y yVar = this.f18411c;
        int i7 = yVar.f18396e;
        if (i7 == -2) {
            return AnimationUtils.loadInterpolator(this.f18409a.getContext(), this.f18411c.f18398g);
        }
        if (i7 == -1) {
            return new m(C1616e.d(yVar.f18397f), 1);
        }
        if (i7 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i7 == 1) {
            return new AccelerateInterpolator();
        }
        if (i7 == 2) {
            return new DecelerateInterpolator();
        }
        if (i7 == 4) {
            return new BounceInterpolator();
        }
        if (i7 == 5) {
            return new OvershootInterpolator();
        }
        if (i7 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void f(n nVar) {
        y yVar = this.f18411c;
        if (yVar != null) {
            Iterator it = yVar.f18401k.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(nVar);
            }
        } else {
            y yVar2 = this.f18413e;
            if (yVar2 != null) {
                Iterator it2 = yVar2.f18401k.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).a(nVar);
                }
            }
        }
    }

    public final float g() {
        B b7;
        y yVar = this.f18411c;
        if (yVar == null || (b7 = yVar.f18402l) == null) {
            return 0.0f;
        }
        return b7.f18220t;
    }

    public final int h() {
        y yVar = this.f18411c;
        if (yVar == null) {
            return -1;
        }
        return yVar.f18395d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int i(Context context, XmlResourceParser xmlResourceParser) {
        char c3;
        char c4;
        B.m mVar = new B.m();
        mVar.f911e = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i7 = -1;
        int i8 = -1;
        for (int i9 = 0; i9 < attributeCount; i9++) {
            String attributeName = xmlResourceParser.getAttributeName(i9);
            String attributeValue = xmlResourceParser.getAttributeValue(i9);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    i8 = d(context, attributeValue);
                    break;
                case 1:
                    try {
                        mVar.f909c = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    c4 = 0;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 3317767:
                                if (attributeValue.equals(RRWebVideoEvent.JsonKeys.LEFT)) {
                                    c4 = 1;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 3387192:
                                if (attributeValue.equals(MeasurementUnit.NONE)) {
                                    c4 = 2;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    c4 = 3;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    c4 = 4;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            default:
                                c4 = 65535;
                                break;
                        }
                        switch (c4) {
                            case 0:
                                mVar.f909c = 4;
                                break;
                            case 1:
                                mVar.f909c = 2;
                                break;
                            case 2:
                                mVar.f909c = 0;
                                break;
                            case 3:
                                mVar.f909c = 1;
                                break;
                            case 4:
                                mVar.f909c = 3;
                                break;
                        }
                    }
                    break;
                case 2:
                    i7 = d(context, attributeValue);
                    int indexOf = attributeValue.indexOf(47);
                    if (indexOf >= 0) {
                        attributeValue = attributeValue.substring(indexOf + 1);
                    }
                    this.f18416h.put(attributeValue, Integer.valueOf(i7));
                    mVar.f907a = p6.c.f(i7, context);
                    break;
            }
        }
        if (i7 != -1) {
            int i10 = this.f18409a.f8867g0;
            mVar.k(context, xmlResourceParser);
            if (i8 != -1) {
                this.f18417i.put(i7, i8);
            }
            this.f18415g.put(i7, mVar);
        }
        return i7;
    }

    public final int j(int i7, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return i(context, xml);
                }
            }
            return -1;
        } catch (IOException e7) {
            e7.printStackTrace();
            return -1;
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), B.q.f929D);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                j(obtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), B.q.f947s);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                int i8 = obtainStyledAttributes.getInt(index, this.j);
                this.j = i8;
                if (i8 < 8) {
                    this.j = 8;
                }
            } else if (index == 1) {
                this.f18418k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void m(int i7, MotionLayout motionLayout) {
        SparseArray sparseArray = this.f18415g;
        B.m mVar = (B.m) sparseArray.get(i7);
        mVar.f908b = mVar.f907a;
        int i8 = this.f18417i.get(i7);
        HashMap hashMap = mVar.f912f;
        if (i8 > 0) {
            m(i8, motionLayout);
            B.m mVar2 = (B.m) sparseArray.get(i8);
            if (mVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + p6.c.f(i8, this.f18409a.getContext()));
                return;
            }
            mVar.f908b += "/" + mVar2.f908b;
            HashMap hashMap2 = mVar2.f912f;
            for (Integer num : hashMap2.keySet()) {
                num.getClass();
                B.h hVar = (B.h) hashMap2.get(num);
                if (!hashMap.containsKey(num)) {
                    hashMap.put(num, new B.h());
                }
                B.h hVar2 = (B.h) hashMap.get(num);
                if (hVar2 != null) {
                    B.i iVar = hVar2.f801e;
                    if (!iVar.f834b) {
                        iVar.a(hVar.f801e);
                    }
                    B.k kVar = hVar2.f799c;
                    if (!kVar.f885a) {
                        B.k kVar2 = hVar.f799c;
                        kVar.f885a = kVar2.f885a;
                        kVar.f886b = kVar2.f886b;
                        kVar.f888d = kVar2.f888d;
                        kVar.f889e = kVar2.f889e;
                        kVar.f887c = kVar2.f887c;
                    }
                    B.l lVar = hVar2.f802f;
                    if (!lVar.f891a) {
                        lVar.a(hVar.f802f);
                    }
                    B.j jVar = hVar2.f800d;
                    if (!jVar.f873a) {
                        jVar.a(hVar.f800d);
                    }
                    for (String str : hVar.f803g.keySet()) {
                        if (!hVar2.f803g.containsKey(str)) {
                            hVar2.f803g.put(str, (B.a) hVar.f803g.get(str));
                        }
                    }
                }
            }
        } else {
            mVar.f908b = e1.k.i(new StringBuilder(), mVar.f908b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = motionLayout.getChildAt(i9);
                B.c cVar = (B.c) childAt.getLayoutParams();
                int id = childAt.getId();
                if (mVar.f911e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new B.h());
                }
                B.h hVar3 = (B.h) hashMap.get(Integer.valueOf(id));
                if (hVar3 != null) {
                    B.i iVar2 = hVar3.f801e;
                    if (!iVar2.f834b) {
                        hVar3.c(id, cVar);
                        if (childAt instanceof ConstraintHelper) {
                            iVar2.f849j0 = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                iVar2.f859o0 = barrier.getAllowsGoneWidget();
                                iVar2.f844g0 = barrier.getType();
                                iVar2.f846h0 = barrier.getMargin();
                            }
                        }
                        iVar2.f834b = true;
                    }
                    B.k kVar3 = hVar3.f799c;
                    if (!kVar3.f885a) {
                        kVar3.f886b = childAt.getVisibility();
                        kVar3.f888d = childAt.getAlpha();
                        kVar3.f885a = true;
                    }
                    B.l lVar2 = hVar3.f802f;
                    if (!lVar2.f891a) {
                        lVar2.f891a = true;
                        lVar2.f892b = childAt.getRotation();
                        lVar2.f893c = childAt.getRotationX();
                        lVar2.f894d = childAt.getRotationY();
                        lVar2.f895e = childAt.getScaleX();
                        lVar2.f896f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            lVar2.f897g = pivotX;
                            lVar2.f898h = pivotY;
                        }
                        lVar2.j = childAt.getTranslationX();
                        lVar2.f900k = childAt.getTranslationY();
                        lVar2.f901l = childAt.getTranslationZ();
                        if (lVar2.f902m) {
                            lVar2.f903n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (B.h hVar4 : hashMap.values()) {
            if (hVar4.f804h != null) {
                if (hVar4.f798b != null) {
                    Iterator it = hashMap.keySet().iterator();
                    while (it.hasNext()) {
                        B.h i10 = mVar.i(((Integer) it.next()).intValue());
                        String str2 = i10.f801e.f853l0;
                        if (str2 != null && hVar4.f798b.matches(str2)) {
                            hVar4.f804h.e(i10);
                            i10.f803g.putAll((HashMap) hVar4.f803g.clone());
                        }
                    }
                } else {
                    hVar4.f804h.e(mVar.i(hVar4.f797a));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i7, int i8) {
        int i9;
        int i10;
        B.v vVar = this.f18410b;
        if (vVar != null) {
            i9 = vVar.p(i7);
            if (i9 == -1) {
                i9 = i7;
            }
            i10 = this.f18410b.p(i8);
        } else {
            i9 = i7;
        }
        i10 = i8;
        y yVar = this.f18411c;
        if (yVar != null && yVar.f18394c == i8 && yVar.f18395d == i7) {
            return;
        }
        ArrayList arrayList = this.f18412d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y yVar2 = (y) it.next();
            int i11 = yVar2.f18394c;
            if ((i11 == i10 && yVar2.f18395d == i9) || (i11 == i8 && yVar2.f18395d == i7)) {
                this.f18411c = yVar2;
                B b7 = yVar2.f18402l;
                if (b7 != null) {
                    b7.c(this.f18423p);
                    return;
                }
                return;
            }
        }
        y yVar3 = this.f18413e;
        Iterator it2 = this.f18414f.iterator();
        while (it2.hasNext()) {
            y yVar4 = (y) it2.next();
            if (yVar4.f18394c == i8) {
                yVar3 = yVar4;
            }
        }
        y yVar5 = new y(this, yVar3);
        yVar5.f18395d = i9;
        yVar5.f18394c = i10;
        if (i9 != -1) {
            arrayList.add(yVar5);
        }
        this.f18411c = yVar5;
    }

    public final boolean o() {
        Iterator it = this.f18412d.iterator();
        while (it.hasNext()) {
            if (((y) it.next()).f18402l != null) {
                return true;
            }
        }
        y yVar = this.f18411c;
        return (yVar == null || yVar.f18402l == null) ? false : true;
    }
}
