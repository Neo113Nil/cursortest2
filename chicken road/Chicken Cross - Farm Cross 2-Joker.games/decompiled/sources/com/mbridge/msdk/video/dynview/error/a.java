package com.mbridge.msdk.video.dynview.error;

/* compiled from: EnumError.java */
/* loaded from: classes6.dex */
public enum a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* renamed from: a, reason: collision with root package name */
    private int f10096a;
    private String b;

    a(int i2, String str) {
        this.f10096a = i2;
        this.b = str;
    }

    public int g() {
        return this.f10096a;
    }

    public String h() {
        return this.b;
    }
}
