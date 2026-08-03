package com.ironsource;

/* renamed from: com.ironsource.y2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3375y2 {

    /* renamed from: a, reason: collision with root package name */
    public static com.ironsource.C3375y2 f6844a;

    /* renamed from: com.ironsource.y2$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6845a;

        static {
            int[] iArr = new int[com.ironsource.C3202o8.a.values().length];
            f6845a = iArr;
            try {
                iArr[com.ironsource.C3202o8.a.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f6845a[com.ironsource.C3202o8.a.Device.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f6845a[com.ironsource.C3202o8.a.Controller.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public static com.ironsource.C3375y2 a() {
        com.ironsource.C3375y2 c3375y2 = f6844a;
        return c3375y2 == null ? new com.ironsource.C3375y2() : c3375y2;
    }

    public boolean a(android.app.Activity activity) {
        if (com.ironsource.C3375y2.a.f6845a[com.ironsource.C2989ca.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) com.ironsource.O9.b((android.content.Context) activity).a().k();
            if (vVar == null) {
                return true;
            }
            vVar.l("back");
            return true;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
