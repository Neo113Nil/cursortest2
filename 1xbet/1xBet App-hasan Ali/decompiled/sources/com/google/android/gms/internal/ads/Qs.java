package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Qs implements InterfaceC1760wu, InterfaceC1149jB, InterfaceC0972fC, InterfaceC1805xu, Yj, InterfaceC0977fH {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11278k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f11279l;

    public Qs() {
        this.f11278k = 0;
        this.f11279l = new int[2];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public Object mo12a() {
        switch (this.f11278k) {
            case 5:
                return (C0577De) this.f11279l;
            default:
                return Boolean.valueOf(((C1332nE) this.f11279l).J);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0977fH
    public C1761wv b(int i, C1292mb c1292mb, int[] iArr) {
        AbstractC0952et.q("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i5 = 0;
        int i6 = 0;
        while (i5 < c1292mb.f14495a) {
            int i7 = i;
            C1292mb c1292mb2 = c1292mb;
            ZG zg = new ZG(i7, c1292mb2, i5, (C0843cH) this.f11279l, iArr[i5]);
            int length = objArr.length;
            int i8 = i6 + 1;
            int d5 = AbstractC0776av.d(length, i8);
            if (d5 > length) {
                objArr = Arrays.copyOf(objArr, d5);
            }
            objArr[i6] = zg;
            i5++;
            i6 = i8;
            i = i7;
            c1292mb = c1292mb2;
        }
        return AbstractC1044gv.k(i6, objArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1760wu
    public Iterator c(Hq hq, CharSequence charSequence) {
        return new C1580su(charSequence, new Dp(((C1356nu) this.f11279l).f14728l.matcher(charSequence)), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1149jB
    public Object d(String str) {
        return ((Fz) this.f11279l).i(str, null);
    }

    public JSONObject e(View view) {
        if (view == null) {
            return Us.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = (int[]) this.f11279l;
        view.getLocationOnScreen(iArr);
        return Us.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0972fC
    public C1375oC h(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC0972fC interfaceC0972fC = ((InterfaceC0972fC[]) this.f11279l)[i];
            if (interfaceC0972fC.l(cls)) {
                return interfaceC0972fC.h(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.Yj
    /* renamed from: k */
    public void mo11k(Object obj) {
        switch (this.f11278k) {
            case 6:
                SE se = (SE) obj;
                ((C1109iE) this.f11279l).getClass();
                se.i(se.g(), 13, new QE(6));
                break;
            case 7:
            default:
                ((PE) obj).k((C1407p) this.f11279l);
                break;
            case 8:
                ((PE) obj).d((K7) this.f11279l);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0972fC
    public boolean l(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((InterfaceC0972fC[]) this.f11279l)[i].l(cls)) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ Qs(int i, Object obj) {
        this.f11278k = i;
        this.f11279l = obj;
    }

    public /* synthetic */ Qs(OE oe, C1407p c1407p, TD td) {
        this.f11278k = 9;
        this.f11279l = c1407p;
    }

    public /* synthetic */ Qs(OE oe, K7 k7) {
        this.f11278k = 8;
        this.f11279l = k7;
    }
}
