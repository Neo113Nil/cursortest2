package com.onesignal.notifications.internal.open.impl;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.common.JSONUtils;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.open.INotificationOpenedProcessor;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import e5.g;
import f4.v;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u.C1458F;

/* loaded from: classes.dex */
public final class NotificationOpenedProcessor implements INotificationOpenedProcessor {
    private final ConfigModelStore _configModelStore;
    private final INotificationRepository _dataController;
    private final INotificationLifecycleService _lifecycleService;
    private final INotificationSummaryManager _summaryManager;

    public NotificationOpenedProcessor(INotificationSummaryManager _summaryManager, INotificationRepository _dataController, ConfigModelStore _configModelStore, INotificationLifecycleService _lifecycleService) {
        i.e(_summaryManager, "_summaryManager");
        i.e(_dataController, "_dataController");
        i.e(_configModelStore, "_configModelStore");
        i.e(_lifecycleService, "_lifecycleService");
        this._summaryManager = _summaryManager;
        this._dataController = _dataController;
        this._configModelStore = _configModelStore;
        this._lifecycleService = _lifecycleService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[LOOP:0: B:11:0x0049->B:13:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addChildNotifications(JSONArray jSONArray, String str, InterfaceC1218d interfaceC1218d) {
        NotificationOpenedProcessor$addChildNotifications$1 notificationOpenedProcessor$addChildNotifications$1;
        int i2;
        Iterator it;
        if (interfaceC1218d instanceof NotificationOpenedProcessor$addChildNotifications$1) {
            notificationOpenedProcessor$addChildNotifications$1 = (NotificationOpenedProcessor$addChildNotifications$1) interfaceC1218d;
            int i3 = notificationOpenedProcessor$addChildNotifications$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationOpenedProcessor$addChildNotifications$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationOpenedProcessor$addChildNotifications$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationOpenedProcessor$addChildNotifications$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    INotificationRepository iNotificationRepository = this._dataController;
                    notificationOpenedProcessor$addChildNotifications$1.L$0 = jSONArray;
                    notificationOpenedProcessor$addChildNotifications$1.label = 1;
                    obj = iNotificationRepository.listNotificationsForGroup(str, notificationOpenedProcessor$addChildNotifications$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray = (JSONArray) notificationOpenedProcessor$addChildNotifications$1.L$0;
                    g.y(obj);
                }
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject(((INotificationRepository.NotificationData) it.next()).getFullData()));
                }
                return v.f5689a;
            }
        }
        notificationOpenedProcessor$addChildNotifications$1 = new NotificationOpenedProcessor$addChildNotifications$1(this, interfaceC1218d);
        Object obj2 = notificationOpenedProcessor$addChildNotifications$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationOpenedProcessor$addChildNotifications$1.label;
        if (i2 != 0) {
        }
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return v.f5689a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearStatusBarNotifications(Context context, String str, InterfaceC1218d interfaceC1218d) {
        v vVar = v.f5689a;
        if (str != null) {
            Object clearNotificationOnSummaryClick = this._summaryManager.clearNotificationOnSummaryClick(str, interfaceC1218d);
            return clearNotificationOnSummaryClick == EnumC1260a.f11058a ? clearNotificationOnSummaryClick : vVar;
        }
        NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
        if (notificationHelper.getGrouplessNotifsCount(context) < 1) {
            notificationHelper.getNotificationManager(context).cancel(NotificationHelper.GROUPLESS_SUMMARY_ID);
        }
        return vVar;
    }

    private final void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            i.b(context);
            C1458F c1458f = new C1458F(context);
            c1458f.f11989b.cancel(null, intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private final boolean isOneSignalIntent(Intent intent) {
        return intent.hasExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA) || intent.hasExtra("summary") || intent.hasExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationsConsumed(Context context, Intent intent, boolean z, InterfaceC1218d interfaceC1218d) {
        NotificationOpenedProcessor$markNotificationsConsumed$1 notificationOpenedProcessor$markNotificationsConsumed$1;
        NotificationOpenedProcessor$markNotificationsConsumed$1 notificationOpenedProcessor$markNotificationsConsumed$12;
        EnumC1260a enumC1260a;
        int i2;
        NotificationOpenedProcessor notificationOpenedProcessor;
        boolean z5;
        String str;
        INotificationRepository iNotificationRepository;
        int intExtra;
        boolean clearGroupOnSummaryClick;
        if (interfaceC1218d instanceof NotificationOpenedProcessor$markNotificationsConsumed$1) {
            notificationOpenedProcessor$markNotificationsConsumed$1 = (NotificationOpenedProcessor$markNotificationsConsumed$1) interfaceC1218d;
            int i3 = notificationOpenedProcessor$markNotificationsConsumed$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationOpenedProcessor$markNotificationsConsumed$1.label = i3 - Integer.MIN_VALUE;
                notificationOpenedProcessor$markNotificationsConsumed$12 = notificationOpenedProcessor$markNotificationsConsumed$1;
                Object obj = notificationOpenedProcessor$markNotificationsConsumed$12.result;
                enumC1260a = EnumC1260a.f11058a;
                i2 = notificationOpenedProcessor$markNotificationsConsumed$12.label;
                if (i2 != 0) {
                    g.y(obj);
                    String stringExtra = intent.getStringExtra("summary");
                    notificationOpenedProcessor$markNotificationsConsumed$12.L$0 = this;
                    notificationOpenedProcessor$markNotificationsConsumed$12.L$1 = intent;
                    notificationOpenedProcessor$markNotificationsConsumed$12.L$2 = stringExtra;
                    notificationOpenedProcessor$markNotificationsConsumed$12.Z$0 = z;
                    notificationOpenedProcessor$markNotificationsConsumed$12.label = 1;
                    if (clearStatusBarNotifications(context, stringExtra, notificationOpenedProcessor$markNotificationsConsumed$12) == enumC1260a) {
                        return enumC1260a;
                    }
                    notificationOpenedProcessor = this;
                    z5 = z;
                    str = stringExtra;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.y(obj);
                        return v.f5689a;
                    }
                    boolean z6 = notificationOpenedProcessor$markNotificationsConsumed$12.Z$0;
                    String str2 = (String) notificationOpenedProcessor$markNotificationsConsumed$12.L$2;
                    intent = (Intent) notificationOpenedProcessor$markNotificationsConsumed$12.L$1;
                    notificationOpenedProcessor = (NotificationOpenedProcessor) notificationOpenedProcessor$markNotificationsConsumed$12.L$0;
                    g.y(obj);
                    str = str2;
                    z5 = z6;
                }
                iNotificationRepository = notificationOpenedProcessor._dataController;
                intExtra = intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0);
                clearGroupOnSummaryClick = notificationOpenedProcessor._configModelStore.getModel().getClearGroupOnSummaryClick();
                notificationOpenedProcessor$markNotificationsConsumed$12.L$0 = null;
                notificationOpenedProcessor$markNotificationsConsumed$12.L$1 = null;
                notificationOpenedProcessor$markNotificationsConsumed$12.L$2 = null;
                notificationOpenedProcessor$markNotificationsConsumed$12.label = 2;
                if (iNotificationRepository.markAsConsumed(intExtra, z5, str, clearGroupOnSummaryClick, notificationOpenedProcessor$markNotificationsConsumed$12) == enumC1260a) {
                    return enumC1260a;
                }
                return v.f5689a;
            }
        }
        notificationOpenedProcessor$markNotificationsConsumed$1 = new NotificationOpenedProcessor$markNotificationsConsumed$1(this, interfaceC1218d);
        notificationOpenedProcessor$markNotificationsConsumed$12 = notificationOpenedProcessor$markNotificationsConsumed$1;
        Object obj2 = notificationOpenedProcessor$markNotificationsConsumed$12.result;
        enumC1260a = EnumC1260a.f11058a;
        i2 = notificationOpenedProcessor$markNotificationsConsumed$12.label;
        if (i2 != 0) {
        }
        iNotificationRepository = notificationOpenedProcessor._dataController;
        intExtra = intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0);
        clearGroupOnSummaryClick = notificationOpenedProcessor._configModelStore.getModel().getClearGroupOnSummaryClick();
        notificationOpenedProcessor$markNotificationsConsumed$12.L$0 = null;
        notificationOpenedProcessor$markNotificationsConsumed$12.L$1 = null;
        notificationOpenedProcessor$markNotificationsConsumed$12.L$2 = null;
        notificationOpenedProcessor$markNotificationsConsumed$12.label = 2;
        if (iNotificationRepository.markAsConsumed(intExtra, z5, str, clearGroupOnSummaryClick, notificationOpenedProcessor$markNotificationsConsumed$12) == enumC1260a) {
        }
        return v.f5689a;
    }

    private final ContentValues newContentValuesWithConsumed(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, false)) {
            contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, (Integer) 1);
        } else {
            contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, (Integer) 1);
        }
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processIntent(Context context, Intent intent, InterfaceC1218d interfaceC1218d) {
        NotificationOpenedProcessor$processIntent$1 notificationOpenedProcessor$processIntent$1;
        EnumC1260a enumC1260a;
        int i2;
        String stringExtra;
        boolean booleanExtra;
        NotificationOpenedProcessor notificationOpenedProcessor;
        NotificationIntentExtras notificationIntentExtras;
        Object processToOpenIntent;
        NotificationOpenedProcessor notificationOpenedProcessor2;
        Context context2;
        boolean z;
        String str;
        Intent intent2;
        NotificationIntentExtras notificationIntentExtras2;
        String stringExtra2;
        INotificationSummaryManager iNotificationSummaryManager;
        Intent intent3;
        Context context3;
        NotificationOpenedProcessor notificationOpenedProcessor3;
        if (interfaceC1218d instanceof NotificationOpenedProcessor$processIntent$1) {
            notificationOpenedProcessor$processIntent$1 = (NotificationOpenedProcessor$processIntent$1) interfaceC1218d;
            int i3 = notificationOpenedProcessor$processIntent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationOpenedProcessor$processIntent$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationOpenedProcessor$processIntent$1.result;
                enumC1260a = EnumC1260a.f11058a;
                i2 = notificationOpenedProcessor$processIntent$1.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    stringExtra = intent.getStringExtra("summary");
                    booleanExtra = intent.getBooleanExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, false);
                    if (booleanExtra) {
                        notificationOpenedProcessor = this;
                        notificationIntentExtras = null;
                        notificationOpenedProcessor$processIntent$1.L$0 = notificationOpenedProcessor;
                        notificationOpenedProcessor$processIntent$1.L$1 = context;
                        notificationOpenedProcessor$processIntent$1.L$2 = intent;
                        notificationOpenedProcessor$processIntent$1.L$3 = stringExtra;
                        notificationOpenedProcessor$processIntent$1.L$4 = notificationIntentExtras;
                        notificationOpenedProcessor$processIntent$1.Z$0 = booleanExtra;
                        notificationOpenedProcessor$processIntent$1.label = 2;
                        if (notificationOpenedProcessor.markNotificationsConsumed(context, intent, booleanExtra, notificationOpenedProcessor$processIntent$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        notificationOpenedProcessor2 = notificationOpenedProcessor;
                        context2 = context;
                        z = booleanExtra;
                        str = stringExtra;
                        NotificationIntentExtras notificationIntentExtras3 = notificationIntentExtras;
                        intent2 = intent;
                        notificationIntentExtras2 = notificationIntentExtras3;
                        if (str == null) {
                            iNotificationSummaryManager = notificationOpenedProcessor2._summaryManager;
                            notificationOpenedProcessor$processIntent$1.L$0 = notificationOpenedProcessor2;
                            notificationOpenedProcessor$processIntent$1.L$1 = context2;
                            notificationOpenedProcessor$processIntent$1.L$2 = intent2;
                            notificationOpenedProcessor$processIntent$1.L$3 = notificationIntentExtras2;
                            notificationOpenedProcessor$processIntent$1.L$4 = null;
                            notificationOpenedProcessor$processIntent$1.Z$0 = z;
                            notificationOpenedProcessor$processIntent$1.label = 3;
                            if (iNotificationSummaryManager.updateSummaryNotificationAfterChildRemoved(stringExtra2, z, notificationOpenedProcessor$processIntent$1) != enumC1260a) {
                            }
                        }
                        Logging.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                        }
                        if (!z) {
                        }
                        return vVar;
                    }
                    notificationOpenedProcessor$processIntent$1.L$0 = this;
                    notificationOpenedProcessor$processIntent$1.L$1 = context;
                    notificationOpenedProcessor$processIntent$1.L$2 = intent;
                    notificationOpenedProcessor$processIntent$1.L$3 = stringExtra;
                    notificationOpenedProcessor$processIntent$1.Z$0 = booleanExtra;
                    notificationOpenedProcessor$processIntent$1.label = 1;
                    processToOpenIntent = processToOpenIntent(context, intent, stringExtra, notificationOpenedProcessor$processIntent$1);
                    if (processToOpenIntent == enumC1260a) {
                        return enumC1260a;
                    }
                    notificationOpenedProcessor = this;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            z = notificationOpenedProcessor$processIntent$1.Z$0;
                            notificationIntentExtras2 = (NotificationIntentExtras) notificationOpenedProcessor$processIntent$1.L$4;
                            str = (String) notificationOpenedProcessor$processIntent$1.L$3;
                            intent2 = (Intent) notificationOpenedProcessor$processIntent$1.L$2;
                            context2 = (Context) notificationOpenedProcessor$processIntent$1.L$1;
                            notificationOpenedProcessor2 = (NotificationOpenedProcessor) notificationOpenedProcessor$processIntent$1.L$0;
                            g.y(obj);
                            if (str == null && (stringExtra2 = intent2.getStringExtra("grp")) != null) {
                                iNotificationSummaryManager = notificationOpenedProcessor2._summaryManager;
                                notificationOpenedProcessor$processIntent$1.L$0 = notificationOpenedProcessor2;
                                notificationOpenedProcessor$processIntent$1.L$1 = context2;
                                notificationOpenedProcessor$processIntent$1.L$2 = intent2;
                                notificationOpenedProcessor$processIntent$1.L$3 = notificationIntentExtras2;
                                notificationOpenedProcessor$processIntent$1.L$4 = null;
                                notificationOpenedProcessor$processIntent$1.Z$0 = z;
                                notificationOpenedProcessor$processIntent$1.label = 3;
                                if (iNotificationSummaryManager.updateSummaryNotificationAfterChildRemoved(stringExtra2, z, notificationOpenedProcessor$processIntent$1) != enumC1260a) {
                                    return enumC1260a;
                                }
                                intent3 = intent2;
                                context3 = context2;
                                notificationOpenedProcessor3 = notificationOpenedProcessor2;
                                context2 = context3;
                                notificationOpenedProcessor2 = notificationOpenedProcessor3;
                                intent2 = intent3;
                            }
                            Logging.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                            if (intent2.getExtras() != null) {
                            }
                            if (!z) {
                            }
                            return vVar;
                        }
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            g.y(obj);
                            return vVar;
                        }
                        z = notificationOpenedProcessor$processIntent$1.Z$0;
                        notificationIntentExtras2 = (NotificationIntentExtras) notificationOpenedProcessor$processIntent$1.L$3;
                        intent3 = (Intent) notificationOpenedProcessor$processIntent$1.L$2;
                        context3 = (Context) notificationOpenedProcessor$processIntent$1.L$1;
                        notificationOpenedProcessor3 = (NotificationOpenedProcessor) notificationOpenedProcessor$processIntent$1.L$0;
                        g.y(obj);
                        context2 = context3;
                        notificationOpenedProcessor2 = notificationOpenedProcessor3;
                        intent2 = intent3;
                        Logging.debug$default("processIntent from context: " + context2 + " and intent: " + intent2, null, 2, null);
                        if (intent2.getExtras() != null) {
                            Logging.debug$default("processIntent intent extras: " + intent2.getExtras(), null, 2, null);
                        }
                        if (!z) {
                            if (context2 instanceof Activity) {
                                i.b(notificationIntentExtras2);
                                JSONArray dataArray = notificationIntentExtras2.getDataArray();
                                notificationOpenedProcessor$processIntent$1.L$0 = null;
                                notificationOpenedProcessor$processIntent$1.L$1 = null;
                                notificationOpenedProcessor$processIntent$1.L$2 = null;
                                notificationOpenedProcessor$processIntent$1.L$3 = null;
                                notificationOpenedProcessor$processIntent$1.L$4 = null;
                                notificationOpenedProcessor$processIntent$1.label = 4;
                                if (notificationOpenedProcessor2._lifecycleService.notificationOpened((Activity) context2, dataArray, notificationOpenedProcessor$processIntent$1) == enumC1260a) {
                                    return enumC1260a;
                                }
                            } else {
                                Logging.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context2, null, 2, null);
                            }
                        }
                        return vVar;
                    }
                    boolean z5 = notificationOpenedProcessor$processIntent$1.Z$0;
                    String str2 = (String) notificationOpenedProcessor$processIntent$1.L$3;
                    Intent intent4 = (Intent) notificationOpenedProcessor$processIntent$1.L$2;
                    Context context4 = (Context) notificationOpenedProcessor$processIntent$1.L$1;
                    notificationOpenedProcessor = (NotificationOpenedProcessor) notificationOpenedProcessor$processIntent$1.L$0;
                    g.y(obj);
                    booleanExtra = z5;
                    context = context4;
                    processToOpenIntent = obj;
                    stringExtra = str2;
                    intent = intent4;
                }
                notificationIntentExtras = (NotificationIntentExtras) processToOpenIntent;
                if (notificationIntentExtras == null) {
                    return vVar;
                }
                notificationOpenedProcessor$processIntent$1.L$0 = notificationOpenedProcessor;
                notificationOpenedProcessor$processIntent$1.L$1 = context;
                notificationOpenedProcessor$processIntent$1.L$2 = intent;
                notificationOpenedProcessor$processIntent$1.L$3 = stringExtra;
                notificationOpenedProcessor$processIntent$1.L$4 = notificationIntentExtras;
                notificationOpenedProcessor$processIntent$1.Z$0 = booleanExtra;
                notificationOpenedProcessor$processIntent$1.label = 2;
                if (notificationOpenedProcessor.markNotificationsConsumed(context, intent, booleanExtra, notificationOpenedProcessor$processIntent$1) == enumC1260a) {
                }
            }
        }
        notificationOpenedProcessor$processIntent$1 = new NotificationOpenedProcessor$processIntent$1(this, interfaceC1218d);
        Object obj2 = notificationOpenedProcessor$processIntent$1.result;
        enumC1260a = EnumC1260a.f11058a;
        i2 = notificationOpenedProcessor$processIntent$1.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        notificationIntentExtras = (NotificationIntentExtras) processToOpenIntent;
        if (notificationIntentExtras == null) {
        }
        notificationOpenedProcessor$processIntent$1.L$0 = notificationOpenedProcessor;
        notificationOpenedProcessor$processIntent$1.L$1 = context;
        notificationOpenedProcessor$processIntent$1.L$2 = intent;
        notificationOpenedProcessor$processIntent$1.L$3 = stringExtra;
        notificationOpenedProcessor$processIntent$1.L$4 = notificationIntentExtras;
        notificationOpenedProcessor$processIntent$1.Z$0 = booleanExtra;
        notificationOpenedProcessor$processIntent$1.label = 2;
        if (notificationOpenedProcessor.markNotificationsConsumed(context, intent, booleanExtra, notificationOpenedProcessor$processIntent$1) == enumC1260a) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processToOpenIntent(Context context, Intent intent, String str, InterfaceC1218d interfaceC1218d) {
        NotificationOpenedProcessor$processToOpenIntent$1 notificationOpenedProcessor$processToOpenIntent$1;
        Object obj;
        int i2;
        NotificationOpenedProcessor notificationOpenedProcessor;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        if (interfaceC1218d instanceof NotificationOpenedProcessor$processToOpenIntent$1) {
            notificationOpenedProcessor$processToOpenIntent$1 = (NotificationOpenedProcessor$processToOpenIntent$1) interfaceC1218d;
            int i3 = notificationOpenedProcessor$processToOpenIntent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationOpenedProcessor$processToOpenIntent$1.label = i3 - Integer.MIN_VALUE;
                obj = notificationOpenedProcessor$processToOpenIntent$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationOpenedProcessor$processToOpenIntent$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    try {
                        jSONObject2 = new JSONObject(intent.getStringExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA));
                    } catch (JSONException e3) {
                        e = e3;
                        notificationOpenedProcessor = this;
                        jSONObject = null;
                    }
                    try {
                    } catch (JSONException e6) {
                        e = e6;
                        notificationOpenedProcessor = this;
                        jSONObject = jSONObject2;
                        e.printStackTrace();
                        jSONArray = null;
                        if (str != null) {
                        }
                        i.b(jSONArray);
                        i.b(jSONObject);
                        return new NotificationIntentExtras(jSONArray, jSONObject);
                    }
                    if (!(context instanceof Activity)) {
                        Logging.error$default("NotificationOpenedProcessor processIntent from an non Activity context: " + context, null, 2, null);
                        notificationOpenedProcessor = this;
                        jSONObject = jSONObject2;
                        jSONObject.put(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0));
                        intent.putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString());
                        jSONArray = JSONUtils.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA)));
                        if (str != null) {
                            i.b(jSONArray);
                            notificationOpenedProcessor$processToOpenIntent$1.L$0 = jSONArray;
                            notificationOpenedProcessor$processToOpenIntent$1.L$1 = jSONObject;
                            notificationOpenedProcessor$processToOpenIntent$1.L$2 = null;
                            notificationOpenedProcessor$processToOpenIntent$1.L$3 = null;
                            notificationOpenedProcessor$processToOpenIntent$1.label = 2;
                            if (notificationOpenedProcessor.addChildNotifications(jSONArray, str, notificationOpenedProcessor$processToOpenIntent$1) == enumC1260a) {
                                return enumC1260a;
                            }
                        }
                        i.b(jSONArray);
                        i.b(jSONObject);
                        return new NotificationIntentExtras(jSONArray, jSONObject);
                    }
                    notificationOpenedProcessor$processToOpenIntent$1.L$0 = this;
                    notificationOpenedProcessor$processToOpenIntent$1.L$1 = intent;
                    notificationOpenedProcessor$processToOpenIntent$1.L$2 = str;
                    notificationOpenedProcessor$processToOpenIntent$1.L$3 = jSONObject2;
                    notificationOpenedProcessor$processToOpenIntent$1.label = 1;
                    Object canOpenNotification = this._lifecycleService.canOpenNotification((Activity) context, jSONObject2, notificationOpenedProcessor$processToOpenIntent$1);
                    if (canOpenNotification == enumC1260a) {
                        return enumC1260a;
                    }
                    notificationOpenedProcessor = this;
                    obj = canOpenNotification;
                    jSONObject = jSONObject2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jSONObject = (JSONObject) notificationOpenedProcessor$processToOpenIntent$1.L$1;
                        jSONArray = (JSONArray) notificationOpenedProcessor$processToOpenIntent$1.L$0;
                        g.y(obj);
                        i.b(jSONArray);
                        i.b(jSONObject);
                        return new NotificationIntentExtras(jSONArray, jSONObject);
                    }
                    jSONObject = (JSONObject) notificationOpenedProcessor$processToOpenIntent$1.L$3;
                    str = (String) notificationOpenedProcessor$processToOpenIntent$1.L$2;
                    intent = (Intent) notificationOpenedProcessor$processToOpenIntent$1.L$1;
                    notificationOpenedProcessor = (NotificationOpenedProcessor) notificationOpenedProcessor$processToOpenIntent$1.L$0;
                    try {
                        g.y(obj);
                    } catch (JSONException e7) {
                        e = e7;
                        e.printStackTrace();
                        jSONArray = null;
                        if (str != null) {
                        }
                        i.b(jSONArray);
                        i.b(jSONObject);
                        return new NotificationIntentExtras(jSONArray, jSONObject);
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                jSONObject.put(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0));
                intent.putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString());
                jSONArray = JSONUtils.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA)));
                if (str != null) {
                }
                i.b(jSONArray);
                i.b(jSONObject);
                return new NotificationIntentExtras(jSONArray, jSONObject);
            }
        }
        notificationOpenedProcessor$processToOpenIntent$1 = new NotificationOpenedProcessor$processToOpenIntent$1(this, interfaceC1218d);
        obj = notificationOpenedProcessor$processToOpenIntent$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationOpenedProcessor$processToOpenIntent$1.label;
        if (i2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        jSONObject.put(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, 0));
        intent.putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString());
        jSONArray = JSONUtils.INSTANCE.wrapInJsonArray(new JSONObject(intent.getStringExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA)));
        if (str != null) {
        }
        i.b(jSONArray);
        i.b(jSONObject);
        return new NotificationIntentExtras(jSONArray, jSONObject);
    }

    @Override // com.onesignal.notifications.internal.open.INotificationOpenedProcessor
    public Object processFromContext(Context context, Intent intent, InterfaceC1218d interfaceC1218d) {
        boolean isOneSignalIntent = isOneSignalIntent(intent);
        v vVar = v.f5689a;
        if (!isOneSignalIntent) {
            return vVar;
        }
        handleDismissFromActionButtonPress(context, intent);
        Object processIntent = processIntent(context, intent, interfaceC1218d);
        return processIntent == EnumC1260a.f11058a ? processIntent : vVar;
    }
}
