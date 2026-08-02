package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Es extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8619a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f8620b;

    /* renamed from: c, reason: collision with root package name */
    public float f8621c;

    /* renamed from: d, reason: collision with root package name */
    public final Ns f8622d;

    public Es(Handler handler, Context context, Ns ns) {
        super(handler);
        this.f8619a = context;
        this.f8620b = (AudioManager) context.getSystemService("audio");
        this.f8622d = ns;
    }

    public final float a() {
        AudioManager audioManager = this.f8620b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f = streamVolume / streamMaxVolume;
            if (f > 1.0f) {
                return 1.0f;
            }
        }
        return f;
    }

    public final void b() {
        float f = this.f8621c;
        Ns ns = this.f8622d;
        ns.f10853a = f;
        if (ns.f10855c == null) {
            ns.f10855c = Hs.f9492c;
        }
        Iterator it = Collections.unmodifiableCollection(ns.f10855c.f9494b).iterator();
        while (it.hasNext()) {
            Rs rs = ((C1893zs) it.next()).f16778d;
            AbstractC1668us.E(rs.a(), "setDeviceVolume", Float.valueOf(f), rs.f11460a);
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        super.onChange(z3);
        float a5 = a();
        if (a5 != this.f8621c) {
            this.f8621c = a5;
            b();
        }
    }
}
