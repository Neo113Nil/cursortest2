package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzch {
    private static final java.lang.reflect.Method zza;
    private static final java.lang.reflect.Method zzb;

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        java.lang.reflect.Method declaredMethod;
        java.lang.reflect.Method method = null;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod = android.app.job.JobScheduler.class.getDeclaredMethod("scheduleAsPackage", android.app.job.JobInfo.class, java.lang.String.class, java.lang.Integer.TYPE, java.lang.String.class);
            } catch (java.lang.NoSuchMethodException unused) {
                if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                    android.util.Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                }
            }
            zza = declaredMethod;
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                try {
                    method = android.os.UserHandle.class.getDeclaredMethod("myUserId", new java.lang.Class[0]);
                } catch (java.lang.NoSuchMethodException unused2) {
                    if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                        android.util.Log.e("JobSchedulerCompat", "No myUserId method available");
                    }
                }
            }
            zzb = method;
        }
        declaredMethod = null;
        zza = declaredMethod;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
        }
        zzb = method;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(android.content.Context context, android.app.job.JobInfo jobInfo, java.lang.String str, java.lang.String str2) {
        java.lang.Integer num;
        int intValue;
        java.lang.reflect.Method method;
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) com.google.common.base.Preconditions.checkNotNull((android.app.job.JobScheduler) context.getSystemService("jobscheduler"));
        if (zza == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        java.lang.reflect.Method method2 = zzb;
        if (method2 != null) {
            try {
                num = (java.lang.Integer) method2.invoke(android.os.UserHandle.class, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
                if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                    android.util.Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
            if (num != null) {
                intValue = num.intValue();
                method = zza;
                if (method != null) {
                    try {
                        java.lang.Integer num2 = (java.lang.Integer) method.invoke(jobScheduler, jobInfo, "com.google.android.gms", java.lang.Integer.valueOf(intValue), "UploadAlarm");
                        if (num2 != null) {
                            return num2.intValue();
                        }
                        return 0;
                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
                        android.util.Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
                    }
                }
                return jobScheduler.schedule(jobInfo);
            }
        }
        intValue = 0;
        method = zza;
        if (method != null) {
        }
        return jobScheduler.schedule(jobInfo);
    }
}
