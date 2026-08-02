package androidx.compose.runtime.saveable;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aj\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003¢\u0006\u0002\b\u00062\u0019\u0010\t\u001a\u0015\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\n\"\u0004\b\u0000\u0010\r¢\u0006\u0004\b\u000e\u0010\u000f\"\"\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "Lkotlin/ExtensionFunctionType;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/Saver;", "Saver", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "T", "autoSaver", "()Landroidx/compose/runtime/saveable/Saver;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/saveable/Saver;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaverKt {
    private static final androidx.compose.runtime.saveable.Saver<java.lang.Object, java.lang.Object> getHighSpeedVideoFpsRanges = Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.saveable.SaverKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.compose.runtime.saveable.SaverKt.m5469$r8$lambda$z3n9CeinY1D3vTfiWsODcWWjA((androidx.compose.runtime.saveable.SaverScope) obj, obj2);
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.saveable.SaverKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.runtime.saveable.SaverKt.m5470$r8$lambda$jHzIUAn8EI26mdugxSpG_7hh5Y(obj);
        }
    });

    /* renamed from: $r8$lambda$-z3n9CeinY1D3vT-fiWsODcWWjA, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m5469$r8$lambda$z3n9CeinY1D3vTfiWsODcWWjA(androidx.compose.runtime.saveable.SaverScope saverScope, java.lang.Object obj) {
        return obj;
    }

    /* renamed from: $r8$lambda$jHzIUAn8EI26mdugxSpG-_7hh5Y, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m5470$r8$lambda$jHzIUAn8EI26mdugxSpG_7hh5Y(java.lang.Object obj) {
        return obj;
    }

    public static final <Original, Saveable> androidx.compose.runtime.saveable.Saver<Original, Saveable> Saver(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.saveable.SaverScope, ? super Original, ? extends Saveable> function2, final kotlin.jvm.functions.Function1<? super Saveable, ? extends Original> function1) {
        return new androidx.compose.runtime.saveable.Saver<Original, Saveable>() { // from class: androidx.compose.runtime.saveable.SaverKt$Saver$1
            @Override // androidx.compose.runtime.saveable.Saver
            public final Saveable save(androidx.compose.runtime.saveable.SaverScope saverScope, Original original) {
                return function2.invoke(saverScope, original);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public final Original restore(Saveable value) {
                return function1.invoke(value);
            }
        };
    }

    public static final <T> androidx.compose.runtime.saveable.Saver<T, java.lang.Object> autoSaver() {
        androidx.compose.runtime.saveable.Saver<T, java.lang.Object> saver = (androidx.compose.runtime.saveable.Saver<T, java.lang.Object>) getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(saver, "");
        return saver;
    }
}
