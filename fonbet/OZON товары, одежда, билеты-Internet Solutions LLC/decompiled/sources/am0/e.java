package am0;

import Sc.InterfaceC4008j;
import Sc.s;
import am0.C5033a;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import androidx.core.app.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import bb.InterfaceC5614a;
import eb.C6338b;
import eb.EnumC6337a;
import eb.EnumC6339c;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import xe.d1;
import xe.f1;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f36858a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final f f36859b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final C5033a f36860c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final nb.c f36861d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC5614a f36862e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final Za.d f36863f;

    public e(@NotNull Context context, @NotNull f notificationCreator, @NotNull C5033a manifestReader, @NotNull nb.c imageDownloader, @NotNull InterfaceC5614a analyticsSender) {
        Za.d logger = Pl0.f.f22652a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationCreator, "notificationCreator");
        Intrinsics.checkNotNullParameter(manifestReader, "manifestReader");
        Intrinsics.checkNotNullParameter(imageDownloader, "imageDownloader");
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f36858a = context;
        this.f36859b = notificationCreator;
        this.f36860c = manifestReader;
        this.f36861d = imageDownloader;
        this.f36862e = analyticsSender;
        this.f36863f = logger.c("NotificationController");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull C6338b c6338b, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        e eVar;
        C6338b notification;
        Bitmap bitmap;
        String f7;
        Pair pair;
        String e11;
        Pair pair2;
        String b11;
        String str;
        NotificationManager notificationManager;
        Pair pair3;
        Integer num;
        String c11;
        String clickAction;
        EnumC6337a d11;
        Intent intent;
        NotificationManager notificationManager2;
        int identifier;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f36857h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f36857h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f36855f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f36857h;
                if (i11 != 0) {
                    s.b(obj);
                    this.f36863f.info("Show notification requested");
                    String g10 = c6338b.g();
                    if (g10 != null) {
                        dVar.f36853d = this;
                        dVar.f36854e = c6338b;
                        dVar.f36857h = 1;
                        obj = b(g10, dVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        eVar = this;
                        notification = c6338b;
                    } else {
                        eVar = this;
                        notification = c6338b;
                        bitmap = null;
                        int hashCode = UUID.randomUUID().hashCode();
                        eVar.getClass();
                        f7 = notification.f();
                        InterfaceC4008j interfaceC4008j = eVar.f36860c.f36841b;
                        Context context = eVar.f36858a;
                        if (f7 != null || h.K(f7) || (identifier = context.getResources().getIdentifier(notification.f(), "drawable", context.getPackageName())) == 0) {
                            Integer num2 = ((C5033a.C0710a) interfaceC4008j.getValue()).f36842a;
                            pair = num2 != null ? new Pair(num2, EnumC6339c.MANIFEST) : new Pair(Integer.valueOf(R.drawable.vkpns_default_notification_icon), EnumC6339c.DEFAULT_SDK);
                        } else {
                            pair = new Pair(Integer.valueOf(identifier), EnumC6339c.PAYLOAD);
                        }
                        e11 = notification.e();
                        Za.d dVar2 = eVar.f36863f;
                        if (e11 != null && !h.K(e11)) {
                            try {
                                pair2 = new Pair(Integer.valueOf(Color.parseColor(notification.e())), EnumC6339c.PAYLOAD);
                            } catch (IllegalArgumentException unused) {
                                dVar2.error("Could not parse color: " + notification.e(), null);
                            }
                            b11 = notification.b();
                            if (b11 != null || h.K(b11)) {
                                str = ((C5033a.C0710a) interfaceC4008j.getValue()).f36844c;
                                if (str != null || h.K(str)) {
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    String string = context.getString(R.string.vkpns_default_notification_channel_name);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…otification_channel_name)");
                                    NotificationChannel notificationChannel = new NotificationChannel("ru.mail.vkpns.default_notification_channel", string, 3);
                                    notificationManager = (NotificationManager) androidx.core.content.a.getSystemService(context, NotificationManager.class);
                                    if (notificationManager != null) {
                                        notificationManager.createNotificationChannel(notificationChannel);
                                    }
                                    dVar2.info("Using default channel");
                                    pair3 = new Pair("ru.mail.vkpns.default_notification_channel", EnumC6339c.DEFAULT_SDK);
                                } else {
                                    dVar2.info("Using channel from manifest: ".concat(str));
                                    pair3 = new Pair(str, EnumC6339c.MANIFEST);
                                }
                            } else {
                                dVar2.info("Using channel from payload: " + notification.b());
                                String b12 = notification.b();
                                Intrinsics.f(b12);
                                pair3 = new Pair(b12, EnumC6339c.PAYLOAD);
                            }
                            f fVar = eVar.f36859b;
                            String title = notification.h();
                            String a11 = notification.a();
                            int intValue = ((Number) pair.e()).intValue();
                            num = (Integer) pair2.e();
                            c11 = notification.c();
                            if (c11 != null) {
                                if (h.K(c11)) {
                                    c11 = null;
                                }
                                if (c11 != null) {
                                    clickAction = c11;
                                    d11 = notification.d();
                                    Pair pair4 = pair3;
                                    String channelId = (String) pair3.e();
                                    Pair pair5 = pair;
                                    Intrinsics.checkNotNullParameter(title, "title");
                                    Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                                    Intrinsics.checkNotNullParameter(channelId, "channelId");
                                    Context context2 = fVar.f36864a;
                                    l.d dVar3 = new l.d(context2, channelId);
                                    dVar3.j(title);
                                    dVar3.i(a11);
                                    if (d11 != EnumC6337a.DEEP_LINK && clickAction.length() > 0) {
                                        intent = new Intent("android.intent.action.VIEW", Uri.parse(clickAction));
                                    } else if (clickAction.equals("android.intent.action.MAIN")) {
                                        intent = new Intent(clickAction);
                                    } else {
                                        intent = context2.getPackageManager().getLaunchIntentForPackage(context2.getPackageName());
                                        if (intent == null) {
                                            intent = new Intent(clickAction);
                                        }
                                    }
                                    Intrinsics.checkNotNullParameter(intent, "intent");
                                    intent.putExtra("vkpns.click_event_marker", "");
                                    intent.putExtra("vkpns.click_event_marker.request_code", hashCode);
                                    intent.setPackage(context2.getPackageName());
                                    intent.setFlags(335544320);
                                    PendingIntent activity = PendingIntent.getActivity(context2, hashCode, intent, 201326592);
                                    Intrinsics.checkNotNullExpressionValue(activity, "getActivity(\n           …ngIntentFlags()\n        )");
                                    dVar3.h(activity);
                                    dVar3.C(intValue);
                                    if (num != null) {
                                        dVar3.g(num.intValue());
                                    }
                                    if (bitmap != null) {
                                        dVar3.s(bitmap);
                                        l.b bVar = new l.b();
                                        bVar.e(bitmap);
                                        bVar.d();
                                        dVar3.F(bVar);
                                    }
                                    dVar3.d(true);
                                    Notification b13 = dVar3.b();
                                    Intrinsics.checkNotNullExpressionValue(b13, "Builder(context, channel…l(true)\n        }.build()");
                                    notificationManager2 = (NotificationManager) androidx.core.content.a.getSystemService(context, NotificationManager.class);
                                    if (notificationManager2 != null) {
                                        return Unit.f71690a;
                                    }
                                    notificationManager2.notify(hashCode, b13);
                                    EnumC6339c iconType = (EnumC6339c) pair5.f();
                                    EnumC6339c colorType = (EnumC6339c) pair2.f();
                                    EnumC6339c channelType = (EnumC6339c) pair4.f();
                                    Intrinsics.checkNotNullParameter(notification, "notification");
                                    Intrinsics.checkNotNullParameter(iconType, "iconType");
                                    Intrinsics.checkNotNullParameter(colorType, "colorType");
                                    Intrinsics.checkNotNullParameter(channelType, "channelType");
                                    eVar.f36862e.a(new ib.c(notification, iconType, colorType, channelType));
                                    return Unit.f71690a;
                                }
                            }
                            clickAction = "android.intent.action.MAIN";
                            d11 = notification.d();
                            Pair pair42 = pair3;
                            String channelId2 = (String) pair3.e();
                            Pair pair52 = pair;
                            Intrinsics.checkNotNullParameter(title, "title");
                            Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                            Intrinsics.checkNotNullParameter(channelId2, "channelId");
                            Context context22 = fVar.f36864a;
                            l.d dVar32 = new l.d(context22, channelId2);
                            dVar32.j(title);
                            dVar32.i(a11);
                            if (d11 != EnumC6337a.DEEP_LINK) {
                            }
                            if (clickAction.equals("android.intent.action.MAIN")) {
                            }
                            Intrinsics.checkNotNullParameter(intent, "intent");
                            intent.putExtra("vkpns.click_event_marker", "");
                            intent.putExtra("vkpns.click_event_marker.request_code", hashCode);
                            intent.setPackage(context22.getPackageName());
                            intent.setFlags(335544320);
                            PendingIntent activity2 = PendingIntent.getActivity(context22, hashCode, intent, 201326592);
                            Intrinsics.checkNotNullExpressionValue(activity2, "getActivity(\n           …ngIntentFlags()\n        )");
                            dVar32.h(activity2);
                            dVar32.C(intValue);
                            if (num != null) {
                            }
                            if (bitmap != null) {
                            }
                            dVar32.d(true);
                            Notification b132 = dVar32.b();
                            Intrinsics.checkNotNullExpressionValue(b132, "Builder(context, channel…l(true)\n        }.build()");
                            notificationManager2 = (NotificationManager) androidx.core.content.a.getSystemService(context, NotificationManager.class);
                            if (notificationManager2 != null) {
                            }
                        }
                        pair2 = new Pair(((C5033a.C0710a) interfaceC4008j.getValue()).f36843b, EnumC6339c.MANIFEST);
                        b11 = notification.b();
                        if (b11 != null) {
                        }
                        str = ((C5033a.C0710a) interfaceC4008j.getValue()).f36844c;
                        if (str != null) {
                        }
                        Intrinsics.checkNotNullParameter(context, "context");
                        String string2 = context.getString(R.string.vkpns_default_notification_channel_name);
                        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…otification_channel_name)");
                        NotificationChannel notificationChannel2 = new NotificationChannel("ru.mail.vkpns.default_notification_channel", string2, 3);
                        notificationManager = (NotificationManager) androidx.core.content.a.getSystemService(context, NotificationManager.class);
                        if (notificationManager != null) {
                        }
                        dVar2.info("Using default channel");
                        pair3 = new Pair("ru.mail.vkpns.default_notification_channel", EnumC6339c.DEFAULT_SDK);
                        f fVar2 = eVar.f36859b;
                        String title2 = notification.h();
                        String a112 = notification.a();
                        int intValue2 = ((Number) pair.e()).intValue();
                        num = (Integer) pair2.e();
                        c11 = notification.c();
                        if (c11 != null) {
                        }
                        clickAction = "android.intent.action.MAIN";
                        d11 = notification.d();
                        Pair pair422 = pair3;
                        String channelId22 = (String) pair3.e();
                        Pair pair522 = pair;
                        Intrinsics.checkNotNullParameter(title2, "title");
                        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                        Intrinsics.checkNotNullParameter(channelId22, "channelId");
                        Context context222 = fVar2.f36864a;
                        l.d dVar322 = new l.d(context222, channelId22);
                        dVar322.j(title2);
                        dVar322.i(a112);
                        if (d11 != EnumC6337a.DEEP_LINK) {
                        }
                        if (clickAction.equals("android.intent.action.MAIN")) {
                        }
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        intent.putExtra("vkpns.click_event_marker", "");
                        intent.putExtra("vkpns.click_event_marker.request_code", hashCode);
                        intent.setPackage(context222.getPackageName());
                        intent.setFlags(335544320);
                        PendingIntent activity22 = PendingIntent.getActivity(context222, hashCode, intent, 201326592);
                        Intrinsics.checkNotNullExpressionValue(activity22, "getActivity(\n           …ngIntentFlags()\n        )");
                        dVar322.h(activity22);
                        dVar322.C(intValue2);
                        if (num != null) {
                        }
                        if (bitmap != null) {
                        }
                        dVar322.d(true);
                        Notification b1322 = dVar322.b();
                        Intrinsics.checkNotNullExpressionValue(b1322, "Builder(context, channel…l(true)\n        }.build()");
                        notificationManager2 = (NotificationManager) androidx.core.content.a.getSystemService(context, NotificationManager.class);
                        if (notificationManager2 != null) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    notification = dVar.f36854e;
                    eVar = dVar.f36853d;
                    s.b(obj);
                }
                bitmap = (Bitmap) obj;
                int hashCode2 = UUID.randomUUID().hashCode();
                eVar.getClass();
                f7 = notification.f();
                InterfaceC4008j interfaceC4008j2 = eVar.f36860c.f36841b;
                Context context3 = eVar.f36858a;
                if (f7 != null) {
                }
                Integer num22 = ((C5033a.C0710a) interfaceC4008j2.getValue()).f36842a;
                if (num22 != null) {
                }
                e11 = notification.e();
                Za.d dVar22 = eVar.f36863f;
                if (e11 != null) {
                    pair2 = new Pair(Integer.valueOf(Color.parseColor(notification.e())), EnumC6339c.PAYLOAD);
                    b11 = notification.b();
                    if (b11 != null) {
                    }
                    str = ((C5033a.C0710a) interfaceC4008j2.getValue()).f36844c;
                    if (str != null) {
                    }
                    Intrinsics.checkNotNullParameter(context3, "context");
                    String string22 = context3.getString(R.string.vkpns_default_notification_channel_name);
                    Intrinsics.checkNotNullExpressionValue(string22, "context.getString(R.stri…otification_channel_name)");
                    NotificationChannel notificationChannel22 = new NotificationChannel("ru.mail.vkpns.default_notification_channel", string22, 3);
                    notificationManager = (NotificationManager) androidx.core.content.a.getSystemService(context3, NotificationManager.class);
                    if (notificationManager != null) {
                    }
                    dVar22.info("Using default channel");
                    pair3 = new Pair("ru.mail.vkpns.default_notification_channel", EnumC6339c.DEFAULT_SDK);
                    f fVar22 = eVar.f36859b;
                    String title22 = notification.h();
                    String a1122 = notification.a();
                    int intValue22 = ((Number) pair.e()).intValue();
                    num = (Integer) pair2.e();
                    c11 = notification.c();
                    if (c11 != null) {
                    }
                    clickAction = "android.intent.action.MAIN";
                    d11 = notification.d();
                    Pair pair4222 = pair3;
                    String channelId222 = (String) pair3.e();
                    Pair pair5222 = pair;
                    Intrinsics.checkNotNullParameter(title22, "title");
                    Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                    Intrinsics.checkNotNullParameter(channelId222, "channelId");
                    Context context2222 = fVar22.f36864a;
                    l.d dVar3222 = new l.d(context2222, channelId222);
                    dVar3222.j(title22);
                    dVar3222.i(a1122);
                    if (d11 != EnumC6337a.DEEP_LINK) {
                    }
                    if (clickAction.equals("android.intent.action.MAIN")) {
                    }
                    Intrinsics.checkNotNullParameter(intent, "intent");
                    intent.putExtra("vkpns.click_event_marker", "");
                    intent.putExtra("vkpns.click_event_marker.request_code", hashCode2);
                    intent.setPackage(context2222.getPackageName());
                    intent.setFlags(335544320);
                    PendingIntent activity222 = PendingIntent.getActivity(context2222, hashCode2, intent, 201326592);
                    Intrinsics.checkNotNullExpressionValue(activity222, "getActivity(\n           …ngIntentFlags()\n        )");
                    dVar3222.h(activity222);
                    dVar3222.C(intValue22);
                    if (num != null) {
                    }
                    if (bitmap != null) {
                    }
                    dVar3222.d(true);
                    Notification b13222 = dVar3222.b();
                    Intrinsics.checkNotNullExpressionValue(b13222, "Builder(context, channel…l(true)\n        }.build()");
                    notificationManager2 = (NotificationManager) androidx.core.content.a.getSystemService(context3, NotificationManager.class);
                    if (notificationManager2 != null) {
                    }
                }
                pair2 = new Pair(((C5033a.C0710a) interfaceC4008j2.getValue()).f36843b, EnumC6339c.MANIFEST);
                b11 = notification.b();
                if (b11 != null) {
                }
                str = ((C5033a.C0710a) interfaceC4008j2.getValue()).f36844c;
                if (str != null) {
                }
                Intrinsics.checkNotNullParameter(context3, "context");
                String string222 = context3.getString(R.string.vkpns_default_notification_channel_name);
                Intrinsics.checkNotNullExpressionValue(string222, "context.getString(R.stri…otification_channel_name)");
                NotificationChannel notificationChannel222 = new NotificationChannel("ru.mail.vkpns.default_notification_channel", string222, 3);
                notificationManager = (NotificationManager) androidx.core.content.a.getSystemService(context3, NotificationManager.class);
                if (notificationManager != null) {
                }
                dVar22.info("Using default channel");
                pair3 = new Pair("ru.mail.vkpns.default_notification_channel", EnumC6339c.DEFAULT_SDK);
                f fVar222 = eVar.f36859b;
                String title222 = notification.h();
                String a11222 = notification.a();
                int intValue222 = ((Number) pair.e()).intValue();
                num = (Integer) pair2.e();
                c11 = notification.c();
                if (c11 != null) {
                }
                clickAction = "android.intent.action.MAIN";
                d11 = notification.d();
                Pair pair42222 = pair3;
                String channelId2222 = (String) pair3.e();
                Pair pair52222 = pair;
                Intrinsics.checkNotNullParameter(title222, "title");
                Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                Intrinsics.checkNotNullParameter(channelId2222, "channelId");
                Context context22222 = fVar222.f36864a;
                l.d dVar32222 = new l.d(context22222, channelId2222);
                dVar32222.j(title222);
                dVar32222.i(a11222);
                if (d11 != EnumC6337a.DEEP_LINK) {
                }
                if (clickAction.equals("android.intent.action.MAIN")) {
                }
                Intrinsics.checkNotNullParameter(intent, "intent");
                intent.putExtra("vkpns.click_event_marker", "");
                intent.putExtra("vkpns.click_event_marker.request_code", hashCode2);
                intent.setPackage(context22222.getPackageName());
                intent.setFlags(335544320);
                PendingIntent activity2222 = PendingIntent.getActivity(context22222, hashCode2, intent, 201326592);
                Intrinsics.checkNotNullExpressionValue(activity2222, "getActivity(\n           …ngIntentFlags()\n        )");
                dVar32222.h(activity2222);
                dVar32222.C(intValue222);
                if (num != null) {
                }
                if (bitmap != null) {
                }
                dVar32222.d(true);
                Notification b132222 = dVar32222.b();
                Intrinsics.checkNotNullExpressionValue(b132222, "Builder(context, channel…l(true)\n        }.build()");
                notificationManager2 = (NotificationManager) androidx.core.content.a.getSystemService(context3, NotificationManager.class);
                if (notificationManager2 != null) {
                }
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f36855f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f36857h;
        if (i11 != 0) {
        }
        bitmap = (Bitmap) obj2;
        int hashCode22 = UUID.randomUUID().hashCode();
        eVar.getClass();
        f7 = notification.f();
        InterfaceC4008j interfaceC4008j22 = eVar.f36860c.f36841b;
        Context context32 = eVar.f36858a;
        if (f7 != null) {
        }
        Integer num222 = ((C5033a.C0710a) interfaceC4008j22.getValue()).f36842a;
        if (num222 != null) {
        }
        e11 = notification.e();
        Za.d dVar222 = eVar.f36863f;
        if (e11 != null) {
        }
        pair2 = new Pair(((C5033a.C0710a) interfaceC4008j22.getValue()).f36843b, EnumC6339c.MANIFEST);
        b11 = notification.b();
        if (b11 != null) {
        }
        str = ((C5033a.C0710a) interfaceC4008j22.getValue()).f36844c;
        if (str != null) {
        }
        Intrinsics.checkNotNullParameter(context32, "context");
        String string2222 = context32.getString(R.string.vkpns_default_notification_channel_name);
        Intrinsics.checkNotNullExpressionValue(string2222, "context.getString(R.stri…otification_channel_name)");
        NotificationChannel notificationChannel2222 = new NotificationChannel("ru.mail.vkpns.default_notification_channel", string2222, 3);
        notificationManager = (NotificationManager) androidx.core.content.a.getSystemService(context32, NotificationManager.class);
        if (notificationManager != null) {
        }
        dVar222.info("Using default channel");
        pair3 = new Pair("ru.mail.vkpns.default_notification_channel", EnumC6339c.DEFAULT_SDK);
        f fVar2222 = eVar.f36859b;
        String title2222 = notification.h();
        String a112222 = notification.a();
        int intValue2222 = ((Number) pair.e()).intValue();
        num = (Integer) pair2.e();
        c11 = notification.c();
        if (c11 != null) {
        }
        clickAction = "android.intent.action.MAIN";
        d11 = notification.d();
        Pair pair422222 = pair3;
        String channelId22222 = (String) pair3.e();
        Pair pair522222 = pair;
        Intrinsics.checkNotNullParameter(title2222, "title");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Intrinsics.checkNotNullParameter(channelId22222, "channelId");
        Context context222222 = fVar2222.f36864a;
        l.d dVar322222 = new l.d(context222222, channelId22222);
        dVar322222.j(title2222);
        dVar322222.i(a112222);
        if (d11 != EnumC6337a.DEEP_LINK) {
        }
        if (clickAction.equals("android.intent.action.MAIN")) {
        }
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.putExtra("vkpns.click_event_marker", "");
        intent.putExtra("vkpns.click_event_marker.request_code", hashCode22);
        intent.setPackage(context222222.getPackageName());
        intent.setFlags(335544320);
        PendingIntent activity22222 = PendingIntent.getActivity(context222222, hashCode22, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity22222, "getActivity(\n           …ngIntentFlags()\n        )");
        dVar322222.h(activity22222);
        dVar322222.C(intValue2222);
        if (num != null) {
        }
        if (bitmap != null) {
        }
        dVar322222.d(true);
        Notification b1322222 = dVar322222.b();
        Intrinsics.checkNotNullExpressionValue(b1322222, "Builder(context, channel…l(true)\n        }.build()");
        notificationManager2 = (NotificationManager) androidx.core.content.a.getSystemService(context32, NotificationManager.class);
        if (notificationManager2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        e eVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f36849g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f36849g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f36847e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f36849g;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        c cVar2 = new c(this, str, null);
                        bVar.f36846d = this;
                        bVar.f36849g = 1;
                        obj = f1.b(5000L, cVar2, bVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        eVar = this;
                    } catch (d1 unused) {
                        eVar = this;
                        eVar.f36863f.b("Unable to download image for 5000 ms", null);
                        return null;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = bVar.f36846d;
                    try {
                        s.b(obj);
                    } catch (d1 unused2) {
                        eVar.f36863f.b("Unable to download image for 5000 ms", null);
                        return null;
                    }
                }
                return (Bitmap) obj;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f36847e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f36849g;
        if (i11 != 0) {
        }
        return (Bitmap) obj2;
    }
}
