package com.mbridge.msdk.config.component.animation;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimationSpec.java */
/* loaded from: classes6.dex */
public class g {
    private boolean c;

    /* renamed from: a, reason: collision with root package name */
    private int f8905a = 1;
    private String b = "";
    private List<e> d = new ArrayList();

    public String a() {
        return this.b;
    }

    public List<e> b() {
        return this.d;
    }

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        this.b = str;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public void a(List<e> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.d = list;
    }
}
