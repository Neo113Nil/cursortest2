package androidx.compose.foundation.text.contextmenu;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\t*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R?\u0010\u001a\u001a\u0019\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u00188\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fRe\u0010%\u001a?\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\"¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070#¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020$0!8\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010\u0003\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/ProcessTextApi23Impl;", "", "<init>", "()V", "Landroid/content/Intent;", "getHighSpeedVideoFpsRangesFor", "()Landroid/content/Intent;", "Landroid/content/pm/ResolveInfo;", "info", "", "editable", "createProcessTextIntentForResolveInfo", "(Landroid/content/pm/ResolveInfo;Z)Landroid/content/Intent;", "Landroid/content/Context;", "context", "", "queryProcessTextActivities", "(Landroid/content/Context;)Ljava/util/List;", "p0", "getHighSpeedVideoFpsRanges", "(Landroid/content/pm/ResolveInfo;Landroid/content/Context;)Z", "Landroid/content/pm/ActivityInfo;", "Camera2StreamConfigurationMap", "(Landroid/content/pm/ActivityInfo;Landroid/content/Context;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "processTextActivitiesQuery", "Lkotlin/jvm/functions/Function1;", "getProcessTextActivitiesQuery", "()Lkotlin/jvm/functions/Function1;", "setProcessTextActivitiesQuery", "(Lkotlin/jvm/functions/Function1;)V", "getProcessTextActivitiesQuery$annotations", "Lkotlin/Function5;", "", "Landroidx/compose/ui/text/TextRange;", "", "onClickProcessTextItem", "Lkotlin/jvm/functions/Function5;", "getOnClickProcessTextItem", "()Lkotlin/jvm/functions/Function5;", "setOnClickProcessTextItem", "(Lkotlin/jvm/functions/Function5;)V", "getOnClickProcessTextItem$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProcessTextApi23Impl {
    public static final androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl INSTANCE = new androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl();
    private static kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends android.content.pm.ResolveInfo>> processTextActivitiesQuery = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            java.util.List highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl.getHighSpeedVideoFpsRanges((android.content.Context) obj);
            return highSpeedVideoFpsRanges;
        }
    };
    private static kotlin.jvm.functions.Function5<? super android.content.Context, ? super android.content.pm.ResolveInfo, ? super java.lang.Boolean, ? super java.lang.CharSequence, ? super androidx.compose.ui.text.TextRange, kotlin.Unit> onClickProcessTextItem = new kotlin.jvm.functions.Function5() { // from class: androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function5
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
            kotlin.Unit highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl.getHighSpeedVideoFpsRangesFor((android.content.Context) obj, (android.content.pm.ResolveInfo) obj2, ((java.lang.Boolean) obj3).booleanValue(), (java.lang.CharSequence) obj4, (androidx.compose.ui.text.TextRange) obj5);
            return highSpeedVideoFpsRangesFor;
        }
    };
    public static final int $stable = 8;

    public static /* synthetic */ void getOnClickProcessTextItem$annotations() {
    }

    public static /* synthetic */ void getProcessTextActivitiesQuery$annotations() {
    }

    private ProcessTextApi23Impl() {
    }

    public final kotlin.jvm.functions.Function1<android.content.Context, java.util.List<android.content.pm.ResolveInfo>> getProcessTextActivitiesQuery() {
        return processTextActivitiesQuery;
    }

    public final void setProcessTextActivitiesQuery(kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends android.content.pm.ResolveInfo>> function1) {
        processTextActivitiesQuery = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighSpeedVideoFpsRanges(android.content.Context context) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(INSTANCE.getHighSpeedVideoFpsRangesFor(), 0);
        java.util.ArrayList arrayList = new java.util.ArrayList(queryIntentActivities.size());
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            android.content.pm.ResolveInfo resolveInfo = queryIntentActivities.get(i);
            if (INSTANCE.getHighSpeedVideoFpsRanges(resolveInfo, context)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    public final kotlin.jvm.functions.Function5<android.content.Context, android.content.pm.ResolveInfo, java.lang.Boolean, java.lang.CharSequence, androidx.compose.ui.text.TextRange, kotlin.Unit> getOnClickProcessTextItem() {
        return onClickProcessTextItem;
    }

    public final void setOnClickProcessTextItem(kotlin.jvm.functions.Function5<? super android.content.Context, ? super android.content.pm.ResolveInfo, ? super java.lang.Boolean, ? super java.lang.CharSequence, ? super androidx.compose.ui.text.TextRange, kotlin.Unit> function5) {
        onClickProcessTextItem = function5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(android.content.Context context, android.content.pm.ResolveInfo resolveInfo, boolean z, java.lang.CharSequence charSequence, androidx.compose.ui.text.TextRange textRange) {
        java.lang.String obj = charSequence.subSequence(androidx.compose.ui.text.TextRange.m8037getMinimpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI()), androidx.compose.ui.text.TextRange.m8036getMaximpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI())).toString();
        android.content.Intent createProcessTextIntentForResolveInfo = INSTANCE.createProcessTextIntentForResolveInfo(resolveInfo, z);
        createProcessTextIntentForResolveInfo.putExtra("android.intent.extra.PROCESS_TEXT", obj);
        context.startActivity(createProcessTextIntentForResolveInfo);
        return kotlin.Unit.INSTANCE;
    }

    private final android.content.Intent getHighSpeedVideoFpsRangesFor() {
        return new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    public final android.content.Intent createProcessTextIntentForResolveInfo(android.content.pm.ResolveInfo info, boolean editable) {
        return getHighSpeedVideoFpsRangesFor().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", editable).setClassName(info.activityInfo.packageName, info.activityInfo.name);
    }

    public final java.util.List<android.content.pm.ResolveInfo> queryProcessTextActivities(android.content.Context context) {
        return (java.util.List) processTextActivitiesQuery.invoke(context);
    }

    private final boolean getHighSpeedVideoFpsRanges(android.content.pm.ResolveInfo resolveInfo, android.content.Context context) {
        return context.getPackageName().equals(resolveInfo.activityInfo.packageName) || Camera2StreamConfigurationMap(resolveInfo.activityInfo, context);
    }

    private final boolean Camera2StreamConfigurationMap(android.content.pm.ActivityInfo activityInfo, android.content.Context context) {
        if (activityInfo.exported) {
            return activityInfo.permission == null || context.checkSelfPermission(activityInfo.permission) == 0;
        }
        return false;
    }
}
