package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a!\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\r\u001a\u001e\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\f\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "requestKey", "", "clearFragmentResult", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "clearFragmentResultListener", "Landroid/os/Bundle;", "result", "setFragmentResult", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFragmentResultListener", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FragmentKt {
    public static final void setFragmentResult(androidx.fragment.app.Fragment fragment, java.lang.String str, android.os.Bundle bundle) {
        fragment.getParentFragmentManager().setFragmentResult(str, bundle);
    }

    public static final void clearFragmentResult(androidx.fragment.app.Fragment fragment, java.lang.String str) {
        fragment.getParentFragmentManager().clearFragmentResult(str);
    }

    public static final void setFragmentResultListener(androidx.fragment.app.Fragment fragment, java.lang.String str, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super android.os.Bundle, kotlin.Unit> function2) {
        fragment.getParentFragmentManager().setFragmentResultListener(str, fragment, new androidx.fragment.app.FragmentResultListener() { // from class: androidx.fragment.app.FragmentKt$$ExternalSyntheticLambda0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                kotlin.jvm.functions.Function2.this.invoke(str2, bundle);
            }
        });
    }

    public static final void clearFragmentResultListener(androidx.fragment.app.Fragment fragment, java.lang.String str) {
        fragment.getParentFragmentManager().clearFragmentResultListener(str);
    }
}
