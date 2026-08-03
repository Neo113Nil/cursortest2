package androidx.compose.ui.input.pointer;

/* compiled from: PointerInteropFilter.android.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003H\u0007\u001a,\u0010\t\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0003H\u0007\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¨\u0006\u0010"}, d2 = {"motionEventSpy", "Landroidx/compose/ui/Modifier;", "watcher", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lkotlin/ParameterName;", "name", "motionEvent", "", "pointerInteropFilter", "requestDisallowInterceptTouchEvent", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "onTouchEvent", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerInteropFilter_androidKt {
    public static /* synthetic */ androidx.compose.ui.Modifier pointerInteropFilter$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            requestDisallowInterceptTouchEvent = null;
        }
        return pointerInteropFilter(modifier, requestDisallowInterceptTouchEvent, function1);
    }

    public static final androidx.compose.ui.Modifier pointerInteropFilter(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder) {
        androidx.compose.ui.input.pointer.PointerInteropFilter pointerInteropFilter = new androidx.compose.ui.input.pointer.PointerInteropFilter();
        pointerInteropFilter.setOnTouchEvent(new kotlin.jvm.functions.Function1<android.view.MotionEvent, java.lang.Boolean>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(android.view.MotionEvent motionEvent) {
                boolean dispatchTouchEvent;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = androidx.compose.ui.viewinterop.AndroidViewHolder.this.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = androidx.compose.ui.viewinterop.AndroidViewHolder.this.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return java.lang.Boolean.valueOf(dispatchTouchEvent);
            }
        });
        androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent();
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(requestDisallowInterceptTouchEvent);
        return modifier.then(pointerInteropFilter);
    }

    public static final androidx.compose.ui.Modifier motionEventSpy(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super android.view.MotionEvent, kotlin.Unit> function1) {
        return androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifier, function1, new androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1(function1, null));
    }

    public static final androidx.compose.ui.Modifier pointerInteropFilter(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, final kotlin.jvm.functions.Function1<? super android.view.MotionEvent, java.lang.Boolean> function1) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("pointerInteropFilter");
                inspectorInfo.getProperties().set("requestDisallowInterceptTouchEvent", androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent.this);
                inspectorInfo.getProperties().set("onTouchEvent", function1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                composer.startReplaceableGroup(374375707);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C78@3403L35:PointerInteropFilter.android.kt#a556rk");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(374375707, i, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:78)");
                }
                composer.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.compose.ui.input.pointer.PointerInteropFilter();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                androidx.compose.ui.input.pointer.PointerInteropFilter pointerInteropFilter = (androidx.compose.ui.input.pointer.PointerInteropFilter) rememberedValue;
                pointerInteropFilter.setOnTouchEvent(function1);
                pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return pointerInteropFilter;
            }
        });
    }
}
