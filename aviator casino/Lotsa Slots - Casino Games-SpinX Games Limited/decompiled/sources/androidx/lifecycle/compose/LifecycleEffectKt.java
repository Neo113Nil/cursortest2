package androidx.lifecycle.compose;

/* compiled from: LifecycleEffect.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a:\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001aD\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0013\u001aN\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001aH\u0010\t\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0017\"\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0018\u001a6\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000e2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0003¢\u0006\u0002\u0010\u001b\u001a:\u0010\u001c\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001aD\u0010\u001c\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0013\u001aN\u0010\u001c\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001aH\u0010\u001c\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0017\"\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0018\u001a6\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001d2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\r¢\u0006\u0002\b\u0010H\u0003¢\u0006\u0002\u0010 ¨\u0006!²\u0006\u0010\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u008a\u0084\u0002"}, d2 = {"LifecycleEventEffect", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onEvent", "Lkotlin/Function0;", "(Landroidx/lifecycle/Lifecycle$Event;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LifecycleResumeEffect", "key1", "", "effects", "Lkotlin/Function1;", "Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "", "([Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LifecycleResumeEffectImpl", "scope", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LifecycleStartEffect", "Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;", "Landroidx/lifecycle/compose/LifecycleStopOrDisposeEffectResult;", "LifecycleStartEffectImpl", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lifecycle-runtime-compose_release", "currentOnEvent"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LifecycleEffectKt {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r2 != 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LifecycleEventEffect(final androidx.lifecycle.Lifecycle.Event event, androidx.lifecycle.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-709389590);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LifecycleEventEffect)56@2466L7,66@2897L29,67@2931L332:LifecycleEffect.kt#2vxrgp");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(event) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(function0) ? 256 : 128;
        }
        if (i4 != 2 || (i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 103361330, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume = startRestartGroup.consume(localLifecycleOwner);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    lifecycleOwner = (androidx.lifecycle.LifecycleOwner) consume;
                    i3 &= -113;
                }
                startRestartGroup.endDefaults();
                if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                    throw new java.lang.IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner, new androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$1(lifecycleOwner, event, androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i3 >> 6) & 14)), startRestartGroup, 8);
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final androidx.lifecycle.LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i5) {
                    androidx.lifecycle.compose.LifecycleEffectKt.LifecycleEventEffect(androidx.lifecycle.Lifecycle.Event.this, lifecycleOwner2, function0, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final void LifecycleStartEffect(final java.lang.Object obj, androidx.lifecycle.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1408314671);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LifecycleStartEffect)P(1,2)134@5886L7,137@6023L102,140@6130L80:LifecycleEffect.kt#2vxrgp");
        if ((i2 & 2) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 103361330, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localLifecycleOwner);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            i3 = i & (-113);
            lifecycleOwner2 = (androidx.lifecycle.LifecycleOwner) consume;
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        startRestartGroup.startReplaceableGroup(-3686552);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(obj) | startRestartGroup.changed(lifecycleOwner2);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.lifecycle.compose.LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LifecycleStartEffectImpl(lifecycleOwner2, (androidx.lifecycle.compose.LifecycleStartStopEffectScope) rememberedValue, function1, startRestartGroup, (i3 & 896) | 72);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffect$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                    androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(obj, lifecycleOwner2, function1, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final void LifecycleStartEffect(final java.lang.Object obj, final java.lang.Object obj2, androidx.lifecycle.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(696924721);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LifecycleStartEffect)P(1,2,3)197@8922L7,200@9059L108,203@9172L80:LifecycleEffect.kt#2vxrgp");
        if ((i2 & 4) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 103361330, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localLifecycleOwner);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            i3 = i & (-897);
            lifecycleOwner2 = (androidx.lifecycle.LifecycleOwner) consume;
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        startRestartGroup.startReplaceableGroup(-3686095);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(obj) | startRestartGroup.changed(obj2) | startRestartGroup.changed(lifecycleOwner2);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.lifecycle.compose.LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LifecycleStartEffectImpl(lifecycleOwner2, (androidx.lifecycle.compose.LifecycleStartStopEffectScope) rememberedValue, function1, startRestartGroup, ((i3 >> 3) & 896) | 72);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffect$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                    androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(obj, obj2, lifecycleOwner2, function1, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final void LifecycleStartEffect(final java.lang.Object obj, final java.lang.Object obj2, final java.lang.Object obj3, androidx.lifecycle.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(574812561);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LifecycleStartEffect)P(1,2,3,4)262@12063L7,265@12200L114,268@12319L80:LifecycleEffect.kt#2vxrgp");
        if ((i2 & 8) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 103361330, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localLifecycleOwner);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            i3 = i & (-7169);
            lifecycleOwner2 = (androidx.lifecycle.LifecycleOwner) consume;
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        int i4 = 0;
        java.lang.Object[] objArr = {obj, obj2, obj3, lifecycleOwner2};
        startRestartGroup.startReplaceableGroup(-3685570);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        while (i4 < 4) {
            java.lang.Object obj4 = objArr[i4];
            i4++;
            z |= startRestartGroup.changed(obj4);
        }
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.lifecycle.compose.LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LifecycleStartEffectImpl(lifecycleOwner2, (androidx.lifecycle.compose.LifecycleStartStopEffectScope) rememberedValue, function1, startRestartGroup, ((i3 >> 6) & 896) | 72);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffect$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i5) {
                    androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(obj, obj2, obj3, lifecycleOwner2, function1, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final void LifecycleStartEffect(final java.lang.Object[] objArr, androidx.lifecycle.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1510305724);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LifecycleStartEffect)P(1,2)323@15029L7,326@15166L103,329@15274L80:LifecycleEffect.kt#2vxrgp");
        if ((i2 & 2) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 103361330, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localLifecycleOwner);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            i3 = i & (-113);
            lifecycleOwner2 = (androidx.lifecycle.LifecycleOwner) consume;
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(objArr);
        spreadBuilder.add(lifecycleOwner2);
        java.lang.Object[] array = spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]);
        startRestartGroup.startReplaceableGroup(-3685570);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        int length = array.length;
        int i4 = 0;
        boolean z = false;
        while (i4 < length) {
            java.lang.Object obj = array[i4];
            i4++;
            z |= startRestartGroup.changed(obj);
        }
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.lifecycle.compose.LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LifecycleStartEffectImpl(lifecycleOwner2, (androidx.lifecycle.compose.LifecycleStartStopEffectScope) rememberedValue, function1, startRestartGroup, (i3 & 896) | 72);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffect$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i5) {
                    java.lang.Object[] objArr2 = objArr;
                    androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.util.Arrays.copyOf(objArr2, objArr2.length), lifecycleOwner2, (kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult>) function1, composer2, i | 1, i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleStartEffectImpl(final androidx.lifecycle.LifecycleOwner lifecycleOwner, final androidx.lifecycle.compose.LifecycleStartStopEffectScope lifecycleStartStopEffectScope, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> function1, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(228371534);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LifecycleStartEffectImpl)P(1,2)338@15578L659:LifecycleEffect.kt#2vxrgp");
        androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner, lifecycleStartStopEffectScope, new androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1(lifecycleOwner, lifecycleStartStopEffectScope, function1), startRestartGroup, 72);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i2) {
                    androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffectImpl(androidx.lifecycle.LifecycleOwner.this, lifecycleStartStopEffectScope, function1, composer2, i | 1);
                }
            });
        }
    }

    public static final void LifecycleResumeEffect(final java.lang.Object obj, androidx.lifecycle.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1220373486);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LifecycleResumeEffect)P(1,2)446@20254L7,449@20396L104,452@20505L83:LifecycleEffect.kt#2vxrgp");
        if ((i2 & 2) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 103361330, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localLifecycleOwner);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            i3 = i & (-113);
            lifecycleOwner2 = (androidx.lifecycle.LifecycleOwner) consume;
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        startRestartGroup.startReplaceableGroup(-3686552);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(obj) | startRestartGroup.changed(lifecycleOwner2);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.lifecycle.compose.LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LifecycleResumeEffectImpl(lifecycleOwner2, (androidx.lifecycle.compose.LifecycleResumePauseEffectScope) rememberedValue, function1, startRestartGroup, (i3 & 896) | 72);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffect$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                    androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(obj, lifecycleOwner2, function1, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final void LifecycleResumeEffect(final java.lang.Object obj, final java.lang.Object obj2, androidx.lifecycle.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(752680142);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LifecycleResumeEffect)P(1,2,3)509@23336L7,512@23478L110,515@23593L83:LifecycleEffect.kt#2vxrgp");
        if ((i2 & 4) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 103361330, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localLifecycleOwner);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            i3 = i & (-897);
            lifecycleOwner2 = (androidx.lifecycle.LifecycleOwner) consume;
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        startRestartGroup.startReplaceableGroup(-3686095);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(obj) | startRestartGroup.changed(obj2) | startRestartGroup.changed(lifecycleOwner2);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.lifecycle.compose.LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LifecycleResumeEffectImpl(lifecycleOwner2, (androidx.lifecycle.compose.LifecycleResumePauseEffectScope) rememberedValue, function1, startRestartGroup, ((i3 >> 3) & 896) | 72);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffect$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                    androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(obj, obj2, lifecycleOwner2, function1, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final void LifecycleResumeEffect(final java.lang.Object obj, final java.lang.Object obj2, final java.lang.Object obj3, androidx.lifecycle.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-485941842);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LifecycleResumeEffect)P(1,2,3,4)574@26517L7,577@26659L116,580@26780L83:LifecycleEffect.kt#2vxrgp");
        if ((i2 & 8) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 103361330, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localLifecycleOwner);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            i3 = i & (-7169);
            lifecycleOwner2 = (androidx.lifecycle.LifecycleOwner) consume;
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        int i4 = 0;
        java.lang.Object[] objArr = {obj, obj2, obj3, lifecycleOwner2};
        startRestartGroup.startReplaceableGroup(-3685570);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        while (i4 < 4) {
            java.lang.Object obj4 = objArr[i4];
            i4++;
            z |= startRestartGroup.changed(obj4);
        }
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.lifecycle.compose.LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LifecycleResumeEffectImpl(lifecycleOwner2, (androidx.lifecycle.compose.LifecycleResumePauseEffectScope) rememberedValue, function1, startRestartGroup, ((i3 >> 6) & 896) | 72);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffect$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i5) {
                    androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(obj, obj2, obj3, lifecycleOwner2, function1, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final void LifecycleResumeEffect(final java.lang.Object[] objArr, androidx.lifecycle.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-781756895);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LifecycleResumeEffect)P(1,2)635@29529L7,638@29671L105,641@29781L83:LifecycleEffect.kt#2vxrgp");
        if ((i2 & 2) != 0) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 103361330, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localLifecycleOwner);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            i3 = i & (-113);
            lifecycleOwner2 = (androidx.lifecycle.LifecycleOwner) consume;
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(objArr);
        spreadBuilder.add(lifecycleOwner2);
        java.lang.Object[] array = spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]);
        startRestartGroup.startReplaceableGroup(-3685570);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        int length = array.length;
        int i4 = 0;
        boolean z = false;
        while (i4 < length) {
            java.lang.Object obj = array[i4];
            i4++;
            z |= startRestartGroup.changed(obj);
        }
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.lifecycle.compose.LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LifecycleResumeEffectImpl(lifecycleOwner2, (androidx.lifecycle.compose.LifecycleResumePauseEffectScope) rememberedValue, function1, startRestartGroup, (i3 & 896) | 72);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffect$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i5) {
                    java.lang.Object[] objArr2 = objArr;
                    androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.util.Arrays.copyOf(objArr2, objArr2.length), lifecycleOwner2, (kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult>) function1, composer2, i | 1, i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleResumeEffectImpl(final androidx.lifecycle.LifecycleOwner lifecycleOwner, final androidx.lifecycle.compose.LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> function1, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(912823238);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LifecycleResumeEffectImpl)P(1,2)650@30094L668:LifecycleEffect.kt#2vxrgp");
        androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner, lifecycleResumePauseEffectScope, new androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$1(lifecycleOwner, lifecycleResumePauseEffectScope, function1), startRestartGroup, 72);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i2) {
                    androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffectImpl(androidx.lifecycle.LifecycleOwner.this, lifecycleResumePauseEffectScope, function1, composer2, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> LifecycleEventEffect$lambda$0(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state) {
        return state.getValue();
    }
}
