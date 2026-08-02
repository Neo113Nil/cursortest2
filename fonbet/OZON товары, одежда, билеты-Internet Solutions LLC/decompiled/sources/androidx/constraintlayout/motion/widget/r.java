package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.p;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final MotionLayout f41584a;

    /* renamed from: c, reason: collision with root package name */
    private HashSet<View> f41586c;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<p.a> f41588e;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<p> f41585b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private String f41587d = "ViewTransitionController";

    /* renamed from: f, reason: collision with root package name */
    ArrayList<p.a> f41589f = new ArrayList<>();

    public r(MotionLayout motionLayout) {
        this.f41584a = motionLayout;
    }

    public final void a(p pVar) {
        this.f41585b.add(pVar);
        this.f41586c = null;
        if (pVar.f() == 4) {
            ConstraintLayout.getSharedValues().a(pVar.e(), new q());
        } else if (pVar.f() == 5) {
            ConstraintLayout.getSharedValues().a(pVar.e(), new q());
        }
    }

    final void b() {
        this.f41584a.invalidate();
    }

    final void c(MotionEvent motionEvent) {
        MotionLayout motionLayout = this.f41584a;
        int i11 = motionLayout.f41253h;
        if (i11 == -1) {
            return;
        }
        HashSet<View> hashSet = this.f41586c;
        ArrayList<p> arrayList = this.f41585b;
        if (hashSet == null) {
            this.f41586c = new HashSet<>();
            Iterator<p> it = arrayList.iterator();
            while (it.hasNext()) {
                p next = it.next();
                int childCount = motionLayout.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = motionLayout.getChildAt(i12);
                    if (next.g(childAt)) {
                        childAt.getId();
                        this.f41586c.add(childAt);
                    }
                }
            }
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<p.a> arrayList2 = this.f41588e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator<p.a> it2 = this.f41588e.iterator();
            while (it2.hasNext()) {
                p.a next2 = it2.next();
                if (action != 1) {
                    if (action != 2) {
                        next2.getClass();
                    } else {
                        View view = next2.f41573c.f41433b;
                        Rect rect2 = next2.f41582l;
                        view.getHitRect(rect2);
                        if (!rect2.contains((int) x11, (int) y11) && !next2.f41578h) {
                            next2.b();
                        }
                    }
                } else if (!next2.f41578h) {
                    next2.b();
                }
            }
        }
        if (action == 0 || action == 1) {
            m mVar = motionLayout.f41248c;
            androidx.constraintlayout.widget.d h11 = mVar == null ? null : mVar.h(i11);
            Iterator<p> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                p next3 = it3.next();
                if (next3.i(action)) {
                    Iterator<View> it4 = this.f41586c.iterator();
                    while (it4.hasNext()) {
                        View next4 = it4.next();
                        if (next3.g(next4)) {
                            next4.getHitRect(rect);
                            if (rect.contains((int) x11, (int) y11)) {
                                next3.b(this, this.f41584a, i11, h11, next4);
                            }
                        }
                    }
                }
            }
        }
    }

    final void d(int i11, View... viewArr) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<p> it = this.f41585b.iterator();
        p pVar = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = this.f41587d;
            if (!hasNext) {
                break;
            }
            p next = it.next();
            if (next.d() == i11) {
                for (View view : viewArr) {
                    if (next.c(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    MotionLayout motionLayout = this.f41584a;
                    int i12 = motionLayout.f41253h;
                    if (next.f41554e == 2) {
                        next.b(this, motionLayout, i12, null, viewArr2);
                    } else if (i12 == -1) {
                        Log.w(str, "No support for ViewTransition within transition yet. Currently: " + motionLayout.toString());
                    } else {
                        m mVar = motionLayout.f41248c;
                        androidx.constraintlayout.widget.d h11 = mVar == null ? null : mVar.h(i12);
                        if (h11 != null) {
                            next.b(this, this.f41584a, i12, h11, viewArr2);
                        }
                    }
                    arrayList.clear();
                }
                pVar = next;
            }
        }
        if (pVar == null) {
            Log.e(str, " Could not find ViewTransition");
        }
    }
}
