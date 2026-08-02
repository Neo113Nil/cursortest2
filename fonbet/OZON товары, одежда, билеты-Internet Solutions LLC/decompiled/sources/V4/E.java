package V4;

import V4.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.HashMap;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public abstract class E extends l {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f27988b = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: a, reason: collision with root package name */
    private int f27989a = 3;

    private static class a extends AnimatorListenerAdapter implements l.f {

        /* renamed from: a, reason: collision with root package name */
        private final View f27990a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27991b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f27992c;

        /* renamed from: e, reason: collision with root package name */
        private boolean f27994e;

        /* renamed from: f, reason: collision with root package name */
        boolean f27995f = false;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27993d = true;

        a(View view, int i11) {
            this.f27990a = view;
            this.f27991b = i11;
            this.f27992c = (ViewGroup) view.getParent();
            a(true);
        }

        private void a(boolean z11) {
            ViewGroup viewGroup;
            if (!this.f27993d || this.f27994e == z11 || (viewGroup = this.f27992c) == null) {
                return;
            }
            this.f27994e = z11;
            w.a(viewGroup, z11);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f27995f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f27995f) {
                y.f(this.f27991b, this.f27990a);
                ViewGroup viewGroup = this.f27992c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (this.f27995f) {
                return;
            }
            y.f(this.f27991b, this.f27990a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (this.f27995f) {
                return;
            }
            y.f(0, this.f27990a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // V4.l.f
        public final void onTransitionCancel(@NonNull l lVar) {
        }

        @Override // V4.l.f
        public final void onTransitionEnd(@NonNull l lVar) {
            if (!this.f27995f) {
                y.f(this.f27991b, this.f27990a);
                ViewGroup viewGroup = this.f27992c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
            lVar.removeListener(this);
        }

        @Override // V4.l.f
        public final void onTransitionPause(@NonNull l lVar) {
            a(false);
        }

        @Override // V4.l.f
        public final void onTransitionResume(@NonNull l lVar) {
            a(true);
        }

        @Override // V4.l.f
        public final void onTransitionStart(@NonNull l lVar) {
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        boolean f27996a;

        /* renamed from: b, reason: collision with root package name */
        boolean f27997b;

        /* renamed from: c, reason: collision with root package name */
        int f27998c;

        /* renamed from: d, reason: collision with root package name */
        int f27999d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f28000e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f28001f;
    }

    private static void a(s sVar) {
        int visibility = sVar.f28063b.getVisibility();
        HashMap hashMap = sVar.f28062a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = sVar.f28063b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static b b(s sVar, s sVar2) {
        b bVar = new b();
        bVar.f27996a = false;
        bVar.f27997b = false;
        if (sVar != null) {
            HashMap hashMap = sVar.f28062a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                bVar.f27998c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                bVar.f28000e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (sVar2 != null) {
                    HashMap hashMap2 = sVar2.f28062a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        bVar.f27999d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        bVar.f28001f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (sVar == null && sVar2 != null) {
                            int i11 = bVar.f27998c;
                            int i12 = bVar.f27999d;
                            if (i11 != i12 || bVar.f28000e != bVar.f28001f) {
                                if (i11 != i12) {
                                    if (i11 == 0) {
                                        bVar.f27997b = false;
                                        bVar.f27996a = true;
                                        return bVar;
                                    }
                                    if (i12 == 0) {
                                        bVar.f27997b = true;
                                        bVar.f27996a = true;
                                        return bVar;
                                    }
                                } else {
                                    if (bVar.f28001f == null) {
                                        bVar.f27997b = false;
                                        bVar.f27996a = true;
                                        return bVar;
                                    }
                                    if (bVar.f28000e == null) {
                                        bVar.f27997b = true;
                                        bVar.f27996a = true;
                                        return bVar;
                                    }
                                }
                            }
                        } else {
                            if (sVar != null && bVar.f27999d == 0) {
                                bVar.f27997b = true;
                                bVar.f27996a = true;
                                return bVar;
                            }
                            if (sVar2 == null && bVar.f27998c == 0) {
                                bVar.f27997b = false;
                                bVar.f27996a = true;
                            }
                        }
                        return bVar;
                    }
                }
                bVar.f27999d = -1;
                bVar.f28001f = null;
                if (sVar == null) {
                }
                if (sVar != null) {
                }
                if (sVar2 == null) {
                    bVar.f27997b = false;
                    bVar.f27996a = true;
                }
                return bVar;
            }
        }
        bVar.f27998c = -1;
        bVar.f28000e = null;
        if (sVar2 != null) {
        }
        bVar.f27999d = -1;
        bVar.f28001f = null;
        if (sVar == null) {
        }
        if (sVar != null) {
        }
        if (sVar2 == null) {
        }
        return bVar;
    }

    public abstract ObjectAnimator c(View view, s sVar);

    @Override // V4.l
    public final void captureEndValues(@NonNull s sVar) {
        a(sVar);
    }

    @Override // V4.l
    public void captureStartValues(@NonNull s sVar) {
        a(sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (b(getMatchedTransitionValues(r14, false), getTransitionValues(r14, false)).f27996a != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c6, code lost:
    
        if (r11.mCanRemoveViews != false) goto L63;
     */
    @Override // V4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator createAnimator(@NonNull ViewGroup viewGroup, s sVar, s sVar2) {
        View view;
        boolean z11;
        View view2;
        boolean z12;
        b b11 = b(sVar, sVar2);
        if (b11.f27996a && (b11.f28000e != null || b11.f28001f != null)) {
            if (!b11.f27997b) {
                int i11 = b11.f27999d;
                if ((this.f27989a & 2) == 2 && sVar != null) {
                    View view3 = sVar2 != null ? sVar2.f28063b : null;
                    View view4 = sVar.f28063b;
                    View view5 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view5 != null) {
                        view2 = null;
                        z12 = true;
                    } else {
                        if (view3 == null || view3.getParent() == null) {
                            if (view3 != null) {
                                view = null;
                                z11 = false;
                            }
                            view3 = null;
                            view = null;
                            z11 = true;
                        } else {
                            if (i11 == 4 || view4 == view3) {
                                view = view3;
                                view3 = null;
                                z11 = false;
                            }
                            view3 = null;
                            view = null;
                            z11 = true;
                        }
                        if (z11) {
                            if (view4.getParent() != null) {
                                if (view4.getParent() instanceof View) {
                                    View view6 = (View) view4.getParent();
                                    if (b(getTransitionValues(view6, true), getMatchedTransitionValues(view6, true)).f27996a) {
                                        int id2 = view6.getId();
                                        if (view6.getParent() == null) {
                                            if (id2 != -1) {
                                                if (viewGroup.findViewById(id2) != null) {
                                                }
                                            }
                                        }
                                    } else {
                                        view3 = r.a(viewGroup, view4, view6);
                                    }
                                }
                            }
                            z12 = false;
                            view2 = view;
                            view5 = view4;
                        }
                        View view7 = view;
                        view5 = view3;
                        view2 = view7;
                        z12 = false;
                    }
                    if (view5 != null) {
                        if (!z12) {
                            int[] iArr = (int[]) sVar.f28062a.get("android:visibility:screenLocation");
                            int i12 = iArr[0];
                            int i13 = iArr[1];
                            int[] iArr2 = new int[2];
                            viewGroup.getLocationOnScreen(iArr2);
                            view5.offsetLeftAndRight((i12 - iArr2[0]) - view5.getLeft());
                            view5.offsetTopAndBottom((i13 - iArr2[1]) - view5.getTop());
                            new u(viewGroup).a(view5);
                        }
                        ObjectAnimator d11 = d(view5, sVar);
                        if (!z12) {
                            if (d11 == null) {
                                new u(viewGroup).b(view5);
                                return d11;
                            }
                            view4.setTag(R.id.save_overlay_view, view5);
                            addListener(new D(this, viewGroup, view5, view4));
                        }
                        return d11;
                    }
                    if (view2 != null) {
                        int visibility = view2.getVisibility();
                        y.f(0, view2);
                        ObjectAnimator d12 = d(view2, sVar);
                        if (d12 == null) {
                            y.f(visibility, view2);
                            return d12;
                        }
                        a aVar = new a(view2, i11);
                        d12.addListener(aVar);
                        d12.addPauseListener(aVar);
                        addListener(aVar);
                        return d12;
                    }
                }
            } else if ((this.f27989a & 1) == 1 && sVar2 != null) {
                View view8 = sVar2.f28063b;
                if (sVar == null) {
                    View view9 = (View) view8.getParent();
                }
                return c(view8, sVar);
            }
        }
        return null;
    }

    public abstract ObjectAnimator d(View view, s sVar);

    public final void e(int i11) {
        this.f27989a = i11;
    }

    @Override // V4.l
    public final String[] getTransitionProperties() {
        return f27988b;
    }

    @Override // V4.l
    public final boolean isTransitionRequired(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f28062a.containsKey("android:visibility:visibility") != sVar.f28062a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b b11 = b(sVar, sVar2);
        if (b11.f27996a) {
            return b11.f27998c == 0 || b11.f27999d == 0;
        }
        return false;
    }
}
