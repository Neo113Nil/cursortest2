package com.inmobi.media;

import android.util.Log;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.g1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3724g1 implements InterfaceC4204x3, Wn {
    public static final String f;

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f7114a;
    public final Y9 b;
    public AdSession c;
    public MediaEvents d;
    public AdEvents e;

    static {
        Intrinsics.checkNotNullExpressionValue("g1", "getSimpleName(...)");
        f = "g1";
    }

    public AbstractC3724g1(CoroutineScope coroutineScope, Y9 y9) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f7114a = coroutineScope;
        this.b = y9;
    }

    public void a() {
    }

    public void a(AbstractC3691eo videoEvent) {
        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
    }

    public abstract void a(String str, List list, Map map, String str2, String str3, boolean z);

    public void a(boolean z) {
    }

    public final void b() {
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).a(f, "initAdEvents");
        }
        try {
            this.e = AdEvents.createAdEvents(this.c);
        } catch (IllegalArgumentException e) {
            Y9 y92 = this.b;
            if (y92 != null) {
                ((Z9) y92).a(f, "Failure initAdEvents: " + Log.getStackTraceString(e));
            }
        }
    }

    public final void c() {
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).a(f, "initMediaAdEvents");
        }
        try {
            this.d = MediaEvents.createMediaEvents(this.c);
        } catch (IllegalArgumentException e) {
            Y9 y92 = this.b;
            if (y92 != null) {
                ((Z9) y92).a(f, "Failure initMediaAdEvents: " + Log.getStackTraceString(e));
            }
        }
    }

    public final void a(InteractionType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.d == null) {
            Y9 y9 = this.b;
            if (y9 != null) {
                ((Z9) y9).a(f, "Failed to register adUserInteractionEvent with type: " + type);
                return;
            }
            return;
        }
        Y9 y92 = this.b;
        if (y92 != null) {
            ((Z9) y92).a(f, "trackAdUserInteractionEvent with type: " + type);
        }
        AbstractC4012q5.a(this.f7114a, new C3696f1(this, type, null));
    }

    public final void a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        Intrinsics.checkNotNullParameter(adSessionConfiguration, "adSessionConfiguration");
        Intrinsics.checkNotNullParameter(adSessionContext, "adSessionContext");
        if (this.c != null) {
            Y9 y9 = this.b;
            if (y9 != null) {
                ((Z9) y9).a(f, "initAdSession: adSession is already created");
                return;
            }
            return;
        }
        Y9 y92 = this.b;
        if (y92 != null) {
            ((Z9) y92).a(f, "initAdSession");
        }
        try {
            this.c = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
        } catch (Exception e) {
            Y9 y93 = this.b;
            if (y93 != null) {
                ((Z9) y93).a(f, "AdSession creation failed. " + e);
            }
        }
    }
}
