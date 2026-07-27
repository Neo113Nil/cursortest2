package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4531m8;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.w2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4704w2 {

    /* renamed from: a, reason: collision with root package name */
    public static C4704w2 f8740a;

    /* renamed from: com.ironsource.w2$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8741a;

        static {
            int[] iArr = new int[C4531m8.a.values().length];
            f8741a = iArr;
            try {
                iArr[C4531m8.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8741a[C4531m8.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8741a[C4531m8.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static C4704w2 a() {
        C4704w2 c4704w2 = f8740a;
        return c4704w2 == null ? new C4704w2() : c4704w2;
    }

    public boolean a(Activity activity) {
        if (a.f8741a[C4354ca.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) O9.b((Context) activity).a().k();
            if (vVar == null) {
                return true;
            }
            vVar.l("back");
            return true;
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
