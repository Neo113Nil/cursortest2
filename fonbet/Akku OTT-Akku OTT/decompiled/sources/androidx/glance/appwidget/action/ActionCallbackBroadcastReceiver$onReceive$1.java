package androidx.glance.appwidget.action;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.glance.action.ActionParameters;
import androidx.glance.action.ActionParametersKt;
import androidx.glance.action.MutableActionParameters;
import androidx.glance.appwidget.AppWidgetId;
import androidx.glance.appwidget.AppWidgetUtilsKt;
import androidx.glance.appwidget.action.RunCallbackAction;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.K;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver$onReceive$1", f = "ActionCallbackBroadcastReceiver.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nActionCallbackBroadcastReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionCallbackBroadcastReceiver.kt\nandroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver$onReceive$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1855#2,2:99\n*S KotlinDebug\n*F\n+ 1 ActionCallbackBroadcastReceiver.kt\nandroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver$onReceive$1\n*L\n47#1:99,2\n*E\n"})
/* loaded from: classes.dex */
public final class ActionCallbackBroadcastReceiver$onReceive$1 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionCallbackBroadcastReceiver$onReceive$1(Intent intent, Context context, Continuation<? super ActionCallbackBroadcastReceiver$onReceive$1> continuation) {
        super(2, continuation);
        this.$intent = intent;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActionCallbackBroadcastReceiver$onReceive$1(this.$intent, this.$context, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Bundle extras = this.$intent.getExtras();
                if (extras == null) {
                    throw new IllegalArgumentException("The intent must have action parameters extras.");
                }
                Bundle bundle = extras.getBundle("ActionCallbackBroadcastReceiver:parameters");
                if (bundle == null) {
                    throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
                }
                MutableActionParameters mutableActionParametersOf = ActionParametersKt.mutableActionParametersOf(new ActionParameters.Pair[0]);
                for (String str : bundle.keySet()) {
                    mutableActionParametersOf.set(new ActionParameters.Key(str), bundle.get(str));
                }
                if (extras.containsKey("android.widget.extra.CHECKED")) {
                    mutableActionParametersOf.set(ToggleableKt.getToggleableStateKey(), Boxing.boxBoolean(extras.getBoolean("android.widget.extra.CHECKED")));
                }
                String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
                if (string == null) {
                    throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
                }
                if (!this.$intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                    throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
                }
                AppWidgetId appWidgetId = new AppWidgetId(extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId"));
                RunCallbackAction.Companion companion = RunCallbackAction.INSTANCE;
                Context context = this.$context;
                this.label = 1;
                if (companion.run(context, string, appWidgetId, mutableActionParametersOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            AppWidgetUtilsKt.logException(th);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((ActionCallbackBroadcastReceiver$onReceive$1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
