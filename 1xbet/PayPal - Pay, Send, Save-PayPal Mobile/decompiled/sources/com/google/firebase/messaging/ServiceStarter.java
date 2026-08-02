package com.google.firebase.messaging;

/* loaded from: classes4.dex */
public class ServiceStarter {
    static final java.lang.String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    static final int ERROR_ILLEGAL_STATE_EXCEPTION = 402;
    static final int ERROR_ILLEGAL_STATE_EXCEPTION_FALLBACK_TO_BIND = 403;
    static final int ERROR_NOT_FOUND = 404;
    static final int ERROR_SECURITY_EXCEPTION = 401;
    public static final int ERROR_UNKNOWN = 500;
    private static final java.lang.String EXTRA_WRAPPED_INTENT = "wrapped_intent";
    private static final java.lang.String PERMISSIONS_MISSING_HINT = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    public static final int SUCCESS = -1;
    private static com.google.firebase.messaging.ServiceStarter instance;
    private java.lang.String firebaseMessagingServiceClassName = null;
    private java.lang.Boolean hasWakeLockPermission = null;
    private java.lang.Boolean hasAccessNetworkStatePermission = null;
    private final java.util.Queue<android.content.Intent> messagingEvents = new java.util.ArrayDeque();

    static com.google.firebase.messaging.ServiceStarter getInstance() {
        com.google.firebase.messaging.ServiceStarter serviceStarter;
        synchronized (com.google.firebase.messaging.ServiceStarter.class) {
            if (instance == null) {
                instance = new com.google.firebase.messaging.ServiceStarter();
            }
            serviceStarter = instance;
        }
        return serviceStarter;
    }

    private ServiceStarter() {
    }

    android.content.Intent getMessagingEvent() {
        return this.messagingEvents.poll();
    }

    public int startMessagingService(android.content.Context context, android.content.Intent intent) {
        this.messagingEvents.offer(intent);
        android.content.Intent intent2 = new android.content.Intent(ACTION_MESSAGING_EVENT);
        intent2.setPackage(context.getPackageName());
        return doStartService(context, intent2);
    }

    private int doStartService(android.content.Context context, android.content.Intent intent) {
        android.content.ComponentName startService;
        java.lang.String resolveServiceClassName = resolveServiceClassName(context, intent);
        if (resolveServiceClassName != null) {
            intent.setClassName(context.getPackageName(), resolveServiceClassName);
        }
        try {
            if (hasWakeLockPermission(context)) {
                startService = com.google.firebase.messaging.WakeLockHolder.startWakefulService(context, intent);
            } else {
                startService = context.startService(intent);
            }
            return startService == null ? 404 : -1;
        } catch (java.lang.IllegalStateException unused) {
            return 402;
        } catch (java.lang.SecurityException unused2) {
            return 401;
        }
    }

    private java.lang.String resolveServiceClassName(android.content.Context context, android.content.Intent intent) {
        synchronized (this) {
            java.lang.String str = this.firebaseMessagingServiceClassName;
            if (str != null) {
                return str;
            }
            android.content.pm.ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && resolveService.serviceInfo != null) {
                android.content.pm.ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                    if (serviceInfo.name.startsWith(".")) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(context.getPackageName());
                        sb.append(serviceInfo.name);
                        this.firebaseMessagingServiceClassName = sb.toString();
                    } else {
                        this.firebaseMessagingServiceClassName = serviceInfo.name;
                    }
                    return this.firebaseMessagingServiceClassName;
                }
                java.lang.String str2 = serviceInfo.packageName;
                java.lang.String str3 = serviceInfo.name;
                return null;
            }
            return null;
        }
    }

    boolean hasWakeLockPermission(android.content.Context context) {
        if (this.hasWakeLockPermission == null) {
            this.hasWakeLockPermission = java.lang.Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        return this.hasWakeLockPermission.booleanValue();
    }

    boolean hasAccessNetworkStatePermission(android.content.Context context) {
        if (this.hasAccessNetworkStatePermission == null) {
            this.hasAccessNetworkStatePermission = java.lang.Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        return this.hasAccessNetworkStatePermission.booleanValue();
    }

    public static void setForTesting(com.google.firebase.messaging.ServiceStarter serviceStarter) {
        instance = serviceStarter;
    }
}
