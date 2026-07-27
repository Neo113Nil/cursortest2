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
    public static final X f5074c;

    /* renamed from: a, reason: collision with root package name */
    public final int f5076a;

    static {
        B3.d dVar = new B3.d(8, (byte) 0);
        dVar.f277c = new Object[8];
        dVar.f276b = 0;
        for (L l2 : values()) {
            Integer valueOf = Integer.valueOf(l2.f5076a);
            int i2 = dVar.f276b + 1;
            Object[] objArr = (Object[]) dVar.f277c;
            int length = objArr.length;
            int i3 = i2 + i2;
            if (i3 > length) {
                dVar.f277c = Arrays.copyOf(objArr, AbstractC0379w.b(length, i3));
            }
            Object[] objArr2 = (Object[]) dVar.f277c;
            int i6 = dVar.f276b;
            int i7 = i6 + i6;
            objArr2[i7] = valueOf;
            objArr2[i7 + 1] = l2;
            dVar.f276b = i6 + 1;
        }
        D d6 = (D) dVar.f278d;
        if (d6 != null) {
            throw d6.a();
        }
        X a6 = X.a(dVar.f276b, (Object[]) dVar.f277c, dVar);
        D d7 = (D) dVar.f278d;
        if (d7 != null) {
            throw d7.a();
        }
        f5074c = a6;
    }

    L(int i2) {
        this.f5076a = i2;
    }
}
