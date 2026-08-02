package androidx.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/navigation/NavHostController;", "Landroidx/navigation/NavController;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/lifecycle/LifecycleOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "setOnBackPressedDispatcher", "(Landroidx/activity/OnBackPressedDispatcher;)V", "", "enabled", "enableOnBackPressed", "(Z)V", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "setViewModelStore", "(Landroidx/lifecycle/ViewModelStore;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class NavHostController extends androidx.view.NavController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostController(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.view.NavController
    public final void setLifecycleOwner(androidx.view.LifecycleOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
        super.setLifecycleOwner(owner);
    }

    @Override // androidx.view.NavController
    public final void setOnBackPressedDispatcher(androidx.view.OnBackPressedDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
        super.setOnBackPressedDispatcher(dispatcher);
    }

    @Override // androidx.view.NavController
    public final void enableOnBackPressed(boolean enabled) {
        super.enableOnBackPressed(enabled);
    }

    @Override // androidx.view.NavController
    public final void setViewModelStore(androidx.view.ViewModelStore viewModelStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStore, "");
        super.setViewModelStore(viewModelStore);
    }
}
