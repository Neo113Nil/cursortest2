package com.facebook.internal;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class n {
    public static final a Companion = new a();
    public final boolean a;
    public final int b;
    public final EnumSet<B> c;
    public final boolean d;
    public final C0712h e;
    public final boolean f;
    public final boolean g;
    public final JSONArray h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final JSONArray m;
    public final JSONArray n;
    public final Map<String, Boolean> o;
    public final JSONArray p;
    public final JSONArray q;
    public final JSONArray r;
    public final JSONArray s;
    public final JSONArray t;
    public final String u;
    public final List<String> v;
    public final List<String> w;
    public final List<Pair<String, List<String>>> x;
    public final List<Pair<String, List<String>>> y;
    public final Long z;

    public static final class a {
    }

    public static final class b {
        public static final a Companion = new a();
        public final String a;
        public final String b;

        public static final class a {
        }

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public n(boolean z, String nuxContent, int i, EnumSet smartLoginOptions, HashMap dialogConfigurations, boolean z2, C0712h errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z3, boolean z4, JSONArray jSONArray, String sdkUpdateMessage, String str, String str2, String str3, JSONArray jSONArray2, JSONArray jSONArray3, HashMap hashMap, JSONArray jSONArray4, JSONArray jSONArray5, JSONArray jSONArray6, JSONArray jSONArray7, JSONArray jSONArray8, String str4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Long l) {
        Intrinsics.checkNotNullParameter(nuxContent, "nuxContent");
        Intrinsics.checkNotNullParameter(smartLoginOptions, "smartLoginOptions");
        Intrinsics.checkNotNullParameter(dialogConfigurations, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(errorClassification, "errorClassification");
        Intrinsics.checkNotNullParameter(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(sdkUpdateMessage, "sdkUpdateMessage");
        this.a = z;
        this.b = i;
        this.c = smartLoginOptions;
        this.d = z2;
        this.e = errorClassification;
        this.f = z3;
        this.g = z4;
        this.h = jSONArray;
        this.i = sdkUpdateMessage;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = jSONArray2;
        this.n = jSONArray3;
        this.o = hashMap;
        this.p = jSONArray4;
        this.q = jSONArray5;
        this.r = jSONArray6;
        this.s = jSONArray7;
        this.t = jSONArray8;
        this.u = str4;
        this.v = arrayList;
        this.w = arrayList2;
        this.x = arrayList3;
        this.y = arrayList4;
        this.z = l;
    }
}
