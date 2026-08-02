package dev.fluttercommunity.workmanager;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import dev.fluttercommunity.workmanager.g;
import dev.fluttercommunity.workmanager.i;
import dev.fluttercommunity.workmanager.pigeon.C0981b;
import dev.fluttercommunity.workmanager.pigeon.EnumC0980a;
import dev.fluttercommunity.workmanager.pigeon.k;
import dev.fluttercommunity.workmanager.pigeon.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nWorkManagerUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkManagerUtils.kt\ndev/fluttercommunity/workmanager/WorkManagerWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1#2:254\n221#3:255\n222#3:284\n4253#4,12:256\n37#5,2:268\n37#5,2:282\n812#6,12:270\n*S KotlinDebug\n*F\n+ 1 WorkManagerUtils.kt\ndev/fluttercommunity/workmanager/WorkManagerWrapper\n*L\n211#1:255\n211#1:284\n222#1:256,12\n222#1:268,2\n228#1:282,2\n228#1:270,12\n*E\n"})
/* loaded from: classes4.dex */
public final class h {
    public final Context a;
    public final WorkManager b;

    public h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = WorkManager.INSTANCE.getInstance(context);
    }

    public static Data a(String str, Map map) {
        Data.Builder putString = new Data.Builder().putString("dev.fluttercommunity.workmanager.DART_TASK", str);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    putString.putString(defpackage.g.a("payload_", str2), (String) value);
                } else if (value instanceof Boolean) {
                    putString.putBoolean(defpackage.g.a("payload_", str2), ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    putString.putInt(defpackage.g.a("payload_", str2), ((Number) value).intValue());
                } else if (value instanceof Long) {
                    putString.putLong(defpackage.g.a("payload_", str2), ((Number) value).longValue());
                } else if (value instanceof Float) {
                    putString.putFloat(defpackage.g.a("payload_", str2), ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    putString.putDouble(defpackage.g.a("payload_", str2), ((Number) value).doubleValue());
                } else if (value instanceof Object[]) {
                    String a = defpackage.g.a("payload_", str2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (Object[]) value) {
                        if (obj instanceof String) {
                            arrayList.add(obj);
                        }
                    }
                    putString.putStringArray(a, (String[]) arrayList.toArray(new String[0]));
                } else if (value instanceof List) {
                    String a2 = defpackage.g.a("payload_", str2);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : (Iterable) value) {
                        if (obj2 instanceof String) {
                            arrayList2.add(obj2);
                        }
                    }
                    putString.putStringArray(a2, (String[]) arrayList2.toArray(new String[0]));
                } else {
                    if (!(value instanceof byte[])) {
                        StringBuilder a3 = androidx.appcompat.view.a.a("Unsupported payload type for key '", str2, "': ");
                        a3.append(value.getClass().getSimpleName());
                        a3.append(". Consider converting it to a supported type.");
                        throw new IllegalArgumentException(a3.toString());
                    }
                    putString.putByteArray(defpackage.g.a("payload_", str2), (byte[]) value);
                }
            }
        }
        return putString.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        if (r6 == null) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(dev.fluttercommunity.workmanager.pigeon.i request) {
        Constraints constraints;
        ExistingWorkPolicy existingWorkPolicy;
        OutOfQuotaPolicy outOfQuotaPolicy;
        BackoffPolicy backoffPolicy;
        Intrinsics.checkNotNullParameter(request, "request");
        OneTimeWorkRequest.Builder builder = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) BackgroundWorker.class);
        String str = request.b;
        Map<String, Object> map = request.c;
        OneTimeWorkRequest.Builder inputData = builder.setInputData(a(str, map != null ? g.a(map) : null));
        Long l = request.d;
        OneTimeWorkRequest.Builder initialDelay = inputData.setInitialDelay(l != null ? l.longValue() : 0L, TimeUnit.SECONDS);
        dev.fluttercommunity.workmanager.pigeon.c cVar = request.e;
        if (cVar == null || (constraints = g.b(cVar)) == null) {
            constraints = g.c;
        }
        OneTimeWorkRequest.Builder constraints2 = initialDelay.setConstraints(constraints);
        C0981b c0981b = request.f;
        if (c0981b != null) {
            Long l2 = c0981b.b;
            EnumC0980a enumC0980a = c0981b.a;
            if (enumC0980a != null && l2 != null) {
                int i = g.a.$EnumSwitchMapping$4[enumC0980a.ordinal()];
                if (i == 1) {
                    backoffPolicy = BackoffPolicy.EXPONENTIAL;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    backoffPolicy = BackoffPolicy.LINEAR;
                }
                constraints2.setBackoffCriteria(backoffPolicy, l2.longValue(), TimeUnit.MILLISECONDS);
            }
        }
        String str2 = request.g;
        if (str2 != null) {
            constraints2.addTag(str2);
        }
        dev.fluttercommunity.workmanager.pigeon.j jVar = request.i;
        if (jVar != null) {
            int i2 = g.a.$EnumSwitchMapping$2[jVar.ordinal()];
            if (i2 == 1) {
                outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                outOfQuotaPolicy = OutOfQuotaPolicy.DROP_WORK_REQUEST;
            }
            if (outOfQuotaPolicy != null) {
                constraints2.setExpedited(outOfQuotaPolicy);
            }
        }
        OneTimeWorkRequest build = constraints2.build();
        String str3 = request.a;
        dev.fluttercommunity.workmanager.pigeon.e eVar = request.h;
        if (eVar != null) {
            int i3 = g.a.$EnumSwitchMapping$0[eVar.ordinal()];
            if (i3 == 1) {
                existingWorkPolicy = ExistingWorkPolicy.APPEND_OR_REPLACE;
            } else if (i3 == 2) {
                existingWorkPolicy = ExistingWorkPolicy.KEEP;
            } else if (i3 == 3) {
                existingWorkPolicy = ExistingWorkPolicy.REPLACE;
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                existingWorkPolicy = ExistingWorkPolicy.APPEND_OR_REPLACE;
            }
        }
        existingWorkPolicy = g.a;
        this.b.enqueueUniqueWork(str3, existingWorkPolicy, build);
        f taskInfo = new f(request.b, request.a, map != null ? g.a(map) : null, System.currentTimeMillis(), null, null, 48);
        i.b bVar = i.Companion;
        m status = m.b;
        bVar.getClass();
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskInfo, "taskInfo");
        Intrinsics.checkNotNullParameter(status, "status");
        i.a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskInfo, "taskInfo");
        Intrinsics.checkNotNullParameter(status, "status");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (r6 == null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(k request) {
        Constraints constraints;
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy;
        BackoffPolicy backoffPolicy;
        Intrinsics.checkNotNullParameter(request, "request");
        long j = request.c;
        Map<String, Object> map = request.e;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Long l = request.d;
        PeriodicWorkRequest.Builder inputData = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) BackgroundWorker.class, j, timeUnit, l != null ? l.longValue() : 300L, timeUnit).setInputData(a(request.b, map != null ? g.a(map) : null));
        Long l2 = request.f;
        PeriodicWorkRequest.Builder initialDelay = inputData.setInitialDelay(l2 != null ? l2.longValue() : 0L, timeUnit);
        dev.fluttercommunity.workmanager.pigeon.c cVar = request.g;
        if (cVar == null || (constraints = g.b(cVar)) == null) {
            constraints = g.c;
        }
        PeriodicWorkRequest.Builder constraints2 = initialDelay.setConstraints(constraints);
        C0981b c0981b = request.h;
        if (c0981b != null) {
            Long l3 = c0981b.b;
            EnumC0980a enumC0980a = c0981b.a;
            if (enumC0980a != null && l3 != null) {
                int i = g.a.$EnumSwitchMapping$4[enumC0980a.ordinal()];
                if (i == 1) {
                    backoffPolicy = BackoffPolicy.EXPONENTIAL;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    backoffPolicy = BackoffPolicy.LINEAR;
                }
                constraints2.setBackoffCriteria(backoffPolicy, l3.longValue(), TimeUnit.MILLISECONDS);
            }
        }
        String str = request.i;
        if (str != null) {
            constraints2.addTag(str);
        }
        PeriodicWorkRequest build = constraints2.build();
        String str2 = request.a;
        dev.fluttercommunity.workmanager.pigeon.d dVar = request.j;
        if (dVar != null) {
            int i2 = g.a.$EnumSwitchMapping$1[dVar.ordinal()];
            if (i2 == 1) {
                existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.KEEP;
            } else if (i2 == 2) {
                existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.REPLACE;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.UPDATE;
            }
        }
        existingPeriodicWorkPolicy = g.b;
        this.b.enqueueUniquePeriodicWork(str2, existingPeriodicWorkPolicy, build);
        f taskInfo = new f(request.b, request.a, map != null ? g.a(map) : null, System.currentTimeMillis(), null, null, 48);
        i.b bVar = i.Companion;
        m status = m.b;
        bVar.getClass();
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskInfo, "taskInfo");
        Intrinsics.checkNotNullParameter(status, "status");
        i.a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskInfo, "taskInfo");
        Intrinsics.checkNotNullParameter(status, "status");
    }
}
