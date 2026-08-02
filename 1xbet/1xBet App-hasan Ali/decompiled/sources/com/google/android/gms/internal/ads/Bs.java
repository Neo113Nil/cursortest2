package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Bs {

    /* renamed from: k, reason: collision with root package name */
    public static final Bs f7902k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ Bs[] f7903l;

    /* JADX INFO: Fake field, exist only in values array */
    Bs EF4;

    static {
        Bs bs = new Bs("VIDEO_CONTROLS", 0);
        Bs bs2 = new Bs("CLOSE_AD", 1);
        Bs bs3 = new Bs("NOT_VISIBLE", 2);
        f7902k = bs3;
        f7903l = new Bs[]{bs, bs2, bs3, new Bs("OTHER", 3)};
    }

    public static Bs[] values() {
        return (Bs[]) f7903l.clone();
    }
}
