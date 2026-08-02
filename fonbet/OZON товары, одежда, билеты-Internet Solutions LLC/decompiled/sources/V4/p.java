package V4;

import E0.C2942q;
import V4.l;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class p extends l {

    /* renamed from: c, reason: collision with root package name */
    int f28053c;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<l> f28051a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private boolean f28052b = true;

    /* renamed from: d, reason: collision with root package name */
    boolean f28054d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f28055e = 0;

    final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f28056a;

        a(l lVar) {
            this.f28056a = lVar;
        }

        @Override // V4.l.f
        public final void onTransitionEnd(@NonNull l lVar) {
            this.f28056a.runAnimators();
            lVar.removeListener(this);
        }
    }

    static class b extends m {

        /* renamed from: a, reason: collision with root package name */
        p f28057a;

        @Override // V4.l.f
        public final void onTransitionEnd(@NonNull l lVar) {
            p pVar = this.f28057a;
            int i11 = pVar.f28053c - 1;
            pVar.f28053c = i11;
            if (i11 == 0) {
                pVar.f28054d = false;
                pVar.end();
            }
            lVar.removeListener(this);
        }

        @Override // V4.m, V4.l.f
        public final void onTransitionStart(@NonNull l lVar) {
            p pVar = this.f28057a;
            if (pVar.f28054d) {
                return;
            }
            pVar.start();
            pVar.f28054d = true;
        }
    }

    @NonNull
    public final void a(@NonNull l lVar) {
        this.f28051a.add(lVar);
        lVar.mParent = this;
        long j11 = this.mDuration;
        if (j11 >= 0) {
            lVar.setDuration(j11);
        }
        if ((this.f28055e & 1) != 0) {
            lVar.setInterpolator(getInterpolator());
        }
        if ((this.f28055e & 2) != 0) {
            getPropagation();
            lVar.setPropagation(null);
        }
        if ((this.f28055e & 4) != 0) {
            lVar.setPathMotion(getPathMotion());
        }
        if ((this.f28055e & 8) != 0) {
            lVar.setEpicenterCallback(getEpicenterCallback());
        }
    }

    @Override // V4.l
    @NonNull
    public final l addListener(@NonNull l.f fVar) {
        return (p) super.addListener(fVar);
    }

    @Override // V4.l
    @NonNull
    public final l addTarget(@NonNull View view) {
        for (int i11 = 0; i11 < this.f28051a.size(); i11++) {
            this.f28051a.get(i11).addTarget(view);
        }
        return (p) super.addTarget(view);
    }

    public final l b(int i11) {
        if (i11 < 0 || i11 >= this.f28051a.size()) {
            return null;
        }
        return this.f28051a.get(i11);
    }

    public final int c() {
        return this.f28051a.size();
    }

    @Override // V4.l
    protected final void cancel() {
        super.cancel();
        int size = this.f28051a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f28051a.get(i11).cancel();
        }
    }

    @Override // V4.l
    public final void captureEndValues(@NonNull s sVar) {
        if (isValidTarget(sVar.f28063b)) {
            Iterator<l> it = this.f28051a.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.isValidTarget(sVar.f28063b)) {
                    next.captureEndValues(sVar);
                    sVar.f28064c.add(next);
                }
            }
        }
    }

    @Override // V4.l
    final void capturePropagationValues(s sVar) {
        super.capturePropagationValues(sVar);
        int size = this.f28051a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f28051a.get(i11).capturePropagationValues(sVar);
        }
    }

    @Override // V4.l
    public final void captureStartValues(@NonNull s sVar) {
        if (isValidTarget(sVar.f28063b)) {
            Iterator<l> it = this.f28051a.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.isValidTarget(sVar.f28063b)) {
                    next.captureStartValues(sVar);
                    sVar.f28064c.add(next);
                }
            }
        }
    }

    @Override // V4.l
    protected final void createAnimators(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f28051a.size();
        for (int i11 = 0; i11 < size; i11++) {
            l lVar = this.f28051a.get(i11);
            if (startDelay > 0 && (this.f28052b || i11 == 0)) {
                long startDelay2 = lVar.getStartDelay();
                if (startDelay2 > 0) {
                    lVar.setStartDelay(startDelay2 + startDelay);
                } else {
                    lVar.setStartDelay(startDelay);
                }
            }
            lVar.createAnimators(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    @NonNull
    public final void d(long j11) {
        ArrayList<l> arrayList;
        super.setDuration(j11);
        if (this.mDuration < 0 || (arrayList = this.f28051a) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f28051a.get(i11).setDuration(j11);
        }
    }

    @Override // V4.l
    @NonNull
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final p setInterpolator(TimeInterpolator timeInterpolator) {
        this.f28055e |= 1;
        ArrayList<l> arrayList = this.f28051a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f28051a.get(i11).setInterpolator(timeInterpolator);
            }
        }
        return (p) super.setInterpolator(timeInterpolator);
    }

    @NonNull
    public final void f(int i11) {
        if (i11 == 0) {
            this.f28052b = true;
        } else {
            if (i11 != 1) {
                throw new AndroidRuntimeException(Ej.b.a(i11, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f28052b = false;
        }
    }

    @Override // V4.l
    final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f28051a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f28051a.get(i11).forceToEnd(viewGroup);
        }
    }

    @Override // V4.l
    public final void pause(View view) {
        super.pause(view);
        int size = this.f28051a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f28051a.get(i11).pause(view);
        }
    }

    @Override // V4.l
    @NonNull
    public final l removeListener(@NonNull l.f fVar) {
        return (p) super.removeListener(fVar);
    }

    @Override // V4.l
    @NonNull
    public final l removeTarget(@NonNull View view) {
        for (int i11 = 0; i11 < this.f28051a.size(); i11++) {
            this.f28051a.get(i11).removeTarget(view);
        }
        return (p) super.removeTarget(view);
    }

    @Override // V4.l
    public final void resume(View view) {
        super.resume(view);
        int size = this.f28051a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f28051a.get(i11).resume(view);
        }
    }

    @Override // V4.l
    protected final void runAnimators() {
        if (this.f28051a.isEmpty()) {
            start();
            end();
            return;
        }
        b bVar = new b();
        bVar.f28057a = this;
        Iterator<l> it = this.f28051a.iterator();
        while (it.hasNext()) {
            it.next().addListener(bVar);
        }
        this.f28053c = this.f28051a.size();
        if (this.f28052b) {
            Iterator<l> it2 = this.f28051a.iterator();
            while (it2.hasNext()) {
                it2.next().runAnimators();
            }
            return;
        }
        for (int i11 = 1; i11 < this.f28051a.size(); i11++) {
            this.f28051a.get(i11 - 1).addListener(new a(this.f28051a.get(i11)));
        }
        l lVar = this.f28051a.get(0);
        if (lVar != null) {
            lVar.runAnimators();
        }
    }

    @Override // V4.l
    @NonNull
    public final /* bridge */ /* synthetic */ l setDuration(long j11) {
        d(j11);
        return this;
    }

    @Override // V4.l
    public final void setEpicenterCallback(l.e eVar) {
        super.setEpicenterCallback(eVar);
        this.f28055e |= 8;
        int size = this.f28051a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f28051a.get(i11).setEpicenterCallback(eVar);
        }
    }

    @Override // V4.l
    public final void setPathMotion(i iVar) {
        super.setPathMotion(iVar);
        this.f28055e |= 4;
        if (this.f28051a != null) {
            for (int i11 = 0; i11 < this.f28051a.size(); i11++) {
                this.f28051a.get(i11).setPathMotion(iVar);
            }
        }
    }

    @Override // V4.l
    public final void setPropagation(o oVar) {
        super.setPropagation(null);
        this.f28055e |= 2;
        int size = this.f28051a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f28051a.get(i11).setPropagation(null);
        }
    }

    @Override // V4.l
    @NonNull
    public final l setStartDelay(long j11) {
        return (p) super.setStartDelay(j11);
    }

    @Override // V4.l
    final String toString(String str) {
        String lVar = super.toString(str);
        for (int i11 = 0; i11 < this.f28051a.size(); i11++) {
            StringBuilder e11 = C2942q.e(lVar, "\n");
            e11.append(this.f28051a.get(i11).toString(U7.d.e(str, "  ")));
            lVar = e11.toString();
        }
        return lVar;
    }

    @Override // V4.l
    /* renamed from: clone */
    public final l mo13clone() {
        p pVar = (p) super.mo13clone();
        pVar.f28051a = new ArrayList<>();
        int size = this.f28051a.size();
        for (int i11 = 0; i11 < size; i11++) {
            l mo13clone = this.f28051a.get(i11).mo13clone();
            pVar.f28051a.add(mo13clone);
            mo13clone.mParent = pVar;
        }
        return pVar;
    }
}
