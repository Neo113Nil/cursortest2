package androidx.transition;

/* loaded from: classes3.dex */
public class TransitionManager {
    private static androidx.transition.Transition Camera2StreamConfigurationMap = new androidx.transition.AutoTransition();
    private static java.lang.ThreadLocal<java.lang.ref.WeakReference<androidx.collection.ArrayMap<android.view.ViewGroup, java.util.ArrayList<androidx.transition.Transition>>>> getHighResolutionOutputSizeshNQ4ISI = new java.lang.ThreadLocal<>();
    static java.util.ArrayList<android.view.ViewGroup> getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
    private androidx.collection.ArrayMap<androidx.transition.Scene, androidx.transition.Transition> getHighSpeedVideoFpsRangesFor = new androidx.collection.ArrayMap<>();
    private androidx.collection.ArrayMap<androidx.transition.Scene, androidx.collection.ArrayMap<androidx.transition.Scene, androidx.transition.Transition>> getHighSpeedVideoSizes = new androidx.collection.ArrayMap<>();

    public void setTransition(androidx.transition.Scene scene, androidx.transition.Transition transition) {
        this.getHighSpeedVideoFpsRangesFor.put(scene, transition);
    }

    public void setTransition(androidx.transition.Scene scene, androidx.transition.Scene scene2, androidx.transition.Transition transition) {
        androidx.collection.ArrayMap<androidx.transition.Scene, androidx.transition.Transition> arrayMap = this.getHighSpeedVideoSizes.get(scene2);
        if (arrayMap == null) {
            arrayMap = new androidx.collection.ArrayMap<>();
            this.getHighSpeedVideoSizes.put(scene2, arrayMap);
        }
        arrayMap.put(scene, transition);
    }

    private static void getHighSpeedVideoSizes(androidx.transition.Scene scene, androidx.transition.Transition transition) {
        android.view.ViewGroup sceneRoot = scene.getSceneRoot();
        if (getHighSpeedVideoFpsRanges.contains(sceneRoot)) {
            return;
        }
        androidx.transition.Scene currentScene = androidx.transition.Scene.getCurrentScene(sceneRoot);
        if (transition == null) {
            if (currentScene != null) {
                currentScene.exit();
            }
            scene.enter();
            return;
        }
        getHighSpeedVideoFpsRanges.add(sceneRoot);
        androidx.transition.Transition mo9425clone = transition.mo9425clone();
        if (currentScene != null && currentScene.getHighResolutionOutputSizeshNQ4ISI > 0) {
            mo9425clone.setCanRemoveViews(true);
        }
        getHighSpeedVideoSizes(sceneRoot, mo9425clone);
        scene.enter();
        if (mo9425clone == null || sceneRoot == null) {
            return;
        }
        androidx.transition.TransitionManager.MultiListener multiListener = new androidx.transition.TransitionManager.MultiListener(mo9425clone, sceneRoot);
        sceneRoot.addOnAttachStateChangeListener(multiListener);
        sceneRoot.getViewTreeObserver().addOnPreDrawListener(multiListener);
    }

    static androidx.collection.ArrayMap<android.view.ViewGroup, java.util.ArrayList<androidx.transition.Transition>> getHighSpeedVideoFpsRangesFor() {
        androidx.collection.ArrayMap<android.view.ViewGroup, java.util.ArrayList<androidx.transition.Transition>> arrayMap;
        java.lang.ref.WeakReference<androidx.collection.ArrayMap<android.view.ViewGroup, java.util.ArrayList<androidx.transition.Transition>>> weakReference = getHighResolutionOutputSizeshNQ4ISI.get();
        if (weakReference != null && (arrayMap = weakReference.get()) != null) {
            return arrayMap;
        }
        androidx.collection.ArrayMap<android.view.ViewGroup, java.util.ArrayList<androidx.transition.Transition>> arrayMap2 = new androidx.collection.ArrayMap<>();
        getHighResolutionOutputSizeshNQ4ISI.set(new java.lang.ref.WeakReference<>(arrayMap2));
        return arrayMap2;
    }

    static class MultiListener implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
        androidx.transition.Transition getHighSpeedVideoFpsRanges;
        android.view.ViewGroup getHighSpeedVideoFpsRangesFor;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
        }

        MultiListener(androidx.transition.Transition transition, android.view.ViewGroup viewGroup) {
            this.getHighSpeedVideoFpsRanges = transition;
            this.getHighSpeedVideoFpsRangesFor = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.getHighSpeedVideoFpsRangesFor.getViewTreeObserver().removeOnPreDrawListener(this);
            this.getHighSpeedVideoFpsRangesFor.removeOnAttachStateChangeListener(this);
            if (!androidx.transition.TransitionManager.getHighSpeedVideoFpsRanges.remove(this.getHighSpeedVideoFpsRangesFor)) {
                return true;
            }
            final androidx.collection.ArrayMap<android.view.ViewGroup, java.util.ArrayList<androidx.transition.Transition>> highSpeedVideoFpsRangesFor = androidx.transition.TransitionManager.getHighSpeedVideoFpsRangesFor();
            java.util.ArrayList<androidx.transition.Transition> arrayList = highSpeedVideoFpsRangesFor.get(this.getHighSpeedVideoFpsRangesFor);
            java.util.ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
                highSpeedVideoFpsRangesFor.put(this.getHighSpeedVideoFpsRangesFor, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new java.util.ArrayList(arrayList);
            }
            arrayList.add(this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoFpsRanges.addListener(new androidx.transition.TransitionListenerAdapter() { // from class: androidx.transition.TransitionManager.MultiListener.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public void onTransitionEnd(androidx.transition.Transition transition) {
                    ((java.util.ArrayList) highSpeedVideoFpsRangesFor.get(androidx.transition.TransitionManager.MultiListener.this.getHighSpeedVideoFpsRangesFor)).remove(transition);
                    transition.removeListener(this);
                }
            });
            this.getHighSpeedVideoFpsRanges.captureValues(this.getHighSpeedVideoFpsRangesFor, false);
            if (arrayList2 != null) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((androidx.transition.Transition) it.next()).resume(this.getHighSpeedVideoFpsRangesFor);
                }
            }
            this.getHighSpeedVideoFpsRanges.playTransition(this.getHighSpeedVideoFpsRangesFor);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            this.getHighSpeedVideoFpsRangesFor.getViewTreeObserver().removeOnPreDrawListener(this);
            this.getHighSpeedVideoFpsRangesFor.removeOnAttachStateChangeListener(this);
            androidx.transition.TransitionManager.getHighSpeedVideoFpsRanges.remove(this.getHighSpeedVideoFpsRangesFor);
            java.util.ArrayList<androidx.transition.Transition> arrayList = androidx.transition.TransitionManager.getHighSpeedVideoFpsRangesFor().get(this.getHighSpeedVideoFpsRangesFor);
            if (arrayList != null && arrayList.size() > 0) {
                java.util.Iterator<androidx.transition.Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().resume(this.getHighSpeedVideoFpsRangesFor);
                }
            }
            this.getHighSpeedVideoFpsRanges.clearValues(true);
        }
    }

    private static void getHighSpeedVideoSizes(android.view.ViewGroup viewGroup, androidx.transition.Transition transition) {
        java.util.ArrayList<androidx.transition.Transition> arrayList = getHighSpeedVideoFpsRangesFor().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            java.util.Iterator<androidx.transition.Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (transition != null) {
            transition.captureValues(viewGroup, true);
        }
        androidx.transition.Scene currentScene = androidx.transition.Scene.getCurrentScene(viewGroup);
        if (currentScene != null) {
            currentScene.exit();
        }
    }

    public static void go(androidx.transition.Scene scene) {
        getHighSpeedVideoSizes(scene, Camera2StreamConfigurationMap);
    }

    public static androidx.transition.TransitionSeekController createSeekController(androidx.transition.Scene scene, androidx.transition.Transition transition) {
        android.view.ViewGroup sceneRoot = scene.getSceneRoot();
        if (!transition.isSeekingSupported()) {
            throw new java.lang.IllegalArgumentException("The Transition must support seeking.");
        }
        if (getHighSpeedVideoFpsRanges.contains(sceneRoot)) {
            return null;
        }
        androidx.transition.Scene currentScene = androidx.transition.Scene.getCurrentScene(sceneRoot);
        if (!sceneRoot.isLaidOut() || android.os.Build.VERSION.SDK_INT < 34) {
            if (currentScene != null) {
                currentScene.exit();
            }
            scene.enter();
            return null;
        }
        getHighSpeedVideoFpsRanges.add(sceneRoot);
        androidx.transition.Transition mo9425clone = transition.mo9425clone();
        androidx.transition.TransitionSet transitionSet = new androidx.transition.TransitionSet();
        transitionSet.addTransition(mo9425clone);
        if (currentScene != null && currentScene.getHighResolutionOutputSizeshNQ4ISI > 0) {
            transitionSet.setCanRemoveViews(true);
        }
        getHighSpeedVideoSizes(sceneRoot, transitionSet);
        scene.enter();
        if (sceneRoot != null) {
            androidx.transition.TransitionManager.MultiListener multiListener = new androidx.transition.TransitionManager.MultiListener(transitionSet, sceneRoot);
            sceneRoot.addOnAttachStateChangeListener(multiListener);
            sceneRoot.getViewTreeObserver().addOnPreDrawListener(multiListener);
        }
        return transitionSet.createSeekController();
    }

    public static void go(androidx.transition.Scene scene, androidx.transition.Transition transition) {
        getHighSpeedVideoSizes(scene, transition);
    }

    public static void beginDelayedTransition(android.view.ViewGroup viewGroup) {
        beginDelayedTransition(viewGroup, null);
    }

    public static void beginDelayedTransition(android.view.ViewGroup viewGroup, androidx.transition.Transition transition) {
        if (getHighSpeedVideoFpsRanges.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        getHighSpeedVideoFpsRanges.add(viewGroup);
        if (transition == null) {
            transition = Camera2StreamConfigurationMap;
        }
        androidx.transition.Transition mo9425clone = transition.mo9425clone();
        getHighSpeedVideoSizes(viewGroup, mo9425clone);
        androidx.transition.Scene.getHighSpeedVideoSizes(viewGroup, null);
        if (mo9425clone == null || viewGroup == null) {
            return;
        }
        androidx.transition.TransitionManager.MultiListener multiListener = new androidx.transition.TransitionManager.MultiListener(mo9425clone, viewGroup);
        viewGroup.addOnAttachStateChangeListener(multiListener);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(multiListener);
    }

    public static androidx.transition.TransitionSeekController controlDelayedTransition(android.view.ViewGroup viewGroup, androidx.transition.Transition transition) {
        if (getHighSpeedVideoFpsRanges.contains(viewGroup) || !viewGroup.isLaidOut() || android.os.Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!transition.isSeekingSupported()) {
            throw new java.lang.IllegalArgumentException("The Transition must support seeking.");
        }
        getHighSpeedVideoFpsRanges.add(viewGroup);
        androidx.transition.Transition mo9425clone = transition.mo9425clone();
        androidx.transition.TransitionSet transitionSet = new androidx.transition.TransitionSet();
        transitionSet.addTransition(mo9425clone);
        getHighSpeedVideoSizes(viewGroup, transitionSet);
        androidx.transition.Scene.getHighSpeedVideoSizes(viewGroup, null);
        if (viewGroup != null) {
            androidx.transition.TransitionManager.MultiListener multiListener = new androidx.transition.TransitionManager.MultiListener(transitionSet, viewGroup);
            viewGroup.addOnAttachStateChangeListener(multiListener);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(multiListener);
        }
        viewGroup.invalidate();
        return transitionSet.createSeekController();
    }

    public static void endTransitions(android.view.ViewGroup viewGroup) {
        getHighSpeedVideoFpsRanges.remove(viewGroup);
        java.util.ArrayList<androidx.transition.Transition> arrayList = getHighSpeedVideoFpsRangesFor().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((androidx.transition.Transition) arrayList2.get(size)).forceToEnd(viewGroup);
        }
    }

    public void transitionTo(androidx.transition.Scene scene) {
        androidx.transition.Transition transition;
        androidx.collection.ArrayMap<androidx.transition.Scene, androidx.transition.Transition> arrayMap;
        androidx.transition.Scene currentScene = androidx.transition.Scene.getCurrentScene(scene.getSceneRoot());
        if ((currentScene == null || (arrayMap = this.getHighSpeedVideoSizes.get(scene)) == null || (transition = arrayMap.get(currentScene)) == null) && (transition = this.getHighSpeedVideoFpsRangesFor.get(scene)) == null) {
            transition = Camera2StreamConfigurationMap;
        }
        getHighSpeedVideoSizes(scene, transition);
    }
}
