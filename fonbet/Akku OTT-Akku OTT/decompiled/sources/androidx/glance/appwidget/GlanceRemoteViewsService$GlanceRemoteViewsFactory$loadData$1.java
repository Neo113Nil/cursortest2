package androidx.glance.appwidget;

import android.content.Context;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.glance.session.SessionManager;
import androidx.glance.session.SessionManagerKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.K;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1", f = "GlanceRemoteViewsService.kt", i = {0}, l = {112, 113}, m = "invokeSuspend", n = {"glanceId"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ GlanceRemoteViewsService.GlanceRemoteViewsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1(GlanceRemoteViewsService.GlanceRemoteViewsFactory glanceRemoteViewsFactory, Continuation<? super GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = glanceRemoteViewsFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1(this.this$0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AppWidgetId appWidgetId;
        int i;
        Context context;
        Object startSessionAndWaitUntilReady;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            i = this.this$0.appWidgetId;
            appWidgetId = new AppWidgetId(i);
            SessionManager glanceSessionManager = SessionManagerKt.getGlanceSessionManager();
            context = this.this$0.context;
            String sessionKey = AppWidgetUtilsKt.toSessionKey(appWidgetId);
            this.L$0 = appWidgetId;
            this.label = 1;
            obj = glanceSessionManager.isSessionRunning(context, sessionKey, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            appWidgetId = (AppWidgetId) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            GlanceRemoteViewsService.GlanceRemoteViewsFactory glanceRemoteViewsFactory = this.this$0;
            this.L$0 = null;
            this.label = 2;
            startSessionAndWaitUntilReady = glanceRemoteViewsFactory.startSessionAndWaitUntilReady(appWidgetId, this);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
