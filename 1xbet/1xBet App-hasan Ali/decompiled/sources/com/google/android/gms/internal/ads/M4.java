package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* loaded from: classes.dex */
public final class M4 {

    /* renamed from: c, reason: collision with root package name */
    public static final ConditionVariable f10581c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    public static volatile Ct f10582d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Random f10583e = null;

    /* renamed from: a, reason: collision with root package name */
    public final C0965f5 f10584a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f10585b;

    public M4(C0965f5 c0965f5) {
        this.f10584a = c0965f5;
        c0965f5.f13439b.execute(new K4(1, this));
    }

    public final void a(int i, int i5, long j5, String str, Exception exc) {
        try {
            f10581c.block();
            if (!this.f10585b.booleanValue() || f10582d == null) {
                return;
            }
            X3 w5 = C0741a4.w();
            String packageName = this.f10584a.f13438a.getPackageName();
            w5.e();
            C0741a4.x((C0741a4) w5.f10141l, packageName);
            w5.e();
            C0741a4.B((C0741a4) w5.f10141l, j5);
            if (str != null) {
                w5.e();
                C0741a4.y((C0741a4) w5.f10141l, str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                w5.e();
                C0741a4.C((C0741a4) w5.f10141l, stringWriter2);
                String name = exc.getClass().getName();
                w5.e();
                C0741a4.A((C0741a4) w5.f10141l, name);
            }
            Ct ct = f10582d;
            byte[] d5 = ((C0741a4) w5.b()).d();
            ct.getClass();
            M0.e eVar = new M0.e(ct, d5);
            eVar.f3591c = i;
            if (i5 != -1) {
                eVar.f3590b = i5;
            }
            eVar.q();
        } catch (Exception unused) {
        }
    }
}
