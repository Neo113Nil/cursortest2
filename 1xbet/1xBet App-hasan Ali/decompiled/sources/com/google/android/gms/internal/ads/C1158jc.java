package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.jc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1158jc {

    /* renamed from: a, reason: collision with root package name */
    public int f14101a;

    /* renamed from: b, reason: collision with root package name */
    public int f14102b;

    /* renamed from: c, reason: collision with root package name */
    public final C1761wv f14103c;

    /* renamed from: d, reason: collision with root package name */
    public final C1761wv f14104d;

    /* renamed from: e, reason: collision with root package name */
    public final C1761wv f14105e;
    public final C1761wv f;

    /* renamed from: g, reason: collision with root package name */
    public final C0716Xb f14106g;

    /* renamed from: h, reason: collision with root package name */
    public C1761wv f14107h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f14108j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f14109k;

    public C1158jc() {
        this.f14101a = Integer.MAX_VALUE;
        this.f14102b = Integer.MAX_VALUE;
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        C1761wv c1761wv = C1761wv.f16184o;
        this.f14103c = c1761wv;
        this.f14104d = c1761wv;
        this.f14105e = c1761wv;
        this.f = c1761wv;
        this.f14106g = C0716Xb.f12198a;
        this.f14107h = c1761wv;
        this.i = 0;
        this.f14108j = new HashMap();
        this.f14109k = new HashSet();
    }

    public C1158jc(C0843cH c0843cH) {
        this.f14101a = c0843cH.f16300a;
        this.f14102b = c0843cH.f16301b;
        this.f14103c = c0843cH.f16302c;
        this.f14104d = c0843cH.f16303d;
        this.f14105e = c0843cH.f16304e;
        this.f = c0843cH.f;
        this.f14106g = c0843cH.f16305g;
        this.f14107h = c0843cH.f16306h;
        this.i = c0843cH.i;
        this.f14109k = new HashSet(c0843cH.f16308k);
        this.f14108j = new HashMap(c0843cH.f16307j);
    }
}
