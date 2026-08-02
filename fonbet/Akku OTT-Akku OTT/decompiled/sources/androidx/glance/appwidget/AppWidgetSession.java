package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.DpSize;
import androidx.core.app.NotificationCompat;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceId;
import androidx.glance.action.LambdaAction;
import androidx.glance.appwidget.LayoutConfiguration;
import androidx.glance.session.Session;
import androidx.glance.state.ConfigManager;
import androidx.glance.state.GlanceState;
import androidx.glance.state.GlanceStateDefinition;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.g;
import kotlinx.coroutines.channels.j;
import kotlinx.coroutines.flow.InterfaceC1060e;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 62\u00020\u0001:\u00056789:B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J!\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010&\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'J%\u0010(\u001a\u0012\u0012\u0004\u0012\u00020%0)¢\u0006\u0002\b*¢\u0006\u0002\b+2\u0006\u0010\u001f\u001a\u00020 H\u0016¢\u0006\u0002\u0010,J\u0019\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010/J\u0019\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u00102J\u0011\u00103\u001a\u00020%H\u0086@ø\u0001\u0000¢\u0006\u0002\u00104J\u0011\u00105\u001a\u00020%H\u0086@ø\u0001\u0000¢\u0006\u0002\u00104R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0000@BX\u0081\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;²\u0006\n\u0010<\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession;", "Landroidx/glance/session/Session;", "widget", "Landroidx/glance/appwidget/GlanceAppWidget;", "id", "Landroidx/glance/appwidget/AppWidgetId;", "initialOptions", "Landroid/os/Bundle;", "configManager", "Landroidx/glance/state/ConfigManager;", "(Landroidx/glance/appwidget/GlanceAppWidget;Landroidx/glance/appwidget/AppWidgetId;Landroid/os/Bundle;Landroidx/glance/state/ConfigManager;)V", "glanceState", "Landroidx/compose/runtime/MutableState;", "", "lambdas", "", "", "", "Landroidx/glance/action/LambdaAction;", "<set-?>", "Landroid/widget/RemoteViews;", "lastRemoteViews", "getLastRemoteViews$glance_appwidget_release$annotations", "()V", "getLastRemoteViews$glance_appwidget_release", "()Landroid/widget/RemoteViews;", "options", "createRootEmittable", "Landroidx/glance/appwidget/RemoteViewsRoot;", "processEmittableTree", "", "context", "Landroid/content/Context;", "root", "Landroidx/glance/EmittableWithChildren;", "(Landroid/content/Context;Landroidx/glance/EmittableWithChildren;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processEvent", "", NotificationCompat.CATEGORY_EVENT, "(Landroid/content/Context;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "provideGlance", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/glance/GlanceComposable;", "(Landroid/content/Context;)Lkotlin/jvm/functions/Function2;", "runLambda", Constants.KEY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAppWidgetOptions", "newOptions", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateGlance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForReady", "Companion", "RunLambda", "UpdateAppWidgetOptions", "UpdateGlanceState", "WaitForReady", "glance-appwidget_release", "configIsReady"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppWidgetSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppWidgetSession.kt\nandroidx/glance/appwidget/AppWidgetSession\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n422#2,3:230\n426#2,2:239\n425#2,4:241\n422#2,3:245\n426#2,2:254\n425#2,4:256\n422#2,3:260\n426#2,2:271\n425#2,4:273\n122#3,5:233\n122#3,5:248\n122#3,3:263\n126#3:268\n125#3:269\n1#4:238\n1#4:253\n1#4:270\n1855#5,2:266\n*S KotlinDebug\n*F\n+ 1 AppWidgetSession.kt\nandroidx/glance/appwidget/AppWidgetSession\n*L\n167#1:230,3\n167#1:239,2\n167#1:241,4\n179#1:245,3\n179#1:254,2\n179#1:256,4\n185#1:260,3\n185#1:271,2\n185#1:273,4\n167#1:233,5\n179#1:248,5\n185#1:263,3\n185#1:268\n185#1:269\n167#1:238\n179#1:253\n185#1:270\n186#1:266,2\n*E\n"})
/* loaded from: classes.dex */
public final class AppWidgetSession extends Session {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final boolean DEBUG = false;

    @Deprecated
    public static final String TAG = "AppWidgetSession";
    private final ConfigManager configManager;
    private final MutableState<Object> glanceState;
    private final AppWidgetId id;
    private final Bundle initialOptions;
    private Map<String, ? extends List<LambdaAction>> lambdas;
    private RemoteViews lastRemoteViews;
    private final MutableState<Bundle> options;
    private final GlanceAppWidget widget;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$Companion;", "", "()V", "DEBUG", "", "TAG", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$RunLambda;", "", Constants.KEY, "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @VisibleForTesting
    public static final class RunLambda {
        private final String key;

        public RunLambda(String str) {
            this.key = str;
        }

        public final String getKey() {
            return this.key;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$UpdateAppWidgetOptions;", "", "newOptions", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "getNewOptions", "()Landroid/os/Bundle;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @VisibleForTesting
    public static final class UpdateAppWidgetOptions {
        private final Bundle newOptions;

        public UpdateAppWidgetOptions(Bundle bundle) {
            this.newOptions = bundle;
        }

        public final Bundle getNewOptions() {
            return this.newOptions;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$UpdateGlanceState;", "", "()V", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @VisibleForTesting
    public static final class UpdateGlanceState {
        public static final UpdateGlanceState INSTANCE = new UpdateGlanceState();

        private UpdateGlanceState() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/glance/appwidget/AppWidgetSession$WaitForReady;", "", "Lkotlinx/coroutines/channels/g;", "", "resume", "<init>", "(Lkotlinx/coroutines/channels/g;)V", "Lkotlinx/coroutines/channels/g;", "getResume", "()Lkotlinx/coroutines/channels/g;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @VisibleForTesting
    public static final class WaitForReady {
        private final g<Unit> resume;

        /* JADX WARN: Multi-variable type inference failed */
        public WaitForReady() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final g<Unit> getResume() {
            return this.resume;
        }

        public WaitForReady(g<Unit> gVar) {
            this.resume = gVar;
        }

        public /* synthetic */ WaitForReady(g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? j.a(-1, null, 6) : gVar);
        }
    }

    public /* synthetic */ AppWidgetSession(GlanceAppWidget glanceAppWidget, AppWidgetId appWidgetId, Bundle bundle, ConfigManager configManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(glanceAppWidget, appWidgetId, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? GlanceState.INSTANCE : configManager);
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastRemoteViews$glance_appwidget_release$annotations() {
    }

    /* renamed from: getLastRemoteViews$glance_appwidget_release, reason: from getter */
    public final RemoteViews getLastRemoteViews() {
        return this.lastRemoteViews;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|(1:(1:(4:19|20|21|22)(1:(2:13|14)(3:16|17|18)))(1:23))(2:70|(2:72|73)(3:74|(1:76)|40))|24|25|26|27|(10:29|30|31|32|33|34|35|36|37|38)(3:62|63|64)))|77|6|(0)(0)|24|25|26|27|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
    
        if (r3.save(r5) == r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0195, code lost:
    
        if (r14.save(r5) != r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016e, code lost:
    
        if (r14.save(r5) == r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0180, code lost:
    
        if (r14.save(r5) != r6) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
    
        r14 = r3;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0110, code lost:
    
        r14 = r3;
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[Catch: all -> 0x010f, CancellationException -> 0x0116, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0116, all -> 0x010f, blocks: (B:26:0x009b, B:29:0x00a7), top: B:25:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // androidx.glance.session.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processEmittableTree(Context context, EmittableWithChildren emittableWithChildren, Continuation<? super Boolean> continuation) {
        AppWidgetSession$processEmittableTree$1 appWidgetSession$processEmittableTree$1;
        int i;
        Context context2;
        AppWidgetSession appWidgetSession;
        EmittableWithChildren emittableWithChildren2;
        AppWidgetProviderInfo appWidgetInfo;
        if (continuation instanceof AppWidgetSession$processEmittableTree$1) {
            appWidgetSession$processEmittableTree$1 = (AppWidgetSession$processEmittableTree$1) continuation;
            int i2 = appWidgetSession$processEmittableTree$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appWidgetSession$processEmittableTree$1.label = i2 - Integer.MIN_VALUE;
                Object obj = appWidgetSession$processEmittableTree$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appWidgetSession$processEmittableTree$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (IgnoreResultKt.shouldIgnoreResult(emittableWithChildren)) {
                        return Boxing.boxBoolean(false);
                    }
                    Intrinsics.checkNotNull(emittableWithChildren, "null cannot be cast to non-null type androidx.glance.appwidget.RemoteViewsRoot");
                    LayoutConfiguration.Companion companion = LayoutConfiguration.INSTANCE;
                    int appWidgetId = this.id.getAppWidgetId();
                    appWidgetSession$processEmittableTree$1.L$0 = this;
                    appWidgetSession$processEmittableTree$1.L$1 = context;
                    appWidgetSession$processEmittableTree$1.L$2 = emittableWithChildren;
                    appWidgetSession$processEmittableTree$1.label = 1;
                    obj = companion.load$glance_appwidget_release(context, appWidgetId, appWidgetSession$processEmittableTree$1);
                    if (obj != coroutine_suspended) {
                        context2 = context;
                        appWidgetSession = this;
                        emittableWithChildren2 = emittableWithChildren;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2 || i == 3 || i == 4) {
                        ResultKt.throwOnFailure(obj);
                        Tracing.INSTANCE.endGlanceAppWidgetUpdate();
                        return Boxing.boxBoolean(true);
                    }
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) appWidgetSession$processEmittableTree$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Tracing.INSTANCE.endGlanceAppWidgetUpdate();
                    throw th;
                }
                emittableWithChildren2 = (EmittableWithChildren) appWidgetSession$processEmittableTree$1.L$2;
                Context context3 = (Context) appWidgetSession$processEmittableTree$1.L$1;
                appWidgetSession = (AppWidgetSession) appWidgetSession$processEmittableTree$1.L$0;
                ResultKt.throwOnFailure(obj);
                context2 = context3;
                LayoutConfiguration layoutConfiguration = (LayoutConfiguration) obj;
                AppWidgetManager appWidgetManager = AppWidgetUtilsKt.getAppWidgetManager(context2);
                LayoutConfiguration layoutConfiguration2 = null;
                appWidgetInfo = appWidgetManager.getAppWidgetInfo(appWidgetSession.id.getAppWidgetId());
                if (appWidgetInfo != null) {
                    throw new IllegalArgumentException(("No app widget info for " + appWidgetSession.id.getAppWidgetId()).toString());
                }
                ComponentName componentName = appWidgetInfo.provider;
                NormalizeCompositionTreeKt.normalizeCompositionTree((RemoteViewsRoot) emittableWithChildren2);
                appWidgetSession.lambdas = NormalizeCompositionTreeKt.updateLambdaActionKeys(emittableWithChildren2);
                int appWidgetId2 = appWidgetSession.id.getAppWidgetId();
                try {
                    RemoteViewsRoot remoteViewsRoot = (RemoteViewsRoot) emittableWithChildren2;
                    int addLayout = layoutConfiguration.addLayout(emittableWithChildren2);
                    layoutConfiguration = null;
                    try {
                        RemoteViews m1315translateCompositionKpG6l20 = RemoteViewsTranslatorKt.m1315translateCompositionKpG6l20(context2, appWidgetId2, remoteViewsRoot, layoutConfiguration, addLayout, DpSize.INSTANCE.m1128getUnspecifiedMYxV2XQ(), componentName);
                        appWidgetManager.updateAppWidget(appWidgetSession.id.getAppWidgetId(), m1315translateCompositionKpG6l20);
                        appWidgetSession.lastRemoteViews = m1315translateCompositionKpG6l20;
                        appWidgetSession$processEmittableTree$1.L$0 = null;
                        appWidgetSession$processEmittableTree$1.L$1 = null;
                        appWidgetSession$processEmittableTree$1.L$2 = null;
                        appWidgetSession$processEmittableTree$1.label = 2;
                    } catch (CancellationException unused) {
                        layoutConfiguration2 = layoutConfiguration;
                        appWidgetSession$processEmittableTree$1.L$0 = layoutConfiguration;
                        appWidgetSession$processEmittableTree$1.L$1 = layoutConfiguration;
                        appWidgetSession$processEmittableTree$1.L$2 = layoutConfiguration;
                        appWidgetSession$processEmittableTree$1.label = 3;
                    } catch (Throwable th) {
                        th = th;
                        layoutConfiguration2 = layoutConfiguration;
                        try {
                            if (appWidgetSession.widget.getErrorUiLayout() == 0) {
                                throw th;
                            }
                            AppWidgetUtilsKt.logException(th);
                            RemoteViews remoteViews = new RemoteViews(context2.getPackageName(), appWidgetSession.widget.getErrorUiLayout());
                            appWidgetManager.updateAppWidget(appWidgetSession.id.getAppWidgetId(), remoteViews);
                            appWidgetSession.lastRemoteViews = remoteViews;
                            appWidgetSession$processEmittableTree$1.L$0 = layoutConfiguration;
                            appWidgetSession$processEmittableTree$1.L$1 = layoutConfiguration;
                            appWidgetSession$processEmittableTree$1.L$2 = layoutConfiguration;
                            appWidgetSession$processEmittableTree$1.label = 4;
                        } catch (Throwable th2) {
                            th = th2;
                            appWidgetSession$processEmittableTree$1.L$0 = th;
                            appWidgetSession$processEmittableTree$1.L$1 = layoutConfiguration;
                            appWidgetSession$processEmittableTree$1.L$2 = layoutConfiguration;
                            appWidgetSession$processEmittableTree$1.label = 5;
                        }
                    }
                } catch (CancellationException unused2) {
                    layoutConfiguration2 = layoutConfiguration;
                    layoutConfiguration = null;
                } catch (Throwable th3) {
                    th = th3;
                    layoutConfiguration2 = layoutConfiguration;
                    layoutConfiguration = null;
                }
            }
        }
        appWidgetSession$processEmittableTree$1 = new AppWidgetSession$processEmittableTree$1(this, continuation);
        Object obj2 = appWidgetSession$processEmittableTree$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appWidgetSession$processEmittableTree$1.label;
        if (i != 0) {
        }
        LayoutConfiguration layoutConfiguration3 = (LayoutConfiguration) obj2;
        AppWidgetManager appWidgetManager2 = AppWidgetUtilsKt.getAppWidgetManager(context2);
        LayoutConfiguration layoutConfiguration22 = null;
        appWidgetInfo = appWidgetManager2.getAppWidgetInfo(appWidgetSession.id.getAppWidgetId());
        if (appWidgetInfo != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x015b, code lost:
    
        if (r8.i(r9, r0) == r1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.glance.session.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processEvent(Context context, Object obj, Continuation<? super Unit> continuation) {
        AppWidgetSession$processEvent$1 appWidgetSession$processEvent$1;
        int i;
        MutableSnapshot takeMutableSnapshot$default;
        Snapshot makeCurrent;
        AppWidgetSession appWidgetSession;
        if (continuation instanceof AppWidgetSession$processEvent$1) {
            appWidgetSession$processEvent$1 = (AppWidgetSession$processEvent$1) continuation;
            int i2 = appWidgetSession$processEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appWidgetSession$processEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = appWidgetSession$processEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appWidgetSession$processEvent$1.label;
                Unit unit = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (obj instanceof UpdateGlanceState) {
                        GlanceStateDefinition<?> stateDefinition = this.widget.getStateDefinition();
                        if (stateDefinition != null) {
                            ConfigManager configManager = this.configManager;
                            String key = getKey();
                            appWidgetSession$processEvent$1.L$0 = this;
                            appWidgetSession$processEvent$1.label = 1;
                            obj2 = configManager.getValue(context, stateDefinition, key, appWidgetSession$processEvent$1);
                            if (obj2 != coroutine_suspended) {
                                appWidgetSession = this;
                            }
                        } else {
                            appWidgetSession = this;
                            obj2 = null;
                        }
                        takeMutableSnapshot$default = Snapshot.Companion.takeMutableSnapshot$default(Snapshot.INSTANCE, null, null, 3, null);
                        makeCurrent = takeMutableSnapshot$default.makeCurrent();
                        appWidgetSession.glanceState.setValue(obj2);
                        Unit unit2 = Unit.INSTANCE;
                        takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                        takeMutableSnapshot$default.apply().check();
                    } else if (obj instanceof UpdateAppWidgetOptions) {
                        takeMutableSnapshot$default = Snapshot.Companion.takeMutableSnapshot$default(Snapshot.INSTANCE, null, null, 3, null);
                        try {
                            makeCurrent = takeMutableSnapshot$default.makeCurrent();
                            try {
                                this.options.setValue(((UpdateAppWidgetOptions) obj).getNewOptions());
                                Unit unit3 = Unit.INSTANCE;
                                takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                                takeMutableSnapshot$default.apply().check();
                                takeMutableSnapshot$default.dispose();
                            } finally {
                            }
                        } finally {
                        }
                    } else if (obj instanceof RunLambda) {
                        takeMutableSnapshot$default = Snapshot.Companion.takeMutableSnapshot$default(Snapshot.INSTANCE, null, null, 3, null);
                        try {
                            makeCurrent = takeMutableSnapshot$default.makeCurrent();
                            try {
                                List<LambdaAction> list = this.lambdas.get(((RunLambda) obj).getKey());
                                if (list != null) {
                                    Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        ((LambdaAction) it.next()).getBlock().invoke();
                                    }
                                    unit = Unit.INSTANCE;
                                }
                                takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                                takeMutableSnapshot$default.apply().check();
                                takeMutableSnapshot$default.dispose();
                                if (unit == null) {
                                    Boxing.boxInt(Log.w(TAG, "Triggering Action(" + ((RunLambda) obj).getKey() + ") for session(" + getKey() + ") failed"));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } finally {
                        }
                    } else {
                        if (!(obj instanceof WaitForReady)) {
                            throw new IllegalArgumentException("Sent unrecognized event type " + obj.getClass() + " to AppWidgetSession");
                        }
                        g<Unit> resume = ((WaitForReady) obj).getResume();
                        Unit unit4 = Unit.INSTANCE;
                        appWidgetSession$processEvent$1.label = 2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                    return Unit.INSTANCE;
                }
                appWidgetSession = (AppWidgetSession) appWidgetSession$processEvent$1.L$0;
                ResultKt.throwOnFailure(obj2);
                takeMutableSnapshot$default = Snapshot.Companion.takeMutableSnapshot$default(Snapshot.INSTANCE, null, null, 3, null);
                try {
                    makeCurrent = takeMutableSnapshot$default.makeCurrent();
                    try {
                        appWidgetSession.glanceState.setValue(obj2);
                        Unit unit22 = Unit.INSTANCE;
                        takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                        takeMutableSnapshot$default.apply().check();
                    } finally {
                    }
                } finally {
                }
                return Unit.INSTANCE;
            }
        }
        appWidgetSession$processEvent$1 = new AppWidgetSession$processEvent$1(this, continuation);
        Object obj22 = appWidgetSession$processEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appWidgetSession$processEvent$1.label;
        Unit unit5 = null;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Function0 provideGlance(Context context) {
        return (Function0) mo1282provideGlance(context);
    }

    public final Object runLambda(String str, Continuation<? super Unit> continuation) {
        Object sendEvent = sendEvent(new RunLambda(str), continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    public final Object updateAppWidgetOptions(Bundle bundle, Continuation<? super Unit> continuation) {
        Object sendEvent = sendEvent(new UpdateAppWidgetOptions(bundle), continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    public final Object updateGlance(Continuation<? super Unit> continuation) {
        Object sendEvent = sendEvent(UpdateGlanceState.INSTANCE, continuation);
        return sendEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r7.d(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (sendEvent(r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForReady(Continuation<? super Unit> continuation) {
        AppWidgetSession$waitForReady$1 appWidgetSession$waitForReady$1;
        int i;
        WaitForReady waitForReady;
        if (continuation instanceof AppWidgetSession$waitForReady$1) {
            appWidgetSession$waitForReady$1 = (AppWidgetSession$waitForReady$1) continuation;
            int i2 = appWidgetSession$waitForReady$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appWidgetSession$waitForReady$1.label = i2 - Integer.MIN_VALUE;
                Object obj = appWidgetSession$waitForReady$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appWidgetSession$waitForReady$1.label;
                g gVar = null;
                Object[] objArr = 0;
                int i3 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    waitForReady = new WaitForReady(gVar, i3, objArr == true ? 1 : 0);
                    appWidgetSession$waitForReady$1.L$0 = waitForReady;
                    appWidgetSession$waitForReady$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    waitForReady = (WaitForReady) appWidgetSession$waitForReady$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                g<Unit> resume = waitForReady.getResume();
                appWidgetSession$waitForReady$1.L$0 = null;
                appWidgetSession$waitForReady$1.label = 2;
            }
        }
        appWidgetSession$waitForReady$1 = new AppWidgetSession$waitForReady$1(this, continuation);
        Object obj2 = appWidgetSession$waitForReady$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appWidgetSession$waitForReady$1.label;
        g gVar2 = null;
        Object[] objArr2 = 0;
        int i32 = 1;
        if (i != 0) {
        }
        g<Unit> resume2 = waitForReady.getResume();
        appWidgetSession$waitForReady$1.L$0 = null;
        appWidgetSession$waitForReady$1.label = 2;
    }

    @Override // androidx.glance.session.Session
    public RemoteViewsRoot createRootEmittable() {
        return new RemoteViewsRoot(50);
    }

    @Override // androidx.glance.session.Session
    /* renamed from: provideGlance, reason: collision with other method in class */
    public Function2<Composer, Integer, Unit> mo1282provideGlance(final Context context) {
        return ComposableLambdaKt.composableLambdaInstance(-1784282257, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.AppWidgetSession$provideGlance$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @ComposableTarget(applier = "androidx.glance.GlanceComposable")
            @Composable
            public final void invoke(Composer composer, int i) {
                AppWidgetId appWidgetId;
                MutableState mutableState;
                MutableState mutableState2;
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1784282257, i, -1, "androidx.glance.appwidget.AppWidgetSession.provideGlance.<anonymous> (AppWidgetSession.kt:83)");
                }
                ProvidedValue<Context> provides = androidx.glance.CompositionLocalsKt.getLocalContext().provides(context);
                ProvidableCompositionLocal<GlanceId> localGlanceId = androidx.glance.CompositionLocalsKt.getLocalGlanceId();
                appWidgetId = this.id;
                ProvidedValue<GlanceId> provides2 = localGlanceId.provides(appWidgetId);
                ProvidableCompositionLocal<Bundle> localAppWidgetOptions = CompositionLocalsKt.getLocalAppWidgetOptions();
                mutableState = this.options;
                ProvidedValue provides3 = localAppWidgetOptions.provides(mutableState.getValue());
                ProvidableCompositionLocal<Object> localState = androidx.glance.CompositionLocalsKt.getLocalState();
                mutableState2 = this.glanceState;
                ProvidedValue[] providedValueArr = {provides, provides2, provides3, localState.provides(mutableState2.getValue())};
                final Context context2 = context;
                final AppWidgetSession appWidgetSession = this;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, 1688971311, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.AppWidgetSession$provideGlance$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    private static final boolean invoke$lambda$2(State<Boolean> state) {
                        return state.getValue().booleanValue();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.glance.GlanceComposable")
                    @Composable
                    public final void invoke(Composer composer2, int i2) {
                        GlanceAppWidget glanceAppWidget;
                        GlanceAppWidget glanceAppWidget2;
                        AppWidgetId appWidgetId2;
                        AppWidgetId appWidgetId3;
                        if ((i2 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1688971311, i2, -1, "androidx.glance.appwidget.AppWidgetSession.provideGlance.<anonymous>.<anonymous> (AppWidgetSession.kt:89)");
                        }
                        Context context3 = context2;
                        composer2.startReplaceableGroup(-492369756);
                        Object rememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (rememberedValue == companion.getEmpty()) {
                            rememberedValue = AppWidgetUtilsKt.getAppWidgetManager(context3);
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        AppWidgetManager appWidgetManager = (AppWidgetManager) rememberedValue;
                        Context context4 = context2;
                        AppWidgetSession appWidgetSession2 = appWidgetSession;
                        composer2.startReplaceableGroup(-492369756);
                        Object rememberedValue2 = composer2.rememberedValue();
                        if (rememberedValue2 == companion.getEmpty()) {
                            DisplayMetrics displayMetrics = context4.getResources().getDisplayMetrics();
                            appWidgetId3 = appWidgetSession2.id;
                            rememberedValue2 = DpSize.m1107boximpl(AppWidgetUtilsKt.appWidgetMinSize(displayMetrics, appWidgetManager, appWidgetId3.getAppWidgetId()));
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        long packedValue = ((DpSize) rememberedValue2).getPackedValue();
                        Unit unit = null;
                        State produceState = SnapshotStateKt.produceState(Boolean.FALSE, new AppWidgetSession$provideGlance$1$1$configIsReady$2(appWidgetSession, appWidgetManager, context2, null), composer2, 70);
                        AppWidgetSession appWidgetSession3 = appWidgetSession;
                        Context context5 = context2;
                        composer2.startReplaceableGroup(-492369756);
                        Object rememberedValue3 = composer2.rememberedValue();
                        if (rememberedValue3 == companion.getEmpty()) {
                            glanceAppWidget2 = appWidgetSession3.widget;
                            appWidgetId2 = appWidgetSession3.id;
                            rememberedValue3 = AppWidgetUtilsKt.runGlance(glanceAppWidget2, context5, appWidgetId2);
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        State collectAsState = SnapshotStateKt.collectAsState((InterfaceC1060e) rememberedValue3, null, null, composer2, 56, 2);
                        if (!invoke$lambda$2(produceState)) {
                            collectAsState = null;
                        }
                        Function2 function2 = collectAsState != null ? (Function2) collectAsState.getValue() : null;
                        composer2.startReplaceableGroup(-1186217115);
                        if (function2 != null) {
                            glanceAppWidget = appWidgetSession.widget;
                            SizeBoxKt.m1317ForEachSizeeVKgIn8(glanceAppWidget.getSizeMode(), packedValue, function2, composer2, 48);
                            unit = Unit.INSTANCE;
                        }
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-1186217263);
                        if (unit == null) {
                            IgnoreResultKt.IgnoreResult(composer2, 0);
                        }
                        composer2.endReplaceableGroup();
                        final AppWidgetSession appWidgetSession4 = appWidgetSession;
                        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.glance.appwidget.AppWidgetSession.provideGlance.1.1.4
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                MutableState mutableState3;
                                mutableState3 = AppWidgetSession.this.glanceState;
                                mutableState3.getValue();
                            }
                        }, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public AppWidgetSession(GlanceAppWidget glanceAppWidget, AppWidgetId appWidgetId, Bundle bundle, ConfigManager configManager) {
        super(AppWidgetUtilsKt.toSessionKey(appWidgetId));
        this.widget = glanceAppWidget;
        this.id = appWidgetId;
        this.initialOptions = bundle;
        this.configManager = configManager;
        this.glanceState = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.options = SnapshotStateKt.mutableStateOf(new Bundle(), SnapshotStateKt.neverEqualPolicy());
        this.lambdas = MapsKt.emptyMap();
    }
}
