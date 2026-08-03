package androidx.compose.ui;

/* compiled from: ComposedModifier.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aH\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\b¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\t\u001a\\\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\b¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u000e\u001af\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\b¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0010\u001ap\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\b¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0012\u001aj\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u0014\"\u0004\u0018\u00010\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\b¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0016\u001a\u0014\u0010\u001b\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0000¨\u0006\u001c"}, d2 = {"composed", "Landroidx/compose/ui/Modifier;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "factory", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "fullyQualifiedName", "", "key1", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "key2", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "key3", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "materialize", "Landroidx/compose/runtime/Composer;", "modifier", "materializeModifier", "materializeWithCompositionLocalInjection", "materializeWithCompositionLocalInjectionInternal", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
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

    public static final androidx.compose.ui.Modifier materializeModifier(final androidx.compose.runtime.Composer composer, androidx.compose.ui.Modifier modifier) {
        if (modifier.all(new kotlin.jvm.functions.Function1<androidx.compose.ui.Modifier.Element, java.lang.Boolean>() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.ui.Modifier.Element element) {
                return java.lang.Boolean.valueOf(!(element instanceof androidx.compose.ui.ComposedModifier));
            }
        })) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        androidx.compose.ui.Modifier modifier2 = (androidx.compose.ui.Modifier) modifier.foldIn(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function2<androidx.compose.ui.Modifier, androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier>() { // from class: androidx.compose.ui.ComposedModifierKt$materialize$result$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier3, androidx.compose.ui.Modifier.Element element) {
                androidx.compose.ui.Modifier.Element element2;
                if (element instanceof androidx.compose.ui.ComposedModifier) {
                    kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier> factory = ((androidx.compose.ui.ComposedModifier) element).getFactory();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    element2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(androidx.compose.runtime.Composer.this, (androidx.compose.ui.Modifier) ((kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(factory, 3)).invoke(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.runtime.Composer.this, 0));
                } else {
                    element2 = element;
                }
                return modifier3.then(element2);
            }
        });
        composer.endReplaceableGroup();
        return modifier2;
    }

    public static final androidx.compose.ui.Modifier materializeWithCompositionLocalInjectionInternal(androidx.compose.runtime.Composer composer, androidx.compose.ui.Modifier modifier) {
        return modifier == androidx.compose.ui.Modifier.INSTANCE ? modifier : materializeModifier(composer, new androidx.compose.ui.CompositionLocalMapInjectionElement(composer.getCurrentCompositionLocalMap()).then(modifier));
    }
}
