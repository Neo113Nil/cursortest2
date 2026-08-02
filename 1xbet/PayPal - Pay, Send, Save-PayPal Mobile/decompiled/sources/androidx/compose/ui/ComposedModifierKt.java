package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aJ\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\t\u001a\\\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\u000e\u001af\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\u0010\u001ap\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\u0012\u001aj\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u0013\"\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\u0015\u001a\u0019\u0010\u0018\u001a\u00020\u0000*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u0000*\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u001b\u0010\u001c\u001a\u00020\u0000*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001c\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u00020\u0000*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u0019"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "Landroidx/compose/runtime/Composable;", "factory", "composed", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "", "fullyQualifiedName", "", "key1", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "key2", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "key3", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "(Landroidx/compose/ui/Modifier;Ljava/lang/String;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composer;", "modifier", "materializeModifier", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "materialize", "materializeWithCompositionLocalInjectionInternal"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposedModifierKt {
    public static /* synthetic */ androidx.compose.ui.Modifier composed$default(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, function1, function3);
    }

    public static final androidx.compose.ui.Modifier composed(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.ui.Modifier> function3) {
        return modifier.then(new androidx.compose.ui.ComposedModifier(function1, function3));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier composed$default(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.Object obj, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            function1 = androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>) function1, (kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.ui.Modifier>) function3);
    }

    public static final androidx.compose.ui.Modifier composed(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.Object obj, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.ui.Modifier> function3) {
        return modifier.then(new androidx.compose.ui.KeyedComposedModifier1(str, obj, function1, function3));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier composed$default(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj3) {
        if ((i & 8) != 0) {
            function1 = androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, function1, function3);
    }

    public static final androidx.compose.ui.Modifier composed(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.ui.Modifier> function3) {
        return modifier.then(new androidx.compose.ui.KeyedComposedModifier2(str, obj, obj2, function1, function3));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier composed$default(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj4) {
        if ((i & 16) != 0) {
            function1 = androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, function1, function3);
    }

    public static final androidx.compose.ui.Modifier composed(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.ui.Modifier> function3) {
        return modifier.then(new androidx.compose.ui.KeyedComposedModifier3(str, obj, obj2, obj3, function1, function3));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier composed$default(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.Object[] objArr, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>) function1, (kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.ui.Modifier>) function3);
    }

    public static final androidx.compose.ui.Modifier composed(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.Object[] objArr, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.ui.Modifier> function3) {
        return modifier.then(new androidx.compose.ui.KeyedComposedModifierN(str, objArr, function1, function3));
    }

    public static final androidx.compose.ui.Modifier materializeModifier(androidx.compose.runtime.Composer composer, androidx.compose.ui.Modifier modifier) {
        composer.startReplaceGroup(439770924);
        androidx.compose.ui.Modifier highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(composer, modifier);
        composer.endReplaceGroup();
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.runtime.Composer composer, androidx.compose.ui.Modifier modifier) {
        if (modifier.all(new kotlin.jvm.functions.Function1<androidx.compose.ui.Modifier.Element, java.lang.Boolean>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.Modifier.Element element) {
                return java.lang.Boolean.valueOf(!(element instanceof androidx.compose.ui.ComposedModifier));
            }
        })) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        androidx.compose.ui.Modifier modifier2 = (androidx.compose.ui.Modifier) modifier.foldIn(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function2<androidx.compose.ui.Modifier, androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier3, androidx.compose.ui.Modifier.Element element) {
                androidx.compose.ui.Modifier.Element element2;
                if (element instanceof androidx.compose.ui.ComposedModifier) {
                    kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier> highSpeedVideoSizes = ((androidx.compose.ui.ComposedModifier) element).getHighSpeedVideoSizes();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoSizes, "");
                    element2 = androidx.compose.ui.ComposedModifierKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Composer.this, (androidx.compose.ui.Modifier) ((kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(highSpeedVideoSizes, 3)).invoke(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.runtime.Composer.this, 0));
                } else {
                    element2 = element;
                }
                return modifier3.then(element2);
            }

            {
                super(2);
            }
        });
        composer.endReplaceableGroup();
        return modifier2;
    }

    public static final androidx.compose.ui.Modifier materializeWithCompositionLocalInjectionInternal(androidx.compose.runtime.Composer composer, androidx.compose.ui.Modifier modifier) {
        return modifier == androidx.compose.ui.Modifier.INSTANCE ? modifier : materializeModifier(composer, new androidx.compose.ui.CompositionLocalMapInjectionElement(composer.getCurrentCompositionLocalMap()).then(modifier));
    }
}
