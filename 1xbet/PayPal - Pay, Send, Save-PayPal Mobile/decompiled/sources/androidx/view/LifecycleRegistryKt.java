package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "Landroidx/lifecycle/Lifecycle$State;", "current", io.ktor.http.LinkHeader.Rel.Next, "", "checkLifecycleStateTransition", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/Lifecycle$State;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LifecycleRegistryKt {
    public static final void checkLifecycleStateTransition(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state, androidx.lifecycle.Lifecycle.State state2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state2, "");
        if (state == androidx.lifecycle.Lifecycle.State.INITIALIZED && state2 == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("State must be at least '");
            sb.append(androidx.lifecycle.Lifecycle.State.CREATED);
            sb.append("' to be moved to '");
            sb.append(state2);
            sb.append("' in component ");
            sb.append(lifecycleOwner);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        if (state != androidx.lifecycle.Lifecycle.State.DESTROYED || state == state2) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("State is '");
        sb2.append(androidx.lifecycle.Lifecycle.State.DESTROYED);
        sb2.append("' and cannot be moved to `");
        sb2.append(state2);
        sb2.append("` in component ");
        sb2.append(lifecycleOwner);
        throw new java.lang.IllegalStateException(sb2.toString().toString());
    }
}
