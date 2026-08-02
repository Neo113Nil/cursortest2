package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Nl {

    /* renamed from: k, reason: collision with root package name */
    public static final Nl f10809k;

    /* renamed from: l, reason: collision with root package name */
    public static final Nl f10810l;

    /* renamed from: m, reason: collision with root package name */
    public static final Nl f10811m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ Nl[] f10812n;

    static {
        Nl nl = new Nl("AD_REQUESTED", 0);
        f10809k = nl;
        Nl nl2 = new Nl("AD_LOADED", 1);
        f10810l = nl2;
        Nl nl3 = new Nl("AD_LOAD_FAILED", 2);
        f10811m = nl3;
        f10812n = new Nl[]{nl, nl2, nl3};
    }

    public static Nl[] values() {
        return (Nl[]) f10812n.clone();
    }
}
