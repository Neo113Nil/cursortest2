package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.i6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class n5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f4351a;
    protected final String b;
    protected final com.applovin.impl.sdk.p c;
    private final Context d;
    private String e;
    private boolean f;

    public n5(String str, com.applovin.impl.sdk.l lVar) {
        this(str, lVar, false, null);
    }

    public Context a() {
        return this.d;
    }

    public com.applovin.impl.sdk.l b() {
        return this.f4351a;
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return this.f;
    }

    public n5(String str, com.applovin.impl.sdk.l lVar, boolean z) {
        this(str, lVar, z, null);
    }

    public void a(String str) {
        this.e = str;
    }

    public ScheduledFuture b(final Thread thread, final long j) {
        if (j <= 0) {
            return null;
        }
        return this.f4351a.s0().b(new x6(this.f4351a, "timeout:" + this.b, new Runnable() { // from class: com.applovin.impl.n5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                n5.this.a(thread, j);
            }
        }), i6.b.TIMEOUT, j);
    }

    public n5(String str, com.applovin.impl.sdk.l lVar, String str2) {
        this(str, lVar, false, str2);
    }

    public void a(boolean z) {
        this.f = z;
    }

    public n5(String str, com.applovin.impl.sdk.l lVar, boolean z, String str2) {
        this.b = str;
        this.f4351a = lVar;
        this.c = lVar.Q();
        this.d = com.applovin.impl.sdk.l.p();
        this.f = z;
        this.e = str2;
    }

    public void a(Throwable th) {
        Map map = CollectionUtils.map("source", this.b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.e));
        this.f4351a.E().d(h2.j1, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.e)) {
            hashMap.put("details", this.e);
        }
        this.f4351a.E().a(h2.k1, this.b, hashMap);
        if (com.applovin.impl.sdk.p.a()) {
            this.c.k(this.b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds");
        }
    }
}
