package androidx.fragment.app;

/* loaded from: classes2.dex */
class DefaultSpecialEffectsController extends androidx.fragment.app.SpecialEffectsController {
    DefaultSpecialEffectsController(android.view.ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    void executeOperations(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> list, boolean z) {
        androidx.fragment.app.SpecialEffectsController.Operation operation = null;
        androidx.fragment.app.SpecialEffectsController.Operation operation2 = null;
        for (androidx.fragment.app.SpecialEffectsController.Operation operation3 : list) {
            androidx.fragment.app.SpecialEffectsController.Operation.State from = androidx.fragment.app.SpecialEffectsController.Operation.State.from(operation3.getFragment().mView);
            int i = androidx.fragment.app.DefaultSpecialEffectsController.AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[operation3.getFinalState().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (from == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = operation3;
                }
            } else if (i == 4 && from != androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = operation3;
            }
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Executing operations from " + operation + " to " + operation2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        final java.util.ArrayList arrayList3 = new java.util.ArrayList(list);
        syncAnimations(list);
        for (final androidx.fragment.app.SpecialEffectsController.Operation operation4 : list) {
            androidx.core.os.CancellationSignal cancellationSignal = new androidx.core.os.CancellationSignal();
            operation4.markStartedSpecialEffect(cancellationSignal);
            arrayList.add(new androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo(operation4, cancellationSignal, z));
            androidx.core.os.CancellationSignal cancellationSignal2 = new androidx.core.os.CancellationSignal();
            operation4.markStartedSpecialEffect(cancellationSignal2);
            boolean z2 = false;
            if (z) {
                if (operation4 != operation) {
                    arrayList2.add(new androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo(operation4, cancellationSignal2, z, z2));
                    operation4.addCompletionListener(new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (arrayList3.contains(operation4)) {
                                arrayList3.remove(operation4);
                                androidx.fragment.app.DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                            }
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo(operation4, cancellationSignal2, z, z2));
                operation4.addCompletionListener(new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (arrayList3.contains(operation4)) {
                            arrayList3.remove(operation4);
                            androidx.fragment.app.DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                        }
                    }
                });
            } else {
                if (operation4 != operation2) {
                    arrayList2.add(new androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo(operation4, cancellationSignal2, z, z2));
                    operation4.addCompletionListener(new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (arrayList3.contains(operation4)) {
                                arrayList3.remove(operation4);
                                androidx.fragment.app.DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                            }
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo(operation4, cancellationSignal2, z, z2));
                operation4.addCompletionListener(new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (arrayList3.contains(operation4)) {
                            arrayList3.remove(operation4);
                            androidx.fragment.app.DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                        }
                    }
                });
            }
        }
        java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> startTransitions = startTransitions(arrayList2, arrayList3, z, operation, operation2);
        startAnimations(arrayList, arrayList3, startTransitions.containsValue(true), startTransitions);
        java.util.Iterator<androidx.fragment.app.SpecialEffectsController.Operation> it = arrayList3.iterator();
        while (it.hasNext()) {
            applyContainerChanges(it.next());
        }
        arrayList3.clear();
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Completed executing operations from " + operation + " to " + operation2);
        }
    }

    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State;

        static {
            int[] iArr = new int[androidx.fragment.app.SpecialEffectsController.Operation.State.values().length];
            $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = iArr;
            try {
                iArr[androidx.fragment.app.SpecialEffectsController.Operation.State.GONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private void syncAnimations(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> list) {
        androidx.fragment.app.Fragment fragment = list.get(list.size() - 1).getFragment();
        for (androidx.fragment.app.SpecialEffectsController.Operation operation : list) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    private void startAnimations(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> list, java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> list2, boolean z, java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> map) {
        int i;
        boolean z2;
        android.content.Context context;
        android.view.View view;
        final androidx.fragment.app.SpecialEffectsController.Operation operation;
        final android.view.ViewGroup container = getContainer();
        android.content.Context context2 = container.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> it = list.iterator();
        boolean z3 = false;
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo next = it.next();
            if (next.isVisibilityUnchanged()) {
                next.completeSpecialEffect();
            } else {
                androidx.fragment.app.FragmentAnim.AnimationOrAnimator animation = next.getAnimation(context2);
                if (animation == null) {
                    next.completeSpecialEffect();
                } else {
                    final android.animation.Animator animator = animation.animator;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        final androidx.fragment.app.SpecialEffectsController.Operation operation2 = next.getOperation();
                        androidx.fragment.app.Fragment fragment = operation2.getFragment();
                        if (java.lang.Boolean.TRUE.equals(map.get(operation2))) {
                            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            next.completeSpecialEffect();
                        } else {
                            boolean z4 = operation2.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.GONE;
                            if (z4) {
                                list2.remove(operation2);
                            }
                            final android.view.View view2 = fragment.mView;
                            container.startViewTransition(view2);
                            final boolean z5 = z4;
                            animator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.2
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(android.animation.Animator animator2) {
                                    container.endViewTransition(view2);
                                    if (z5) {
                                        operation2.getFinalState().applyState(view2);
                                    }
                                    next.completeSpecialEffect();
                                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                        android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Animator from operation " + operation2 + " has ended.");
                                    }
                                }
                            });
                            animator.setTarget(view2);
                            animator.start();
                            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Animator from operation ");
                                operation = operation2;
                                sb.append(operation);
                                sb.append(" has started.");
                                android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, sb.toString());
                            } else {
                                operation = operation2;
                            }
                            next.getSignal().setOnCancelListener(new androidx.core.os.CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.3
                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public void onCancel() {
                                    animator.end();
                                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                        android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Animator from operation " + operation + " has been canceled.");
                                    }
                                }
                            });
                            z3 = true;
                        }
                    }
                }
            }
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo animationInfo = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) it2.next();
            final androidx.fragment.app.SpecialEffectsController.Operation operation3 = animationInfo.getOperation();
            androidx.fragment.app.Fragment fragment2 = operation3.getFragment();
            if (z) {
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(i)) {
                    android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                animationInfo.completeSpecialEffect();
            } else if (z3) {
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(i)) {
                    android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                animationInfo.completeSpecialEffect();
            } else {
                final android.view.View view3 = fragment2.mView;
                android.view.animation.Animation animation2 = (android.view.animation.Animation) androidx.core.util.Preconditions.checkNotNull(((androidx.fragment.app.FragmentAnim.AnimationOrAnimator) androidx.core.util.Preconditions.checkNotNull(animationInfo.getAnimation(context2))).animation);
                if (operation3.getFinalState() != androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED) {
                    view3.startAnimation(animation2);
                    animationInfo.completeSpecialEffect();
                    z2 = z3;
                    context = context2;
                    view = view3;
                } else {
                    container.startViewTransition(view3);
                    androidx.fragment.app.FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new androidx.fragment.app.FragmentAnim.EndViewTransitionAnimation(animation2, container, view3);
                    z2 = z3;
                    context = context2;
                    view = view3;
                    endViewTransitionAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(android.view.animation.Animation animation3) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(android.view.animation.Animation animation3) {
                            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Animation from operation " + operation3 + " has reached onAnimationStart.");
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(android.view.animation.Animation animation3) {
                            container.post(new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    container.endViewTransition(view3);
                                    animationInfo.completeSpecialEffect();
                                }
                            });
                            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Animation from operation " + operation3 + " has ended.");
                            }
                        }
                    });
                    view.startAnimation(endViewTransitionAnimation);
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Animation from operation " + operation3 + " has started.");
                    }
                }
                final android.view.View view4 = view;
                animationInfo.getSignal().setOnCancelListener(new androidx.core.os.CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.5
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public void onCancel() {
                        view4.clearAnimation();
                        container.endViewTransition(view4);
                        animationInfo.completeSpecialEffect();
                        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                            android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Animation from operation " + operation3 + " has been cancelled.");
                        }
                    }
                });
                z3 = z2;
                context2 = context;
                i = 2;
            }
        }
    }

    private java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> startTransitions(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> list, java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> list2, final boolean z, final androidx.fragment.app.SpecialEffectsController.Operation operation, final androidx.fragment.app.SpecialEffectsController.Operation operation2) {
        java.lang.String str;
        java.lang.String str2;
        android.view.View view;
        java.util.ArrayList<android.view.View> arrayList;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String str3;
        java.util.ArrayList<android.view.View> arrayList2;
        androidx.fragment.app.SpecialEffectsController.Operation operation3;
        android.view.View view2;
        androidx.collection.ArrayMap arrayMap;
        androidx.fragment.app.SpecialEffectsController.Operation operation4;
        androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl;
        java.util.ArrayList<android.view.View> arrayList3;
        java.util.ArrayList<android.view.View> arrayList4;
        android.graphics.Rect rect;
        android.view.View view3;
        androidx.core.app.SharedElementCallback enterTransitionCallback;
        androidx.core.app.SharedElementCallback exitTransitionCallback;
        java.util.ArrayList<java.lang.String> arrayList5;
        int i;
        final android.graphics.Rect rect2;
        android.view.View view4;
        final android.view.View view5;
        java.lang.String findKeyForValue;
        java.util.ArrayList<java.lang.String> arrayList6;
        boolean z2 = z;
        androidx.fragment.app.SpecialEffectsController.Operation operation5 = operation;
        androidx.fragment.app.SpecialEffectsController.Operation operation6 = operation2;
        java.util.HashMap hashMap = new java.util.HashMap();
        final androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl2 = null;
        for (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo transitionInfo : list) {
            if (!transitionInfo.isVisibilityUnchanged()) {
                androidx.fragment.app.FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
                if (fragmentTransitionImpl2 == null) {
                    fragmentTransitionImpl2 = handlingImpl;
                } else if (handlingImpl != null && fragmentTransitionImpl2 != handlingImpl) {
                    throw new java.lang.IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (fragmentTransitionImpl2 == null) {
            for (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo transitionInfo2 : list) {
                hashMap.put(transitionInfo2.getOperation(), false);
                transitionInfo2.completeSpecialEffect();
            }
            return hashMap;
        }
        android.view.View view6 = new android.view.View(getContainer().getContext());
        android.graphics.Rect rect3 = new android.graphics.Rect();
        java.util.ArrayList<android.view.View> arrayList7 = new java.util.ArrayList<>();
        java.util.ArrayList<android.view.View> arrayList8 = new java.util.ArrayList<>();
        androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap();
        java.util.Iterator<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> it = list.iterator();
        java.lang.Object obj3 = null;
        android.view.View view7 = null;
        boolean z3 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            str = androidx.fragment.app.FragmentManager.TAG;
            if (!hasNext) {
                break;
            }
            androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo next = it.next();
            if (!next.hasSharedElementTransition() || operation5 == null || operation6 == null) {
                arrayMap = arrayMap2;
                operation4 = operation6;
                fragmentTransitionImpl = fragmentTransitionImpl2;
                arrayList3 = arrayList8;
                arrayList4 = arrayList7;
                rect = rect3;
                view3 = view6;
                view7 = view7;
            } else {
                java.lang.Object wrapTransitionInSet = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(next.getSharedElementTransition()));
                java.util.ArrayList<java.lang.String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                java.util.ArrayList<java.lang.String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                java.util.ArrayList<java.lang.String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                android.view.View view8 = view7;
                java.util.HashMap hashMap2 = hashMap;
                int i2 = 0;
                while (i2 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                    java.util.ArrayList<java.lang.String> arrayList9 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i2));
                    }
                    i2++;
                    sharedElementTargetNames = arrayList9;
                }
                java.util.ArrayList<java.lang.String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                if (!z2) {
                    enterTransitionCallback = operation.getFragment().getExitTransitionCallback();
                    exitTransitionCallback = operation2.getFragment().getEnterTransitionCallback();
                } else {
                    enterTransitionCallback = operation.getFragment().getEnterTransitionCallback();
                    exitTransitionCallback = operation2.getFragment().getExitTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                android.view.View view9 = view6;
                int i3 = 0;
                while (i3 < size) {
                    arrayMap2.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    i3++;
                    size = size;
                    rect3 = rect3;
                }
                android.graphics.Rect rect4 = rect3;
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, ">>> entering view names <<<");
                    for (java.util.Iterator<java.lang.String> it2 = sharedElementTargetNames2.iterator(); it2.hasNext(); it2 = it2) {
                        android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Name: " + it2.next());
                    }
                    android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, ">>> exiting view names <<<");
                    for (java.util.Iterator<java.lang.String> it3 = sharedElementSourceNames.iterator(); it3.hasNext(); it3 = it3) {
                        android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Name: " + it3.next());
                    }
                }
                androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap3 = new androidx.collection.ArrayMap<>();
                findNamedViews(arrayMap3, operation.getFragment().mView);
                arrayMap3.retainAll(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Executing exit callback for operation " + operation5);
                    }
                    enterTransitionCallback.onMapSharedElements(sharedElementSourceNames, arrayMap3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        java.lang.String str4 = sharedElementSourceNames.get(size2);
                        android.view.View view10 = arrayMap3.get(str4);
                        if (view10 == null) {
                            arrayMap2.remove(str4);
                            arrayList6 = sharedElementSourceNames;
                        } else {
                            arrayList6 = sharedElementSourceNames;
                            if (!str4.equals(androidx.core.view.ViewCompat.getTransitionName(view10))) {
                                arrayMap2.put(androidx.core.view.ViewCompat.getTransitionName(view10), (java.lang.String) arrayMap2.remove(str4));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList6;
                    }
                    arrayList5 = sharedElementSourceNames;
                } else {
                    arrayList5 = sharedElementSourceNames;
                    arrayMap2.retainAll(arrayMap3.keySet());
                }
                final androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap4 = new androidx.collection.ArrayMap<>();
                findNamedViews(arrayMap4, operation2.getFragment().mView);
                arrayMap4.retainAll(sharedElementTargetNames2);
                arrayMap4.retainAll(arrayMap2.values());
                if (exitTransitionCallback != null) {
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Executing enter callback for operation " + operation6);
                    }
                    exitTransitionCallback.onMapSharedElements(sharedElementTargetNames2, arrayMap4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        java.lang.String str5 = sharedElementTargetNames2.get(size3);
                        android.view.View view11 = arrayMap4.get(str5);
                        if (view11 == null) {
                            java.lang.String findKeyForValue2 = androidx.fragment.app.FragmentTransition.findKeyForValue(arrayMap2, str5);
                            if (findKeyForValue2 != null) {
                                arrayMap2.remove(findKeyForValue2);
                            }
                        } else if (!str5.equals(androidx.core.view.ViewCompat.getTransitionName(view11)) && (findKeyForValue = androidx.fragment.app.FragmentTransition.findKeyForValue(arrayMap2, str5)) != null) {
                            arrayMap2.put(findKeyForValue, androidx.core.view.ViewCompat.getTransitionName(view11));
                        }
                    }
                } else {
                    androidx.fragment.app.FragmentTransition.retainValues(arrayMap2, arrayMap4);
                }
                retainMatchingViews(arrayMap3, arrayMap2.keySet());
                retainMatchingViews(arrayMap4, arrayMap2.values());
                if (arrayMap2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    arrayMap = arrayMap2;
                    operation4 = operation6;
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    view7 = view8;
                    hashMap = hashMap2;
                    obj3 = null;
                    arrayList3 = arrayList8;
                    arrayList4 = arrayList7;
                    view3 = view9;
                    rect = rect4;
                } else {
                    androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z2, arrayMap3, true);
                    arrayMap = arrayMap2;
                    arrayList3 = arrayList8;
                    java.util.ArrayList<android.view.View> arrayList10 = arrayList7;
                    androidx.core.view.OneShotPreDrawListener.add(getContainer(), new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.6
                        @Override // java.lang.Runnable
                        public void run() {
                            androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z, arrayMap4, false);
                        }
                    });
                    arrayList10.addAll(arrayMap3.values());
                    if (arrayList5.isEmpty()) {
                        i = 0;
                        view7 = view8;
                    } else {
                        i = 0;
                        android.view.View view12 = arrayMap3.get(arrayList5.get(0));
                        fragmentTransitionImpl2.setEpicenter(wrapTransitionInSet, view12);
                        view7 = view12;
                    }
                    arrayList3.addAll(arrayMap4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view5 = arrayMap4.get(sharedElementTargetNames2.get(i))) == null) {
                        rect2 = rect4;
                        view4 = view9;
                    } else {
                        rect2 = rect4;
                        androidx.core.view.OneShotPreDrawListener.add(getContainer(), new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.7
                            @Override // java.lang.Runnable
                            public void run() {
                                fragmentTransitionImpl2.getBoundsOnScreen(view5, rect2);
                            }
                        });
                        view4 = view9;
                        z3 = true;
                    }
                    fragmentTransitionImpl2.setSharedElementTargets(wrapTransitionInSet, view4, arrayList10);
                    rect = rect2;
                    view3 = view4;
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    fragmentTransitionImpl2.scheduleRemoveTargets(wrapTransitionInSet, null, null, null, null, wrapTransitionInSet, arrayList3);
                    arrayList4 = arrayList10;
                    hashMap = hashMap2;
                    operation5 = operation;
                    hashMap.put(operation5, true);
                    operation4 = operation2;
                    hashMap.put(operation4, true);
                    obj3 = wrapTransitionInSet;
                }
            }
            z2 = z;
            rect3 = rect;
            view6 = view3;
            arrayList8 = arrayList3;
            arrayList7 = arrayList4;
            operation6 = operation4;
            fragmentTransitionImpl2 = fragmentTransitionImpl;
            arrayMap2 = arrayMap;
        }
        android.view.View view13 = view7;
        androidx.collection.ArrayMap arrayMap5 = arrayMap2;
        androidx.fragment.app.SpecialEffectsController.Operation operation7 = operation6;
        androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
        boolean z4 = false;
        java.util.ArrayList<android.view.View> arrayList11 = arrayList8;
        java.util.ArrayList<android.view.View> arrayList12 = arrayList7;
        android.graphics.Rect rect5 = rect3;
        android.view.View view14 = view6;
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        java.util.Iterator<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> it4 = list.iterator();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = null;
        while (it4.hasNext()) {
            androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo next2 = it4.next();
            if (next2.isVisibilityUnchanged()) {
                hashMap.put(next2.getOperation(), java.lang.Boolean.valueOf(z4));
                next2.completeSpecialEffect();
                it4 = it4;
                obj4 = obj4;
            } else {
                java.util.Iterator<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> it5 = it4;
                java.lang.Object obj6 = obj4;
                java.lang.Object cloneTransition = fragmentTransitionImpl3.cloneTransition(next2.getTransition());
                androidx.fragment.app.SpecialEffectsController.Operation operation8 = next2.getOperation();
                boolean z5 = obj3 != null && (operation8 == operation5 || operation8 == operation7);
                if (cloneTransition == null) {
                    if (!z5) {
                        hashMap.put(operation8, java.lang.Boolean.valueOf(z4));
                        next2.completeSpecialEffect();
                    }
                    view = view14;
                    arrayList = arrayList11;
                    obj2 = obj5;
                    str3 = str;
                    arrayList2 = arrayList12;
                    view2 = view13;
                } else {
                    final java.util.ArrayList<android.view.View> arrayList14 = new java.util.ArrayList<>();
                    java.lang.Object obj7 = obj5;
                    captureTransitioningViews(arrayList14, operation8.getFragment().mView);
                    if (z5) {
                        if (operation8 == operation5) {
                            arrayList14.removeAll(arrayList12);
                        } else {
                            arrayList14.removeAll(arrayList11);
                        }
                    }
                    if (arrayList14.isEmpty()) {
                        fragmentTransitionImpl3.addTarget(cloneTransition, view14);
                        view = view14;
                        arrayList = arrayList11;
                        operation3 = operation8;
                        str3 = str;
                        arrayList2 = arrayList12;
                        obj = obj6;
                        obj2 = obj7;
                    } else {
                        fragmentTransitionImpl3.addTargets(cloneTransition, arrayList14);
                        view = view14;
                        arrayList = arrayList11;
                        obj = obj6;
                        obj2 = obj7;
                        str3 = str;
                        arrayList2 = arrayList12;
                        fragmentTransitionImpl3.scheduleRemoveTargets(cloneTransition, cloneTransition, arrayList14, null, null, null, null);
                        if (operation8.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.GONE) {
                            operation3 = operation8;
                            list2.remove(operation3);
                            java.util.ArrayList<android.view.View> arrayList15 = new java.util.ArrayList<>(arrayList14);
                            arrayList15.remove(operation3.getFragment().mView);
                            fragmentTransitionImpl3.scheduleHideFragmentView(cloneTransition, operation3.getFragment().mView, arrayList15);
                            androidx.core.view.OneShotPreDrawListener.add(getContainer(), new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.8
                                @Override // java.lang.Runnable
                                public void run() {
                                    androidx.fragment.app.FragmentTransition.setViewVisibility(arrayList14, 4);
                                }
                            });
                        } else {
                            operation3 = operation8;
                        }
                    }
                    if (operation3.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList13.addAll(arrayList14);
                        if (z3) {
                            fragmentTransitionImpl3.setEpicenter(cloneTransition, rect5);
                        }
                        view2 = view13;
                    } else {
                        view2 = view13;
                        fragmentTransitionImpl3.setEpicenter(cloneTransition, view2);
                    }
                    hashMap.put(operation3, true);
                    if (next2.isOverlapAllowed()) {
                        obj2 = fragmentTransitionImpl3.mergeTransitionsTogether(obj2, cloneTransition, null);
                        obj6 = obj;
                    } else {
                        obj6 = fragmentTransitionImpl3.mergeTransitionsTogether(obj, cloneTransition, null);
                    }
                }
                it4 = it5;
                view13 = view2;
                obj5 = obj2;
                obj4 = obj6;
                view14 = view;
                arrayList11 = arrayList;
                str = str3;
                arrayList12 = arrayList2;
                z4 = false;
            }
        }
        java.util.ArrayList<android.view.View> arrayList16 = arrayList11;
        java.lang.String str6 = str;
        java.util.ArrayList<android.view.View> arrayList17 = arrayList12;
        java.lang.Object mergeTransitionsInSequence = fragmentTransitionImpl3.mergeTransitionsInSequence(obj5, obj4, obj3);
        if (mergeTransitionsInSequence == null) {
            return hashMap;
        }
        for (final androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo transitionInfo3 : list) {
            if (!transitionInfo3.isVisibilityUnchanged()) {
                java.lang.Object transition = transitionInfo3.getTransition();
                final androidx.fragment.app.SpecialEffectsController.Operation operation9 = transitionInfo3.getOperation();
                boolean z6 = obj3 != null && (operation9 == operation5 || operation9 == operation7);
                if (transition == null && !z6) {
                    str2 = str6;
                } else if (!androidx.core.view.ViewCompat.isLaidOut(getContainer())) {
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        str2 = str6;
                        android.util.Log.v(str2, "SpecialEffectsController: Container " + getContainer() + " has not been laid out. Completing operation " + operation9);
                    } else {
                        str2 = str6;
                    }
                    transitionInfo3.completeSpecialEffect();
                } else {
                    str2 = str6;
                    fragmentTransitionImpl3.setListenerForTransitionEnd(transitionInfo3.getOperation().getFragment(), mergeTransitionsInSequence, transitionInfo3.getSignal(), new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.9
                        @Override // java.lang.Runnable
                        public void run() {
                            transitionInfo3.completeSpecialEffect();
                            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                android.util.Log.v(androidx.fragment.app.FragmentManager.TAG, "Transition for operation " + operation9 + "has completed");
                            }
                        }
                    });
                }
                str6 = str2;
            }
        }
        java.lang.String str7 = str6;
        if (!androidx.core.view.ViewCompat.isLaidOut(getContainer())) {
            return hashMap;
        }
        androidx.fragment.app.FragmentTransition.setViewVisibility(arrayList13, 4);
        java.util.ArrayList<java.lang.String> prepareSetNameOverridesReordered = fragmentTransitionImpl3.prepareSetNameOverridesReordered(arrayList16);
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            android.util.Log.v(str7, ">>>>> Beginning transition <<<<<");
            android.util.Log.v(str7, ">>>>> SharedElementFirstOutViews <<<<<");
            java.util.Iterator<android.view.View> it6 = arrayList17.iterator();
            while (it6.hasNext()) {
                android.view.View next3 = it6.next();
                android.util.Log.v(str7, "View: " + next3 + " Name: " + androidx.core.view.ViewCompat.getTransitionName(next3));
            }
            android.util.Log.v(str7, ">>>>> SharedElementLastInViews <<<<<");
            java.util.Iterator<android.view.View> it7 = arrayList16.iterator();
            while (it7.hasNext()) {
                android.view.View next4 = it7.next();
                android.util.Log.v(str7, "View: " + next4 + " Name: " + androidx.core.view.ViewCompat.getTransitionName(next4));
            }
        }
        fragmentTransitionImpl3.beginDelayedTransition(getContainer(), mergeTransitionsInSequence);
        fragmentTransitionImpl3.setNameOverridesReordered(getContainer(), arrayList17, arrayList16, prepareSetNameOverridesReordered, arrayMap5);
        androidx.fragment.app.FragmentTransition.setViewVisibility(arrayList13, 0);
        fragmentTransitionImpl3.swapSharedElementTargets(obj3, arrayList17, arrayList16);
        return hashMap;
    }

    void retainMatchingViews(androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap, java.util.Collection<java.lang.String> collection) {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, android.view.View>> it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(androidx.core.view.ViewCompat.getTransitionName(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    void captureTransitioningViews(java.util.ArrayList<android.view.View> arrayList, android.view.View view) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (androidx.core.view.ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    captureTransitioningViews(arrayList, childAt);
                }
            }
            return;
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    void findNamedViews(java.util.Map<java.lang.String, android.view.View> map, android.view.View view) {
        java.lang.String transitionName = androidx.core.view.ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    findNamedViews(map, childAt);
                }
            }
        }
    }

    void applyContainerChanges(androidx.fragment.app.SpecialEffectsController.Operation operation) {
        operation.getFinalState().applyState(operation.getFragment().mView);
    }

    private static class SpecialEffectsInfo {
        private final androidx.fragment.app.SpecialEffectsController.Operation mOperation;
        private final androidx.core.os.CancellationSignal mSignal;

        SpecialEffectsInfo(androidx.fragment.app.SpecialEffectsController.Operation operation, androidx.core.os.CancellationSignal cancellationSignal) {
            this.mOperation = operation;
            this.mSignal = cancellationSignal;
        }

        androidx.fragment.app.SpecialEffectsController.Operation getOperation() {
            return this.mOperation;
        }

        androidx.core.os.CancellationSignal getSignal() {
            return this.mSignal;
        }

        boolean isVisibilityUnchanged() {
            androidx.fragment.app.SpecialEffectsController.Operation.State from = androidx.fragment.app.SpecialEffectsController.Operation.State.from(this.mOperation.getFragment().mView);
            androidx.fragment.app.SpecialEffectsController.Operation.State finalState = this.mOperation.getFinalState();
            return from == finalState || !(from == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE || finalState == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE);
        }

        void completeSpecialEffect() {
            this.mOperation.completeSpecialEffect(this.mSignal);
        }
    }

    private static class AnimationInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private androidx.fragment.app.FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        AnimationInfo(androidx.fragment.app.SpecialEffectsController.Operation operation, androidx.core.os.CancellationSignal cancellationSignal, boolean z) {
            super(operation, cancellationSignal);
            this.mLoadedAnim = false;
            this.mIsPop = z;
        }

        androidx.fragment.app.FragmentAnim.AnimationOrAnimator getAnimation(android.content.Context context) {
            if (this.mLoadedAnim) {
                return this.mAnimation;
            }
            androidx.fragment.app.FragmentAnim.AnimationOrAnimator loadAnimation = androidx.fragment.app.FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE, this.mIsPop);
            this.mAnimation = loadAnimation;
            this.mLoadedAnim = true;
            return loadAnimation;
        }
    }

    private static class TransitionInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private final boolean mOverlapAllowed;
        private final java.lang.Object mSharedElementTransition;
        private final java.lang.Object mTransition;

        TransitionInfo(androidx.fragment.app.SpecialEffectsController.Operation operation, androidx.core.os.CancellationSignal cancellationSignal, boolean z, boolean z2) {
            super(operation, cancellationSignal);
            java.lang.Object exitTransition;
            java.lang.Object enterTransition;
            boolean allowEnterTransitionOverlap;
            if (operation.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) {
                if (z) {
                    enterTransition = operation.getFragment().getReenterTransition();
                } else {
                    enterTransition = operation.getFragment().getEnterTransition();
                }
                this.mTransition = enterTransition;
                if (z) {
                    allowEnterTransitionOverlap = operation.getFragment().getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = operation.getFragment().getAllowEnterTransitionOverlap();
                }
                this.mOverlapAllowed = allowEnterTransitionOverlap;
            } else {
                if (z) {
                    exitTransition = operation.getFragment().getReturnTransition();
                } else {
                    exitTransition = operation.getFragment().getExitTransition();
                }
                this.mTransition = exitTransition;
                this.mOverlapAllowed = true;
            }
            if (!z2) {
                this.mSharedElementTransition = null;
            } else if (z) {
                this.mSharedElementTransition = operation.getFragment().getSharedElementReturnTransition();
            } else {
                this.mSharedElementTransition = operation.getFragment().getSharedElementEnterTransition();
            }
        }

        java.lang.Object getTransition() {
            return this.mTransition;
        }

        boolean isOverlapAllowed() {
            return this.mOverlapAllowed;
        }

        public boolean hasSharedElementTransition() {
            return this.mSharedElementTransition != null;
        }

        public java.lang.Object getSharedElementTransition() {
            return this.mSharedElementTransition;
        }

        androidx.fragment.app.FragmentTransitionImpl getHandlingImpl() {
            androidx.fragment.app.FragmentTransitionImpl handlingImpl = getHandlingImpl(this.mTransition);
            androidx.fragment.app.FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.mSharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl != null ? handlingImpl : handlingImpl2;
            }
            throw new java.lang.IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.mTransition + " which uses a different Transition  type than its shared element transition " + this.mSharedElementTransition);
        }

        private androidx.fragment.app.FragmentTransitionImpl getHandlingImpl(java.lang.Object obj) {
            if (obj == null) {
                return null;
            }
            if (androidx.fragment.app.FragmentTransition.PLATFORM_IMPL != null && androidx.fragment.app.FragmentTransition.PLATFORM_IMPL.canHandle(obj)) {
                return androidx.fragment.app.FragmentTransition.PLATFORM_IMPL;
            }
            if (androidx.fragment.app.FragmentTransition.SUPPORT_IMPL != null && androidx.fragment.app.FragmentTransition.SUPPORT_IMPL.canHandle(obj)) {
                return androidx.fragment.app.FragmentTransition.SUPPORT_IMPL;
            }
            throw new java.lang.IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
