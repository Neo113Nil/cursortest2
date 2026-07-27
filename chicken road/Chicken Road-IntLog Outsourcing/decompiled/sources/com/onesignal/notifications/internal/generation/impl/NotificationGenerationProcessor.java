package com.onesignal.notifications.internal.generation.impl;

import D4.AbstractC0024y;
import D4.r0;
import android.content.Context;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.Notification;
import com.onesignal.notifications.internal.NotificationReceivedEvent;
import com.onesignal.notifications.internal.NotificationWillDisplayEvent;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.display.INotificationDisplayer;
import com.onesignal.notifications.internal.generation.INotificationGenerationProcessor;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import e5.g;
import f4.v;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;
import l4.EnumC1260a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NotificationGenerationProcessor implements INotificationGenerationProcessor {
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final INotificationRepository _dataController;
    private final INotificationLifecycleService _lifecycleService;
    private final INotificationDisplayer _notificationDisplayer;
    private final INotificationSummaryManager _notificationSummaryManager;
    private final ITime _time;

    public NotificationGenerationProcessor(IApplicationService _applicationService, INotificationDisplayer _notificationDisplayer, ConfigModelStore _configModelStore, INotificationRepository _dataController, INotificationSummaryManager _notificationSummaryManager, INotificationLifecycleService _lifecycleService, ITime _time) {
        i.e(_applicationService, "_applicationService");
        i.e(_notificationDisplayer, "_notificationDisplayer");
        i.e(_configModelStore, "_configModelStore");
        i.e(_dataController, "_dataController");
        i.e(_notificationSummaryManager, "_notificationSummaryManager");
        i.e(_lifecycleService, "_lifecycleService");
        i.e(_time, "_time");
        this._applicationService = _applicationService;
        this._notificationDisplayer = _notificationDisplayer;
        this._configModelStore = _configModelStore;
        this._dataController = _dataController;
        this._notificationSummaryManager = _notificationSummaryManager;
        this._lifecycleService = _lifecycleService;
        this._time = _time;
    }

    private final long getEXTERNAL_CALLBACKS_TIMEOUT() {
        return 30000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isDuplicateNotification(Notification notification, InterfaceC1218d interfaceC1218d) {
        return this._dataController.doesNotificationExist(notification.getNotificationId(), interfaceC1218d);
    }

    private final boolean isNotificationWithinTTL(Notification notification) {
        if (this._configModelStore.getModel().getRestoreTTLFilter()) {
            return notification.getSentTime() + ((long) notification.getTtl()) > this._time.getCurrentTimeMillis() / ((long) AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markNotificationAsDismissed(NotificationGenerationJob notificationGenerationJob, InterfaceC1218d interfaceC1218d) {
        NotificationGenerationProcessor$markNotificationAsDismissed$1 notificationGenerationProcessor$markNotificationAsDismissed$1;
        Object obj;
        int i2;
        NotificationGenerationProcessor notificationGenerationProcessor;
        if (interfaceC1218d instanceof NotificationGenerationProcessor$markNotificationAsDismissed$1) {
            notificationGenerationProcessor$markNotificationAsDismissed$1 = (NotificationGenerationProcessor$markNotificationAsDismissed$1) interfaceC1218d;
            int i3 = notificationGenerationProcessor$markNotificationAsDismissed$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationGenerationProcessor$markNotificationAsDismissed$1.label = i3 - Integer.MIN_VALUE;
                obj = notificationGenerationProcessor$markNotificationAsDismissed$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationGenerationProcessor$markNotificationAsDismissed$1.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    if (!notificationGenerationJob.isNotificationToDisplay()) {
                        return vVar;
                    }
                    Logging.debug$default("Marking restored or disabled notifications as dismissed: " + notificationGenerationJob, null, 2, null);
                    INotificationRepository iNotificationRepository = this._dataController;
                    int androidId = notificationGenerationJob.getAndroidId();
                    notificationGenerationProcessor$markNotificationAsDismissed$1.L$0 = this;
                    notificationGenerationProcessor$markNotificationAsDismissed$1.L$1 = notificationGenerationJob;
                    notificationGenerationProcessor$markNotificationAsDismissed$1.label = 1;
                    obj = iNotificationRepository.markAsDismissed(androidId, notificationGenerationProcessor$markNotificationAsDismissed$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    notificationGenerationProcessor = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.y(obj);
                        return vVar;
                    }
                    notificationGenerationJob = (NotificationGenerationJob) notificationGenerationProcessor$markNotificationAsDismissed$1.L$1;
                    notificationGenerationProcessor = (NotificationGenerationProcessor) notificationGenerationProcessor$markNotificationAsDismissed$1.L$0;
                    g.y(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    INotificationSummaryManager iNotificationSummaryManager = notificationGenerationProcessor._notificationSummaryManager;
                    int androidId2 = notificationGenerationJob.getAndroidId();
                    notificationGenerationProcessor$markNotificationAsDismissed$1.L$0 = null;
                    notificationGenerationProcessor$markNotificationAsDismissed$1.L$1 = null;
                    notificationGenerationProcessor$markNotificationAsDismissed$1.label = 2;
                    if (iNotificationSummaryManager.updatePossibleDependentSummaryOnDismiss(androidId2, notificationGenerationProcessor$markNotificationAsDismissed$1) == enumC1260a) {
                        return enumC1260a;
                    }
                }
                return vVar;
            }
        }
        notificationGenerationProcessor$markNotificationAsDismissed$1 = new NotificationGenerationProcessor$markNotificationAsDismissed$1(this, interfaceC1218d);
        obj = notificationGenerationProcessor$markNotificationAsDismissed$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationGenerationProcessor$markNotificationAsDismissed$1.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postProcessNotification(NotificationGenerationJob notificationGenerationJob, boolean z, boolean z5, InterfaceC1218d interfaceC1218d) {
        NotificationGenerationProcessor$postProcessNotification$1 notificationGenerationProcessor$postProcessNotification$1;
        EnumC1260a enumC1260a;
        int i2;
        NotificationGenerationProcessor notificationGenerationProcessor;
        INotificationLifecycleService iNotificationLifecycleService;
        if (interfaceC1218d instanceof NotificationGenerationProcessor$postProcessNotification$1) {
            notificationGenerationProcessor$postProcessNotification$1 = (NotificationGenerationProcessor$postProcessNotification$1) interfaceC1218d;
            int i3 = notificationGenerationProcessor$postProcessNotification$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationGenerationProcessor$postProcessNotification$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationGenerationProcessor$postProcessNotification$1.result;
                enumC1260a = EnumC1260a.f11058a;
                i2 = notificationGenerationProcessor$postProcessNotification$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    notificationGenerationProcessor$postProcessNotification$1.L$0 = this;
                    notificationGenerationProcessor$postProcessNotification$1.L$1 = notificationGenerationJob;
                    notificationGenerationProcessor$postProcessNotification$1.Z$0 = z5;
                    notificationGenerationProcessor$postProcessNotification$1.label = 1;
                    if (saveNotification(notificationGenerationJob, z, notificationGenerationProcessor$postProcessNotification$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    notificationGenerationProcessor = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            g.y(obj);
                            return v.f5689a;
                        }
                        notificationGenerationJob = (NotificationGenerationJob) notificationGenerationProcessor$postProcessNotification$1.L$1;
                        notificationGenerationProcessor = (NotificationGenerationProcessor) notificationGenerationProcessor$postProcessNotification$1.L$0;
                        g.y(obj);
                        iNotificationLifecycleService = notificationGenerationProcessor._lifecycleService;
                        notificationGenerationProcessor$postProcessNotification$1.L$0 = null;
                        notificationGenerationProcessor$postProcessNotification$1.L$1 = null;
                        notificationGenerationProcessor$postProcessNotification$1.label = 3;
                        if (iNotificationLifecycleService.notificationReceived(notificationGenerationJob, notificationGenerationProcessor$postProcessNotification$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        return v.f5689a;
                    }
                    z5 = notificationGenerationProcessor$postProcessNotification$1.Z$0;
                    notificationGenerationJob = (NotificationGenerationJob) notificationGenerationProcessor$postProcessNotification$1.L$1;
                    notificationGenerationProcessor = (NotificationGenerationProcessor) notificationGenerationProcessor$postProcessNotification$1.L$0;
                    g.y(obj);
                }
                if (!z5) {
                    notificationGenerationProcessor$postProcessNotification$1.L$0 = notificationGenerationProcessor;
                    notificationGenerationProcessor$postProcessNotification$1.L$1 = notificationGenerationJob;
                    notificationGenerationProcessor$postProcessNotification$1.label = 2;
                    if (notificationGenerationProcessor.markNotificationAsDismissed(notificationGenerationJob, notificationGenerationProcessor$postProcessNotification$1) == enumC1260a) {
                        return enumC1260a;
                    }
                }
                iNotificationLifecycleService = notificationGenerationProcessor._lifecycleService;
                notificationGenerationProcessor$postProcessNotification$1.L$0 = null;
                notificationGenerationProcessor$postProcessNotification$1.L$1 = null;
                notificationGenerationProcessor$postProcessNotification$1.label = 3;
                if (iNotificationLifecycleService.notificationReceived(notificationGenerationJob, notificationGenerationProcessor$postProcessNotification$1) == enumC1260a) {
                }
                return v.f5689a;
            }
        }
        notificationGenerationProcessor$postProcessNotification$1 = new NotificationGenerationProcessor$postProcessNotification$1(this, interfaceC1218d);
        Object obj2 = notificationGenerationProcessor$postProcessNotification$1.result;
        enumC1260a = EnumC1260a.f11058a;
        i2 = notificationGenerationProcessor$postProcessNotification$1.label;
        if (i2 != 0) {
        }
        if (!z5) {
        }
        iNotificationLifecycleService = notificationGenerationProcessor._lifecycleService;
        notificationGenerationProcessor$postProcessNotification$1.L$0 = null;
        notificationGenerationProcessor$postProcessNotification$1.L$1 = null;
        notificationGenerationProcessor$postProcessNotification$1.label = 3;
        if (iNotificationLifecycleService.notificationReceived(notificationGenerationJob, notificationGenerationProcessor$postProcessNotification$1) == enumC1260a) {
        }
        return v.f5689a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processCollapseKey(NotificationGenerationJob notificationGenerationJob, InterfaceC1218d interfaceC1218d) {
        NotificationGenerationProcessor$processCollapseKey$1 notificationGenerationProcessor$processCollapseKey$1;
        int i2;
        Integer num;
        if (interfaceC1218d instanceof NotificationGenerationProcessor$processCollapseKey$1) {
            notificationGenerationProcessor$processCollapseKey$1 = (NotificationGenerationProcessor$processCollapseKey$1) interfaceC1218d;
            int i3 = notificationGenerationProcessor$processCollapseKey$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationGenerationProcessor$processCollapseKey$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationGenerationProcessor$processCollapseKey$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationGenerationProcessor$processCollapseKey$1.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    if (notificationGenerationJob.isRestoring()) {
                        return vVar;
                    }
                    if (notificationGenerationJob.getJsonPayload().has("collapse_key") && !"do_not_collapse".equals(notificationGenerationJob.getJsonPayload().optString("collapse_key"))) {
                        String optString = notificationGenerationJob.getJsonPayload().optString("collapse_key");
                        INotificationRepository iNotificationRepository = this._dataController;
                        i.b(optString);
                        notificationGenerationProcessor$processCollapseKey$1.L$0 = notificationGenerationJob;
                        notificationGenerationProcessor$processCollapseKey$1.label = 1;
                        obj = iNotificationRepository.getAndroidIdFromCollapseKey(optString, notificationGenerationProcessor$processCollapseKey$1);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                    }
                    return vVar;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                notificationGenerationJob = (NotificationGenerationJob) notificationGenerationProcessor$processCollapseKey$1.L$0;
                g.y(obj);
                num = (Integer) obj;
                if (num != null) {
                    notificationGenerationJob.getNotification().setAndroidNotificationId(num.intValue());
                }
                return vVar;
            }
        }
        notificationGenerationProcessor$processCollapseKey$1 = new NotificationGenerationProcessor$processCollapseKey$1(this, interfaceC1218d);
        Object obj2 = notificationGenerationProcessor$processCollapseKey$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationGenerationProcessor$processCollapseKey$1.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        num = (Integer) obj2;
        if (num != null) {
        }
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processHandlerResponse(NotificationGenerationJob notificationGenerationJob, boolean z, boolean z5, InterfaceC1218d interfaceC1218d) {
        NotificationGenerationProcessor$processHandlerResponse$1 notificationGenerationProcessor$processHandlerResponse$1;
        int i2;
        NotificationGenerationProcessor notificationGenerationProcessor;
        if (interfaceC1218d instanceof NotificationGenerationProcessor$processHandlerResponse$1) {
            notificationGenerationProcessor$processHandlerResponse$1 = (NotificationGenerationProcessor$processHandlerResponse$1) interfaceC1218d;
            int i3 = notificationGenerationProcessor$processHandlerResponse$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationGenerationProcessor$processHandlerResponse$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationGenerationProcessor$processHandlerResponse$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationGenerationProcessor$processHandlerResponse$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    if (z) {
                        boolean isStringNotEmpty = AndroidUtils.INSTANCE.isStringNotEmpty(notificationGenerationJob.getNotification().getBody());
                        boolean isNotificationWithinTTL = isNotificationWithinTTL(notificationGenerationJob.getNotification());
                        if (isStringNotEmpty && isNotificationWithinTTL) {
                            notificationGenerationProcessor$processHandlerResponse$1.L$0 = this;
                            notificationGenerationProcessor$processHandlerResponse$1.L$1 = notificationGenerationJob;
                            notificationGenerationProcessor$processHandlerResponse$1.label = 1;
                            if (processCollapseKey(notificationGenerationJob, notificationGenerationProcessor$processHandlerResponse$1) == enumC1260a) {
                                return enumC1260a;
                            }
                            notificationGenerationProcessor = this;
                        }
                    }
                    if (z5) {
                        notificationGenerationProcessor$processHandlerResponse$1.label = 2;
                        if (markNotificationAsDismissed(notificationGenerationJob, notificationGenerationProcessor$processHandlerResponse$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        return null;
                    }
                    notificationGenerationJob.setNotificationToDisplay(false);
                    notificationGenerationProcessor$processHandlerResponse$1.label = 3;
                    if (postProcessNotification(notificationGenerationJob, true, false, notificationGenerationProcessor$processHandlerResponse$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    return null;
                }
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                    return null;
                }
                notificationGenerationJob = (NotificationGenerationJob) notificationGenerationProcessor$processHandlerResponse$1.L$1;
                notificationGenerationProcessor = (NotificationGenerationProcessor) notificationGenerationProcessor$processHandlerResponse$1.L$0;
                g.y(obj);
                if (notificationGenerationProcessor.shouldDisplayNotification(notificationGenerationJob)) {
                    return Boolean.FALSE;
                }
                notificationGenerationJob.setNotificationToDisplay(true);
                return Boolean.TRUE;
            }
        }
        notificationGenerationProcessor$processHandlerResponse$1 = new NotificationGenerationProcessor$processHandlerResponse$1(this, interfaceC1218d);
        Object obj2 = notificationGenerationProcessor$processHandlerResponse$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationGenerationProcessor$processHandlerResponse$1.label;
        if (i2 != 0) {
        }
        if (notificationGenerationProcessor.shouldDisplayNotification(notificationGenerationJob)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(9:16|17|(1:33)(1:21)|22|(1:24)(1:32)|25|(1:27)(1:31)|28|(1:30))|11|12))|36|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveNotification(NotificationGenerationJob notificationGenerationJob, boolean z, InterfaceC1218d interfaceC1218d) {
        NotificationGenerationProcessor$saveNotification$1 notificationGenerationProcessor$saveNotification$1;
        int i2;
        if (interfaceC1218d instanceof NotificationGenerationProcessor$saveNotification$1) {
            notificationGenerationProcessor$saveNotification$1 = (NotificationGenerationProcessor$saveNotification$1) interfaceC1218d;
            int i3 = notificationGenerationProcessor$saveNotification$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationGenerationProcessor$saveNotification$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationGenerationProcessor$saveNotification$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationGenerationProcessor$saveNotification$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    Logging.debug$default("Saving Notification job: " + notificationGenerationJob, null, 2, null);
                    JSONObject jsonPayload = notificationGenerationJob.getJsonPayload();
                    JSONObject customJSONObject = getCustomJSONObject(jsonPayload);
                    String optString = (!jsonPayload.has("collapse_key") || "do_not_collapse".equals(jsonPayload.optString("collapse_key"))) ? null : jsonPayload.optString("collapse_key");
                    long optLong = (jsonPayload.optLong(NotificationConstants.GOOGLE_SENT_TIME_KEY, this._time.getCurrentTimeMillis()) / 1000) + jsonPayload.optInt(NotificationConstants.GOOGLE_TTL_KEY, 259200);
                    INotificationRepository iNotificationRepository = this._dataController;
                    String optString2 = customJSONObject.optString("i");
                    i.d(optString2, "optString(...)");
                    String safeString = JSONObjectExtensionsKt.safeString(jsonPayload, "grp");
                    boolean isNotificationToDisplay = notificationGenerationJob.isNotificationToDisplay();
                    int androidId = notificationGenerationJob.getAndroidId();
                    String valueOf = notificationGenerationJob.getTitle() != null ? String.valueOf(notificationGenerationJob.getTitle()) : null;
                    String valueOf2 = notificationGenerationJob.getBody() != null ? String.valueOf(notificationGenerationJob.getBody()) : null;
                    String jSONObject = jsonPayload.toString();
                    i.d(jSONObject, "toString(...)");
                    notificationGenerationProcessor$saveNotification$1.label = 1;
                    if (iNotificationRepository.createNotification(optString2, safeString, optString, isNotificationToDisplay, z, androidId, valueOf, valueOf2, optLong, jSONObject, notificationGenerationProcessor$saveNotification$1) == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                return v.f5689a;
            }
        }
        notificationGenerationProcessor$saveNotification$1 = new NotificationGenerationProcessor$saveNotification$1(this, interfaceC1218d);
        Object obj2 = notificationGenerationProcessor$saveNotification$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationGenerationProcessor$saveNotification$1.label;
        if (i2 != 0) {
        }
        return v.f5689a;
    }

    private final boolean shouldDisplayNotification(NotificationGenerationJob notificationGenerationJob) {
        return notificationGenerationJob.hasExtender() || AndroidUtils.INSTANCE.isStringNotEmpty(notificationGenerationJob.getJsonPayload().optString("alert"));
    }

    private final boolean shouldFireForegroundHandlers(NotificationGenerationJob notificationGenerationJob) {
        if (!this._applicationService.isInForeground()) {
            Logging.info$default("App is in background, show notification", null, 2, null);
            return false;
        }
        if (!notificationGenerationJob.isRestoring()) {
            return true;
        }
        Logging.info$default("Not firing notificationWillShowInForegroundHandler for restored notifications", null, 2, null);
        return false;
    }

    public final JSONObject getCustomJSONObject(JSONObject jsonObject) {
        i.e(jsonObject, "jsonObject");
        return new JSONObject(jsonObject.optString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015d  */
    @Override // com.onesignal.notifications.internal.generation.INotificationGenerationProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object processNotificationData(Context context, int i2, JSONObject jSONObject, boolean z, long j2, InterfaceC1218d interfaceC1218d) {
        NotificationGenerationProcessor$processNotificationData$1 notificationGenerationProcessor$processNotificationData$1;
        int i3;
        boolean z5;
        NotificationGenerationProcessor notificationGenerationProcessor;
        long j6;
        Object obj;
        Context context2;
        int i6;
        NotificationGenerationProcessor notificationGenerationProcessor2;
        Notification notification;
        JSONObject jSONObject2;
        boolean z6;
        long j7;
        Context context3;
        NotificationGenerationJob notificationGenerationJob;
        q qVar;
        NotificationGenerationJob notificationGenerationJob2;
        NotificationGenerationProcessor notificationGenerationProcessor3;
        Notification notification2;
        int i7;
        q qVar2;
        long external_callbacks_timeout;
        NotificationGenerationProcessor$processNotificationData$2 notificationGenerationProcessor$processNotificationData$2;
        int i8;
        Object processHandlerResponse;
        boolean z7;
        q qVar3;
        NotificationGenerationJob notificationGenerationJob3;
        Notification notification3;
        NotificationGenerationProcessor notificationGenerationProcessor4;
        int i9;
        Boolean bool;
        boolean z8;
        int i10;
        NotificationGenerationJob notificationGenerationJob4;
        NotificationGenerationProcessor notificationGenerationProcessor5;
        long external_callbacks_timeout2;
        NotificationGenerationProcessor$processNotificationData$3 notificationGenerationProcessor$processNotificationData$3;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        NotificationGenerationProcessor notificationGenerationProcessor6;
        Object processHandlerResponse2;
        int i15;
        boolean z10;
        NotificationGenerationJob notificationGenerationJob5;
        Object obj2;
        Boolean bool2;
        int i16;
        Object obj3;
        boolean z11;
        JSONObject jSONObject3 = jSONObject;
        if (interfaceC1218d instanceof NotificationGenerationProcessor$processNotificationData$1) {
            notificationGenerationProcessor$processNotificationData$1 = (NotificationGenerationProcessor$processNotificationData$1) interfaceC1218d;
            int i17 = notificationGenerationProcessor$processNotificationData$1.label;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                notificationGenerationProcessor$processNotificationData$1.label = i17 - Integer.MIN_VALUE;
                Object obj4 = notificationGenerationProcessor$processNotificationData$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i3 = notificationGenerationProcessor$processNotificationData$1.label;
                v vVar = v.f5689a;
                switch (i3) {
                    case 0:
                        g.y(obj4);
                        INotificationLifecycleService iNotificationLifecycleService = this._lifecycleService;
                        notificationGenerationProcessor$processNotificationData$1.L$0 = this;
                        notificationGenerationProcessor$processNotificationData$1.L$1 = context;
                        notificationGenerationProcessor$processNotificationData$1.L$2 = jSONObject3;
                        notificationGenerationProcessor$processNotificationData$1.I$0 = i2;
                        z5 = z;
                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z5;
                        notificationGenerationProcessor$processNotificationData$1.J$0 = j2;
                        notificationGenerationProcessor$processNotificationData$1.label = 1;
                        Object canReceiveNotification = iNotificationLifecycleService.canReceiveNotification(jSONObject3, notificationGenerationProcessor$processNotificationData$1);
                        if (canReceiveNotification == enumC1260a) {
                            return enumC1260a;
                        }
                        notificationGenerationProcessor = this;
                        j6 = j2;
                        obj = canReceiveNotification;
                        context2 = context;
                        i6 = i2;
                        if (((Boolean) obj).booleanValue()) {
                            return vVar;
                        }
                        Notification notification4 = new Notification(null, jSONObject3, i6, notificationGenerationProcessor._time);
                        if (!z5) {
                            notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor;
                            notificationGenerationProcessor$processNotificationData$1.L$1 = context2;
                            notificationGenerationProcessor$processNotificationData$1.L$2 = jSONObject3;
                            notificationGenerationProcessor$processNotificationData$1.L$3 = notification4;
                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z5;
                            notificationGenerationProcessor$processNotificationData$1.J$0 = j6;
                            notificationGenerationProcessor$processNotificationData$1.label = 2;
                            obj4 = notificationGenerationProcessor.isDuplicateNotification(notification4, notificationGenerationProcessor$processNotificationData$1);
                            if (obj4 == enumC1260a) {
                                return enumC1260a;
                            }
                            notification = notification4;
                            Context context4 = context2;
                            jSONObject2 = jSONObject3;
                            z6 = z5;
                            j7 = j6;
                            context3 = context4;
                            if (!((Boolean) obj4).booleanValue()) {
                                return vVar;
                            }
                            long j8 = j7;
                            z5 = z6;
                            notification4 = notification;
                            jSONObject3 = jSONObject2;
                            notificationGenerationProcessor2 = notificationGenerationProcessor;
                            context2 = context3;
                            j6 = j8;
                            notificationGenerationJob = new NotificationGenerationJob(notification4, jSONObject3);
                            notificationGenerationJob.setShownTimeStamp(new Long(j6));
                            notificationGenerationJob.setRestoring(z5);
                            qVar = new q();
                            qVar.f10739a = true;
                            Logging.info$default("Fire remoteNotificationReceived", null, 2, null);
                            try {
                                NotificationReceivedEvent notificationReceivedEvent = new NotificationReceivedEvent(context2, notification4);
                                external_callbacks_timeout = notificationGenerationProcessor2.getEXTERNAL_CALLBACKS_TIMEOUT();
                                notificationGenerationProcessor$processNotificationData$2 = new NotificationGenerationProcessor$processNotificationData$2(notificationGenerationProcessor2, notificationReceivedEvent, qVar, notification4, null);
                                notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor2;
                                notificationGenerationProcessor$processNotificationData$1.L$1 = notification4;
                                notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob;
                                notificationGenerationProcessor$processNotificationData$1.L$3 = qVar;
                                notificationGenerationProcessor$processNotificationData$1.Z$0 = z5;
                                notificationGenerationProcessor$processNotificationData$1.I$0 = 0;
                                notificationGenerationJob2 = notificationGenerationJob;
                            } catch (r0 e3) {
                                e = e3;
                                notificationGenerationJob2 = notificationGenerationJob;
                            } catch (Throwable th) {
                                th = th;
                                notificationGenerationJob2 = notificationGenerationJob;
                            }
                            try {
                                notificationGenerationProcessor$processNotificationData$1.label = 3;
                            } catch (r0 e6) {
                                e = e6;
                                notificationGenerationProcessor3 = notificationGenerationProcessor2;
                                notification2 = notification4;
                                i7 = 0;
                                qVar2 = qVar;
                                Logging.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + qVar2.f10739a + '.', e);
                                i8 = i7;
                                NotificationGenerationProcessor notificationGenerationProcessor7 = notificationGenerationProcessor3;
                                boolean z12 = qVar2.f10739a;
                                notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor7;
                                notificationGenerationProcessor$processNotificationData$1.L$1 = notification2;
                                notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob2;
                                notificationGenerationProcessor$processNotificationData$1.L$3 = qVar2;
                                notificationGenerationProcessor$processNotificationData$1.Z$0 = z5;
                                notificationGenerationProcessor$processNotificationData$1.I$0 = i8 == true ? 1 : 0;
                                notificationGenerationProcessor$processNotificationData$1.label = 4;
                                processHandlerResponse = notificationGenerationProcessor7.processHandlerResponse(notificationGenerationJob2, z12, z5, notificationGenerationProcessor$processNotificationData$1);
                                if (processHandlerResponse != enumC1260a) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                notificationGenerationProcessor3 = notificationGenerationProcessor2;
                                notification2 = notification4;
                                i7 = 0;
                                qVar2 = qVar;
                                Logging.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                                i8 = i7;
                                NotificationGenerationProcessor notificationGenerationProcessor72 = notificationGenerationProcessor3;
                                boolean z122 = qVar2.f10739a;
                                notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor72;
                                notificationGenerationProcessor$processNotificationData$1.L$1 = notification2;
                                notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob2;
                                notificationGenerationProcessor$processNotificationData$1.L$3 = qVar2;
                                notificationGenerationProcessor$processNotificationData$1.Z$0 = z5;
                                notificationGenerationProcessor$processNotificationData$1.I$0 = i8 == true ? 1 : 0;
                                notificationGenerationProcessor$processNotificationData$1.label = 4;
                                processHandlerResponse = notificationGenerationProcessor72.processHandlerResponse(notificationGenerationJob2, z122, z5, notificationGenerationProcessor$processNotificationData$1);
                                if (processHandlerResponse != enumC1260a) {
                                }
                            }
                            if (AbstractC0024y.x(external_callbacks_timeout, notificationGenerationProcessor$processNotificationData$2, notificationGenerationProcessor$processNotificationData$1) != enumC1260a) {
                                return enumC1260a;
                            }
                            notificationGenerationProcessor3 = notificationGenerationProcessor2;
                            notification2 = notification4;
                            i8 = 0;
                            qVar2 = qVar;
                            NotificationGenerationProcessor notificationGenerationProcessor722 = notificationGenerationProcessor3;
                            boolean z1222 = qVar2.f10739a;
                            notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor722;
                            notificationGenerationProcessor$processNotificationData$1.L$1 = notification2;
                            notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob2;
                            notificationGenerationProcessor$processNotificationData$1.L$3 = qVar2;
                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z5;
                            notificationGenerationProcessor$processNotificationData$1.I$0 = i8 == true ? 1 : 0;
                            notificationGenerationProcessor$processNotificationData$1.label = 4;
                            processHandlerResponse = notificationGenerationProcessor722.processHandlerResponse(notificationGenerationJob2, z1222, z5, notificationGenerationProcessor$processNotificationData$1);
                            if (processHandlerResponse != enumC1260a) {
                                return enumC1260a;
                            }
                            z7 = z5;
                            qVar3 = qVar2;
                            notificationGenerationJob3 = notificationGenerationJob2;
                            notification3 = notification2;
                            notificationGenerationProcessor4 = notificationGenerationProcessor722;
                            i9 = i8;
                            bool = (Boolean) processHandlerResponse;
                            if (bool != null) {
                                boolean booleanValue = bool.booleanValue();
                                if (!booleanValue) {
                                    z8 = true;
                                    i15 = i9;
                                    z10 = z7;
                                    i16 = i15;
                                    if (notificationGenerationJob3.isRestoring()) {
                                    }
                                    if (z10) {
                                    }
                                } else if (notificationGenerationProcessor4.shouldFireForegroundHandlers(notificationGenerationJob3)) {
                                    Logging.info$default("Fire notificationWillShowInForegroundHandler", null, 2, null);
                                    z8 = true;
                                    qVar3.f10739a = true;
                                    try {
                                        NotificationWillDisplayEvent notificationWillDisplayEvent = new NotificationWillDisplayEvent(notificationGenerationJob3.getNotification());
                                        external_callbacks_timeout2 = notificationGenerationProcessor4.getEXTERNAL_CALLBACKS_TIMEOUT();
                                        notificationGenerationProcessor$processNotificationData$3 = new NotificationGenerationProcessor$processNotificationData$3(notificationGenerationProcessor4, notificationWillDisplayEvent, qVar3, notification3, null);
                                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor4;
                                        notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob3;
                                        notificationGenerationProcessor$processNotificationData$1.L$2 = qVar3;
                                        notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z7;
                                        notificationGenerationProcessor$processNotificationData$1.I$0 = i9;
                                        notificationGenerationProcessor$processNotificationData$1.label = 5;
                                    } catch (r0 e7) {
                                        e = e7;
                                        notificationGenerationProcessor5 = notificationGenerationProcessor4;
                                        i12 = i9;
                                        Logging.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + qVar3.f10739a + '.', e);
                                        i13 = i12;
                                        i14 = i13;
                                        z9 = z7;
                                        notificationGenerationProcessor6 = notificationGenerationProcessor5;
                                        boolean z13 = qVar3.f10739a;
                                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor6;
                                        notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob3;
                                        notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                                        notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z9;
                                        notificationGenerationProcessor$processNotificationData$1.I$0 = i14;
                                        notificationGenerationProcessor$processNotificationData$1.label = 6;
                                        processHandlerResponse2 = notificationGenerationProcessor6.processHandlerResponse(notificationGenerationJob3, z13, z9, notificationGenerationProcessor$processNotificationData$1);
                                        if (processHandlerResponse2 == enumC1260a) {
                                        }
                                        bool2 = (Boolean) processHandlerResponse2;
                                        if (bool2 == null) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        notificationGenerationProcessor5 = notificationGenerationProcessor4;
                                        i11 = i9;
                                        Logging.info("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                                        i13 = i11;
                                        i14 = i13;
                                        z9 = z7;
                                        notificationGenerationProcessor6 = notificationGenerationProcessor5;
                                        boolean z132 = qVar3.f10739a;
                                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor6;
                                        notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob3;
                                        notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                                        notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z9;
                                        notificationGenerationProcessor$processNotificationData$1.I$0 = i14;
                                        notificationGenerationProcessor$processNotificationData$1.label = 6;
                                        processHandlerResponse2 = notificationGenerationProcessor6.processHandlerResponse(notificationGenerationJob3, z132, z9, notificationGenerationProcessor$processNotificationData$1);
                                        if (processHandlerResponse2 == enumC1260a) {
                                        }
                                        bool2 = (Boolean) processHandlerResponse2;
                                        if (bool2 == null) {
                                        }
                                    }
                                    if (AbstractC0024y.x(external_callbacks_timeout2, notificationGenerationProcessor$processNotificationData$3, notificationGenerationProcessor$processNotificationData$1) == enumC1260a) {
                                        return enumC1260a;
                                    }
                                    notificationGenerationProcessor5 = notificationGenerationProcessor4;
                                    i13 = i9;
                                    i14 = i13;
                                    z9 = z7;
                                    notificationGenerationProcessor6 = notificationGenerationProcessor5;
                                    boolean z1322 = qVar3.f10739a;
                                    notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor6;
                                    notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob3;
                                    notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                                    notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                                    notificationGenerationProcessor$processNotificationData$1.Z$0 = z9;
                                    notificationGenerationProcessor$processNotificationData$1.I$0 = i14;
                                    notificationGenerationProcessor$processNotificationData$1.label = 6;
                                    processHandlerResponse2 = notificationGenerationProcessor6.processHandlerResponse(notificationGenerationJob3, z1322, z9, notificationGenerationProcessor$processNotificationData$1);
                                    if (processHandlerResponse2 == enumC1260a) {
                                        return enumC1260a;
                                    }
                                    bool2 = (Boolean) processHandlerResponse2;
                                    if (bool2 == null) {
                                        return vVar;
                                    }
                                    boolean booleanValue2 = bool2.booleanValue();
                                    notificationGenerationProcessor4 = notificationGenerationProcessor6;
                                    z7 = z9;
                                    notificationGenerationJob4 = notificationGenerationJob3;
                                    i10 = i14;
                                    booleanValue = booleanValue2;
                                    if (booleanValue) {
                                        notificationGenerationJob3 = notificationGenerationJob4;
                                        i15 = i10;
                                        z10 = z7;
                                        i16 = i15;
                                        if (notificationGenerationJob3.isRestoring()) {
                                        }
                                        if (z10) {
                                        }
                                    } else {
                                        INotificationDisplayer iNotificationDisplayer = notificationGenerationProcessor4._notificationDisplayer;
                                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor4;
                                        notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob4;
                                        notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                                        notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z7;
                                        notificationGenerationProcessor$processNotificationData$1.label = 7;
                                        Object displayNotification = iNotificationDisplayer.displayNotification(notificationGenerationJob4, notificationGenerationProcessor$processNotificationData$1);
                                        if (displayNotification == enumC1260a) {
                                            return enumC1260a;
                                        }
                                        notificationGenerationJob5 = notificationGenerationJob4;
                                        obj2 = displayNotification;
                                        z10 = z7;
                                        notificationGenerationJob3 = notificationGenerationJob5;
                                        i16 = ((Boolean) obj2).booleanValue();
                                        if (notificationGenerationJob3.isRestoring()) {
                                            if (i16 != 0) {
                                                z11 = z8;
                                                obj3 = null;
                                            } else {
                                                obj3 = null;
                                                z11 = false;
                                            }
                                            notificationGenerationProcessor$processNotificationData$1.L$0 = obj3;
                                            notificationGenerationProcessor$processNotificationData$1.L$1 = obj3;
                                            notificationGenerationProcessor$processNotificationData$1.L$2 = obj3;
                                            notificationGenerationProcessor$processNotificationData$1.L$3 = obj3;
                                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z10;
                                            notificationGenerationProcessor$processNotificationData$1.label = 8;
                                            if (notificationGenerationProcessor4.postProcessNotification(notificationGenerationJob3, false, z11, notificationGenerationProcessor$processNotificationData$1) == enumC1260a) {
                                                return enumC1260a;
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                        if (z10) {
                                            notificationGenerationProcessor$processNotificationData$1.L$0 = obj3;
                                            notificationGenerationProcessor$processNotificationData$1.L$1 = obj3;
                                            notificationGenerationProcessor$processNotificationData$1.L$2 = obj3;
                                            notificationGenerationProcessor$processNotificationData$1.L$3 = obj3;
                                            notificationGenerationProcessor$processNotificationData$1.label = 9;
                                            if (AbstractC0024y.d(100L, notificationGenerationProcessor$processNotificationData$1) == enumC1260a) {
                                                return enumC1260a;
                                            }
                                        }
                                    }
                                } else {
                                    z8 = true;
                                    i10 = i9;
                                    notificationGenerationJob4 = notificationGenerationJob3;
                                    if (booleanValue) {
                                    }
                                }
                            }
                            return vVar;
                        }
                        notificationGenerationProcessor2 = notificationGenerationProcessor;
                        notificationGenerationJob = new NotificationGenerationJob(notification4, jSONObject3);
                        notificationGenerationJob.setShownTimeStamp(new Long(j6));
                        notificationGenerationJob.setRestoring(z5);
                        qVar = new q();
                        qVar.f10739a = true;
                        Logging.info$default("Fire remoteNotificationReceived", null, 2, null);
                        NotificationReceivedEvent notificationReceivedEvent2 = new NotificationReceivedEvent(context2, notification4);
                        external_callbacks_timeout = notificationGenerationProcessor2.getEXTERNAL_CALLBACKS_TIMEOUT();
                        notificationGenerationProcessor$processNotificationData$2 = new NotificationGenerationProcessor$processNotificationData$2(notificationGenerationProcessor2, notificationReceivedEvent2, qVar, notification4, null);
                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor2;
                        notificationGenerationProcessor$processNotificationData$1.L$1 = notification4;
                        notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob;
                        notificationGenerationProcessor$processNotificationData$1.L$3 = qVar;
                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z5;
                        notificationGenerationProcessor$processNotificationData$1.I$0 = 0;
                        notificationGenerationJob2 = notificationGenerationJob;
                        notificationGenerationProcessor$processNotificationData$1.label = 3;
                        if (AbstractC0024y.x(external_callbacks_timeout, notificationGenerationProcessor$processNotificationData$2, notificationGenerationProcessor$processNotificationData$1) != enumC1260a) {
                        }
                    case 1:
                        long j9 = notificationGenerationProcessor$processNotificationData$1.J$0;
                        boolean z14 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        i6 = notificationGenerationProcessor$processNotificationData$1.I$0;
                        JSONObject jSONObject4 = (JSONObject) notificationGenerationProcessor$processNotificationData$1.L$2;
                        context2 = (Context) notificationGenerationProcessor$processNotificationData$1.L$1;
                        notificationGenerationProcessor = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        g.y(obj4);
                        j6 = j9;
                        z5 = z14;
                        obj = obj4;
                        jSONObject3 = jSONObject4;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 2:
                        j7 = notificationGenerationProcessor$processNotificationData$1.J$0;
                        z6 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        notification = (Notification) notificationGenerationProcessor$processNotificationData$1.L$3;
                        jSONObject2 = (JSONObject) notificationGenerationProcessor$processNotificationData$1.L$2;
                        Context context5 = (Context) notificationGenerationProcessor$processNotificationData$1.L$1;
                        NotificationGenerationProcessor notificationGenerationProcessor8 = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        g.y(obj4);
                        context3 = context5;
                        notificationGenerationProcessor = notificationGenerationProcessor8;
                        if (!((Boolean) obj4).booleanValue()) {
                        }
                        break;
                    case 3:
                        i7 = notificationGenerationProcessor$processNotificationData$1.I$0;
                        z5 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        qVar2 = (q) notificationGenerationProcessor$processNotificationData$1.L$3;
                        notificationGenerationJob2 = (NotificationGenerationJob) notificationGenerationProcessor$processNotificationData$1.L$2;
                        notification2 = (Notification) notificationGenerationProcessor$processNotificationData$1.L$1;
                        notificationGenerationProcessor3 = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        try {
                            g.y(obj4);
                            i8 = i7;
                        } catch (r0 e8) {
                            e = e8;
                            Logging.info("remoteNotificationReceived timed out, continuing with wantsToDisplay=" + qVar2.f10739a + '.', e);
                            i8 = i7;
                            NotificationGenerationProcessor notificationGenerationProcessor7222 = notificationGenerationProcessor3;
                            boolean z12222 = qVar2.f10739a;
                            notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor7222;
                            notificationGenerationProcessor$processNotificationData$1.L$1 = notification2;
                            notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob2;
                            notificationGenerationProcessor$processNotificationData$1.L$3 = qVar2;
                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z5;
                            notificationGenerationProcessor$processNotificationData$1.I$0 = i8 == true ? 1 : 0;
                            notificationGenerationProcessor$processNotificationData$1.label = 4;
                            processHandlerResponse = notificationGenerationProcessor7222.processHandlerResponse(notificationGenerationJob2, z12222, z5, notificationGenerationProcessor$processNotificationData$1);
                            if (processHandlerResponse != enumC1260a) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            Logging.info("remoteNotificationReceived threw an exception. Displaying normal OneSignal notification.", th);
                            i8 = i7;
                            NotificationGenerationProcessor notificationGenerationProcessor72222 = notificationGenerationProcessor3;
                            boolean z122222 = qVar2.f10739a;
                            notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor72222;
                            notificationGenerationProcessor$processNotificationData$1.L$1 = notification2;
                            notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob2;
                            notificationGenerationProcessor$processNotificationData$1.L$3 = qVar2;
                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z5;
                            notificationGenerationProcessor$processNotificationData$1.I$0 = i8 == true ? 1 : 0;
                            notificationGenerationProcessor$processNotificationData$1.label = 4;
                            processHandlerResponse = notificationGenerationProcessor72222.processHandlerResponse(notificationGenerationJob2, z122222, z5, notificationGenerationProcessor$processNotificationData$1);
                            if (processHandlerResponse != enumC1260a) {
                            }
                        }
                        NotificationGenerationProcessor notificationGenerationProcessor722222 = notificationGenerationProcessor3;
                        boolean z1222222 = qVar2.f10739a;
                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor722222;
                        notificationGenerationProcessor$processNotificationData$1.L$1 = notification2;
                        notificationGenerationProcessor$processNotificationData$1.L$2 = notificationGenerationJob2;
                        notificationGenerationProcessor$processNotificationData$1.L$3 = qVar2;
                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z5;
                        notificationGenerationProcessor$processNotificationData$1.I$0 = i8 == true ? 1 : 0;
                        notificationGenerationProcessor$processNotificationData$1.label = 4;
                        processHandlerResponse = notificationGenerationProcessor722222.processHandlerResponse(notificationGenerationJob2, z1222222, z5, notificationGenerationProcessor$processNotificationData$1);
                        if (processHandlerResponse != enumC1260a) {
                        }
                        break;
                    case 4:
                        int i18 = notificationGenerationProcessor$processNotificationData$1.I$0;
                        boolean z15 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        qVar3 = (q) notificationGenerationProcessor$processNotificationData$1.L$3;
                        notificationGenerationJob3 = (NotificationGenerationJob) notificationGenerationProcessor$processNotificationData$1.L$2;
                        notification3 = (Notification) notificationGenerationProcessor$processNotificationData$1.L$1;
                        notificationGenerationProcessor4 = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        g.y(obj4);
                        processHandlerResponse = obj4;
                        z7 = z15;
                        i9 = i18;
                        bool = (Boolean) processHandlerResponse;
                        if (bool != null) {
                        }
                        return vVar;
                    case 5:
                        int i19 = notificationGenerationProcessor$processNotificationData$1.I$0;
                        z7 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        qVar3 = (q) notificationGenerationProcessor$processNotificationData$1.L$2;
                        notificationGenerationJob3 = (NotificationGenerationJob) notificationGenerationProcessor$processNotificationData$1.L$1;
                        notificationGenerationProcessor5 = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        try {
                            g.y(obj4);
                            z8 = true;
                            i13 = i19;
                        } catch (r0 e9) {
                            e = e9;
                            z8 = true;
                            i12 = i19;
                            Logging.info("notificationWillShowInForegroundHandler timed out, continuing with wantsToDisplay=" + qVar3.f10739a + '.', e);
                            i13 = i12;
                            i14 = i13;
                            z9 = z7;
                            notificationGenerationProcessor6 = notificationGenerationProcessor5;
                            boolean z13222 = qVar3.f10739a;
                            notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor6;
                            notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob3;
                            notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                            notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z9;
                            notificationGenerationProcessor$processNotificationData$1.I$0 = i14;
                            notificationGenerationProcessor$processNotificationData$1.label = 6;
                            processHandlerResponse2 = notificationGenerationProcessor6.processHandlerResponse(notificationGenerationJob3, z13222, z9, notificationGenerationProcessor$processNotificationData$1);
                            if (processHandlerResponse2 == enumC1260a) {
                            }
                            bool2 = (Boolean) processHandlerResponse2;
                            if (bool2 == null) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z8 = true;
                            i11 = i19;
                            Logging.info("notificationWillShowInForegroundHandler threw an exception. Displaying normal OneSignal notification.", th);
                            i13 = i11;
                            i14 = i13;
                            z9 = z7;
                            notificationGenerationProcessor6 = notificationGenerationProcessor5;
                            boolean z132222 = qVar3.f10739a;
                            notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor6;
                            notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob3;
                            notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                            notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                            notificationGenerationProcessor$processNotificationData$1.Z$0 = z9;
                            notificationGenerationProcessor$processNotificationData$1.I$0 = i14;
                            notificationGenerationProcessor$processNotificationData$1.label = 6;
                            processHandlerResponse2 = notificationGenerationProcessor6.processHandlerResponse(notificationGenerationJob3, z132222, z9, notificationGenerationProcessor$processNotificationData$1);
                            if (processHandlerResponse2 == enumC1260a) {
                            }
                            bool2 = (Boolean) processHandlerResponse2;
                            if (bool2 == null) {
                            }
                        }
                        i14 = i13;
                        z9 = z7;
                        notificationGenerationProcessor6 = notificationGenerationProcessor5;
                        boolean z1322222 = qVar3.f10739a;
                        notificationGenerationProcessor$processNotificationData$1.L$0 = notificationGenerationProcessor6;
                        notificationGenerationProcessor$processNotificationData$1.L$1 = notificationGenerationJob3;
                        notificationGenerationProcessor$processNotificationData$1.L$2 = null;
                        notificationGenerationProcessor$processNotificationData$1.L$3 = null;
                        notificationGenerationProcessor$processNotificationData$1.Z$0 = z9;
                        notificationGenerationProcessor$processNotificationData$1.I$0 = i14;
                        notificationGenerationProcessor$processNotificationData$1.label = 6;
                        processHandlerResponse2 = notificationGenerationProcessor6.processHandlerResponse(notificationGenerationJob3, z1322222, z9, notificationGenerationProcessor$processNotificationData$1);
                        if (processHandlerResponse2 == enumC1260a) {
                        }
                        bool2 = (Boolean) processHandlerResponse2;
                        if (bool2 == null) {
                        }
                        break;
                    case 6:
                        i14 = notificationGenerationProcessor$processNotificationData$1.I$0;
                        z9 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        NotificationGenerationJob notificationGenerationJob6 = (NotificationGenerationJob) notificationGenerationProcessor$processNotificationData$1.L$1;
                        notificationGenerationProcessor6 = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        g.y(obj4);
                        processHandlerResponse2 = obj4;
                        notificationGenerationJob3 = notificationGenerationJob6;
                        z8 = true;
                        bool2 = (Boolean) processHandlerResponse2;
                        if (bool2 == null) {
                        }
                        break;
                    case 7:
                        z10 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        NotificationGenerationJob notificationGenerationJob7 = (NotificationGenerationJob) notificationGenerationProcessor$processNotificationData$1.L$1;
                        NotificationGenerationProcessor notificationGenerationProcessor9 = (NotificationGenerationProcessor) notificationGenerationProcessor$processNotificationData$1.L$0;
                        g.y(obj4);
                        notificationGenerationJob5 = notificationGenerationJob7;
                        notificationGenerationProcessor4 = notificationGenerationProcessor9;
                        z8 = true;
                        obj2 = obj4;
                        notificationGenerationJob3 = notificationGenerationJob5;
                        i16 = ((Boolean) obj2).booleanValue();
                        if (notificationGenerationJob3.isRestoring()) {
                        }
                        if (z10) {
                        }
                        return vVar;
                    case 8:
                        z10 = notificationGenerationProcessor$processNotificationData$1.Z$0;
                        g.y(obj4);
                        obj3 = null;
                        if (z10) {
                        }
                        return vVar;
                    case 9:
                        g.y(obj4);
                        return vVar;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        notificationGenerationProcessor$processNotificationData$1 = new NotificationGenerationProcessor$processNotificationData$1(this, interfaceC1218d);
        Object obj42 = notificationGenerationProcessor$processNotificationData$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i3 = notificationGenerationProcessor$processNotificationData$1.label;
        v vVar2 = v.f5689a;
        switch (i3) {
        }
    }
}
