package com.datadog.android.rum.internal.tracking;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/rum/internal/tracking/JetpackViewAttributesProvider;", "Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/view/View;", "view", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "extractAttributes", "(Landroid/view/View;Ljava/util/Map;)V", "", "hashCode", "()I", "p0", "getHighSpeedVideoSizes", "(Landroid/view/View;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JetpackViewAttributesProvider implements com.datadog.android.rum.tracking.ViewAttributesProvider {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // com.datadog.android.rum.tracking.ViewAttributesProvider
    public final void extractAttributes(android.view.View view, java.util.Map<java.lang.String, java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        for (androidx.recyclerview.widget.RecyclerView recyclerView = view.getParent(); recyclerView != 0; recyclerView = recyclerView.getParent()) {
            if ((recyclerView instanceof androidx.recyclerview.widget.RecyclerView) && view != null && (view.getLayoutParams() instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams)) {
                attributes.put(com.datadog.android.rum.RumAttributes.ACTION_TARGET_PARENT_INDEX, java.lang.Integer.valueOf(recyclerView.getChildAdapterPosition(view)));
                attributes.put(com.datadog.android.rum.RumAttributes.ACTION_TARGET_PARENT_CLASSNAME, recyclerView.getClass().getCanonicalName());
                attributes.put(com.datadog.android.rum.RumAttributes.ACTION_TARGET_PARENT_RESOURCE_ID, getHighSpeedVideoSizes(recyclerView));
                return;
            }
            view = recyclerView instanceof android.view.View ? recyclerView : null;
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null);
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    private static java.lang.String getHighSpeedVideoSizes(android.view.View p0) {
        try {
            java.lang.String resourceEntryName = p0.getResources().getResourceEntryName(p0.getId());
            return resourceEntryName == null ? "0x".concat(java.lang.String.valueOf(com.datadog.android.internal.utils.NumberExtKt.toHexString(p0.getId()))) : resourceEntryName;
        } catch (android.content.res.Resources.NotFoundException unused) {
            return "0x".concat(java.lang.String.valueOf(com.datadog.android.internal.utils.NumberExtKt.toHexString(p0.getId())));
        }
    }
}
