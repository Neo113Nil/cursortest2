package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.bb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801bb implements W2.n {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f12810a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12811b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12812c;

    /* renamed from: d, reason: collision with root package name */
    public final B8 f12813d;
    public final boolean f;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f12814e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f12815g = new HashMap();

    public C0801bb(HashSet hashSet, boolean z3, int i, B8 b8, ArrayList arrayList, boolean z5) {
        this.f12810a = hashSet;
        this.f12811b = z3;
        this.f12812c = i;
        this.f12813d = b8;
        this.f = z5;
        if (arrayList != null) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                String str = (String) obj;
                if (str.startsWith("custom:")) {
                    String[] split = str.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f12815g.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.f12815g.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f12814e.add(str);
                }
            }
        }
    }

    @Override // W2.d
    public final boolean a() {
        return this.f;
    }

    @Override // W2.d
    public final boolean b() {
        return this.f12811b;
    }

    @Override // W2.d
    public final Set c() {
        return this.f12810a;
    }

    @Override // W2.d
    public final int d() {
        return this.f12812c;
    }
}
