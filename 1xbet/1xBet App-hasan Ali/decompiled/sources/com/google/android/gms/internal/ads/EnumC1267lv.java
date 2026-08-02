package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.android.gms.internal.ads.lv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1267lv implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1267lv f14446k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC1267lv[] f14447l;

    static {
        EnumC1267lv enumC1267lv = new EnumC1267lv("INSTANCE", 0);
        f14446k = enumC1267lv;
        f14447l = new EnumC1267lv[]{enumC1267lv};
    }

    public static EnumC1267lv[] values() {
        return (EnumC1267lv[]) f14447l.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1400ot.i0("no calls to next() since the last call to remove()", false);
    }
}
