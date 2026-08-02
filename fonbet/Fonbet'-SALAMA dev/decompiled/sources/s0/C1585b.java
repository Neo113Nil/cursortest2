package s0;

import F.x;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.c;
import android.support.v4.media.e;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.h;
import android.support.v4.media.session.i;
import android.view.KeyEvent;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1585b extends x {

    /* renamed from: c, reason: collision with root package name */
    public final Context f16091c;

    /* renamed from: d, reason: collision with root package name */
    public final Intent f16092d;

    /* renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver.PendingResult f16093e;

    /* renamed from: f, reason: collision with root package name */
    public e f16094f;

    public C1585b(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f16091c = context;
        this.f16092d = intent;
        this.f16093e = pendingResult;
    }

    @Override // F.x
    public final void p() {
        c cVar = this.f16094f.f8009a;
        if (cVar.f8007h == null) {
            MediaSession.Token sessionToken = cVar.f8001b.getSessionToken();
            cVar.f8007h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, null) : null;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = cVar.f8007h;
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        Collections.synchronizedSet(new HashSet());
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f16091c;
        h iVar = i7 >= 29 ? new i(context, mediaSessionCompat$Token) : new h(context, mediaSessionCompat$Token);
        KeyEvent keyEvent = (KeyEvent) this.f16092d.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        iVar.f8047a.dispatchMediaButtonEvent(keyEvent);
        this.f16094f.a();
        this.f16093e.finish();
    }

    @Override // F.x
    public final void q() {
        this.f16094f.a();
        this.f16093e.finish();
    }

    @Override // F.x
    public final void r() {
        this.f16094f.a();
        this.f16093e.finish();
    }
}
