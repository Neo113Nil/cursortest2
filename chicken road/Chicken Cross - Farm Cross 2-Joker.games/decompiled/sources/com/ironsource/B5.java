package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class B5 {

    /* renamed from: a, reason: collision with root package name */
    private String f7566a;
    private boolean b;
    private String c;
    private C7 d;
    private boolean e;
    private ArrayList<Pair<String, String>> f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f7567a;
        private C7 d;
        private boolean b = false;
        private String c = "POST";
        private boolean e = false;
        private ArrayList<Pair<String, String>> f = new ArrayList<>();

        public a(String str) {
            this.f7567a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f7567a = str;
        }

        public a a(C7 c7) {
            this.d = c7;
            return this;
        }

        public a b(boolean z) {
            this.b = z;
            return this;
        }

        public a c() {
            this.c = "POST";
            return this;
        }

        public a a(Pair<String, String> pair) {
            this.f.add(pair);
            return this;
        }

        public a b() {
            this.c = "GET";
            return this;
        }

        public a a(List<Pair<String, String>> list) {
            this.f.addAll(list);
            return this;
        }

        public a a(boolean z) {
            this.e = z;
            return this;
        }

        public B5 a() {
            return new B5(this);
        }
    }

    B5(a aVar) {
        this.e = false;
        this.f7566a = aVar.f7567a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        if (aVar.f != null) {
            this.f = new ArrayList<>(aVar.f);
        }
    }

    public boolean a() {
        return this.b;
    }

    public String b() {
        return this.f7566a;
    }

    public C7 c() {
        return this.d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f);
    }

    public String e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }
}
