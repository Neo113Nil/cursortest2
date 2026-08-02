package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe", "(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/tooling/CompositionObserver;", "setObserver", "(Landroidx/compose/runtime/Composition;Landroidx/compose/runtime/tooling/CompositionObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositionObserverKt {
    public static final androidx.compose.runtime.tooling.CompositionObserverHandle observe(androidx.compose.runtime.Recomposer recomposer, androidx.compose.runtime.tooling.CompositionRegistrationObserver compositionRegistrationObserver) {
        return recomposer.addCompositionRegistrationObserver$runtime(compositionRegistrationObserver);
    }

    public static final androidx.compose.runtime.tooling.CompositionObserverHandle setObserver(androidx.compose.runtime.Composition composition, androidx.compose.runtime.tooling.CompositionObserver compositionObserver) {
        androidx.compose.runtime.tooling.ObservableComposition observableComposition = (androidx.compose.runtime.tooling.ObservableComposition) androidx.compose.runtime.CompositionKt.getCompositionService(composition, androidx.compose.runtime.CompositionKt.getObservableCompositionServiceKey());
        if (observableComposition != null) {
            return observableComposition.setObserver(compositionObserver);
        }
        return null;
    }
}
