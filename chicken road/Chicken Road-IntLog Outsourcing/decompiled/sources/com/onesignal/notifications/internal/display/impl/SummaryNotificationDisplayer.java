package com.onesignal.notifications.internal.display.impl;

import B4.r;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import b2.AbstractC0279e;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.display.INotificationDisplayBuilder;
import com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer;
import com.onesignal.notifications.internal.display.impl.NotificationDisplayBuilder;
import e5.g;
import f4.v;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONObject;
import u.C1458F;
import u.C1473n;
import u.p;

/* loaded from: classes.dex */
public final class SummaryNotificationDisplayer implements ISummaryNotificationDisplayer {
    private final IApplicationService _applicationService;
    private final INotificationRepository _dataController;
    private final INotificationDisplayBuilder _notificationDisplayBuilder;

    public SummaryNotificationDisplayer(IApplicationService _applicationService, INotificationRepository _dataController, INotificationDisplayBuilder _notificationDisplayBuilder) {
        i.e(_applicationService, "_applicationService");
        i.e(_dataController, "_dataController");
        i.e(_notificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._notificationDisplayBuilder = _notificationDisplayBuilder;
    }

    private final Intent createBaseSummaryIntent(int i2, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, JSONObject jSONObject, String str) {
        Intent putExtra = intentGeneratorForAttachingToNotifications.getNewBaseIntent(i2).putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString()).putExtra("summary", str);
        i.d(putExtra, "putExtra(...)");
        return putExtra;
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    public void createGenericPendingIntentsForGroup(p pVar, IntentGeneratorForAttachingToNotifications intentGenerator, JSONObject gcmBundle, String group, int i2) {
        i.e(intentGenerator, "intentGenerator");
        i.e(gcmBundle, "gcmBundle");
        i.e(group, "group");
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = intentGenerator.getNewBaseIntent(i2).putExtra(NotificationConstants.BUNDLE_KEY_ONESIGNAL_DATA, gcmBundle.toString()).putExtra("grp", group);
        i.d(putExtra, "putExtra(...)");
        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(nextInt, putExtra);
        i.b(pVar);
        pVar.f12010g = newActionPendingIntent;
        INotificationDisplayBuilder iNotificationDisplayBuilder = this._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = this._notificationDisplayBuilder.getNewBaseDismissIntent(i2).putExtra("grp", group);
        i.d(putExtra2, "putExtra(...)");
        pVar.f12025v.deleteIntent = iNotificationDisplayBuilder.getNewDismissActionPendingIntent(nextInt2, putExtra2);
        pVar.f12016m = group;
        try {
            pVar.f12023t = this._notificationDisplayBuilder.getGroupAlertBehavior();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|(1:(1:9)(2:24|25))(2:26|(1:28)(1:29))|10|(1:12)|13|(1:15)|16|17|18|19|20))|30|6|(0)(0)|10|(0)|13|(0)|16|17|18|19|20) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createGrouplessSummaryNotification(NotificationGenerationJob notificationGenerationJob, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, int i2, int i3, InterfaceC1218d interfaceC1218d) {
        SummaryNotificationDisplayer$createGrouplessSummaryNotification$1 summaryNotificationDisplayer$createGrouplessSummaryNotification$1;
        int i6;
        JSONObject jsonPayload;
        SecureRandom secureRandom;
        String str;
        SummaryNotificationDisplayer summaryNotificationDisplayer;
        String str2;
        NotificationGenerationJob notificationGenerationJob2;
        int i7;
        if (interfaceC1218d instanceof SummaryNotificationDisplayer$createGrouplessSummaryNotification$1) {
            summaryNotificationDisplayer$createGrouplessSummaryNotification$1 = (SummaryNotificationDisplayer$createGrouplessSummaryNotification$1) interfaceC1218d;
            int i8 = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                summaryNotificationDisplayer$createGrouplessSummaryNotification$1.label = i8 - Integer.MIN_VALUE;
                Object obj = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i6 = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.label;
                if (i6 != 0) {
                    g.y(obj);
                    jsonPayload = notificationGenerationJob.getJsonPayload();
                    i.b(jsonPayload);
                    secureRandom = new SecureRandom();
                    str = i2 + " new messages";
                    INotificationRepository iNotificationRepository = this._dataController;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$0 = this;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$1 = notificationGenerationJob;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$2 = intentGeneratorForAttachingToNotifications;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$3 = jsonPayload;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$4 = secureRandom;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$5 = NotificationHelper.GROUPLESS_SUMMARY_KEY;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$6 = str;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.I$0 = i2;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.I$1 = i3;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.I$2 = NotificationHelper.GROUPLESS_SUMMARY_ID;
                    summaryNotificationDisplayer$createGrouplessSummaryNotification$1.label = 1;
                    if (iNotificationRepository.createSummaryNotification(NotificationHelper.GROUPLESS_SUMMARY_ID, NotificationHelper.GROUPLESS_SUMMARY_KEY, summaryNotificationDisplayer$createGrouplessSummaryNotification$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    summaryNotificationDisplayer = this;
                    str2 = NotificationHelper.GROUPLESS_SUMMARY_KEY;
                    notificationGenerationJob2 = notificationGenerationJob;
                    i7 = -718463522;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.I$2;
                    i3 = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.I$1;
                    i2 = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.I$0;
                    String str3 = (String) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$6;
                    str2 = (String) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$5;
                    secureRandom = (SecureRandom) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$4;
                    jsonPayload = (JSONObject) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$3;
                    IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications2 = (IntentGeneratorForAttachingToNotifications) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$2;
                    notificationGenerationJob2 = (NotificationGenerationJob) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$1;
                    summaryNotificationDisplayer = (SummaryNotificationDisplayer) summaryNotificationDisplayer$createGrouplessSummaryNotification$1.L$0;
                    g.y(obj);
                    str = str3;
                    intentGeneratorForAttachingToNotifications = intentGeneratorForAttachingToNotifications2;
                }
                PendingIntent newActionPendingIntent = intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(secureRandom.nextInt(), summaryNotificationDisplayer.createBaseSummaryIntent(i7, intentGeneratorForAttachingToNotifications, jsonPayload, str2));
                INotificationDisplayBuilder iNotificationDisplayBuilder = summaryNotificationDisplayer._notificationDisplayBuilder;
                int nextInt = secureRandom.nextInt();
                Intent putExtra = summaryNotificationDisplayer._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
                i.d(putExtra, "putExtra(...)");
                PendingIntent newDismissActionPendingIntent = iNotificationDisplayBuilder.getNewDismissActionPendingIntent(nextInt, putExtra);
                p compatBuilder = summaryNotificationDisplayer._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(notificationGenerationJob2).getCompatBuilder();
                if (notificationGenerationJob2.getOverriddenSound() != null) {
                    i.b(compatBuilder);
                    compatBuilder.f(notificationGenerationJob2.getOverriddenSound());
                }
                if (notificationGenerationJob2.getOverriddenFlags() != null) {
                    i.b(compatBuilder);
                    Integer overriddenFlags = notificationGenerationJob2.getOverriddenFlags();
                    i.b(overriddenFlags);
                    compatBuilder.c(overriddenFlags.intValue());
                }
                i.b(compatBuilder);
                compatBuilder.f12010g = newActionPendingIntent;
                compatBuilder.f12025v.deleteIntent = newDismissActionPendingIntent;
                Context currentContext = summaryNotificationDisplayer.getCurrentContext();
                i.b(currentContext);
                PackageManager packageManager = currentContext.getPackageManager();
                Context currentContext2 = summaryNotificationDisplayer.getCurrentContext();
                i.b(currentContext2);
                compatBuilder.f12008e = p.b(packageManager.getApplicationLabel(currentContext2.getApplicationInfo()));
                compatBuilder.f12009f = p.b(str);
                compatBuilder.f12012i = i2;
                compatBuilder.f12025v.icon = summaryNotificationDisplayer._notificationDisplayBuilder.getDefaultSmallIconId();
                compatBuilder.e(summaryNotificationDisplayer._notificationDisplayBuilder.getDefaultLargeIcon());
                compatBuilder.d(8, true);
                compatBuilder.d(16, false);
                compatBuilder.f12016m = str2;
                compatBuilder.f12017n = true;
                compatBuilder.f12023t = i3;
                C1473n c1473n = new C1473n(1);
                c1473n.f12028b = p.b(str);
                compatBuilder.g(c1473n);
                Notification a6 = compatBuilder.a();
                i.d(a6, "build(...)");
                Context currentContext3 = summaryNotificationDisplayer.getCurrentContext();
                i.b(currentContext3);
                new C1458F(currentContext3).a(i7, a6);
                return v.f5689a;
            }
        }
        summaryNotificationDisplayer$createGrouplessSummaryNotification$1 = new SummaryNotificationDisplayer$createGrouplessSummaryNotification$1(this, interfaceC1218d);
        Object obj2 = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i6 = summaryNotificationDisplayer$createGrouplessSummaryNotification$1.label;
        if (i6 != 0) {
        }
        PendingIntent newActionPendingIntent2 = intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(secureRandom.nextInt(), summaryNotificationDisplayer.createBaseSummaryIntent(i7, intentGeneratorForAttachingToNotifications, jsonPayload, str2));
        INotificationDisplayBuilder iNotificationDisplayBuilder2 = summaryNotificationDisplayer._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = summaryNotificationDisplayer._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
        i.d(putExtra2, "putExtra(...)");
        PendingIntent newDismissActionPendingIntent2 = iNotificationDisplayBuilder2.getNewDismissActionPendingIntent(nextInt2, putExtra2);
        p compatBuilder2 = summaryNotificationDisplayer._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(notificationGenerationJob2).getCompatBuilder();
        if (notificationGenerationJob2.getOverriddenSound() != null) {
        }
        if (notificationGenerationJob2.getOverriddenFlags() != null) {
        }
        i.b(compatBuilder2);
        compatBuilder2.f12010g = newActionPendingIntent2;
        compatBuilder2.f12025v.deleteIntent = newDismissActionPendingIntent2;
        Context currentContext4 = summaryNotificationDisplayer.getCurrentContext();
        i.b(currentContext4);
        PackageManager packageManager2 = currentContext4.getPackageManager();
        Context currentContext22 = summaryNotificationDisplayer.getCurrentContext();
        i.b(currentContext22);
        compatBuilder2.f12008e = p.b(packageManager2.getApplicationLabel(currentContext22.getApplicationInfo()));
        compatBuilder2.f12009f = p.b(str);
        compatBuilder2.f12012i = i2;
        compatBuilder2.f12025v.icon = summaryNotificationDisplayer._notificationDisplayBuilder.getDefaultSmallIconId();
        compatBuilder2.e(summaryNotificationDisplayer._notificationDisplayBuilder.getDefaultLargeIcon());
        compatBuilder2.d(8, true);
        compatBuilder2.d(16, false);
        compatBuilder2.f12016m = str2;
        compatBuilder2.f12017n = true;
        compatBuilder2.f12023t = i3;
        C1473n c1473n2 = new C1473n(1);
        c1473n2.f12028b = p.b(str);
        compatBuilder2.g(c1473n2);
        Notification a62 = compatBuilder2.a();
        i.d(a62, "build(...)");
        Context currentContext32 = summaryNotificationDisplayer.getCurrentContext();
        i.b(currentContext32);
        new C1458F(currentContext32).a(i7, a62);
        return v.f5689a;
    }

    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    public Notification createSingleNotificationBeforeSummaryBuilder(NotificationGenerationJob notificationJob, p pVar) {
        i.e(notificationJob, "notificationJob");
        i.b(pVar);
        Notification a6 = pVar.a();
        i.d(a6, "build(...)");
        return a6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022e A[EDGE_INSN: B:33:0x022e->B:34:0x022e BREAK  A[LOOP:0: B:13:0x01c2->B:29:0x0227], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSummaryNotification(NotificationGenerationJob notificationGenerationJob, NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder, int i2, InterfaceC1218d interfaceC1218d) {
        SummaryNotificationDisplayer$createSummaryNotification$1 summaryNotificationDisplayer$createSummaryNotification$1;
        int i3;
        String optString;
        NotificationGenerationJob notificationGenerationJob2;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder2;
        int i6;
        JSONObject jSONObject;
        boolean z;
        PendingIntent pendingIntent;
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications;
        SecureRandom secureRandom;
        SummaryNotificationDisplayer summaryNotificationDisplayer;
        Integer num;
        PendingIntent pendingIntent2;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder3;
        JSONObject jSONObject2;
        String str;
        NotificationGenerationJob notificationGenerationJob3;
        Integer num2;
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications2;
        SecureRandom secureRandom2;
        int i7;
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications3;
        Integer num3;
        SecureRandom secureRandom3;
        NotificationGenerationJob notificationGenerationJob4;
        String str2;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder4;
        boolean z5;
        SummaryNotificationDisplayer summaryNotificationDisplayer2;
        int i8;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder5;
        Iterator it;
        NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder6;
        String str3;
        int i9;
        PendingIntent newActionPendingIntent;
        Notification a6;
        String str4;
        String obj;
        int i10;
        if (interfaceC1218d instanceof SummaryNotificationDisplayer$createSummaryNotification$1) {
            summaryNotificationDisplayer$createSummaryNotification$1 = (SummaryNotificationDisplayer$createSummaryNotification$1) interfaceC1218d;
            int i11 = summaryNotificationDisplayer$createSummaryNotification$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                summaryNotificationDisplayer$createSummaryNotification$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = summaryNotificationDisplayer$createSummaryNotification$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i3 = summaryNotificationDisplayer$createSummaryNotification$1.label;
                if (i3 != 0) {
                    g.y(obj2);
                    boolean isRestoring = notificationGenerationJob.isRestoring();
                    JSONObject jsonPayload = notificationGenerationJob.getJsonPayload();
                    i.b(jsonPayload);
                    Context currentContext = getCurrentContext();
                    i.b(currentContext);
                    IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications4 = new IntentGeneratorForAttachingToNotifications(currentContext);
                    optString = jsonPayload.optString("grp", null);
                    SecureRandom secureRandom4 = new SecureRandom();
                    INotificationDisplayBuilder iNotificationDisplayBuilder = this._notificationDisplayBuilder;
                    int nextInt = secureRandom4.nextInt();
                    Intent putExtra = this._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", optString);
                    i.d(putExtra, "putExtra(...)");
                    PendingIntent newDismissActionPendingIntent = iNotificationDisplayBuilder.getNewDismissActionPendingIntent(nextInt, putExtra);
                    INotificationRepository iNotificationRepository = this._dataController;
                    i.b(optString);
                    summaryNotificationDisplayer$createSummaryNotification$1.L$0 = this;
                    notificationGenerationJob2 = notificationGenerationJob;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$1 = notificationGenerationJob2;
                    oneSignalNotificationBuilder2 = oneSignalNotificationBuilder;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$2 = oneSignalNotificationBuilder2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$3 = jsonPayload;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$4 = intentGeneratorForAttachingToNotifications4;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$5 = optString;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$6 = secureRandom4;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$7 = newDismissActionPendingIntent;
                    i6 = i2;
                    summaryNotificationDisplayer$createSummaryNotification$1.I$0 = i6;
                    summaryNotificationDisplayer$createSummaryNotification$1.Z$0 = isRestoring;
                    summaryNotificationDisplayer$createSummaryNotification$1.label = 1;
                    Object androidIdForGroup = iNotificationRepository.getAndroidIdForGroup(optString, true, summaryNotificationDisplayer$createSummaryNotification$1);
                    if (androidIdForGroup == enumC1260a) {
                        return enumC1260a;
                    }
                    jSONObject = jsonPayload;
                    z = isRestoring;
                    obj2 = androidIdForGroup;
                    pendingIntent = newDismissActionPendingIntent;
                    intentGeneratorForAttachingToNotifications = intentGeneratorForAttachingToNotifications4;
                    secureRandom = secureRandom4;
                    summaryNotificationDisplayer = this;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            z = summaryNotificationDisplayer$createSummaryNotification$1.Z$0;
                            i7 = summaryNotificationDisplayer$createSummaryNotification$1.I$0;
                            num3 = (Integer) summaryNotificationDisplayer$createSummaryNotification$1.L$8;
                            pendingIntent = (PendingIntent) summaryNotificationDisplayer$createSummaryNotification$1.L$7;
                            secureRandom3 = (SecureRandom) summaryNotificationDisplayer$createSummaryNotification$1.L$6;
                            str2 = (String) summaryNotificationDisplayer$createSummaryNotification$1.L$5;
                            intentGeneratorForAttachingToNotifications3 = (IntentGeneratorForAttachingToNotifications) summaryNotificationDisplayer$createSummaryNotification$1.L$4;
                            jSONObject = (JSONObject) summaryNotificationDisplayer$createSummaryNotification$1.L$3;
                            oneSignalNotificationBuilder4 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) summaryNotificationDisplayer$createSummaryNotification$1.L$2;
                            notificationGenerationJob4 = (NotificationGenerationJob) summaryNotificationDisplayer$createSummaryNotification$1.L$1;
                            summaryNotificationDisplayer = (SummaryNotificationDisplayer) summaryNotificationDisplayer$createSummaryNotification$1.L$0;
                            g.y(obj2);
                            oneSignalNotificationBuilder3 = oneSignalNotificationBuilder4;
                            num2 = num3;
                            secureRandom2 = secureRandom3;
                            intentGeneratorForAttachingToNotifications2 = intentGeneratorForAttachingToNotifications3;
                            i6 = i7;
                            pendingIntent2 = pendingIntent;
                            str = str2;
                            jSONObject2 = jSONObject;
                            notificationGenerationJob3 = notificationGenerationJob4;
                            INotificationRepository iNotificationRepository2 = summaryNotificationDisplayer._dataController;
                            i.b(str);
                            summaryNotificationDisplayer$createSummaryNotification$1.L$0 = summaryNotificationDisplayer;
                            summaryNotificationDisplayer$createSummaryNotification$1.L$1 = notificationGenerationJob3;
                            summaryNotificationDisplayer$createSummaryNotification$1.L$2 = oneSignalNotificationBuilder3;
                            summaryNotificationDisplayer$createSummaryNotification$1.L$3 = jSONObject2;
                            summaryNotificationDisplayer$createSummaryNotification$1.L$4 = intentGeneratorForAttachingToNotifications2;
                            summaryNotificationDisplayer$createSummaryNotification$1.L$5 = str;
                            summaryNotificationDisplayer$createSummaryNotification$1.L$6 = secureRandom2;
                            summaryNotificationDisplayer$createSummaryNotification$1.L$7 = pendingIntent2;
                            summaryNotificationDisplayer$createSummaryNotification$1.L$8 = num2;
                            summaryNotificationDisplayer$createSummaryNotification$1.I$0 = i6;
                            summaryNotificationDisplayer$createSummaryNotification$1.Z$0 = z;
                            summaryNotificationDisplayer$createSummaryNotification$1.label = 3;
                            obj2 = iNotificationRepository2.listNotificationsForGroup(str, summaryNotificationDisplayer$createSummaryNotification$1);
                            if (obj2 == enumC1260a) {
                                return enumC1260a;
                            }
                            z5 = z;
                            summaryNotificationDisplayer2 = summaryNotificationDisplayer;
                            i8 = i6;
                            oneSignalNotificationBuilder5 = oneSignalNotificationBuilder3;
                            ArrayList arrayList = new ArrayList();
                            it = ((List) obj2).iterator();
                            String str5 = null;
                            while (true) {
                                oneSignalNotificationBuilder6 = oneSignalNotificationBuilder5;
                                str3 = "";
                                if (it.hasNext()) {
                                }
                                oneSignalNotificationBuilder5 = oneSignalNotificationBuilder6;
                                it = r26;
                                i8 = i10;
                            }
                            i9 = i8;
                            int nextInt2 = secureRandom2.nextInt();
                            i.b(num2);
                            int intValue = num2.intValue();
                            i.b(str);
                            newActionPendingIntent = intentGeneratorForAttachingToNotifications2.getNewActionPendingIntent(nextInt2, summaryNotificationDisplayer2.createBaseSummaryIntent(intValue, intentGeneratorForAttachingToNotifications2, jSONObject2, str));
                            if (z5 != 0) {
                            }
                            i.b(oneSignalNotificationBuilder6);
                            p compatBuilder = oneSignalNotificationBuilder6.getCompatBuilder();
                            i.b(compatBuilder);
                            compatBuilder.f12005b.clear();
                            summaryNotificationDisplayer2._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, intentGeneratorForAttachingToNotifications2, compatBuilder, num2.intValue(), str);
                            compatBuilder.f12010g = newActionPendingIntent;
                            compatBuilder.f12025v.deleteIntent = pendingIntent2;
                            compatBuilder.d(8, z5);
                            compatBuilder.d(16, false);
                            compatBuilder.f12016m = str;
                            compatBuilder.f12017n = true;
                            compatBuilder.f12023t = i9;
                            a6 = compatBuilder.a();
                            i.d(a6, "build(...)");
                            summaryNotificationDisplayer2._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder6, a6);
                            Context currentContext2 = summaryNotificationDisplayer2.getCurrentContext();
                            i.b(currentContext2);
                            new C1458F(currentContext2).a(num2.intValue(), a6);
                            return v.f5689a;
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z6 = summaryNotificationDisplayer$createSummaryNotification$1.Z$0;
                        i8 = summaryNotificationDisplayer$createSummaryNotification$1.I$0;
                        num2 = (Integer) summaryNotificationDisplayer$createSummaryNotification$1.L$8;
                        pendingIntent2 = (PendingIntent) summaryNotificationDisplayer$createSummaryNotification$1.L$7;
                        secureRandom2 = (SecureRandom) summaryNotificationDisplayer$createSummaryNotification$1.L$6;
                        str = (String) summaryNotificationDisplayer$createSummaryNotification$1.L$5;
                        intentGeneratorForAttachingToNotifications2 = (IntentGeneratorForAttachingToNotifications) summaryNotificationDisplayer$createSummaryNotification$1.L$4;
                        jSONObject2 = (JSONObject) summaryNotificationDisplayer$createSummaryNotification$1.L$3;
                        oneSignalNotificationBuilder5 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) summaryNotificationDisplayer$createSummaryNotification$1.L$2;
                        notificationGenerationJob3 = (NotificationGenerationJob) summaryNotificationDisplayer$createSummaryNotification$1.L$1;
                        summaryNotificationDisplayer2 = (SummaryNotificationDisplayer) summaryNotificationDisplayer$createSummaryNotification$1.L$0;
                        g.y(obj2);
                        z5 = z6;
                        ArrayList arrayList2 = new ArrayList();
                        it = ((List) obj2).iterator();
                        String str52 = null;
                        while (true) {
                            oneSignalNotificationBuilder6 = oneSignalNotificationBuilder5;
                            str3 = "";
                            if (it.hasNext()) {
                                break;
                            }
                            INotificationRepository.NotificationData notificationData = (INotificationRepository.NotificationData) it.next();
                            Iterator it2 = it;
                            if (z5 == 0) {
                                i10 = i8;
                                if (notificationData.getAndroidId() == notificationGenerationJob3.getAndroidId()) {
                                    oneSignalNotificationBuilder5 = oneSignalNotificationBuilder6;
                                    it = it2;
                                    i8 = i10;
                                }
                            } else {
                                i10 = i8;
                            }
                            String title = notificationData.getTitle();
                            str3 = title != null ? title.concat(" ") : "";
                            SpannableString spannableString = new SpannableString(str3 + notificationData.getMessage());
                            if (str3.length() > 0) {
                                spannableString.setSpan(new StyleSpan(1), 0, str3.length(), 0);
                            }
                            arrayList2.add(spannableString);
                            if (str52 == null) {
                                str52 = notificationData.getFullData();
                            }
                            oneSignalNotificationBuilder5 = oneSignalNotificationBuilder6;
                            it = it2;
                            i8 = i10;
                        }
                        i9 = i8;
                        int nextInt22 = secureRandom2.nextInt();
                        i.b(num2);
                        int intValue2 = num2.intValue();
                        i.b(str);
                        newActionPendingIntent = intentGeneratorForAttachingToNotifications2.getNewActionPendingIntent(nextInt22, summaryNotificationDisplayer2.createBaseSummaryIntent(intValue2, intentGeneratorForAttachingToNotifications2, jSONObject2, str));
                        if ((z5 != 0 || arrayList2.size() <= 1) && (z5 != 0 || arrayList2.size() <= 0)) {
                            i.b(oneSignalNotificationBuilder6);
                            p compatBuilder2 = oneSignalNotificationBuilder6.getCompatBuilder();
                            i.b(compatBuilder2);
                            compatBuilder2.f12005b.clear();
                            summaryNotificationDisplayer2._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, intentGeneratorForAttachingToNotifications2, compatBuilder2, num2.intValue(), str);
                            compatBuilder2.f12010g = newActionPendingIntent;
                            compatBuilder2.f12025v.deleteIntent = pendingIntent2;
                            compatBuilder2.d(8, z5);
                            compatBuilder2.d(16, false);
                            compatBuilder2.f12016m = str;
                            compatBuilder2.f12017n = true;
                            try {
                                compatBuilder2.f12023t = i9;
                            } catch (Throwable unused) {
                            }
                            a6 = compatBuilder2.a();
                            i.d(a6, "build(...)");
                            summaryNotificationDisplayer2._notificationDisplayBuilder.addXiaomiSettings(oneSignalNotificationBuilder6, a6);
                        } else {
                            int size = arrayList2.size() + (!z5);
                            String safeString = JSONObjectExtensionsKt.safeString(jSONObject2, "grp_msg");
                            if (safeString != null) {
                                str4 = r.M(safeString, "$[notif_count]", "" + size);
                            } else {
                                str4 = size + " new messages";
                            }
                            p compatBuilder3 = summaryNotificationDisplayer2._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(notificationGenerationJob3).getCompatBuilder();
                            if (z5 != 0) {
                                summaryNotificationDisplayer2._notificationDisplayBuilder.removeNotifyOptions(compatBuilder3);
                            } else {
                                if (notificationGenerationJob3.getOverriddenSound() != null) {
                                    i.b(compatBuilder3);
                                    compatBuilder3.f(notificationGenerationJob3.getOverriddenSound());
                                }
                                if (notificationGenerationJob3.getOverriddenFlags() != null) {
                                    i.b(compatBuilder3);
                                    Integer overriddenFlags = notificationGenerationJob3.getOverriddenFlags();
                                    i.b(overriddenFlags);
                                    compatBuilder3.c(overriddenFlags.intValue());
                                }
                            }
                            i.b(compatBuilder3);
                            compatBuilder3.f12010g = newActionPendingIntent;
                            compatBuilder3.f12025v.deleteIntent = pendingIntent2;
                            Context currentContext3 = summaryNotificationDisplayer2.getCurrentContext();
                            i.b(currentContext3);
                            PackageManager packageManager = currentContext3.getPackageManager();
                            Context currentContext4 = summaryNotificationDisplayer2.getCurrentContext();
                            i.b(currentContext4);
                            compatBuilder3.f12008e = p.b(packageManager.getApplicationLabel(currentContext4.getApplicationInfo()));
                            compatBuilder3.f12009f = p.b(str4);
                            compatBuilder3.f12012i = size;
                            compatBuilder3.f12025v.icon = summaryNotificationDisplayer2._notificationDisplayBuilder.getDefaultSmallIconId();
                            compatBuilder3.e(summaryNotificationDisplayer2._notificationDisplayBuilder.getDefaultLargeIcon());
                            compatBuilder3.d(8, z5);
                            compatBuilder3.d(16, false);
                            compatBuilder3.f12016m = str;
                            compatBuilder3.f12017n = true;
                            try {
                                compatBuilder3.f12023t = i9;
                            } catch (Throwable unused2) {
                            }
                            if (z5 == 0) {
                                compatBuilder3.f12025v.tickerText = p.b(str4);
                            }
                            C1473n c1473n = new C1473n(1);
                            if (z5 == 0) {
                                String valueOf = notificationGenerationJob3.getTitle() != null ? String.valueOf(notificationGenerationJob3.getTitle()) : null;
                                String concat = valueOf == null ? "" : valueOf.concat(" ");
                                CharSequence body = notificationGenerationJob3.getBody();
                                if (body != null && (obj = body.toString()) != null) {
                                    str3 = obj;
                                }
                                SpannableString spannableString2 = new SpannableString(AbstractC0279e.e(concat, str3));
                                if (concat.length() > 0) {
                                    spannableString2.setSpan(new StyleSpan(1), 0, concat.length(), 0);
                                }
                                ((ArrayList) c1473n.f12003f).add(p.b(spannableString2));
                            }
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                SpannableString spannableString3 = (SpannableString) it3.next();
                                if (spannableString3 != null) {
                                    ((ArrayList) c1473n.f12003f).add(p.b(spannableString3));
                                }
                            }
                            c1473n.f12028b = p.b(str4);
                            compatBuilder3.g(c1473n);
                            a6 = compatBuilder3.a();
                            i.d(a6, "build(...)");
                        }
                        Context currentContext22 = summaryNotificationDisplayer2.getCurrentContext();
                        i.b(currentContext22);
                        new C1458F(currentContext22).a(num2.intValue(), a6);
                        return v.f5689a;
                    }
                    z = summaryNotificationDisplayer$createSummaryNotification$1.Z$0;
                    int i12 = summaryNotificationDisplayer$createSummaryNotification$1.I$0;
                    PendingIntent pendingIntent3 = (PendingIntent) summaryNotificationDisplayer$createSummaryNotification$1.L$7;
                    SecureRandom secureRandom5 = (SecureRandom) summaryNotificationDisplayer$createSummaryNotification$1.L$6;
                    String str6 = (String) summaryNotificationDisplayer$createSummaryNotification$1.L$5;
                    IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications5 = (IntentGeneratorForAttachingToNotifications) summaryNotificationDisplayer$createSummaryNotification$1.L$4;
                    JSONObject jSONObject3 = (JSONObject) summaryNotificationDisplayer$createSummaryNotification$1.L$3;
                    oneSignalNotificationBuilder2 = (NotificationDisplayBuilder.OneSignalNotificationBuilder) summaryNotificationDisplayer$createSummaryNotification$1.L$2;
                    NotificationGenerationJob notificationGenerationJob5 = (NotificationGenerationJob) summaryNotificationDisplayer$createSummaryNotification$1.L$1;
                    SummaryNotificationDisplayer summaryNotificationDisplayer3 = (SummaryNotificationDisplayer) summaryNotificationDisplayer$createSummaryNotification$1.L$0;
                    g.y(obj2);
                    i6 = i12;
                    secureRandom = secureRandom5;
                    summaryNotificationDisplayer = summaryNotificationDisplayer3;
                    jSONObject = jSONObject3;
                    notificationGenerationJob2 = notificationGenerationJob5;
                    pendingIntent = pendingIntent3;
                    optString = str6;
                    intentGeneratorForAttachingToNotifications = intentGeneratorForAttachingToNotifications5;
                }
                num = (Integer) obj2;
                if (num != null) {
                    Integer num4 = new Integer(secureRandom.nextInt());
                    INotificationRepository iNotificationRepository3 = summaryNotificationDisplayer._dataController;
                    int intValue3 = num4.intValue();
                    i.b(optString);
                    summaryNotificationDisplayer$createSummaryNotification$1.L$0 = summaryNotificationDisplayer;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$1 = notificationGenerationJob2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$2 = oneSignalNotificationBuilder2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$3 = jSONObject;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$4 = intentGeneratorForAttachingToNotifications;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$5 = optString;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$6 = secureRandom;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$7 = pendingIntent;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$8 = num4;
                    summaryNotificationDisplayer$createSummaryNotification$1.I$0 = i6;
                    summaryNotificationDisplayer$createSummaryNotification$1.Z$0 = z;
                    summaryNotificationDisplayer$createSummaryNotification$1.label = 2;
                    if (iNotificationRepository3.createSummaryNotification(intValue3, optString, summaryNotificationDisplayer$createSummaryNotification$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    i7 = i6;
                    intentGeneratorForAttachingToNotifications3 = intentGeneratorForAttachingToNotifications;
                    num3 = num4;
                    NotificationGenerationJob notificationGenerationJob6 = notificationGenerationJob2;
                    secureRandom3 = secureRandom;
                    notificationGenerationJob4 = notificationGenerationJob6;
                    NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder7 = oneSignalNotificationBuilder2;
                    str2 = optString;
                    oneSignalNotificationBuilder4 = oneSignalNotificationBuilder7;
                    oneSignalNotificationBuilder3 = oneSignalNotificationBuilder4;
                    num2 = num3;
                    secureRandom2 = secureRandom3;
                    intentGeneratorForAttachingToNotifications2 = intentGeneratorForAttachingToNotifications3;
                    i6 = i7;
                    pendingIntent2 = pendingIntent;
                    str = str2;
                    jSONObject2 = jSONObject;
                    notificationGenerationJob3 = notificationGenerationJob4;
                    INotificationRepository iNotificationRepository22 = summaryNotificationDisplayer._dataController;
                    i.b(str);
                    summaryNotificationDisplayer$createSummaryNotification$1.L$0 = summaryNotificationDisplayer;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$1 = notificationGenerationJob3;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$2 = oneSignalNotificationBuilder3;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$3 = jSONObject2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$4 = intentGeneratorForAttachingToNotifications2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$5 = str;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$6 = secureRandom2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$7 = pendingIntent2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$8 = num2;
                    summaryNotificationDisplayer$createSummaryNotification$1.I$0 = i6;
                    summaryNotificationDisplayer$createSummaryNotification$1.Z$0 = z;
                    summaryNotificationDisplayer$createSummaryNotification$1.label = 3;
                    obj2 = iNotificationRepository22.listNotificationsForGroup(str, summaryNotificationDisplayer$createSummaryNotification$1);
                    if (obj2 == enumC1260a) {
                    }
                } else {
                    pendingIntent2 = pendingIntent;
                    oneSignalNotificationBuilder3 = oneSignalNotificationBuilder2;
                    jSONObject2 = jSONObject;
                    str = optString;
                    notificationGenerationJob3 = notificationGenerationJob2;
                    num2 = num;
                    intentGeneratorForAttachingToNotifications2 = intentGeneratorForAttachingToNotifications;
                    secureRandom2 = secureRandom;
                    INotificationRepository iNotificationRepository222 = summaryNotificationDisplayer._dataController;
                    i.b(str);
                    summaryNotificationDisplayer$createSummaryNotification$1.L$0 = summaryNotificationDisplayer;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$1 = notificationGenerationJob3;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$2 = oneSignalNotificationBuilder3;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$3 = jSONObject2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$4 = intentGeneratorForAttachingToNotifications2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$5 = str;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$6 = secureRandom2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$7 = pendingIntent2;
                    summaryNotificationDisplayer$createSummaryNotification$1.L$8 = num2;
                    summaryNotificationDisplayer$createSummaryNotification$1.I$0 = i6;
                    summaryNotificationDisplayer$createSummaryNotification$1.Z$0 = z;
                    summaryNotificationDisplayer$createSummaryNotification$1.label = 3;
                    obj2 = iNotificationRepository222.listNotificationsForGroup(str, summaryNotificationDisplayer$createSummaryNotification$1);
                    if (obj2 == enumC1260a) {
                    }
                }
            }
        }
        summaryNotificationDisplayer$createSummaryNotification$1 = new SummaryNotificationDisplayer$createSummaryNotification$1(this, interfaceC1218d);
        Object obj22 = summaryNotificationDisplayer$createSummaryNotification$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i3 = summaryNotificationDisplayer$createSummaryNotification$1.label;
        if (i3 != 0) {
        }
        num = (Integer) obj22;
        if (num != null) {
        }
    }

    @Override // com.onesignal.notifications.internal.display.ISummaryNotificationDisplayer
    public Object updateSummaryNotification(NotificationGenerationJob notificationGenerationJob, InterfaceC1218d interfaceC1218d) {
        Object createSummaryNotification = createSummaryNotification(notificationGenerationJob, null, this._notificationDisplayBuilder.getGroupAlertBehavior(), interfaceC1218d);
        return createSummaryNotification == EnumC1260a.f11058a ? createSummaryNotification : v.f5689a;
    }
}
