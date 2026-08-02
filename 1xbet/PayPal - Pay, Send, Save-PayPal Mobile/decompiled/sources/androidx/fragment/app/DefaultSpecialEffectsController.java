package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operations", "", "isPop", "", "collectEffects", "(Ljava/util/List;Z)V", "", "", "Landroid/view/View;", "p0", "p1", "getHighSpeedVideoSizes", "(Ljava/util/Map;Landroid/view/View;)V", "AnimationEffect", "AnimationInfo", "AnimatorEffect", "Api24Impl", "Api26Impl", "SpecialEffectsInfo", "TransitionEffect", "TransitionInfo"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultSpecialEffectsController extends androidx.fragment.app.SpecialEffectsController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(android.view.ViewGroup viewGroup) {
        super(viewGroup);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0499 A[LOOP:15: B:166:0x0493->B:168:0x0499, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0518  */
    @Override // androidx.fragment.app.SpecialEffectsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void collectEffects(java.util.List<? extends androidx.fragment.app.SpecialEffectsController.Operation> operations, boolean isPop) {
        java.lang.Object obj;
        androidx.fragment.app.SpecialEffectsController.Operation operation;
        java.util.ArrayList<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> arrayList;
        boolean z;
        java.util.Iterator it;
        java.util.ArrayList arrayList2;
        androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        kotlin.Pair pair;
        java.lang.String findKeyForValue;
        boolean z2 = isPop;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operations, "");
        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
        java.util.Iterator<T> it2 = operations.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            androidx.fragment.app.SpecialEffectsController.Operation operation2 = (androidx.fragment.app.SpecialEffectsController.Operation) obj;
            androidx.fragment.app.SpecialEffectsController.Operation.State.Companion companion = androidx.fragment.app.SpecialEffectsController.Operation.State.INSTANCE;
            android.view.View view = operation2.getFragment().mView;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "");
            if (companion.asOperationState(view) == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE && operation2.getFinalState() != androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) {
                break;
            }
        }
        androidx.fragment.app.SpecialEffectsController.Operation operation3 = (androidx.fragment.app.SpecialEffectsController.Operation) obj;
        java.util.ListIterator<? extends androidx.fragment.app.SpecialEffectsController.Operation> listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                operation = null;
                break;
            }
            operation = listIterator.previous();
            androidx.fragment.app.SpecialEffectsController.Operation operation4 = operation;
            androidx.fragment.app.SpecialEffectsController.Operation.State.Companion companion2 = androidx.fragment.app.SpecialEffectsController.Operation.State.INSTANCE;
            android.view.View view2 = operation4.getFragment().mView;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view2, "");
            if (companion2.asOperationState(view2) != androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE && operation4.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) {
                break;
            }
        }
        androidx.fragment.app.SpecialEffectsController.Operation operation5 = operation;
        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        androidx.fragment.app.Fragment fragment = ((androidx.fragment.app.SpecialEffectsController.Operation) kotlin.collections.CollectionsKt.last((java.util.List) operations)).getFragment();
        for (androidx.fragment.app.SpecialEffectsController.Operation operation6 : operations) {
            operation6.getFragment().mAnimationInfo.getHighSpeedVideoFpsRangesFor = fragment.mAnimationInfo.getHighSpeedVideoFpsRangesFor;
            operation6.getFragment().mAnimationInfo.getOutputMinFrameDuration = fragment.mAnimationInfo.getOutputMinFrameDuration;
            operation6.getFragment().mAnimationInfo.getOutputStallDurationlomOqCM = fragment.mAnimationInfo.getOutputStallDurationlomOqCM;
            operation6.getFragment().mAnimationInfo.getOutputMinFrameDurationlomOqCM = fragment.mAnimationInfo.getOutputMinFrameDurationlomOqCM;
        }
        java.util.Iterator<? extends androidx.fragment.app.SpecialEffectsController.Operation> it3 = operations.iterator();
        while (it3.hasNext()) {
            final androidx.fragment.app.SpecialEffectsController.Operation next = it3.next();
            arrayList5.add(new androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo(next, z2));
            arrayList6.add(new androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo(next, z2, !z2 ? next != operation5 : next != operation3));
            next.addCompletionListener(new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.fragment.app.DefaultSpecialEffectsController.m9149$r8$lambda$d3w9IvNeMua7NQR_JFd0slR_vo(androidx.fragment.app.DefaultSpecialEffectsController.this, next);
                }
            });
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList6) {
            if (!((androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) obj2).isVisibilityUnchanged()) {
                arrayList7.add(obj2);
            }
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList7) {
            if (((androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) obj3).getHighSpeedVideoFpsRanges() != null) {
                arrayList8.add(obj3);
            }
        }
        java.util.ArrayList<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> arrayList9 = arrayList8;
        java.util.ArrayList<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> arrayList10 = arrayList9;
        androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl2 = null;
        for (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo transitionInfo : arrayList10) {
            androidx.fragment.app.FragmentTransitionImpl highSpeedVideoFpsRanges = transitionInfo.getHighSpeedVideoFpsRanges();
            if (fragmentTransitionImpl2 != null && highSpeedVideoFpsRanges != fragmentTransitionImpl2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(transitionInfo.getOperation().getFragment());
                sb.append(" returned Transition ");
                sb.append(transitionInfo.getGetHighResolutionOutputSizeshNQ4ISI());
                sb.append(" which uses a different Transition type than other Fragments.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            fragmentTransitionImpl2 = highSpeedVideoFpsRanges;
        }
        if (fragmentTransitionImpl2 != null) {
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
            java.util.ArrayList<java.lang.String> arrayList13 = new java.util.ArrayList<>();
            java.util.ArrayList<java.lang.String> arrayList14 = new java.util.ArrayList<>();
            androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap();
            arrayList = arrayList5;
            androidx.collection.ArrayMap arrayMap3 = new androidx.collection.ArrayMap();
            java.util.ArrayList<java.lang.String> arrayList15 = arrayList13;
            java.util.ArrayList<java.lang.String> arrayList16 = arrayList14;
            java.lang.Object obj4 = null;
            for (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo transitionInfo2 : arrayList9) {
                if (transitionInfo2.getHighSpeedVideoSizes == null || operation3 == null || operation5 == null) {
                    arrayList2 = arrayList9;
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList12;
                } else {
                    obj4 = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(transitionInfo2.getGetHighSpeedVideoSizes()));
                    java.util.ArrayList<java.lang.String> sharedElementSourceNames = operation5.getFragment().getSharedElementSourceNames();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "");
                    java.util.ArrayList<java.lang.String> sharedElementSourceNames2 = operation3.getFragment().getSharedElementSourceNames();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "");
                    java.util.ArrayList<java.lang.String> sharedElementTargetNames = operation3.getFragment().getSharedElementTargetNames();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "");
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    int size = sharedElementTargetNames.size();
                    arrayList2 = arrayList9;
                    int i = 0;
                    while (i < size) {
                        int i2 = size;
                        int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                        java.util.ArrayList<java.lang.String> arrayList17 = sharedElementTargetNames;
                        if (indexOf != -1) {
                            sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i));
                        }
                        i++;
                        size = i2;
                        sharedElementTargetNames = arrayList17;
                    }
                    java.util.ArrayList<java.lang.String> sharedElementTargetNames2 = operation5.getFragment().getSharedElementTargetNames();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "");
                    if (!z2) {
                        pair = kotlin.TuplesKt.to(operation3.getFragment().getExitTransitionCallback(), operation5.getFragment().getEnterTransitionCallback());
                    } else {
                        pair = kotlin.TuplesKt.to(operation3.getFragment().getEnterTransitionCallback(), operation5.getFragment().getExitTransitionCallback());
                    }
                    androidx.core.app.SharedElementCallback sharedElementCallback = (androidx.core.app.SharedElementCallback) pair.component1();
                    androidx.core.app.SharedElementCallback sharedElementCallback2 = (androidx.core.app.SharedElementCallback) pair.component2();
                    int size2 = sharedElementSourceNames.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        int i4 = size2;
                        java.lang.String str = sharedElementSourceNames.get(i3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                        java.util.ArrayList arrayList18 = arrayList12;
                        java.lang.String str2 = sharedElementTargetNames2.get(i3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                        arrayMap.put(str, str2);
                        i3++;
                        size2 = i4;
                        arrayList12 = arrayList18;
                        arrayList11 = arrayList11;
                    }
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList12;
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        java.util.Iterator<java.lang.String> it4 = sharedElementTargetNames2.iterator();
                        while (it4.hasNext()) {
                            it4.next();
                        }
                        java.util.Iterator<java.lang.String> it5 = sharedElementSourceNames.iterator();
                        while (it5.hasNext()) {
                            it5.next();
                        }
                    }
                    androidx.collection.ArrayMap arrayMap4 = arrayMap2;
                    android.view.View view3 = operation3.getFragment().mView;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view3, "");
                    getHighSpeedVideoSizes(arrayMap4, view3);
                    arrayMap2.retainAll(sharedElementSourceNames);
                    if (sharedElementCallback != null) {
                        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                        sharedElementCallback.onMapSharedElements(sharedElementSourceNames, arrayMap4);
                        int size3 = sharedElementSourceNames.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i5 = size3 - 1;
                                java.lang.String str3 = sharedElementSourceNames.get(size3);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                                java.lang.String str4 = str3;
                                android.view.View view4 = (android.view.View) arrayMap2.get(str4);
                                if (view4 == null) {
                                    arrayMap.remove(str4);
                                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(str4, androidx.core.view.ViewCompat.getTransitionName(view4))) {
                                    arrayMap.put(androidx.core.view.ViewCompat.getTransitionName(view4), (java.lang.String) arrayMap.remove(str4));
                                }
                                if (i5 < 0) {
                                    break;
                                } else {
                                    size3 = i5;
                                }
                            }
                        }
                    } else {
                        arrayMap.retainAll(arrayMap2.keySet());
                    }
                    androidx.collection.ArrayMap arrayMap5 = arrayMap3;
                    android.view.View view5 = operation5.getFragment().mView;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view5, "");
                    getHighSpeedVideoSizes(arrayMap5, view5);
                    arrayMap3.retainAll(sharedElementTargetNames2);
                    arrayMap3.retainAll(arrayMap.values());
                    if (sharedElementCallback2 != null) {
                        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                        sharedElementCallback2.onMapSharedElements(sharedElementTargetNames2, arrayMap5);
                        int size4 = sharedElementTargetNames2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i6 = size4 - 1;
                                java.lang.String str5 = sharedElementTargetNames2.get(size4);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "");
                                java.lang.String str6 = str5;
                                android.view.View view6 = (android.view.View) arrayMap3.get(str6);
                                if (view6 == null) {
                                    java.lang.String findKeyForValue2 = androidx.fragment.app.FragmentTransition.findKeyForValue(arrayMap, str6);
                                    if (findKeyForValue2 != null) {
                                        arrayMap.remove(findKeyForValue2);
                                    }
                                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(str6, androidx.core.view.ViewCompat.getTransitionName(view6)) && (findKeyForValue = androidx.fragment.app.FragmentTransition.findKeyForValue(arrayMap, str6)) != null) {
                                    arrayMap.put(findKeyForValue, androidx.core.view.ViewCompat.getTransitionName(view6));
                                }
                                if (i6 < 0) {
                                    break;
                                } else {
                                    size4 = i6;
                                }
                            }
                        }
                    } else {
                        androidx.fragment.app.FragmentTransition.retainValues(arrayMap, arrayMap3);
                    }
                    java.util.Set keySet = arrayMap.keySet();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "");
                    final java.util.Set set = keySet;
                    java.util.Set entrySet = arrayMap2.entrySet();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet, "");
                    kotlin.collections.CollectionsKt.retainAll(entrySet, new kotlin.jvm.functions.Function1<java.util.Map.Entry<java.lang.String, android.view.View>, java.lang.Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public final java.lang.Boolean invoke(java.util.Map.Entry<java.lang.String, android.view.View> entry) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
                            return java.lang.Boolean.valueOf(kotlin.collections.CollectionsKt.contains(set, androidx.core.view.ViewCompat.getTransitionName(entry.getValue())));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    });
                    final java.util.Collection values = arrayMap.values();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "");
                    java.util.Set entrySet2 = arrayMap3.entrySet();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet2, "");
                    kotlin.collections.CollectionsKt.retainAll(entrySet2, new kotlin.jvm.functions.Function1<java.util.Map.Entry<java.lang.String, android.view.View>, java.lang.Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public final java.lang.Boolean invoke(java.util.Map.Entry<java.lang.String, android.view.View> entry) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
                            return java.lang.Boolean.valueOf(kotlin.collections.CollectionsKt.contains(values, androidx.core.view.ViewCompat.getTransitionName(entry.getValue())));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    });
                    if (arrayMap.isEmpty()) {
                        java.util.Objects.toString(obj4);
                        java.util.Objects.toString(operation3);
                        java.util.Objects.toString(operation5);
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList16 = sharedElementSourceNames;
                        arrayList15 = sharedElementTargetNames2;
                        obj4 = null;
                    } else {
                        arrayList16 = sharedElementSourceNames;
                        arrayList15 = sharedElementTargetNames2;
                    }
                }
                z2 = isPop;
                fragmentTransitionImpl2 = fragmentTransitionImpl;
                arrayList9 = arrayList2;
                arrayList12 = arrayList4;
                arrayList11 = arrayList3;
            }
            java.util.ArrayList arrayList19 = arrayList9;
            androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
            java.util.ArrayList arrayList20 = arrayList11;
            java.util.ArrayList arrayList21 = arrayList12;
            if (obj4 == null) {
                if (!arrayList10.isEmpty()) {
                    java.util.Iterator it6 = arrayList10.iterator();
                    while (it6.hasNext()) {
                        if (((androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) it6.next()).getGetHighResolutionOutputSizeshNQ4ISI() == null) {
                        }
                    }
                }
            }
            z = false;
            androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect transitionEffect = new androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect(arrayList19, operation3, operation5, fragmentTransitionImpl3, obj4, arrayList20, arrayList21, arrayMap, arrayList15, arrayList16, arrayMap2, arrayMap3, isPop);
            java.util.Iterator it7 = arrayList10.iterator();
            while (it7.hasNext()) {
                ((androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) it7.next()).getOperation().addEffect(transitionEffect);
            }
            java.util.ArrayList<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> arrayList22 = new java.util.ArrayList();
            java.util.ArrayList arrayList23 = new java.util.ArrayList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList23, ((androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) it.next()).getOperation().getEffects$fragment_release());
            }
            boolean isEmpty = arrayList23.isEmpty();
            boolean z3 = z;
            for (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo animationInfo : arrayList) {
                android.content.Context context = getContainer().getContext();
                androidx.fragment.app.SpecialEffectsController.Operation operation7 = animationInfo.getOperation();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
                androidx.fragment.app.FragmentAnim.AnimationOrAnimator Camera2StreamConfigurationMap = animationInfo.Camera2StreamConfigurationMap(context);
                if (Camera2StreamConfigurationMap != null) {
                    if (Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor == null) {
                        arrayList22.add(animationInfo);
                    } else {
                        operation7.getFragment();
                        if (!operation7.getEffects$fragment_release().isEmpty()) {
                            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                        } else {
                            if (operation7.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.GONE) {
                                operation7.setAwaitingContainerChanges(z);
                            }
                            operation7.addEffect(new androidx.fragment.app.DefaultSpecialEffectsController.AnimatorEffect(animationInfo));
                            z3 = true;
                        }
                    }
                }
            }
            for (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo animationInfo2 : arrayList22) {
                androidx.fragment.app.SpecialEffectsController.Operation operation8 = animationInfo2.getOperation();
                operation8.getFragment();
                if (!isEmpty) {
                    androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                } else if (z3) {
                    androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                } else {
                    operation8.addEffect(new androidx.fragment.app.DefaultSpecialEffectsController.AnimationEffect(animationInfo2));
                }
            }
        }
        arrayList = arrayList5;
        z = false;
        java.util.ArrayList<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> arrayList222 = new java.util.ArrayList();
        java.util.ArrayList arrayList232 = new java.util.ArrayList();
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        boolean isEmpty2 = arrayList232.isEmpty();
        boolean z32 = z;
        while (r3.hasNext()) {
        }
        while (r0.hasNext()) {
        }
    }

    private final void getHighSpeedVideoSizes(java.util.Map<java.lang.String, android.view.View> p0, android.view.View p1) {
        java.lang.String transitionName = androidx.core.view.ViewCompat.getTransitionName(p1);
        if (transitionName != null) {
            p0.put(transitionName, p1);
        }
        if (p1 instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) p1;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "");
                    getHighSpeedVideoSizes(p0, childAt);
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "", "isVisibilityUnchanged", "()Z", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "getOperation", "()Landroidx/fragment/app/SpecialEffectsController$Operation;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class SpecialEffectsInfo {
        private final androidx.fragment.app.SpecialEffectsController.Operation operation;

        public SpecialEffectsInfo(androidx.fragment.app.SpecialEffectsController.Operation operation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
            this.operation = operation;
        }

        public final androidx.fragment.app.SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final boolean isVisibilityUnchanged() {
            android.view.View view = this.operation.getFragment().mView;
            androidx.fragment.app.SpecialEffectsController.Operation.State asOperationState = view != null ? androidx.fragment.app.SpecialEffectsController.Operation.State.INSTANCE.asOperationState(view) : null;
            androidx.fragment.app.SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (asOperationState != finalState) {
                return (asOperationState == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE || finalState == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) ? false : true;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "p0", "", "p1", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Z)V", "Landroid/content/Context;", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "Camera2StreamConfigurationMap", "(Landroid/content/Context;)Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "getHighSpeedVideoFpsRangesFor", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class AnimationInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final boolean getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private androidx.fragment.app.FragmentAnim.AnimationOrAnimator getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(androidx.fragment.app.SpecialEffectsController.Operation operation, boolean z) {
            super(operation);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
            this.getHighSpeedVideoFpsRanges = z;
        }

        public final androidx.fragment.app.FragmentAnim.AnimationOrAnimator Camera2StreamConfigurationMap(android.content.Context p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return this.getHighSpeedVideoSizes;
            }
            androidx.fragment.app.FragmentAnim.AnimationOrAnimator Camera2StreamConfigurationMap = androidx.fragment.app.FragmentAnim.Camera2StreamConfigurationMap(p0, getOperation().getFragment(), getOperation().getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE, this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            return Camera2StreamConfigurationMap;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\n8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "p0", "", "p1", "p2", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;ZZ)V", "", "Landroidx/fragment/app/FragmentTransitionImpl;", "Camera2StreamConfigurationMap", "(Ljava/lang/Object;)Landroidx/fragment/app/FragmentTransitionImpl;", "getHighSpeedVideoFpsRanges", "()Landroidx/fragment/app/FragmentTransitionImpl;", "Z", "()Z", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "()Ljava/lang/Object;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class TransitionInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final boolean getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final java.lang.Object getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(androidx.fragment.app.SpecialEffectsController.Operation operation, boolean z, boolean z2) {
            super(operation);
            java.lang.Object returnTransition;
            boolean z3;
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
            if (operation.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) {
                androidx.fragment.app.Fragment fragment = operation.getFragment();
                returnTransition = z ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                androidx.fragment.app.Fragment fragment2 = operation.getFragment();
                returnTransition = z ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.getHighResolutionOutputSizeshNQ4ISI = returnTransition;
            if (operation.getFinalState() != androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) {
                z3 = true;
            } else if (z) {
                z3 = operation.getFragment().getAllowReturnTransitionOverlap();
            } else {
                z3 = operation.getFragment().getAllowEnterTransitionOverlap();
            }
            this.getHighSpeedVideoFpsRangesFor = z3;
            if (!z2) {
                obj = null;
            } else if (z) {
                obj = operation.getFragment().getSharedElementReturnTransition();
            } else {
                obj = operation.getFragment().getSharedElementEnterTransition();
            }
            this.getHighSpeedVideoSizes = obj;
        }

        /* renamed from: getHighSpeedVideoSizes, reason: from getter */
        public final java.lang.Object getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
        public final boolean getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final java.lang.Object getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        public final androidx.fragment.app.FragmentTransitionImpl getHighSpeedVideoFpsRanges() {
            androidx.fragment.app.FragmentTransitionImpl Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
            androidx.fragment.app.FragmentTransitionImpl Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes);
            if (Camera2StreamConfigurationMap == null || Camera2StreamConfigurationMap2 == null || Camera2StreamConfigurationMap == Camera2StreamConfigurationMap2) {
                return Camera2StreamConfigurationMap == null ? Camera2StreamConfigurationMap2 : Camera2StreamConfigurationMap;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            sb.append(getOperation().getFragment());
            sb.append(" returned Transition ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(" which uses a different Transition  type than its shared element transition ");
            sb.append(this.getHighSpeedVideoSizes);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        private final androidx.fragment.app.FragmentTransitionImpl Camera2StreamConfigurationMap(java.lang.Object p0) {
            if (p0 == null) {
                return null;
            }
            if (androidx.fragment.app.FragmentTransition.PLATFORM_IMPL != null && androidx.fragment.app.FragmentTransition.PLATFORM_IMPL.canHandle(p0)) {
                return androidx.fragment.app.FragmentTransition.PLATFORM_IMPL;
            }
            if (androidx.fragment.app.FragmentTransition.SUPPORT_IMPL != null && androidx.fragment.app.FragmentTransition.SUPPORT_IMPL.canHandle(p0)) {
                return androidx.fragment.app.FragmentTransition.SUPPORT_IMPL;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Transition ");
            sb.append(p0);
            sb.append(" for fragment ");
            sb.append(getOperation().getFragment());
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tR\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "p0", "<init>", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "Landroid/view/ViewGroup;", "", "onCancel", "(Landroid/view/ViewGroup;)V", "onCommit", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "getHighSpeedVideoFpsRanges", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class AnimationEffect extends androidx.fragment.app.SpecialEffectsController.Effect {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo getHighSpeedVideoSizes;

        public AnimationEffect(androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo animationInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationInfo, "");
            this.getHighSpeedVideoSizes = animationInfo;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void onCommit(android.view.ViewGroup p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (this.getHighSpeedVideoSizes.isVisibilityUnchanged()) {
                this.getHighSpeedVideoSizes.getOperation().completeEffect(this);
                return;
            }
            android.content.Context context = p0.getContext();
            androidx.fragment.app.SpecialEffectsController.Operation operation = this.getHighSpeedVideoSizes.getOperation();
            android.view.View view = operation.getFragment().mView;
            androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo animationInfo = this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
            androidx.fragment.app.FragmentAnim.AnimationOrAnimator Camera2StreamConfigurationMap = animationInfo.Camera2StreamConfigurationMap(context);
            if (Camera2StreamConfigurationMap == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            android.view.animation.Animation animation = Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            if (animation == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            if (operation.getFinalState() != androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED) {
                view.startAnimation(animation);
                this.getHighSpeedVideoSizes.getOperation().completeEffect(this);
                return;
            }
            p0.startViewTransition(view);
            androidx.fragment.app.FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new androidx.fragment.app.FragmentAnim.EndViewTransitionAnimation(animation, p0, view);
            endViewTransitionAnimation.setAnimationListener(new androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1(operation, p0, view, this));
            view.startAnimation(endViewTransitionAnimation);
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void onCancel(android.view.ViewGroup p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            android.view.View view = this.getHighSpeedVideoSizes.getOperation().getFragment().mView;
            view.clearAnimation();
            p0.endViewTransition(view);
            this.getHighSpeedVideoSizes.getOperation().completeEffect(this);
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\tR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0011\u001a\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "p0", "<init>", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "Landroid/view/ViewGroup;", "", "onCancel", "(Landroid/view/ViewGroup;)V", "onCommit", "Landroidx/activity/BackEventCompat;", "p1", "onProgress", "(Landroidx/activity/BackEventCompat;Landroid/view/ViewGroup;)V", "onStart", "Landroid/animation/AnimatorSet;", "getHighSpeedVideoFpsRanges", "Landroid/animation/AnimatorSet;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "", "isSeekingSupported", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class AnimatorEffect extends androidx.fragment.app.SpecialEffectsController.Effect {
        private final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        public android.animation.AnimatorSet getHighSpeedVideoSizes;

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* renamed from: isSeekingSupported */
        public final boolean getIsSeekingSupported() {
            return true;
        }

        public AnimatorEffect(androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo animationInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationInfo, "");
            this.Camera2StreamConfigurationMap = animationInfo;
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void onStart(final android.view.ViewGroup p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (this.Camera2StreamConfigurationMap.isVisibilityUnchanged()) {
                return;
            }
            android.content.Context context = p0.getContext();
            androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo animationInfo = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
            androidx.fragment.app.FragmentAnim.AnimationOrAnimator Camera2StreamConfigurationMap = animationInfo.Camera2StreamConfigurationMap(context);
            this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap != null ? Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor : null;
            final androidx.fragment.app.SpecialEffectsController.Operation operation = this.Camera2StreamConfigurationMap.getOperation();
            androidx.fragment.app.Fragment fragment = operation.getFragment();
            final boolean z = operation.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.GONE;
            final android.view.View view = fragment.mView;
            p0.startViewTransition(view);
            android.animation.AnimatorSet animatorSet = this.getHighSpeedVideoSizes;
            if (animatorSet != null) {
                animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(android.animation.Animator anim) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anim, "");
                        p0.endViewTransition(view);
                        if (z) {
                            androidx.fragment.app.SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                            android.view.View view2 = view;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view2, "");
                            finalState.applyState(view2, p0);
                        }
                        this.getCamera2StreamConfigurationMap().getOperation().completeEffect(this);
                        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                    }
                });
            }
            android.animation.AnimatorSet animatorSet2 = this.getHighSpeedVideoSizes;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void onProgress(androidx.view.BackEventCompat p0, android.view.ViewGroup p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            androidx.fragment.app.SpecialEffectsController.Operation operation = this.Camera2StreamConfigurationMap.getOperation();
            android.animation.AnimatorSet animatorSet = this.getHighSpeedVideoSizes;
            if (animatorSet == null) {
                this.Camera2StreamConfigurationMap.getOperation().completeEffect(this);
                return;
            }
            if (android.os.Build.VERSION.SDK_INT < 34 || !operation.getFragment().mTransitioning) {
                return;
            }
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
            long j = androidx.fragment.app.DefaultSpecialEffectsController.Api24Impl.INSTANCE.totalDuration(animatorSet);
            long progress = (long) (p0.getProgress() * j);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == j) {
                progress = j - 1;
            }
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
            androidx.fragment.app.DefaultSpecialEffectsController.Api26Impl.INSTANCE.setCurrentPlayTime(animatorSet, progress);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void onCommit(android.view.ViewGroup p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            this.Camera2StreamConfigurationMap.getOperation();
            android.animation.AnimatorSet animatorSet = this.getHighSpeedVideoSizes;
            if (animatorSet == null) {
                this.Camera2StreamConfigurationMap.getOperation().completeEffect(this);
            } else {
                animatorSet.start();
                androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void onCancel(android.view.ViewGroup p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            android.animation.AnimatorSet animatorSet = this.getHighSpeedVideoSizes;
            if (animatorSet == null) {
                this.Camera2StreamConfigurationMap.getOperation().completeEffect(this);
                return;
            }
            androidx.fragment.app.SpecialEffectsController.Operation operation = this.Camera2StreamConfigurationMap.getOperation();
            if (operation.getIsSeeking()) {
                androidx.fragment.app.DefaultSpecialEffectsController.Api26Impl.INSTANCE.reverse(animatorSet);
            } else {
                animatorSet.end();
            }
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                operation.getIsSeeking();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001d\u001a\u00020\u001c2\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u0006\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010!\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\n0 2\u0006\u0010\u0004\u001a\u00020\u001f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010$J\u001f\u0010'\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001fH\u0016¢\u0006\u0004\b)\u0010$J=\u0010+\u001a\u00020\u001c2\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u0006\u001a\u00020\u001f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001c0*H\u0002¢\u0006\u0004\b+\u0010,R\u0018\u0010+\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b-\u0010.R!\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\u0006\n\u0004\b!\u0010/R!\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010/R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b+\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001c\u00102\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b!\u00101R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u00103R\u0016\u0010;\u001a\u00020\u00188\u0006@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b4\u00106R$\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010/R$\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010/R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u00103R\u0016\u0010@\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010.R\u001a\u0010=\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010A\u001a\u0004\b-\u0010BR \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010C\u001a\u0004\b4\u0010DR\u0014\u0010I\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0011\u0010G\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u001d\u00109"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "p0", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "p1", "p2", "Landroidx/fragment/app/FragmentTransitionImpl;", "p3", "", "p4", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "p5", "p6", "Landroidx/collection/ArrayMap;", "", "p7", "p8", "p9", "p10", "p11", "", "p12", "<init>", "(Ljava/util/List;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/FragmentTransitionImpl;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Landroidx/collection/ArrayMap;Z)V", "", "Camera2StreamConfigurationMap", "(Ljava/util/ArrayList;Landroid/view/View;)V", "Landroid/view/ViewGroup;", "Lkotlin/Pair;", "getHighSpeedVideoFpsRangesFor", "(Landroid/view/ViewGroup;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)Lkotlin/Pair;", "onCancel", "(Landroid/view/ViewGroup;)V", "onCommit", "Landroidx/activity/BackEventCompat;", "onProgress", "(Landroidx/activity/BackEventCompat;Landroid/view/ViewGroup;)V", "onStart", "Lkotlin/Function0;", "getHighSpeedVideoSizes", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "Ljava/util/ArrayList;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "getInputSizeshNQ4ISI", "Landroidx/collection/ArrayMap;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "Z", "getOutputFormats", "isSeekingSupported", "()Z", "getHighSpeedVideoSizesFor", "getInputFormats", "getOutputMinFrameDurationlomOqCM", "getOutputSizes", "getOutputSizeshNQ4ISI", "getOutputStallDurationlomOqCM", "getOutputStallDuration", "Landroidx/fragment/app/FragmentTransitionImpl;", "()Landroidx/fragment/app/FragmentTransitionImpl;", "Ljava/util/List;", "()Ljava/util/List;", "getValidOutputFormatsForInputhNQ4ISI", "Landroidx/core/os/CancellationSignal;", "unwrapAs", "Landroidx/core/os/CancellationSignal;", "toString"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class TransitionEffect extends androidx.fragment.app.SpecialEffectsController.Effect {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.util.ArrayList<java.lang.String> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        java.lang.Object getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        boolean getInputFormats;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.util.ArrayList<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final androidx.fragment.app.SpecialEffectsController.Operation Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private final androidx.collection.ArrayMap<java.lang.String, android.view.View> getOutputMinFrameDuration;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private final java.util.ArrayList<android.view.View> getOutputMinFrameDurationlomOqCM;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.collection.ArrayMap<java.lang.String, android.view.View> getHighSpeedVideoFpsRanges;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private final androidx.fragment.app.SpecialEffectsController.Operation getInputSizeshNQ4ISI;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private final boolean getOutputFormats;

        /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
        private final java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> getValidOutputFormatsForInputhNQ4ISI;

        /* renamed from: getOutputSizes, reason: from kotlin metadata */
        private final java.util.ArrayList<android.view.View> getOutputSizeshNQ4ISI;

        /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.fragment.app.FragmentTransitionImpl getOutputSizes;
        private final java.lang.Object getOutputStallDuration;
        private final androidx.collection.ArrayMap<java.lang.String, java.lang.String> getOutputStallDurationlomOqCM;

        /* renamed from: unwrapAs, reason: from kotlin metadata */
        private final androidx.core.os.CancellationSignal toString;

        public final java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> getHighSpeedVideoFpsRanges() {
            return this.getValidOutputFormatsForInputhNQ4ISI;
        }

        /* renamed from: getHighSpeedVideoSizes, reason: from getter */
        public final androidx.fragment.app.SpecialEffectsController.Operation getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final androidx.fragment.app.SpecialEffectsController.Operation getGetInputSizeshNQ4ISI() {
            return this.getInputSizeshNQ4ISI;
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final androidx.fragment.app.FragmentTransitionImpl getGetOutputSizes() {
            return this.getOutputSizes;
        }

        public TransitionEffect(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> list, androidx.fragment.app.SpecialEffectsController.Operation operation, androidx.fragment.app.SpecialEffectsController.Operation operation2, androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, java.lang.Object obj, java.util.ArrayList<android.view.View> arrayList, java.util.ArrayList<android.view.View> arrayList2, androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap, java.util.ArrayList<java.lang.String> arrayList3, java.util.ArrayList<java.lang.String> arrayList4, androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap2, androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap3, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentTransitionImpl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayMap, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayMap2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayMap3, "");
            this.getValidOutputFormatsForInputhNQ4ISI = list;
            this.Camera2StreamConfigurationMap = operation;
            this.getInputSizeshNQ4ISI = operation2;
            this.getOutputSizes = fragmentTransitionImpl;
            this.getOutputStallDuration = obj;
            this.getOutputMinFrameDurationlomOqCM = arrayList;
            this.getOutputSizeshNQ4ISI = arrayList2;
            this.getOutputStallDurationlomOqCM = arrayMap;
            this.getHighResolutionOutputSizeshNQ4ISI = arrayList3;
            this.getHighSpeedVideoFpsRangesFor = arrayList4;
            this.getHighSpeedVideoFpsRanges = arrayMap2;
            this.getOutputMinFrameDuration = arrayMap3;
            this.getOutputFormats = z;
            this.toString = new androidx.core.os.CancellationSignal();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* renamed from: isSeekingSupported */
        public final boolean getIsSeekingSupported() {
            if (!this.getOutputSizes.isSeekingSupported()) {
                return false;
            }
            java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> list = this.getValidOutputFormatsForInputhNQ4ISI;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                for (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo transitionInfo : list) {
                    if (android.os.Build.VERSION.SDK_INT < 34 || transitionInfo.getGetHighResolutionOutputSizeshNQ4ISI() == null || !this.getOutputSizes.isSeekingSupported(transitionInfo.getGetHighResolutionOutputSizeshNQ4ISI())) {
                        return false;
                    }
                }
            }
            java.lang.Object obj = this.getOutputStallDuration;
            return obj == null || this.getOutputSizes.isSeekingSupported(obj);
        }

        private boolean Camera2StreamConfigurationMap() {
            java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> list = this.getValidOutputFormatsForInputhNQ4ISI;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return true;
            }
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().getFragment().mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public final void onStart(final android.view.ViewGroup p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (p0.isLaidOut()) {
                if (Camera2StreamConfigurationMap() && this.getOutputStallDuration != null && !getIsSeekingSupported()) {
                    java.util.Objects.toString(this.getOutputStallDuration);
                    java.util.Objects.toString(this.Camera2StreamConfigurationMap);
                    java.util.Objects.toString(this.getInputSizeshNQ4ISI);
                }
                if (getIsSeekingSupported() && Camera2StreamConfigurationMap()) {
                    final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlin.Pair<java.util.ArrayList<android.view.View>, java.lang.Object> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0, this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
                    java.util.ArrayList<android.view.View> component1 = highSpeedVideoFpsRangesFor.component1();
                    final java.lang.Object component2 = highSpeedVideoFpsRangesFor.component2();
                    java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> list = this.getValidOutputFormatsForInputhNQ4ISI;
                    java.util.ArrayList<androidx.fragment.app.SpecialEffectsController.Operation> arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation());
                    }
                    for (final androidx.fragment.app.SpecialEffectsController.Operation operation : arrayList) {
                        this.getOutputSizes.setListenerForTransitionEnd(operation.getFragment(), component2, this.toString, new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef.this);
                            }
                        }, new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.getHighSpeedVideoFpsRangesFor(androidx.fragment.app.SpecialEffectsController.Operation.this, this);
                            }
                        });
                    }
                    getHighSpeedVideoSizes(component1, p0, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            Camera2StreamConfigurationMap();
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1] */
                        public final void Camera2StreamConfigurationMap() {
                            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                            androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect transitionEffect = androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.this;
                            transitionEffect.getHighSpeedVideoSizes = transitionEffect.getGetOutputSizes().controlDelayedTransition(p0, component2);
                            if (androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.this.getHighSpeedVideoSizes == null) {
                                androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                                androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.this.getInputFormats = true;
                                return;
                            }
                            objectRef.element = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.AnonymousClass1(androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.this, component2, p0);
                            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.this.getCamera2StreamConfigurationMap();
                                androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.this.getGetInputSizeshNQ4ISI();
                            }
                        }

                        @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getHighResolutionOutputSizeshNQ4ISI", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1, reason: invalid class name */
                        static final class AnonymousClass1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
                            final /* synthetic */ java.lang.Object $Camera2StreamConfigurationMap;
                            final /* synthetic */ android.view.ViewGroup $getHighSpeedVideoFpsRangesFor;
                            final /* synthetic */ androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect getHighSpeedVideoFpsRanges;

                            @Override // kotlin.jvm.functions.Function0
                            public final /* synthetic */ kotlin.Unit invoke() {
                                getHighResolutionOutputSizeshNQ4ISI();
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void getHighResolutionOutputSizeshNQ4ISI() {
                                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
                                if (!(highSpeedVideoFpsRanges instanceof java.util.Collection) || !highSpeedVideoFpsRanges.isEmpty()) {
                                    java.util.Iterator<T> it = highSpeedVideoFpsRanges.iterator();
                                    while (it.hasNext()) {
                                        if (!((androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().getIsSeeking()) {
                                            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                                            androidx.core.os.CancellationSignal cancellationSignal = new androidx.core.os.CancellationSignal();
                                            androidx.fragment.app.FragmentTransitionImpl getOutputSizes = this.getHighSpeedVideoFpsRanges.getGetOutputSizes();
                                            androidx.fragment.app.Fragment fragment = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges().get(0).getOperation().getFragment();
                                            java.lang.Object obj = this.$Camera2StreamConfigurationMap;
                                            final androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.getHighSpeedVideoFpsRanges;
                                            getOutputSizes.setListenerForTransitionEnd(fragment, obj, cancellationSignal, 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005c: INVOKE 
                                                  (r1v7 'getOutputSizes' androidx.fragment.app.FragmentTransitionImpl)
                                                  (r2v6 'fragment' androidx.fragment.app.Fragment)
                                                  (r3v1 'obj' java.lang.Object)
                                                  (r0v4 'cancellationSignal' androidx.core.os.CancellationSignal)
                                                  (wrap:java.lang.Runnable:0x0059: CONSTRUCTOR (r5v0 'transitionEffect' androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect A[DONT_INLINE]) A[MD:(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void (m), WRAPPED] (LINE:825) call: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1$$ExternalSyntheticLambda1.<init>(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void type: CONSTRUCTOR)
                                                 VIRTUAL call: androidx.fragment.app.FragmentTransitionImpl.setListenerForTransitionEnd(androidx.fragment.app.Fragment, java.lang.Object, androidx.core.os.CancellationSignal, java.lang.Runnable):void A[MD:(androidx.fragment.app.Fragment, java.lang.Object, androidx.core.os.CancellationSignal, java.lang.Runnable):void (m)] (LINE:825) in method: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.1.getHighResolutionOutputSizeshNQ4ISI():void, file: classes3.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1$$ExternalSyntheticLambda1, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 35 more
                                                */
                                            /*
                                                this = this;
                                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.getHighSpeedVideoFpsRanges
                                                java.util.List r0 = r0.getHighSpeedVideoFpsRanges()
                                                java.lang.Iterable r0 = (java.lang.Iterable) r0
                                                boolean r1 = r0 instanceof java.util.Collection
                                                r2 = 2
                                                if (r1 == 0) goto L16
                                                r1 = r0
                                                java.util.Collection r1 = (java.util.Collection) r1
                                                boolean r1 = r1.isEmpty()
                                                if (r1 != 0) goto L63
                                            L16:
                                                java.util.Iterator r0 = r0.iterator()
                                            L1a:
                                                boolean r1 = r0.hasNext()
                                                if (r1 == 0) goto L63
                                                java.lang.Object r1 = r0.next()
                                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
                                                androidx.fragment.app.SpecialEffectsController$Operation r1 = r1.getOperation()
                                                boolean r1 = r1.getIsSeeking()
                                                if (r1 != 0) goto L1a
                                                androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                                                androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal
                                                r0.<init>()
                                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.getHighSpeedVideoFpsRanges
                                                androidx.fragment.app.FragmentTransitionImpl r1 = r1.getGetOutputSizes()
                                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r6.getHighSpeedVideoFpsRanges
                                                java.util.List r2 = r2.getHighSpeedVideoFpsRanges()
                                                r3 = 0
                                                java.lang.Object r2 = r2.get(r3)
                                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r2 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r2
                                                androidx.fragment.app.SpecialEffectsController$Operation r2 = r2.getOperation()
                                                androidx.fragment.app.Fragment r2 = r2.getFragment()
                                                java.lang.Object r3 = r6.$Camera2StreamConfigurationMap
                                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1$$ExternalSyntheticLambda1 r4 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1$$ExternalSyntheticLambda1
                                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r5 = r6.getHighSpeedVideoFpsRanges
                                                r4.<init>(r5)
                                                r1.setListenerForTransitionEnd(r2, r3, r0, r4)
                                                r0.cancel()
                                                return
                                            L63:
                                                androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.getHighSpeedVideoFpsRanges
                                                androidx.fragment.app.FragmentTransitionImpl r0 = r0.getGetOutputSizes()
                                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.getHighSpeedVideoFpsRanges
                                                java.lang.Object r1 = r1.getHighSpeedVideoSizes
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1$$ExternalSyntheticLambda0 r2 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1$$ExternalSyntheticLambda0
                                                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r3 = r6.getHighSpeedVideoFpsRanges
                                                android.view.ViewGroup r4 = r6.$getHighSpeedVideoFpsRangesFor
                                                r2.<init>(r3, r4)
                                                r0.animateToStart(r1, r2)
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI():void");
                                        }

                                        public static /* synthetic */ void getHighSpeedVideoSizes(androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect transitionEffect, android.view.ViewGroup viewGroup) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transitionEffect, "");
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "");
                                            java.util.Iterator<T> it = transitionEffect.getHighSpeedVideoFpsRanges().iterator();
                                            while (it.hasNext()) {
                                                androidx.fragment.app.SpecialEffectsController.Operation operation = ((androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation();
                                                android.view.View view = operation.getFragment().getView();
                                                if (view != null) {
                                                    operation.getFinalState().applyState(view, viewGroup);
                                                }
                                            }
                                        }

                                        public static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect transitionEffect) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transitionEffect, "");
                                            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                                            java.util.Iterator<T> it = transitionEffect.getHighSpeedVideoFpsRanges().iterator();
                                            while (it.hasNext()) {
                                                ((androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().completeEffect(transitionEffect);
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect transitionEffect, java.lang.Object obj, android.view.ViewGroup viewGroup) {
                                            super(0);
                                            this.getHighSpeedVideoFpsRanges = transitionEffect;
                                            this.$Camera2StreamConfigurationMap = obj;
                                            this.$getHighSpeedVideoFpsRangesFor = viewGroup;
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        java.util.Iterator<T> it2 = this.getValidOutputFormatsForInputhNQ4ISI.iterator();
                        while (it2.hasNext()) {
                            ((androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) it2.next()).getOperation();
                            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                        }
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.Effect
                    public final void onProgress(androidx.view.BackEventCompat p0, android.view.ViewGroup p1) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
                        java.lang.Object obj = this.getHighSpeedVideoSizes;
                        if (obj != null) {
                            this.getOutputSizes.setCurrentPlayTime(obj, p0.getProgress());
                        }
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.Effect
                    public final void onCommit(final android.view.ViewGroup p0) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                        if (p0.isLaidOut() && !this.getInputFormats) {
                            java.lang.Object obj = this.getHighSpeedVideoSizes;
                            if (obj != null) {
                                androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl = this.getOutputSizes;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                                fragmentTransitionImpl.animateToEnd(obj);
                                androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                                return;
                            }
                            kotlin.Pair<java.util.ArrayList<android.view.View>, java.lang.Object> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0, this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
                            java.util.ArrayList<android.view.View> component1 = highSpeedVideoFpsRangesFor.component1();
                            final java.lang.Object component2 = highSpeedVideoFpsRangesFor.component2();
                            java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> list = this.getValidOutputFormatsForInputhNQ4ISI;
                            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController.Operation> arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                            java.util.Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation());
                            }
                            for (final androidx.fragment.app.SpecialEffectsController.Operation operation : arrayList) {
                                this.getOutputSizes.setListenerForTransitionEnd(operation.getFragment(), component2, this.toString, new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.getHighResolutionOutputSizeshNQ4ISI(androidx.fragment.app.SpecialEffectsController.Operation.this, this);
                                    }
                                });
                            }
                            getHighSpeedVideoSizes(component1, p0, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                                @Override // kotlin.jvm.functions.Function0
                                public final /* synthetic */ kotlin.Unit invoke() {
                                    Camera2StreamConfigurationMap();
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void Camera2StreamConfigurationMap() {
                                    androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.this.getGetOutputSizes().beginDelayedTransition(p0, component2);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }
                            });
                            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                            return;
                        }
                        for (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo transitionInfo : this.getValidOutputFormatsForInputhNQ4ISI) {
                            transitionInfo.getOperation();
                            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                            transitionInfo.getOperation().completeEffect(this);
                        }
                        this.getInputFormats = false;
                    }

                    private final kotlin.Pair<java.util.ArrayList<android.view.View>, java.lang.Object> getHighSpeedVideoFpsRangesFor(android.view.ViewGroup p0, androidx.fragment.app.SpecialEffectsController.Operation p1, androidx.fragment.app.SpecialEffectsController.Operation p2) {
                        java.util.Iterator<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> it;
                        final androidx.fragment.app.SpecialEffectsController.Operation operation = p1;
                        final androidx.fragment.app.SpecialEffectsController.Operation operation2 = p2;
                        android.view.View view = new android.view.View(p0.getContext());
                        final android.graphics.Rect rect = new android.graphics.Rect();
                        java.util.Iterator<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> it2 = this.getValidOutputFormatsForInputhNQ4ISI.iterator();
                        boolean z = false;
                        android.view.View view2 = null;
                        while (it2.hasNext()) {
                            if (it2.next().getHighSpeedVideoSizes != null && operation2 != null && operation != null && !this.getOutputStallDurationlomOqCM.isEmpty() && this.getOutputStallDuration != null) {
                                androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(p1.getFragment(), p2.getFragment(), this.getOutputFormats, this.getHighSpeedVideoFpsRanges, true);
                                android.view.ViewGroup viewGroup = p0;
                                androidx.core.view.OneShotPreDrawListener.add(viewGroup, new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.getHighSpeedVideoFpsRangesFor(androidx.fragment.app.SpecialEffectsController.Operation.this, operation2, this);
                                    }
                                });
                                this.getOutputMinFrameDurationlomOqCM.addAll(this.getHighSpeedVideoFpsRanges.values());
                                if (!this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                                    java.lang.String str = this.getHighSpeedVideoFpsRangesFor.get(0);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                                    view2 = this.getHighSpeedVideoFpsRanges.get(str);
                                    this.getOutputSizes.setEpicenter(this.getOutputStallDuration, view2);
                                }
                                this.getOutputSizeshNQ4ISI.addAll(this.getOutputMinFrameDuration.values());
                                if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                                    java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI.get(0);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
                                    final android.view.View view3 = this.getOutputMinFrameDuration.get(str2);
                                    if (view3 != null) {
                                        final androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl = this.getOutputSizes;
                                        androidx.core.view.OneShotPreDrawListener.add(viewGroup, new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.getHighResolutionOutputSizeshNQ4ISI(androidx.fragment.app.FragmentTransitionImpl.this, view3, rect);
                                            }
                                        });
                                        z = true;
                                    }
                                }
                                this.getOutputSizes.setSharedElementTargets(this.getOutputStallDuration, view, this.getOutputMinFrameDurationlomOqCM);
                                androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl2 = this.getOutputSizes;
                                java.lang.Object obj = this.getOutputStallDuration;
                                fragmentTransitionImpl2.scheduleRemoveTargets(obj, null, null, null, null, obj, this.getOutputSizeshNQ4ISI);
                            }
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> it3 = this.getValidOutputFormatsForInputhNQ4ISI.iterator();
                        java.lang.Object obj2 = null;
                        java.lang.Object obj3 = null;
                        while (it3.hasNext()) {
                            androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo next = it3.next();
                            androidx.fragment.app.SpecialEffectsController.Operation operation3 = next.getOperation();
                            java.lang.Object cloneTransition = this.getOutputSizes.cloneTransition(next.getGetHighResolutionOutputSizeshNQ4ISI());
                            if (cloneTransition != null) {
                                final java.util.ArrayList<android.view.View> arrayList2 = new java.util.ArrayList<>();
                                it = it3;
                                android.view.View view4 = operation3.getFragment().mView;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view4, "");
                                Camera2StreamConfigurationMap(arrayList2, view4);
                                if (this.getOutputStallDuration != null && (operation3 == operation2 || operation3 == operation)) {
                                    if (operation3 == operation2) {
                                        arrayList2.removeAll(kotlin.collections.CollectionsKt.toSet(this.getOutputMinFrameDurationlomOqCM));
                                    } else {
                                        arrayList2.removeAll(kotlin.collections.CollectionsKt.toSet(this.getOutputSizeshNQ4ISI));
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    this.getOutputSizes.addTarget(cloneTransition, view);
                                } else {
                                    this.getOutputSizes.addTargets(cloneTransition, arrayList2);
                                    this.getOutputSizes.scheduleRemoveTargets(cloneTransition, cloneTransition, arrayList2, null, null, null, null);
                                    if (operation3.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.GONE) {
                                        operation3.setAwaitingContainerChanges(false);
                                        java.util.ArrayList<android.view.View> arrayList3 = new java.util.ArrayList<>(arrayList2);
                                        arrayList3.remove(operation3.getFragment().mView);
                                        this.getOutputSizes.scheduleHideFragmentView(cloneTransition, operation3.getFragment().mView, arrayList3);
                                        androidx.core.view.OneShotPreDrawListener.add(p0, new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect.getHighSpeedVideoFpsRanges(arrayList2);
                                            }
                                        });
                                    }
                                }
                                if (operation3.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) {
                                    arrayList.addAll(arrayList2);
                                    if (z) {
                                        this.getOutputSizes.setEpicenter(cloneTransition, rect);
                                    }
                                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                        java.util.Iterator<android.view.View> it4 = arrayList2.iterator();
                                        while (it4.hasNext()) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it4.next(), "");
                                        }
                                    }
                                } else {
                                    this.getOutputSizes.setEpicenter(cloneTransition, view2);
                                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                        java.util.Iterator<android.view.View> it5 = arrayList2.iterator();
                                        while (it5.hasNext()) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it5.next(), "");
                                        }
                                    }
                                }
                                if (next.getGetHighSpeedVideoFpsRangesFor()) {
                                    obj2 = this.getOutputSizes.mergeTransitionsTogether(obj2, cloneTransition, null);
                                } else {
                                    obj3 = this.getOutputSizes.mergeTransitionsTogether(obj3, cloneTransition, null);
                                }
                            } else {
                                it = it3;
                            }
                            operation = p1;
                            operation2 = p2;
                            it3 = it;
                        }
                        java.lang.Object mergeTransitionsInSequence = this.getOutputSizes.mergeTransitionsInSequence(obj2, obj3, this.getOutputStallDuration);
                        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                            java.util.Objects.toString(mergeTransitionsInSequence);
                            java.util.Objects.toString(p0);
                        }
                        return new kotlin.Pair<>(arrayList, mergeTransitionsInSequence);
                    }

                    private final void getHighSpeedVideoSizes(java.util.ArrayList<android.view.View> p0, android.view.ViewGroup p1, kotlin.jvm.functions.Function0<kotlin.Unit> p2) {
                        java.util.ArrayList<android.view.View> arrayList = p0;
                        androidx.fragment.app.FragmentTransition.setViewVisibility(arrayList, 4);
                        java.util.ArrayList<java.lang.String> Camera2StreamConfigurationMap = this.getOutputSizes.Camera2StreamConfigurationMap(this.getOutputSizeshNQ4ISI);
                        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                            java.util.Iterator<android.view.View> it = this.getOutputMinFrameDurationlomOqCM.iterator();
                            while (it.hasNext()) {
                                android.view.View next = it.next();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "");
                                androidx.core.view.ViewCompat.getTransitionName(next);
                            }
                            java.util.Iterator<android.view.View> it2 = this.getOutputSizeshNQ4ISI.iterator();
                            while (it2.hasNext()) {
                                android.view.View next2 = it2.next();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next2, "");
                                androidx.core.view.ViewCompat.getTransitionName(next2);
                            }
                        }
                        p2.invoke();
                        this.getOutputSizes.getHighResolutionOutputSizeshNQ4ISI(p1, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizeshNQ4ISI, Camera2StreamConfigurationMap, this.getOutputStallDurationlomOqCM);
                        androidx.fragment.app.FragmentTransition.setViewVisibility(arrayList, 0);
                        this.getOutputSizes.swapSharedElementTargets(this.getOutputStallDuration, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizeshNQ4ISI);
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.Effect
                    public final void onCancel(android.view.ViewGroup p0) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                        this.toString.cancel();
                    }

                    private final void Camera2StreamConfigurationMap(java.util.ArrayList<android.view.View> p0, android.view.View p1) {
                        if (p1 instanceof android.view.ViewGroup) {
                            android.view.ViewGroup viewGroup = (android.view.ViewGroup) p1;
                            if (androidx.core.view.ViewGroupCompat.isTransitionGroup(viewGroup)) {
                                if (p0.contains(p1)) {
                                    return;
                                }
                                p0.add(p1);
                                return;
                            }
                            int childCount = viewGroup.getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                android.view.View childAt = viewGroup.getChildAt(i);
                                if (childAt.getVisibility() == 0) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "");
                                    Camera2StreamConfigurationMap(p0, childAt);
                                }
                            }
                            return;
                        }
                        if (p0.contains(p1)) {
                            return;
                        }
                        p0.add(p1);
                    }

                    public static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.fragment.app.SpecialEffectsController.Operation operation, androidx.fragment.app.SpecialEffectsController.Operation operation2, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect transitionEffect) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transitionEffect, "");
                        androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), transitionEffect.getOutputFormats, transitionEffect.getOutputMinFrameDuration, false);
                    }

                    public static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.fragment.app.FragmentTransitionImpl fragmentTransitionImpl, android.view.View view, android.graphics.Rect rect) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentTransitionImpl, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
                        fragmentTransitionImpl.getBoundsOnScreen(view, rect);
                    }

                    public static /* synthetic */ void getHighSpeedVideoFpsRanges(java.util.ArrayList arrayList) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
                        androidx.fragment.app.FragmentTransition.setViewVisibility(arrayList, 4);
                    }

                    public static /* synthetic */ void Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef objectRef) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "");
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) objectRef.element;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }

                    public static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.fragment.app.SpecialEffectsController.Operation operation, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect transitionEffect) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transitionEffect, "");
                        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                        operation.completeEffect(transitionEffect);
                    }

                    public static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.fragment.app.SpecialEffectsController.Operation operation, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect transitionEffect) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transitionEffect, "");
                        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                        operation.completeEffect(transitionEffect);
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api24Impl;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "totalDuration", "(Landroid/animation/AnimatorSet;)J"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Api24Impl {
                    public static final androidx.fragment.app.DefaultSpecialEffectsController.Api24Impl INSTANCE = new androidx.fragment.app.DefaultSpecialEffectsController.Api24Impl();

                    private Api24Impl() {
                    }

                    public final long totalDuration(android.animation.AnimatorSet animatorSet) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatorSet, "");
                        return animatorSet.getTotalDuration();
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api26Impl;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "reverse", "(Landroid/animation/AnimatorSet;)V", "", "time", "setCurrentPlayTime", "(Landroid/animation/AnimatorSet;J)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Api26Impl {
                    public static final androidx.fragment.app.DefaultSpecialEffectsController.Api26Impl INSTANCE = new androidx.fragment.app.DefaultSpecialEffectsController.Api26Impl();

                    private Api26Impl() {
                    }

                    public final void reverse(android.animation.AnimatorSet animatorSet) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatorSet, "");
                        animatorSet.reverse();
                    }

                    public final void setCurrentPlayTime(android.animation.AnimatorSet animatorSet, long time) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatorSet, "");
                        animatorSet.setCurrentPlayTime(time);
                    }
                }

                /* renamed from: $r8$lambda$d3w-9IvNeMua7NQR_JFd0slR_vo, reason: not valid java name */
                public static /* synthetic */ void m9149$r8$lambda$d3w9IvNeMua7NQR_JFd0slR_vo(androidx.fragment.app.DefaultSpecialEffectsController defaultSpecialEffectsController, androidx.fragment.app.SpecialEffectsController.Operation operation) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultSpecialEffectsController, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
                    defaultSpecialEffectsController.applyContainerChangesToOperation$fragment_release(operation);
                }
            }
