package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.fo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504fo {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f7312c = {0, 1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f7313a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f7314b = 0;

    public C0504fo(int[] iArr) {
        for (int i3 : iArr) {
            this.f7313a.put(i3, new HashMap());
        }
    }
}
