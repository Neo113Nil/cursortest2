package com.amplitude.android;

import android.content.Context;
import java.io.File;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends com.amplitude.core.h {
    public static final a Companion = new a();
    public String A;
    public final q B;
    public File C;
    public Set<f> D;
    public l E;
    public final Context b;
    public int c;
    public int d;
    public String e;
    public boolean f;
    public final com.amplitude.android.storage.a g;
    public final com.amplitude.android.utilities.e h;
    public Integer i;
    public String j;
    public int k;
    public boolean l;
    public com.amplitude.core.i m;
    public String n;
    public boolean o;
    public boolean p;
    public y q;
    public boolean r;
    public boolean s;
    public boolean t;
    public long u;
    public long v;
    public final com.amplitude.android.storage.b w;
    public final com.amplitude.id.b x;
    public boolean y;
    public Boolean z;

    public static final class a {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(Context context, String apiKey) {
        super(apiKey, loggerProvider);
        com.amplitude.android.utilities.e loggerProvider = new com.amplitude.android.utilities.e();
        com.amplitude.core.i serverZone = com.amplitude.core.i.a;
        y trackingOptions = new y();
        Set autocapture = SetsKt.setOf(f.c);
        Boolean bool = Boolean.FALSE;
        q interactionsOptions = new q(0);
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("$default_instance", "instanceName");
        com.amplitude.android.storage.a storageProvider = com.amplitude.android.storage.g.a;
        Intrinsics.checkNotNullParameter(storageProvider, "storageProvider");
        Intrinsics.checkNotNullParameter(loggerProvider, "loggerProvider");
        Intrinsics.checkNotNullParameter(serverZone, "serverZone");
        Intrinsics.checkNotNullParameter(trackingOptions, "trackingOptions");
        Intrinsics.checkNotNullParameter(autocapture, "autocapture");
        com.amplitude.android.storage.b identifyInterceptStorageProvider = com.amplitude.android.storage.g.c;
        Intrinsics.checkNotNullParameter(identifyInterceptStorageProvider, "identifyInterceptStorageProvider");
        com.amplitude.id.b identityStorageProvider = com.amplitude.android.storage.g.b;
        Intrinsics.checkNotNullParameter(identityStorageProvider, "identityStorageProvider");
        Intrinsics.checkNotNullParameter(interactionsOptions, "interactionsOptions");
        this.b = context;
        this.c = 30;
        this.d = 30000;
        this.e = "$default_instance";
        this.f = false;
        this.g = storageProvider;
        this.h = loggerProvider;
        this.i = null;
        this.j = null;
        this.k = 5;
        this.l = false;
        this.m = serverZone;
        this.n = null;
        this.o = false;
        this.p = false;
        this.q = trackingOptions;
        this.r = false;
        this.s = false;
        this.t = true;
        this.u = 300000L;
        this.v = 30000L;
        this.w = identifyInterceptStorageProvider;
        this.x = identityStorageProvider;
        this.y = true;
        this.z = bool;
        this.A = null;
        this.B = interactionsOptions;
        this.D = CollectionsKt.toMutableSet(autocapture);
        i listener = new i(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        l lVar = new l(0);
        lVar.e.add(listener);
        this.E = lVar;
    }

    public final File a() {
        if (this.C == null) {
            Context context = this.b;
            File dir = context.getDir("amplitude", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append('/');
            File file = new File(dir, androidx.concurrent.futures.a.a(sb, this.e, "/analytics/"));
            this.C = file;
            file.mkdirs();
        }
        File file2 = this.C;
        Intrinsics.checkNotNull(file2);
        return file2;
    }
}
