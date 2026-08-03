package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ac extends android.content.BroadcastReceiver implements com.inmobi.media.InterfaceC2458hc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4600a;
    public final /* synthetic */ com.inmobi.media.Ec b;

    public Ac(com.inmobi.media.Ec ec, java.lang.String jsCallbackNamespace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        this.b = ec;
        this.f4600a = jsCallbackNamespace;
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
        com.inmobi.media.J3.a(context, this, new android.content.IntentFilter("android.media.RINGER_MODE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        if (kotlin.jvm.internal.Intrinsics.areEqual("android.media.RINGER_MODE_CHANGED", intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("MraidMediaProcessor", "Ringer mode action changed: " + intExtra);
            }
            this.b.a(this.f4600a, 2 != intExtra);
        }
    }
}
