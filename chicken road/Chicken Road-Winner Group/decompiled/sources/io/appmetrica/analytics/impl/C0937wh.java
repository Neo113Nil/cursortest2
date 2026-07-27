package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.wh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0937wh implements InterfaceC0813rn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0774q9 f8569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1013zh f8570b;

    public C0937wh(C1013zh c1013zh, C0774q9 c0774q9) {
        this.f8570b = c1013zh;
        this.f8569a = c0774q9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0813rn
    public final void a(Object obj) {
        List list = (List) obj;
        C0774q9 c0774q9 = this.f8569a;
        if (AbstractC0711no.a((Collection) list)) {
            return;
        }
        c0774q9.f8139d = new C0722o9[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            C0682ml c0682ml = (C0682ml) list.get(i3);
            C0722o9[] c0722o9Arr = c0774q9.f8139d;
            Map map = Uf.f6718a;
            C0722o9 c0722o9 = new C0722o9();
            Integer num = c0682ml.f7868a;
            if (num != null) {
                c0722o9.f7984a = num.intValue();
            }
            Integer num2 = c0682ml.f7869b;
            if (num2 != null) {
                c0722o9.f7985b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c0682ml.f7871d)) {
                c0722o9.f7986c = c0682ml.f7871d;
            }
            c0722o9.f7987d = c0682ml.f7870c;
            c0722o9Arr[i3] = c0722o9;
            this.f8570b.f8691g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c0774q9.f8139d[i3]);
            this.f8570b.f8691g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
