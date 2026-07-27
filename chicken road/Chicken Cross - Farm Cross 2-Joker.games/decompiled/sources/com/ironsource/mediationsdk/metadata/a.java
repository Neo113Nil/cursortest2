package com.ironsource.mediationsdk.metadata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8424a = "do_not_sell";
    public static final String c = "is_deviceid_optout";
    public static final String d = "google_family_self_certified_sdks";
    public static final String e = "iiqf";
    public static final String f = "is_test_suite";
    public static final String h = "true";
    protected static final String i = "false";
    public static final String j = "google_water_mark";
    public static final String k = "enable";
    static final Set<String> l;
    static final Set<String> m;
    static final Set<String> n;
    public static final int o = 2048;
    public static final String b = "is_child_directed";
    public static final List<String> g = Arrays.asList("admob_tfcd", "admob_tfua", "BidMachine_COPPA", "chartboost_coppa", "DT_COPPA", b, "LevelPlay_ChildDirected", "meta_mixed_audience", "Mintegral_COPPA", "Moloco_COPPA", "Pangle_COPPA", "UnityAds_COPPA", "Vungle_COPPA", "Yandex_COPPA");

    static {
        HashSet hashSet = new HashSet(Arrays.asList(b, c, f, d, e));
        l = hashSet;
        m = new HashSet(Arrays.asList(c, d, f, e));
        HashSet hashSet2 = new HashSet(hashSet);
        n = hashSet2;
        hashSet2.add(f8424a);
    }
}
