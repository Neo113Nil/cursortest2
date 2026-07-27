package r1;

import Y1.C0077a;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s1.C1203j;

/* loaded from: classes.dex */
public final class b extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f10282a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10283b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f10284c;

    /* renamed from: d, reason: collision with root package name */
    public final C0077a f10285d;

    /* renamed from: e, reason: collision with root package name */
    public final C1203j f10286e;
    public final AtomicReference f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f10287g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f10288h;

    public b(Handler handler, Context context, C0077a c0077a, C1203j c1203j) {
        super(handler);
        this.f = new AtomicReference(Float.valueOf(-1.0f));
        this.f10287g = new AtomicBoolean(false);
        this.f10288h = Executors.newSingleThreadExecutor();
        this.f10282a = handler;
        this.f10283b = context;
        this.f10284c = (AudioManager) context.getSystemService("audio");
        this.f10285d = c0077a;
        this.f10286e = c1203j;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        if (this.f10287g.getAndSet(true)) {
            return;
        }
        this.f10288h.submit(new A.b(18, this));
    }
}
