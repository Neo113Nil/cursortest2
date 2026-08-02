package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.ExperimentalGlanceApi;
import androidx.glance.appwidget.action.LambdaActionBroadcasts;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u00020\u001c8WX\u0097\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidgetReceiver;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "Lkotlinx/coroutines/K;", "Landroid/content/Context;", "context", "", "updateManager", "(Lkotlinx/coroutines/K;Landroid/content/Context;)V", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetIds", "onUpdate", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V", "", "appWidgetId", "Landroid/os/Bundle;", "newOptions", "onAppWidgetOptionsChanged", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V", "onDeleted", "(Landroid/content/Context;[I)V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "Landroidx/glance/appwidget/GlanceAppWidget;", "getGlanceAppWidget", "()Landroidx/glance/appwidget/GlanceAppWidget;", "glanceAppWidget", "Companion", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGlanceAppWidgetReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceAppWidgetReceiver.kt\nandroidx/glance/appwidget/GlanceAppWidgetReceiver\n+ 2 GlanceAppWidgetReceiver.kt\nandroidx/glance/appwidget/GlanceAppWidgetReceiverKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n179#2,2:188\n181#2,6:191\n1#3:190\n*S KotlinDebug\n*F\n+ 1 GlanceAppWidgetReceiver.kt\nandroidx/glance/appwidget/GlanceAppWidgetReceiver\n*L\n143#1:188,2\n143#1:191,6\n*E\n"})
/* loaded from: classes.dex */
public abstract class GlanceAppWidgetReceiver extends AppWidgetProvider {
    public static final String ACTION_DEBUG_UPDATE = "androidx.glance.appwidget.action.DEBUG_UPDATE";
    private static final String TAG = "GlanceAppWidgetReceiver";
    private final CoroutineContext coroutineContext = C1049c0.a;
    public static final int $stable = 8;

    @ExperimentalGlanceApi
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateManager(K k, Context context) {
        C1082i.c(k, null, null, new GlanceAppWidgetReceiver$updateManager$1(context, this, null), 3);
    }

    @ExperimentalGlanceApi
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public abstract GlanceAppWidget getGlanceAppWidget();

    @Override // android.appwidget.AppWidgetProvider
    @CallSuper
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int appWidgetId, Bundle newOptions) {
        CoroutineBroadcastReceiverKt.goAsync(this, getCoroutineContext(), new GlanceAppWidgetReceiver$onAppWidgetOptionsChanged$1(this, context, appWidgetId, newOptions, null));
    }

    @Override // android.appwidget.AppWidgetProvider
    @CallSuper
    public void onDeleted(Context context, int[] appWidgetIds) {
        CoroutineBroadcastReceiverKt.goAsync(this, getCoroutineContext(), new GlanceAppWidgetReceiver$onDeleted$1(this, context, appWidgetIds, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[Catch: all -> 0x0049, CancellationException -> 0x00b6, TryCatch #3 {CancellationException -> 0x00b6, all -> 0x0049, blocks: (B:21:0x0042, B:25:0x0052, B:26:0x005a, B:27:0x005b, B:28:0x0063, B:29:0x0064, B:32:0x00af, B:34:0x007a, B:36:0x008c, B:38:0x0097, B:39:0x00a3, B:41:0x009f, B:42:0x00a7, B:43:0x00ae, B:44:0x006f), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[Catch: all -> 0x0049, CancellationException -> 0x00b6, TryCatch #3 {CancellationException -> 0x00b6, all -> 0x0049, blocks: (B:21:0x0042, B:25:0x0052, B:26:0x005a, B:27:0x005b, B:28:0x0063, B:29:0x0064, B:32:0x00af, B:34:0x007a, B:36:0x008c, B:38:0x0097, B:39:0x00a3, B:41:0x009f, B:42:0x00a7, B:43:0x00ae, B:44:0x006f), top: B:4:0x0006 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        String action;
        Context context2;
        String canonicalName;
        int[] appWidgetIds;
        try {
            action = intent.getAction();
        } catch (CancellationException unused) {
            return;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode == -19011148) {
                    context2 = context;
                    if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                        super.onReceive(context2, intent);
                    }
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context2);
                    String packageName = context2.getPackageName();
                    canonicalName = getClass().getCanonicalName();
                    if (canonicalName != null) {
                    }
                } else {
                    if (hashCode == 649033583) {
                        context2 = context;
                        if (!action.equals(ACTION_DEBUG_UPDATE)) {
                            super.onReceive(context2, intent);
                        }
                        AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context2);
                        String packageName2 = context2.getPackageName();
                        canonicalName = getClass().getCanonicalName();
                        if (canonicalName != null) {
                            throw new IllegalStateException("no canonical name");
                        }
                        ComponentName componentName = new ComponentName(packageName2, canonicalName);
                        if (intent.hasExtra("appWidgetIds")) {
                            appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                            Intrinsics.checkNotNull(appWidgetIds);
                        } else {
                            appWidgetIds = appWidgetManager2.getAppWidgetIds(componentName);
                        }
                        onUpdate(context2, appWidgetManager2, appWidgetIds);
                        return;
                    }
                    if (hashCode == 1989767543 && action.equals(LambdaActionBroadcasts.ActionTriggerLambda)) {
                        String stringExtra = intent.getStringExtra(LambdaActionBroadcasts.ExtraActionKey);
                        if (stringExtra == null) {
                            throw new IllegalStateException("Intent is missing ActionKey extra");
                        }
                        int intExtra = intent.getIntExtra(LambdaActionBroadcasts.ExtraAppWidgetId, -1);
                        if (intExtra == -1) {
                            throw new IllegalStateException("Intent is missing AppWidgetId extra");
                        }
                        CoroutineBroadcastReceiverKt.goAsync(this, getCoroutineContext(), new GlanceAppWidgetReceiver$onReceive$1$1(this, context, intExtra, stringExtra, null));
                        return;
                    }
                }
            }
            context2 = context;
            super.onReceive(context2, intent);
        } catch (CancellationException unused2) {
        } catch (Throwable th2) {
            th = th2;
            AppWidgetUtilsKt.logException(th);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    @CallSuper
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        CoroutineBroadcastReceiverKt.goAsync(this, getCoroutineContext(), new GlanceAppWidgetReceiver$onUpdate$1(this, context, appWidgetIds, null));
    }
}
