package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.fo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653fo {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f8208c = {0, 1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f8209a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f8210b = 0;

    public C0653fo(int[] iArr) {
        for (int i2 : iArr) {
            this.f8209a.put(i2, new HashMap());
        }
    }
}
