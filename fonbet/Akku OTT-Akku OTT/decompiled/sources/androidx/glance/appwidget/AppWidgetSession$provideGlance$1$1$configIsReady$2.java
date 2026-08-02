package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.glance.state.ConfigManager;
import androidx.glance.state.GlanceStateDefinition;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.appwidget.AppWidgetSession$provideGlance$1$1$configIsReady$2", f = "AppWidgetSession.kt", i = {0}, l = {HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend", n = {"$this$produceState"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class AppWidgetSession$provideGlance$1$1$configIsReady$2 extends SuspendLambda implements Function2<ProduceStateScope<Boolean>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AppWidgetManager $manager;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AppWidgetSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSession$provideGlance$1$1$configIsReady$2(AppWidgetSession appWidgetSession, AppWidgetManager appWidgetManager, Context context, Continuation<? super AppWidgetSession$provideGlance$1$1$configIsReady$2> continuation) {
        super(2, continuation);
        this.this$0 = appWidgetSession;
        this.$manager = appWidgetManager;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppWidgetSession$provideGlance$1$1$configIsReady$2 appWidgetSession$provideGlance$1$1$configIsReady$2 = new AppWidgetSession$provideGlance$1$1$configIsReady$2(this.this$0, this.$manager, this.$context, continuation);
        appWidgetSession$provideGlance$1$1$configIsReady$2.L$0 = obj;
        return appWidgetSession$provideGlance$1$1$configIsReady$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProduceStateScope<Boolean> produceStateScope, Continuation<? super Unit> continuation) {
        return ((AppWidgetSession$provideGlance$1$1$configIsReady$2) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProduceStateScope produceStateScope;
        MutableState mutableState;
        Bundle bundle;
        GlanceAppWidget glanceAppWidget;
        MutableState mutableState2;
        ConfigManager configManager;
        MutableState mutableState3;
        AppWidgetId appWidgetId;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            produceStateScope = (ProduceStateScope) this.L$0;
            mutableState = this.this$0.options;
            bundle = this.this$0.initialOptions;
            if (bundle == null) {
                AppWidgetManager appWidgetManager = this.$manager;
                appWidgetId = this.this$0.id;
                bundle = appWidgetManager.getAppWidgetOptions(appWidgetId.getAppWidgetId());
            }
            mutableState.setValue(bundle);
            glanceAppWidget = this.this$0.widget;
            GlanceStateDefinition<?> stateDefinition = glanceAppWidget.getStateDefinition();
            if (stateDefinition != null) {
                AppWidgetSession appWidgetSession = this.this$0;
                Context context = this.$context;
                mutableState2 = appWidgetSession.glanceState;
                configManager = appWidgetSession.configManager;
                String key = appWidgetSession.getKey();
                this.L$0 = produceStateScope;
                this.L$1 = mutableState2;
                this.label = 1;
                obj = configManager.getValue(context, stateDefinition, key, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState3 = mutableState2;
            }
            produceStateScope.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableState3 = (MutableState) this.L$1;
        produceStateScope = (ProduceStateScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        mutableState3.setValue(obj);
        produceStateScope.setValue(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
