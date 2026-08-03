package androidx.compose.runtime;

/* compiled from: MovableContent.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u0007\u001a;\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\u0005\"\u0004\b\u0000\u0010\t2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\n\u001aM\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u0005\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r2\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u000e\u001a_\u0010\u0002\u001a\u001f\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u00102#\u0010\u0006\u001a\u001f\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u0011\u001aq\u0010\u0002\u001a%\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0002\b\u0005\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u00132)\u0010\u0006\u001a%\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0002\b\u0005¢\u0006\u0002\u0010\u0014\u001aE\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017\"\u0004\b\u0000\u0010\u00162\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017¢\u0006\u0002\u0010\n\u001aW\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\t2\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017¢\u0006\u0002\u0010\u000e\u001ai\u0010\u0015\u001a$\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r2(\u0010\u0006\u001a$\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017¢\u0006\u0002\u0010\u0011\u001a{\u0010\u0015\u001a*\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u00102.\u0010\u0006\u001a*\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0017¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"movableContentKey", "", "movableContentOf", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "(Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "Lkotlin/Function1;", "P", "(Lkotlin/jvm/functions/Function3;)Lkotlin/jvm/functions/Function3;", "Lkotlin/Function2;", "P1", "P2", "(Lkotlin/jvm/functions/Function4;)Lkotlin/jvm/functions/Function4;", "Lkotlin/Function3;", "P3", "(Lkotlin/jvm/functions/Function5;)Lkotlin/jvm/functions/Function5;", "Lkotlin/Function4;", "P4", "(Lkotlin/jvm/functions/Function6;)Lkotlin/jvm/functions/Function6;", "movableContentWithReceiverOf", "R", "Lkotlin/ExtensionFunctionType;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MovableContentKt {
    public static final int movableContentKey = 126665345;

    public static final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> movableContentOf(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        final androidx.compose.runtime.MovableContent movableContent = new androidx.compose.runtime.MovableContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1079330685, true, new kotlin.jvm.functions.Function3<kotlin.Unit, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.Unit unit, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke(unit, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(kotlin.Unit unit, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C37@1498L9:MovableContent.kt#9igjgp");
                if ((i & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1079330685, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:37)");
                }
                function2.invoke(composer, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-642339857, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke(composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-642339857, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:39)");
                }
                composer.insertMovableContent(movableContent, kotlin.Unit.INSTANCE);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <P> kotlin.jvm.functions.Function3<P, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> movableContentOf(kotlin.jvm.functions.Function3<? super P, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        final androidx.compose.runtime.MovableContent movableContent = new androidx.compose.runtime.MovableContent(function3);
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-434707029, true, new kotlin.jvm.functions.Function3<P, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((androidx.compose.runtime.MovableContentKt$movableContentOf$2<P>) obj, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(P p, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i & 14) == 0) {
                    i |= composer.changed(p) ? 4 : 2;
                }
                if ((i & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-434707029, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:64)");
                }
                composer.insertMovableContent(movableContent, p);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <P1, P2> kotlin.jvm.functions.Function4<P1, P2, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> movableContentOf(final kotlin.jvm.functions.Function4<? super P1, ? super P2, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        final androidx.compose.runtime.MovableContent movableContent = new androidx.compose.runtime.MovableContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1849814513, true, new kotlin.jvm.functions.Function3<kotlin.Pair<? extends P1, ? extends P2>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((kotlin.Pair) obj, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(kotlin.Pair<? extends P1, ? extends P2> pair, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C87@3417L28:MovableContent.kt#9igjgp");
                if ((i & 14) == 0) {
                    i |= composer.changed(pair) ? 4 : 2;
                }
                if ((i & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1849814513, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:87)");
                }
                function4.invoke(pair.getFirst(), pair.getSecond(), composer, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1200019734, true, new kotlin.jvm.functions.Function4<P1, P2, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Object obj2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((androidx.compose.runtime.MovableContentKt$movableContentOf$3<P1, P2>) obj, obj2, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(P1 p1, P2 p2, androidx.compose.runtime.Composer composer, int i) {
                int i2;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i & 14) == 0) {
                    i2 = (composer.changed(p1) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 112) == 0) {
                    i2 |= composer.changed(p2) ? 32 : 16;
                }
                if ((i2 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1200019734, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:89)");
                }
                composer.insertMovableContent(movableContent, kotlin.TuplesKt.to(p1, p2));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <P1, P2, P3> kotlin.jvm.functions.Function5<P1, P2, P3, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> movableContentOf(final kotlin.jvm.functions.Function5<? super P1, ? super P2, ? super P3, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        final androidx.compose.runtime.MovableContent movableContent = new androidx.compose.runtime.MovableContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-284417101, true, new kotlin.jvm.functions.Function3<kotlin.Pair<? extends kotlin.Pair<? extends P1, ? extends P2>, ? extends P3>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((kotlin.Pair) obj, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(kotlin.Pair<? extends kotlin.Pair<? extends P1, ? extends P2>, ? extends P3> pair, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C115@4463L51:MovableContent.kt#9igjgp");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-284417101, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:115)");
                }
                function5.invoke(pair.getFirst().getFirst(), pair.getFirst().getSecond(), pair.getSecond(), composer, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1083870185, true, new kotlin.jvm.functions.Function5<P1, P2, P3, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((androidx.compose.runtime.MovableContentKt$movableContentOf$4<P1, P2, P3>) obj, obj2, obj3, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(P1 p1, P2 p2, P3 p3, androidx.compose.runtime.Composer composer, int i) {
                int i2;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i & 14) == 0) {
                    i2 = (composer.changed(p1) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 112) == 0) {
                    i2 |= composer.changed(p2) ? 32 : 16;
                }
                if ((i & 896) == 0) {
                    i2 |= composer.changed(p3) ? 256 : 128;
                }
                if ((i2 & 5851) == 1170 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1083870185, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:118)");
                }
                composer.insertMovableContent(movableContent, kotlin.TuplesKt.to(kotlin.TuplesKt.to(p1, p2), p3));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <P1, P2, P3, P4> kotlin.jvm.functions.Function6<P1, P2, P3, P4, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> movableContentOf(final kotlin.jvm.functions.Function6<? super P1, ? super P2, ? super P3, ? super P4, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function6) {
        final androidx.compose.runtime.MovableContent movableContent = new androidx.compose.runtime.MovableContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1876318581, true, new kotlin.jvm.functions.Function3<kotlin.Pair<? extends kotlin.Pair<? extends P1, ? extends P2>, ? extends kotlin.Pair<? extends P3, ? extends P4>>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((kotlin.Pair) obj, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(kotlin.Pair<? extends kotlin.Pair<? extends P1, ? extends P2>, ? extends kotlin.Pair<? extends P3, ? extends P4>> pair, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C144@5570L75:MovableContent.kt#9igjgp");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1876318581, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:144)");
                }
                function6.invoke(pair.getFirst().getFirst(), pair.getFirst().getSecond(), pair.getSecond().getFirst(), pair.getSecond().getSecond(), composer, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1741877681, true, new kotlin.jvm.functions.Function6<P1, P2, P3, P4, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((androidx.compose.runtime.MovableContentKt$movableContentOf$5<P1, P2, P3, P4>) obj, obj2, obj3, obj4, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(P1 p1, P2 p2, P3 p3, P4 p4, androidx.compose.runtime.Composer composer, int i) {
                int i2;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i & 14) == 0) {
                    i2 = (composer.changed(p1) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 112) == 0) {
                    i2 |= composer.changed(p2) ? 32 : 16;
                }
                if ((i & 896) == 0) {
                    i2 |= composer.changed(p3) ? 256 : 128;
                }
                if ((i & 7168) == 0) {
                    i2 |= composer.changed(p4) ? 2048 : 1024;
                }
                if ((46811 & i2) == 9362 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1741877681, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:147)");
                }
                composer.insertMovableContent(movableContent, kotlin.TuplesKt.to(kotlin.TuplesKt.to(p1, p2), kotlin.TuplesKt.to(p3, p4)));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <R> kotlin.jvm.functions.Function3<R, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> movableContentWithReceiverOf(final kotlin.jvm.functions.Function3<? super R, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        final androidx.compose.runtime.MovableContent movableContent = new androidx.compose.runtime.MovableContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(250838178, true, new kotlin.jvm.functions.Function3<R, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$1<R>) obj, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(R r, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C170@6662L9:MovableContent.kt#9igjgp");
                if ((i & 14) == 0) {
                    i |= composer.changed(r) ? 4 : 2;
                }
                if ((i & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(250838178, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:170)");
                }
                function3.invoke(r, composer, java.lang.Integer.valueOf(i & 14));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(506997506, true, new kotlin.jvm.functions.Function3<R, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$1<R>) obj, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(R r, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i & 14) == 0) {
                    i |= composer.changed(r) ? 4 : 2;
                }
                if ((i & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(506997506, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:172)");
                }
                composer.insertMovableContent(movableContent, r);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <R, P> kotlin.jvm.functions.Function4<R, P, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> movableContentWithReceiverOf(final kotlin.jvm.functions.Function4<? super R, ? super P, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        final androidx.compose.runtime.MovableContent movableContent = new androidx.compose.runtime.MovableContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(812082854, true, new kotlin.jvm.functions.Function3<kotlin.Pair<? extends R, ? extends P>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((kotlin.Pair) obj, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(kotlin.Pair<? extends R, ? extends P> pair, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C197@7673L18:MovableContent.kt#9igjgp");
                if ((i & 14) == 0) {
                    i |= composer.changed(pair) ? 4 : 2;
                }
                if ((i & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(812082854, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:197)");
                }
                function4.invoke(pair.getFirst(), pair.getSecond(), composer, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(627354118, true, new kotlin.jvm.functions.Function4<R, P, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Object obj2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$2<P, R>) obj, obj2, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(R r, P p, androidx.compose.runtime.Composer composer, int i) {
                int i2;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i & 14) == 0) {
                    i2 = (composer.changed(r) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 112) == 0) {
                    i2 |= composer.changed(p) ? 32 : 16;
                }
                if ((i2 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(627354118, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:199)");
                }
                composer.insertMovableContent(movableContent, kotlin.TuplesKt.to(r, p));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <R, P1, P2> kotlin.jvm.functions.Function5<R, P1, P2, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> movableContentWithReceiverOf(final kotlin.jvm.functions.Function5<? super R, ? super P1, ? super P2, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        final androidx.compose.runtime.MovableContent movableContent = new androidx.compose.runtime.MovableContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1322148760, true, new kotlin.jvm.functions.Function3<kotlin.Pair<? extends kotlin.Pair<? extends R, ? extends P1>, ? extends P2>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((kotlin.Pair) obj, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(kotlin.Pair<? extends kotlin.Pair<? extends R, ? extends P1>, ? extends P2> pair, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C225@8739L35:MovableContent.kt#9igjgp");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1322148760, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:225)");
                }
                function5.invoke(pair.getFirst().getFirst(), pair.getFirst().getSecond(), pair.getSecond(), composer, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(583402949, true, new kotlin.jvm.functions.Function5<R, P1, P2, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$3<P1, P2, R>) obj, obj2, obj3, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(R r, P1 p1, P2 p2, androidx.compose.runtime.Composer composer, int i) {
                int i2;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i & 14) == 0) {
                    i2 = (composer.changed(r) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 112) == 0) {
                    i2 |= composer.changed(p1) ? 32 : 16;
                }
                if ((i & 896) == 0) {
                    i2 |= composer.changed(p2) ? 256 : 128;
                }
                if ((i2 & 5851) == 1170 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(583402949, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:228)");
                }
                composer.insertMovableContent(movableContent, kotlin.TuplesKt.to(kotlin.TuplesKt.to(r, p1), p2));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <R, P1, P2, P3> kotlin.jvm.functions.Function6<R, P1, P2, P3, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> movableContentWithReceiverOf(final kotlin.jvm.functions.Function6<? super R, ? super P1, ? super P2, ? super P3, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function6) {
        final androidx.compose.runtime.MovableContent movableContent = new androidx.compose.runtime.MovableContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(838586922, true, new kotlin.jvm.functions.Function3<kotlin.Pair<? extends kotlin.Pair<? extends R, ? extends P1>, ? extends kotlin.Pair<? extends P2, ? extends P3>>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((kotlin.Pair) obj, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(kotlin.Pair<? extends kotlin.Pair<? extends R, ? extends P1>, ? extends kotlin.Pair<? extends P2, ? extends P3>> pair, androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C254@9865L59:MovableContent.kt#9igjgp");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(838586922, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:254)");
                }
                function6.invoke(pair.getFirst().getFirst(), pair.getFirst().getSecond(), pair.getSecond().getFirst(), pair.getSecond().getSecond(), composer, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1468683306, true, new kotlin.jvm.functions.Function6<R, P1, P2, P3, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke((androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$4<P1, P2, P3, R>) obj, obj2, obj3, obj4, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(R r, P1 p1, P2 p2, P3 p3, androidx.compose.runtime.Composer composer, int i) {
                int i2;
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i & 14) == 0) {
                    i2 = (composer.changed(r) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 112) == 0) {
                    i2 |= composer.changed(p1) ? 32 : 16;
                }
                if ((i & 896) == 0) {
                    i2 |= composer.changed(p2) ? 256 : 128;
                }
                if ((i & 7168) == 0) {
                    i2 |= composer.changed(p3) ? 2048 : 1024;
                }
                if ((46811 & i2) == 9362 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1468683306, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:257)");
                }
                composer.insertMovableContent(movableContent, kotlin.TuplesKt.to(kotlin.TuplesKt.to(r, p1), kotlin.TuplesKt.to(p2, p3)));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        });
    }
}
