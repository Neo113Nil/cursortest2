package com.inmobi.media;

/* renamed from: com.inmobi.media.e1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2367e1 implements com.inmobi.media.InterfaceC2264a3, com.inmobi.media.InterfaceC2309bm {
    public static final java.lang.String f;

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f5167a;
    public final com.inmobi.media.InterfaceC2772t9 b;
    public com.iab.omid.library.inmobi.adsession.AdSession c;
    public com.iab.omid.library.inmobi.adsession.media.MediaEvents d;
    public com.iab.omid.library.inmobi.adsession.AdEvents e;

    static {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("e1", "getSimpleName(...)");
        f = "e1";
    }

    public AbstractC2367e1(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f5167a = coroutineScope;
        this.b = interfaceC2772t9;
    }

    public void a() {
    }

    @Override // com.inmobi.media.InterfaceC2309bm
    public void a(com.inmobi.media.AbstractC2493im videoEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
    }

    public abstract void a(java.lang.String str, java.util.List list, java.util.Map map, java.lang.String str2, java.lang.String str3, boolean z);

    public void a(boolean z) {
    }

    public final void b() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(f, "initAdEvents");
        }
        try {
            this.e = com.iab.omid.library.inmobi.adsession.AdEvents.createAdEvents(this.c);
        } catch (java.lang.IllegalArgumentException e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a(f, "Failure initAdEvents: " + android.util.Log.getStackTraceString(e));
            }
        }
    }

    public final void c() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(f, "initMediaAdEvents");
        }
        try {
            this.d = com.iab.omid.library.inmobi.adsession.media.MediaEvents.createMediaEvents(this.c);
        } catch (java.lang.IllegalArgumentException e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a(f, "Failure initMediaAdEvents: " + android.util.Log.getStackTraceString(e));
            }
        }
    }

    public final void a(com.iab.omid.library.inmobi.adsession.media.InteractionType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        if (this.d == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(f, "Failed to register adUserInteractionEvent with type: " + type);
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(f, "trackAdUserInteractionEvent with type: " + type);
        }
        com.inmobi.media.T4.a(this.f5167a, new com.inmobi.media.C2342d1(this, type, null));
    }

    public final void a(com.iab.omid.library.inmobi.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.inmobi.adsession.AdSessionContext adSessionContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSessionConfiguration, "adSessionConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSessionContext, "adSessionContext");
        if (this.c != null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(f, "initAdSession: adSession is already created");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(f, "initAdSession");
        }
        try {
            this.c = com.iab.omid.library.inmobi.adsession.AdSession.createAdSession(adSessionConfiguration, adSessionContext);
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = this.b;
            if (interfaceC2772t93 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t93).a(f, "AdSession creation failed. " + e);
            }
        }
    }
}
