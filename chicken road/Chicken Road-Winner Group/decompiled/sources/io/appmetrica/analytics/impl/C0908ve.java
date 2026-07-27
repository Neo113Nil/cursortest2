package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ve, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0908ve implements InterfaceC0540h8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0985ye f8510a;

    /* renamed from: b, reason: collision with root package name */
    public final C0793r3 f8511b;

    /* renamed from: c, reason: collision with root package name */
    public final C1006za f8512c;

    /* renamed from: d, reason: collision with root package name */
    public final Of f8513d;

    public C0908ve() {
        this(new C0985ye(), new C0793r3(), new C1006za(100), new Of());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0882ue c0882ue) {
        Ii ii;
        int i3 = 0;
        boolean z3 = true;
        A8 a8 = new A8();
        a8.f5687a = c0882ue.f8452a;
        a8.f = new C0747p8();
        C0934we c0934we = c0882ue.f8453b;
        C0695n8 c0695n8 = new C0695n8();
        c0695n8.f7912a = StringUtils.getUTF8Bytes(c0934we.f8564a);
        On a3 = this.f8512c.a(c0934we.f8565b);
        c0695n8.f7913b = StringUtils.getUTF8Bytes((String) a3.f6370a);
        c0695n8.f7916e = c0934we.f8566c.size();
        Map<String, String> map = c0934we.f8567d;
        if (map != null) {
            ii = this.f8510a.fromModel(map);
            c0695n8.f7914c = (C0798r8) ii.f6110a;
        } else {
            ii = null;
        }
        a8.f.f8059a = c0695n8;
        C0561i3 c0561i3 = new C0561i3(C0561i3.b(a3, ii));
        List list = c0934we.f8566c;
        ArrayList arrayList = new ArrayList();
        this.f8513d.getClass();
        int computeInt32Size = a8.f5687a != new A8().f5687a ? CodedOutputByteBufferNano.computeInt32Size(1, a8.f5687a) : 0;
        C1004z8 c1004z8 = a8.f5688b;
        if (c1004z8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c1004z8);
        }
        C0954x8 c0954x8 = a8.f5689c;
        if (c0954x8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0954x8);
        }
        C0979y8 c0979y8 = a8.f5690d;
        int i4 = 4;
        if (c0979y8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c0979y8);
        }
        C0591j8 c0591j8 = a8.f5691e;
        if (c0591j8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c0591j8);
        }
        C0747p8 c0747p8 = a8.f;
        if (c0747p8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0747p8);
        }
        ArrayList arrayList2 = new ArrayList();
        A8 a82 = new A8();
        a82.f5687a = a8.f5687a;
        C0747p8 c0747p82 = new C0747p8();
        a82.f = c0747p82;
        c0747p82.f8059a = new C0695n8();
        C0695n8 c0695n82 = a82.f.f8059a;
        C0695n8 c0695n83 = a8.f.f8059a;
        c0695n82.f7913b = c0695n83.f7913b;
        c0695n82.f7912a = c0695n83.f7912a;
        c0695n82.f7916e = c0695n83.f7916e;
        c0695n82.f7914c = c0695n83.f7914c;
        int i5 = 0;
        C0561i3 c0561i32 = c0561i3;
        int i6 = computeInt32Size;
        while (i5 < list.size()) {
            C0819s3 c0819s3 = (C0819s3) list.get(i5);
            int i7 = i3;
            C0721o8 c0721o8 = new C0721o8();
            c0721o8.f7981a = i5;
            boolean z4 = z3;
            Ii fromModel = this.f8511b.fromModel(c0819s3);
            c0721o8.f7982b = (C0617k8) fromModel.f6110a;
            fromModel.f6111b.getBytesTruncated();
            Ii ii2 = new Ii(c0721o8, fromModel);
            Of of = this.f8513d;
            C0721o8 c0721o82 = (C0721o8) ii2.f6110a;
            of.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i4);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c0721o82);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? i7 : CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i6 + computeRawVarint32Size > 204800) {
                a82.f.f8059a.f7915d = (C0721o8[]) arrayList2.toArray(new C0721o8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Ii(a82, c0561i32));
                A8 a83 = new A8();
                a83.f5687a = a8.f5687a;
                C0747p8 c0747p83 = new C0747p8();
                a83.f = c0747p83;
                c0747p83.f8059a = new C0695n8();
                C0695n8 c0695n84 = a83.f.f8059a;
                C0695n8 c0695n85 = a8.f.f8059a;
                c0695n84.f7913b = c0695n85.f7913b;
                c0695n84.f7912a = c0695n85.f7912a;
                c0695n84.f7916e = c0695n85.f7916e;
                c0695n84.f7914c = c0695n85.f7914c;
                c0561i32 = c0561i3;
                i6 = computeInt32Size;
                a82 = a83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C0721o8) ii2.f6110a);
            InterfaceC0586j3 interfaceC0586j3 = ii2.f6111b;
            InterfaceC0586j3[] interfaceC0586j3Arr = new InterfaceC0586j3[2];
            interfaceC0586j3Arr[i7] = c0561i32;
            interfaceC0586j3Arr[z4 ? 1 : 0] = interfaceC0586j3;
            c0561i32 = new C0561i3(C0561i3.b(interfaceC0586j3Arr));
            i6 += computeRawVarint32Size;
            i5++;
            i3 = i7;
            z3 = z4 ? 1 : 0;
            i4 = 4;
        }
        a82.f.f8059a.f7915d = (C0721o8[]) arrayList2.toArray(new C0721o8[arrayList2.size()]);
        arrayList.add(new Ii(a82, c0561i32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0908ve(C0985ye c0985ye, C0793r3 c0793r3, C1006za c1006za, Of of) {
        this.f8510a = c0985ye;
        this.f8511b = c0793r3;
        this.f8512c = c1006za;
        this.f8513d = of;
    }

    public final C0882ue a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
