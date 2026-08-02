package w1;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.flurry.android.marketing.FlurryMarketingUtils;
import com.flurry.android.marketing.messaging.notification.FlurryFCMNotification;
import com.flurry.android.marketing.messaging.notification.FlurryMessage;
import com.flurry.android.marketing.messaging.notification.FlurryNotificationFilter;
import com.flurry.android.marketing.messaging.notification.NotificationCancelledReceiver;
import com.flurry.android.marketing.messaging.notification.NotificationClickedActivity;
import com.flurry.android.marketing.messaging.notification.NotificationClickedReceiver;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: w1.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1739q1 {

    /* renamed from: a, reason: collision with root package name */
    public static String f17833a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f17834b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1727n1 f17835c = new C1727n1();

    /* renamed from: d, reason: collision with root package name */
    public static final FlurryNotificationFilter f17836d = new FlurryNotificationFilter.Builder().withNextPath("fl.Data").withListener(new C1731o1()).build();

    public static FlurryMessage a(Intent intent) {
        Object parcelable;
        if (intent != null) {
            try {
                if (intent.getExtras() != null) {
                    if (Build.VERSION.SDK_INT < 33) {
                        return (FlurryMessage) intent.getExtras().getParcelable("flurryMessage");
                    }
                    parcelable = intent.getExtras().getParcelable("flurryMessage", FlurryMessage.class);
                    return (FlurryMessage) parcelable;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static void b(Context context, Intent intent) {
        FlurryMessage a2 = a(intent);
        if (a2 == null) {
            AbstractC1706i0.o(3, "No flurry message received in the clicked notification.");
            return;
        }
        a2.getNotificationId();
        T0 a4 = T0.a();
        if (a4.f17543g) {
            AbstractC1706i0.o(5, "Cold Start time is already measured, reportLaunched will be ignored.");
        } else {
            Context context2 = AbstractC1707i1.f17743c;
            Runtime runtime = Runtime.getRuntime();
            ActivityManager.MemoryInfo a7 = AbstractC1706i0.a(context2);
            long nanoTime = System.nanoTime();
            T0.f17536k = nanoTime;
            a4.f17537a = nanoTime;
            a4.f17538b = runtime.totalMemory() - runtime.freeMemory();
            a4.f17539c = a7.totalMem - a7.availMem;
        }
        AbstractC1715k1.e(new com.flurry.android.marketing.messaging.notification.b(11, a2, context, false));
        if (AbstractC1715k1.n()) {
            d("Flurry.PushOpened", a2.getFlurryData());
        }
    }

    public static void c(Context context, String str, String str2) {
        NotificationChannel notificationChannel;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel == null) {
            HashMap hashMap = new HashMap(5);
            hashMap.put("2", 4);
            hashMap.put("1", 4);
            hashMap.put("-2", 1);
            hashMap.put("-1", 2);
            int i7 = 3;
            hashMap.put("0", 3);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    i7 = hashMap.containsKey(str2) ? ((Integer) hashMap.get(str2)).intValue() : Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                    "Invalid notification  value from payload: ".concat(String.valueOf(str2));
                }
            }
            NotificationChannel c3 = n3.b.c(i7, str);
            c3.setDescription("General news and announcements");
            c3.enableLights(true);
            c3.enableVibration(true);
            c3.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(c3);
        }
    }

    public static void d(String str, HashMap hashMap) {
        if (hashMap == null) {
            AbstractC1706i0.q("Attempting to log notification event with a non flurry notification.");
            return;
        }
        C1702h0 c1702h0 = H2.a().f17406k;
        c1702h0.getClass();
        c1702h0.d(new C1694f0(3, 0, c1702h0, true));
        Collections.emptyMap();
        r.i().j(str, 4, hashMap);
        Collections.emptyMap();
        C1702h0 c1702h02 = H2.a().f17406k;
        c1702h02.getClass();
        c1702h02.d(new C1694f0(3, 1, c1702h02, true));
    }

    public static void e(boolean z4, Handler handler) {
        f17834b = z4;
        if (z4) {
            new FlurryMarketingUtils.FirebaseTokenAgent().start(new C1735p1());
        }
        C1719l1 r7 = C1719l1.r();
        synchronized (r7) {
            r7.f17771a = handler;
        }
        FlurryFCMNotification.getInstance().addNotificationListener("flurryMarketing", f17835c);
        f17833a = FlurryFCMNotification.getInstance().addNotificationFilter(f17836d);
    }

    public static boolean f(RemoteMessage remoteMessage) {
        if (remoteMessage != null && remoteMessage.getData() != null && !TextUtils.isEmpty((CharSequence) remoteMessage.getData().get("fl.Data")) && remoteMessage.getNotification() == null) {
            return true;
        }
        AbstractC1706i0.q("Can't convert FCM message to Flurry Message as this was not a Flurry based notification.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x013a, code lost:
    
        if (r1.targetSdkVersion >= 26) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0035, code lost:
    
        if (r2.getDrawable(r1) != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0125 A[Catch: NameNotFoundException | RuntimeException -> 0x013d, TryCatch #3 {NameNotFoundException | RuntimeException -> 0x013d, blocks: (B:19:0x0111, B:21:0x011b, B:25:0x0125, B:27:0x0134, B:29:0x0138, B:32:0x012e), top: B:18:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e A[Catch: NameNotFoundException | RuntimeException -> 0x013d, TryCatch #3 {NameNotFoundException | RuntimeException -> 0x013d, blocks: (B:19:0x0111, B:21:0x011b, B:25:0x0125, B:27:0x0134, B:29:0x0138, B:32:0x012e), top: B:18:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Context context, FlurryMessage flurryMessage) {
        int i7;
        PendingIntent broadcast;
        int parseInt;
        int i8;
        String color;
        int parseColor;
        int identifier;
        String str;
        NotificationChannel notificationChannel;
        NotificationChannel notificationChannel2;
        PackageManager packageManager;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        if (flurryMessage == null) {
            AbstractC1706i0.q("Can't show or log a null notification object.");
            return;
        }
        F.w wVar = new F.w(context, "default notification");
        String icon = flurryMessage.getIcon();
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(icon) || (i7 = resources.getIdentifier(icon, "drawable", context.getPackageName())) == 0) {
            i7 = AbstractC1715k1.f17762e;
            if (i7 != -1) {
                try {
                } catch (Resources.NotFoundException e7) {
                    AbstractC1706i0.o(5, "Error getting default icon from marketing: ".concat(String.valueOf(e7)));
                }
            } else {
                AbstractC1706i0.o(3, "No default icon provided for push notification, falling back to app icon.");
            }
            try {
                i7 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).icon;
            } catch (PackageManager.NameNotFoundException e8) {
                e8.printStackTrace();
                i7 = 0;
            }
        }
        int notificationId = flurryMessage.getNotificationId();
        if (Build.VERSION.SDK_INT >= 31) {
            Intent intent = new Intent(context, (Class<?>) NotificationClickedActivity.class);
            intent.putExtra("flurryMessage", flurryMessage);
            broadcast = PendingIntent.getActivity(context, flurryMessage.notificationId, intent, 201326592);
        } else {
            Intent intent2 = new Intent(context, (Class<?>) NotificationClickedReceiver.class);
            intent2.putExtra("flurryMessage", flurryMessage);
            broadcast = PendingIntent.getBroadcast(context, flurryMessage.notificationId, intent2, 201326592);
        }
        Intent intent3 = new Intent(context, (Class<?>) NotificationCancelledReceiver.class);
        intent3.putExtra("flurryMessage", flurryMessage);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, flurryMessage.notificationId, intent3, 201326592);
        String priority = flurryMessage.getPriority();
        if (!TextUtils.isEmpty(priority)) {
            try {
                parseInt = Integer.parseInt(priority);
            } catch (NumberFormatException unused) {
                "Invalid notification priority from payload: ".concat(String.valueOf(priority));
            }
            F.u uVar = new F.u();
            uVar.f2476b = F.w.b(flurryMessage.getTitle());
            uVar.f2455c = F.w.b(flurryMessage.getBody());
            wVar.f2473s.icon = i7;
            wVar.f2460e = F.w.b(flurryMessage.getTitle());
            wVar.f2461f = F.w.b(flurryMessage.getBody());
            wVar.c(16);
            wVar.f2462g = broadcast;
            Notification notification = wVar.f2473s;
            notification.deleteIntent = broadcast2;
            notification.defaults = 6;
            notification.flags |= 1;
            wVar.f2464i = parseInt;
            wVar.e(uVar);
            i8 = Build.VERSION.SDK_INT;
            if (i8 >= 26 && i8 >= 26) {
                try {
                    packageManager = context.getPackageManager();
                    String packageName = context.getPackageName();
                    if (packageManager != null && !TextUtils.isEmpty(packageName)) {
                        if (i8 < 33) {
                            of = PackageManager.PackageInfoFlags.of(0L);
                            packageInfo = packageManager.getPackageInfo(packageName, of);
                        } else {
                            packageInfo = packageManager.getPackageInfo(packageName, 0);
                        }
                        if (packageInfo != null && (r1 = packageInfo.applicationInfo) != null) {
                        }
                    }
                } catch (PackageManager.NameNotFoundException | RuntimeException unused2) {
                }
                String priority2 = flurryMessage.getPriority();
                str = AbstractC1715k1.f17761d;
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str)) {
                        notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str);
                        if (notificationChannel != null) {
                            String str2 = context.getPackageName() + ".flurry";
                            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                            notificationChannel2 = notificationManager.getNotificationChannel(str2);
                            if (notificationChannel2 != null) {
                                notificationManager.deleteNotificationChannel(str2);
                            }
                        }
                    }
                    AbstractC1706i0.q("A default notification channel id was specified, but the channel itself was not created.Flurry will create and post the notification on Flurry's default channel.");
                    c(context, str, priority2);
                } else {
                    AbstractC1706i0.q("A default notification channel id was NOT specified.Flurry will create and post the notification on Flurry's default channel.");
                    str = context.getPackageName() + ".flurry";
                    c(context, str, priority2);
                }
                wVar.f2471q = str;
            }
            color = flurryMessage.getColor();
            if (!TextUtils.isEmpty(color)) {
                try {
                    parseColor = Color.parseColor(color);
                } catch (Exception unused3) {
                }
                if (parseColor != -1) {
                    wVar.f2469o = parseColor;
                } else {
                    int i9 = AbstractC1715k1.f17763f;
                    if (i9 != -1) {
                        wVar.f2469o = i9;
                    }
                }
                if (!TextUtils.isEmpty(flurryMessage.getSound())) {
                    String sound = flurryMessage.getSound();
                    Uri defaultUri = RingtoneManager.getDefaultUri(2);
                    if (!TextUtils.isEmpty(sound) && (identifier = context.getResources().getIdentifier(sound, "raw", context.getPackageName())) != 0) {
                        defaultUri = Uri.parse(String.format(Locale.getDefault(), "android.resource://%s/%d", context.getPackageName(), Integer.valueOf(identifier)));
                    }
                    defaultUri.toString();
                    Notification notification2 = wVar.f2473s;
                    notification2.sound = defaultUri;
                    notification2.audioStreamType = -1;
                    notification2.audioAttributes = F.v.a(F.v.e(F.v.c(F.v.b(), 4), 5));
                }
                ((NotificationManager) context.getSystemService("notification")).notify(notificationId, wVar.a());
            }
            parseColor = -1;
            if (parseColor != -1) {
            }
            if (!TextUtils.isEmpty(flurryMessage.getSound())) {
            }
            ((NotificationManager) context.getSystemService("notification")).notify(notificationId, wVar.a());
        }
        parseInt = 0;
        F.u uVar2 = new F.u();
        uVar2.f2476b = F.w.b(flurryMessage.getTitle());
        uVar2.f2455c = F.w.b(flurryMessage.getBody());
        wVar.f2473s.icon = i7;
        wVar.f2460e = F.w.b(flurryMessage.getTitle());
        wVar.f2461f = F.w.b(flurryMessage.getBody());
        wVar.c(16);
        wVar.f2462g = broadcast;
        Notification notification3 = wVar.f2473s;
        notification3.deleteIntent = broadcast2;
        notification3.defaults = 6;
        notification3.flags |= 1;
        wVar.f2464i = parseInt;
        wVar.e(uVar2);
        i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            packageManager = context.getPackageManager();
            String packageName2 = context.getPackageName();
            if (packageManager != null) {
                if (i8 < 33) {
                }
                if (packageInfo != null) {
                }
            }
            String priority22 = flurryMessage.getPriority();
            str = AbstractC1715k1.f17761d;
            if (TextUtils.isEmpty(str)) {
            }
            wVar.f2471q = str;
        }
        color = flurryMessage.getColor();
        if (!TextUtils.isEmpty(color)) {
        }
        parseColor = -1;
        if (parseColor != -1) {
        }
        if (!TextUtils.isEmpty(flurryMessage.getSound())) {
        }
        ((NotificationManager) context.getSystemService("notification")).notify(notificationId, wVar.a());
    }
}
