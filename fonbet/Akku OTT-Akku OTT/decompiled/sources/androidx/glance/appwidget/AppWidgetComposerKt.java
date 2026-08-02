package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.DpSize;
import androidx.glance.Applier;
import androidx.glance.GlanceId;
import androidx.glance.appwidget.LayoutConfiguration;
import androidx.glance.appwidget.SizeMode;
import androidx.glance.state.ConfigManager;
import androidx.glance.state.GlanceState;
import androidx.glance.state.PreferencesGlanceStateDefinition;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.flow.C1062g;
import kotlinx.coroutines.flow.InterfaceC1060e;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a{\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u0014H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aQ\u0010\u0000\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"compose", "Landroid/widget/RemoteViews;", "context", "Landroid/content/Context;", "id", "Landroidx/glance/GlanceId;", "sizeMode", "Landroidx/glance/appwidget/SizeMode;", "size", "Landroidx/compose/ui/unit/DpSize;", "options", "Landroid/os/Bundle;", "state", "", "configManager", "Landroidx/glance/state/ConfigManager;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/glance/GlanceComposable;", "compose-1pU2XAk", "(Landroid/content/Context;Landroidx/glance/GlanceId;Landroidx/glance/appwidget/SizeMode;Landroidx/compose/ui/unit/DpSize;Landroid/os/Bundle;Ljava/lang/Object;Landroidx/glance/state/ConfigManager;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/glance/appwidget/GlanceAppWidget;", "compose-DR8WL-M", "(Landroidx/glance/appwidget/GlanceAppWidget;Landroid/content/Context;Landroidx/glance/GlanceId;Landroid/os/Bundle;Landroidx/compose/ui/unit/DpSize;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppWidgetComposerKt {
    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(2:3|(19:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(2:19|20))(9:21|22|23|24|25|26|27|28|(1:31)(1:30)))(13:39|40|(1:44)|45|46|(2:48|31)|23|24|25|26|27|28|(0)(0)))(1:49))(3:57|(1:59)|31)|50|(3:52|(1:54)|31)(1:56)|55|40|(2:42|44)|45|46|(0)|23|24|25|26|27|28|(0)(0)))|61|6|7|(0)(0)|50|(0)(0)|55|40|(0)|45|46|(0)|23|24|25|26|27|28|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01ec, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01ed, code lost:
    
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01ef, code lost:
    
        r3.L$0 = r0;
        r3.L$1 = null;
        r3.L$2 = null;
        r3.L$3 = null;
        r3.L$4 = null;
        r3.L$5 = null;
        r3.L$6 = null;
        r3.L$7 = null;
        r3.label = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0206, code lost:
    
        if (r5.save(r3) == r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0068, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0208 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12, types: [androidx.glance.appwidget.LayoutConfiguration] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* renamed from: compose-1pU2XAk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1278compose1pU2XAk(Context context, GlanceId glanceId, SizeMode sizeMode, DpSize dpSize, Bundle bundle, Object obj, ConfigManager configManager, Function2<? super Composer, ? super Integer, Unit> function2, Continuation<? super RemoteViews> continuation) {
        AppWidgetComposerKt$compose$1 appWidgetComposerKt$compose$1;
        Object coroutine_suspended;
        LayoutConfiguration layoutConfiguration;
        int appWidgetId;
        Bundle bundle2;
        Object obj2;
        Context context2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        SizeMode sizeMode2;
        Object obj3;
        ConfigManager configManager2;
        DpSize dpSize2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final GlanceId glanceId2;
        int i;
        LayoutConfiguration layoutConfiguration2;
        final Context context3;
        Bundle bundle3;
        final Object obj4;
        final DpSize dpSize3;
        final SizeMode sizeMode3;
        LayoutConfiguration layoutConfiguration3;
        RemoteViewsRoot remoteViewsRoot;
        Context context4;
        BroadcastFrameClock broadcastFrameClock;
        AppWidgetComposerKt$compose$3 appWidgetComposerKt$compose$3;
        RemoteViews m1315translateCompositionKpG6l20;
        GlanceId glanceId3 = glanceId;
        if (continuation instanceof AppWidgetComposerKt$compose$1) {
            appWidgetComposerKt$compose$1 = (AppWidgetComposerKt$compose$1) continuation;
            int i2 = appWidgetComposerKt$compose$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appWidgetComposerKt$compose$1.label = i2 - Integer.MIN_VALUE;
                Object obj5 = appWidgetComposerKt$compose$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                layoutConfiguration = appWidgetComposerKt$compose$1.label;
                int i3 = 1;
                Function0 function0 = null;
                boolean z = false;
                if (layoutConfiguration != 0) {
                    ResultKt.throwOnFailure(obj5);
                    Intrinsics.checkNotNull(glanceId3, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetId");
                    appWidgetId = ((AppWidgetId) glanceId3).getAppWidgetId();
                    LayoutConfiguration.Companion companion = LayoutConfiguration.INSTANCE;
                    appWidgetComposerKt$compose$1.L$0 = context;
                    appWidgetComposerKt$compose$1.L$1 = glanceId3;
                    appWidgetComposerKt$compose$1.L$2 = sizeMode;
                    appWidgetComposerKt$compose$1.L$3 = dpSize;
                    bundle2 = bundle;
                    appWidgetComposerKt$compose$1.L$4 = bundle2;
                    obj2 = obj;
                    appWidgetComposerKt$compose$1.L$5 = obj2;
                    appWidgetComposerKt$compose$1.L$6 = configManager;
                    appWidgetComposerKt$compose$1.L$7 = function2;
                    appWidgetComposerKt$compose$1.I$0 = appWidgetId;
                    appWidgetComposerKt$compose$1.label = 1;
                    Object load$glance_appwidget_release = companion.load$glance_appwidget_release(context, appWidgetId, appWidgetComposerKt$compose$1);
                    if (load$glance_appwidget_release != coroutine_suspended) {
                        context2 = context;
                        function22 = function2;
                        sizeMode2 = sizeMode;
                        obj3 = load$glance_appwidget_release;
                        configManager2 = configManager;
                        dpSize2 = dpSize;
                    }
                }
                if (layoutConfiguration == 1) {
                    int i4 = appWidgetComposerKt$compose$1.I$0;
                    Function2<? super Composer, ? super Integer, Unit> function24 = (Function2) appWidgetComposerKt$compose$1.L$7;
                    configManager2 = (ConfigManager) appWidgetComposerKt$compose$1.L$6;
                    Object obj6 = appWidgetComposerKt$compose$1.L$5;
                    Bundle bundle4 = (Bundle) appWidgetComposerKt$compose$1.L$4;
                    dpSize2 = (DpSize) appWidgetComposerKt$compose$1.L$3;
                    sizeMode2 = (SizeMode) appWidgetComposerKt$compose$1.L$2;
                    GlanceId glanceId4 = (GlanceId) appWidgetComposerKt$compose$1.L$1;
                    context2 = (Context) appWidgetComposerKt$compose$1.L$0;
                    ResultKt.throwOnFailure(obj5);
                    appWidgetId = i4;
                    function22 = function24;
                    glanceId3 = glanceId4;
                    obj3 = obj5;
                    obj2 = obj6;
                    bundle2 = bundle4;
                } else {
                    if (layoutConfiguration != 2) {
                        if (layoutConfiguration != 3) {
                            if (layoutConfiguration == 4) {
                                RemoteViews remoteViews = (RemoteViews) appWidgetComposerKt$compose$1.L$0;
                                ResultKt.throwOnFailure(obj5);
                                return remoteViews;
                            }
                            if (layoutConfiguration != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) appWidgetComposerKt$compose$1.L$0;
                            ResultKt.throwOnFailure(obj5);
                            throw th;
                        }
                        i = appWidgetComposerKt$compose$1.I$0;
                        remoteViewsRoot = (RemoteViewsRoot) appWidgetComposerKt$compose$1.L$2;
                        LayoutConfiguration layoutConfiguration4 = (LayoutConfiguration) appWidgetComposerKt$compose$1.L$1;
                        context4 = (Context) appWidgetComposerKt$compose$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        layoutConfiguration = layoutConfiguration4;
                        int i5 = i;
                        Context context5 = context4;
                        NormalizeCompositionTreeKt.normalizeCompositionTree(remoteViewsRoot);
                        LayoutConfiguration layoutConfiguration5 = layoutConfiguration;
                        m1315translateCompositionKpG6l20 = RemoteViewsTranslatorKt.m1315translateCompositionKpG6l20(context5, i5, remoteViewsRoot, layoutConfiguration5, layoutConfiguration.addLayout(remoteViewsRoot), DpSize.INSTANCE.m1128getUnspecifiedMYxV2XQ(), (r17 & 64) != 0 ? null : null);
                        appWidgetComposerKt$compose$1.L$0 = m1315translateCompositionKpG6l20;
                        appWidgetComposerKt$compose$1.L$1 = null;
                        appWidgetComposerKt$compose$1.L$2 = null;
                        appWidgetComposerKt$compose$1.label = 4;
                        return layoutConfiguration.save(appWidgetComposerKt$compose$1) != coroutine_suspended ? coroutine_suspended : m1315translateCompositionKpG6l20;
                    }
                    i = appWidgetComposerKt$compose$1.I$0;
                    LayoutConfiguration layoutConfiguration6 = (LayoutConfiguration) appWidgetComposerKt$compose$1.L$6;
                    Function2<? super Composer, ? super Integer, Unit> function25 = (Function2) appWidgetComposerKt$compose$1.L$5;
                    bundle3 = (Bundle) appWidgetComposerKt$compose$1.L$4;
                    DpSize dpSize4 = (DpSize) appWidgetComposerKt$compose$1.L$3;
                    SizeMode sizeMode4 = (SizeMode) appWidgetComposerKt$compose$1.L$2;
                    GlanceId glanceId5 = (GlanceId) appWidgetComposerKt$compose$1.L$1;
                    Context context6 = (Context) appWidgetComposerKt$compose$1.L$0;
                    ResultKt.throwOnFailure(obj5);
                    obj4 = obj5;
                    function23 = function25;
                    dpSize3 = dpSize4;
                    sizeMode3 = sizeMode4;
                    glanceId2 = glanceId5;
                    context3 = context6;
                    layoutConfiguration3 = layoutConfiguration6;
                    AppWidgetManager appWidgetManager = AppWidgetUtilsKt.getAppWidgetManager(context3);
                    if (bundle3 == null && (bundle3 = appWidgetManager.getAppWidgetOptions(i)) == null) {
                        bundle3 = new Bundle();
                    }
                    final Bundle bundle5 = bundle3;
                    final long appWidgetMinSize = AppWidgetUtilsKt.appWidgetMinSize(context3.getResources().getDisplayMetrics(), appWidgetManager, i);
                    remoteViewsRoot = new RemoteViewsRoot(50);
                    Applier applier = new Applier(remoteViewsRoot);
                    Recomposer recomposer = new Recomposer(appWidgetComposerKt$compose$1.get$context());
                    context4 = context3;
                    CompositionKt.Composition(applier, recomposer).setContent(ComposableLambdaKt.composableLambdaInstance(-707200029, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.AppWidgetComposerKt$compose$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.glance.GlanceComposable")
                        @Composable
                        public final void invoke(Composer composer, int i6) {
                            if ((i6 & 11) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-707200029, i6, -1, "androidx.glance.appwidget.compose.<anonymous> (AppWidgetComposer.kt:73)");
                            }
                            ProvidedValue[] providedValueArr = {androidx.glance.CompositionLocalsKt.getLocalContext().provides(context3), androidx.glance.CompositionLocalsKt.getLocalGlanceId().provides(glanceId2), CompositionLocalsKt.getLocalAppWidgetOptions().provides(bundle5), androidx.glance.CompositionLocalsKt.getLocalState().provides(obj4)};
                            final SizeMode sizeMode5 = sizeMode3;
                            final DpSize dpSize5 = dpSize3;
                            final long j = appWidgetMinSize;
                            final Function2<Composer, Integer, Unit> function26 = function23;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, 2053701795, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.AppWidgetComposerKt$compose$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.glance.GlanceComposable")
                                @Composable
                                public final void invoke(Composer composer2, int i7) {
                                    if ((i7 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2053701795, i7, -1, "androidx.glance.appwidget.compose.<anonymous>.<anonymous> (AppWidgetComposer.kt:79)");
                                    }
                                    SizeMode sizeMode6 = SizeMode.this;
                                    DpSize dpSize6 = dpSize5;
                                    SizeBoxKt.m1317ForEachSizeeVKgIn8(sizeMode6, dpSize6 != null ? dpSize6.getPackedValue() : j, function26, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                    broadcastFrameClock = new BroadcastFrameClock(function0, i3, z ? 1 : 0);
                    appWidgetComposerKt$compose$3 = new AppWidgetComposerKt$compose$3(recomposer, null);
                    appWidgetComposerKt$compose$1.L$0 = context4;
                    appWidgetComposerKt$compose$1.L$1 = layoutConfiguration3;
                    appWidgetComposerKt$compose$1.L$2 = remoteViewsRoot;
                    appWidgetComposerKt$compose$1.L$3 = null;
                    appWidgetComposerKt$compose$1.L$4 = null;
                    appWidgetComposerKt$compose$1.L$5 = null;
                    appWidgetComposerKt$compose$1.L$6 = null;
                    appWidgetComposerKt$compose$1.L$7 = null;
                    appWidgetComposerKt$compose$1.I$0 = i;
                    appWidgetComposerKt$compose$1.label = 3;
                    layoutConfiguration = layoutConfiguration3;
                    if (C1082i.f(appWidgetComposerKt$compose$3, broadcastFrameClock, appWidgetComposerKt$compose$1) == coroutine_suspended) {
                    }
                    int i52 = i;
                    Context context52 = context4;
                    NormalizeCompositionTreeKt.normalizeCompositionTree(remoteViewsRoot);
                    LayoutConfiguration layoutConfiguration52 = layoutConfiguration;
                    m1315translateCompositionKpG6l20 = RemoteViewsTranslatorKt.m1315translateCompositionKpG6l20(context52, i52, remoteViewsRoot, layoutConfiguration52, layoutConfiguration.addLayout(remoteViewsRoot), DpSize.INSTANCE.m1128getUnspecifiedMYxV2XQ(), (r17 & 64) != 0 ? null : null);
                    appWidgetComposerKt$compose$1.L$0 = m1315translateCompositionKpG6l20;
                    appWidgetComposerKt$compose$1.L$1 = null;
                    appWidgetComposerKt$compose$1.L$2 = null;
                    appWidgetComposerKt$compose$1.label = 4;
                    if (layoutConfiguration.save(appWidgetComposerKt$compose$1) != coroutine_suspended) {
                    }
                }
                LayoutConfiguration layoutConfiguration7 = (LayoutConfiguration) obj3;
                if (obj2 != null) {
                    PreferencesGlanceStateDefinition preferencesGlanceStateDefinition = PreferencesGlanceStateDefinition.INSTANCE;
                    String createUniqueRemoteUiName = AppWidgetUtilsKt.createUniqueRemoteUiName(appWidgetId);
                    appWidgetComposerKt$compose$1.L$0 = context2;
                    appWidgetComposerKt$compose$1.L$1 = glanceId3;
                    appWidgetComposerKt$compose$1.L$2 = sizeMode2;
                    appWidgetComposerKt$compose$1.L$3 = dpSize2;
                    appWidgetComposerKt$compose$1.L$4 = bundle2;
                    appWidgetComposerKt$compose$1.L$5 = function22;
                    appWidgetComposerKt$compose$1.L$6 = layoutConfiguration7;
                    appWidgetComposerKt$compose$1.L$7 = null;
                    appWidgetComposerKt$compose$1.I$0 = appWidgetId;
                    appWidgetComposerKt$compose$1.label = 2;
                    Object value = configManager2.getValue(context2, preferencesGlanceStateDefinition, createUniqueRemoteUiName, appWidgetComposerKt$compose$1);
                    if (value != coroutine_suspended) {
                        function23 = function22;
                        glanceId2 = glanceId3;
                        i = appWidgetId;
                        obj4 = value;
                        layoutConfiguration2 = layoutConfiguration7;
                        context3 = context2;
                        bundle3 = bundle2;
                    }
                }
                function23 = function22;
                glanceId2 = glanceId3;
                i = appWidgetId;
                layoutConfiguration2 = layoutConfiguration7;
                context3 = context2;
                bundle3 = bundle2;
                obj4 = obj2;
                dpSize3 = dpSize2;
                sizeMode3 = sizeMode2;
                layoutConfiguration3 = layoutConfiguration2;
                AppWidgetManager appWidgetManager2 = AppWidgetUtilsKt.getAppWidgetManager(context3);
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                final Bundle bundle52 = bundle3;
                final long appWidgetMinSize2 = AppWidgetUtilsKt.appWidgetMinSize(context3.getResources().getDisplayMetrics(), appWidgetManager2, i);
                remoteViewsRoot = new RemoteViewsRoot(50);
                Applier applier2 = new Applier(remoteViewsRoot);
                Recomposer recomposer2 = new Recomposer(appWidgetComposerKt$compose$1.get$context());
                context4 = context3;
                CompositionKt.Composition(applier2, recomposer2).setContent(ComposableLambdaKt.composableLambdaInstance(-707200029, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.AppWidgetComposerKt$compose$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
                    @Composable
                    public final void invoke(Composer composer, int i6) {
                        if ((i6 & 11) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-707200029, i6, -1, "androidx.glance.appwidget.compose.<anonymous> (AppWidgetComposer.kt:73)");
                        }
                        ProvidedValue[] providedValueArr = {androidx.glance.CompositionLocalsKt.getLocalContext().provides(context3), androidx.glance.CompositionLocalsKt.getLocalGlanceId().provides(glanceId2), CompositionLocalsKt.getLocalAppWidgetOptions().provides(bundle52), androidx.glance.CompositionLocalsKt.getLocalState().provides(obj4)};
                        final SizeMode sizeMode5 = sizeMode3;
                        final DpSize dpSize5 = dpSize3;
                        final long j = appWidgetMinSize2;
                        final Function2<? super Composer, ? super Integer, Unit> function26 = function23;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, 2053701795, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.AppWidgetComposerKt$compose$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.glance.GlanceComposable")
                            @Composable
                            public final void invoke(Composer composer2, int i7) {
                                if ((i7 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2053701795, i7, -1, "androidx.glance.appwidget.compose.<anonymous>.<anonymous> (AppWidgetComposer.kt:79)");
                                }
                                SizeMode sizeMode6 = SizeMode.this;
                                DpSize dpSize6 = dpSize5;
                                SizeBoxKt.m1317ForEachSizeeVKgIn8(sizeMode6, dpSize6 != null ? dpSize6.getPackedValue() : j, function26, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                broadcastFrameClock = new BroadcastFrameClock(function0, i3, z ? 1 : 0);
                appWidgetComposerKt$compose$3 = new AppWidgetComposerKt$compose$3(recomposer2, null);
                appWidgetComposerKt$compose$1.L$0 = context4;
                appWidgetComposerKt$compose$1.L$1 = layoutConfiguration3;
                appWidgetComposerKt$compose$1.L$2 = remoteViewsRoot;
                appWidgetComposerKt$compose$1.L$3 = null;
                appWidgetComposerKt$compose$1.L$4 = null;
                appWidgetComposerKt$compose$1.L$5 = null;
                appWidgetComposerKt$compose$1.L$6 = null;
                appWidgetComposerKt$compose$1.L$7 = null;
                appWidgetComposerKt$compose$1.I$0 = i;
                appWidgetComposerKt$compose$1.label = 3;
                layoutConfiguration = layoutConfiguration3;
                if (C1082i.f(appWidgetComposerKt$compose$3, broadcastFrameClock, appWidgetComposerKt$compose$1) == coroutine_suspended) {
                }
                int i522 = i;
                Context context522 = context4;
                NormalizeCompositionTreeKt.normalizeCompositionTree(remoteViewsRoot);
                LayoutConfiguration layoutConfiguration522 = layoutConfiguration;
                m1315translateCompositionKpG6l20 = RemoteViewsTranslatorKt.m1315translateCompositionKpG6l20(context522, i522, remoteViewsRoot, layoutConfiguration522, layoutConfiguration.addLayout(remoteViewsRoot), DpSize.INSTANCE.m1128getUnspecifiedMYxV2XQ(), (r17 & 64) != 0 ? null : null);
                appWidgetComposerKt$compose$1.L$0 = m1315translateCompositionKpG6l20;
                appWidgetComposerKt$compose$1.L$1 = null;
                appWidgetComposerKt$compose$1.L$2 = null;
                appWidgetComposerKt$compose$1.label = 4;
                if (layoutConfiguration.save(appWidgetComposerKt$compose$1) != coroutine_suspended) {
                }
            }
        }
        appWidgetComposerKt$compose$1 = new AppWidgetComposerKt$compose$1(continuation);
        Object obj52 = appWidgetComposerKt$compose$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        layoutConfiguration = appWidgetComposerKt$compose$1.label;
        int i32 = 1;
        Function0 function02 = null;
        boolean z2 = false;
        if (layoutConfiguration != 0) {
        }
        LayoutConfiguration layoutConfiguration72 = (LayoutConfiguration) obj3;
        if (obj2 != null) {
        }
        dpSize3 = dpSize2;
        sizeMode3 = sizeMode2;
        layoutConfiguration3 = layoutConfiguration2;
        AppWidgetManager appWidgetManager22 = AppWidgetUtilsKt.getAppWidgetManager(context3);
        if (bundle3 == null) {
        }
        final Bundle bundle522 = bundle3;
        final long appWidgetMinSize22 = AppWidgetUtilsKt.appWidgetMinSize(context3.getResources().getDisplayMetrics(), appWidgetManager22, i);
        remoteViewsRoot = new RemoteViewsRoot(50);
        Applier applier22 = new Applier(remoteViewsRoot);
        Recomposer recomposer22 = new Recomposer(appWidgetComposerKt$compose$1.get$context());
        context4 = context3;
        CompositionKt.Composition(applier22, recomposer22).setContent(ComposableLambdaKt.composableLambdaInstance(-707200029, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.AppWidgetComposerKt$compose$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.glance.GlanceComposable")
            @Composable
            public final void invoke(Composer composer, int i6) {
                if ((i6 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-707200029, i6, -1, "androidx.glance.appwidget.compose.<anonymous> (AppWidgetComposer.kt:73)");
                }
                ProvidedValue[] providedValueArr = {androidx.glance.CompositionLocalsKt.getLocalContext().provides(context3), androidx.glance.CompositionLocalsKt.getLocalGlanceId().provides(glanceId2), CompositionLocalsKt.getLocalAppWidgetOptions().provides(bundle522), androidx.glance.CompositionLocalsKt.getLocalState().provides(obj4)};
                final SizeMode sizeMode5 = sizeMode3;
                final DpSize dpSize5 = dpSize3;
                final long j = appWidgetMinSize22;
                final Function2<? super Composer, ? super Integer, Unit> function26 = function23;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, 2053701795, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.AppWidgetComposerKt$compose$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
                    @Composable
                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2053701795, i7, -1, "androidx.glance.appwidget.compose.<anonymous>.<anonymous> (AppWidgetComposer.kt:79)");
                        }
                        SizeMode sizeMode6 = SizeMode.this;
                        DpSize dpSize6 = dpSize5;
                        SizeBoxKt.m1317ForEachSizeeVKgIn8(sizeMode6, dpSize6 != null ? dpSize6.getPackedValue() : j, function26, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        broadcastFrameClock = new BroadcastFrameClock(function02, i32, z2 ? 1 : 0);
        appWidgetComposerKt$compose$3 = new AppWidgetComposerKt$compose$3(recomposer22, null);
        appWidgetComposerKt$compose$1.L$0 = context4;
        appWidgetComposerKt$compose$1.L$1 = layoutConfiguration3;
        appWidgetComposerKt$compose$1.L$2 = remoteViewsRoot;
        appWidgetComposerKt$compose$1.L$3 = null;
        appWidgetComposerKt$compose$1.L$4 = null;
        appWidgetComposerKt$compose$1.L$5 = null;
        appWidgetComposerKt$compose$1.L$6 = null;
        appWidgetComposerKt$compose$1.L$7 = null;
        appWidgetComposerKt$compose$1.I$0 = i;
        appWidgetComposerKt$compose$1.label = 3;
        layoutConfiguration = layoutConfiguration3;
        if (C1082i.f(appWidgetComposerKt$compose$3, broadcastFrameClock, appWidgetComposerKt$compose$1) == coroutine_suspended) {
        }
        int i5222 = i;
        Context context5222 = context4;
        NormalizeCompositionTreeKt.normalizeCompositionTree(remoteViewsRoot);
        LayoutConfiguration layoutConfiguration5222 = layoutConfiguration;
        m1315translateCompositionKpG6l20 = RemoteViewsTranslatorKt.m1315translateCompositionKpG6l20(context5222, i5222, remoteViewsRoot, layoutConfiguration5222, layoutConfiguration.addLayout(remoteViewsRoot), DpSize.INSTANCE.m1128getUnspecifiedMYxV2XQ(), (r17 & 64) != 0 ? null : null);
        appWidgetComposerKt$compose$1.L$0 = m1315translateCompositionKpG6l20;
        appWidgetComposerKt$compose$1.L$1 = null;
        appWidgetComposerKt$compose$1.L$2 = null;
        appWidgetComposerKt$compose$1.label = 4;
        if (layoutConfiguration.save(appWidgetComposerKt$compose$1) != coroutine_suspended) {
        }
    }

    /* renamed from: compose-1pU2XAk$default, reason: not valid java name */
    public static /* synthetic */ Object m1279compose1pU2XAk$default(Context context, GlanceId glanceId, SizeMode sizeMode, DpSize dpSize, Bundle bundle, Object obj, ConfigManager configManager, Function2 function2, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            glanceId = new AppWidgetId(-1);
        }
        GlanceId glanceId2 = glanceId;
        if ((i & 4) != 0) {
            sizeMode = SizeMode.Single.INSTANCE;
        }
        return m1278compose1pU2XAk(context, glanceId2, sizeMode, (i & 8) != 0 ? null : dpSize, (i & 16) != 0 ? null : bundle, (i & 32) != 0 ? null : obj, (i & 64) != 0 ? GlanceState.INSTANCE : configManager, function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* renamed from: compose-DR8WL-M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1280composeDR8WLM(GlanceAppWidget glanceAppWidget, Context context, GlanceId glanceId, Bundle bundle, DpSize dpSize, Object obj, Continuation<? super RemoteViews> continuation) {
        AppWidgetComposerKt$compose$4 appWidgetComposerKt$compose$4;
        int i;
        Bundle bundle2;
        Context context2;
        SizeMode sizeMode;
        GlanceId glanceId2;
        Object obj2;
        DpSize dpSize2 = dpSize;
        if (continuation instanceof AppWidgetComposerKt$compose$4) {
            appWidgetComposerKt$compose$4 = (AppWidgetComposerKt$compose$4) continuation;
            int i2 = appWidgetComposerKt$compose$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appWidgetComposerKt$compose$4.label = i2 - Integer.MIN_VALUE;
                AppWidgetComposerKt$compose$4 appWidgetComposerKt$compose$42 = appWidgetComposerKt$compose$4;
                Object obj3 = appWidgetComposerKt$compose$42.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appWidgetComposerKt$compose$42.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    SizeMode sizeMode2 = dpSize2 != null ? SizeMode.Single.INSTANCE : glanceAppWidget.getSizeMode();
                    InterfaceC1060e<Function2<Composer, Integer, Unit>> runGlance = AppWidgetUtilsKt.runGlance(glanceAppWidget, context, glanceId);
                    AppWidgetComposerKt$compose$5 appWidgetComposerKt$compose$5 = new AppWidgetComposerKt$compose$5(null);
                    appWidgetComposerKt$compose$42.L$0 = context;
                    appWidgetComposerKt$compose$42.L$1 = glanceId;
                    bundle2 = bundle;
                    appWidgetComposerKt$compose$42.L$2 = bundle2;
                    appWidgetComposerKt$compose$42.L$3 = dpSize2;
                    appWidgetComposerKt$compose$42.L$4 = obj;
                    appWidgetComposerKt$compose$42.L$5 = sizeMode2;
                    appWidgetComposerKt$compose$42.label = 1;
                    Object f = C1062g.f(runGlance, appWidgetComposerKt$compose$5, appWidgetComposerKt$compose$42);
                    if (f != coroutine_suspended) {
                        context2 = context;
                        sizeMode = sizeMode2;
                        glanceId2 = glanceId;
                        obj2 = obj;
                        obj3 = f;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj3);
                    return obj3;
                }
                SizeMode sizeMode3 = (SizeMode) appWidgetComposerKt$compose$42.L$5;
                Object obj4 = appWidgetComposerKt$compose$42.L$4;
                DpSize dpSize3 = (DpSize) appWidgetComposerKt$compose$42.L$3;
                Bundle bundle3 = (Bundle) appWidgetComposerKt$compose$42.L$2;
                glanceId2 = (GlanceId) appWidgetComposerKt$compose$42.L$1;
                Context context3 = (Context) appWidgetComposerKt$compose$42.L$0;
                ResultKt.throwOnFailure(obj3);
                obj2 = obj4;
                dpSize2 = dpSize3;
                context2 = context3;
                bundle2 = bundle3;
                sizeMode = sizeMode3;
                Intrinsics.checkNotNull(obj3);
                appWidgetComposerKt$compose$42.L$0 = null;
                appWidgetComposerKt$compose$42.L$1 = null;
                appWidgetComposerKt$compose$42.L$2 = null;
                appWidgetComposerKt$compose$42.L$3 = null;
                appWidgetComposerKt$compose$42.L$4 = null;
                appWidgetComposerKt$compose$42.L$5 = null;
                appWidgetComposerKt$compose$42.label = 2;
                Object m1279compose1pU2XAk$default = m1279compose1pU2XAk$default(context2, glanceId2, sizeMode, dpSize2, bundle2, obj2, null, (Function2) obj3, appWidgetComposerKt$compose$42, 64, null);
                return m1279compose1pU2XAk$default != coroutine_suspended ? coroutine_suspended : m1279compose1pU2XAk$default;
            }
        }
        appWidgetComposerKt$compose$4 = new AppWidgetComposerKt$compose$4(continuation);
        AppWidgetComposerKt$compose$4 appWidgetComposerKt$compose$422 = appWidgetComposerKt$compose$4;
        Object obj32 = appWidgetComposerKt$compose$422.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appWidgetComposerKt$compose$422.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNull(obj32);
        appWidgetComposerKt$compose$422.L$0 = null;
        appWidgetComposerKt$compose$422.L$1 = null;
        appWidgetComposerKt$compose$422.L$2 = null;
        appWidgetComposerKt$compose$422.L$3 = null;
        appWidgetComposerKt$compose$422.L$4 = null;
        appWidgetComposerKt$compose$422.L$5 = null;
        appWidgetComposerKt$compose$422.label = 2;
        Object m1279compose1pU2XAk$default2 = m1279compose1pU2XAk$default(context2, glanceId2, sizeMode, dpSize2, bundle2, obj2, null, (Function2) obj32, appWidgetComposerKt$compose$422, 64, null);
        if (m1279compose1pU2XAk$default2 != coroutine_suspended2) {
        }
    }

    /* renamed from: compose-DR8WL-M$default, reason: not valid java name */
    public static /* synthetic */ Object m1281composeDR8WLM$default(GlanceAppWidget glanceAppWidget, Context context, GlanceId glanceId, Bundle bundle, DpSize dpSize, Object obj, Continuation continuation, int i, Object obj2) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        if ((i & 8) != 0) {
            dpSize = null;
        }
        if ((i & 16) != 0) {
            obj = null;
        }
        return m1280composeDR8WLM(glanceAppWidget, context, glanceId, bundle, dpSize, obj, continuation);
    }
}
