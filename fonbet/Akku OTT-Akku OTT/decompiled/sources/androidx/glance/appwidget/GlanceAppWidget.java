package androidx.glance.appwidget;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.GlanceId;
import androidx.glance.appwidget.SizeMode;
import androidx.glance.session.Session;
import androidx.glance.session.SessionManager;
import androidx.glance.session.SessionManagerKt;
import androidx.glance.state.GlanceState;
import androidx.glance.state.GlanceStateDefinition;
import androidx.glance.state.PreferencesGlanceStateDefinition;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J#\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ+\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0080@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J7\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0080@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001aH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ/\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0080@ø\u0001\u0000¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/glance/appwidget/GlanceAppWidget;", "", "errorUiLayout", "", "(I)V", "getErrorUiLayout$glance_appwidget_release", "()I", "sessionManager", "Landroidx/glance/session/SessionManager;", "sizeMode", "Landroidx/glance/appwidget/SizeMode;", "getSizeMode", "()Landroidx/glance/appwidget/SizeMode;", "stateDefinition", "Landroidx/glance/state/GlanceStateDefinition;", "getStateDefinition", "()Landroidx/glance/state/GlanceStateDefinition;", "deleted", "", "context", "Landroid/content/Context;", "appWidgetId", "deleted$glance_appwidget_release", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDelete", "glanceId", "Landroidx/glance/GlanceId;", "(Landroid/content/Context;Landroidx/glance/GlanceId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "provideGlance", "id", "resize", "options", "Landroid/os/Bundle;", "resize$glance_appwidget_release", "(Landroid/content/Context;ILandroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "triggerAction", "actionKey", "", "triggerAction$glance_appwidget_release", "(Landroid/content/Context;ILjava/lang/String;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "update$glance_appwidget_release", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGlanceAppWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceAppWidget.kt\nandroidx/glance/appwidget/GlanceAppWidget\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,237:1\n1#2:238\n*E\n"})
/* loaded from: classes.dex */
public abstract class GlanceAppWidget {
    public static final int $stable = 8;
    private final int errorUiLayout;
    private final SessionManager sessionManager;
    private final SizeMode sizeMode;
    private final GlanceStateDefinition<?> stateDefinition;

    public GlanceAppWidget() {
        this(0, 1, null);
    }

    public static /* synthetic */ Object onDelete$suspendImpl(GlanceAppWidget glanceAppWidget, Context context, GlanceId glanceId, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object triggerAction$glance_appwidget_release$default(GlanceAppWidget glanceAppWidget, Context context, int i, String str, Bundle bundle, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: triggerAction");
        }
        if ((i2 & 8) != 0) {
            bundle = null;
        }
        return glanceAppWidget.triggerAction$glance_appwidget_release(context, i, str, bundle, continuation);
    }

    public static /* synthetic */ Object update$glance_appwidget_release$default(GlanceAppWidget glanceAppWidget, Context context, int i, Bundle bundle, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        return glanceAppWidget.update$glance_appwidget_release(context, i, bundle, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        if (r2.deleteStore(r9, r10, r8, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
    
        if (r2.deleteStore(r9, r10, r8, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r2.deleteStore(r9, r10, r8, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleted$glance_appwidget_release(Context context, int i, Continuation<? super Unit> continuation) {
        GlanceAppWidget$deleted$1 glanceAppWidget$deleted$1;
        AppWidgetId appWidgetId;
        GlanceAppWidget glanceAppWidget;
        Context context2;
        int i2;
        GlanceStateDefinition<?> stateDefinition;
        GlanceStateDefinition<?> stateDefinition2;
        GlanceStateDefinition<?> stateDefinition3;
        if (continuation instanceof GlanceAppWidget$deleted$1) {
            glanceAppWidget$deleted$1 = (GlanceAppWidget$deleted$1) continuation;
            int i3 = glanceAppWidget$deleted$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                glanceAppWidget$deleted$1.label = i3 - Integer.MIN_VALUE;
                Object obj = glanceAppWidget$deleted$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (glanceAppWidget$deleted$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        appWidgetId = new AppWidgetId(i);
                        SessionManager sessionManager = this.sessionManager;
                        String sessionKey = AppWidgetUtilsKt.toSessionKey(appWidgetId);
                        glanceAppWidget$deleted$1.L$0 = this;
                        glanceAppWidget$deleted$1.L$1 = context;
                        glanceAppWidget$deleted$1.L$2 = appWidgetId;
                        glanceAppWidget$deleted$1.I$0 = i;
                        glanceAppWidget$deleted$1.label = 1;
                        if (sessionManager.closeSession(sessionKey, glanceAppWidget$deleted$1) != coroutine_suspended) {
                            glanceAppWidget = this;
                            try {
                                glanceAppWidget$deleted$1.L$0 = glanceAppWidget;
                                glanceAppWidget$deleted$1.L$1 = context;
                                glanceAppWidget$deleted$1.L$2 = null;
                                glanceAppWidget$deleted$1.I$0 = i;
                                glanceAppWidget$deleted$1.label = 2;
                            } catch (CancellationException unused) {
                                int i4 = i;
                                context2 = context;
                                i2 = i4;
                                stateDefinition2 = glanceAppWidget.getStateDefinition();
                                if (stateDefinition2 != null) {
                                    GlanceState glanceState = GlanceState.INSTANCE;
                                    String createUniqueRemoteUiName = AppWidgetUtilsKt.createUniqueRemoteUiName(i2);
                                    glanceAppWidget$deleted$1.L$0 = null;
                                    glanceAppWidget$deleted$1.L$1 = null;
                                    glanceAppWidget$deleted$1.L$2 = null;
                                    glanceAppWidget$deleted$1.label = 4;
                                    break;
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable unused2) {
                                int i5 = i;
                                context2 = context;
                                i2 = i5;
                                stateDefinition = glanceAppWidget.getStateDefinition();
                                if (stateDefinition != null) {
                                    GlanceState glanceState2 = GlanceState.INSTANCE;
                                    String createUniqueRemoteUiName2 = AppWidgetUtilsKt.createUniqueRemoteUiName(i2);
                                    glanceAppWidget$deleted$1.L$0 = null;
                                    glanceAppWidget$deleted$1.L$1 = null;
                                    glanceAppWidget$deleted$1.L$2 = null;
                                    glanceAppWidget$deleted$1.label = 5;
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                            if (glanceAppWidget.onDelete(context, appWidgetId, glanceAppWidget$deleted$1) != coroutine_suspended) {
                                int i6 = i;
                                context2 = context;
                                i2 = i6;
                                stateDefinition3 = glanceAppWidget.getStateDefinition();
                                if (stateDefinition3 != null) {
                                    GlanceState glanceState3 = GlanceState.INSTANCE;
                                    String createUniqueRemoteUiName3 = AppWidgetUtilsKt.createUniqueRemoteUiName(i2);
                                    glanceAppWidget$deleted$1.L$0 = null;
                                    glanceAppWidget$deleted$1.L$1 = null;
                                    glanceAppWidget$deleted$1.label = 3;
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        i = glanceAppWidget$deleted$1.I$0;
                        AppWidgetId appWidgetId2 = (AppWidgetId) glanceAppWidget$deleted$1.L$2;
                        Context context3 = (Context) glanceAppWidget$deleted$1.L$1;
                        GlanceAppWidget glanceAppWidget2 = (GlanceAppWidget) glanceAppWidget$deleted$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        appWidgetId = appWidgetId2;
                        context = context3;
                        glanceAppWidget = glanceAppWidget2;
                        glanceAppWidget$deleted$1.L$0 = glanceAppWidget;
                        glanceAppWidget$deleted$1.L$1 = context;
                        glanceAppWidget$deleted$1.L$2 = null;
                        glanceAppWidget$deleted$1.I$0 = i;
                        glanceAppWidget$deleted$1.label = 2;
                        if (glanceAppWidget.onDelete(context, appWidgetId, glanceAppWidget$deleted$1) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        i2 = glanceAppWidget$deleted$1.I$0;
                        context2 = (Context) glanceAppWidget$deleted$1.L$1;
                        glanceAppWidget = (GlanceAppWidget) glanceAppWidget$deleted$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            stateDefinition3 = glanceAppWidget.getStateDefinition();
                            if (stateDefinition3 != null) {
                            }
                        } catch (CancellationException unused3) {
                            stateDefinition2 = glanceAppWidget.getStateDefinition();
                            if (stateDefinition2 != null) {
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable unused4) {
                            stateDefinition = glanceAppWidget.getStateDefinition();
                            if (stateDefinition != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    case 3:
                    case 4:
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 6:
                        Throwable th = (Throwable) glanceAppWidget$deleted$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        throw th;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        glanceAppWidget$deleted$1 = new GlanceAppWidget$deleted$1(this, continuation);
        Object obj2 = glanceAppWidget$deleted$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (glanceAppWidget$deleted$1.label) {
        }
    }

    /* renamed from: getErrorUiLayout$glance_appwidget_release, reason: from getter */
    public final int getErrorUiLayout() {
        return this.errorUiLayout;
    }

    public SizeMode getSizeMode() {
        return this.sizeMode;
    }

    public GlanceStateDefinition<?> getStateDefinition() {
        return this.stateDefinition;
    }

    public Object onDelete(Context context, GlanceId glanceId, Continuation<? super Unit> continuation) {
        return onDelete$suspendImpl(this, context, glanceId, continuation);
    }

    public abstract Object provideGlance(Context context, GlanceId glanceId, Continuation<? super Unit> continuation);

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        if (r0.startSession(r14, r6, r1) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
    
        if (((androidx.glance.appwidget.AppWidgetSession) r14).updateAppWidgetOptions(r9, r1) == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resize$glance_appwidget_release(Context context, int i, Bundle bundle, Continuation<? super Unit> continuation) {
        GlanceAppWidget$resize$1 glanceAppWidget$resize$1;
        Object obj;
        int i2;
        GlanceAppWidget glanceAppWidget;
        Bundle bundle2;
        AppWidgetId appWidgetId;
        if (continuation instanceof GlanceAppWidget$resize$1) {
            glanceAppWidget$resize$1 = (GlanceAppWidget$resize$1) continuation;
            int i3 = glanceAppWidget$resize$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                glanceAppWidget$resize$1.label = i3 - Integer.MIN_VALUE;
                obj = glanceAppWidget$resize$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = glanceAppWidget$resize$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if ((getSizeMode() instanceof SizeMode.Single) || (Build.VERSION.SDK_INT > 31 && (getSizeMode() instanceof SizeMode.Responsive))) {
                        return Unit.INSTANCE;
                    }
                    AppWidgetId appWidgetId2 = new AppWidgetId(i);
                    SessionManager sessionManager = this.sessionManager;
                    String sessionKey = AppWidgetUtilsKt.toSessionKey(appWidgetId2);
                    glanceAppWidget$resize$1.L$0 = this;
                    glanceAppWidget$resize$1.L$1 = context;
                    glanceAppWidget$resize$1.L$2 = bundle;
                    glanceAppWidget$resize$1.L$3 = appWidgetId2;
                    glanceAppWidget$resize$1.label = 1;
                    Object isSessionRunning = sessionManager.isSessionRunning(context, sessionKey, glanceAppWidget$resize$1);
                    if (isSessionRunning != coroutine_suspended) {
                        glanceAppWidget = this;
                        bundle2 = bundle;
                        appWidgetId = appWidgetId2;
                        obj = isSessionRunning;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                AppWidgetId appWidgetId3 = (AppWidgetId) glanceAppWidget$resize$1.L$3;
                Bundle bundle3 = (Bundle) glanceAppWidget$resize$1.L$2;
                Context context2 = (Context) glanceAppWidget$resize$1.L$1;
                glanceAppWidget = (GlanceAppWidget) glanceAppWidget$resize$1.L$0;
                ResultKt.throwOnFailure(obj);
                appWidgetId = appWidgetId3;
                bundle2 = bundle3;
                context = context2;
                if (((Boolean) obj).booleanValue()) {
                    SessionManager sessionManager2 = glanceAppWidget.sessionManager;
                    AppWidgetSession appWidgetSession = new AppWidgetSession(glanceAppWidget, appWidgetId, bundle2, null, 8, null);
                    glanceAppWidget$resize$1.L$0 = null;
                    glanceAppWidget$resize$1.L$1 = null;
                    glanceAppWidget$resize$1.L$2 = null;
                    glanceAppWidget$resize$1.L$3 = null;
                    glanceAppWidget$resize$1.label = 2;
                } else {
                    Session session = glanceAppWidget.sessionManager.getSession(AppWidgetUtilsKt.toSessionKey(appWidgetId));
                    Intrinsics.checkNotNull(session, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
                    glanceAppWidget$resize$1.L$0 = null;
                    glanceAppWidget$resize$1.L$1 = null;
                    glanceAppWidget$resize$1.L$2 = null;
                    glanceAppWidget$resize$1.L$3 = null;
                    glanceAppWidget$resize$1.label = 3;
                }
                return coroutine_suspended;
            }
        }
        glanceAppWidget$resize$1 = new GlanceAppWidget$resize$1(this, continuation);
        obj = glanceAppWidget$resize$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = glanceAppWidget$resize$1.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return coroutine_suspended2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e1, code lost:
    
        if (r1.runLambda(r11, r3) == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object triggerAction$glance_appwidget_release(Context context, int i, String str, Bundle bundle, Continuation<? super Unit> continuation) {
        GlanceAppWidget$triggerAction$1 glanceAppWidget$triggerAction$1;
        Object obj;
        int i2;
        String str2;
        GlanceAppWidget glanceAppWidget;
        Context context2;
        AppWidgetId appWidgetId;
        Bundle bundle2;
        AppWidgetSession appWidgetSession;
        String str3;
        if (continuation instanceof GlanceAppWidget$triggerAction$1) {
            glanceAppWidget$triggerAction$1 = (GlanceAppWidget$triggerAction$1) continuation;
            int i3 = glanceAppWidget$triggerAction$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                glanceAppWidget$triggerAction$1.label = i3 - Integer.MIN_VALUE;
                obj = glanceAppWidget$triggerAction$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = glanceAppWidget$triggerAction$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    AppWidgetId appWidgetId2 = new AppWidgetId(i);
                    SessionManager sessionManager = this.sessionManager;
                    String sessionKey = AppWidgetUtilsKt.toSessionKey(appWidgetId2);
                    glanceAppWidget$triggerAction$1.L$0 = this;
                    glanceAppWidget$triggerAction$1.L$1 = context;
                    str2 = str;
                    glanceAppWidget$triggerAction$1.L$2 = str2;
                    glanceAppWidget$triggerAction$1.L$3 = bundle;
                    glanceAppWidget$triggerAction$1.L$4 = appWidgetId2;
                    glanceAppWidget$triggerAction$1.label = 1;
                    Object isSessionRunning = sessionManager.isSessionRunning(context, sessionKey, glanceAppWidget$triggerAction$1);
                    if (isSessionRunning != coroutine_suspended) {
                        glanceAppWidget = this;
                        context2 = context;
                        appWidgetId = appWidgetId2;
                        obj = isSessionRunning;
                        bundle2 = bundle;
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    AppWidgetId appWidgetId3 = (AppWidgetId) glanceAppWidget$triggerAction$1.L$4;
                    Bundle bundle3 = (Bundle) glanceAppWidget$triggerAction$1.L$3;
                    String str4 = (String) glanceAppWidget$triggerAction$1.L$2;
                    context2 = (Context) glanceAppWidget$triggerAction$1.L$1;
                    GlanceAppWidget glanceAppWidget2 = (GlanceAppWidget) glanceAppWidget$triggerAction$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    appWidgetId = appWidgetId3;
                    bundle2 = bundle3;
                    glanceAppWidget = glanceAppWidget2;
                    str2 = str4;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    appWidgetSession = (AppWidgetSession) glanceAppWidget$triggerAction$1.L$1;
                    str3 = (String) glanceAppWidget$triggerAction$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    str2 = str3;
                    glanceAppWidget$triggerAction$1.L$0 = null;
                    glanceAppWidget$triggerAction$1.L$1 = null;
                    glanceAppWidget$triggerAction$1.L$2 = null;
                    glanceAppWidget$triggerAction$1.L$3 = null;
                    glanceAppWidget$triggerAction$1.L$4 = null;
                    glanceAppWidget$triggerAction$1.label = 3;
                }
                if (((Boolean) obj).booleanValue()) {
                    AppWidgetSession appWidgetSession2 = new AppWidgetSession(glanceAppWidget, appWidgetId, bundle2, null, 8, null);
                    SessionManager sessionManager2 = glanceAppWidget.sessionManager;
                    glanceAppWidget$triggerAction$1.L$0 = str2;
                    glanceAppWidget$triggerAction$1.L$1 = appWidgetSession2;
                    glanceAppWidget$triggerAction$1.L$2 = null;
                    glanceAppWidget$triggerAction$1.L$3 = null;
                    glanceAppWidget$triggerAction$1.L$4 = null;
                    glanceAppWidget$triggerAction$1.label = 2;
                    if (sessionManager2.startSession(context2, appWidgetSession2, glanceAppWidget$triggerAction$1) != coroutine_suspended) {
                        str3 = str2;
                        appWidgetSession = appWidgetSession2;
                        str2 = str3;
                        glanceAppWidget$triggerAction$1.L$0 = null;
                        glanceAppWidget$triggerAction$1.L$1 = null;
                        glanceAppWidget$triggerAction$1.L$2 = null;
                        glanceAppWidget$triggerAction$1.L$3 = null;
                        glanceAppWidget$triggerAction$1.L$4 = null;
                        glanceAppWidget$triggerAction$1.label = 3;
                    }
                    return coroutine_suspended;
                }
                Session session = glanceAppWidget.sessionManager.getSession(AppWidgetUtilsKt.toSessionKey(appWidgetId));
                Intrinsics.checkNotNull(session, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
                appWidgetSession = (AppWidgetSession) session;
                glanceAppWidget$triggerAction$1.L$0 = null;
                glanceAppWidget$triggerAction$1.L$1 = null;
                glanceAppWidget$triggerAction$1.L$2 = null;
                glanceAppWidget$triggerAction$1.L$3 = null;
                glanceAppWidget$triggerAction$1.L$4 = null;
                glanceAppWidget$triggerAction$1.label = 3;
            }
        }
        glanceAppWidget$triggerAction$1 = new GlanceAppWidget$triggerAction$1(this, continuation);
        obj = glanceAppWidget$triggerAction$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = glanceAppWidget$triggerAction$1.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final Object update(Context context, GlanceId glanceId, Continuation<? super Unit> continuation) {
        if (!(glanceId instanceof AppWidgetId)) {
            throw new IllegalArgumentException("Invalid Glance ID");
        }
        Object update$glance_appwidget_release$default = update$glance_appwidget_release$default(this, context, ((AppWidgetId) glanceId).getAppWidgetId(), null, continuation, 4, null);
        return update$glance_appwidget_release$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? update$glance_appwidget_release$default : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r0.startSession(r14, r6, r1) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
    
        if (((androidx.glance.appwidget.AppWidgetSession) r14).updateGlance(r1) == r2) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object update$glance_appwidget_release(Context context, int i, Bundle bundle, Continuation<? super Unit> continuation) {
        GlanceAppWidget$update$3 glanceAppWidget$update$3;
        Object obj;
        int i2;
        GlanceAppWidget glanceAppWidget;
        Bundle bundle2;
        AppWidgetId appWidgetId;
        if (continuation instanceof GlanceAppWidget$update$3) {
            glanceAppWidget$update$3 = (GlanceAppWidget$update$3) continuation;
            int i3 = glanceAppWidget$update$3.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                glanceAppWidget$update$3.label = i3 - Integer.MIN_VALUE;
                obj = glanceAppWidget$update$3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = glanceAppWidget$update$3.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Tracing.INSTANCE.beginGlanceAppWidgetUpdate();
                    AppWidgetId appWidgetId2 = new AppWidgetId(i);
                    SessionManager sessionManager = this.sessionManager;
                    String sessionKey = AppWidgetUtilsKt.toSessionKey(appWidgetId2);
                    glanceAppWidget$update$3.L$0 = this;
                    glanceAppWidget$update$3.L$1 = context;
                    glanceAppWidget$update$3.L$2 = bundle;
                    glanceAppWidget$update$3.L$3 = appWidgetId2;
                    glanceAppWidget$update$3.label = 1;
                    Object isSessionRunning = sessionManager.isSessionRunning(context, sessionKey, glanceAppWidget$update$3);
                    if (isSessionRunning != coroutine_suspended) {
                        glanceAppWidget = this;
                        bundle2 = bundle;
                        appWidgetId = appWidgetId2;
                        obj = isSessionRunning;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                AppWidgetId appWidgetId3 = (AppWidgetId) glanceAppWidget$update$3.L$3;
                Bundle bundle3 = (Bundle) glanceAppWidget$update$3.L$2;
                Context context2 = (Context) glanceAppWidget$update$3.L$1;
                glanceAppWidget = (GlanceAppWidget) glanceAppWidget$update$3.L$0;
                ResultKt.throwOnFailure(obj);
                appWidgetId = appWidgetId3;
                bundle2 = bundle3;
                context = context2;
                if (((Boolean) obj).booleanValue()) {
                    SessionManager sessionManager2 = glanceAppWidget.sessionManager;
                    AppWidgetSession appWidgetSession = new AppWidgetSession(glanceAppWidget, appWidgetId, bundle2, null, 8, null);
                    glanceAppWidget$update$3.L$0 = null;
                    glanceAppWidget$update$3.L$1 = null;
                    glanceAppWidget$update$3.L$2 = null;
                    glanceAppWidget$update$3.L$3 = null;
                    glanceAppWidget$update$3.label = 2;
                } else {
                    Session session = glanceAppWidget.sessionManager.getSession(AppWidgetUtilsKt.toSessionKey(appWidgetId));
                    Intrinsics.checkNotNull(session, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
                    glanceAppWidget$update$3.L$0 = null;
                    glanceAppWidget$update$3.L$1 = null;
                    glanceAppWidget$update$3.L$2 = null;
                    glanceAppWidget$update$3.L$3 = null;
                    glanceAppWidget$update$3.label = 3;
                }
                return coroutine_suspended;
            }
        }
        glanceAppWidget$update$3 = new GlanceAppWidget$update$3(this, continuation);
        obj = glanceAppWidget$update$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = glanceAppWidget$update$3.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return coroutine_suspended2;
    }

    public GlanceAppWidget(@LayoutRes int i) {
        this.errorUiLayout = i;
        this.sessionManager = SessionManagerKt.getGlanceSessionManager();
        this.sizeMode = SizeMode.Single.INSTANCE;
        this.stateDefinition = PreferencesGlanceStateDefinition.INSTANCE;
    }

    public /* synthetic */ GlanceAppWidget(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? R.layout.glance_error_layout : i);
    }
}
