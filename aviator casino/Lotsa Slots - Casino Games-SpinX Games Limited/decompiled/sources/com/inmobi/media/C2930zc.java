package com.inmobi.media;

/* renamed from: com.inmobi.media.zc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2930zc extends android.content.BroadcastReceiver implements com.inmobi.media.InterfaceC2458hc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5589a;
    public final /* synthetic */ com.inmobi.media.Ec b;

    public C2930zc(com.inmobi.media.Ec ec, java.lang.String jsCallbackNamespace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        this.b = ec;
        this.f5589a = jsCallbackNamespace;
    }

    @Override // com.inmobi.media.InterfaceC2458hc
    public final void a() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return;
        }
        context.unregisterReceiver(this);
    }

    @Override // com.inmobi.media.InterfaceC2458hc
    public final void b() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return;
        }
        com.inmobi.media.J3.a(context, this, new android.content.IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        if (kotlin.jvm.internal.Intrinsics.areEqual("android.intent.action.HEADSET_PLUG", intent.getAction())) {
            int intExtra = intent.getIntExtra("state", 0);
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("MraidMediaProcessor", "Headphone plugged state changed: " + intExtra);
            }
            this.b.b(this.f5589a, 1 == intExtra);
        }
    }
}
