package com.fyber.inneractive.sdk.bidder;

/* loaded from: classes3.dex */
public final class f extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.bidder.e f3546a;

    public f(com.fyber.inneractive.sdk.bidder.e eVar) {
        this.f3546a = eVar;
    }

    public final void a() {
        com.fyber.inneractive.sdk.util.o.f4302a.registerReceiver(this, new android.content.IntentFilter("android.media.RINGER_MODE_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f4302a.registerReceiver(this, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            com.fyber.inneractive.sdk.util.o.f4302a.registerReceiver(this, new android.content.IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        }
        com.fyber.inneractive.sdk.util.o.f4302a.registerReceiver(this, new android.content.IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f4302a.registerReceiver(this, new android.content.IntentFilter("android.intent.action.AIRPLANE_MODE"));
        if (com.fyber.inneractive.sdk.util.o.a("android.permission.BLUETOOTH")) {
            com.fyber.inneractive.sdk.util.o.f4302a.registerReceiver(this, new android.content.IntentFilter("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"));
            com.fyber.inneractive.sdk.util.o.f4302a.registerReceiver(this, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        char c;
        boolean z;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        action.getClass();
        action.hashCode();
        switch (action.hashCode()) {
            case -1538406691:
                if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1530327060:
                if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1076576821:
                if (action.equals("android.intent.action.AIRPLANE_MODE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1123270207:
                if (action.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1779291251:
                if (action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2070024785:
                if (action.equals("android.media.RINGER_MODE_CHANGED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2106958107:
                if (action.equals("android.app.action.INTERRUPTION_FILTER_CHANGED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                com.fyber.inneractive.sdk.bidder.b bVar = (com.fyber.inneractive.sdk.bidder.b) this.f3546a;
                bVar.b.getClass();
                int intExtra = intent.getIntExtra("plugged", -1);
                z = intExtra == 1 || intExtra == 2 || intExtra == 4;
                java.lang.Boolean bool = bVar.c.B;
                if (bool == null || bool.booleanValue() != z) {
                    bVar.c.B = java.lang.Boolean.valueOf(z);
                    bVar.d();
                }
                bVar.b.getClass();
                if (!android.text.TextUtils.equals(bVar.c.C, com.fyber.inneractive.sdk.serverapi.b.a((intent.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, -1) * 100) / intent.getIntExtra("scale", -1)))) {
                    com.fyber.inneractive.sdk.bidder.d dVar = bVar.c;
                    bVar.b.getClass();
                    dVar.C = com.fyber.inneractive.sdk.serverapi.b.a((intent.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, -1) * 100) / intent.getIntExtra("scale", -1));
                    bVar.d();
                    break;
                }
                break;
            case 1:
            case 3:
                com.fyber.inneractive.sdk.bidder.b bVar2 = (com.fyber.inneractive.sdk.bidder.b) this.f3546a;
                bVar2.getClass();
                java.lang.Boolean bool2 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", Integer.MIN_VALUE) == 2 ? java.lang.Boolean.TRUE : null;
                com.fyber.inneractive.sdk.bidder.d dVar2 = bVar2.c;
                if (dVar2.t != bool2) {
                    dVar2.t = bool2;
                    bVar2.d();
                    break;
                }
                break;
            case 2:
                com.fyber.inneractive.sdk.bidder.b bVar3 = (com.fyber.inneractive.sdk.bidder.b) this.f3546a;
                bVar3.c.w = java.lang.Boolean.valueOf(intent.getBooleanExtra("state", false));
                bVar3.d();
                break;
            case 4:
                com.fyber.inneractive.sdk.bidder.b bVar4 = (com.fyber.inneractive.sdk.bidder.b) this.f3546a;
                bVar4.c.u = com.fyber.inneractive.sdk.serverapi.b.n();
                bVar4.d();
                break;
            case 5:
                com.fyber.inneractive.sdk.bidder.b bVar5 = (com.fyber.inneractive.sdk.bidder.b) this.f3546a;
                bVar5.getClass();
                int intExtra2 = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
                z = intExtra2 == 0 || intExtra2 == 1;
                java.lang.Boolean bool3 = bVar5.c.y;
                if (bool3 == null || bool3.booleanValue() != z) {
                    bVar5.c.y = java.lang.Boolean.valueOf(z);
                    bVar5.d();
                    break;
                }
                break;
            case 6:
                ((com.fyber.inneractive.sdk.bidder.b) this.f3546a).c();
                break;
        }
    }
}
