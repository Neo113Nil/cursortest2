package com.google.android.gms.dynamite;

/* loaded from: classes4.dex */
public final class zzb {
    private static java.lang.ClassLoader zza;
    private static java.lang.Thread zzb;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ab, code lost:
    
        if (r1 == null) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.ClassLoader zza() {
        java.lang.ClassLoader classLoader;
        java.lang.SecurityException e;
        java.lang.Thread thread;
        java.lang.ThreadGroup threadGroup;
        synchronized (com.google.android.gms.dynamite.zzb.class) {
            if (zza == null) {
                java.lang.Thread thread2 = zzb;
                java.lang.ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    java.lang.ThreadGroup threadGroup2 = android.os.Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (java.lang.Void.class) {
                            try {
                                int activeGroupCount = threadGroup2.activeGroupCount();
                                java.lang.ThreadGroup[] threadGroupArr = new java.lang.ThreadGroup[activeGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= activeGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new java.lang.ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int activeCount = threadGroup.activeCount();
                                java.lang.Thread[] threadArr = new java.lang.Thread[activeCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= activeCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        com.google.android.gms.dynamite.zza zzaVar = new com.google.android.gms.dynamite.zza(threadGroup, "GmsDynamite");
                                        try {
                                            zzaVar.setContextClassLoader(null);
                                            zzaVar.start();
                                            thread = zzaVar;
                                        } catch (java.lang.SecurityException e2) {
                                            e = e2;
                                            thread = zzaVar;
                                            java.lang.String message = e.getMessage();
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 39);
                                            sb.append("Failed to enumerate thread/threadgroup ");
                                            sb.append(message);
                                            android.util.Log.w("DynamiteLoaderV2CL", sb.toString());
                                            thread2 = thread;
                                            zzb = thread2;
                                        }
                                    } catch (java.lang.SecurityException e3) {
                                        e = e3;
                                    }
                                }
                            } catch (java.lang.SecurityException e4) {
                                e = e4;
                                thread = null;
                            }
                        }
                        thread2 = thread;
                    }
                    zzb = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = zzb.getContextClassLoader();
                    } catch (java.lang.SecurityException e5) {
                        java.lang.String message2 = e5.getMessage();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(message2).length() + 41);
                        sb2.append("Failed to get thread context classloader ");
                        sb2.append(message2);
                        android.util.Log.w("DynamiteLoaderV2CL", sb2.toString());
                    }
                }
                zza = classLoader2;
            }
            classLoader = zza;
        }
        return classLoader;
    }
}
