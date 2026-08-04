package android.support.v4.media;

import F.x;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaBrowser f8001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f8002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f8003d = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p122r.b f8004e = new p122r.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public V0 f8005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Messenger f8006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaSessionCompat$Token f8007h;

    public c(Context context, ComponentName componentName, x xVar) {
        this.f8000a = context;
        Bundle bundle = new Bundle();
        this.f8002c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        xVar.f2476b = this;
        this.f8001b = new MediaBrowser(context, componentName, (b) xVar.f2475a, bundle);
    }
}
