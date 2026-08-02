package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u000b*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "a", util.h.xy.cb.b.f1091, "", "areObjectsOfSameType", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "classKeyForObject", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/InspectorInfo;", "Landroidx/compose/ui/node/ModifierNodeElement;", "element", "", "tryPopulateReflectively", "(Landroidx/compose/ui/platform/InspectorInfo;Landroidx/compose/ui/node/ModifierNodeElement;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Actual_jvmKt {
    public static final boolean areObjectsOfSameType(java.lang.Object obj, java.lang.Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final java.lang.Object classKeyForObject(java.lang.Object obj) {
        return obj.getClass();
    }

    public static final void tryPopulateReflectively(androidx.compose.ui.platform.InspectorInfo inspectorInfo, androidx.compose.ui.node.ModifierNodeElement<?> modifierNodeElement) {
        java.util.List sortedWith = kotlin.collections.ArraysKt.sortedWith(modifierNodeElement.getClass().getDeclaredFields(), new java.util.Comparator() { // from class: androidx.compose.ui.Actual_jvmKt$tryPopulateReflectively$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(((java.lang.reflect.Field) t).getName(), ((java.lang.reflect.Field) t2).getName());
            }
        });
        int size = sortedWith.size();
        for (int i = 0; i < size; i++) {
            java.lang.reflect.Field field = (java.lang.reflect.Field) sortedWith.get(i);
            if (!field.getDeclaringClass().isAssignableFrom(androidx.compose.ui.node.ModifierNodeElement.class)) {
                try {
                    field.setAccessible(true);
                    inspectorInfo.getProperties().set(field.getName(), field.get(modifierNodeElement));
                } catch (java.lang.IllegalAccessException | java.lang.SecurityException unused) {
                }
            }
        }
    }
}
