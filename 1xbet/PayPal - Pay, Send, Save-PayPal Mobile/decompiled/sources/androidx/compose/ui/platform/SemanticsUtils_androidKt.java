package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroidx/compose/ui/text/TextLayoutResult;", "getTextLayoutResult", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Landroidx/compose/ui/text/TextLayoutResult;", "", "getScrollViewportLength", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/Float;", "", "Landroidx/compose/ui/platform/ScrollObservationScope;", "", "id", "findById", "(Ljava/util/List;I)Landroidx/compose/ui/platform/ScrollObservationScope;", "Landroidx/compose/ui/semantics/Role;", "", "toLegacyClassName-V4PA4sw", "(I)Ljava/lang/String;", "toLegacyClassName", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/View;", "semanticsIdToView", "(Landroidx/compose/ui/platform/AndroidViewsHandler;I)Landroid/view/View;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SemanticsUtils_androidKt {
    public static final androidx.compose.ui.text.TextLayoutResult getTextLayoutResult(androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        kotlin.jvm.functions.Function1 function1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetTextLayoutResult());
        if (accessibilityAction == null || (function1 = (kotlin.jvm.functions.Function1) accessibilityAction.getAction()) == null || !((java.lang.Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (androidx.compose.ui.text.TextLayoutResult) arrayList.get(0);
    }

    public static final java.lang.Float getScrollViewportLength(androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        kotlin.jvm.functions.Function1 function1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetScrollViewportLength());
        if (accessibilityAction == null || (function1 = (kotlin.jvm.functions.Function1) accessibilityAction.getAction()) == null || !((java.lang.Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (java.lang.Float) arrayList.get(0);
    }

    public static final androidx.compose.ui.platform.ScrollObservationScope findById(java.util.List<androidx.compose.ui.platform.ScrollObservationScope> list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getSemanticsNodeId() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    /* renamed from: toLegacyClassName-V4PA4sw, reason: not valid java name */
    public static final java.lang.String m7775toLegacyClassNameV4PA4sw(int i) {
        if (androidx.compose.ui.semantics.Role.m7794equalsimpl0(i, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c())) {
            return "android.widget.Button";
        }
        if (androidx.compose.ui.semantics.Role.m7794equalsimpl0(i, androidx.compose.ui.semantics.Role.INSTANCE.m7800getCheckboxo7Vup1c())) {
            return "android.widget.CheckBox";
        }
        if (androidx.compose.ui.semantics.Role.m7794equalsimpl0(i, androidx.compose.ui.semantics.Role.INSTANCE.m7803getRadioButtono7Vup1c())) {
            return "android.widget.RadioButton";
        }
        if (androidx.compose.ui.semantics.Role.m7794equalsimpl0(i, androidx.compose.ui.semantics.Role.INSTANCE.m7802getImageo7Vup1c())) {
            return "android.widget.ImageView";
        }
        if (androidx.compose.ui.semantics.Role.m7794equalsimpl0(i, androidx.compose.ui.semantics.Role.INSTANCE.m7801getDropdownListo7Vup1c())) {
            return "android.widget.Spinner";
        }
        if (androidx.compose.ui.semantics.Role.m7794equalsimpl0(i, androidx.compose.ui.semantics.Role.INSTANCE.m7806getValuePickero7Vup1c())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final android.view.View semanticsIdToView(androidx.compose.ui.platform.AndroidViewsHandler androidViewsHandler, int i) {
        java.lang.Object obj;
        java.util.Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((androidx.compose.ui.node.LayoutNode) ((java.util.Map.Entry) obj).getKey()).getSemanticsId() == i) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return entry != null ? (androidx.compose.ui.viewinterop.AndroidViewHolder) entry.getValue() : null;
    }
}
