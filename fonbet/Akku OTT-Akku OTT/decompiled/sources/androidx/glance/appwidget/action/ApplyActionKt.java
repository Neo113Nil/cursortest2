package androidx.glance.appwidget.action;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.annotation.IdRes;
import androidx.core.os.BundleKt;
import androidx.glance.action.Action;
import androidx.glance.action.ActionParameters;
import androidx.glance.action.ActionParametersKt;
import androidx.glance.action.LambdaAction;
import androidx.glance.action.MutableActionParameters;
import androidx.glance.action.StartActivityAction;
import androidx.glance.action.StartActivityClassAction;
import androidx.glance.action.StartActivityComponentAction;
import androidx.glance.appwidget.TranslationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a8\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u001a8\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u001a\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0010H\u0002\u001a\u0018\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u0019H\u0002¨\u0006\u001a"}, d2 = {"applyAction", "", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "rv", "Landroid/widget/RemoteViews;", "action", "Landroidx/glance/action/Action;", "viewId", "", "getBroadcastReceiverIntent", "Landroid/content/Intent;", "Landroidx/glance/appwidget/action/SendBroadcastAction;", "getFillInIntentForAction", "editParams", "Lkotlin/Function1;", "Landroidx/glance/action/ActionParameters;", "getPendingIntentForAction", "Landroid/app/PendingIntent;", "getServiceIntent", "Landroidx/glance/appwidget/action/StartServiceAction;", "getStartActivityIntent", "Landroidx/glance/action/StartActivityAction;", "params", "getActionParameters", "Landroidx/glance/appwidget/action/CompoundButtonAction;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nApplyAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplyAction.kt\nandroidx/glance/appwidget/action/ApplyActionKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,373:1\n125#2:374\n152#2,3:375\n37#3,2:378\n*S KotlinDebug\n*F\n+ 1 ApplyAction.kt\nandroidx/glance/appwidget/action/ApplyActionKt\n*L\n321#1:374\n321#1:375,3\n323#1:378,2\n*E\n"})
/* loaded from: classes.dex */
public final class ApplyActionKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void applyAction(TranslationContext translationContext, RemoteViews remoteViews, Action action, @IdRes int i) {
        Integer actionTargetId = translationContext.getActionTargetId();
        if (actionTargetId != null) {
            i = actionTargetId.intValue();
        }
        int i2 = i;
        try {
        } catch (Throwable unused) {
            actionTargetId = action;
        }
        try {
            if (translationContext.isLazyCollectionDescendant()) {
                Intent fillInIntentForAction$default = getFillInIntentForAction$default(action, translationContext, i2, null, 8, null);
                if (!(action instanceof CompoundButtonAction) || Build.VERSION.SDK_INT < 31) {
                    remoteViews.setOnClickFillInIntent(i2, fillInIntentForAction$default);
                    return;
                } else {
                    ApplyActionApi31Impl.INSTANCE.setOnCheckedChangeResponse(remoteViews, i2, fillInIntentForAction$default);
                    return;
                }
            }
            PendingIntent pendingIntentForAction$default = getPendingIntentForAction$default(action, translationContext, i2, null, 8, null);
            if (!(action instanceof CompoundButtonAction) || Build.VERSION.SDK_INT < 31) {
                remoteViews.setOnClickPendingIntent(i2, pendingIntentForAction$default);
            } else {
                ApplyActionApi31Impl.INSTANCE.setOnCheckedChangeResponse(remoteViews, i2, pendingIntentForAction$default);
            }
        } catch (Throwable unused2) {
            Objects.toString(actionTargetId);
        }
    }

    private static final Function1<ActionParameters, ActionParameters> getActionParameters(final CompoundButtonAction compoundButtonAction) {
        return new Function1<ActionParameters, ActionParameters>() { // from class: androidx.glance.appwidget.action.ApplyActionKt$getActionParameters$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final ActionParameters invoke(ActionParameters actionParameters) {
                if (Build.VERSION.SDK_INT >= 31) {
                    return actionParameters;
                }
                MutableActionParameters mutableParameters = ActionParametersKt.toMutableParameters(actionParameters);
                mutableParameters.set(ToggleableKt.getToggleableStateKey(), Boolean.valueOf(!CompoundButtonAction.this.getChecked()));
                return mutableParameters;
            }
        };
    }

    private static final Intent getBroadcastReceiverIntent(SendBroadcastAction sendBroadcastAction, TranslationContext translationContext) {
        if (sendBroadcastAction instanceof SendBroadcastComponentAction) {
            return new Intent().setComponent(((SendBroadcastComponentAction) sendBroadcastAction).getComponentName());
        }
        if (sendBroadcastAction instanceof SendBroadcastClassAction) {
            return new Intent(translationContext.getContext(), ((SendBroadcastClassAction) sendBroadcastAction).getReceiverClass());
        }
        if (sendBroadcastAction instanceof SendBroadcastIntentAction) {
            return ((SendBroadcastIntentAction) sendBroadcastAction).getIntent();
        }
        if (!(sendBroadcastAction instanceof SendBroadcastActionAction)) {
            throw new NoWhenBranchMatchedException();
        }
        SendBroadcastActionAction sendBroadcastActionAction = (SendBroadcastActionAction) sendBroadcastAction;
        return new Intent(sendBroadcastActionAction.getAction()).setComponent(sendBroadcastActionAction.getComponentName());
    }

    private static final Intent getFillInIntentForAction(Action action, TranslationContext translationContext, @IdRes int i, Function1<? super ActionParameters, ? extends ActionParameters> function1) {
        if (action instanceof StartActivityAction) {
            StartActivityAction startActivityAction = (StartActivityAction) action;
            return ActionTrampolineKt.applyTrampolineIntent(getStartActivityIntent(startActivityAction, translationContext, function1.invoke(startActivityAction.getParameters())), translationContext, i, ActionTrampolineType.ACTIVITY, startActivityAction.getActivityOptions());
        }
        if (action instanceof StartServiceAction) {
            StartServiceAction startServiceAction = (StartServiceAction) action;
            return ActionTrampolineKt.applyTrampolineIntent$default(getServiceIntent(startServiceAction, translationContext), translationContext, i, startServiceAction.getIsForegroundService() ? ActionTrampolineType.FOREGROUND_SERVICE : ActionTrampolineType.SERVICE, null, 8, null);
        }
        if (action instanceof SendBroadcastAction) {
            return ActionTrampolineKt.applyTrampolineIntent$default(getBroadcastReceiverIntent((SendBroadcastAction) action, translationContext), translationContext, i, ActionTrampolineType.BROADCAST, null, 8, null);
        }
        if (action instanceof RunCallbackAction) {
            RunCallbackAction runCallbackAction = (RunCallbackAction) action;
            return ActionTrampolineKt.applyTrampolineIntent$default(ActionCallbackBroadcastReceiver.INSTANCE.createIntent$glance_appwidget_release(translationContext.getContext(), runCallbackAction.getCallbackClass(), translationContext.getAppWidgetId(), function1.invoke(runCallbackAction.getParameters())), translationContext, i, ActionTrampolineType.BROADCAST, null, 8, null);
        }
        if (action instanceof LambdaAction) {
            if (translationContext.getActionBroadcastReceiver() != null) {
                return ActionTrampolineKt.applyTrampolineIntent$default(LambdaActionBroadcasts.INSTANCE.createIntent$glance_appwidget_release(translationContext.getActionBroadcastReceiver(), ((LambdaAction) action).getKey(), translationContext.getAppWidgetId()), translationContext, i, ActionTrampolineType.BROADCAST, null, 8, null);
            }
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        if (action instanceof CompoundButtonAction) {
            CompoundButtonAction compoundButtonAction = (CompoundButtonAction) action;
            return getFillInIntentForAction(compoundButtonAction.getInnerAction(), translationContext, i, getActionParameters(compoundButtonAction));
        }
        throw new IllegalStateException(("Cannot create fill-in Intent for action type: " + action).toString());
    }

    public static /* synthetic */ Intent getFillInIntentForAction$default(Action action, TranslationContext translationContext, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function1 = new Function1<ActionParameters, ActionParameters>() { // from class: androidx.glance.appwidget.action.ApplyActionKt$getFillInIntentForAction$1
                @Override // kotlin.jvm.functions.Function1
                public final ActionParameters invoke(ActionParameters actionParameters) {
                    return actionParameters;
                }
            };
        }
        return getFillInIntentForAction(action, translationContext, i, function1);
    }

    private static final PendingIntent getPendingIntentForAction(Action action, TranslationContext translationContext, @IdRes int i, Function1<? super ActionParameters, ? extends ActionParameters> function1) {
        if (action instanceof StartActivityAction) {
            StartActivityAction startActivityAction = (StartActivityAction) action;
            ActionParameters invoke = function1.invoke(startActivityAction.getParameters());
            Context context = translationContext.getContext();
            Intent startActivityIntent = getStartActivityIntent(startActivityAction, translationContext, invoke);
            if (startActivityIntent.getData() == null) {
                startActivityIntent.setData(ActionTrampolineKt.createUniqueUri$default(translationContext, i, ActionTrampolineType.CALLBACK, null, 8, null));
            }
            Unit unit = Unit.INSTANCE;
            return PendingIntent.getActivity(context, 0, startActivityIntent, 167772160, startActivityAction.getActivityOptions());
        }
        if (action instanceof StartServiceAction) {
            StartServiceAction startServiceAction = (StartServiceAction) action;
            Intent serviceIntent = getServiceIntent(startServiceAction, translationContext);
            if (serviceIntent.getData() == null) {
                serviceIntent.setData(ActionTrampolineKt.createUniqueUri$default(translationContext, i, ActionTrampolineType.CALLBACK, null, 8, null));
            }
            return (!startServiceAction.getIsForegroundService() || Build.VERSION.SDK_INT < 26) ? PendingIntent.getService(translationContext.getContext(), 0, serviceIntent, 167772160) : ApplyActionApi26Impl.INSTANCE.getForegroundServicePendingIntent(translationContext.getContext(), serviceIntent);
        }
        if (action instanceof SendBroadcastAction) {
            Context context2 = translationContext.getContext();
            Intent broadcastReceiverIntent = getBroadcastReceiverIntent((SendBroadcastAction) action, translationContext);
            if (broadcastReceiverIntent.getData() == null) {
                broadcastReceiverIntent.setData(ActionTrampolineKt.createUniqueUri$default(translationContext, i, ActionTrampolineType.CALLBACK, null, 8, null));
            }
            Unit unit2 = Unit.INSTANCE;
            return PendingIntent.getBroadcast(context2, 0, broadcastReceiverIntent, 167772160);
        }
        if (action instanceof RunCallbackAction) {
            Context context3 = translationContext.getContext();
            RunCallbackAction runCallbackAction = (RunCallbackAction) action;
            Intent createIntent$glance_appwidget_release = ActionCallbackBroadcastReceiver.INSTANCE.createIntent$glance_appwidget_release(translationContext.getContext(), runCallbackAction.getCallbackClass(), translationContext.getAppWidgetId(), function1.invoke(runCallbackAction.getParameters()));
            createIntent$glance_appwidget_release.setData(ActionTrampolineKt.createUniqueUri$default(translationContext, i, ActionTrampolineType.CALLBACK, null, 8, null));
            Unit unit3 = Unit.INSTANCE;
            return PendingIntent.getBroadcast(context3, 0, createIntent$glance_appwidget_release, 167772160);
        }
        if (!(action instanceof LambdaAction)) {
            if (action instanceof CompoundButtonAction) {
                CompoundButtonAction compoundButtonAction = (CompoundButtonAction) action;
                return getPendingIntentForAction(compoundButtonAction.getInnerAction(), translationContext, i, getActionParameters(compoundButtonAction));
            }
            throw new IllegalStateException(("Cannot create PendingIntent for action type: " + action).toString());
        }
        if (translationContext.getActionBroadcastReceiver() == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        Context context4 = translationContext.getContext();
        LambdaAction lambdaAction = (LambdaAction) action;
        Intent createIntent$glance_appwidget_release2 = LambdaActionBroadcasts.INSTANCE.createIntent$glance_appwidget_release(translationContext.getActionBroadcastReceiver(), lambdaAction.getKey(), translationContext.getAppWidgetId());
        createIntent$glance_appwidget_release2.setData(ActionTrampolineKt.createUniqueUri(translationContext, i, ActionTrampolineType.CALLBACK, lambdaAction.getKey()));
        Unit unit4 = Unit.INSTANCE;
        return PendingIntent.getBroadcast(context4, 0, createIntent$glance_appwidget_release2, 167772160);
    }

    public static /* synthetic */ PendingIntent getPendingIntentForAction$default(Action action, TranslationContext translationContext, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function1 = new Function1<ActionParameters, ActionParameters>() { // from class: androidx.glance.appwidget.action.ApplyActionKt$getPendingIntentForAction$1
                @Override // kotlin.jvm.functions.Function1
                public final ActionParameters invoke(ActionParameters actionParameters) {
                    return actionParameters;
                }
            };
        }
        return getPendingIntentForAction(action, translationContext, i, function1);
    }

    private static final Intent getServiceIntent(StartServiceAction startServiceAction, TranslationContext translationContext) {
        if (startServiceAction instanceof StartServiceComponentAction) {
            return new Intent().setComponent(((StartServiceComponentAction) startServiceAction).getComponentName());
        }
        if (startServiceAction instanceof StartServiceClassAction) {
            return new Intent(translationContext.getContext(), ((StartServiceClassAction) startServiceAction).getServiceClass());
        }
        if (startServiceAction instanceof StartServiceIntentAction) {
            return ((StartServiceIntentAction) startServiceAction).getIntent();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Intent getStartActivityIntent(StartActivityAction startActivityAction, TranslationContext translationContext, ActionParameters actionParameters) {
        Intent intent;
        if (startActivityAction instanceof StartActivityComponentAction) {
            intent = new Intent().setComponent(((StartActivityComponentAction) startActivityAction).getComponentName());
        } else if (startActivityAction instanceof StartActivityClassAction) {
            intent = new Intent(translationContext.getContext(), ((StartActivityClassAction) startActivityAction).getActivityClass());
        } else {
            if (!(startActivityAction instanceof StartActivityIntentAction)) {
                throw new IllegalStateException(("Action type not defined in app widget package: " + startActivityAction).toString());
            }
            intent = ((StartActivityIntentAction) startActivityAction).getIntent();
        }
        Map<ActionParameters.Key<? extends Object>, Object> asMap = actionParameters.asMap();
        ArrayList arrayList = new ArrayList(asMap.size());
        for (Map.Entry<ActionParameters.Key<? extends Object>, Object> entry : asMap.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey().getName(), entry.getValue()));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        intent.putExtras(BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return intent;
    }
}
