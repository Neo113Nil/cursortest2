package androidx.compose.foundation.text.contextmenu;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a3\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "Landroid/content/Context;", "context", "", "editable", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "", "addProcessedTextContextMenuItems-UAq72N0", "(Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;Landroid/content/Context;ZLjava/lang/CharSequence;J)V", "addProcessedTextContextMenuItems"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProcessText_androidKt {
    /* renamed from: addProcessedTextContextMenuItems-UAq72N0, reason: not valid java name */
    public static final void m2146addProcessedTextContextMenuItemsUAq72N0(androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope, final android.content.Context context, final boolean z, final java.lang.CharSequence charSequence, final long j) {
        if (!androidx.compose.foundation.ComposeFoundationFlags.isSmartSelectionEnabled || androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(j) || charSequence.length() == 0) {
            return;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.util.List<android.content.pm.ResolveInfo> queryProcessTextActivities = androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl.INSTANCE.queryProcessTextActivities(context);
        if (queryProcessTextActivities.isEmpty()) {
            return;
        }
        textContextMenuBuilderScope.separator();
        int size = queryProcessTextActivities.size();
        for (int i = 0; i < size; i++) {
            final android.content.pm.ResolveInfo resolveInfo = queryProcessTextActivities.get(i);
            androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope_androidKt.item$default(textContextMenuBuilderScope, new androidx.compose.foundation.text.contextmenu.data.ProcessTextKey(i), resolveInfo.loadLabel(packageManager).toString(), 0, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.contextmenu.ProcessText_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.foundation.text.contextmenu.ProcessText_androidKt.$r8$lambda$SEhsqHDCZKTOTFjmrotaPzaFt2A(context, resolveInfo, z, charSequence, j, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj);
                }
            }, 4, null);
        }
        textContextMenuBuilderScope.separator();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SEhsqHDCZKTOTFjmrotaPzaFt2A(android.content.Context context, android.content.pm.ResolveInfo resolveInfo, boolean z, java.lang.CharSequence charSequence, long j, androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession) {
        androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl.INSTANCE.getOnClickProcessTextItem().invoke(context, resolveInfo, java.lang.Boolean.valueOf(z), charSequence, androidx.compose.ui.text.TextRange.m8027boximpl(j));
        textContextMenuSession.close();
        return kotlin.Unit.INSTANCE;
    }
}
