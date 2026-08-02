package androidx.compose.ui.tooling.animation;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\f%&'()*+,-./0B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "clock", "", "onSeek", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "Landroidx/compose/ui/tooling/data/Group;", "slotTrees", "", "searchAny", "(Ljava/util/Collection;)Z", "attachAllAnimations", "(Ljava/util/Collection;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "getInputSizeshNQ4ISI", "Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "getHighSpeedVideoFpsRanges", "", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "getInputFormats", "Ljava/util/Set;", "getOutputFormats", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "Search", "RememberSearch", "TargetBasedSearch", "DecaySearch", "InfiniteTransitionSearchInfo", "InfiniteTransitionSearch", "AnimateXAsStateSearchInfo", "AnimateXAsStateSearch", "AnimateContentSizeSearch", "TransitionSearch", "AnimatedVisibilitySearch", "AnimatedContentSearch"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimationSearch {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<androidx.compose.ui.tooling.animation.PreviewAnimationClock> getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Set<androidx.compose.ui.tooling.animation.AnimationSearch.Search<? extends java.lang.Object>> getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.tooling.animation.AnimationSearch.AnimatedContentSearch getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.tooling.animation.AnimationSearch.AnimatedVisibilitySearch getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.util.Set<androidx.compose.ui.tooling.animation.AnimationSearch.Search<? extends java.lang.Object>> getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.tooling.animation.AnimationSearch.TransitionSearch Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.util.Set<androidx.compose.ui.tooling.animation.AnimationSearch.Search<? extends java.lang.Object>> getHighSpeedVideoSizesFor;

    public static /* synthetic */ boolean $r8$lambda$cMvJsTJhw3hZOG60vfqxBRs6hS8(androidx.compose.ui.tooling.data.Group group) {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$urFQ1uiZ_ezwuFf5ls30jKUPDSo(androidx.compose.ui.tooling.data.Group group) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnimationSearch(kotlin.jvm.functions.Function0<? extends androidx.compose.ui.tooling.animation.PreviewAnimationClock> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = function02;
        androidx.compose.ui.tooling.animation.AnimationSearch.TransitionSearch transitionSearch = new androidx.compose.ui.tooling.animation.AnimationSearch.TransitionSearch(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.ui.tooling.animation.AnimationSearch.m8519$r8$lambda$8PZIpNMVdd1IZ6CboQjSO8e_Ig(androidx.compose.ui.tooling.animation.AnimationSearch.this, (androidx.compose.animation.core.Transition) obj);
            }
        });
        this.Camera2StreamConfigurationMap = transitionSearch;
        androidx.compose.ui.tooling.animation.AnimationSearch.AnimatedContentSearch animatedContentSearch = new androidx.compose.ui.tooling.animation.AnimationSearch.AnimatedContentSearch(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.ui.tooling.animation.AnimationSearch.$r8$lambda$caXpeuVS8WGmjmYgRgQK9pcTS7c(androidx.compose.ui.tooling.animation.AnimationSearch.this, (androidx.compose.animation.core.Transition) obj);
            }
        });
        this.getHighSpeedVideoSizes = animatedContentSearch;
        androidx.compose.ui.tooling.animation.AnimationSearch.AnimatedVisibilitySearch animatedVisibilitySearch = new androidx.compose.ui.tooling.animation.AnimationSearch.AnimatedVisibilitySearch(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.ui.tooling.animation.AnimationSearch.m8520$r8$lambda$9eE1EYO_N7SGvG6Nqj8Xxf6otY(androidx.compose.ui.tooling.animation.AnimationSearch.this, (androidx.compose.animation.core.Transition) obj);
            }
        });
        this.getHighSpeedVideoFpsRanges = animatedVisibilitySearch;
        java.util.Set<androidx.compose.ui.tooling.animation.AnimationSearch.Search<? extends java.lang.Object>> plus = kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new androidx.compose.ui.tooling.animation.AnimationSearch.Search[]{transitionSearch, animatedVisibilitySearch}), androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation.INSTANCE.getApiAvailable() ? kotlin.collections.SetsKt.setOf(new androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearch(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.ui.tooling.animation.AnimationSearch.$r8$lambda$q4MWPHzLw6Q2t61OsRvAWkMGtMo(androidx.compose.ui.tooling.animation.AnimationSearch.this, (androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo) obj);
            }
        })) : kotlin.collections.CollectionsKt.emptyList()), (java.lang.Iterable) (androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation.INSTANCE.getApiAvailable() ? kotlin.collections.SetsKt.setOf(new androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearch(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.ui.tooling.animation.AnimationSearch.$r8$lambda$56jpcETosmsOpeCmoN07WNFgZc4(androidx.compose.ui.tooling.animation.AnimationSearch.this, (androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo) obj);
            }
        })) : kotlin.collections.SetsKt.emptySet())), (java.lang.Iterable) (androidx.compose.ui.tooling.animation.AnimatedContentComposeAnimation.INSTANCE.getApiAvailable() ? kotlin.collections.SetsKt.setOf(animatedContentSearch) : kotlin.collections.SetsKt.emptySet()));
        this.getOutputFormats = plus;
        java.util.Set<androidx.compose.ui.tooling.animation.AnimationSearch.Search<? extends java.lang.Object>> plus2 = kotlin.collections.SetsKt.plus((java.util.Set) plus, androidx.compose.ui.tooling.animation.UnsupportedComposeAnimation.INSTANCE.getApiAvailable() ? kotlin.collections.SetsKt.setOf((java.lang.Object[]) new androidx.compose.ui.tooling.animation.AnimationSearch.Search[]{new androidx.compose.ui.tooling.animation.AnimationSearch.AnimateContentSizeSearch(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.ui.tooling.animation.AnimationSearch.$r8$lambda$2nqU30QZRcXKrMiZfMd0NFoe95Q(androidx.compose.ui.tooling.animation.AnimationSearch.this, obj);
            }
        }), new androidx.compose.ui.tooling.animation.AnimationSearch.TargetBasedSearch(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.ui.tooling.animation.AnimationSearch.$r8$lambda$Qr9o1sD2sFcQv5PQz66nKB1Wzkg(androidx.compose.ui.tooling.animation.AnimationSearch.this, (androidx.compose.animation.core.TargetBasedAnimation) obj);
            }
        }), new androidx.compose.ui.tooling.animation.AnimationSearch.DecaySearch(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.ui.tooling.animation.AnimationSearch.$r8$lambda$VHSID8XYAK9qohA91T4_vt60qNY(androidx.compose.ui.tooling.animation.AnimationSearch.this, (androidx.compose.animation.core.DecayAnimation) obj);
            }
        })}) : kotlin.collections.CollectionsKt.emptyList());
        this.getHighSpeedVideoSizesFor = plus2;
        this.getInputFormats = kotlin.collections.SetsKt.plus((java.util.Set) plus2, (java.lang.Iterable) kotlin.collections.SetsKt.setOf(animatedContentSearch));
    }

    public final boolean searchAny(java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> slotTrees) {
        java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> collection = slotTrees;
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            java.util.List<androidx.compose.ui.tooling.data.Group> findAll = androidx.compose.ui.tooling.PreviewUtils_androidKt.findAll((androidx.compose.ui.tooling.data.Group) it.next(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.compose.ui.tooling.animation.AnimationSearch.$r8$lambda$cMvJsTJhw3hZOG60vfqxBRs6hS8((androidx.compose.ui.tooling.data.Group) obj));
                }
            });
            java.util.Set<androidx.compose.ui.tooling.animation.AnimationSearch.Search<? extends java.lang.Object>> set = this.getOutputFormats;
            if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                java.util.Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (((androidx.compose.ui.tooling.animation.AnimationSearch.Search) it2.next()).hasAnimations(findAll)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void attachAllAnimations(java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> slotTrees) {
        java.util.Iterator<T> it = slotTrees.iterator();
        while (it.hasNext()) {
            java.util.List<androidx.compose.ui.tooling.data.Group> findAll = androidx.compose.ui.tooling.PreviewUtils_androidKt.findAll((androidx.compose.ui.tooling.data.Group) it.next(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.compose.ui.tooling.animation.AnimationSearch.$r8$lambda$urFQ1uiZ_ezwuFf5ls30jKUPDSo((androidx.compose.ui.tooling.data.Group) obj));
                }
            });
            java.util.Iterator<T> it2 = this.getInputFormats.iterator();
            while (it2.hasNext()) {
                ((androidx.compose.ui.tooling.animation.AnimationSearch.Search) it2.next()).addAnimations(findAll);
            }
            this.Camera2StreamConfigurationMap.getAnimations().removeAll(this.getHighSpeedVideoFpsRanges.getAnimations());
            this.Camera2StreamConfigurationMap.getAnimations().removeAll(this.getHighSpeedVideoSizes.getAnimations());
        }
        java.util.Iterator<T> it3 = this.getHighSpeedVideoSizesFor.iterator();
        while (it3.hasNext()) {
            ((androidx.compose.ui.tooling.animation.AnimationSearch.Search) it3.next()).track();
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010#\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "", "T", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "Landroidx/compose/ui/tooling/data/Group;", "groups", "", "hasAnimations", "(Ljava/util/Collection;)Z", "group", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "addAnimations", "(Ljava/util/Collection;)V", "track", "()V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "", "animations", "Ljava/util/Set;", "getAnimations", "()Ljava/util/Set;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Search<T> {
        public static final int $stable = 8;
        private final java.util.Set<T> animations = new java.util.LinkedHashSet();

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<T, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

        public void addAnimations(java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> groups) {
        }

        public abstract boolean hasAnimation(androidx.compose.ui.tooling.data.Group group);

        /* JADX WARN: Multi-variable type inference failed */
        public Search(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
        }

        public final boolean hasAnimations(java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> groups) {
            java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> collection = groups;
            if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
                return false;
            }
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (hasAnimation((androidx.compose.ui.tooling.data.Group) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final java.util.Set<T> getAnimations() {
            return this.animations;
        }

        public final void track() {
            java.util.List reversed = kotlin.collections.CollectionsKt.reversed(this.animations);
            kotlin.jvm.functions.Function1<T, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.Iterator<T> it = reversed.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "", "T", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "", "Landroidx/compose/ui/tooling/data/Group;", "groups", "addAnimations", "(Ljava/util/Collection;)V", "group", "", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "p0", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/tooling/data/Group;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class RememberSearch<T> extends androidx.compose.ui.tooling.animation.AnimationSearch.Search<T> {
        public static final int $stable = 8;
        private final kotlin.reflect.KClass<T> Camera2StreamConfigurationMap;

        public RememberSearch(kotlin.reflect.KClass<T> kClass, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
            super(function1);
            this.Camera2StreamConfigurationMap = kClass;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> groups) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (T t : groups) {
                if (((androidx.compose.ui.tooling.data.Group) t).getLocation() != null) {
                    arrayList.add(t);
                }
            }
            java.util.Set<T> animations = getAnimations();
            kotlin.reflect.KClass<T> kClass = this.Camera2StreamConfigurationMap;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((androidx.compose.ui.tooling.data.Group) it.next(), kClass);
                if (highSpeedVideoFpsRanges != null) {
                    arrayList2.add(highSpeedVideoFpsRanges);
                }
            }
            animations.addAll(kotlin.collections.CollectionsKt.toSet(arrayList2));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(androidx.compose.ui.tooling.data.Group group) {
            return (group.getLocation() == null || getHighSpeedVideoFpsRanges(group, this.Camera2StreamConfigurationMap) == null) ? false : true;
        }

        private static <T> T getHighSpeedVideoFpsRanges(androidx.compose.ui.tooling.data.Group group, kotlin.reflect.KClass<T> kClass) {
            java.lang.Object obj;
            java.lang.Class<?> cls;
            java.util.Iterator<T> it = group.getData().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next != null && (cls = next.getClass()) != null) {
                    obj = kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, kClass)) {
                    obj = next;
                    break;
                }
            }
            return (T) kotlin.reflect.KClasses.safeCast(kClass, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TargetBasedSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/TargetBasedAnimation;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TargetBasedSearch extends androidx.compose.ui.tooling.animation.AnimationSearch.RememberSearch<androidx.compose.animation.core.TargetBasedAnimation<?, ?>> {
        public static final int $stable = 8;

        public TargetBasedSearch(kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.TargetBasedAnimation<?, ?>, kotlin.Unit> function1) {
            super(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.compose.animation.core.TargetBasedAnimation.class), function1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$DecaySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/DecayAnimation;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DecaySearch extends androidx.compose.ui.tooling.animation.AnimationSearch.RememberSearch<androidx.compose.animation.core.DecayAnimation<?, ?>> {
        public static final int $stable = 8;

        public DecaySearch(kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.DecayAnimation<?, ?>, kotlin.Unit> function1) {
            super(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.compose.animation.core.DecayAnimation.class), function1);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "", "Landroidx/compose/animation/core/InfiniteTransition;", "infiniteTransition", "Landroidx/compose/ui/tooling/animation/ToolingState;", "", "toolingState", "<init>", "(Landroidx/compose/animation/core/InfiniteTransition;Landroidx/compose/ui/tooling/animation/ToolingState;)V", "component1", "()Landroidx/compose/animation/core/InfiniteTransition;", "component2", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "copy", "(Landroidx/compose/animation/core/InfiniteTransition;Landroidx/compose/ui/tooling/animation/ToolingState;)Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/animation/core/InfiniteTransition;", "getInfiniteTransition", "Landroidx/compose/ui/tooling/animation/ToolingState;", "getToolingState"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InfiniteTransitionSearchInfo {
        public static final int $stable = androidx.compose.animation.core.InfiniteTransition.$stable;
        private final androidx.compose.animation.core.InfiniteTransition infiniteTransition;
        private final androidx.compose.ui.tooling.animation.ToolingState<java.lang.Long> toolingState;

        public InfiniteTransitionSearchInfo(androidx.compose.animation.core.InfiniteTransition infiniteTransition, androidx.compose.ui.tooling.animation.ToolingState<java.lang.Long> toolingState) {
            this.infiniteTransition = infiniteTransition;
            this.toolingState = toolingState;
        }

        public final androidx.compose.animation.core.InfiniteTransition getInfiniteTransition() {
            return this.infiniteTransition;
        }

        public final androidx.compose.ui.tooling.animation.ToolingState<java.lang.Long> getToolingState() {
            return this.toolingState;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InfiniteTransitionSearchInfo(infiniteTransition=");
            sb.append(this.infiniteTransition);
            sb.append(", toolingState=");
            sb.append(this.toolingState);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.infiniteTransition.hashCode() * 31) + this.toolingState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo)) {
                return false;
            }
            androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo = (androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.infiniteTransition, infiniteTransitionSearchInfo.infiniteTransition) && kotlin.jvm.internal.Intrinsics.areEqual(this.toolingState, infiniteTransitionSearchInfo.toolingState);
        }

        public final androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo copy(androidx.compose.animation.core.InfiniteTransition infiniteTransition, androidx.compose.ui.tooling.animation.ToolingState<java.lang.Long> toolingState) {
            return new androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo(infiniteTransition, toolingState);
        }

        public final androidx.compose.ui.tooling.animation.ToolingState<java.lang.Long> component2() {
            return this.toolingState;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.animation.core.InfiniteTransition getInfiniteTransition() {
            return this.infiniteTransition;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo copy$default(androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo, androidx.compose.animation.core.InfiniteTransition infiniteTransition, androidx.compose.ui.tooling.animation.ToolingState toolingState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                infiniteTransition = infiniteTransitionSearchInfo.infiniteTransition;
            }
            if ((i & 2) != 0) {
                toolingState = infiniteTransitionSearchInfo.toolingState;
            }
            return infiniteTransitionSearchInfo.copy(infiniteTransition, toolingState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", "addAnimations", "(Ljava/util/Collection;)V", "p0", "Landroidx/compose/ui/tooling/data/CallGroup;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/ui/tooling/data/CallGroup;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/State;", "", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/runtime/MutableState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InfiniteTransitionSearch extends androidx.compose.ui.tooling.animation.AnimationSearch.Search<androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo> {
        public static final int $stable = 8;

        public InfiniteTransitionSearch(kotlin.jvm.functions.Function1<? super androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo, kotlin.Unit> function1) {
            super(function1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final boolean hasAnimation(androidx.compose.ui.tooling.data.Group group) {
            java.lang.Object obj;
            if (getHighResolutionOutputSizeshNQ4ISI(group) == null) {
                return false;
            }
            java.util.Collection<java.lang.Object> data = group.getData();
            java.util.Collection<androidx.compose.ui.tooling.data.Group> children = group.getChildren();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, ((androidx.compose.ui.tooling.data.Group) it.next()).getData());
            }
            java.util.Iterator it2 = kotlin.collections.CollectionsKt.plus((java.util.Collection) data, (java.lang.Iterable) arrayList).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (obj instanceof androidx.compose.animation.core.InfiniteTransition) {
                    break;
                }
            }
            return (((androidx.compose.animation.core.InfiniteTransition) (obj instanceof androidx.compose.animation.core.InfiniteTransition ? obj : null)) == null || getHighSpeedVideoSizes(group) == null) ? false : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.tooling.animation.AnimationSearch$InfiniteTransitionSearchInfo] */
        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final void addAnimations(java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> groups) {
            androidx.compose.ui.tooling.animation.ToolingState toolingState;
            java.lang.Object obj;
            java.util.Set<androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo> animations = getAnimations();
            java.util.ArrayList<androidx.compose.ui.tooling.data.CallGroup> arrayList = new java.util.ArrayList();
            java.util.Iterator it = groups.iterator();
            while (it.hasNext()) {
                androidx.compose.ui.tooling.data.CallGroup highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.tooling.data.Group) it.next());
                if (highResolutionOutputSizeshNQ4ISI != null) {
                    arrayList.add(highResolutionOutputSizeshNQ4ISI);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (androidx.compose.ui.tooling.data.CallGroup callGroup : arrayList) {
                java.util.Collection<java.lang.Object> data = callGroup.getData();
                java.util.Collection<androidx.compose.ui.tooling.data.Group> children = callGroup.getChildren();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it2 = children.iterator();
                while (it2.hasNext()) {
                    kotlin.collections.CollectionsKt.addAll(arrayList3, ((androidx.compose.ui.tooling.data.Group) it2.next()).getData());
                }
                java.util.Iterator it3 = kotlin.collections.CollectionsKt.plus((java.util.Collection) data, (java.lang.Iterable) arrayList3).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (obj instanceof androidx.compose.animation.core.InfiniteTransition) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (!(obj instanceof androidx.compose.animation.core.InfiniteTransition)) {
                    obj = null;
                }
                androidx.compose.animation.core.InfiniteTransition infiniteTransition = (androidx.compose.animation.core.InfiniteTransition) obj;
                androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> highSpeedVideoSizes = getHighSpeedVideoSizes(callGroup);
                if (infiniteTransition != null && highSpeedVideoSizes != null) {
                    if (highSpeedVideoSizes.getValue() == null) {
                        highSpeedVideoSizes.setValue(new androidx.compose.ui.tooling.animation.ToolingState(0L));
                    }
                    androidx.compose.runtime.State<java.lang.Long> value = highSpeedVideoSizes.getValue();
                    toolingState = value instanceof androidx.compose.ui.tooling.animation.ToolingState ? (androidx.compose.ui.tooling.animation.ToolingState) value : null;
                    if (toolingState == null) {
                        toolingState = new androidx.compose.ui.tooling.animation.ToolingState(0L);
                    }
                    toolingState = new androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo(infiniteTransition, toolingState);
                }
                if (toolingState != null) {
                    arrayList2.add(toolingState);
                }
            }
            animations.addAll(arrayList2);
        }

        private static androidx.compose.ui.tooling.data.CallGroup getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.tooling.data.Group p0) {
            if (p0.getLocation() == null || !kotlin.jvm.internal.Intrinsics.areEqual(p0.getName(), "rememberInfiniteTransition")) {
                p0 = null;
            }
            if (p0 == null || !(p0 instanceof androidx.compose.ui.tooling.data.CallGroup)) {
                return null;
            }
            return (androidx.compose.ui.tooling.data.CallGroup) p0;
        }

        private static androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> getHighSpeedVideoSizes(androidx.compose.ui.tooling.data.Group p0) {
            java.lang.Object obj;
            java.util.Collection<java.lang.Object> data = p0.getData();
            java.util.Collection<androidx.compose.ui.tooling.data.Group> children = p0.getChildren();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, ((androidx.compose.ui.tooling.data.Group) it.next()).getChildren());
            }
            java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) children, (java.lang.Iterable) arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it2 = plus.iterator();
            while (it2.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList2, ((androidx.compose.ui.tooling.data.Group) it2.next()).getData());
            }
            java.util.Iterator it3 = kotlin.collections.CollectionsKt.plus((java.util.Collection) data, (java.lang.Iterable) arrayList2).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (obj instanceof androidx.compose.runtime.MutableState) {
                    break;
                }
            }
            return (androidx.compose.runtime.MutableState) (obj instanceof androidx.compose.runtime.MutableState ? obj : null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JR\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010R \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Landroidx/compose/animation/core/Animatable;", "animatable", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/ui/tooling/animation/ToolingState;", "toolingState", "<init>", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/tooling/animation/ToolingState;)V", "component1", "()Landroidx/compose/animation/core/Animatable;", "component2", "()Landroidx/compose/animation/core/AnimationSpec;", "component3", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "copy", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/tooling/animation/ToolingState;)Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/animation/core/Animatable;", "getAnimatable", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "Landroidx/compose/ui/tooling/animation/ToolingState;", "getToolingState"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnimateXAsStateSearchInfo<T, V extends androidx.compose.animation.core.AnimationVector> {
        public static final int $stable = 8;
        private final androidx.compose.animation.core.Animatable<T, V> animatable;
        private final androidx.compose.animation.core.AnimationSpec<T> animationSpec;
        private final androidx.compose.ui.tooling.animation.ToolingState<T> toolingState;

        public AnimateXAsStateSearchInfo(androidx.compose.animation.core.Animatable<T, V> animatable, androidx.compose.animation.core.AnimationSpec<T> animationSpec, androidx.compose.ui.tooling.animation.ToolingState<T> toolingState) {
            this.animatable = animatable;
            this.animationSpec = animationSpec;
            this.toolingState = toolingState;
        }

        public final androidx.compose.animation.core.Animatable<T, V> getAnimatable() {
            return this.animatable;
        }

        public final androidx.compose.animation.core.AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final androidx.compose.ui.tooling.animation.ToolingState<T> getToolingState() {
            return this.toolingState;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AnimateXAsStateSearchInfo(animatable=");
            sb.append(this.animatable);
            sb.append(", animationSpec=");
            sb.append(this.animationSpec);
            sb.append(", toolingState=");
            sb.append(this.toolingState);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.animatable.hashCode() * 31) + this.animationSpec.hashCode()) * 31) + this.toolingState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo)) {
                return false;
            }
            androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo animateXAsStateSearchInfo = (androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.animatable, animateXAsStateSearchInfo.animatable) && kotlin.jvm.internal.Intrinsics.areEqual(this.animationSpec, animateXAsStateSearchInfo.animationSpec) && kotlin.jvm.internal.Intrinsics.areEqual(this.toolingState, animateXAsStateSearchInfo.toolingState);
        }

        public final androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo<T, V> copy(androidx.compose.animation.core.Animatable<T, V> animatable, androidx.compose.animation.core.AnimationSpec<T> animationSpec, androidx.compose.ui.tooling.animation.ToolingState<T> toolingState) {
            return new androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo<>(animatable, animationSpec, toolingState);
        }

        public final androidx.compose.ui.tooling.animation.ToolingState<T> component3() {
            return this.toolingState;
        }

        public final androidx.compose.animation.core.AnimationSpec<T> component2() {
            return this.animationSpec;
        }

        public final androidx.compose.animation.core.Animatable<T, V> component1() {
            return this.animatable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo copy$default(androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo animateXAsStateSearchInfo, androidx.compose.animation.core.Animatable animatable, androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.ui.tooling.animation.ToolingState toolingState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                animatable = animateXAsStateSearchInfo.animatable;
            }
            if ((i & 2) != 0) {
                animationSpec = animateXAsStateSearchInfo.animationSpec;
            }
            if ((i & 4) != 0) {
                toolingState = animateXAsStateSearchInfo.toolingState;
            }
            return animateXAsStateSearchInfo.copy(animatable, animationSpec, toolingState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0017\u0018\u00010\u0016\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", "addAnimations", "(Ljava/util/Collection;)V", "p0", "Landroidx/compose/ui/tooling/data/CallGroup;", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/ui/tooling/data/CallGroup;", "T", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/State;", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/runtime/MutableState;", "Landroidx/compose/animation/core/AnimationSpec;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/tooling/data/CallGroup;)Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/tooling/data/CallGroup;)Landroidx/compose/animation/core/Animatable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnimateXAsStateSearch extends androidx.compose.ui.tooling.animation.AnimationSearch.Search<androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo<?, ?>> {
        public static final int $stable = 8;

        public AnimateXAsStateSearch(kotlin.jvm.functions.Function1<? super androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo<?, ?>, kotlin.Unit> function1) {
            super(function1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final boolean hasAnimation(androidx.compose.ui.tooling.data.Group group) {
            androidx.compose.ui.tooling.data.CallGroup highSpeedVideoSizes = getHighSpeedVideoSizes(group);
            return (highSpeedVideoSizes == null || getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes) == null || getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes) == null || getHighSpeedVideoFpsRanges(highSpeedVideoSizes) == null) ? false : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.tooling.animation.AnimationSearch$AnimateXAsStateSearchInfo] */
        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final void addAnimations(java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> groups) {
            java.util.Set<androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo<?, ?>> animations = getAnimations();
            java.util.ArrayList<androidx.compose.ui.tooling.data.CallGroup> arrayList = new java.util.ArrayList();
            java.util.Iterator it = groups.iterator();
            while (it.hasNext()) {
                androidx.compose.ui.tooling.data.CallGroup highSpeedVideoSizes = getHighSpeedVideoSizes((androidx.compose.ui.tooling.data.Group) it.next());
                if (highSpeedVideoSizes != null) {
                    arrayList.add(highSpeedVideoSizes);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (androidx.compose.ui.tooling.data.CallGroup callGroup : arrayList) {
                androidx.compose.animation.core.Animatable highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(callGroup);
                androidx.compose.animation.core.AnimationSpec highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(callGroup);
                androidx.compose.runtime.MutableState highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(callGroup);
                if (highSpeedVideoFpsRangesFor != null && highResolutionOutputSizeshNQ4ISI != null && highSpeedVideoFpsRanges != null) {
                    if (highSpeedVideoFpsRanges.getValue() == null) {
                        highSpeedVideoFpsRanges.setValue(new androidx.compose.ui.tooling.animation.ToolingState(highSpeedVideoFpsRangesFor.getValue()));
                    }
                    java.lang.Object value = highSpeedVideoFpsRanges.getValue();
                    r5 = value instanceof androidx.compose.ui.tooling.animation.ToolingState ? (androidx.compose.ui.tooling.animation.ToolingState) value : null;
                    if (r5 == null) {
                        r5 = new androidx.compose.ui.tooling.animation.ToolingState(highSpeedVideoFpsRangesFor.getValue());
                    }
                    r5 = new androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo(highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI, r5);
                }
                if (r5 != null) {
                    arrayList2.add(r5);
                }
            }
            animations.addAll(arrayList2);
        }

        private static androidx.compose.ui.tooling.data.CallGroup getHighSpeedVideoSizes(androidx.compose.ui.tooling.data.Group p0) {
            if (p0.getLocation() == null || !kotlin.jvm.internal.Intrinsics.areEqual(p0.getName(), "animateValueAsState")) {
                p0 = null;
            }
            if (p0 == null || !(p0 instanceof androidx.compose.ui.tooling.data.CallGroup)) {
                return null;
            }
            return (androidx.compose.ui.tooling.data.CallGroup) p0;
        }

        private static <T> androidx.compose.animation.core.AnimationSpec<T> getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.tooling.data.CallGroup p0) {
            java.util.Collection<androidx.compose.ui.tooling.data.Group> children = p0.getChildren();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (T t : children) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.ui.tooling.data.Group) t).getName(), "rememberUpdatedState")) {
                    arrayList.add(t);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = arrayList2;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList4, ((androidx.compose.ui.tooling.data.Group) it.next()).getChildren());
            }
            java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList3, (java.lang.Iterable) arrayList4);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator<T> it2 = plus.iterator();
            while (it2.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList5, ((androidx.compose.ui.tooling.data.Group) it2.next()).getData());
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            for (T t2 : arrayList5) {
                if (t2 instanceof androidx.compose.runtime.State) {
                    arrayList6.add(t2);
                }
            }
            java.util.ArrayList arrayList7 = arrayList6;
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
            java.util.Iterator<T> it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                arrayList8.add(((androidx.compose.runtime.State) it3.next()).getValue());
            }
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            for (T t3 : arrayList8) {
                if (t3 instanceof androidx.compose.animation.core.AnimationSpec) {
                    arrayList9.add(t3);
                }
            }
            return (androidx.compose.animation.core.AnimationSpec) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList9);
        }

        private static <T> androidx.compose.animation.core.Animatable<T, androidx.compose.animation.core.AnimationVector> getHighSpeedVideoFpsRangesFor(androidx.compose.ui.tooling.data.CallGroup p0) {
            T t;
            java.util.List emptyList;
            T t2;
            T t3;
            androidx.compose.ui.tooling.data.CallGroup callGroup = p0;
            java.util.Iterator<T> it = callGroup.getData().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = (T) null;
                    break;
                }
                t = it.next();
                if (t instanceof androidx.compose.animation.core.Animatable) {
                    break;
                }
            }
            if (!(t instanceof androidx.compose.animation.core.Animatable)) {
                t = null;
            }
            androidx.compose.animation.core.Animatable animatable = t;
            if (animatable == null || (emptyList = kotlin.collections.CollectionsKt.listOf(animatable)) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List list = emptyList;
            java.util.Collection<androidx.compose.ui.tooling.data.Group> children = callGroup.getChildren();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it2 = children.iterator();
            while (it2.hasNext()) {
                java.util.Iterator<T> it3 = ((androidx.compose.ui.tooling.data.Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        t3 = (T) null;
                        break;
                    }
                    t3 = it3.next();
                    if (t3 instanceof androidx.compose.animation.core.Animatable) {
                        break;
                    }
                }
                if (!(t3 instanceof androidx.compose.animation.core.Animatable)) {
                    t3 = null;
                }
                androidx.compose.animation.core.Animatable animatable2 = t3;
                if (animatable2 != null) {
                    arrayList.add(animatable2);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it4 = children.iterator();
            while (it4.hasNext()) {
                androidx.compose.ui.tooling.data.Group firstOrNull = androidx.compose.ui.tooling.PreviewUtils_androidKt.firstOrNull((androidx.compose.ui.tooling.data.Group) it4.next(), androidx.compose.ui.tooling.animation.AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList3.add(firstOrNull);
                }
            }
            java.util.ArrayList arrayList4 = arrayList2;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator<T> it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                java.util.Iterator<T> it6 = ((androidx.compose.ui.tooling.data.Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        t2 = (T) null;
                        break;
                    }
                    t2 = it6.next();
                    if (t2 instanceof androidx.compose.animation.core.Animatable) {
                        break;
                    }
                }
                if (!(t2 instanceof androidx.compose.animation.core.Animatable)) {
                    t2 = null;
                }
                androidx.compose.animation.core.Animatable animatable3 = t2;
                if (animatable3 != null) {
                    arrayList5.add(animatable3);
                }
            }
            return (androidx.compose.animation.core.Animatable) kotlin.collections.CollectionsKt.firstOrNull(kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList4, (java.lang.Iterable) arrayList5)));
        }

        private static <T> androidx.compose.runtime.MutableState<androidx.compose.runtime.State<T>> getHighSpeedVideoFpsRanges(androidx.compose.ui.tooling.data.Group p0) {
            T t;
            java.util.List emptyList;
            T t2;
            T t3;
            java.util.Iterator<T> it = p0.getData().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t instanceof androidx.compose.runtime.MutableState) {
                    break;
                }
            }
            if (!(t instanceof androidx.compose.runtime.MutableState)) {
                t = null;
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) t;
            if (mutableState == null || (emptyList = kotlin.collections.CollectionsKt.listOf(mutableState)) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List list = emptyList;
            java.util.Collection<androidx.compose.ui.tooling.data.Group> children = p0.getChildren();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it2 = children.iterator();
            while (it2.hasNext()) {
                java.util.Iterator<T> it3 = ((androidx.compose.ui.tooling.data.Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        t3 = null;
                        break;
                    }
                    t3 = it3.next();
                    if (t3 instanceof androidx.compose.runtime.MutableState) {
                        break;
                    }
                }
                if (!(t3 instanceof androidx.compose.runtime.MutableState)) {
                    t3 = null;
                }
                androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) t3;
                if (mutableState2 != null) {
                    arrayList.add(mutableState2);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it4 = children.iterator();
            while (it4.hasNext()) {
                androidx.compose.ui.tooling.data.Group firstOrNull = androidx.compose.ui.tooling.PreviewUtils_androidKt.firstOrNull((androidx.compose.ui.tooling.data.Group) it4.next(), androidx.compose.ui.tooling.animation.AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList3.add(firstOrNull);
                }
            }
            java.util.ArrayList arrayList4 = arrayList2;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator<T> it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                java.util.Iterator<T> it6 = ((androidx.compose.ui.tooling.data.Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it6.next();
                    if (t2 instanceof androidx.compose.runtime.MutableState) {
                        break;
                    }
                }
                if (!(t2 instanceof androidx.compose.runtime.MutableState)) {
                    t2 = null;
                }
                androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) t2;
                if (mutableState3 != null) {
                    arrayList5.add(mutableState3);
                }
            }
            return (androidx.compose.runtime.MutableState) kotlin.collections.CollectionsKt.firstOrNull(kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList4, (java.lang.Iterable) arrayList5)));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", "addAnimations", "(Ljava/util/Collection;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnimateContentSizeSearch extends androidx.compose.ui.tooling.animation.AnimationSearch.Search<java.lang.Object> {
        public static final int $stable = 8;

        public AnimateContentSizeSearch(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1) {
            super(function1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final boolean hasAnimation(androidx.compose.ui.tooling.data.Group group) {
            if (group.getModifierInfo().isEmpty()) {
                return false;
            }
            java.util.List<androidx.compose.ui.layout.ModifierInfo> modifierInfo = group.getModifierInfo();
            if ((modifierInfo instanceof java.util.Collection) && modifierInfo.isEmpty()) {
                return false;
            }
            java.util.Iterator<T> it = modifierInfo.iterator();
            while (it.hasNext()) {
                if (((androidx.compose.ui.layout.ModifierInfo) it.next()).getModifier().any(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateContentSizeSearch$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        boolean areEqual;
                        areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.ui.Modifier.Element) obj).getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement");
                        return java.lang.Boolean.valueOf(areEqual);
                    }
                })) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final void addAnimations(java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> groups) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : groups) {
                if (!((androidx.compose.ui.tooling.data.Group) obj).getModifierInfo().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.util.Iterator<T> it2 = ((androidx.compose.ui.tooling.data.Group) it.next()).getModifierInfo().iterator();
                while (it2.hasNext()) {
                    ((androidx.compose.ui.layout.ModifierInfo) it2.next()).getModifier().any(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateContentSizeSearch$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return java.lang.Boolean.valueOf(androidx.compose.ui.tooling.animation.AnimationSearch.AnimateContentSizeSearch.m8522$r8$lambda$eumubazLX3rPa32p5PWb4lF8Js(androidx.compose.ui.tooling.animation.AnimationSearch.AnimateContentSizeSearch.this, (androidx.compose.ui.Modifier.Element) obj2));
                        }
                    });
                }
            }
        }

        /* renamed from: $r8$lambda$eumubazLX3rPa32p-5PWb4lF8Js, reason: not valid java name */
        public static /* synthetic */ boolean m8522$r8$lambda$eumubazLX3rPa32p5PWb4lF8Js(androidx.compose.ui.tooling.animation.AnimationSearch.AnimateContentSizeSearch animateContentSizeSearch, androidx.compose.ui.Modifier.Element element) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(element.getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement")) {
                return false;
            }
            animateContentSizeSearch.getAnimations().add(element);
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", "addAnimations", "(Ljava/util/Collection;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransitionSearch extends androidx.compose.ui.tooling.animation.AnimationSearch.Search<androidx.compose.animation.core.Transition<?>> {
        public static final int $stable = 8;

        public TransitionSearch(kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Transition<?>, kotlin.Unit> function1) {
            super(function1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final void addAnimations(java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> groups) {
            java.lang.Object obj;
            java.lang.Object obj2;
            java.util.Set<androidx.compose.animation.core.Transition<?>> animations = getAnimations();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = groups.iterator();
            while (true) {
                androidx.compose.ui.tooling.data.Group group = null;
                if (!it.hasNext()) {
                    break;
                }
                androidx.compose.ui.tooling.data.Group group2 = (androidx.compose.ui.tooling.data.Group) it.next();
                if (group2.getLocation() != null && kotlin.jvm.internal.Intrinsics.areEqual(group2.getName(), "updateTransition")) {
                    group = group2;
                }
                if (group != null) {
                    arrayList.add(group);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                java.util.Iterator<T> it3 = ((androidx.compose.ui.tooling.data.Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it3.next();
                        if (obj2 instanceof androidx.compose.animation.core.Transition) {
                            break;
                        }
                    }
                }
                if (!(obj2 instanceof androidx.compose.animation.core.Transition)) {
                    obj2 = null;
                }
                androidx.compose.animation.core.Transition transition = (androidx.compose.animation.core.Transition) obj2;
                if (transition != null) {
                    arrayList3.add(transition);
                }
            }
            java.util.ArrayList arrayList4 = arrayList3;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                androidx.compose.ui.tooling.data.Group firstOrNull = androidx.compose.ui.tooling.PreviewUtils_androidKt.firstOrNull((androidx.compose.ui.tooling.data.Group) it4.next(), androidx.compose.ui.tooling.animation.AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList5.add(firstOrNull);
                }
            }
            java.util.ArrayList arrayList6 = arrayList4;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                java.util.Iterator<T> it6 = ((androidx.compose.ui.tooling.data.Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (obj instanceof androidx.compose.animation.core.Transition) {
                            break;
                        }
                    }
                }
                if (!(obj instanceof androidx.compose.animation.core.Transition)) {
                    obj = null;
                }
                androidx.compose.animation.core.Transition transition2 = (androidx.compose.animation.core.Transition) obj;
                if (transition2 != null) {
                    arrayList7.add(transition2);
                }
            }
            animations.addAll(kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList6, (java.lang.Iterable) arrayList7));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final boolean hasAnimation(androidx.compose.ui.tooling.data.Group group) {
            if (group.getLocation() == null || !kotlin.jvm.internal.Intrinsics.areEqual(group.getName(), "updateTransition")) {
                group = null;
            }
            return group != null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", "addAnimations", "(Ljava/util/Collection;)V", "p0", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/ui/tooling/data/Group;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnimatedVisibilitySearch extends androidx.compose.ui.tooling.animation.AnimationSearch.Search<androidx.compose.animation.core.Transition<?>> {
        public static final int $stable = 8;

        public AnimatedVisibilitySearch(kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Transition<?>, kotlin.Unit> function1) {
            super(function1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final boolean hasAnimation(androidx.compose.ui.tooling.data.Group group) {
            return getHighSpeedVideoSizes(group) != null;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final void addAnimations(java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> groups) {
            java.lang.Object obj;
            java.lang.Object obj2;
            java.util.Set<androidx.compose.animation.core.Transition<?>> animations = getAnimations();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = groups.iterator();
            while (it.hasNext()) {
                androidx.compose.ui.tooling.data.Group highSpeedVideoSizes = getHighSpeedVideoSizes((androidx.compose.ui.tooling.data.Group) it.next());
                if (highSpeedVideoSizes != null) {
                    arrayList.add(highSpeedVideoSizes);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.util.Iterator<T> it3 = ((androidx.compose.ui.tooling.data.Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it3.next();
                        if (obj2 instanceof androidx.compose.animation.core.Transition) {
                            break;
                        }
                    }
                }
                androidx.compose.animation.core.Transition transition = (androidx.compose.animation.core.Transition) (obj2 instanceof androidx.compose.animation.core.Transition ? obj2 : null);
                if (transition != null) {
                    arrayList3.add(transition);
                }
            }
            java.util.ArrayList arrayList4 = arrayList3;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                androidx.compose.ui.tooling.data.Group firstOrNull = androidx.compose.ui.tooling.PreviewUtils_androidKt.firstOrNull((androidx.compose.ui.tooling.data.Group) it4.next(), androidx.compose.ui.tooling.animation.AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList5.add(firstOrNull);
                }
            }
            java.util.ArrayList arrayList6 = arrayList4;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                java.util.Iterator<T> it6 = ((androidx.compose.ui.tooling.data.Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (obj instanceof androidx.compose.animation.core.Transition) {
                            break;
                        }
                    }
                }
                if (!(obj instanceof androidx.compose.animation.core.Transition)) {
                    obj = null;
                }
                androidx.compose.animation.core.Transition transition2 = (androidx.compose.animation.core.Transition) obj;
                if (transition2 != null) {
                    arrayList7.add(transition2);
                }
            }
            animations.addAll(kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList6, (java.lang.Iterable) arrayList7));
        }

        private static androidx.compose.ui.tooling.data.Group getHighSpeedVideoSizes(androidx.compose.ui.tooling.data.Group p0) {
            java.lang.Object obj = null;
            if (p0.getLocation() == null || !kotlin.jvm.internal.Intrinsics.areEqual(p0.getName(), "AnimatedVisibility")) {
                p0 = null;
            }
            if (p0 == null) {
                return null;
            }
            java.util.Iterator<T> it = p0.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.ui.tooling.data.Group) next).getName(), "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (androidx.compose.ui.tooling.data.Group) obj;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", "addAnimations", "(Ljava/util/Collection;)V", "p0", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/ui/tooling/data/Group;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnimatedContentSearch extends androidx.compose.ui.tooling.animation.AnimationSearch.Search<androidx.compose.animation.core.Transition<?>> {
        public static final int $stable = 8;

        public AnimatedContentSearch(kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Transition<?>, kotlin.Unit> function1) {
            super(function1);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final boolean hasAnimation(androidx.compose.ui.tooling.data.Group group) {
            return getHighSpeedVideoSizes(group) != null;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public final void addAnimations(java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> groups) {
            java.lang.Object obj;
            java.lang.Object obj2;
            java.util.Set<androidx.compose.animation.core.Transition<?>> animations = getAnimations();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = groups.iterator();
            while (it.hasNext()) {
                androidx.compose.ui.tooling.data.Group highSpeedVideoSizes = getHighSpeedVideoSizes((androidx.compose.ui.tooling.data.Group) it.next());
                if (highSpeedVideoSizes != null) {
                    arrayList.add(highSpeedVideoSizes);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.util.Iterator<T> it3 = ((androidx.compose.ui.tooling.data.Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it3.next();
                        if (obj2 instanceof androidx.compose.animation.core.Transition) {
                            break;
                        }
                    }
                }
                androidx.compose.animation.core.Transition transition = (androidx.compose.animation.core.Transition) (obj2 instanceof androidx.compose.animation.core.Transition ? obj2 : null);
                if (transition != null) {
                    arrayList3.add(transition);
                }
            }
            java.util.ArrayList arrayList4 = arrayList3;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                androidx.compose.ui.tooling.data.Group firstOrNull = androidx.compose.ui.tooling.PreviewUtils_androidKt.firstOrNull((androidx.compose.ui.tooling.data.Group) it4.next(), androidx.compose.ui.tooling.animation.AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList5.add(firstOrNull);
                }
            }
            java.util.ArrayList arrayList6 = arrayList4;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                java.util.Iterator<T> it6 = ((androidx.compose.ui.tooling.data.Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (obj instanceof androidx.compose.animation.core.Transition) {
                            break;
                        }
                    }
                }
                if (!(obj instanceof androidx.compose.animation.core.Transition)) {
                    obj = null;
                }
                androidx.compose.animation.core.Transition transition2 = (androidx.compose.animation.core.Transition) obj;
                if (transition2 != null) {
                    arrayList7.add(transition2);
                }
            }
            animations.addAll(kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList6, (java.lang.Iterable) arrayList7));
        }

        private static androidx.compose.ui.tooling.data.Group getHighSpeedVideoSizes(androidx.compose.ui.tooling.data.Group p0) {
            java.lang.Object obj = null;
            if (p0.getLocation() == null || !kotlin.jvm.internal.Intrinsics.areEqual(p0.getName(), "AnimatedContent")) {
                p0 = null;
            }
            if (p0 == null) {
                return null;
            }
            java.util.Iterator<T> it = p0.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.ui.tooling.data.Group) next).getName(), "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (androidx.compose.ui.tooling.data.Group) obj;
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2nqU30QZRcXKrMiZfMd0NFoe95Q(androidx.compose.ui.tooling.animation.AnimationSearch animationSearch, java.lang.Object obj) {
        animationSearch.getHighSpeedVideoFpsRangesFor.invoke().trackAnimateContentSize(obj);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$56jpcETosmsOpeCmoN07WNFgZc4(androidx.compose.ui.tooling.animation.AnimationSearch animationSearch, androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
        animationSearch.getHighSpeedVideoFpsRangesFor.invoke().trackInfiniteTransition(infiniteTransitionSearchInfo);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8PZIpN-MVdd1IZ6CboQjSO8e_Ig, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m8519$r8$lambda$8PZIpNMVdd1IZ6CboQjSO8e_Ig(androidx.compose.ui.tooling.animation.AnimationSearch animationSearch, androidx.compose.animation.core.Transition transition) {
        animationSearch.getHighSpeedVideoFpsRangesFor.invoke().trackTransition(transition);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9eE1EYO_N7SGvG6Nq-j8Xxf6otY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m8520$r8$lambda$9eE1EYO_N7SGvG6Nqj8Xxf6otY(androidx.compose.ui.tooling.animation.AnimationSearch animationSearch, androidx.compose.animation.core.Transition transition) {
        animationSearch.getHighSpeedVideoFpsRangesFor.invoke().trackAnimatedVisibility(transition, animationSearch.getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Qr9o1sD2sFcQv5PQz66nKB1Wzkg(androidx.compose.ui.tooling.animation.AnimationSearch animationSearch, androidx.compose.animation.core.TargetBasedAnimation targetBasedAnimation) {
        animationSearch.getHighSpeedVideoFpsRangesFor.invoke().trackTargetBasedAnimations(targetBasedAnimation);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VHSID8XYAK9qohA91T4_vt60qNY(androidx.compose.ui.tooling.animation.AnimationSearch animationSearch, androidx.compose.animation.core.DecayAnimation decayAnimation) {
        animationSearch.getHighSpeedVideoFpsRangesFor.invoke().trackDecayAnimations(decayAnimation);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$caXpeuVS8WGmjmYgRgQK9pcTS7c(androidx.compose.ui.tooling.animation.AnimationSearch animationSearch, androidx.compose.animation.core.Transition transition) {
        animationSearch.getHighSpeedVideoFpsRangesFor.invoke().trackAnimatedContent(transition);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q4MWPHzLw6Q2t61OsRvAWkMGtMo(androidx.compose.ui.tooling.animation.AnimationSearch animationSearch, androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo animateXAsStateSearchInfo) {
        animationSearch.getHighSpeedVideoFpsRangesFor.invoke().trackAnimateXAsState(animateXAsStateSearchInfo);
        return kotlin.Unit.INSTANCE;
    }
}
