package com.google.firebase.messaging;

import B0.f;
import B4.i;
import G0.y;
import V0.j;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import f2.AbstractServiceC0423g;
import f2.s;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k1.C1206b;
import k1.m;
import k1.n;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC0423g {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f5331g = new ArrayDeque(10);

    /* renamed from: f, reason: collision with root package name */
    public C1206b f5332f;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a2  */
    @Override // f2.AbstractServiceC0423g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Intent intent) {
        String stringExtra;
        C1206b c1206b;
        int i2;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                intent.getStringExtra("token");
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra2 = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra2)) {
            ArrayDeque arrayDeque = f5331g;
            if (arrayDeque.contains(stringExtra2)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
                }
                if (this.f5332f == null) {
                    this.f5332f = new C1206b(getApplicationContext());
                }
                c1206b = this.f5332f;
                if (c1206b.f10676c.d() >= 233700000) {
                    f.q(new IOException("SERVICE_NOT_AVAILABLE"));
                    return;
                }
                Bundle bundle = new Bundle();
                String stringExtra3 = intent.getStringExtra("google.message_id");
                if (stringExtra3 == null) {
                    stringExtra3 = intent.getStringExtra(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID);
                }
                bundle.putString("google.message_id", stringExtra3);
                Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
                if (valueOf != null) {
                    bundle.putInt("google.product_id", valueOf.intValue());
                }
                n c2 = n.c(c1206b.f10675b);
                synchronized (c2) {
                    i2 = c2.f10711a;
                    c2.f10711a = 1 + i2;
                }
                c2.d(new m(i2, 3, bundle, 0));
                return;
            }
            if (arrayDeque.size() >= 10) {
                arrayDeque.remove();
            }
            arrayDeque.add(stringExtra2);
        }
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                break;
            case "gcm":
                AbstractC1341c.v(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (j.L(extras)) {
                    j jVar = new j(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new y("Firebase-Messaging-Network-Io"));
                    try {
                        if (!new i(this, jVar, newSingleThreadExecutor).J()) {
                            newSingleThreadExecutor.shutdown();
                            if (AbstractC1341c.F(intent)) {
                                AbstractC1341c.w(intent.getExtras(), "_nf");
                                break;
                            }
                        } else {
                            break;
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                break;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID);
                }
                String stringExtra4 = intent.getStringExtra("error");
                new s(stringExtra4);
                if (stringExtra4 != null) {
                    stringExtra4.toLowerCase(Locale.US).getClass();
                    break;
                }
                break;
            case "send_event":
                intent.getStringExtra("google.message_id");
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                break;
        }
        if (this.f5332f == null) {
        }
        c1206b = this.f5332f;
        if (c1206b.f10676c.d() >= 233700000) {
        }
    }
}
