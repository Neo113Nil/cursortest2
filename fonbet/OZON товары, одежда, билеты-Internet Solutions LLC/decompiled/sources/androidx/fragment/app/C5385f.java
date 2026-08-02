package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.C5035b;
import androidx.collection.C5132a;
import androidx.core.view.C5308b0;
import androidx.fragment.app.C5385f;
import androidx.fragment.app.C5397s;
import androidx.fragment.app.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5385f extends f0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.f$a */
    /* loaded from: classes8.dex */
    static final class a extends f0.a {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final b f43045c;

        /* renamed from: androidx.fragment.app.f$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0786a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f0.c f43046a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f43047b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f43048c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f43049d;

            AnimationAnimationListenerC0786a(f0.c cVar, ViewGroup viewGroup, View view, a aVar) {
                this.f43046a = cVar;
                this.f43047b = viewGroup;
                this.f43048c = view;
                this.f43049d = aVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                final View view = this.f43048c;
                final a aVar = this.f43049d;
                final ViewGroup viewGroup = this.f43047b;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewGroup container = viewGroup;
                        Intrinsics.checkNotNullParameter(container, "$container");
                        C5385f.a this$0 = aVar;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        container.endViewTransition(view);
                        this$0.h().a().e(this$0);
                    }
                });
                if (G.D0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f43046a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (G.D0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f43046a + " has reached onAnimationStart.");
                }
            }
        }

        public a(@NotNull b animationInfo) {
            Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
            this.f43045c = animationInfo;
        }

        @Override // androidx.fragment.app.f0.a
        public final void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            b bVar = this.f43045c;
            f0.c a11 = bVar.a();
            View view = a11.h().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            bVar.a().e(this);
            if (G.D0(2)) {
                Log.v("FragmentManager", "Animation from operation " + a11 + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.f0.a
        public final void d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            b bVar = this.f43045c;
            if (bVar.b()) {
                bVar.a().e(this);
                return;
            }
            Context context = container.getContext();
            f0.c a11 = bVar.a();
            View view = a11.h().mView;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            C5397s.a c11 = bVar.c(context);
            if (c11 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = c11.f43165a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (a11.g() != f0.c.b.REMOVED) {
                view.startAnimation(animation);
                bVar.a().e(this);
                return;
            }
            container.startViewTransition(view);
            C5397s.b bVar2 = new C5397s.b(animation, container, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0786a(a11, container, view, this));
            view.startAnimation(bVar2);
            if (G.D0(2)) {
                Log.v("FragmentManager", "Animation from operation " + a11 + " has started.");
            }
        }

        @NotNull
        public final b h() {
            return this.f43045c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.f$b */
    static final class b extends C0787f {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f43050b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f43051c;

        /* renamed from: d, reason: collision with root package name */
        private C5397s.a f43052d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull f0.c operation, boolean z11) {
            super(operation);
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.f43050b = z11;
        }

        public final C5397s.a c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.f43051c) {
                return this.f43052d;
            }
            C5397s.a a11 = C5397s.a(context, a().h(), a().g() == f0.c.b.VISIBLE, this.f43050b);
            this.f43052d = a11;
            this.f43051c = true;
            return a11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.f$c */
    /* loaded from: classes8.dex */
    static final class c extends f0.a {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final b f43053c;

        /* renamed from: d, reason: collision with root package name */
        private AnimatorSet f43054d;

        /* renamed from: androidx.fragment.app.f$c$a */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewGroup f43055a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f43056b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f43057c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ f0.c f43058d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f43059e;

            a(ViewGroup viewGroup, View view, boolean z11, f0.c cVar, c cVar2) {
                this.f43055a = viewGroup;
                this.f43056b = view;
                this.f43057c = z11;
                this.f43058d = cVar;
                this.f43059e = cVar2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(@NotNull Animator anim) {
                Intrinsics.checkNotNullParameter(anim, "anim");
                ViewGroup viewGroup = this.f43055a;
                View viewToAnimate = this.f43056b;
                viewGroup.endViewTransition(viewToAnimate);
                f0.c cVar = this.f43058d;
                if (this.f43057c || cVar.g() == f0.c.b.GONE) {
                    f0.c.b g10 = cVar.g();
                    Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                    g10.a(viewToAnimate, viewGroup);
                }
                c cVar2 = this.f43059e;
                cVar2.h().a().e(cVar2);
                if (G.D0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + cVar + " has ended.");
                }
            }
        }

        public c(@NotNull b animatorInfo) {
            Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
            this.f43053c = animatorInfo;
        }

        @Override // androidx.fragment.app.f0.a
        public final void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            AnimatorSet animatorSet = this.f43054d;
            b bVar = this.f43053c;
            if (animatorSet == null) {
                bVar.a().e(this);
                return;
            }
            f0.c a11 = bVar.a();
            if (a11.m()) {
                e.f43061a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (G.D0(2)) {
                StringBuilder sb2 = new StringBuilder("Animator from operation ");
                sb2.append(a11);
                sb2.append(" has been canceled");
                sb2.append(a11.m() ? " with seeking." : ".");
                sb2.append(' ');
                Log.v("FragmentManager", sb2.toString());
            }
        }

        @Override // androidx.fragment.app.f0.a
        public final void d(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            b bVar = this.f43053c;
            f0.c a11 = bVar.a();
            AnimatorSet animatorSet = this.f43054d;
            if (animatorSet == null) {
                bVar.a().e(this);
                return;
            }
            animatorSet.start();
            if (G.D0(2)) {
                Log.v("FragmentManager", "Animator from operation " + a11 + " has started.");
            }
        }

        @Override // androidx.fragment.app.f0.a
        public final void e(@NotNull C5035b backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            b bVar = this.f43053c;
            f0.c a11 = bVar.a();
            AnimatorSet animatorSet = this.f43054d;
            if (animatorSet == null) {
                bVar.a().e(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !a11.h().mTransitioning) {
                return;
            }
            if (G.D0(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + a11);
            }
            long a12 = d.f43060a.a(animatorSet);
            long a13 = (long) (backEvent.a() * a12);
            if (a13 == 0) {
                a13 = 1;
            }
            if (a13 == a12) {
                a13 = a12 - 1;
            }
            if (G.D0(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + a13 + " for Animator " + animatorSet + " on operation " + a11);
            }
            e.f43061a.b(animatorSet, a13);
        }

        @Override // androidx.fragment.app.f0.a
        public final void f(@NotNull ViewGroup container) {
            c cVar;
            Intrinsics.checkNotNullParameter(container, "container");
            b bVar = this.f43053c;
            if (bVar.b()) {
                return;
            }
            Context context = container.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            C5397s.a c11 = bVar.c(context);
            this.f43054d = c11 != null ? c11.f43166b : null;
            f0.c a11 = bVar.a();
            ComponentCallbacksC5392m h11 = a11.h();
            boolean z11 = a11.g() == f0.c.b.GONE;
            View view = h11.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.f43054d;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(container, view, z11, a11, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.f43054d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        @NotNull
        public final b h() {
            return this.f43053c;
        }
    }

    /* renamed from: androidx.fragment.app.f$d */
    /* loaded from: classes8.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f43060a = new d();

        public final long a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* renamed from: androidx.fragment.app.f$e */
    /* loaded from: classes8.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f43061a = new e();

        public final void a(@NotNull AnimatorSet animatorSet) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(@NotNull AnimatorSet animatorSet, long j11) {
            Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j11);
        }
    }

    /* renamed from: androidx.fragment.app.f$f, reason: collision with other inner class name */
    public static class C0787f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final f0.c f43062a;

        public C0787f(@NotNull f0.c operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.f43062a = operation;
        }

        @NotNull
        public final f0.c a() {
            return this.f43062a;
        }

        public final boolean b() {
            f0.c.b bVar;
            f0.c cVar = this.f43062a;
            View view = cVar.h().mView;
            if (view != null) {
                f0.c.b.Companion.getClass();
                bVar = f0.c.b.a.a(view);
            } else {
                bVar = null;
            }
            f0.c.b g10 = cVar.g();
            if (bVar == g10) {
                return true;
            }
            f0.c.b bVar2 = f0.c.b.VISIBLE;
            return (bVar == bVar2 || g10 == bVar2) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.f$g */
    /* loaded from: classes8.dex */
    static final class g extends f0.a {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f43063c;

        /* renamed from: d, reason: collision with root package name */
        private final f0.c f43064d;

        /* renamed from: e, reason: collision with root package name */
        private final f0.c f43065e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final X f43066f;

        /* renamed from: g, reason: collision with root package name */
        private final Object f43067g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final ArrayList<View> f43068h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final ArrayList<View> f43069i;

        /* renamed from: j, reason: collision with root package name */
        @NotNull
        private final C5132a<String, String> f43070j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private final ArrayList<String> f43071k;

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private final ArrayList<String> f43072l;

        /* renamed from: m, reason: collision with root package name */
        @NotNull
        private final C5132a<String, View> f43073m;

        /* renamed from: n, reason: collision with root package name */
        @NotNull
        private final C5132a<String, View> f43074n;

        /* renamed from: o, reason: collision with root package name */
        private final boolean f43075o;

        /* renamed from: p, reason: collision with root package name */
        @NotNull
        private final androidx.core.os.e f43076p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f43077q;

        /* renamed from: androidx.fragment.app.f$g$a */
        static final class a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ViewGroup f43079c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f43080d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f43079c = viewGroup;
                this.f43080d = obj;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                g.this.j().c(this.f43079c, this.f43080d);
                return Unit.f71690a;
            }
        }

        public g(@NotNull ArrayList transitionInfos, f0.c cVar, f0.c cVar2, @NotNull X transitionImpl, Object obj, @NotNull ArrayList sharedElementFirstOutViews, @NotNull ArrayList sharedElementLastInViews, @NotNull C5132a sharedElementNameMapping, @NotNull ArrayList enteringNames, @NotNull ArrayList exitingNames, @NotNull C5132a firstOutViews, @NotNull C5132a lastInViews, boolean z11) {
            Intrinsics.checkNotNullParameter(transitionInfos, "transitionInfos");
            Intrinsics.checkNotNullParameter(transitionImpl, "transitionImpl");
            Intrinsics.checkNotNullParameter(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            Intrinsics.checkNotNullParameter(sharedElementLastInViews, "sharedElementLastInViews");
            Intrinsics.checkNotNullParameter(sharedElementNameMapping, "sharedElementNameMapping");
            Intrinsics.checkNotNullParameter(enteringNames, "enteringNames");
            Intrinsics.checkNotNullParameter(exitingNames, "exitingNames");
            Intrinsics.checkNotNullParameter(firstOutViews, "firstOutViews");
            Intrinsics.checkNotNullParameter(lastInViews, "lastInViews");
            this.f43063c = transitionInfos;
            this.f43064d = cVar;
            this.f43065e = cVar2;
            this.f43066f = transitionImpl;
            this.f43067g = obj;
            this.f43068h = sharedElementFirstOutViews;
            this.f43069i = sharedElementLastInViews;
            this.f43070j = sharedElementNameMapping;
            this.f43071k = enteringNames;
            this.f43072l = exitingNames;
            this.f43073m = firstOutViews;
            this.f43074n = lastInViews;
            this.f43075o = z11;
            this.f43076p = new androidx.core.os.e();
        }

        public static void h(f0.c cVar, f0.c cVar2, g this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            S.a(cVar.h(), cVar2.h(), this$0.f43075o, this$0.f43074n, false);
        }

        private static void i(View view, ArrayList arrayList) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (C5308b0.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View child = viewGroup.getChildAt(i11);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    i(child, arrayList);
                }
            }
        }

        @Override // androidx.fragment.app.f0.a
        public final boolean b() {
            this.f43066f.i();
            return false;
        }

        @Override // androidx.fragment.app.f0.a
        public final void c(@NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.f43076p.a();
        }

        @Override // androidx.fragment.app.f0.a
        public final void d(@NotNull ViewGroup container) {
            ArrayList<View> arrayList;
            ArrayList<View> arrayList2;
            Object obj;
            ArrayList arrayList3;
            final X x11;
            Object obj2;
            ArrayList<View> arrayList4;
            ArrayList arrayList5;
            String str;
            Iterator it;
            Intrinsics.checkNotNullParameter(container, "container");
            boolean isLaidOut = container.isLaidOut();
            ArrayList<h> arrayList6 = this.f43063c;
            String str2 = "FragmentManager";
            if (!isLaidOut || this.f43077q) {
                for (h hVar : arrayList6) {
                    f0.c a11 = hVar.a();
                    if (G.D0(2)) {
                        if (this.f43077q) {
                            Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + a11);
                        } else {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + a11);
                        }
                    }
                    hVar.a().e(this);
                }
                this.f43077q = false;
                return;
            }
            final f0.c cVar = this.f43065e;
            final f0.c cVar2 = this.f43064d;
            View view = new View(container.getContext());
            final Rect rect = new Rect();
            ArrayList arrayList7 = this.f43063c;
            Iterator it2 = arrayList7.iterator();
            View view2 = null;
            boolean z11 = false;
            while (true) {
                boolean hasNext = it2.hasNext();
                arrayList = this.f43069i;
                arrayList2 = this.f43068h;
                obj = this.f43067g;
                arrayList3 = arrayList7;
                x11 = this.f43066f;
                if (!hasNext) {
                    break;
                }
                if (!((h) it2.next()).g() || cVar2 == null || cVar == null || this.f43070j.isEmpty() || obj == null) {
                    arrayList5 = arrayList6;
                    str = str2;
                    it = it2;
                    z11 = z11;
                } else {
                    ComponentCallbacksC5392m h11 = cVar.h();
                    it = it2;
                    ComponentCallbacksC5392m h12 = cVar2.h();
                    boolean z12 = z11;
                    C5132a<String, View> c5132a = this.f43073m;
                    str = str2;
                    arrayList5 = arrayList6;
                    boolean z13 = true;
                    S.a(h11, h12, this.f43075o, c5132a, true);
                    androidx.core.view.G.a(container, new Runnable() { // from class: androidx.fragment.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5385f.g.h(f0.c.this, cVar2, this);
                        }
                    });
                    arrayList2.addAll(c5132a.values());
                    ArrayList<String> arrayList8 = this.f43072l;
                    if (!arrayList8.isEmpty()) {
                        String str3 = arrayList8.get(0);
                        Intrinsics.checkNotNullExpressionValue(str3, "exitingNames[0]");
                        View view3 = c5132a.get(str3);
                        x11.n(view3, obj);
                        view2 = view3;
                    }
                    C5132a<String, View> c5132a2 = this.f43074n;
                    arrayList.addAll(c5132a2.values());
                    ArrayList<String> arrayList9 = this.f43071k;
                    if (!arrayList9.isEmpty()) {
                        String str4 = arrayList9.get(0);
                        Intrinsics.checkNotNullExpressionValue(str4, "enteringNames[0]");
                        final View view4 = c5132a2.get(str4);
                        if (view4 != null) {
                            androidx.core.view.G.a(container, new Runnable() { // from class: androidx.fragment.app.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    X impl = X.this;
                                    Intrinsics.checkNotNullParameter(impl, "$impl");
                                    Rect lastInEpicenterRect = rect;
                                    Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
                                    View view5 = view4;
                                    impl.getClass();
                                    X.g(view5, lastInEpicenterRect);
                                }
                            });
                            x11.q(obj, view, arrayList2);
                            X x12 = this.f43066f;
                            Object obj3 = this.f43067g;
                            x12.m(obj3, null, null, obj3, arrayList);
                            z11 = z13;
                        }
                    }
                    z13 = z12;
                    x11.q(obj, view, arrayList2);
                    X x122 = this.f43066f;
                    Object obj32 = this.f43067g;
                    x122.m(obj32, null, null, obj32, arrayList);
                    z11 = z13;
                }
                arrayList7 = arrayList3;
                it2 = it;
                str2 = str;
                arrayList6 = arrayList5;
            }
            ArrayList arrayList10 = arrayList6;
            String str5 = str2;
            boolean z14 = z11;
            ArrayList arrayList11 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            Object obj4 = null;
            Object obj5 = null;
            while (it3.hasNext()) {
                h hVar2 = (h) it3.next();
                Iterator it4 = it3;
                f0.c a12 = hVar2.a();
                ArrayList<View> arrayList12 = arrayList2;
                Object f7 = x11.f(hVar2.f());
                if (f7 != null) {
                    ArrayList<View> arrayList13 = new ArrayList<>();
                    Object obj6 = obj;
                    View view5 = a12.h().mView;
                    Object obj7 = obj5;
                    Intrinsics.checkNotNullExpressionValue(view5, "operation.fragment.mView");
                    i(view5, arrayList13);
                    if (obj6 != null && (a12 == cVar2 || a12 == cVar)) {
                        if (a12 == cVar2) {
                            arrayList13.removeAll(C7714v.Y0(arrayList12));
                        } else {
                            arrayList13.removeAll(C7714v.Y0(arrayList));
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        x11.a(view, f7);
                        obj2 = f7;
                        arrayList4 = arrayList13;
                    } else {
                        x11.b(f7, arrayList13);
                        this.f43066f.m(f7, f7, arrayList13, null, null);
                        obj2 = f7;
                        arrayList4 = arrayList13;
                        if (a12.g() == f0.c.b.GONE) {
                            a12.q();
                            ArrayList<View> arrayList14 = new ArrayList<>(arrayList4);
                            arrayList14.remove(a12.h().mView);
                            x11.l(obj2, a12.h().mView, arrayList14);
                            androidx.core.view.G.a(container, new B90.c0(arrayList4, 3));
                        }
                    }
                    View view6 = view;
                    if (a12.g() == f0.c.b.VISIBLE) {
                        arrayList11.addAll(arrayList4);
                        if (z14) {
                            x11.o(obj2, rect);
                        }
                        if (G.D0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + obj2);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            Iterator<View> it5 = arrayList4.iterator();
                            while (it5.hasNext()) {
                                View transitioningViews = it5.next();
                                Intrinsics.checkNotNullExpressionValue(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + transitioningViews);
                            }
                        }
                    } else {
                        x11.n(view2, obj2);
                        if (G.D0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + obj2);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            Iterator<View> it6 = arrayList4.iterator();
                            while (it6.hasNext()) {
                                View transitioningViews2 = it6.next();
                                Intrinsics.checkNotNullExpressionValue(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + transitioningViews2);
                            }
                        }
                    }
                    if (hVar2.h()) {
                        obj4 = x11.k(obj4, obj2);
                        it3 = it4;
                        arrayList2 = arrayList12;
                        obj = obj6;
                        obj5 = obj7;
                    } else {
                        obj5 = x11.k(obj7, obj2);
                        it3 = it4;
                        arrayList2 = arrayList12;
                        obj = obj6;
                    }
                    view = view6;
                } else {
                    it3 = it4;
                    arrayList2 = arrayList12;
                }
            }
            Object j11 = x11.j(obj4, obj5, obj);
            if (G.D0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + j11 + " for container " + container);
            }
            Pair pair = new Pair(arrayList11, j11);
            ArrayList arrayList15 = (ArrayList) pair.a();
            Object b11 = pair.b();
            ArrayList arrayList16 = new ArrayList(C7714v.z(arrayList10, 10));
            Iterator it7 = arrayList10.iterator();
            while (it7.hasNext()) {
                arrayList16.add(((h) it7.next()).a());
            }
            Iterator it8 = arrayList16.iterator();
            while (it8.hasNext()) {
                final f0.c cVar3 = (f0.c) it8.next();
                cVar3.getClass();
                this.f43066f.p(b11, this.f43076p, new Runnable() { // from class: androidx.fragment.app.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        f0.c operation = f0.c.this;
                        Intrinsics.checkNotNullParameter(operation, "$operation");
                        C5385f.g this$0 = this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (G.D0(2)) {
                            Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                        }
                        operation.e(this$0);
                    }
                });
            }
            a aVar = new a(container, b11);
            S.d(4, arrayList15);
            X x13 = this.f43066f;
            x13.getClass();
            ArrayList arrayList17 = new ArrayList();
            ArrayList<View> arrayList18 = this.f43069i;
            int size = arrayList18.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view7 = arrayList18.get(i11);
                arrayList17.add(androidx.core.view.Y.o(view7));
                androidx.core.view.Y.O(view7, null);
            }
            boolean D02 = G.D0(2);
            ArrayList<View> arrayList19 = this.f43068h;
            if (D02) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator<View> it9 = arrayList19.iterator();
                while (it9.hasNext()) {
                    View sharedElementFirstOutViews = it9.next();
                    Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view8 = sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view8 + " Name: " + androidx.core.view.Y.o(view8));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                Iterator<View> it10 = arrayList18.iterator();
                while (it10.hasNext()) {
                    View sharedElementLastInViews = it10.next();
                    Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                    View view9 = sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view9 + " Name: " + androidx.core.view.Y.o(view9));
                }
            }
            aVar.invoke();
            int size2 = arrayList18.size();
            ArrayList arrayList20 = new ArrayList();
            for (int i12 = 0; i12 < size2; i12++) {
                View view10 = arrayList19.get(i12);
                String o11 = androidx.core.view.Y.o(view10);
                arrayList20.add(o11);
                if (o11 != null) {
                    androidx.core.view.Y.O(view10, null);
                    String str6 = this.f43070j.get(o11);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size2) {
                            break;
                        }
                        if (str6.equals(arrayList17.get(i13))) {
                            androidx.core.view.Y.O(arrayList18.get(i13), o11);
                            break;
                        }
                        i13++;
                    }
                }
            }
            androidx.core.view.G.a(container, new W(size2, arrayList18, arrayList17, arrayList19, arrayList20));
            S.d(0, arrayList15);
            x13.r(this.f43067g, arrayList19, arrayList18);
            if (G.D0(2)) {
                Log.v(str5, "Completed executing operations from " + cVar2 + " to " + cVar);
            }
        }

        @Override // androidx.fragment.app.f0.a
        public final void e(@NotNull C5035b backEvent, @NotNull ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
        }

        @Override // androidx.fragment.app.f0.a
        public final void f(@NotNull ViewGroup container) {
            boolean z11;
            Object obj;
            Intrinsics.checkNotNullParameter(container, "container");
            boolean isLaidOut = container.isLaidOut();
            ArrayList arrayList = this.f43063c;
            if (!isLaidOut) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f0.c a11 = ((h) it.next()).a();
                    if (G.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + a11);
                    }
                }
                return;
            }
            ArrayList arrayList2 = this.f43063c;
            if (arrayList2 == null || !arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (!((h) it2.next()).a().h().mTransitioning) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            if (z11 && (obj = this.f43067g) != null) {
                b();
                Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + this.f43064d + " and " + this.f43065e + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            b();
        }

        @NotNull
        public final X j() {
            return this.f43066f;
        }
    }

    /* renamed from: androidx.fragment.app.f$h */
    private static final class h extends C0787f {

        /* renamed from: b, reason: collision with root package name */
        private final Object f43081b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f43082c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f43083d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@NotNull f0.c operation, boolean z11, boolean z12) {
            super(operation);
            Object returnTransition;
            Intrinsics.checkNotNullParameter(operation, "operation");
            f0.c.b g10 = operation.g();
            f0.c.b bVar = f0.c.b.VISIBLE;
            if (g10 == bVar) {
                ComponentCallbacksC5392m h11 = operation.h();
                returnTransition = z11 ? h11.getReenterTransition() : h11.getEnterTransition();
            } else {
                ComponentCallbacksC5392m h12 = operation.h();
                returnTransition = z11 ? h12.getReturnTransition() : h12.getExitTransition();
            }
            this.f43081b = returnTransition;
            this.f43082c = operation.g() == bVar ? z11 ? operation.h().getAllowReturnTransitionOverlap() : operation.h().getAllowEnterTransitionOverlap() : true;
            this.f43083d = z12 ? z11 ? operation.h().getSharedElementReturnTransition() : operation.h().getSharedElementEnterTransition() : null;
        }

        private final X d(Object obj) {
            if (obj == null) {
                return null;
            }
            X x11 = S.f42989a;
            if (x11 != null && x11.e(obj)) {
                return x11;
            }
            X x12 = S.f42990b;
            if (x12 != null && x12.e(obj)) {
                return x12;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final X c() {
            Object obj = this.f43081b;
            X d11 = d(obj);
            Object obj2 = this.f43083d;
            X d12 = d(obj2);
            if (d11 == null || d12 == null || d11 == d12) {
                return d11 == null ? d12 : d11;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().h() + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final Object e() {
            return this.f43083d;
        }

        public final Object f() {
            return this.f43081b;
        }

        public final boolean g() {
            return this.f43083d != null;
        }

        public final boolean h() {
            return this.f43082c;
        }
    }

    private static void A(C5132a c5132a, View view) {
        String o11 = androidx.core.view.Y.o(view);
        if (o11 != null) {
            c5132a.put(o11, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View child = viewGroup.getChildAt(i11);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    A(c5132a, child);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // androidx.fragment.app.f0
    public final void d(@NotNull ArrayList operations, boolean z11) {
        X x11;
        Object obj;
        f0.c cVar;
        boolean z12;
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2;
        X x12;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i12;
        String b11;
        boolean z13 = z11;
        Intrinsics.checkNotNullParameter(operations, "operations");
        int i13 = 2;
        if (G.D0(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = operations.iterator();
        while (true) {
            x11 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            f0.c cVar2 = (f0.c) obj;
            f0.c.b.a aVar = f0.c.b.Companion;
            View view = cVar2.h().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            aVar.getClass();
            f0.c.b a11 = f0.c.b.a.a(view);
            f0.c.b bVar = f0.c.b.VISIBLE;
            if (a11 == bVar && cVar2.g() != bVar) {
                break;
            }
        }
        f0.c cVar3 = (f0.c) obj;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                cVar = 0;
                break;
            }
            cVar = listIterator.previous();
            f0.c cVar4 = (f0.c) cVar;
            f0.c.b.a aVar2 = f0.c.b.Companion;
            View view2 = cVar4.h().mView;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            aVar2.getClass();
            f0.c.b a12 = f0.c.b.a.a(view2);
            f0.c.b bVar2 = f0.c.b.VISIBLE;
            if (a12 != bVar2 && cVar4.g() == bVar2) {
                break;
            }
        }
        f0.c cVar5 = cVar;
        if (G.D0(2)) {
            Log.v("FragmentManager", "Executing operations from " + cVar3 + " to " + cVar5);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ComponentCallbacksC5392m h11 = ((f0.c) C7714v.X(operations)).h();
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            f0.c cVar6 = (f0.c) it2.next();
            cVar6.h().mAnimationInfo.f43139b = h11.mAnimationInfo.f43139b;
            cVar6.h().mAnimationInfo.f43140c = h11.mAnimationInfo.f43140c;
            cVar6.h().mAnimationInfo.f43141d = h11.mAnimationInfo.f43141d;
            cVar6.h().mAnimationInfo.f43142e = h11.mAnimationInfo.f43142e;
        }
        Iterator it3 = operations.iterator();
        while (true) {
            z12 = false;
            if (!it3.hasNext()) {
                break;
            }
            final f0.c cVar7 = (f0.c) it3.next();
            arrayList5.add(new b(cVar7, z13));
            arrayList6.add(new h(cVar7, z13, !z13 ? cVar7 != cVar5 : cVar7 != cVar3));
            cVar7.a(new Runnable() { // from class: androidx.fragment.app.d
                @Override // java.lang.Runnable
                public final void run() {
                    C5385f this$0 = C5385f.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    f0.c operation = cVar7;
                    Intrinsics.checkNotNullParameter(operation, "$operation");
                    this$0.c(operation);
                }
            });
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((h) next).b()) {
                arrayList7.add(next);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            if (((h) next2).c() != null) {
                arrayList8.add(next2);
            }
        }
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            h hVar = (h) it6.next();
            X c11 = hVar.c();
            if (x11 != null && c11 != x11) {
                StringBuilder sb2 = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb2.append(hVar.a().h());
                sb2.append(" returned Transition ");
                throw new IllegalArgumentException(T7.E.c(hVar.f(), " which uses a different Transition type than other Fragments.", sb2).toString());
            }
            x11 = c11;
        }
        if (x11 == null) {
            arrayList = arrayList5;
            i11 = 2;
        } else {
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            C5132a c5132a = new C5132a();
            ArrayList<String> arrayList11 = new ArrayList<>();
            ArrayList<String> arrayList12 = new ArrayList<>();
            C5132a c5132a2 = new C5132a();
            C5132a c5132a3 = new C5132a();
            Iterator it7 = arrayList8.iterator();
            arrayList = arrayList5;
            ArrayList arrayList13 = arrayList8;
            Object obj2 = null;
            while (it7.hasNext()) {
                h hVar2 = (h) it7.next();
                if (!hVar2.g() || cVar3 == null || cVar5 == null) {
                    arrayList2 = arrayList13;
                    x12 = x11;
                    arrayList3 = arrayList9;
                    arrayList4 = arrayList10;
                    i12 = i13;
                } else {
                    obj2 = x11.s(x11.f(hVar2.e()));
                    arrayList12 = cVar5.h().getSharedElementSourceNames();
                    Intrinsics.checkNotNullExpressionValue(arrayList12, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementSourceNames = cVar3.h().getSharedElementSourceNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = cVar3.h().getSharedElementTargetNames();
                    i12 = i13;
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    arrayList2 = arrayList13;
                    x12 = x11;
                    int i14 = 0;
                    while (i14 < size) {
                        ArrayList arrayList14 = arrayList9;
                        int indexOf = arrayList12.indexOf(sharedElementTargetNames.get(i14));
                        if (indexOf != -1) {
                            arrayList12.set(indexOf, sharedElementSourceNames.get(i14));
                        }
                        i14++;
                        arrayList9 = arrayList14;
                    }
                    arrayList3 = arrayList9;
                    arrayList11 = cVar5.h().getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(arrayList11, "lastIn.fragment.sharedElementTargetNames");
                    Pair pair = !z13 ? new Pair(cVar3.h().getExitTransitionCallback(), cVar5.h().getEnterTransitionCallback()) : new Pair(cVar3.h().getEnterTransitionCallback(), cVar5.h().getExitTransitionCallback());
                    androidx.core.app.u uVar = (androidx.core.app.u) pair.a();
                    androidx.core.app.u uVar2 = (androidx.core.app.u) pair.b();
                    int size2 = arrayList12.size();
                    int i15 = 0;
                    while (true) {
                        arrayList4 = arrayList10;
                        if (i15 >= size2) {
                            break;
                        }
                        int i16 = size2;
                        String str = arrayList12.get(i15);
                        Intrinsics.checkNotNullExpressionValue(str, "exitingNames[i]");
                        String str2 = arrayList11.get(i15);
                        Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[i]");
                        c5132a.put(str, str2);
                        i15++;
                        arrayList10 = arrayList4;
                        size2 = i16;
                    }
                    if (G.D0(i12)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        Iterator<String> it8 = arrayList11.iterator();
                        while (true) {
                            Iterator<String> it9 = it8;
                            if (!it8.hasNext()) {
                                break;
                            }
                            Log.v("FragmentManager", "Name: " + it9.next());
                            it8 = it9;
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (Iterator<String> it10 = arrayList12.iterator(); it10.hasNext(); it10 = it10) {
                            Log.v("FragmentManager", "Name: " + it10.next());
                        }
                    }
                    View view3 = cVar3.h().mView;
                    Intrinsics.checkNotNullExpressionValue(view3, "firstOut.fragment.mView");
                    A(c5132a2, view3);
                    c5132a2.q(arrayList12);
                    if (uVar != null) {
                        if (G.D0(i12)) {
                            Log.v("FragmentManager", "Executing exit callback for operation " + cVar3);
                        }
                        uVar.onMapSharedElements(arrayList12, c5132a2);
                        int size3 = arrayList12.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i17 = size3 - 1;
                                String str3 = arrayList12.get(size3);
                                Intrinsics.checkNotNullExpressionValue(str3, "exitingNames[i]");
                                String str4 = str3;
                                View view4 = (View) c5132a2.get(str4);
                                if (view4 == null) {
                                    c5132a.remove(str4);
                                } else if (!Intrinsics.d(str4, androidx.core.view.Y.o(view4))) {
                                    c5132a.put(androidx.core.view.Y.o(view4), (String) c5132a.remove(str4));
                                }
                                if (i17 < 0) {
                                    break;
                                } else {
                                    size3 = i17;
                                }
                            }
                        }
                    } else {
                        c5132a.q(c5132a2.keySet());
                    }
                    View view5 = cVar5.h().mView;
                    Intrinsics.checkNotNullExpressionValue(view5, "lastIn.fragment.mView");
                    A(c5132a3, view5);
                    c5132a3.q(arrayList11);
                    c5132a3.q(c5132a.values());
                    if (uVar2 != null) {
                        if (G.D0(i12)) {
                            Log.v("FragmentManager", "Executing enter callback for operation " + cVar5);
                        }
                        uVar2.onMapSharedElements(arrayList11, c5132a3);
                        int size4 = arrayList11.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i18 = size4 - 1;
                                String str5 = arrayList11.get(size4);
                                Intrinsics.checkNotNullExpressionValue(str5, "enteringNames[i]");
                                String str6 = str5;
                                View view6 = (View) c5132a3.get(str6);
                                if (view6 == null) {
                                    String b12 = S.b(c5132a, str6);
                                    if (b12 != null) {
                                        c5132a.remove(b12);
                                    }
                                } else if (!Intrinsics.d(str6, androidx.core.view.Y.o(view6)) && (b11 = S.b(c5132a, str6)) != null) {
                                    c5132a.put(b11, androidx.core.view.Y.o(view6));
                                }
                                if (i18 < 0) {
                                    break;
                                } else {
                                    size4 = i18;
                                }
                            }
                        }
                    } else {
                        S.c(c5132a, c5132a3);
                    }
                    Set keySet = c5132a.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "sharedElementNameMapping.keys");
                    Set entries = c5132a2.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entries, "entries");
                    kotlin.collections.C.i(entries, new C5389j(keySet));
                    Collection values = c5132a.values();
                    Intrinsics.checkNotNullExpressionValue(values, "sharedElementNameMapping.values");
                    Set entries2 = c5132a3.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entries2, "entries");
                    kotlin.collections.C.i(entries2, new C5389j(values));
                    if (c5132a.isEmpty()) {
                        Log.i("FragmentManager", "Ignoring shared elements transition " + obj2 + " between " + cVar3 + " and " + cVar5 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                        arrayList3.clear();
                        arrayList4.clear();
                        z13 = z11;
                        i13 = i12;
                        arrayList13 = arrayList2;
                        x11 = x12;
                        arrayList9 = arrayList3;
                        arrayList10 = arrayList4;
                        obj2 = null;
                    }
                }
                z13 = z11;
                i13 = i12;
                arrayList13 = arrayList2;
                x11 = x12;
                arrayList9 = arrayList3;
                arrayList10 = arrayList4;
            }
            ArrayList arrayList15 = arrayList13;
            X x13 = x11;
            ArrayList arrayList16 = arrayList9;
            ArrayList arrayList17 = arrayList10;
            i11 = i13;
            if (obj2 == null) {
                if (!arrayList15.isEmpty()) {
                    Iterator it11 = arrayList15.iterator();
                    while (it11.hasNext()) {
                        if (((h) it11.next()).f() == null) {
                        }
                    }
                }
            }
            g gVar = new g(arrayList15, cVar3, cVar5, x13, obj2, arrayList16, arrayList17, c5132a, arrayList11, arrayList12, c5132a2, c5132a3, z11);
            Iterator it12 = arrayList15.iterator();
            while (it12.hasNext()) {
                ((h) it12.next()).a().b(gVar);
            }
        }
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        Iterator it13 = arrayList.iterator();
        while (it13.hasNext()) {
            C7714v.p(((b) it13.next()).a().f(), arrayList19);
        }
        boolean isEmpty = arrayList19.isEmpty();
        Iterator it14 = arrayList.iterator();
        while (it14.hasNext()) {
            b bVar3 = (b) it14.next();
            Context context = r().getContext();
            f0.c a13 = bVar3.a();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            C5397s.a c12 = bVar3.c(context);
            if (c12 != null) {
                if (c12.f43166b == null) {
                    arrayList18.add(bVar3);
                } else {
                    ComponentCallbacksC5392m h12 = a13.h();
                    if (a13.f().isEmpty()) {
                        if (a13.g() == f0.c.b.GONE) {
                            a13.q();
                        }
                        a13.b(new c(bVar3));
                        z12 = true;
                    } else if (G.D0(i11)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + h12 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        Iterator it15 = arrayList18.iterator();
        while (it15.hasNext()) {
            b bVar4 = (b) it15.next();
            f0.c a14 = bVar4.a();
            ComponentCallbacksC5392m h13 = a14.h();
            if (isEmpty) {
                if (!z12) {
                    a14.b(new a(bVar4));
                } else if (G.D0(i11)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + h13 + " as Animations cannot run alongside Animators.");
                }
            } else if (G.D0(i11)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + h13 + " as Animations cannot run alongside Transitions.");
            }
        }
    }
}
