package p169z;

import B.a;
import B.h;
import B.i;
import B.k;
import B.l;
import B.m;
import B.q;
import B.v;
import I4.j;
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
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p115p6.c;
import p143u.e;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f18415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f18416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f18417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f18418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f18419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f18420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f18421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f18422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseIntArray f18423i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MotionEvent f18425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s f18428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f18430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f18431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f18432s;

    public z(Context context, MotionLayout motionLayout, int i7) {
        this.f18416b = null;
        this.f18417c = null;
        ArrayList arrayList = new ArrayList();
        this.f18418d = arrayList;
        this.f18419e = null;
        this.f18420f = new ArrayList();
        this.f18421g = new SparseArray();
        this.f18422h = new HashMap();
        this.f18423i = new SparseIntArray();
        this.j = 400;
        this.f18424k = 0;
        this.f18426m = false;
        this.f18427n = false;
        this.f18415a = motionLayout;
        this.f18430q = new j(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            int eventType = xml.getEventType();
            y yVar = null;
            while (true) {
                if (eventType != 1) {
                    if (eventType == 0) {
                        xml.getName();
                    } else if (eventType == 2) {
                        switch (xml.getName()) {
                            case "MotionScene":
                                l(context, xml);
                                break;
                            case "Transition":
                                yVar = new y(this, context, xml);
                                arrayList.add(yVar);
                                if (this.f18417c == null && !yVar.f18399b) {
                                    this.f18417c = yVar;
                                    B b7 = yVar.f18408l;
                                    if (b7 != null) {
                                        b7.c(this.f18429p);
                                    }
                                }
                                if (yVar.f18399b) {
                                    if (yVar.f18400c == -1) {
                                        this.f18419e = yVar;
                                    } else {
                                        this.f18420f.add(yVar);
                                    }
                                    arrayList.remove(yVar);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "OnSwipe":
                                if (yVar == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i7) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (yVar != null) {
                                    yVar.f18408l = new B(context, this.f18415a, xml);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "OnClick":
                                if (yVar != null) {
                                    yVar.f18409m.add(new x(context, yVar, xml));
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "StateSet":
                                this.f18416b = new v(context, xml);
                                break;
                            case "ConstraintSet":
                                i(context, xml);
                                break;
                            case "include":
                            case "Include":
                                k(context, xml);
                                break;
                            case "KeyFrameSet":
                                g gVar = new g(context, xml);
                                if (yVar != null) {
                                    yVar.f18407k.add(gVar);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "ViewTransition":
                                D d7 = new D(context, xml);
                                j jVar = this.f18430q;
                                ((ArrayList) jVar.f3680d).add(d7);
                                jVar.f3679c = null;
                                int i8 = d7.f18246b;
                                if (i8 == 4) {
                                    ConstraintLayout.getSharedValues().a(d7.f18264u, new E());
                                    break;
                                } else {
                                    if (i8 == 5) {
                                        ConstraintLayout.getSharedValues().a(d7.f18264u, new E());
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                    eventType = xml.next();
                }
                this.f18421g.put(R.id.motion_base, new m());
                this.f18422h.put("motion_base", Integer.valueOf(R.id.motion_base));
                return;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    public final boolean a(int i7, MotionLayout motionLayout) {
        y yVar;
        if (this.f18428o != null) {
            return false;
        }
        for (y yVar2 : this.f18418d) {
            int i8 = yVar2.f18410n;
            if (i8 != 0 && ((yVar = this.f18417c) != yVar2 || (yVar.f18414r & 2) == 0)) {
                int i9 = yVar2.f18401d;
                v vVar = v.f18375d;
                v vVar2 = v.f18374c;
                v vVar3 = v.f18373b;
                if (i7 == i9 && (i8 == 4 || i8 == 2)) {
                    motionLayout.setState(vVar);
                    motionLayout.setTransition(yVar2);
                    if (yVar2.f18410n == 4) {
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
                if (i7 == yVar2.f18400c && (i8 == 3 || i8 == 1)) {
                    motionLayout.setState(vVar);
                    motionLayout.setTransition(yVar2);
                    if (yVar2.f18410n == 3) {
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

    public final m b(int i7) {
        int iP;
        v vVar = this.f18416b;
        if (vVar != null && (iP = vVar.p(i7)) != -1) {
            i7 = iP;
        }
        SparseArray sparseArray = this.f18421g;
        if (sparseArray.get(i7) != null) {
            return (m) sparseArray.get(i7);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + c.f(i7, this.f18415a.getContext()) + " In MotionScene");
        return (m) sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c() {
        y yVar = this.f18417c;
        return yVar != null ? yVar.f18405h : this.j;
    }

    public final int d(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return identifier;
    }

    public final Interpolator e() {
        y yVar = this.f18417c;
        int i7 = yVar.f18402e;
        if (i7 == -2) {
            return AnimationUtils.loadInterpolator(this.f18415a.getContext(), this.f18417c.f18404g);
        }
        if (i7 == -1) {
            return new m(e.d(yVar.f18403f), 1);
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
        y yVar = this.f18417c;
        if (yVar != null) {
            Iterator it = yVar.f18407k.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(nVar);
            }
        } else {
            y yVar2 = this.f18419e;
            if (yVar2 != null) {
                Iterator it2 = yVar2.f18407k.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).a(nVar);
                }
            }
        }
    }

    public final float g() {
        B b7;
        y yVar = this.f18417c;
        if (yVar == null || (b7 = yVar.f18408l) == null) {
            return 0.0f;
        }
        return b7.f18226t;
    }

    public final int h() {
        y yVar = this.f18417c;
        if (yVar == null) {
            return -1;
        }
        return yVar.f18401d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:6:0x002d  */
    public final int i(Context context, XmlResourceParser xmlResourceParser) {
        m mVar = new m();
        mVar.f911e = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iD = -1;
        int iD2 = -1;
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlResourceParser.getAttributeName(i7);
            String attributeValue = xmlResourceParser.getAttributeValue(i7);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iD2 = d(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        mVar.f909c = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                mVar.f909c = 4;
                                break;
                            case "left":
                                mVar.f909c = 2;
                                break;
                            case "none":
                                mVar.f909c = 0;
                                break;
                            case "right":
                                mVar.f909c = 1;
                                break;
                            case "x_right":
                                mVar.f909c = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iD = d(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.f18422h.put(attributeValue, Integer.valueOf(iD));
                    mVar.f907a = c.f(iD, context);
                    break;
            }
        }
        if (iD != -1) {
            int i8 = this.f18415a.f8867g0;
            mVar.k(context, xmlResourceParser);
            if (iD2 != -1) {
                this.f18423i.put(iD, iD2);
            }
            this.f18421g.put(iD, mVar);
        }
        return iD;
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f929D);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                j(typedArrayObtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f947s);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                int i8 = typedArrayObtainStyledAttributes.getInt(index, this.j);
                this.j = i8;
                if (i8 < 8) {
                    this.j = 8;
                }
            } else if (index == 1) {
                this.f18424k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void m(int i7, MotionLayout motionLayout) {
        SparseArray sparseArray = this.f18421g;
        m mVar = (m) sparseArray.get(i7);
        mVar.f908b = mVar.f907a;
        int i8 = this.f18423i.get(i7);
        HashMap map = mVar.f912f;
        if (i8 > 0) {
            m(i8, motionLayout);
            m mVar2 = (m) sparseArray.get(i8);
            if (mVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + c.f(i8, this.f18415a.getContext()));
                return;
            }
            mVar.f908b += "/" + mVar2.f908b;
            HashMap map2 = mVar2.f912f;
            for (Integer num : map2.keySet()) {
                num.getClass();
                h hVar = (h) map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new h());
                }
                h hVar2 = (h) map.get(num);
                if (hVar2 != null) {
                    i iVar = hVar2.f801e;
                    if (!iVar.f834b) {
                        iVar.a(hVar.f801e);
                    }
                    k kVar = hVar2.f799c;
                    if (!kVar.f885a) {
                        k kVar2 = hVar.f799c;
                        kVar.f885a = kVar2.f885a;
                        kVar.f886b = kVar2.f886b;
                        kVar.f888d = kVar2.f888d;
                        kVar.f889e = kVar2.f889e;
                        kVar.f887c = kVar2.f887c;
                    }
                    l lVar = hVar2.f802f;
                    if (!lVar.f891a) {
                        lVar.a(hVar.f802f);
                    }
                    B.j jVar = hVar2.f800d;
                    if (!jVar.f873a) {
                        jVar.a(hVar.f800d);
                    }
                    for (String str : hVar.f803g.keySet()) {
                        if (!hVar2.f803g.containsKey(str)) {
                            hVar2.f803g.put(str, (a) hVar.f803g.get(str));
                        }
                    }
                }
            }
        } else {
            mVar.f908b = p031e1.k.i(new StringBuilder(), mVar.f908b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = motionLayout.getChildAt(i9);
                B.c cVar = (B.c) childAt.getLayoutParams();
                int id = childAt.getId();
                if (mVar.f911e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new h());
                }
                h hVar3 = (h) map.get(Integer.valueOf(id));
                if (hVar3 != null) {
                    i iVar2 = hVar3.f801e;
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
                    k kVar3 = hVar3.f799c;
                    if (!kVar3.f885a) {
                        kVar3.f886b = childAt.getVisibility();
                        kVar3.f888d = childAt.getAlpha();
                        kVar3.f885a = true;
                    }
                    l lVar2 = hVar3.f802f;
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
        for (h hVar4 : map.values()) {
            if (hVar4.f804h != null) {
                if (hVar4.f798b != null) {
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        h hVarI = mVar.i(((Integer) it.next()).intValue());
                        String str2 = hVarI.f801e.f853l0;
                        if (str2 != null && hVar4.f798b.matches(str2)) {
                            hVar4.f804h.e(hVarI);
                            hVarI.f803g.putAll((HashMap) hVar4.f803g.clone());
                        }
                    }
                } else {
                    hVar4.f804h.e(mVar.i(hVar4.f797a));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0033  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public final void n(int i7, int i8) {
        int iP;
        int iP2;
        y yVar;
        ArrayList arrayList;
        Iterator it;
        y yVar2;
        y yVar3;
        y yVar4;
        int i9;
        B b7;
        v vVar = this.f18416b;
        if (vVar != null) {
            iP = vVar.p(i7);
            if (iP == -1) {
                iP = i7;
            }
            iP2 = this.f18416b.p(i8);
            if (iP2 == -1) {
            }
            yVar = this.f18417c;
            if (yVar == null && yVar.f18400c == i8 && yVar.f18401d == i7) {
                return;
            }
            arrayList = this.f18418d;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    yVar2 = this.f18419e;
                    for (y yVar5 : this.f18420f) {
                        if (yVar5.f18400c == i8) {
                            yVar2 = yVar5;
                        }
                    }
                    yVar3 = new y(this, yVar2);
                    yVar3.f18401d = iP;
                    yVar3.f18400c = iP2;
                    if (iP != -1) {
                        arrayList.add(yVar3);
                    }
                    this.f18417c = yVar3;
                    return;
                }
                yVar4 = (y) it.next();
                i9 = yVar4.f18400c;
                if ((i9 != iP2 && yVar4.f18401d == iP) || (i9 == i8 && yVar4.f18401d == i7)) {
                    break;
                }
            }
            this.f18417c = yVar4;
            b7 = yVar4.f18408l;
            if (b7 != null) {
                b7.c(this.f18429p);
            }
        }
        iP = i7;
        iP2 = i8;
        yVar = this.f18417c;
        if (yVar == null) {
        }
        arrayList = this.f18418d;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                yVar2 = this.f18419e;
                while (r4.hasNext()) {
                    if (yVar5.f18400c == i8) {
                        yVar2 = yVar5;
                    }
                }
                yVar3 = new y(this, yVar2);
                yVar3.f18401d = iP;
                yVar3.f18400c = iP2;
                if (iP != -1) {
                    arrayList.add(yVar3);
                }
                this.f18417c = yVar3;
                return;
            }
            yVar4 = (y) it.next();
            i9 = yVar4.f18400c;
            if (i9 != iP2) {
            }
        }
        this.f18417c = yVar4;
        b7 = yVar4.f18408l;
        if (b7 != null) {
            b7.c(this.f18429p);
        }
    }

    public final boolean o() {
        Iterator it = this.f18418d.iterator();
        while (it.hasNext()) {
            if (((y) it.next()).f18408l != null) {
                return true;
            }
        }
        y yVar = this.f18417c;
        return (yVar == null || yVar.f18408l == null) ? false : true;
    }
}
