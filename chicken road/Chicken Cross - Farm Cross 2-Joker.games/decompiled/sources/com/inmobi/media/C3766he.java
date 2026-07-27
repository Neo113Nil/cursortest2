package com.inmobi.media;

import android.content.ComponentName;
import android.content.Intent;
import io.ktor.sse.ServerSentEventKt;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.he, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3766he implements Lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3821je f7142a;

    public C3766he(C3821je c3821je) {
        this.f7142a = c3821je;
    }

    @Override // com.inmobi.media.Lb
    public final void a(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
    }

    @Override // com.inmobi.media.Lb
    public final void b(String str, String str2, String str3) {
    }

    @Override // com.inmobi.media.Lb
    public final void a() {
        Y9 y9 = this.f7142a.f7181a.g;
        if (y9 != null) {
            ((Z9) y9).a("PublisherViewClickHandler", "User left application");
        }
        AbstractC3750h abstractC3750h = (AbstractC3750h) this.f7142a.f7181a.f;
        abstractC3750h.getClass();
        Ok ok = ((Ad) abstractC3750h).c;
        Tj tj = ok instanceof Tj ? (Tj) ok : null;
        if (tj != null) {
            Y9 l = tj.l();
            if (l != null) {
                ((Z9) l).a("AUM-RenderedState", "onUserLeftApplication");
            }
            AbstractC4012q5.a(tj.k(), new Sj(tj, null));
        }
    }

    @Override // com.inmobi.media.Lb
    public final void a(String str, String message, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Y9 y9 = this.f7142a.f7181a.g;
        if (y9 != null) {
            ((Z9) y9).b("PublisherViewClickHandler", "Landing page error: " + message + ServerSentEventKt.SPACE + str2);
        }
    }

    @Override // com.inmobi.media.Lb
    public final void a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Y9 y9 = this.f7142a.f7181a.g;
        if (y9 != null) {
            ComponentName component = intent.getComponent();
            ((Z9) y9).a("PublisherViewClickHandler", "Starting activity: " + (component != null ? component.getClassName() : null));
        }
        this.f7142a.a(intent);
    }
}
