package V4;

import E0.C2942q;
import Ij.C3261b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import androidx.collection.C5153w;
import androidx.core.view.Y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class l implements Cloneable {
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final i STRAIGHT_PATH_MOTION = new a();
    private static ThreadLocal<C5132a<Animator, d>> sRunningAnimators = new ThreadLocal<>();
    private ArrayList<s> mEndValuesList;
    private e mEpicenterCallback;
    private C5132a<String, String> mNameOverrides;
    private ArrayList<s> mStartValuesList;
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private t mStartValues = new t();
    private t mEndValues = new t();
    p mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<f> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private i mPathMotion = STRAIGHT_PATH_MOTION;

    final class a extends i {
        @Override // V4.i
        public final Path a(float f7, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f7, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    final class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5132a f28036a;

        b(C5132a c5132a) {
            this.f28036a = c5132a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f28036a.remove(animator);
            l.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            l.this.mCurrentAnimators.add(animator);
        }
    }

    final class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            l.this.end();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        View f28039a;

        /* renamed from: b, reason: collision with root package name */
        String f28040b;

        /* renamed from: c, reason: collision with root package name */
        s f28041c;

        /* renamed from: d, reason: collision with root package name */
        F f28042d;

        /* renamed from: e, reason: collision with root package name */
        l f28043e;
    }

    public static abstract class e {
    }

    public interface f {
        void onTransitionCancel(@NonNull l lVar);

        void onTransitionEnd(@NonNull l lVar);

        void onTransitionPause(@NonNull l lVar);

        void onTransitionResume(@NonNull l lVar);

        void onTransitionStart(@NonNull l lVar);
    }

    private void addUnmatched(C5132a<View, s> c5132a, C5132a<View, s> c5132a2) {
        for (int i11 = 0; i11 < c5132a.size(); i11++) {
            s n11 = c5132a.n(i11);
            if (isValidTarget(n11.f28063b)) {
                this.mStartValuesList.add(n11);
                this.mEndValuesList.add(null);
            }
        }
        for (int i12 = 0; i12 < c5132a2.size(); i12++) {
            s n12 = c5132a2.n(i12);
            if (isValidTarget(n12.f28063b)) {
                this.mEndValuesList.add(n12);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(t tVar, View view, s sVar) {
        tVar.f28065a.put(view, sVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            SparseArray<View> sparseArray = tVar.f28066b;
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        String o11 = Y.o(view);
        if (o11 != null) {
            C5132a<String, View> c5132a = tVar.f28068d;
            if (c5132a.containsKey(o11)) {
                c5132a.put(o11, null);
            } else {
                c5132a.put(o11, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C5153w<View> c5153w = tVar.f28067c;
                if (c5153w.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c5153w.f(itemIdAtPosition, view);
                    return;
                }
                View b11 = c5153w.b(itemIdAtPosition);
                if (b11 != null) {
                    b11.setHasTransientState(false);
                    c5153w.f(itemIdAtPosition, null);
                }
            }
        }
    }

    private void captureHierarchy(View view, boolean z11) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (this.mTargetTypeExcludes.get(i11).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z11) {
                        captureStartValues(sVar);
                    } else {
                        captureEndValues(sVar);
                    }
                    sVar.f28064c.add(this);
                    capturePropagationValues(sVar);
                    if (z11) {
                        addViewValues(this.mStartValues, view, sVar);
                    } else {
                        addViewValues(this.mEndValues, view, sVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    if (this.mTargetTypeChildExcludes.get(i12).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                                captureHierarchy(viewGroup.getChildAt(i13), z11);
                            }
                        }
                    }
                }
            }
        }
    }

    private static C5132a<Animator, d> getRunningAnimators() {
        C5132a<Animator, d> c5132a = sRunningAnimators.get();
        if (c5132a != null) {
            return c5132a;
        }
        C5132a<Animator, d> c5132a2 = new C5132a<>();
        sRunningAnimators.set(c5132a2);
        return c5132a2;
    }

    private static boolean isValueChanged(s sVar, s sVar2, String str) {
        Object obj = sVar.f28062a.get(str);
        Object obj2 = sVar2.f28062a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void matchIds(C5132a<View, s> c5132a, C5132a<View, s> c5132a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            View valueAt = sparseArray.valueAt(i11);
            if (valueAt != null && isValidTarget(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i11))) != null && isValidTarget(view)) {
                s sVar = c5132a.get(valueAt);
                s sVar2 = c5132a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.mStartValuesList.add(sVar);
                    this.mEndValuesList.add(sVar2);
                    c5132a.remove(valueAt);
                    c5132a2.remove(view);
                }
            }
        }
    }

    private void matchInstances(C5132a<View, s> c5132a, C5132a<View, s> c5132a2) {
        s remove;
        for (int size = c5132a.size() - 1; size >= 0; size--) {
            View j11 = c5132a.j(size);
            if (j11 != null && isValidTarget(j11) && (remove = c5132a2.remove(j11)) != null && isValidTarget(remove.f28063b)) {
                this.mStartValuesList.add(c5132a.l(size));
                this.mEndValuesList.add(remove);
            }
        }
    }

    private void matchItemIds(C5132a<View, s> c5132a, C5132a<View, s> c5132a2, C5153w<View> c5153w, C5153w<View> c5153w2) {
        View b11;
        int h11 = c5153w.h();
        for (int i11 = 0; i11 < h11; i11++) {
            View i12 = c5153w.i(i11);
            if (i12 != null && isValidTarget(i12) && (b11 = c5153w2.b(c5153w.e(i11))) != null && isValidTarget(b11)) {
                s sVar = c5132a.get(i12);
                s sVar2 = c5132a2.get(b11);
                if (sVar != null && sVar2 != null) {
                    this.mStartValuesList.add(sVar);
                    this.mEndValuesList.add(sVar2);
                    c5132a.remove(i12);
                    c5132a2.remove(b11);
                }
            }
        }
    }

    private void matchNames(C5132a<View, s> c5132a, C5132a<View, s> c5132a2, C5132a<String, View> c5132a3, C5132a<String, View> c5132a4) {
        View view;
        int size = c5132a3.size();
        for (int i11 = 0; i11 < size; i11++) {
            View n11 = c5132a3.n(i11);
            if (n11 != null && isValidTarget(n11) && (view = c5132a4.get(c5132a3.j(i11))) != null && isValidTarget(view)) {
                s sVar = c5132a.get(n11);
                s sVar2 = c5132a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.mStartValuesList.add(sVar);
                    this.mEndValuesList.add(sVar2);
                    c5132a.remove(n11);
                    c5132a2.remove(view);
                }
            }
        }
    }

    private void matchStartAndEnd(t tVar, t tVar2) {
        C5132a<View, s> c5132a = new C5132a<>(tVar.f28065a);
        C5132a<View, s> c5132a2 = new C5132a<>(tVar2.f28065a);
        int i11 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i11 >= iArr.length) {
                addUnmatched(c5132a, c5132a2);
                return;
            }
            int i12 = iArr[i11];
            if (i12 == 1) {
                matchInstances(c5132a, c5132a2);
            } else if (i12 == 2) {
                matchNames(c5132a, c5132a2, tVar.f28068d, tVar2.f28068d);
            } else if (i12 == 3) {
                matchIds(c5132a, c5132a2, tVar.f28066b, tVar2.f28066b);
            } else if (i12 == 4) {
                matchItemIds(c5132a, c5132a2, tVar.f28067c, tVar2.f28067c);
            }
            i11++;
        }
    }

    private void runAnimator(Animator animator, C5132a<Animator, d> c5132a) {
        if (animator != null) {
            animator.addListener(new b(c5132a));
            animate(animator);
        }
    }

    @NonNull
    public l addListener(@NonNull f fVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(fVar);
        return this;
    }

    @NonNull
    public l addTarget(@NonNull View view) {
        this.mTargets.add(view);
        return this;
    }

    protected void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new c());
        animator.start();
    }

    protected void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<f> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((f) arrayList2.get(i11)).onTransitionCancel(this);
        }
    }

    public abstract void captureEndValues(@NonNull s sVar);

    void capturePropagationValues(s sVar) {
    }

    public abstract void captureStartValues(@NonNull s sVar);

    void captureValues(ViewGroup viewGroup, boolean z11) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C5132a<String, String> c5132a;
        clearValues(z11);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i11 = 0; i11 < this.mTargetIds.size(); i11++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i11).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z11) {
                        captureStartValues(sVar);
                    } else {
                        captureEndValues(sVar);
                    }
                    sVar.f28064c.add(this);
                    capturePropagationValues(sVar);
                    if (z11) {
                        addViewValues(this.mStartValues, findViewById, sVar);
                    } else {
                        addViewValues(this.mEndValues, findViewById, sVar);
                    }
                }
            }
            for (int i12 = 0; i12 < this.mTargets.size(); i12++) {
                View view = this.mTargets.get(i12);
                s sVar2 = new s(view);
                if (z11) {
                    captureStartValues(sVar2);
                } else {
                    captureEndValues(sVar2);
                }
                sVar2.f28064c.add(this);
                capturePropagationValues(sVar2);
                if (z11) {
                    addViewValues(this.mStartValues, view, sVar2);
                } else {
                    addViewValues(this.mEndValues, view, sVar2);
                }
            }
        } else {
            captureHierarchy(viewGroup, z11);
        }
        if (z11 || (c5132a = this.mNameOverrides) == null) {
            return;
        }
        int size = c5132a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList3.add(this.mStartValues.f28068d.remove(this.mNameOverrides.j(i13)));
        }
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = (View) arrayList3.get(i14);
            if (view2 != null) {
                this.mStartValues.f28068d.put(this.mNameOverrides.n(i14), view2);
            }
        }
    }

    void clearValues(boolean z11) {
        if (z11) {
            this.mStartValues.f28065a.clear();
            this.mStartValues.f28066b.clear();
            this.mStartValues.f28067c.a();
        } else {
            this.mEndValues.f28065a.clear();
            this.mEndValues.f28066b.clear();
            this.mEndValues.f28067c.a();
        }
    }

    public Animator createAnimator(@NonNull ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    protected void createAnimators(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        Animator createAnimator;
        int i11;
        View view;
        s sVar;
        Animator animator;
        s sVar2;
        C5132a<Animator, d> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            s sVar3 = arrayList.get(i12);
            s sVar4 = arrayList2.get(i12);
            if (sVar3 != null && !sVar3.f28064c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f28064c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null) && ((sVar3 == null || sVar4 == null || isTransitionRequired(sVar3, sVar4)) && (createAnimator = createAnimator(viewGroup, sVar3, sVar4)) != null)) {
                if (sVar4 != null) {
                    String[] transitionProperties = getTransitionProperties();
                    view = sVar4.f28063b;
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        sVar2 = new s(view);
                        s sVar5 = tVar2.f28065a.get(view);
                        if (sVar5 != null) {
                            int i13 = 0;
                            while (i13 < transitionProperties.length) {
                                HashMap hashMap = sVar2.f28062a;
                                int i14 = size;
                                String str = transitionProperties[i13];
                                hashMap.put(str, sVar5.f28062a.get(str));
                                i13++;
                                size = i14;
                            }
                        }
                        i11 = size;
                        int size2 = runningAnimators.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                animator = createAnimator;
                                break;
                            }
                            d dVar = runningAnimators.get(runningAnimators.j(i15));
                            if (dVar.f28041c != null && dVar.f28039a == view && dVar.f28040b.equals(getName()) && dVar.f28041c.equals(sVar2)) {
                                animator = null;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        i11 = size;
                        animator = createAnimator;
                        sVar2 = null;
                    }
                    createAnimator = animator;
                    sVar = sVar2;
                } else {
                    i11 = size;
                    view = sVar3.f28063b;
                    sVar = null;
                }
                if (createAnimator != null) {
                    String name = getName();
                    Property<View, Float> property = y.f28073b;
                    F f7 = new F(viewGroup);
                    d dVar2 = new d();
                    dVar2.f28039a = view;
                    dVar2.f28040b = name;
                    dVar2.f28041c = sVar;
                    dVar2.f28042d = f7;
                    dVar2.f28043e = this;
                    runningAnimators.put(createAnimator, dVar2);
                    this.mAnimators.add(createAnimator);
                }
            } else {
                i11 = size;
            }
            i12++;
            size = i11;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                Animator animator2 = this.mAnimators.get(sparseIntArray.keyAt(i16));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i16) - Long.MAX_VALUE));
            }
        }
    }

    protected void end() {
        int i11 = this.mNumInstances - 1;
        this.mNumInstances = i11;
        if (i11 == 0) {
            ArrayList<f> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((f) arrayList2.get(i12)).onTransitionEnd(this);
                }
            }
            for (int i13 = 0; i13 < this.mStartValues.f28067c.h(); i13++) {
                View i14 = this.mStartValues.f28067c.i(i13);
                if (i14 != null) {
                    int i15 = Y.f42258g;
                    i14.setHasTransientState(false);
                }
            }
            for (int i16 = 0; i16 < this.mEndValues.f28067c.h(); i16++) {
                View i17 = this.mEndValues.f28067c.i(i16);
                if (i17 != null) {
                    int i18 = Y.f42258g;
                    i17.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void forceToEnd(ViewGroup viewGroup) {
        C5132a<Animator, d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        Property<View, Float> property = y.f28073b;
        F f7 = new F(viewGroup);
        C5132a c5132a = new C5132a(runningAnimators);
        runningAnimators.clear();
        for (int i11 = size - 1; i11 >= 0; i11--) {
            d dVar = (d) c5132a.n(i11);
            if (dVar.f28039a != null && f7.equals(dVar.f28042d)) {
                ((Animator) c5132a.j(i11)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public e getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    s getMatchedTransitionValues(View view, boolean z11) {
        p pVar = this.mParent;
        if (pVar != null) {
            return pVar.getMatchedTransitionValues(view, z11);
        }
        ArrayList<s> arrayList = z11 ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            }
            s sVar = arrayList.get(i11);
            if (sVar == null) {
                return null;
            }
            if (sVar.f28063b == view) {
                break;
            }
            i11++;
        }
        if (i11 >= 0) {
            return (z11 ? this.mEndValuesList : this.mStartValuesList).get(i11);
        }
        return null;
    }

    @NonNull
    public String getName() {
        return this.mName;
    }

    @NonNull
    public i getPathMotion() {
        return this.mPathMotion;
    }

    public o getPropagation() {
        return null;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @NonNull
    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    @NonNull
    public List<View> getTargets() {
        return this.mTargets;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public s getTransitionValues(@NonNull View view, boolean z11) {
        p pVar = this.mParent;
        if (pVar != null) {
            return pVar.getTransitionValues(view, z11);
        }
        return (z11 ? this.mStartValues : this.mEndValues).f28065a.get(view);
    }

    public boolean isTransitionRequired(s sVar, s sVar2) {
        if (sVar != null && sVar2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (isValueChanged(sVar, sVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = sVar.f28062a.keySet().iterator();
                while (it.hasNext()) {
                    if (isValueChanged(sVar, sVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (this.mTargetTypeExcludes.get(i11).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && Y.o(view) != null && this.mTargetNameExcludes.contains(Y.o(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id2)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(Y.o(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i12 = 0; i12 < this.mTargetTypes.size(); i12++) {
                if (this.mTargetTypes.get(i12).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).pause();
        }
        ArrayList<f> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((f) arrayList2.get(i11)).onTransitionPause(this);
            }
        }
        this.mPaused = true;
    }

    void playTransition(ViewGroup viewGroup) {
        d dVar;
        View view;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        C5132a<Animator, d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        Property<View, Float> property = y.f28073b;
        F f7 = new F(viewGroup);
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator j11 = runningAnimators.j(i11);
            if (j11 != null && (dVar = runningAnimators.get(j11)) != null && (view = dVar.f28039a) != null && f7.equals(dVar.f28042d)) {
                s transitionValues = getTransitionValues(view, true);
                s matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.f28065a.get(view);
                }
                if ((transitionValues != null || matchedTransitionValues != null) && dVar.f28043e.isTransitionRequired(dVar.f28041c, matchedTransitionValues)) {
                    if (j11.isRunning() || j11.isStarted()) {
                        j11.cancel();
                    } else {
                        runningAnimators.remove(j11);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    @NonNull
    public l removeListener(@NonNull f fVar) {
        ArrayList<f> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(fVar);
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    @NonNull
    public l removeTarget(@NonNull View view) {
        this.mTargets.remove(view);
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
                    this.mCurrentAnimators.get(size).resume();
                }
                ArrayList<f> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((f) arrayList2.get(i11)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    protected void runAnimators() {
        start();
        C5132a<Animator, d> runningAnimators = getRunningAnimators();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (runningAnimators.containsKey(next)) {
                start();
                runAnimator(next, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    @NonNull
    public l setDuration(long j11) {
        this.mDuration = j11;
        return this;
    }

    public void setEpicenterCallback(e eVar) {
        this.mEpicenterCallback = eVar;
    }

    @NonNull
    public l setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setPathMotion(i iVar) {
        if (iVar == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = iVar;
        }
    }

    public void setPropagation(o oVar) {
    }

    @NonNull
    public l setStartDelay(long j11) {
        this.mStartDelay = j11;
        return this;
    }

    protected void start() {
        if (this.mNumInstances == 0) {
            ArrayList<f> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    String toString(String str) {
        StringBuilder e11 = C3261b.e(str);
        e11.append(getClass().getSimpleName());
        e11.append("@");
        e11.append(Integer.toHexString(hashCode()));
        e11.append(": ");
        String sb2 = e11.toString();
        if (this.mDuration != -1) {
            sb2 = P4.f.a(this.mDuration, ") ", C2942q.e(sb2, "dur("));
        }
        if (this.mStartDelay != -1) {
            sb2 = P4.f.a(this.mStartDelay, ") ", C2942q.e(sb2, "dly("));
        }
        if (this.mInterpolator != null) {
            StringBuilder e12 = C2942q.e(sb2, "interp(");
            e12.append(this.mInterpolator);
            e12.append(") ");
            sb2 = e12.toString();
        }
        if (this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) {
            return sb2;
        }
        String e13 = U7.d.e(sb2, "tgts(");
        if (this.mTargetIds.size() > 0) {
            for (int i11 = 0; i11 < this.mTargetIds.size(); i11++) {
                if (i11 > 0) {
                    e13 = U7.d.e(e13, ", ");
                }
                StringBuilder e14 = C3261b.e(e13);
                e14.append(this.mTargetIds.get(i11));
                e13 = e14.toString();
            }
        }
        if (this.mTargets.size() > 0) {
            for (int i12 = 0; i12 < this.mTargets.size(); i12++) {
                if (i12 > 0) {
                    e13 = U7.d.e(e13, ", ");
                }
                StringBuilder e15 = C3261b.e(e13);
                e15.append(this.mTargets.get(i12));
                e13 = e15.toString();
            }
        }
        return U7.d.e(e13, ")");
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public l mo13clone() {
        try {
            l lVar = (l) super.clone();
            lVar.mAnimators = new ArrayList<>();
            lVar.mStartValues = new t();
            lVar.mEndValues = new t();
            lVar.mStartValuesList = null;
            lVar.mEndValuesList = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String toString() {
        return toString("");
    }
}
