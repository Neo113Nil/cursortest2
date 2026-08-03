package androidx.compose.ui;

/* compiled from: Actual.jvm.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0000¨\u0006\n"}, d2 = {"areObjectsOfSameType", "", "a", "", "b", "tryPopulateReflectively", "", "Landroidx/compose/ui/platform/InspectorInfo;", "element", "Landroidx/compose/ui/node/ModifierNodeElement;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Actual_jvmKt {
    public static final boolean areObjectsOfSameType(java.lang.Object obj, java.lang.Object obj2) {
        return obj.getClass() == obj2.getClass();
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
