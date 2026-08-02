package com.dexterous.flutterlocalnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationManagerCompat;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.common.EventChannel;
import io.flutter.view.FlutterCallbackInformation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class ActionBroadcastReceiver extends BroadcastReceiver {

    @Nullable
    public static a b;

    @Nullable
    public static FlutterEngine c;
    public com.dexterous.flutterlocalnotifications.isolate.a a;

    public static class a implements EventChannel.StreamHandler {
        public final ArrayList a = new ArrayList();

        @Nullable
        public EventChannel.EventSink b;

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public final void onCancel(Object obj) {
            this.b = null;
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public final void onListen(Object obj, EventChannel.EventSink eventSink) {
            ArrayList arrayList = this.a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eventSink.success((Map) it.next());
            }
            arrayList.clear();
            this.b = eventSink;
        }
    }

    @Keep
    public ActionBroadcastReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED".equalsIgnoreCase(intent.getAction())) {
            com.dexterous.flutterlocalnotifications.isolate.a aVar = this.a;
            if (aVar == null) {
                aVar = new com.dexterous.flutterlocalnotifications.isolate.a(context);
            }
            this.a = aVar;
            Map<String, Object> extractNotificationResponseMap = FlutterLocalNotificationsPlugin.extractNotificationResponseMap(intent);
            if (intent.getBooleanExtra("cancelNotification", false)) {
                int intValue = ((Integer) extractNotificationResponseMap.get("notificationId")).intValue();
                Object obj = extractNotificationResponseMap.get("notificationTag");
                if (obj instanceof String) {
                    NotificationManagerCompat.from(context).cancel((String) obj, intValue);
                } else {
                    NotificationManagerCompat.from(context).cancel(intValue);
                }
            }
            if (b == null) {
                b = new a();
            }
            a aVar2 = b;
            EventChannel.EventSink eventSink = aVar2.b;
            if (eventSink != null) {
                eventSink.success(extractNotificationResponseMap);
            } else {
                aVar2.a.add(extractNotificationResponseMap);
            }
            if (c != null) {
                return;
            }
            FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
            flutterLoader.startInitialization(context);
            flutterLoader.ensureInitializationComplete(context, null);
            c = new FlutterEngine(context);
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(this.a.a.getSharedPreferences("flutter_local_notifications_plugin", 0).getLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", -1L));
            if (lookupCallbackInformation == null) {
                return;
            }
            DartExecutor dartExecutor = c.getDartExecutor();
            new EventChannel(dartExecutor.getBinaryMessenger(), "dexterous.com/flutter/local_notifications/actions").setStreamHandler(b);
            dartExecutor.executeDartCallback(new DartExecutor.DartCallback(context.getAssets(), flutterLoader.findAppBundlePath(), lookupCallbackInformation));
        }
    }
}
