package com.datadog.android.rum.internal.instrumentation.gestures;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\r\u001a\u00020\u0004*\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u0004*\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/tracking/InteractionPredicate;", "interactionPredicate", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "", "resolveTargetName", "(Lcom/datadog/android/rum/tracking/InteractionPredicate;Ljava/lang/Object;)Ljava/lang/String;", "Lcom/datadog/android/rum/tracking/ViewTarget;", "resolveViewTargetName", "(Lcom/datadog/android/rum/tracking/InteractionPredicate;Lcom/datadog/android/rum/tracking/ViewTarget;)Ljava/lang/String;", "Landroid/content/Context;", "", "id", "resourceIdName", "(Landroid/content/Context;I)Ljava/lang/String;", "Landroid/view/View;", "targetClassName", "(Landroid/view/View;)Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GesturesUtilsKt {
    public static final java.lang.String resolveViewTargetName(com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate, com.datadog.android.rum.tracking.ViewTarget viewTarget) {
        java.lang.String resolveTargetName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionPredicate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewTarget, "");
        android.view.View view = viewTarget.getViewRef().get();
        if (view != null && (resolveTargetName = resolveTargetName(interactionPredicate, view)) != null) {
            return resolveTargetName;
        }
        com.datadog.android.rum.tracking.Node node = viewTarget.getNode();
        return node != null ? node.getName() : "";
    }

    public static final java.lang.String resolveTargetName(com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionPredicate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        java.lang.String targetName = interactionPredicate.getTargetName(obj);
        java.lang.String str = targetName;
        return (str == null || str.length() == 0) ? "" : targetName;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012 A[Catch: NotFoundException -> 0x001f, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x001f, blocks: (B:13:0x0004, B:15:0x000a, B:5:0x0012), top: B:12:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String resourceIdName(android.content.Context context, int i) {
        java.lang.String resourceEntryName;
        if (context != null) {
            try {
                android.content.res.Resources resources = context.getResources();
                if (resources != null) {
                    resourceEntryName = resources.getResourceEntryName(i);
                    return resourceEntryName != null ? "0x".concat(java.lang.String.valueOf(com.datadog.android.internal.utils.NumberExtKt.toHexString(i))) : resourceEntryName;
                }
            } catch (android.content.res.Resources.NotFoundException unused) {
                return "0x".concat(java.lang.String.valueOf(com.datadog.android.internal.utils.NumberExtKt.toHexString(i)));
            }
        }
        resourceEntryName = null;
        if (resourceEntryName != null) {
        }
    }

    public static final java.lang.String targetClassName(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        java.lang.String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName != null) {
            return canonicalName;
        }
        java.lang.String simpleName = view.getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return simpleName;
    }
}
