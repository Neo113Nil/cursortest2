package androidx.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0004\u0011\u0012\u0013\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/activity/ImmLeaksCleaner;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "getHighSpeedVideoFpsRanges", "Landroid/app/Activity;", "Camera2StreamConfigurationMap", "Companion", "Cleaner", "FailedInitialization", "ValidCleaner"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ImmLeaksCleaner implements androidx.view.LifecycleEventObserver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.ImmLeaksCleaner.Companion INSTANCE = new androidx.view.ImmLeaksCleaner.Companion(null);
    private static final kotlin.Lazy<androidx.activity.ImmLeaksCleaner.Cleaner> cleaner$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.activity.ImmLeaksCleaner$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.activity.ImmLeaksCleaner.Cleaner highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.view.ImmLeaksCleaner.getHighResolutionOutputSizeshNQ4ISI();
            return highResolutionOutputSizeshNQ4ISI;
        }
    });

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.app.Activity Camera2StreamConfigurationMap;

    public ImmLeaksCleaner(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        this.Camera2StreamConfigurationMap = activity;
    }

    @Override // androidx.view.LifecycleEventObserver
    public final void onStateChanged(androidx.view.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
            java.lang.Object systemService = this.Camera2StreamConfigurationMap.getSystemService("input_method");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
            androidx.activity.ImmLeaksCleaner.Cleaner cleaner = INSTANCE.getCleaner();
            java.lang.Object lock = cleaner.getLock(inputMethodManager);
            if (lock != null) {
                synchronized (lock) {
                    android.view.View servedView = cleaner.getServedView(inputMethodManager);
                    if (servedView == null) {
                        return;
                    }
                    if (servedView.isAttachedToWindow()) {
                        return;
                    }
                    boolean clearNextServedView = cleaner.clearNextServedView(inputMethodManager);
                    if (clearNextServedView) {
                        inputMethodManager.isActive();
                    }
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000f\u0010"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$Cleaner;", "", "<init>", "()V", "Landroid/view/inputmethod/InputMethodManager;", "", "clearNextServedView", "(Landroid/view/inputmethod/InputMethodManager;)Z", "getLock", "(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;", "lock", "Landroid/view/View;", "getServedView", "(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;", "servedView", "Landroidx/activity/ImmLeaksCleaner$FailedInitialization;", "Landroidx/activity/ImmLeaksCleaner$ValidCleaner;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Cleaner {
        public abstract boolean clearNextServedView(android.view.inputmethod.InputMethodManager inputMethodManager);

        public abstract java.lang.Object getLock(android.view.inputmethod.InputMethodManager inputMethodManager);

        public abstract android.view.View getServedView(android.view.inputmethod.InputMethodManager inputMethodManager);

        private Cleaner() {
        }

        public /* synthetic */ Cleaner(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b*\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$FailedInitialization;", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "<init>", "()V", "Landroid/view/inputmethod/InputMethodManager;", "", "clearNextServedView", "(Landroid/view/inputmethod/InputMethodManager;)Z", "", "getLock", "(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;", "lock", "Landroid/view/View;", "getServedView", "(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;", "servedView"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FailedInitialization extends androidx.activity.ImmLeaksCleaner.Cleaner {
        public static final androidx.activity.ImmLeaksCleaner.FailedInitialization INSTANCE = new androidx.activity.ImmLeaksCleaner.FailedInitialization();

        private FailedInitialization() {
            super(null);
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public final android.view.View getServedView(android.view.inputmethod.InputMethodManager inputMethodManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMethodManager, "");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public final java.lang.Object getLock(android.view.inputmethod.InputMethodManager inputMethodManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMethodManager, "");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public final boolean clearNextServedView(android.view.inputmethod.InputMethodManager inputMethodManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMethodManager, "");
            return false;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0015*\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$ValidCleaner;", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "Ljava/lang/reflect/Field;", "hField", "servedViewField", "nextServedViewField", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V", "Landroid/view/inputmethod/InputMethodManager;", "", "clearNextServedView", "(Landroid/view/inputmethod/InputMethodManager;)Z", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/reflect/Field;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "", "getLock", "(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;", "lock", "Landroid/view/View;", "getServedView", "(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;", "servedView"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ValidCleaner extends androidx.activity.ImmLeaksCleaner.Cleaner {
        private final java.lang.reflect.Field getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.reflect.Field getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.reflect.Field getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidCleaner(java.lang.reflect.Field field, java.lang.reflect.Field field2, java.lang.reflect.Field field3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field3, "");
            this.getHighResolutionOutputSizeshNQ4ISI = field;
            this.getHighSpeedVideoFpsRangesFor = field2;
            this.getHighSpeedVideoFpsRanges = field3;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public final java.lang.Object getLock(android.view.inputmethod.InputMethodManager inputMethodManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMethodManager, "");
            try {
                return this.getHighResolutionOutputSizeshNQ4ISI.get(inputMethodManager);
            } catch (java.lang.IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public final android.view.View getServedView(android.view.inputmethod.InputMethodManager inputMethodManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMethodManager, "");
            try {
                return (android.view.View) this.getHighSpeedVideoFpsRangesFor.get(inputMethodManager);
            } catch (java.lang.ClassCastException | java.lang.IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public final boolean clearNextServedView(android.view.inputmethod.InputMethodManager inputMethodManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMethodManager, "");
            try {
                this.getHighSpeedVideoFpsRanges.set(inputMethodManager, null);
                return true;
            } catch (java.lang.IllegalAccessException unused) {
                return false;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$Companion;", "", "<init>", "()V", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "cleaner$delegate", "Lkotlin/Lazy;", "getCleaner", "()Landroidx/activity/ImmLeaksCleaner$Cleaner;", "cleaner"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.activity.ImmLeaksCleaner.Cleaner getCleaner() {
            return (androidx.activity.ImmLeaksCleaner.Cleaner) androidx.view.ImmLeaksCleaner.cleaner$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.activity.ImmLeaksCleaner.Cleaner getHighResolutionOutputSizeshNQ4ISI() {
        try {
            java.lang.reflect.Field declaredField = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            java.lang.reflect.Field declaredField2 = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            java.lang.reflect.Field declaredField3 = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            kotlin.jvm.internal.Intrinsics.checkNotNull(declaredField3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(declaredField);
            kotlin.jvm.internal.Intrinsics.checkNotNull(declaredField2);
            return new androidx.activity.ImmLeaksCleaner.ValidCleaner(declaredField3, declaredField, declaredField2);
        } catch (java.lang.NoSuchFieldException unused) {
            return androidx.activity.ImmLeaksCleaner.FailedInitialization.INSTANCE;
        }
    }
}
