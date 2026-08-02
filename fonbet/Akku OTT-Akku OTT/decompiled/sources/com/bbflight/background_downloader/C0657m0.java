package com.bbflight.background_downloader;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.bbflight.background_downloader.C0682z0;
import com.bbflight.background_downloader.W0;
import com.haryanvi.netstream.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.time.DurationKt;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.channels.b;
import kotlinx.serialization.json.b;

@SourceDebugExtension({"SMAP\nNotifications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Notifications.kt\ncom/bbflight/background_downloader/NotificationService\n+ 2 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 5 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,960:1\n100#2:961\n96#3:962\n113#4:963\n113#4:974\n120#5,10:964\n1807#6,3:975\n*S KotlinDebug\n*F\n+ 1 Notifications.kt\ncom/bbflight/background_downloader/NotificationService\n*L\n309#1:961\n434#1:962\n441#1:963\n552#1:974\n460#1:964,10\n946#1:975,3\n*E\n"})
/* renamed from: com.bbflight.background_downloader.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0657m0 {
    public static final C0657m0 a = new C0657m0();
    public static final ConcurrentHashMap<String, Z> b = new ConcurrentHashMap<>();
    public static final kotlinx.coroutines.sync.c c = kotlinx.coroutines.sync.d.a();
    public static final kotlinx.coroutines.channels.b d = kotlinx.coroutines.channels.j.a(Integer.MAX_VALUE, null, 6);
    public static long e;
    public static boolean f;
    public static final Regex g;
    public static final Regex h;
    public static final Regex i;
    public static final Regex j;
    public static final Regex k;
    public static final Regex l;
    public static final Regex m;
    public static final Regex n;
    public static final Regex o;

    @DebugMetadata(c = "com.bbflight.background_downloader.NotificationService$1", f = "Notifications.kt", i = {1}, l = {289, 290}, m = "invokeSuspend", n = {"notificationData"}, nl = {290, 292}, s = {"L$1"}, v = 2)
    /* renamed from: com.bbflight.background_downloader.m0$a */
    public static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        public kotlinx.coroutines.channels.i a;
        public Object b;
        public int c;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
        
            if (com.bbflight.background_downloader.C0657m0.a(r6, r5) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
        
            if (r6 == r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005f -> B:6:0x0033). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.channels.i aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.b bVar = C0657m0.d;
                bVar.getClass();
                aVar = new b.a();
            } else if (i == 1) {
                aVar = this.a;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                C0655l0 c0655l0 = (C0655l0) aVar.next();
                C0657m0 c0657m0 = C0657m0.a;
                this.a = aVar;
                this.b = SpillingKt.nullOutSpilledVariable(c0655l0);
                this.c = 2;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.a;
                ResultKt.throwOnFailure(obj);
            }
            this.a = aVar;
            this.b = null;
            this.c = 1;
            obj = aVar.b(this);
        }
    }

    static {
        C1082i.c(kotlinx.coroutines.L.a(C1049c0.a), null, null, new a(2, null), 3);
        RegexOption regexOption = RegexOption.IGNORE_CASE;
        g = new Regex("\\{displayName\\}", regexOption);
        h = new Regex("\\{filename\\}", regexOption);
        i = new Regex("\\{progress\\}", regexOption);
        j = new Regex("\\{networkSpeed\\}", regexOption);
        k = new Regex("\\{timeRemaining\\}", regexOption);
        l = new Regex("\\{metadata\\}", regexOption);
        m = new Regex("\\{numFinished\\}", regexOption);
        n = new Regex("\\{numFailed\\}", regexOption);
        o = new Regex("\\{numTotal\\}", regexOption);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0136, code lost:
    
        if (r0 != r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0138, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006b, code lost:
    
        if (kotlinx.coroutines.W.b(200 - r6, r1) == r2) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0655l0 c0655l0, ContinuationImpl continuationImpl) {
        C0663p0 c0663p0;
        int i2;
        long currentTimeMillis;
        long j2;
        C0655l0 c0655l02;
        EnumC0668s0 enumC0668s0;
        TaskWorker taskWorker;
        NotificationCompat.Builder builder;
        Object obj;
        if (continuationImpl instanceof C0663p0) {
            c0663p0 = (C0663p0) continuationImpl;
            int i3 = c0663p0.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0663p0.e = i3 - Integer.MIN_VALUE;
                Object obj2 = c0663p0.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0663p0.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    currentTimeMillis = System.currentTimeMillis();
                    j2 = currentTimeMillis - e;
                    if (j2 < 200) {
                        c0655l02 = c0655l0;
                        c0663p0.a = c0655l02;
                        c0663p0.b = currentTimeMillis;
                        c0663p0.c = j2;
                        c0663p0.e = 1;
                    } else {
                        c0655l02 = c0655l0;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        e = System.currentTimeMillis();
                        return Unit.INSTANCE;
                    }
                    j2 = c0663p0.c;
                    currentTimeMillis = c0663p0.b;
                    C0655l0 c0655l03 = (C0655l0) c0663p0.a;
                    ResultKt.throwOnFailure(obj2);
                    c0655l02 = c0655l03;
                }
                enumC0668s0 = c0655l02.b;
                taskWorker = c0655l02.a;
                if (enumC0668s0 != null || (builder = c0655l02.c) == null) {
                    NotificationManagerCompat.from(taskWorker.getApplicationContext()).cancel(taskWorker.n);
                } else {
                    c0663p0.a = SpillingKt.nullOutSpilledVariable(c0655l02);
                    c0663p0.b = currentTimeMillis;
                    c0663p0.c = j2;
                    c0663p0.e = 2;
                    NotificationManagerCompat from = NotificationManagerCompat.from(taskWorker.getApplicationContext());
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 33) {
                        C0682z0.a aVar = C0682z0.Companion;
                        Context applicationContext = taskWorker.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        EnumC0680y0 enumC0680y0 = EnumC0680y0.a;
                        aVar.getClass();
                        if (C0682z0.a.a(applicationContext, enumC0680y0) != EnumC0678x0.b) {
                            obj = Unit.INSTANCE;
                        }
                    }
                    Notification build = builder.build();
                    Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                    if (!taskWorker.y) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j3 = currentTimeMillis2 - taskWorker.p;
                        taskWorker.p = currentTimeMillis2;
                        if (enumC0668s0 == EnumC0668s0.a || j3 > 2000) {
                            from.notify(taskWorker.n, build);
                        } else {
                            kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                            C1082i.c(kotlinx.coroutines.L.a(kotlinx.coroutines.internal.p.a), null, null, new C0661o0(j3, from, taskWorker, build, null), 3);
                        }
                    } else if (enumC0668s0 != EnumC0668s0.a || taskWorker.z || taskWorker.isStopped()) {
                        kotlinx.coroutines.scheduling.c cVar2 = C1049c0.a;
                        C1082i.c(kotlinx.coroutines.L.a(kotlinx.coroutines.internal.p.a), null, null, new C0659n0(from, taskWorker, build, null), 3);
                    } else if (i4 < 34) {
                    }
                    obj = Unit.INSTANCE;
                }
                e = System.currentTimeMillis();
                return Unit.INSTANCE;
            }
        }
        c0663p0 = new C0663p0(continuationImpl);
        Object obj22 = c0663p0.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0663p0.e;
        if (i2 != 0) {
        }
        enumC0668s0 = c0655l02.b;
        taskWorker = c0655l02.a;
        if (enumC0668s0 != null) {
        }
        NotificationManagerCompat.from(taskWorker.getApplicationContext()).cancel(taskWorker.n);
        e = System.currentTimeMillis();
        return Unit.INSTANCE;
    }

    public static void b(TaskWorker taskWorker, String str, EnumC0668s0 enumC0668s0, NotificationCompat.Builder builder) {
        Intent launchIntentForPackage = taskWorker.getApplicationContext().getPackageManager().getLaunchIntentForPackage(taskWorker.getApplicationContext().getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setPackage(null);
            launchIntentForPackage.setAction(NotificationReceiver.actionTap);
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            launchIntentForPackage.addFlags(536870912);
            launchIntentForPackage.putExtra(NotificationReceiver.keyTask, str);
            launchIntentForPackage.putExtra(NotificationReceiver.keyNotificationConfig, taskWorker.l);
            launchIntentForPackage.putExtra(NotificationReceiver.keyNotificationType, enumC0668s0.ordinal());
            launchIntentForPackage.putExtra(NotificationReceiver.keyNotificationId, taskWorker.n);
            PendingIntent activity = PendingIntent.getActivity(taskWorker.getApplicationContext(), taskWorker.n, launchIntentForPackage, 201326592);
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
            builder.setContentIntent(activity);
        }
    }

    public static Object c(TaskWorker taskWorker, EnumC0668s0 enumC0668s0, NotificationCompat.Builder builder, ContinuationImpl continuationImpl) {
        Object i2 = d.i(new C0655l0(taskWorker, enumC0668s0, builder), continuationImpl);
        return i2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? i2 : Unit.INSTANCE;
    }

    public static void d(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            String string = context.getString(R.string.bg_downloader_notification_channel_name);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(R.string.bg_downloader_notification_channel_description);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            androidx.browser.trusted.e.d();
            NotificationChannel b2 = androidx.compose.ui.graphics.z.b(string);
            b2.setDescription(string2);
            Object systemService = context.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(b2);
        }
        f = true;
    }

    public static void e(Context context, String taskJson, String str, Integer num) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskJson, "taskJson");
        OneTimeWorkRequest.Builder builder = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) UpdateNotificationWorker.class);
        Data.Builder putString = new Data.Builder().putString("Task", taskJson).putString("notificationConfig", str);
        Intrinsics.checkNotNullExpressionValue(putString, "putString(...)");
        if (num != null) {
            putString.putInt("taskStatusOrdinal", num.intValue());
        }
        Data build = putString.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        builder.setInputData(build);
        WorkManager workManager = WorkManager.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
        workManager.enqueue(builder.build());
    }

    public static void f(U item, boolean z) {
        int i2;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.c;
        if (str == null) {
            return;
        }
        b.a aVar = kotlinx.serialization.json.b.d;
        aVar.getClass();
        if (((C0654k0) aVar.a(C0654k0.Companion.serializer(), str)).g.length() > 0) {
            Context context = item.a;
            String b2 = aVar.b(M0.Companion.serializer(), item.b);
            if (z) {
                W0.a aVar2 = W0.Companion;
                i2 = 0;
            } else {
                W0.a aVar3 = W0.Companion;
                i2 = 4;
            }
            e(context, b2, str, Integer.valueOf(i2));
        }
    }

    public static String g(C0657m0 c0657m0, String str, M0 m0, double d2, double d3, Long l2, Z z, int i2) {
        String str2;
        StringBuilder sb;
        String str3;
        String sb2;
        String format;
        if ((i2 & 8) != 0) {
            d3 = -1.0d;
        }
        if ((i2 & 16) != 0) {
            l2 = null;
        }
        if ((i2 & 32) != 0) {
            z = null;
        }
        String replace = g.replace(h.replace(l.replace(str, m0.u), m0.d), m0.v);
        if (0.0d > d2 || d2 > 1.0d) {
            str2 = "";
        } else {
            str2 = MathKt.roundToInt(d2 * 100) + "%";
        }
        String replace2 = i.replace(replace, str2);
        if (d3 <= 0.0d) {
            sb2 = "-- MB/s";
        } else {
            if (d3 > 1.0d) {
                int roundToInt = MathKt.roundToInt(d3);
                sb = new StringBuilder();
                sb.append(roundToInt);
                str3 = " MB/s";
            } else {
                int roundToInt2 = MathKt.roundToInt(d3 * 1000);
                sb = new StringBuilder();
                sb.append(roundToInt2);
                str3 = " kB/s";
            }
            sb.append(str3);
            sb2 = sb.toString();
        }
        String replace3 = j.replace(replace2, sb2);
        if (l2 != null) {
            long longValue = l2.longValue() / DurationKt.MILLIS_IN_HOUR;
            long longValue2 = l2.longValue() % DurationKt.MILLIS_IN_HOUR;
            long j2 = (longValue2 + (DurationKt.MILLIS_IN_HOUR & (((longValue2 ^ DurationKt.MILLIS_IN_HOUR) & ((-longValue2) | longValue2)) >> 63))) / 60000;
            long longValue3 = l2.longValue() % 60000;
            long j3 = (longValue3 + (60000 & (((longValue3 ^ 60000) & ((-longValue3) | longValue3)) >> 63))) / 1000;
            if (l2.longValue() < 0) {
                format = "--:--";
            } else if (longValue > 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                format = String.format(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(longValue), Long.valueOf(j2), Long.valueOf(j3)}, 3));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                format = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3)}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            }
            replace3 = k.replace(replace3, format);
        }
        if (z == null) {
            return replace3;
        }
        return n.replace(m.replace(o.replace(replace3, String.valueOf(z.c.size())), String.valueOf(z.b())), String.valueOf(z.a()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1 A[Catch: all -> 0x00fc, TryCatch #0 {all -> 0x00fc, blocks: (B:30:0x00e7, B:32:0x00f1, B:33:0x0100, B:36:0x013c, B:98:0x011b), top: B:29:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b A[Catch: all -> 0x00fc, TryCatch #0 {all -> 0x00fc, blocks: (B:30:0x00e7, B:32:0x00f1, B:33:0x0100, B:36:0x013c, B:98:0x011b), top: B:29:0x00e7 }] */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, com.bbflight.background_downloader.Z] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r3v14, types: [kotlinx.coroutines.sync.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(TaskWorker taskWorker, String str, EnumC0668s0 enumC0668s0, ContinuationImpl continuationImpl) {
        C0665q0 c0665q0;
        int i2;
        kotlinx.coroutines.sync.c cVar;
        Ref.BooleanRef booleanRef;
        TaskWorker taskWorker2;
        EnumC0668s0 notificationType;
        Ref.ObjectRef objectRef;
        String str2;
        Z z;
        M0 task;
        ConcurrentHashMap<M0, EnumC0668s0> concurrentHashMap;
        boolean z2;
        S0 s0;
        String str3;
        double b2;
        C0665q0 c0665q02;
        boolean z3;
        boolean z4;
        Object obj;
        String str4;
        EnumC0668s0 enumC0668s02;
        S0 s02;
        TaskWorker taskWorker3;
        boolean z5;
        try {
            if (continuationImpl instanceof C0665q0) {
                c0665q0 = (C0665q0) continuationImpl;
                int i3 = c0665q0.p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0665q0.p = i3 - Integer.MIN_VALUE;
                    Object obj2 = c0665q0.n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = c0665q0.p;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj2);
                        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        c0665q0.a = taskWorker;
                        c0665q0.b = str;
                        c0665q0.c = enumC0668s0;
                        c0665q0.d = booleanRef2;
                        c0665q0.e = objectRef2;
                        cVar = c;
                        c0665q0.f = cVar;
                        c0665q0.p = 1;
                        if (cVar.d(c0665q0) != coroutine_suspended) {
                            booleanRef = booleanRef2;
                            taskWorker2 = taskWorker;
                            notificationType = enumC0668s0;
                            objectRef = objectRef2;
                            str2 = str;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 == 2) {
                            z4 = c0665q0.m;
                            z5 = c0665q0.l;
                        } else {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            z4 = c0665q0.m;
                            z5 = c0665q0.l;
                        }
                        s02 = (S0) c0665q0.f;
                        objectRef = (Ref.ObjectRef) c0665q0.e;
                        booleanRef = (Ref.BooleanRef) c0665q0.d;
                        enumC0668s02 = (EnumC0668s0) c0665q0.c;
                        str4 = (String) c0665q0.b;
                        taskWorker3 = (TaskWorker) c0665q0.a;
                        ResultKt.throwOnFailure(obj2);
                        z3 = z5;
                        obj = coroutine_suspended;
                        c0665q02 = c0665q0;
                        if (z4) {
                            kotlinx.coroutines.scheduling.c cVar2 = C1049c0.a;
                            C0666r0 c0666r0 = new C0666r0(objectRef, str4, null);
                            c0665q02.a = SpillingKt.nullOutSpilledVariable(taskWorker3);
                            c0665q02.b = SpillingKt.nullOutSpilledVariable(str4);
                            c0665q02.c = SpillingKt.nullOutSpilledVariable(enumC0668s02);
                            c0665q02.d = SpillingKt.nullOutSpilledVariable(booleanRef);
                            c0665q02.e = SpillingKt.nullOutSpilledVariable(objectRef);
                            c0665q02.f = SpillingKt.nullOutSpilledVariable(s02);
                            c0665q02.i = null;
                            c0665q02.j = null;
                            c0665q02.k = null;
                            c0665q02.l = z3;
                            c0665q02.m = z4;
                            c0665q02.p = 4;
                            if (C1082i.f(c0666r0, cVar2, c0665q02) == obj) {
                                return obj;
                            }
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    ?? r3 = (kotlinx.coroutines.sync.a) c0665q0.f;
                    Ref.ObjectRef objectRef3 = (Ref.ObjectRef) c0665q0.e;
                    Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) c0665q0.d;
                    EnumC0668s0 enumC0668s03 = (EnumC0668s0) c0665q0.c;
                    String str5 = (String) c0665q0.b;
                    TaskWorker taskWorker4 = (TaskWorker) c0665q0.a;
                    ResultKt.throwOnFailure(obj2);
                    cVar = r3;
                    str2 = str5;
                    objectRef = objectRef3;
                    notificationType = enumC0668s03;
                    booleanRef = booleanRef3;
                    taskWorker2 = taskWorker4;
                    ConcurrentHashMap concurrentHashMap2 = b;
                    z = (Z) concurrentHashMap2.get(str2);
                    ?? r11 = z;
                    if (z == null) {
                        C0654k0 c0654k0 = taskWorker2.m;
                        Intrinsics.checkNotNull(c0654k0);
                        r11 = new Z(str2, c0654k0);
                    }
                    objectRef.element = r11;
                    task = taskWorker2.k();
                    Intrinsics.checkNotNullParameter(task, "task");
                    Intrinsics.checkNotNullParameter(notificationType, "notificationType");
                    concurrentHashMap = r11.c;
                    if (concurrentHashMap.get(task) != notificationType) {
                        int b3 = r11.b() + (r11.c.size() * 1000);
                        concurrentHashMap.put(task, notificationType);
                        if (b3 != r11.b() + (r11.c.size() * 1000)) {
                            z2 = true;
                            booleanRef.element = z2;
                            concurrentHashMap2.put(str2, objectRef.element);
                            Unit unit = Unit.INSTANCE;
                            cVar.c(null);
                            if (booleanRef.element) {
                                taskWorker2.n = ("groupNotification" + ((Z) objectRef.element).a).hashCode();
                                boolean z6 = ((Z) objectRef.element).a() > 0;
                                Z z7 = (Z) objectRef.element;
                                boolean z8 = z7.b() == z7.c.size();
                                if (z8) {
                                    Z z9 = (Z) objectRef.element;
                                    s0 = z6 ? z9.b.c : z9.b.b;
                                } else {
                                    s0 = ((Z) objectRef.element).b.a;
                                }
                                if (s0 == null) {
                                    c0665q0.a = SpillingKt.nullOutSpilledVariable(taskWorker2);
                                    c0665q0.b = str2;
                                    c0665q0.c = SpillingKt.nullOutSpilledVariable(notificationType);
                                    c0665q0.d = SpillingKt.nullOutSpilledVariable(booleanRef);
                                    c0665q0.e = objectRef;
                                    c0665q0.f = SpillingKt.nullOutSpilledVariable(s0);
                                    c0665q0.l = z6;
                                    c0665q0.m = z8;
                                    c0665q0.p = 2;
                                    if (c(taskWorker2, null, null, c0665q0) != coroutine_suspended) {
                                        S0 s03 = s0;
                                        enumC0668s02 = notificationType;
                                        s02 = s03;
                                        taskWorker3 = taskWorker2;
                                        str4 = str2;
                                        z5 = z6;
                                        z4 = z8;
                                        z3 = z5;
                                        obj = coroutine_suspended;
                                        c0665q02 = c0665q0;
                                        if (z4) {
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                                if (!f) {
                                    Context applicationContext = taskWorker2.getApplicationContext();
                                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                                    d(applicationContext);
                                }
                                NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(taskWorker2.getApplicationContext(), "background_downloader").setPriority(-1).setSmallIcon(z8 ? z6 ? R.drawable.outline_error_outline_24 : R.drawable.outline_download_done_24 : taskWorker2.k().d() ? R.drawable.outline_file_download_24 : R.drawable.outline_file_upload_24);
                                Intrinsics.checkNotNullExpressionValue(smallIcon, "setSmallIcon(...)");
                                if (((Z) objectRef.element).c.size() == 0) {
                                    str3 = str2;
                                    b2 = 2.0d;
                                } else {
                                    str3 = str2;
                                    b2 = r5.b() / r10.size();
                                }
                                double d2 = b2;
                                String str6 = str3;
                                Ref.ObjectRef objectRef4 = objectRef;
                                Ref.BooleanRef booleanRef4 = booleanRef;
                                S0 s04 = s0;
                                boolean z10 = z8;
                                C0665q0 c0665q03 = c0665q0;
                                boolean z11 = z6;
                                EnumC0668s0 enumC0668s04 = notificationType;
                                String g2 = g(this, s0.a, taskWorker2.k(), d2, 0.0d, null, (Z) objectRef.element, 24);
                                if (g2.length() > 0) {
                                    smallIcon.setContentTitle(g2);
                                }
                                String g3 = g(this, s04.b, taskWorker2.k(), d2, 0.0d, null, (Z) objectRef4.element, 24);
                                if (g3.length() > 0) {
                                    smallIcon.setContentText(g3);
                                }
                                C0654k0 c0654k02 = ((Z) objectRef4.element).b;
                                if (c0654k02.e && Intrinsics.areEqual(s04, c0654k02.a) && d2 >= 0.0d) {
                                    if (d2 <= 1.0d) {
                                        smallIcon.setProgress(100, MathKt.roundToInt(d2 * 100), false);
                                    } else {
                                        smallIcon.setProgress(100, 0, true);
                                    }
                                }
                                Z z12 = (Z) objectRef4.element;
                                b(taskWorker2, "", enumC0668s04, smallIcon);
                                if (enumC0668s04 == EnumC0668s0.a) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString(NotificationReceiver.keyGroupNotificationName, z12.a);
                                    Intent intent = new Intent(taskWorker2.getApplicationContext(), (Class<?>) NotificationReceiver.class);
                                    intent.setAction(NotificationReceiver.actionCancelActive);
                                    intent.putExtra(NotificationReceiver.keyBundle, bundle);
                                    PendingIntent broadcast = PendingIntent.getBroadcast(taskWorker2.getApplicationContext(), ("groupNotification" + z12.a).hashCode(), intent, 67108864);
                                    Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
                                    BDPlugin.INSTANCE.getClass();
                                    smallIcon.addAction(R.drawable.outline_cancel_24, (CharSequence) BDPlugin.i.get("Cancel"), broadcast);
                                }
                                c0665q02 = c0665q03;
                                c0665q02.a = SpillingKt.nullOutSpilledVariable(taskWorker2);
                                c0665q02.b = str6;
                                c0665q02.c = SpillingKt.nullOutSpilledVariable(enumC0668s04);
                                c0665q02.d = SpillingKt.nullOutSpilledVariable(booleanRef4);
                                c0665q02.e = objectRef4;
                                c0665q02.f = SpillingKt.nullOutSpilledVariable(s04);
                                c0665q02.i = SpillingKt.nullOutSpilledVariable(smallIcon);
                                c0665q02.j = SpillingKt.nullOutSpilledVariable(g2);
                                c0665q02.k = SpillingKt.nullOutSpilledVariable(g3);
                                z3 = z11;
                                c0665q02.l = z3;
                                z4 = z10;
                                c0665q02.m = z4;
                                c0665q02.p = 3;
                                obj = coroutine_suspended;
                                if (c(taskWorker2, enumC0668s04, smallIcon, c0665q02) == obj) {
                                    return obj;
                                }
                                str4 = str6;
                                objectRef = objectRef4;
                                enumC0668s02 = enumC0668s04;
                                s02 = s04;
                                booleanRef = booleanRef4;
                                taskWorker3 = taskWorker2;
                                if (z4) {
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    z2 = false;
                    booleanRef.element = z2;
                    concurrentHashMap2.put(str2, objectRef.element);
                    Unit unit2 = Unit.INSTANCE;
                    cVar.c(null);
                    if (booleanRef.element) {
                    }
                    return Unit.INSTANCE;
                }
            }
            ConcurrentHashMap concurrentHashMap22 = b;
            z = (Z) concurrentHashMap22.get(str2);
            ?? r112 = z;
            if (z == null) {
            }
            objectRef.element = r112;
            task = taskWorker2.k();
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(notificationType, "notificationType");
            concurrentHashMap = r112.c;
            if (concurrentHashMap.get(task) != notificationType) {
            }
            z2 = false;
            booleanRef.element = z2;
            concurrentHashMap22.put(str2, objectRef.element);
            Unit unit22 = Unit.INSTANCE;
            cVar.c(null);
            if (booleanRef.element) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            cVar.c(null);
            throw th;
        }
        c0665q0 = new C0665q0(this, continuationImpl);
        Object obj22 = c0665q0.n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0665q0.p;
        if (i2 != 0) {
        }
    }

    @SuppressLint({"MissingPermission"})
    public final Object i(TaskWorker taskWorker, W0 w0, double d2, long j2, ContinuationImpl continuationImpl) {
        S0 s0;
        int i2;
        int ordinal = w0.ordinal();
        EnumC0668s0 enumC0668s0 = (ordinal == 0 || ordinal == 1) ? EnumC0668s0.a : ordinal != 2 ? ordinal != 7 ? EnumC0668s0.c : EnumC0668s0.d : EnumC0668s0.b;
        C0654k0 c0654k0 = taskWorker.m;
        String str = c0654k0 != null ? c0654k0.g : null;
        if (str != null && str.length() > 0) {
            if (d2 == 2.0d && j2 == -1000) {
                Object h2 = h(taskWorker, str, enumC0668s0, continuationImpl);
                if (h2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return h2;
                }
            }
            return Unit.INSTANCE;
        }
        if (w0 == W0.b) {
            return Unit.INSTANCE;
        }
        int ordinal2 = enumC0668s0.ordinal();
        if (ordinal2 == 0) {
            C0654k0 c0654k02 = taskWorker.m;
            if (c0654k02 != null) {
                s0 = c0654k02.a;
            }
            s0 = null;
        } else if (ordinal2 == 1) {
            C0654k0 c0654k03 = taskWorker.m;
            if (c0654k03 != null) {
                s0 = c0654k03.b;
            }
            s0 = null;
        } else if (ordinal2 == 2) {
            C0654k0 c0654k04 = taskWorker.m;
            if (c0654k04 != null) {
                s0 = c0654k04.c;
            }
            s0 = null;
        } else {
            if (ordinal2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            C0654k0 c0654k05 = taskWorker.m;
            if (c0654k05 != null) {
                s0 = c0654k05.d;
            }
            s0 = null;
        }
        if (s0 == null) {
            Object c2 = c(taskWorker, null, null, continuationImpl);
            return c2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c2 : Unit.INSTANCE;
        }
        taskWorker.n = taskWorker.k().a.hashCode();
        if (!f) {
            Context applicationContext = taskWorker.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            d(applicationContext);
        }
        int ordinal3 = enumC0668s0.ordinal();
        if (ordinal3 == 0) {
            i2 = taskWorker.k().d() ? R.drawable.outline_file_download_24 : R.drawable.outline_file_upload_24;
        } else if (ordinal3 == 1) {
            i2 = R.drawable.outline_download_done_24;
        } else if (ordinal3 == 2) {
            i2 = R.drawable.outline_error_outline_24;
        } else {
            if (ordinal3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.drawable.outline_pause_24;
        }
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(taskWorker.getApplicationContext(), "background_downloader").setPriority(-1).setSmallIcon(i2);
        Intrinsics.checkNotNullExpressionValue(smallIcon, "setSmallIcon(...)");
        EnumC0668s0 enumC0668s02 = EnumC0668s0.d;
        taskWorker.o = enumC0668s0 == enumC0668s02 ? taskWorker.o : d2;
        String g2 = g(this, s0.a, taskWorker.k(), taskWorker.o, taskWorker.j, Boxing.boxLong(j2), null, 32);
        if (g2.length() > 0) {
            smallIcon.setContentTitle(g2);
        }
        String g3 = g(this, s0.b, taskWorker.k(), taskWorker.o, taskWorker.j, Boxing.boxLong(j2), null, 32);
        if (g3.length() > 0) {
            smallIcon.setContentText(g3);
        }
        C0654k0 c0654k06 = taskWorker.m;
        if ((c0654k06 != null ? c0654k06.e : false) && (enumC0668s0 == EnumC0668s0.a || enumC0668s0 == enumC0668s02)) {
            double d3 = taskWorker.o;
            if (d3 >= 0.0d) {
                if (d3 <= 1.0d) {
                    smallIcon.setProgress(100, MathKt.roundToInt(d3 * 100), false);
                } else {
                    smallIcon.setProgress(100, 0, true);
                }
            }
        }
        b.a aVar = kotlinx.serialization.json.b.d;
        M0 k2 = taskWorker.k();
        aVar.getClass();
        String b2 = aVar.b(M0.Companion.serializer(), k2);
        b(taskWorker, b2, enumC0668s0, smallIcon);
        int ordinal4 = enumC0668s0.ordinal();
        if (ordinal4 == 0) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationReceiver.keyTaskId, taskWorker.k().a);
            Intent intent = new Intent(taskWorker.getApplicationContext(), (Class<?>) NotificationReceiver.class);
            intent.setAction(NotificationReceiver.actionCancelActive);
            intent.putExtra(NotificationReceiver.keyBundle, bundle);
            PendingIntent broadcast = PendingIntent.getBroadcast(taskWorker.getApplicationContext(), taskWorker.n, intent, 67108864);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            BDPlugin.INSTANCE.getClass();
            LinkedHashMap linkedHashMap = BDPlugin.i;
            smallIcon.addAction(R.drawable.outline_cancel_24, (CharSequence) linkedHashMap.get("Cancel"), broadcast);
            if (taskWorker.d) {
                C0654k0 c0654k07 = taskWorker.m;
                if ((c0654k07 != null ? c0654k07.d : null) != null) {
                    Intent intent2 = new Intent(taskWorker.getApplicationContext(), (Class<?>) NotificationReceiver.class);
                    intent2.setAction(NotificationReceiver.actionPause);
                    intent2.putExtra(NotificationReceiver.keyBundle, bundle);
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(taskWorker.getApplicationContext(), taskWorker.n, intent2, 67108864);
                    Intrinsics.checkNotNullExpressionValue(broadcast2, "getBroadcast(...)");
                    smallIcon.addAction(R.drawable.outline_pause_24, (CharSequence) linkedHashMap.get("Pause"), broadcast2);
                }
            }
        } else if (ordinal4 != 1 && ordinal4 != 2) {
            if (ordinal4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(NotificationReceiver.keyTaskId, taskWorker.k().a);
            bundle2.putString(NotificationReceiver.keyTask, b2);
            Intent intent3 = new Intent(taskWorker.getApplicationContext(), (Class<?>) NotificationReceiver.class);
            intent3.setAction(NotificationReceiver.actionCancelInactive);
            intent3.putExtra(NotificationReceiver.keyBundle, bundle2);
            PendingIntent broadcast3 = PendingIntent.getBroadcast(taskWorker.getApplicationContext(), taskWorker.n, intent3, 67108864);
            Intrinsics.checkNotNullExpressionValue(broadcast3, "getBroadcast(...)");
            BDPlugin.INSTANCE.getClass();
            LinkedHashMap linkedHashMap2 = BDPlugin.i;
            smallIcon.addAction(R.drawable.outline_cancel_24, (CharSequence) linkedHashMap2.get("Cancel"), broadcast3);
            Bundle bundle3 = new Bundle();
            bundle3.putString(NotificationReceiver.keyTaskId, taskWorker.k().a);
            bundle3.putString(NotificationReceiver.keyTask, b2);
            bundle3.putString(NotificationReceiver.keyNotificationConfig, taskWorker.l);
            Intent intent4 = new Intent(taskWorker.getApplicationContext(), (Class<?>) NotificationReceiver.class);
            intent4.setAction(NotificationReceiver.actionResume);
            intent4.putExtra(NotificationReceiver.keyBundle, bundle3);
            PendingIntent broadcast4 = PendingIntent.getBroadcast(taskWorker.getApplicationContext(), taskWorker.n, intent4, 67108864);
            Intrinsics.checkNotNullExpressionValue(broadcast4, "getBroadcast(...)");
            Intrinsics.checkNotNull(smallIcon.addAction(R.drawable.outline_play_arrow_24, (CharSequence) linkedHashMap2.get("Resume"), broadcast4));
        }
        Object c3 = c(taskWorker, enumC0668s0, smallIcon, continuationImpl);
        return c3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c3 : Unit.INSTANCE;
    }
}
