package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes5.dex */
public class m4 {

    /* renamed from: a, reason: collision with root package name */
    private final View f4291a;
    private final FriendlyObstructionPurpose b;
    private final String c;

    public m4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f4291a = view;
        this.b = friendlyObstructionPurpose;
        this.c = str;
    }

    public String a() {
        return this.c;
    }

    public FriendlyObstructionPurpose b() {
        return this.b;
    }

    public View c() {
        return this.f4291a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m4 m4Var = (m4) obj;
        View view = this.f4291a;
        if (view == null ? m4Var.f4291a != null : !view.equals(m4Var.f4291a)) {
            return false;
        }
        if (this.b != m4Var.b) {
            return false;
        }
        String str = this.c;
        String str2 = m4Var.c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        View view = this.f4291a;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.b;
        int hashCode2 = (hashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
