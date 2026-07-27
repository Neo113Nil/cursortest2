package com.onesignal.notifications.internal.generation.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b2.AbstractC0279e;
import com.onesignal.OneSignal;
import com.onesignal.common.AndroidUtils;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.notifications.internal.common.OSWorkManagerHelper;
import com.onesignal.notifications.internal.generation.INotificationGenerationProcessor;
import com.onesignal.notifications.internal.generation.INotificationGenerationWorkManager;
import e5.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import org.json.JSONException;
import org.json.JSONObject;
import s0.n;
import s0.q;
import s0.t;
import s0.y;
import t0.k;
import t0.o;

/* loaded from: classes.dex */
public final class NotificationGenerationWorkManager implements INotificationGenerationWorkManager {
    private static final String ANDROID_NOTIF_ID_WORKER_DATA_PARAM = "android_notif_id";
    private static final String IS_RESTORING_WORKER_DATA_PARAM = "is_restoring";
    private static final String JSON_PAYLOAD_WORKER_DATA_PARAM = "json_payload";
    private static final String OS_ID_DATA_PARAM = "os_notif_id";
    private static final String TIMESTAMP_WORKER_DATA_PARAM = "timestamp";
    public static final Companion Companion = new Companion(null);
    private static final ConcurrentHashMap<String, Boolean> notificationIds = new ConcurrentHashMap<>();

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final boolean addNotificationIdProcessed(String osNotificationId) {
            i.e(osNotificationId, "osNotificationId");
            if (!AndroidUtils.INSTANCE.isStringNotEmpty(osNotificationId)) {
                return true;
            }
            if (NotificationGenerationWorkManager.notificationIds.contains(osNotificationId)) {
                Logging.debug$default(AbstractC0279e.f("OSNotificationWorkManager notification with notificationId: ", osNotificationId, " already queued"), null, 2, null);
                return false;
            }
            NotificationGenerationWorkManager.notificationIds.put(osNotificationId, Boolean.TRUE);
            return true;
        }

        public final void removeNotificationIdProcessed(String osNotificationId) {
            i.e(osNotificationId, "osNotificationId");
            if (AndroidUtils.INSTANCE.isStringNotEmpty(osNotificationId)) {
                NotificationGenerationWorkManager.notificationIds.remove(osNotificationId);
            }
        }

        private Companion() {
        }
    }

    public static final class NotificationGenerationWorker extends CoroutineWorker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationGenerationWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            i.e(context, "context");
            i.e(workerParams, "workerParams");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0051  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(InterfaceC1218d interfaceC1218d) {
            NotificationGenerationWorkManager$NotificationGenerationWorker$doWork$1 notificationGenerationWorkManager$NotificationGenerationWorker$doWork$1;
            Object obj;
            int i2;
            NotificationGenerationWorker notificationGenerationWorker;
            String str;
            int intValue;
            JSONObject jSONObject;
            long currentTimeMillis;
            boolean booleanValue;
            Context applicationContext;
            Object nVar;
            String str2 = "NotificationWorker running doWork with data: ";
            try {
                if (interfaceC1218d instanceof NotificationGenerationWorkManager$NotificationGenerationWorker$doWork$1) {
                    notificationGenerationWorkManager$NotificationGenerationWorker$doWork$1 = (NotificationGenerationWorkManager$NotificationGenerationWorker$doWork$1) interfaceC1218d;
                    int i3 = notificationGenerationWorkManager$NotificationGenerationWorker$doWork$1.label;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        notificationGenerationWorkManager$NotificationGenerationWorker$doWork$1.label = i3 - Integer.MIN_VALUE;
                        NotificationGenerationWorkManager$NotificationGenerationWorker$doWork$1 notificationGenerationWorkManager$NotificationGenerationWorker$doWork$12 = notificationGenerationWorkManager$NotificationGenerationWorker$doWork$1;
                        obj = notificationGenerationWorkManager$NotificationGenerationWorker$doWork$12.result;
                        EnumC1260a enumC1260a = EnumC1260a.f11058a;
                        i2 = notificationGenerationWorkManager$NotificationGenerationWorker$doWork$12.label;
                        if (i2 != 0) {
                            g.y(obj);
                            Context applicationContext2 = getApplicationContext();
                            i.d(applicationContext2, "getApplicationContext(...)");
                            notificationGenerationWorkManager$NotificationGenerationWorker$doWork$12.L$0 = this;
                            notificationGenerationWorkManager$NotificationGenerationWorker$doWork$12.label = 1;
                            obj = OneSignal.initWithContext(applicationContext2, notificationGenerationWorkManager$NotificationGenerationWorker$doWork$12);
                            if (obj == enumC1260a) {
                                return enumC1260a;
                            }
                            notificationGenerationWorker = this;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str = (String) notificationGenerationWorkManager$NotificationGenerationWorker$doWork$12.L$0;
                                try {
                                    g.y(obj);
                                    nVar = q.a();
                                } catch (JSONException e3) {
                                    e = e3;
                                    Logging.error("Error occurred doing work for job with id: " + str, e);
                                    nVar = new n();
                                    Companion companion = NotificationGenerationWorkManager.Companion;
                                    i.b(str);
                                    companion.removeNotificationIdProcessed(str);
                                    return nVar;
                                }
                                Companion companion2 = NotificationGenerationWorkManager.Companion;
                                i.b(str);
                                companion2.removeNotificationIdProcessed(str);
                                return nVar;
                            }
                            notificationGenerationWorker = (NotificationGenerationWorker) notificationGenerationWorkManager$NotificationGenerationWorker$doWork$12.L$0;
                            g.y(obj);
                        }
                        if (((Boolean) obj).booleanValue()) {
                            Logging.warn$default("NotificationWorker skipped due to failed OneSignal initialization", null, 2, null);
                            return q.a();
                        }
                        INotificationGenerationProcessor iNotificationGenerationProcessor = (INotificationGenerationProcessor) OneSignal.INSTANCE.getServices().getService(INotificationGenerationProcessor.class);
                        s0.g inputData = notificationGenerationWorker.getInputData();
                        i.d(inputData, "getInputData(...)");
                        String b6 = inputData.b(NotificationGenerationWorkManager.OS_ID_DATA_PARAM);
                        if (b6 == null) {
                            return new n();
                        }
                        try {
                            Logging.debug$default("NotificationWorker running doWork with data: " + inputData, null, 2, null);
                            HashMap hashMap = inputData.f11778a;
                            Object obj2 = hashMap.get(NotificationGenerationWorkManager.ANDROID_NOTIF_ID_WORKER_DATA_PARAM);
                            intValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                            jSONObject = new JSONObject(inputData.b(NotificationGenerationWorkManager.JSON_PAYLOAD_WORKER_DATA_PARAM));
                            currentTimeMillis = System.currentTimeMillis() / 1000;
                            Object obj3 = hashMap.get("timestamp");
                            if (obj3 instanceof Long) {
                                currentTimeMillis = ((Long) obj3).longValue();
                            }
                            Object obj4 = hashMap.get(NotificationGenerationWorkManager.IS_RESTORING_WORKER_DATA_PARAM);
                            booleanValue = obj4 instanceof Boolean ? ((Boolean) obj4).booleanValue() : false;
                            applicationContext = notificationGenerationWorker.getApplicationContext();
                            i.d(applicationContext, "getApplicationContext(...)");
                            notificationGenerationWorkManager$NotificationGenerationWorker$doWork$12.L$0 = b6;
                            notificationGenerationWorkManager$NotificationGenerationWorker$doWork$12.label = 2;
                        } catch (JSONException e6) {
                            e = e6;
                            str = b6;
                            Logging.error("Error occurred doing work for job with id: " + str, e);
                            nVar = new n();
                            Companion companion22 = NotificationGenerationWorkManager.Companion;
                            i.b(str);
                            companion22.removeNotificationIdProcessed(str);
                            return nVar;
                        } catch (Throwable th) {
                            th = th;
                            str2 = b6;
                            Companion companion3 = NotificationGenerationWorkManager.Companion;
                            i.b(str2);
                            companion3.removeNotificationIdProcessed(str2);
                            throw th;
                        }
                        if (iNotificationGenerationProcessor.processNotificationData(applicationContext, intValue, jSONObject, booleanValue, currentTimeMillis, notificationGenerationWorkManager$NotificationGenerationWorker$doWork$12) == enumC1260a) {
                            return enumC1260a;
                        }
                        str = b6;
                        nVar = q.a();
                        Companion companion222 = NotificationGenerationWorkManager.Companion;
                        i.b(str);
                        companion222.removeNotificationIdProcessed(str);
                        return nVar;
                    }
                }
                if (i2 != 0) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
            notificationGenerationWorkManager$NotificationGenerationWorker$doWork$1 = new NotificationGenerationWorkManager$NotificationGenerationWorker$doWork$1(this, interfaceC1218d);
            NotificationGenerationWorkManager$NotificationGenerationWorker$doWork$1 notificationGenerationWorkManager$NotificationGenerationWorker$doWork$122 = notificationGenerationWorkManager$NotificationGenerationWorker$doWork$1;
            obj = notificationGenerationWorkManager$NotificationGenerationWorker$doWork$122.result;
            EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
            i2 = notificationGenerationWorkManager$NotificationGenerationWorker$doWork$122.label;
        }
    }

    @Override // com.onesignal.notifications.internal.generation.INotificationGenerationWorkManager
    public boolean beginEnqueueingWork(Context context, String osNotificationId, int i2, JSONObject jSONObject, long j2, boolean z, boolean z5) {
        i.e(context, "context");
        i.e(osNotificationId, "osNotificationId");
        String oSNotificationIdFromJson = NotificationFormatHelper.INSTANCE.getOSNotificationIdFromJson(jSONObject);
        if (oSNotificationIdFromJson == null) {
            Logging.debug$default("Notification beginEnqueueingWork with id null", null, 2, null);
            return false;
        }
        if (!Companion.addNotificationIdProcessed(oSNotificationIdFromJson)) {
            Logging.debug$default("Notification beginEnqueueingWork with id duplicated", null, 2, null);
            return true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(OS_ID_DATA_PARAM, oSNotificationIdFromJson);
        hashMap.put(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, Integer.valueOf(i2));
        hashMap.put(JSON_PAYLOAD_WORKER_DATA_PARAM, String.valueOf(jSONObject));
        hashMap.put("timestamp", Long.valueOf(j2));
        hashMap.put(IS_RESTORING_WORKER_DATA_PARAM, Boolean.valueOf(z));
        s0.g gVar = new s0.g(hashMap);
        s0.g.c(gVar);
        B4.i iVar = new B4.i(NotificationGenerationWorker.class);
        ((B0.q) iVar.f312c).f177e = gVar;
        t w3 = iVar.w();
        Logging.debug$default("NotificationWorkManager enqueueing notification work with notificationId: " + osNotificationId + " and jsonPayload: " + jSONObject, null, 2, null);
        y oSWorkManagerHelper = OSWorkManagerHelper.INSTANCE.getInstance(context);
        oSWorkManagerHelper.getClass();
        new k((o) oSWorkManagerHelper, osNotificationId, Collections.singletonList(w3)).E();
        return true;
    }
}
