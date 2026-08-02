package androidx.constraintlayout.motion.widget;

import C.o0;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
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
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import h2.C6785c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p2.C8834a;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final MotionLayout f41476a;

    /* renamed from: b, reason: collision with root package name */
    androidx.constraintlayout.widget.k f41477b;

    /* renamed from: c, reason: collision with root package name */
    b f41478c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<b> f41479d;

    /* renamed from: e, reason: collision with root package name */
    private b f41480e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<b> f41481f;

    /* renamed from: g, reason: collision with root package name */
    private SparseArray<androidx.constraintlayout.widget.d> f41482g;

    /* renamed from: h, reason: collision with root package name */
    private HashMap<String, Integer> f41483h;

    /* renamed from: i, reason: collision with root package name */
    private SparseIntArray f41484i;

    /* renamed from: j, reason: collision with root package name */
    private int f41485j;

    /* renamed from: k, reason: collision with root package name */
    private int f41486k;

    /* renamed from: l, reason: collision with root package name */
    private MotionEvent f41487l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f41488m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f41489n;

    /* renamed from: o, reason: collision with root package name */
    private MotionLayout.f f41490o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f41491p;

    /* renamed from: q, reason: collision with root package name */
    final r f41492q;

    /* renamed from: r, reason: collision with root package name */
    float f41493r;

    /* renamed from: s, reason: collision with root package name */
    float f41494s;

    final class a implements Interpolator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6785c f41495a;

        a(C6785c c6785c) {
            this.f41495a = c6785c;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f7) {
            return (float) this.f41495a.a(f7);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    m(Context context, MotionLayout motionLayout, int i11) {
        int eventType;
        b bVar = null;
        this.f41477b = null;
        this.f41478c = null;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f41479d = arrayList;
        this.f41480e = null;
        this.f41481f = new ArrayList<>();
        this.f41482g = new SparseArray<>();
        this.f41483h = new HashMap<>();
        this.f41484i = new SparseIntArray();
        this.f41485j = 400;
        this.f41486k = 0;
        this.f41488m = false;
        this.f41489n = false;
        this.f41476a = motionLayout;
        this.f41492q = new r(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            eventType = xml.getEventType();
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
        while (true) {
            char c11 = 1;
            if (eventType == 1) {
                this.f41482g.put(R.id.motion_base, new androidx.constraintlayout.widget.d());
                this.f41483h.put("motion_base", Integer.valueOf(R.id.motion_base));
                return;
            }
            if (eventType == 0) {
                xml.getName();
            } else if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1239391468:
                        if (name.equals("KeyFrameSet")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -687739768:
                        if (name.equals("Include")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 61998586:
                        if (name.equals("ViewTransition")) {
                            c11 = '\t';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 269306229:
                        if (name.equals("Transition")) {
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 312750793:
                        if (name.equals("OnClick")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 327855227:
                        if (name.equals("OnSwipe")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 793277014:
                        if (name.equals("MotionScene")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1942574248:
                        if (name.equals("include")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        u(context, xml);
                        break;
                    case 1:
                        bVar = new b(this, context, xml);
                        arrayList.add(bVar);
                        if (this.f41478c == null && !bVar.f41497b) {
                            this.f41478c = bVar;
                            if (bVar.f41507l != null) {
                                this.f41478c.f41507l.u(this.f41491p);
                            }
                        }
                        if (!bVar.f41497b) {
                            break;
                        } else {
                            if (bVar.f41498c == -1) {
                                this.f41480e = bVar;
                            } else {
                                this.f41481f.add(bVar);
                            }
                            arrayList.remove(bVar);
                            break;
                        }
                    case 2:
                        if (bVar == null) {
                            Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i11) + ".xml:" + xml.getLineNumber() + ")");
                        }
                        if (bVar == null) {
                            break;
                        } else {
                            bVar.f41507l = new n(context, this.f41476a, xml);
                            break;
                        }
                    case 3:
                        if (bVar == null) {
                            break;
                        } else {
                            bVar.u(context, xml);
                            break;
                        }
                    case 4:
                        this.f41477b = new androidx.constraintlayout.widget.k(context, xml);
                        break;
                    case 5:
                        r(context, xml);
                        break;
                    case 6:
                    case 7:
                        t(context, xml);
                        break;
                    case '\b':
                        d dVar = new d(context, xml);
                        if (bVar == null) {
                            break;
                        } else {
                            bVar.f41506k.add(dVar);
                            break;
                        }
                    case '\t':
                        this.f41492q.a(new p(context, xml));
                        break;
                }
            }
            eventType = xml.next();
        }
    }

    static /* synthetic */ int c(m mVar, Context context, int i11) {
        return mVar.s(i11, context);
    }

    private int l(Context context, String str) {
        int i11;
        if (str.contains("/")) {
            i11 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i11 = -1;
        }
        if (i11 == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int r(Context context, XmlResourceParser xmlResourceParser) {
        char c11;
        char c12;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.Y();
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeName = xmlResourceParser.getAttributeName(i13);
            String attributeValue = xmlResourceParser.getAttributeValue(i13);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    i12 = l(context, attributeValue);
                    break;
                case 1:
                    try {
                        dVar.f41703c = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3387192:
                                if (attributeValue.equals(DevicePublicKeyStringDef.NONE)) {
                                    c12 = 2;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    c12 = 3;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    c12 = 4;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            default:
                                c12 = 65535;
                                break;
                        }
                        switch (c12) {
                            case 0:
                                dVar.f41703c = 4;
                                break;
                            case 1:
                                dVar.f41703c = 2;
                                break;
                            case 2:
                                dVar.f41703c = 0;
                                break;
                            case 3:
                                dVar.f41703c = 1;
                                break;
                            case 4:
                                dVar.f41703c = 3;
                                break;
                        }
                    }
                    break;
                case 2:
                    i11 = l(context, attributeValue);
                    int indexOf = attributeValue.indexOf(47);
                    if (indexOf >= 0) {
                        attributeValue = attributeValue.substring(indexOf + 1);
                    }
                    this.f41483h.put(attributeValue, Integer.valueOf(i11));
                    dVar.f41701a = C8834a.c(i11, context);
                    break;
            }
        }
        if (i11 != -1) {
            int i14 = this.f41476a.f41271v;
            dVar.Q(context, xmlResourceParser);
            if (i12 != -1) {
                this.f41484i.put(i11, i12);
            }
            this.f41482g.put(i11, dVar);
        }
        return i11;
    }

    private int s(int i11, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return r(context, xml);
                }
            }
            return -1;
        } catch (IOException e11) {
            e11.printStackTrace();
            return -1;
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
            return -1;
        }
    }

    private void t(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.i.f41868y);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                s(obtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void u(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.i.f41858o);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                int i12 = obtainStyledAttributes.getInt(index, this.f41485j);
                this.f41485j = i12;
                if (i12 < 8) {
                    this.f41485j = 8;
                }
            } else if (index == 1) {
                this.f41486k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void w(int i11, MotionLayout motionLayout) {
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f41482g;
        androidx.constraintlayout.widget.d dVar = sparseArray.get(i11);
        dVar.f41702b = dVar.f41701a;
        int i12 = this.f41484i.get(i11);
        if (i12 > 0) {
            w(i12, motionLayout);
            androidx.constraintlayout.widget.d dVar2 = sparseArray.get(i12);
            if (dVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + C8834a.c(i12, this.f41476a.getContext()));
                return;
            } else {
                dVar.f41702b += "/" + dVar2.f41702b;
                dVar.W(dVar2);
            }
        } else {
            dVar.f41702b = o0.c(new StringBuilder(), dVar.f41702b, "  layout");
            dVar.V(motionLayout);
        }
        dVar.e(dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void A(int i11, int i12) {
        int i13;
        int i14;
        androidx.constraintlayout.widget.k kVar = this.f41477b;
        if (kVar != null) {
            i13 = kVar.b(i11);
            if (i13 == -1) {
                i13 = i11;
            }
            i14 = this.f41477b.b(i12);
        } else {
            i13 = i11;
        }
        i14 = i12;
        b bVar = this.f41478c;
        if (bVar != null && bVar.f41498c == i12 && this.f41478c.f41499d == i11) {
            return;
        }
        ArrayList<b> arrayList = this.f41479d;
        Iterator<b> it = arrayList.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if ((next.f41498c == i14 && next.f41499d == i13) || (next.f41498c == i12 && next.f41499d == i11)) {
                this.f41478c = next;
                if (next.f41507l != null) {
                    this.f41478c.f41507l.u(this.f41491p);
                    return;
                }
                return;
            }
        }
        b bVar2 = this.f41480e;
        Iterator<b> it2 = this.f41481f.iterator();
        while (it2.hasNext()) {
            b next2 = it2.next();
            if (next2.f41498c == i12) {
                bVar2 = next2;
            }
        }
        b bVar3 = new b(this, bVar2);
        bVar3.f41499d = i13;
        bVar3.f41498c = i14;
        if (i13 != -1) {
            arrayList.add(bVar3);
        }
        this.f41478c = bVar3;
    }

    public final void B(b bVar) {
        this.f41478c = bVar;
        if (bVar == null || bVar.f41507l == null) {
            return;
        }
        this.f41478c.f41507l.u(this.f41491p);
    }

    final boolean C() {
        Iterator<b> it = this.f41479d.iterator();
        while (it.hasNext()) {
            if (it.next().f41507l != null) {
                return true;
            }
        }
        b bVar = this.f41478c;
        return (bVar == null || bVar.f41507l == null) ? false : true;
    }

    public final void f(int i11, MotionLayout motionLayout) {
        ArrayList<b> arrayList = this.f41479d;
        Iterator<b> it = arrayList.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f41508m.size() > 0) {
                Iterator it2 = next.f41508m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).b(motionLayout);
                }
            }
        }
        ArrayList<b> arrayList2 = this.f41481f;
        Iterator<b> it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            if (next2.f41508m.size() > 0) {
                Iterator it4 = next2.f41508m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).b(motionLayout);
                }
            }
        }
        Iterator<b> it5 = arrayList.iterator();
        while (it5.hasNext()) {
            b next3 = it5.next();
            if (next3.f41508m.size() > 0) {
                Iterator it6 = next3.f41508m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).a(motionLayout, i11, next3);
                }
            }
        }
        Iterator<b> it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            b next4 = it7.next();
            if (next4.f41508m.size() > 0) {
                Iterator it8 = next4.f41508m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).a(motionLayout, i11, next4);
                }
            }
        }
    }

    final boolean g(int i11, MotionLayout motionLayout) {
        b bVar;
        if (this.f41490o != null) {
            return false;
        }
        Iterator<b> it = this.f41479d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f41509n != 0 && ((bVar = this.f41478c) != next || !bVar.B(2))) {
                if (i11 == next.f41499d && (next.f41509n == 4 || next.f41509n == 2)) {
                    MotionLayout.j jVar = MotionLayout.j.FINISHED;
                    motionLayout.I(jVar);
                    motionLayout.K(next);
                    if (next.f41509n == 4) {
                        motionLayout.M();
                        motionLayout.I(MotionLayout.j.SETUP);
                        motionLayout.I(MotionLayout.j.MOVING);
                        return true;
                    }
                    motionLayout.H(1.0f);
                    motionLayout.t(true);
                    motionLayout.I(MotionLayout.j.SETUP);
                    motionLayout.I(MotionLayout.j.MOVING);
                    motionLayout.I(jVar);
                    motionLayout.E();
                    return true;
                }
                if (i11 == next.f41498c && (next.f41509n == 3 || next.f41509n == 1)) {
                    MotionLayout.j jVar2 = MotionLayout.j.FINISHED;
                    motionLayout.I(jVar2);
                    motionLayout.K(next);
                    if (next.f41509n == 3) {
                        motionLayout.O();
                        motionLayout.I(MotionLayout.j.SETUP);
                        motionLayout.I(MotionLayout.j.MOVING);
                        return true;
                    }
                    motionLayout.H(0.0f);
                    motionLayout.t(true);
                    motionLayout.I(MotionLayout.j.SETUP);
                    motionLayout.I(MotionLayout.j.MOVING);
                    motionLayout.I(jVar2);
                    motionLayout.E();
                    return true;
                }
            }
        }
        return false;
    }

    final androidx.constraintlayout.widget.d h(int i11) {
        int b11;
        androidx.constraintlayout.widget.k kVar = this.f41477b;
        if (kVar != null && (b11 = kVar.b(i11)) != -1) {
            i11 = b11;
        }
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f41482g;
        if (sparseArray.get(i11) != null) {
            return sparseArray.get(i11);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + C8834a.c(i11, this.f41476a.getContext()) + " In MotionScene");
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public final int[] i() {
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f41482g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = sparseArray.keyAt(i11);
        }
        return iArr;
    }

    public final ArrayList<b> j() {
        return this.f41479d;
    }

    public final int k() {
        b bVar = this.f41478c;
        return bVar != null ? bVar.f41503h : this.f41485j;
    }

    public final Interpolator m() {
        int i11 = this.f41478c.f41500e;
        if (i11 == -2) {
            return AnimationUtils.loadInterpolator(this.f41476a.getContext(), this.f41478c.f41502g);
        }
        if (i11 == -1) {
            return new a(C6785c.c(this.f41478c.f41501f));
        }
        if (i11 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i11 == 1) {
            return new AccelerateInterpolator();
        }
        if (i11 == 2) {
            return new DecelerateInterpolator();
        }
        if (i11 == 4) {
            return new BounceInterpolator();
        }
        if (i11 == 5) {
            return new OvershootInterpolator();
        }
        if (i11 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void n(k kVar) {
        b bVar = this.f41478c;
        if (bVar != null) {
            Iterator it = bVar.f41506k.iterator();
            while (it.hasNext()) {
                ((d) it.next()).b(kVar);
            }
        } else {
            b bVar2 = this.f41480e;
            if (bVar2 != null) {
                Iterator it2 = bVar2.f41506k.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(kVar);
                }
            }
        }
    }

    final float o() {
        b bVar = this.f41478c;
        if (bVar == null || bVar.f41507l == null) {
            return 0.0f;
        }
        return this.f41478c.f41507l.e();
    }

    final int p() {
        b bVar = this.f41478c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f41499d;
    }

    public final b q(int i11) {
        Iterator<b> it = this.f41479d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f41496a == i11) {
                return next;
            }
        }
        return null;
    }

    final void v(MotionEvent motionEvent, int i11, MotionLayout motionLayout) {
        MotionLayout.f fVar;
        MotionLayout.f fVar2;
        MotionEvent motionEvent2;
        b bVar;
        int i12;
        Iterator it;
        RectF rectF;
        float f7;
        float f11;
        MotionEvent motionEvent3;
        RectF rectF2 = new RectF();
        MotionLayout.f fVar3 = this.f41490o;
        MotionLayout motionLayout2 = this.f41476a;
        if (fVar3 == null) {
            motionLayout2.getClass();
            this.f41490o = MotionLayout.g.a();
        }
        VelocityTracker velocityTracker = ((MotionLayout.g) this.f41490o).f41309a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (i11 != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f41493r = motionEvent.getRawX();
                this.f41494s = motionEvent.getRawY();
                this.f41487l = motionEvent;
                this.f41488m = false;
                if (this.f41478c.f41507l != null) {
                    RectF d11 = this.f41478c.f41507l.d(motionLayout2, rectF2);
                    if (d11 != null && !d11.contains(this.f41487l.getX(), this.f41487l.getY())) {
                        this.f41487l = null;
                        this.f41488m = true;
                        return;
                    }
                    RectF n11 = this.f41478c.f41507l.n(motionLayout2, rectF2);
                    if (n11 == null || n11.contains(this.f41487l.getX(), this.f41487l.getY())) {
                        this.f41489n = false;
                    } else {
                        this.f41489n = true;
                    }
                    this.f41478c.f41507l.t(this.f41493r, this.f41494s);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f41488m) {
                float rawY = motionEvent.getRawY() - this.f41494s;
                float rawX = motionEvent.getRawX() - this.f41493r;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f41487l) == null) {
                    return;
                }
                if (i11 != -1) {
                    androidx.constraintlayout.widget.k kVar = this.f41477b;
                    if (kVar == null || (i12 = kVar.b(i11)) == -1) {
                        i12 = i11;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<b> it2 = this.f41479d.iterator();
                    while (it2.hasNext()) {
                        b next = it2.next();
                        if (next.f41499d == i12 || next.f41498c == i12) {
                            arrayList.add(next);
                        }
                    }
                    RectF rectF3 = new RectF();
                    Iterator it3 = arrayList.iterator();
                    float f12 = 0.0f;
                    bVar = null;
                    while (it3.hasNext()) {
                        b bVar2 = (b) it3.next();
                        if (bVar2.f41510o) {
                            it = it3;
                        } else {
                            if (bVar2.f41507l != null) {
                                bVar2.f41507l.u(this.f41491p);
                                RectF n12 = bVar2.f41507l.n(motionLayout2, rectF3);
                                if (n12 != null) {
                                    it = it3;
                                    if (!n12.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                    }
                                } else {
                                    it = it3;
                                }
                                RectF d12 = bVar2.f41507l.d(motionLayout2, rectF3);
                                if (d12 == null || d12.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                    float a11 = bVar2.f41507l.a(rawX, rawY);
                                    if (bVar2.f41507l.f41532j) {
                                        float x11 = motionEvent2.getX();
                                        bVar2.f41507l.getClass();
                                        float y11 = motionEvent2.getY();
                                        bVar2.f41507l.getClass();
                                        rectF = rectF3;
                                        f11 = rawX;
                                        motionEvent3 = motionEvent2;
                                        f7 = rawY;
                                        a11 = ((float) (Math.atan2(rawY + r10, rawX + r7) - Math.atan2(x11 - 0.5f, y11 - 0.5f))) * 10.0f;
                                    } else {
                                        rectF = rectF3;
                                        f7 = rawY;
                                        f11 = rawX;
                                        motionEvent3 = motionEvent2;
                                    }
                                    float f13 = a11 * (bVar2.f41498c == i11 ? -1.0f : 1.1f);
                                    if (f13 > f12) {
                                        f12 = f13;
                                        bVar = bVar2;
                                    }
                                }
                            } else {
                                rectF = rectF3;
                                it = it3;
                                f7 = rawY;
                                f11 = rawX;
                                motionEvent3 = motionEvent2;
                            }
                            rawY = f7;
                            it3 = it;
                            rectF3 = rectF;
                            rawX = f11;
                            motionEvent2 = motionEvent3;
                        }
                        it3 = it;
                    }
                } else {
                    bVar = this.f41478c;
                }
                if (bVar != null) {
                    motionLayout.K(bVar);
                    RectF n13 = this.f41478c.f41507l.n(motionLayout2, rectF2);
                    this.f41489n = (n13 == null || n13.contains(this.f41487l.getX(), this.f41487l.getY())) ? false : true;
                    this.f41478c.f41507l.v(this.f41493r, this.f41494s);
                }
            }
        }
        if (this.f41488m) {
            return;
        }
        b bVar3 = this.f41478c;
        if (bVar3 != null && bVar3.f41507l != null && !this.f41489n) {
            this.f41478c.f41507l.q(motionEvent, this.f41490o);
        }
        this.f41493r = motionEvent.getRawX();
        this.f41494s = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (fVar = this.f41490o) == null) {
            return;
        }
        MotionLayout.g gVar = (MotionLayout.g) fVar;
        VelocityTracker velocityTracker2 = gVar.f41309a;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            fVar2 = null;
            gVar.f41309a = null;
        } else {
            fVar2 = null;
        }
        this.f41490o = fVar2;
        int i13 = motionLayout.f41253h;
        if (i13 != -1) {
            g(i13, motionLayout);
        }
    }

    final void x(MotionLayout motionLayout) {
        int i11 = 0;
        loop0: while (true) {
            SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f41482g;
            if (i11 >= sparseArray.size()) {
                return;
            }
            int keyAt = sparseArray.keyAt(i11);
            SparseIntArray sparseIntArray = this.f41484i;
            int i12 = sparseIntArray.get(keyAt);
            int size = sparseIntArray.size();
            while (i12 > 0) {
                if (i12 == keyAt) {
                    break loop0;
                }
                int i13 = size - 1;
                if (size < 0) {
                    break loop0;
                }
                i12 = sparseIntArray.get(i12);
                size = i13;
            }
            w(keyAt, motionLayout);
            i11++;
        }
        Log.e("MotionScene", "Cannot be derived from yourself");
    }

    public final void y(androidx.constraintlayout.widget.d dVar, int i11) {
        this.f41482g.put(i11, dVar);
    }

    public final void z(boolean z11) {
        this.f41491p = z11;
        b bVar = this.f41478c;
        if (bVar == null || bVar.f41507l == null) {
            return;
        }
        this.f41478c.f41507l.u(this.f41491p);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f41496a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f41497b;

        /* renamed from: c, reason: collision with root package name */
        private int f41498c;

        /* renamed from: d, reason: collision with root package name */
        private int f41499d;

        /* renamed from: e, reason: collision with root package name */
        private int f41500e;

        /* renamed from: f, reason: collision with root package name */
        private String f41501f;

        /* renamed from: g, reason: collision with root package name */
        private int f41502g;

        /* renamed from: h, reason: collision with root package name */
        private int f41503h;

        /* renamed from: i, reason: collision with root package name */
        private float f41504i;

        /* renamed from: j, reason: collision with root package name */
        private final m f41505j;

        /* renamed from: k, reason: collision with root package name */
        private ArrayList<d> f41506k;

        /* renamed from: l, reason: collision with root package name */
        private n f41507l;

        /* renamed from: m, reason: collision with root package name */
        private ArrayList<a> f41508m;

        /* renamed from: n, reason: collision with root package name */
        private int f41509n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f41510o;

        /* renamed from: p, reason: collision with root package name */
        private int f41511p;

        /* renamed from: q, reason: collision with root package name */
        private int f41512q;

        /* renamed from: r, reason: collision with root package name */
        private int f41513r;

        public static class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            private final b f41514a;

            /* renamed from: b, reason: collision with root package name */
            int f41515b;

            /* renamed from: c, reason: collision with root package name */
            int f41516c;

            public a(Context context, b bVar, XmlResourceParser xmlResourceParser) {
                this.f41515b = -1;
                this.f41516c = 17;
                this.f41514a = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.i.f41859p);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i11 = 0; i11 < indexCount; i11++) {
                    int index = obtainStyledAttributes.getIndex(i11);
                    if (index == 1) {
                        this.f41515b = obtainStyledAttributes.getResourceId(index, this.f41515b);
                    } else if (index == 0) {
                        this.f41516c = obtainStyledAttributes.getInt(index, this.f41516c);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View] */
            public final void a(MotionLayout motionLayout, int i11, b bVar) {
                int i12 = this.f41515b;
                MotionLayout motionLayout2 = motionLayout;
                if (i12 != -1) {
                    motionLayout2 = motionLayout.findViewById(i12);
                }
                if (motionLayout2 == null) {
                    Log.e("MotionScene", "OnClick could not find id " + i12);
                    return;
                }
                int i13 = bVar.f41499d;
                int i14 = bVar.f41498c;
                if (i13 == -1) {
                    motionLayout2.setOnClickListener(this);
                    return;
                }
                int i15 = this.f41516c;
                int i16 = i15 & 1;
                if (((i16 != 0 && i11 == i13) | (i16 != 0 && i11 == i13) | ((i15 & 256) != 0 && i11 == i13) | ((i15 & 16) != 0 && i11 == i14)) || ((i15 & 4096) != 0 && i11 == i14)) {
                    motionLayout2.setOnClickListener(this);
                }
            }

            public final void b(MotionLayout motionLayout) {
                int i11 = this.f41515b;
                if (i11 == -1) {
                    return;
                }
                View findViewById = motionLayout.findViewById(i11);
                if (findViewById != null) {
                    findViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + i11);
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                b bVar = this.f41514a;
                MotionLayout motionLayout = bVar.f41505j.f41476a;
                if (motionLayout.D()) {
                    if (bVar.f41499d == -1) {
                        int i11 = motionLayout.f41253h;
                        if (i11 == -1) {
                            motionLayout.P(bVar.f41498c);
                            return;
                        }
                        b bVar2 = new b(bVar.f41505j, bVar);
                        bVar2.f41499d = i11;
                        bVar2.f41498c = bVar.f41498c;
                        motionLayout.K(bVar2);
                        motionLayout.M();
                        return;
                    }
                    b bVar3 = bVar.f41505j.f41478c;
                    int i12 = this.f41516c;
                    int i13 = i12 & 1;
                    boolean z11 = true;
                    boolean z12 = false;
                    boolean z13 = (i13 == 0 && (i12 & 256) == 0) ? false : true;
                    int i14 = i12 & 16;
                    if (i14 == 0 && (i12 & 4096) == 0) {
                        z11 = false;
                    }
                    if (z13 && z11) {
                        if (bVar.f41505j.f41478c != bVar) {
                            motionLayout.K(bVar);
                        }
                        if (motionLayout.f41253h != motionLayout.z() && motionLayout.f41262q <= 0.5f) {
                            z11 = false;
                        }
                        if (bVar != bVar3) {
                            int i15 = bVar.f41498c;
                            int i16 = bVar.f41499d;
                            if (i16 != -1) {
                                int i17 = motionLayout.f41253h;
                                if (i17 != i16 && i17 != i15) {
                                    return;
                                }
                            } else if (motionLayout.f41253h == i15) {
                                return;
                            }
                        }
                        if (!z12 && i13 != 0) {
                            motionLayout.K(bVar);
                            motionLayout.M();
                            return;
                        }
                        if (!z11 && i14 != 0) {
                            motionLayout.K(bVar);
                            motionLayout.O();
                            return;
                        } else if (!z12 && (i12 & 256) != 0) {
                            motionLayout.K(bVar);
                            motionLayout.H(1.0f);
                            return;
                        } else {
                            if (z11 || (i12 & 4096) == 0) {
                            }
                            motionLayout.K(bVar);
                            motionLayout.H(0.0f);
                            return;
                        }
                    }
                    z12 = z13;
                    if (bVar != bVar3) {
                    }
                    if (!z12) {
                    }
                    if (!z11) {
                    }
                    if (!z12) {
                    }
                    if (z11) {
                    }
                }
            }
        }

        b(m mVar, b bVar) {
            this.f41496a = -1;
            this.f41497b = false;
            this.f41498c = -1;
            this.f41499d = -1;
            this.f41500e = 0;
            this.f41501f = null;
            this.f41502g = -1;
            this.f41503h = 400;
            this.f41504i = 0.0f;
            this.f41506k = new ArrayList<>();
            this.f41507l = null;
            this.f41508m = new ArrayList<>();
            this.f41509n = 0;
            this.f41510o = false;
            this.f41511p = -1;
            this.f41512q = 0;
            this.f41513r = 0;
            this.f41505j = mVar;
            this.f41503h = mVar.f41485j;
            if (bVar != null) {
                this.f41511p = bVar.f41511p;
                this.f41500e = bVar.f41500e;
                this.f41501f = bVar.f41501f;
                this.f41502g = bVar.f41502g;
                this.f41503h = bVar.f41503h;
                this.f41506k = bVar.f41506k;
                this.f41504i = bVar.f41504i;
                this.f41512q = bVar.f41512q;
            }
        }

        public final boolean A() {
            return !this.f41510o;
        }

        public final boolean B(int i11) {
            return (i11 & this.f41513r) != 0;
        }

        public final void C(int i11) {
            this.f41503h = Math.max(i11, 8);
        }

        public final void D(boolean z11) {
            this.f41510o = !z11;
        }

        public final void E(int i11, int i12, String str) {
            this.f41500e = i11;
            this.f41501f = str;
            this.f41502g = i12;
        }

        public final void F(int i11) {
            this.f41511p = i11;
        }

        public final void t(d dVar) {
            this.f41506k.add(dVar);
        }

        public final void u(Context context, XmlResourceParser xmlResourceParser) {
            this.f41508m.add(new a(context, this, xmlResourceParser));
        }

        public final int v() {
            return this.f41509n;
        }

        public final int w() {
            return this.f41498c;
        }

        public final int x() {
            return this.f41512q;
        }

        public final int y() {
            return this.f41499d;
        }

        public final n z() {
            return this.f41507l;
        }

        public b(m mVar, int i11) {
            this.f41496a = -1;
            this.f41497b = false;
            this.f41498c = -1;
            this.f41499d = -1;
            this.f41500e = 0;
            this.f41501f = null;
            this.f41502g = -1;
            this.f41503h = 400;
            this.f41504i = 0.0f;
            this.f41506k = new ArrayList<>();
            this.f41507l = null;
            this.f41508m = new ArrayList<>();
            this.f41509n = 0;
            this.f41510o = false;
            this.f41511p = -1;
            this.f41512q = 0;
            this.f41513r = 0;
            this.f41496a = -1;
            this.f41505j = mVar;
            this.f41499d = R.id.view_transition;
            this.f41498c = i11;
            this.f41503h = mVar.f41485j;
            this.f41512q = mVar.f41486k;
        }

        b(m mVar, Context context, XmlResourceParser xmlResourceParser) {
            this.f41496a = -1;
            this.f41497b = false;
            this.f41498c = -1;
            this.f41499d = -1;
            this.f41500e = 0;
            this.f41501f = null;
            this.f41502g = -1;
            this.f41503h = 400;
            this.f41504i = 0.0f;
            this.f41506k = new ArrayList<>();
            this.f41507l = null;
            this.f41508m = new ArrayList<>();
            this.f41509n = 0;
            this.f41510o = false;
            this.f41511p = -1;
            this.f41512q = 0;
            this.f41513r = 0;
            this.f41503h = mVar.f41485j;
            this.f41512q = mVar.f41486k;
            this.f41505j = mVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.i.f41865v);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 2) {
                    this.f41498c = obtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f41498c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.P(this.f41498c, context);
                        mVar.f41482g.append(this.f41498c, dVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f41498c = m.c(mVar, context, this.f41498c);
                    }
                } else if (index == 3) {
                    this.f41499d = obtainStyledAttributes.getResourceId(index, this.f41499d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f41499d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        dVar2.P(this.f41499d, context);
                        mVar.f41482g.append(this.f41499d, dVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f41499d = m.c(mVar, context, this.f41499d);
                    }
                } else if (index == 6) {
                    int i12 = obtainStyledAttributes.peekValue(index).type;
                    if (i12 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.f41502g = resourceId;
                        if (resourceId != -1) {
                            this.f41500e = -2;
                        }
                    } else if (i12 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f41501f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f41502g = obtainStyledAttributes.getResourceId(index, -1);
                                this.f41500e = -2;
                            } else {
                                this.f41500e = -1;
                            }
                        }
                    } else {
                        this.f41500e = obtainStyledAttributes.getInteger(index, this.f41500e);
                    }
                } else if (index == 4) {
                    int i13 = obtainStyledAttributes.getInt(index, this.f41503h);
                    this.f41503h = i13;
                    if (i13 < 8) {
                        this.f41503h = 8;
                    }
                } else if (index == 8) {
                    this.f41504i = obtainStyledAttributes.getFloat(index, this.f41504i);
                } else if (index == 1) {
                    this.f41509n = obtainStyledAttributes.getInteger(index, this.f41509n);
                } else if (index == 0) {
                    this.f41496a = obtainStyledAttributes.getResourceId(index, this.f41496a);
                } else if (index == 9) {
                    this.f41510o = obtainStyledAttributes.getBoolean(index, this.f41510o);
                } else if (index == 7) {
                    this.f41511p = obtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f41512q = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.f41513r = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f41499d == -1) {
                this.f41497b = true;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
