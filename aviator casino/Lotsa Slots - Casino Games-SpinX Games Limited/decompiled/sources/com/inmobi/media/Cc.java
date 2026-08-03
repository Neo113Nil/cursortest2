package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Cc extends android.database.ContentObserver implements com.inmobi.media.InterfaceC2458hc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4640a;
    public final android.content.Context b;
    public int c;
    public final /* synthetic */ com.inmobi.media.Ec d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cc(com.inmobi.media.Ec ec, java.lang.String mJsCallbackNamespace, android.content.Context context, android.os.Handler handler) {
        super(handler);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mJsCallbackNamespace, "mJsCallbackNamespace");
        this.d = ec;
        this.f4640a = mJsCallbackNamespace;
        this.b = context;
        this.c = -1;
    }

    @Override // com.inmobi.media.InterfaceC2458hc
    public final void a() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return;
        }
        context.getContentResolver().unregisterContentObserver(this);
    }

    @Override // com.inmobi.media.InterfaceC2458hc
    public final void b() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.Bc(this, this.d, z, null), 3, null);
    }
}
