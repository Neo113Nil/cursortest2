package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/navigation/NavArgs;", "Args", "Landroid/app/Activity;", "Landroidx/navigation/NavArgsLazy;", "navArgs", "(Landroid/app/Activity;)Landroidx/navigation/NavArgsLazy;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/ActivityNavArgsLazyKt")
/* loaded from: classes7.dex */
final /* synthetic */ class ActivityNavArgsLazyKt__ActivityNavArgsLazy_androidKt {
    public static final /* synthetic */ <Args extends androidx.view.NavArgs> androidx.view.NavArgsLazy<Args> navArgs(final android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "Args");
        return new androidx.view.NavArgsLazy<>(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.NavArgs.class), new kotlin.jvm.functions.Function0<android.os.Bundle>() { // from class: androidx.navigation.ActivityNavArgsLazyKt__ActivityNavArgsLazy_androidKt$navArgs$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.os.Bundle invoke() {
                android.content.Intent intent = activity.getIntent();
                if (intent != null) {
                    android.app.Activity activity2 = activity;
                    android.os.Bundle extras = intent.getExtras();
                    if (extras == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Activity ");
                        sb.append(activity2);
                        sb.append(" has null extras in ");
                        sb.append(intent);
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                    if (extras != null) {
                        return extras;
                    }
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Activity ");
                sb2.append(activity);
                sb2.append(" has a null Intent");
                throw new java.lang.IllegalStateException(sb2.toString());
            }
        });
    }
}
