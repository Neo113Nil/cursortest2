package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum L {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* renamed from: c, reason: collision with root package name */
    public static final W f2649c;

    /* renamed from: a, reason: collision with root package name */
    public final int f2651a;

    static {
        X1.a aVar = new X1.a();
        aVar.f1633b = new Object[8];
        aVar.f1632a = 0;
        for (L l3 : values()) {
            Integer valueOf = Integer.valueOf(l3.f2651a);
            int i3 = aVar.f1632a + 1;
            Object[] objArr = (Object[]) aVar.f1633b;
            int length = objArr.length;
            int i4 = i3 + i3;
            if (i4 > length) {
                aVar.f1633b = Arrays.copyOf(objArr, AbstractC0235w.b(length, i4));
            }
            Object[] objArr2 = (Object[]) aVar.f1633b;
            int i5 = aVar.f1632a;
            int i6 = i5 + i5;
            objArr2[i6] = valueOf;
            objArr2[i6 + 1] = l3;
            aVar.f1632a = i5 + 1;
        }
        D d3 = (D) aVar.f1634c;
        if (d3 != null) {
            throw d3.a();
        }
        W a3 = W.a(aVar.f1632a, (Object[]) aVar.f1633b, aVar);
        D d4 = (D) aVar.f1634c;
        if (d4 != null) {
            throw d4.a();
        }
        f2649c = a3;
    }

    L(int i3) {
        this.f2651a = i3;
    }
}
