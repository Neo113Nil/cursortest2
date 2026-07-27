package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a9 {

    /* renamed from: a, reason: collision with root package name */
    public final ib f3445a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f3446b;
    public List3DActivity f;

    /* renamed from: g, reason: collision with root package name */
    public int f3450g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Hashtable f3448d = new Hashtable();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f3449e = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentLinkedQueue f3451h = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3447c = new HashMap();

    public a9(ib ibVar, ib ibVar2) {
        this.f3445a = ibVar;
        this.f3446b = ibVar2;
    }

    public final Bitmap a(String str, int i3, String str2) {
        Bitmap bitmap = (Bitmap) this.f3448d.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f3449e.contains(str)) {
            return null;
        }
        this.f3449e.add(str);
        int i4 = this.f3450g;
        if (i4 >= 15) {
            this.f3451h.add(new z8(this, i3, str, str2));
            return null;
        }
        this.f3450g = i4 + 1;
        ((Executor) this.f3445a.a()).execute(new z8(this, i3, str, str2));
        return null;
    }
}
