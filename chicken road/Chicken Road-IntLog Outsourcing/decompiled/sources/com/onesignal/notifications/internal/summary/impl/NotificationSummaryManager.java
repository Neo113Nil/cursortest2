package com.onesignal.notifications.internal.summary.impl;

import android.app.NotificationManager;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer;
import com.onesignal.notifications.internal.restoration.INotificationRestoreProcessor;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import e5.g;
import f4.v;
import g4.AbstractC0465j;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NotificationSummaryManager implements INotificationSummaryManager {
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final INotificationRepository _dataController;
    private final INotificationRestoreProcessor _notificationRestoreProcessor;
    private final ISummaryNotificationDisplayer _summaryNotificationDisplayer;
    private final ITime _time;

    public NotificationSummaryManager(IApplicationService _applicationService, INotificationRepository _dataController, ISummaryNotificationDisplayer _summaryNotificationDisplayer, ConfigModelStore _configModelStore, INotificationRestoreProcessor _notificationRestoreProcessor, ITime _time) {
        i.e(_applicationService, "_applicationService");
        i.e(_dataController, "_dataController");
        i.e(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        i.e(_configModelStore, "_configModelStore");
        i.e(_notificationRestoreProcessor, "_notificationRestoreProcessor");
        i.e(_time, "_time");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._summaryNotificationDisplayer = _summaryNotificationDisplayer;
        this._configModelStore = _configModelStore;
        this._notificationRestoreProcessor = _notificationRestoreProcessor;
        this._time = _time;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|8|(1:(1:(1:(1:(1:(3:15|16|17)(2:20|21))(2:22|23))(2:24|25))(4:26|27|(2:29|(2:31|(1:33)(1:25))(1:(2:35|(1:37)(1:23))(3:38|(1:40)|16)))|17))(1:41))(2:46|(1:48)(1:49))|42|(1:44)(4:45|27|(0)|17)))|52|6|7|8|(0)(0)|42|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0038, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0120, code lost:
    
        r13.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalUpdateSummaryNotificationAfterChildRemoved(String str, boolean z, InterfaceC1218d interfaceC1218d) {
        NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1 notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1;
        EnumC1260a enumC1260a;
        int i2;
        NotificationSummaryManager notificationSummaryManager;
        List list;
        Object androidIdForGroup;
        String str2;
        int i3;
        Integer num;
        if (interfaceC1218d instanceof NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1) {
            notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1 = (NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1) interfaceC1218d;
            int i6 = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1.label = i6 - Integer.MIN_VALUE;
                NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1 notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12 = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1;
                Object obj = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.result;
                enumC1260a = EnumC1260a.f11058a;
                i2 = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    INotificationRepository iNotificationRepository = this._dataController;
                    notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0 = this;
                    notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1 = str;
                    notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.Z$0 = z;
                    notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.label = 1;
                    obj = iNotificationRepository.listNotificationsForGroup(str, notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    notificationSummaryManager = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                g.y(obj);
                            }
                            if (i2 == 4) {
                                g.y(obj);
                            }
                            if (i2 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            g.y(obj);
                            return vVar;
                        }
                        i3 = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.I$0;
                        z = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.Z$0;
                        list = (List) notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$2;
                        str2 = (String) notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1;
                        notificationSummaryManager = (NotificationSummaryManager) notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0;
                        g.y(obj);
                        num = (Integer) obj;
                        if (num != null) {
                            int intValue = num.intValue();
                            if (i3 == 0) {
                                NotificationHelper.INSTANCE.getNotificationManager(notificationSummaryManager._applicationService.getAppContext()).cancel(intValue);
                                INotificationRepository iNotificationRepository2 = notificationSummaryManager._dataController;
                                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0 = null;
                                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1 = null;
                                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$2 = null;
                                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.label = 3;
                                return INotificationRepository.DefaultImpls.markAsConsumed$default(iNotificationRepository2, intValue, z, null, false, notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12, 12, null) == enumC1260a ? enumC1260a : vVar;
                            }
                            if (i3 == 1) {
                                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0 = null;
                                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1 = null;
                                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$2 = null;
                                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.label = 4;
                                return notificationSummaryManager.restoreSummary(str2, notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12) == enumC1260a ? enumC1260a : vVar;
                            }
                            INotificationRepository.NotificationData notificationData = (INotificationRepository.NotificationData) AbstractC0465j.F0(list);
                            NotificationGenerationJob notificationGenerationJob = new NotificationGenerationJob(new JSONObject(notificationData.getFullData()), notificationSummaryManager._time);
                            notificationGenerationJob.setRestoring(true);
                            notificationGenerationJob.setShownTimeStamp(new Long(notificationData.getCreatedAt()));
                            ISummaryNotificationDisplayer iSummaryNotificationDisplayer = notificationSummaryManager._summaryNotificationDisplayer;
                            notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0 = null;
                            notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1 = null;
                            notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$2 = null;
                            notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.label = 5;
                            if (iSummaryNotificationDisplayer.updateSummaryNotification(notificationGenerationJob, notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12) == enumC1260a) {
                                return enumC1260a;
                            }
                        }
                        return vVar;
                    }
                    z = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.Z$0;
                    str = (String) notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1;
                    NotificationSummaryManager notificationSummaryManager2 = (NotificationSummaryManager) notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0;
                    g.y(obj);
                    notificationSummaryManager = notificationSummaryManager2;
                }
                list = (List) obj;
                int size = list.size();
                INotificationRepository iNotificationRepository3 = notificationSummaryManager._dataController;
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$0 = notificationSummaryManager;
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$1 = str;
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.L$2 = list;
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.Z$0 = z;
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.I$0 = size;
                notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12.label = 2;
                androidIdForGroup = iNotificationRepository3.getAndroidIdForGroup(str, true, notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$12);
                if (androidIdForGroup != enumC1260a) {
                    return enumC1260a;
                }
                str2 = str;
                i3 = size;
                obj = androidIdForGroup;
                num = (Integer) obj;
                if (num != null) {
                }
                return vVar;
            }
        }
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1 = new NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1(this, interfaceC1218d);
        NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1 notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122 = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1;
        Object obj2 = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.result;
        enumC1260a = EnumC1260a.f11058a;
        i2 = notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        list = (List) obj2;
        int size2 = list.size();
        INotificationRepository iNotificationRepository32 = notificationSummaryManager._dataController;
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.L$0 = notificationSummaryManager;
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.L$1 = str;
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.L$2 = list;
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.Z$0 = z;
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.I$0 = size2;
        notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122.label = 2;
        androidIdForGroup = iNotificationRepository32.getAndroidIdForGroup(str, true, notificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$122);
        if (androidIdForGroup != enumC1260a) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object restoreSummary(String str, InterfaceC1218d interfaceC1218d) {
        NotificationSummaryManager$restoreSummary$1 notificationSummaryManager$restoreSummary$1;
        int i2;
        NotificationSummaryManager notificationSummaryManager;
        NotificationSummaryManager notificationSummaryManager2;
        Iterator it;
        if (interfaceC1218d instanceof NotificationSummaryManager$restoreSummary$1) {
            notificationSummaryManager$restoreSummary$1 = (NotificationSummaryManager$restoreSummary$1) interfaceC1218d;
            int i3 = notificationSummaryManager$restoreSummary$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationSummaryManager$restoreSummary$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationSummaryManager$restoreSummary$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationSummaryManager$restoreSummary$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    INotificationRepository iNotificationRepository = this._dataController;
                    notificationSummaryManager$restoreSummary$1.L$0 = this;
                    notificationSummaryManager$restoreSummary$1.label = 1;
                    obj = iNotificationRepository.listNotificationsForGroup(str, notificationSummaryManager$restoreSummary$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    notificationSummaryManager = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) notificationSummaryManager$restoreSummary$1.L$1;
                        notificationSummaryManager2 = (NotificationSummaryManager) notificationSummaryManager$restoreSummary$1.L$0;
                        g.y(obj);
                        while (it.hasNext()) {
                            INotificationRepository.NotificationData notificationData = (INotificationRepository.NotificationData) it.next();
                            INotificationRestoreProcessor iNotificationRestoreProcessor = notificationSummaryManager2._notificationRestoreProcessor;
                            notificationSummaryManager$restoreSummary$1.L$0 = notificationSummaryManager2;
                            notificationSummaryManager$restoreSummary$1.L$1 = it;
                            notificationSummaryManager$restoreSummary$1.label = 2;
                            if (INotificationRestoreProcessor.DefaultImpls.processNotification$default(iNotificationRestoreProcessor, notificationData, 0, notificationSummaryManager$restoreSummary$1, 2, null) == enumC1260a) {
                                return enumC1260a;
                            }
                        }
                        return v.f5689a;
                    }
                    notificationSummaryManager = (NotificationSummaryManager) notificationSummaryManager$restoreSummary$1.L$0;
                    g.y(obj);
                }
                notificationSummaryManager2 = notificationSummaryManager;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return v.f5689a;
            }
        }
        notificationSummaryManager$restoreSummary$1 = new NotificationSummaryManager$restoreSummary$1(this, interfaceC1218d);
        Object obj2 = notificationSummaryManager$restoreSummary$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationSummaryManager$restoreSummary$1.label;
        if (i2 != 0) {
        }
        notificationSummaryManager2 = notificationSummaryManager;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return v.f5689a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.notifications.internal.summary.INotificationSummaryManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearNotificationOnSummaryClick(String str, InterfaceC1218d interfaceC1218d) {
        NotificationSummaryManager$clearNotificationOnSummaryClick$1 notificationSummaryManager$clearNotificationOnSummaryClick$1;
        int i2;
        NotificationManager notificationManager;
        Object androidIdForGroup;
        NotificationSummaryManager notificationSummaryManager;
        Integer num;
        NotificationManager notificationManager2;
        Integer num2;
        if (interfaceC1218d instanceof NotificationSummaryManager$clearNotificationOnSummaryClick$1) {
            notificationSummaryManager$clearNotificationOnSummaryClick$1 = (NotificationSummaryManager$clearNotificationOnSummaryClick$1) interfaceC1218d;
            int i3 = notificationSummaryManager$clearNotificationOnSummaryClick$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationSummaryManager$clearNotificationOnSummaryClick$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationSummaryManager$clearNotificationOnSummaryClick$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationSummaryManager$clearNotificationOnSummaryClick$1.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    notificationManager = NotificationHelper.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
                    INotificationRepository iNotificationRepository = this._dataController;
                    notificationSummaryManager$clearNotificationOnSummaryClick$1.L$0 = this;
                    notificationSummaryManager$clearNotificationOnSummaryClick$1.L$1 = str;
                    notificationSummaryManager$clearNotificationOnSummaryClick$1.L$2 = notificationManager;
                    notificationSummaryManager$clearNotificationOnSummaryClick$1.label = 1;
                    androidIdForGroup = iNotificationRepository.getAndroidIdForGroup(str, false, notificationSummaryManager$clearNotificationOnSummaryClick$1);
                    if (androidIdForGroup == enumC1260a) {
                        return enumC1260a;
                    }
                    notificationSummaryManager = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            g.y(obj);
                            return vVar;
                        }
                        notificationManager2 = (NotificationManager) notificationSummaryManager$clearNotificationOnSummaryClick$1.L$0;
                        g.y(obj);
                        Integer num3 = (Integer) obj;
                        notificationManager = notificationManager2;
                        num2 = num3;
                        if (num2 != null) {
                            notificationManager.cancel(num2.intValue());
                        }
                        return vVar;
                    }
                    NotificationManager notificationManager3 = (NotificationManager) notificationSummaryManager$clearNotificationOnSummaryClick$1.L$2;
                    String str2 = (String) notificationSummaryManager$clearNotificationOnSummaryClick$1.L$1;
                    notificationSummaryManager = (NotificationSummaryManager) notificationSummaryManager$clearNotificationOnSummaryClick$1.L$0;
                    g.y(obj);
                    notificationManager = notificationManager3;
                    str = str2;
                    androidIdForGroup = obj;
                }
                num = (Integer) androidIdForGroup;
                if (num != null) {
                    if (!notificationSummaryManager._configModelStore.getModel().getClearGroupOnSummaryClick()) {
                        INotificationRepository iNotificationRepository2 = notificationSummaryManager._dataController;
                        int intValue = num.intValue();
                        notificationSummaryManager$clearNotificationOnSummaryClick$1.L$0 = null;
                        notificationSummaryManager$clearNotificationOnSummaryClick$1.L$1 = null;
                        notificationSummaryManager$clearNotificationOnSummaryClick$1.L$2 = null;
                        notificationSummaryManager$clearNotificationOnSummaryClick$1.label = 3;
                        if (iNotificationRepository2.markAsDismissed(intValue, notificationSummaryManager$clearNotificationOnSummaryClick$1) == enumC1260a) {
                            return enumC1260a;
                        }
                    } else if (i.a(str, NotificationHelper.GROUPLESS_SUMMARY_KEY)) {
                        num2 = new Integer(NotificationHelper.GROUPLESS_SUMMARY_ID);
                        if (num2 != null) {
                        }
                    } else {
                        INotificationRepository iNotificationRepository3 = notificationSummaryManager._dataController;
                        notificationSummaryManager$clearNotificationOnSummaryClick$1.L$0 = notificationManager;
                        notificationSummaryManager$clearNotificationOnSummaryClick$1.L$1 = null;
                        notificationSummaryManager$clearNotificationOnSummaryClick$1.L$2 = null;
                        notificationSummaryManager$clearNotificationOnSummaryClick$1.label = 2;
                        Object androidIdForGroup2 = iNotificationRepository3.getAndroidIdForGroup(str, true, notificationSummaryManager$clearNotificationOnSummaryClick$1);
                        if (androidIdForGroup2 == enumC1260a) {
                            return enumC1260a;
                        }
                        NotificationManager notificationManager4 = notificationManager;
                        obj = androidIdForGroup2;
                        notificationManager2 = notificationManager4;
                        Integer num32 = (Integer) obj;
                        notificationManager = notificationManager2;
                        num2 = num32;
                        if (num2 != null) {
                        }
                    }
                }
                return vVar;
            }
        }
        notificationSummaryManager$clearNotificationOnSummaryClick$1 = new NotificationSummaryManager$clearNotificationOnSummaryClick$1(this, interfaceC1218d);
        Object obj2 = notificationSummaryManager$clearNotificationOnSummaryClick$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationSummaryManager$clearNotificationOnSummaryClick$1.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        num = (Integer) androidIdForGroup;
        if (num != null) {
        }
        return vVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.notifications.internal.summary.INotificationSummaryManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updatePossibleDependentSummaryOnDismiss(int i2, InterfaceC1218d interfaceC1218d) {
        NotificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1 notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1;
        int i3;
        NotificationSummaryManager notificationSummaryManager;
        String str;
        if (interfaceC1218d instanceof NotificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1) {
            notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1 = (NotificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1) interfaceC1218d;
            int i6 = notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.label = i6 - Integer.MIN_VALUE;
                Object obj = notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i3 = notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.label;
                v vVar = v.f5689a;
                if (i3 != 0) {
                    g.y(obj);
                    INotificationRepository iNotificationRepository = this._dataController;
                    notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.L$0 = this;
                    notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.label = 1;
                    obj = iNotificationRepository.getGroupId(i2, notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    notificationSummaryManager = this;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.y(obj);
                        return vVar;
                    }
                    notificationSummaryManager = (NotificationSummaryManager) notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.L$0;
                    g.y(obj);
                }
                str = (String) obj;
                if (str != null) {
                    notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.L$0 = null;
                    notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.label = 2;
                    if (notificationSummaryManager.internalUpdateSummaryNotificationAfterChildRemoved(str, true, notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1) == enumC1260a) {
                        return enumC1260a;
                    }
                }
                return vVar;
            }
        }
        notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1 = new NotificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1(this, interfaceC1218d);
        Object obj2 = notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i3 = notificationSummaryManager$updatePossibleDependentSummaryOnDismiss$1.label;
        v vVar2 = v.f5689a;
        if (i3 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return vVar2;
    }

    @Override // com.onesignal.notifications.internal.summary.INotificationSummaryManager
    public Object updateSummaryNotificationAfterChildRemoved(String str, boolean z, InterfaceC1218d interfaceC1218d) {
        Object internalUpdateSummaryNotificationAfterChildRemoved = internalUpdateSummaryNotificationAfterChildRemoved(str, z, interfaceC1218d);
        return internalUpdateSummaryNotificationAfterChildRemoved == EnumC1260a.f11058a ? internalUpdateSummaryNotificationAfterChildRemoved : v.f5689a;
    }
}
