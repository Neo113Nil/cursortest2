package L;

import android.content.Context;
import android.view.ViewGroup;
import game.betting133.sports1xbet.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class r extends ViewGroup {

    /* renamed from: k, reason: collision with root package name */
    public final int f2966k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2967l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2968m;

    /* renamed from: n, reason: collision with root package name */
    public final G.v f2969n;

    /* renamed from: o, reason: collision with root package name */
    public int f2970o;

    public r(Context context) {
        super(context);
        this.f2966k = 5;
        ArrayList arrayList = new ArrayList();
        this.f2967l = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f2968m = arrayList2;
        this.f2969n = new G.v(5);
        setClipChildren(false);
        t tVar = new t(context);
        addView(tVar);
        arrayList.add(tVar);
        arrayList2.add(tVar);
        this.f2970o = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final t a(s sVar) {
        G.v vVar = this.f2969n;
        t tVar = (t) ((LinkedHashMap) vVar.f1749l).get(sVar);
        if (tVar != null) {
            return tVar;
        }
        ArrayList arrayList = this.f2968m;
        kotlin.jvm.internal.l.f("<this>", arrayList);
        t tVar2 = (t) (arrayList.isEmpty() ? null : arrayList.remove(0));
        LinkedHashMap linkedHashMap = (LinkedHashMap) vVar.f1749l;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) vVar.f1750m;
        if (tVar2 == null) {
            int i = this.f2970o;
            ArrayList arrayList2 = this.f2967l;
            if (i > X3.n.N(arrayList2)) {
                tVar2 = new t(getContext());
                addView(tVar2);
                arrayList2.add(tVar2);
            } else {
                tVar2 = (t) arrayList2.get(this.f2970o);
                s sVar2 = (s) linkedHashMap2.get(tVar2);
                if (sVar2 != null) {
                    sVar2.Y();
                    t tVar3 = (t) linkedHashMap.get(sVar2);
                    if (tVar3 != null) {
                    }
                    linkedHashMap.remove(sVar2);
                    tVar2.c();
                }
            }
            int i5 = this.f2970o;
            if (i5 < this.f2966k - 1) {
                this.f2970o = i5 + 1;
            } else {
                this.f2970o = 0;
            }
        }
        linkedHashMap.put(sVar, tVar2);
        linkedHashMap2.put(tVar2, sVar);
        return tVar2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
    }
}
