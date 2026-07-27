package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.wh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1086wh implements InterfaceC0962rn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0923q9 f9527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1162zh f9528b;

    public C1086wh(C1162zh c1162zh, C0923q9 c0923q9) {
        this.f9528b = c1162zh;
        this.f9527a = c0923q9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0962rn
    public final void a(Object obj) {
        List list = (List) obj;
        C0923q9 c0923q9 = this.f9527a;
        if (AbstractC0860no.a((Collection) list)) {
            return;
        }
        c0923q9.f9079d = new C0871o9[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            C0831ml c0831ml = (C0831ml) list.get(i2);
            C0871o9[] c0871o9Arr = c0923q9.f9079d;
            Map map = Uf.f7591a;
            C0871o9 c0871o9 = new C0871o9();
            Integer num = c0831ml.f8795a;
            if (num != null) {
                c0871o9.f8915a = num.intValue();
            }
            Integer num2 = c0831ml.f8796b;
            if (num2 != null) {
                c0871o9.f8916b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c0831ml.f8798d)) {
                c0871o9.f8917c = c0831ml.f8798d;
            }
            c0871o9.f8918d = c0831ml.f8797c;
            c0871o9Arr[i2] = c0871o9;
            this.f9528b.f9654g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c0923q9.f9079d[i2]);
            this.f9528b.f9654g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
