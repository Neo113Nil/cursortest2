package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.R;

/* loaded from: classes5.dex */
public class v2 {

    /* renamed from: a, reason: collision with root package name */
    protected c f4535a;
    protected boolean b;
    protected SpannedString c;
    protected SpannedString d;
    protected String e;
    protected String f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected boolean m;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final c f4536a;
        boolean b;
        SpannedString c;
        SpannedString d;
        String e;
        String f;
        int g = 0;
        int h = 0;
        int i = ViewCompat.MEASURED_STATE_MASK;
        int j = ViewCompat.MEASURED_STATE_MASK;
        int k = 0;
        int l = 0;
        boolean m;

        public b(c cVar) {
            this.f4536a = cVar;
        }

        public b a(boolean z) {
            this.b = z;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(SpannedString spannedString) {
            this.d = spannedString;
            return this;
        }

        public b b(String str) {
            this.e = str;
            return this;
        }

        public b a(String str) {
            this.f = str;
            return this;
        }

        public b b(int i) {
            this.l = i;
            return this;
        }

        public b c(int i) {
            this.j = i;
            return this;
        }

        public b d(int i) {
            this.i = i;
            return this;
        }

        public b a(int i) {
            this.h = i;
            return this;
        }

        public b b(boolean z) {
            this.m = z;
            return this;
        }

        public b a(Context context) {
            this.h = R.drawable.applovin_ic_disclosure_arrow;
            this.l = context.getColor(R.color.applovin_sdk_disclosureButtonColor);
            return this;
        }

        public v2 a() {
            int i;
            if (this.b && (i = this.h) != 0 && i != R.drawable.applovin_ic_disclosure_arrow) {
                this.i = -16776961;
            }
            return new v2(this);
        }
    }

    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f4537a;

        c(int i) {
            this.f4537a = i;
        }

        public int b() {
            return this == SECTION ? R.layout.mediation_debugger_list_section : this == SECTION_CENTERED ? R.layout.mediation_debugger_list_section_centered : this == SIMPLE ? android.R.layout.simple_list_item_1 : this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f4537a;
        }
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.e;
    }

    public int d() {
        return this.h;
    }

    public int e() {
        return this.l;
    }

    public SpannedString f() {
        return this.d;
    }

    public int g() {
        return this.j;
    }

    public int h() {
        return this.g;
    }

    public int i() {
        return this.k;
    }

    public int j() {
        return this.f4535a.b();
    }

    public SpannedString k() {
        return this.c;
    }

    public int l() {
        return this.i;
    }

    public int m() {
        return this.f4535a.c();
    }

    public boolean o() {
        return this.b;
    }

    public boolean p() {
        return this.m;
    }

    protected v2(c cVar) {
        this.g = 0;
        this.h = 0;
        this.i = ViewCompat.MEASURED_STATE_MASK;
        this.j = ViewCompat.MEASURED_STATE_MASK;
        this.k = 0;
        this.l = 0;
        this.f4535a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    private v2(b bVar) {
        this.g = 0;
        this.h = 0;
        this.i = ViewCompat.MEASURED_STATE_MASK;
        this.j = ViewCompat.MEASURED_STATE_MASK;
        this.k = 0;
        this.l = 0;
        this.f4535a = bVar.f4536a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
    }
}
