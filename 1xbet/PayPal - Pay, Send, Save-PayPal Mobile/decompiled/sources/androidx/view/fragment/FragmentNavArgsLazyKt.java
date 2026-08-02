package androidx.view.fragment;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/navigation/NavArgs;", "Args", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavArgsLazy;", "navArgs", "(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavArgsLazy;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FragmentNavArgsLazyKt {
    public static final /* synthetic */ <Args extends androidx.view.NavArgs> androidx.view.NavArgsLazy<Args> navArgs(final androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "Args");
        return new androidx.view.NavArgsLazy<>(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.NavArgs.class), new kotlin.jvm.functions.Function0<android.os.Bundle>() { // from class: androidx.navigation.fragment.FragmentNavArgsLazyKt$navArgs$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.os.Bundle invoke() {
                android.os.Bundle arguments = androidx.fragment.app.Fragment.this.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Fragment ");
                sb.append(androidx.fragment.app.Fragment.this);
                sb.append(" has null arguments");
                throw new java.lang.IllegalStateException(sb.toString());
            }
        });
    }
}
