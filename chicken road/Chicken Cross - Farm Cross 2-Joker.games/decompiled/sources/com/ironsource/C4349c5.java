package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ironsource.c5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4349c5 implements InterfaceC4691v7 {
    private static final int e = 5;
    private static C4349c5 f;

    /* renamed from: a, reason: collision with root package name */
    private HandlerC4331b5 f8110a;
    private final JSONObject b;
    private Thread c;
    private final String d;

    private C4349c5(String str, O7 o7, JSONObject jSONObject) {
        this.d = str;
        this.f8110a = new HandlerC4331b5(o7.a());
        this.b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized C4349c5 a(String str, O7 o7, JSONObject jSONObject) {
        C4349c5 c4349c5;
        synchronized (C4349c5.class) {
            if (f == null) {
                f = new C4349c5(str, o7, jSONObject);
            }
            c4349c5 = f;
        }
        return c4349c5;
    }

    private Thread b(C4710w8 c4710w8, String str, int i, int i2, Handler handler) {
        if (i <= 0) {
            i = this.b.optInt("connectionTimeout", 5);
        }
        if (i2 <= 0) {
            i2 = this.b.optInt("readTimeout", 5);
        }
        boolean optBoolean = this.b.optBoolean(W3.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new Z4(c4710w8, str, (int) timeUnit.toMillis(i), (int) timeUnit.toMillis(i2), optBoolean, b()), handler);
    }

    public boolean c() {
        Thread thread = this.c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f = null;
        HandlerC4331b5 handlerC4331b5 = this.f8110a;
        if (handlerC4331b5 != null) {
            handlerC4331b5.a();
            this.f8110a = null;
        }
    }

    @Override // com.ironsource.InterfaceC4691v7
    public void a(Nc nc) {
        this.f8110a.a(nc);
    }

    private Thread a(Z4 z4, Handler handler) {
        return new Thread(new RunnableC4735xf(z4, handler));
    }

    @Override // com.ironsource.InterfaceC4691v7
    public void a(C4710w8 c4710w8, String str, int i, int i2, Handler handler) {
        b(c4710w8, str, i, i2, handler).start();
    }

    @Override // com.ironsource.InterfaceC4691v7
    public void a(C4710w8 c4710w8, String str, int i, int i2) {
        b(c4710w8, str, i, i2, this.f8110a).start();
    }

    @Override // com.ironsource.InterfaceC4691v7
    public void a(C4710w8 c4710w8, String str) {
        int optInt = this.b.optInt("connectionTimeout", 5);
        int optInt2 = this.b.optInt("readTimeout", 5);
        boolean optBoolean = this.b.optBoolean(W3.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread a2 = a(new Z4(c4710w8, str, (int) timeUnit.toMillis(optInt), (int) timeUnit.toMillis(optInt2), optBoolean, b()), this.f8110a);
        this.c = a2;
        a2.start();
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.d, W3.D);
    }

    public String a() {
        return this.d;
    }
}
