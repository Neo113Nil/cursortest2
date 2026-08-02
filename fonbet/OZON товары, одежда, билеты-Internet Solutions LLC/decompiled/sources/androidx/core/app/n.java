package androidx.core.app;

import C.o0;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import androidx.annotation.NonNull;
import c.InterfaceC5692a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    private static String f42007d;

    /* renamed from: g, reason: collision with root package name */
    private static f f42010g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f42011a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f42012b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f42006c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static HashSet f42008e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f42009f = new Object();

    /* loaded from: classes8.dex */
    static class a {
        static List<StatusBarNotification> a(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    static class b {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    static class c {
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* loaded from: classes8.dex */
    private static class d implements g {

        /* renamed from: a, reason: collision with root package name */
        final String f42013a;

        /* renamed from: b, reason: collision with root package name */
        final int f42014b;

        /* renamed from: c, reason: collision with root package name */
        final String f42015c;

        /* renamed from: d, reason: collision with root package name */
        final Notification f42016d;

        d(String str, int i11, String str2, Notification notification) {
            this.f42013a = str;
            this.f42014b = i11;
            this.f42015c = str2;
            this.f42016d = notification;
        }

        @Override // androidx.core.app.n.g
        public final void a(InterfaceC5692a interfaceC5692a) throws RemoteException {
            interfaceC5692a.p(this.f42013a, this.f42014b, this.f42015c, this.f42016d);
        }

        @NonNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
            sb2.append(this.f42013a);
            sb2.append(", id:");
            sb2.append(this.f42014b);
            sb2.append(", tag:");
            return o0.c(sb2, this.f42015c, "]");
        }
    }

    /* loaded from: classes8.dex */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f42017a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f42018b;

        e(ComponentName componentName, IBinder iBinder) {
            this.f42017a = componentName;
            this.f42018b = iBinder;
        }
    }

    /* loaded from: classes8.dex */
    private static class f implements Handler.Callback, ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final Context f42019a;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f42020b;

        /* renamed from: c, reason: collision with root package name */
        private final HashMap f42021c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        private Set<String> f42022d = new HashSet();

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            final ComponentName f42023a;

            /* renamed from: c, reason: collision with root package name */
            InterfaceC5692a f42025c;

            /* renamed from: b, reason: collision with root package name */
            boolean f42024b = false;

            /* renamed from: d, reason: collision with root package name */
            ArrayDeque<g> f42026d = new ArrayDeque<>();

            /* renamed from: e, reason: collision with root package name */
            int f42027e = 0;

            a(ComponentName componentName) {
                this.f42023a = componentName;
            }
        }

        f(Context context) {
            this.f42019a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f42020b = new Handler(handlerThread.getLooper(), this);
        }

        private void a(a aVar) {
            boolean z11;
            ArrayDeque<g> arrayDeque;
            boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
            ComponentName componentName = aVar.f42023a;
            if (isLoggable) {
                Log.d("NotifManCompat", "Processing component " + componentName + ", " + aVar.f42026d.size() + " queued tasks");
            }
            if (aVar.f42026d.isEmpty()) {
                return;
            }
            if (aVar.f42024b) {
                z11 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f42019a;
                boolean bindService = context.bindService(component, this, 33);
                aVar.f42024b = bindService;
                if (bindService) {
                    aVar.f42027e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z11 = aVar.f42024b;
            }
            if (!z11 || aVar.f42025c == null) {
                c(aVar);
                return;
            }
            while (true) {
                arrayDeque = aVar.f42026d;
                g peek = arrayDeque.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + peek);
                    }
                    peek.a(aVar.f42025c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e11) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e11);
                }
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            c(aVar);
        }

        private void c(a aVar) {
            Handler handler = this.f42020b;
            ComponentName componentName = aVar.f42023a;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i11 = aVar.f42027e;
            int i12 = i11 + 1;
            aVar.f42027e = i12;
            if (i12 <= 6) {
                int i13 = (1 << i11) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i13 + " ms");
                }
                handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i13);
                return;
            }
            StringBuilder sb2 = new StringBuilder("Giving up on delivering ");
            ArrayDeque<g> arrayDeque = aVar.f42026d;
            sb2.append(arrayDeque.size());
            sb2.append(" tasks to ");
            sb2.append(componentName);
            sb2.append(" after ");
            sb2.append(aVar.f42027e);
            sb2.append(" retries");
            Log.w("NotifManCompat", sb2.toString());
            arrayDeque.clear();
        }

        public final void b(d dVar) {
            this.f42020b.obtainMessage(0, dVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i11 = message.what;
            HashMap hashMap = this.f42021c;
            Context context = this.f42019a;
            if (i11 == 0) {
                g gVar = (g) message.obj;
                Set<String> g10 = n.g(context);
                if (!g10.equals(this.f42022d)) {
                    this.f42022d = g10;
                    List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet hashSet = new HashSet();
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        if (((HashSet) g10).contains(resolveInfo.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ComponentName componentName2 = (ComponentName) it.next();
                        if (!hashMap.containsKey(componentName2)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                            }
                            hashMap.put(componentName2, new a(componentName2));
                        }
                    }
                    Iterator it2 = hashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        if (!hashSet.contains(entry.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                            }
                            a aVar = (a) entry.getValue();
                            if (aVar.f42024b) {
                                context.unbindService(this);
                                aVar.f42024b = false;
                            }
                            aVar.f42025c = null;
                            it2.remove();
                        }
                    }
                }
                for (a aVar2 : hashMap.values()) {
                    aVar2.f42026d.add(gVar);
                    a(aVar2);
                }
            } else if (i11 == 1) {
                e eVar = (e) message.obj;
                a aVar3 = (a) hashMap.get(eVar.f42017a);
                if (aVar3 != null) {
                    aVar3.f42025c = InterfaceC5692a.AbstractBinderC0842a.H(eVar.f42018b);
                    aVar3.f42027e = 0;
                    a(aVar3);
                    return true;
                }
            } else if (i11 == 2) {
                a aVar4 = (a) hashMap.get((ComponentName) message.obj);
                if (aVar4 != null) {
                    if (aVar4.f42024b) {
                        context.unbindService(this);
                        aVar4.f42024b = false;
                    }
                    aVar4.f42025c = null;
                    return true;
                }
            } else {
                if (i11 != 3) {
                    return false;
                }
                a aVar5 = (a) hashMap.get((ComponentName) message.obj);
                if (aVar5 != null) {
                    a(aVar5);
                    return true;
                }
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f42020b.obtainMessage(1, new e(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f42020b.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* loaded from: classes8.dex */
    private interface g {
        void a(InterfaceC5692a interfaceC5692a) throws RemoteException;
    }

    private n(Context context) {
        this.f42011a = context;
        this.f42012b = (NotificationManager) context.getSystemService("notification");
    }

    @NonNull
    public static n e(@NonNull Context context) {
        return new n(context);
    }

    @NonNull
    public static Set<String> g(@NonNull Context context) {
        HashSet hashSet;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f42006c) {
            if (string != null) {
                try {
                    if (!string.equals(f42007d)) {
                        String[] split = string.split(ProductContainerDTO.RATIO_DELIMITER, -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        f42008e = hashSet2;
                        f42007d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            hashSet = f42008e;
        }
        return hashSet;
    }

    public final boolean a() {
        return b.a(this.f42012b);
    }

    public final void b(int i11) {
        this.f42012b.cancel(null, i11);
    }

    public final void c(@NonNull NotificationChannel notificationChannel) {
        c.a(this.f42012b, notificationChannel);
    }

    public final void d(@NonNull String str) {
        c.e(this.f42012b, str);
    }

    @NonNull
    public final List<StatusBarNotification> f() {
        return a.a(this.f42012b);
    }

    public final NotificationChannel h(@NonNull String str) {
        return c.i(this.f42012b, str);
    }

    @NonNull
    public final List<NotificationChannel> i() {
        return c.k(this.f42012b);
    }

    public final void j(@NonNull Notification notification, int i11, String str) {
        Bundle a11 = l.a(notification);
        NotificationManager notificationManager = this.f42012b;
        if (a11 == null || !a11.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(str, i11, notification);
            return;
        }
        d dVar = new d(this.f42011a.getPackageName(), i11, str, notification);
        synchronized (f42009f) {
            try {
                if (f42010g == null) {
                    f42010g = new f(this.f42011a.getApplicationContext());
                }
                f42010g.b(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notificationManager.cancel(str, i11);
    }
}
