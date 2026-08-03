package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590oe implements io.appmetrica.analytics.impl.InterfaceC0248b8 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0693se f6583a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0449j3 f6584b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0689sa f6585c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Jf f6586d;

    public C0590oe() {
        this(new io.appmetrica.analytics.impl.C0693se(), new io.appmetrica.analytics.impl.C0449j3(), new io.appmetrica.analytics.impl.C0689sa(100), new io.appmetrica.analytics.impl.Jf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.List<io.appmetrica.analytics.impl.Di> fromModel(io.appmetrica.analytics.impl.C0564ne c0564ne) {
        io.appmetrica.analytics.impl.Di di;
        io.appmetrica.analytics.impl.C0739u8 c0739u8 = new io.appmetrica.analytics.impl.C0739u8();
        c0739u8.f6893a = c0564ne.f6523a;
        c0739u8.f6898f = new io.appmetrica.analytics.impl.C0454j8();
        io.appmetrica.analytics.impl.C0616pe c0616pe = c0564ne.f6524b;
        io.appmetrica.analytics.impl.C0403h8 c0403h8 = new io.appmetrica.analytics.impl.C0403h8();
        c0403h8.f6037a = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes(c0616pe.f6650a);
        io.appmetrica.analytics.impl.Mn a2 = this.f6585c.a(c0616pe.f6651b);
        c0403h8.f6038b = io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes((java.lang.String) a2.f4694a);
        c0403h8.f6041e = c0616pe.f6652c.size();
        java.util.Map<java.lang.String, java.lang.String> map = c0616pe.f6653d;
        if (map != null) {
            di = this.f6583a.fromModel(map);
            c0403h8.f6039c = (io.appmetrica.analytics.impl.C0506l8) di.f4214a;
        } else {
            di = null;
        }
        c0739u8.f6898f.f6165a = c0403h8;
        io.appmetrica.analytics.impl.C0217a3 c0217a3 = new io.appmetrica.analytics.impl.C0217a3(io.appmetrica.analytics.impl.C0217a3.b(a2, di));
        java.util.List list = c0616pe.f6652c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f6586d.getClass();
        int computeInt32Size = c0739u8.f6893a != new io.appmetrica.analytics.impl.C0739u8().f6893a ? io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(1, c0739u8.f6893a) : 0;
        io.appmetrica.analytics.impl.C0713t8 c0713t8 = c0739u8.f6894b;
        if (c0713t8 != null) {
            computeInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0713t8);
        }
        io.appmetrica.analytics.impl.C0661r8 c0661r8 = c0739u8.f6895c;
        if (c0661r8 != null) {
            computeInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, c0661r8);
        }
        io.appmetrica.analytics.impl.C0687s8 c0687s8 = c0739u8.f6896d;
        int i2 = 4;
        if (c0687s8 != null) {
            computeInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(4, c0687s8);
        }
        io.appmetrica.analytics.impl.C0300d8 c0300d8 = c0739u8.f6897e;
        if (c0300d8 != null) {
            computeInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(5, c0300d8);
        }
        io.appmetrica.analytics.impl.C0454j8 c0454j8 = c0739u8.f6898f;
        if (c0454j8 != null) {
            computeInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(6, c0454j8);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        io.appmetrica.analytics.impl.C0739u8 c0739u82 = new io.appmetrica.analytics.impl.C0739u8();
        c0739u82.f6893a = c0739u8.f6893a;
        io.appmetrica.analytics.impl.C0454j8 c0454j82 = new io.appmetrica.analytics.impl.C0454j8();
        c0739u82.f6898f = c0454j82;
        c0454j82.f6165a = new io.appmetrica.analytics.impl.C0403h8();
        io.appmetrica.analytics.impl.C0403h8 c0403h82 = c0739u82.f6898f.f6165a;
        io.appmetrica.analytics.impl.C0403h8 c0403h83 = c0739u8.f6898f.f6165a;
        c0403h82.f6038b = c0403h83.f6038b;
        c0403h82.f6037a = c0403h83.f6037a;
        c0403h82.f6041e = c0403h83.f6041e;
        c0403h82.f6039c = c0403h83.f6039c;
        int i3 = 0;
        io.appmetrica.analytics.impl.C0217a3 c0217a32 = c0217a3;
        int i4 = computeInt32Size;
        while (i3 < list.size()) {
            io.appmetrica.analytics.impl.C0475k3 c0475k3 = (io.appmetrica.analytics.impl.C0475k3) list.get(i3);
            io.appmetrica.analytics.impl.C0429i8 c0429i8 = new io.appmetrica.analytics.impl.C0429i8();
            c0429i8.f6086a = i3;
            io.appmetrica.analytics.impl.Di fromModel = this.f6584b.fromModel(c0475k3);
            c0429i8.f6087b = (io.appmetrica.analytics.impl.C0325e8) fromModel.f4214a;
            fromModel.f4215b.getBytesTruncated();
            io.appmetrica.analytics.impl.Di di2 = new io.appmetrica.analytics.impl.Di(c0429i8, fromModel);
            io.appmetrica.analytics.impl.Jf jf = this.f6586d;
            io.appmetrica.analytics.impl.C0429i8 c0429i82 = (io.appmetrica.analytics.impl.C0429i8) di2.f4214a;
            jf.getClass();
            int computeTagSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeTagSize(i2);
            int computeMessageSizeNoTag = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSizeNoTag(c0429i82);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? 0 : io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i4 + computeRawVarint32Size > 204800) {
                c0739u82.f6898f.f6165a.f6040d = (io.appmetrica.analytics.impl.C0429i8[]) arrayList2.toArray(new io.appmetrica.analytics.impl.C0429i8[arrayList2.size()]);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList.add(new io.appmetrica.analytics.impl.Di(c0739u82, c0217a32));
                io.appmetrica.analytics.impl.C0739u8 c0739u83 = new io.appmetrica.analytics.impl.C0739u8();
                c0739u83.f6893a = c0739u8.f6893a;
                io.appmetrica.analytics.impl.C0454j8 c0454j83 = new io.appmetrica.analytics.impl.C0454j8();
                c0739u83.f6898f = c0454j83;
                c0454j83.f6165a = new io.appmetrica.analytics.impl.C0403h8();
                io.appmetrica.analytics.impl.C0403h8 c0403h84 = c0739u83.f6898f.f6165a;
                io.appmetrica.analytics.impl.C0403h8 c0403h85 = c0739u8.f6898f.f6165a;
                c0403h84.f6038b = c0403h85.f6038b;
                c0403h84.f6037a = c0403h85.f6037a;
                c0403h84.f6041e = c0403h85.f6041e;
                c0403h84.f6039c = c0403h85.f6039c;
                c0217a32 = c0217a3;
                i4 = computeInt32Size;
                c0739u82 = c0739u83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((io.appmetrica.analytics.impl.C0429i8) di2.f4214a);
            c0217a32 = new io.appmetrica.analytics.impl.C0217a3(io.appmetrica.analytics.impl.C0217a3.b(c0217a32, di2.f4215b));
            i4 += computeRawVarint32Size;
            i3++;
            i2 = 4;
        }
        c0739u82.f6898f.f6165a.f6040d = (io.appmetrica.analytics.impl.C0429i8[]) arrayList2.toArray(new io.appmetrica.analytics.impl.C0429i8[arrayList2.size()]);
        arrayList.add(new io.appmetrica.analytics.impl.Di(c0739u82, c0217a32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C0590oe(io.appmetrica.analytics.impl.C0693se c0693se, io.appmetrica.analytics.impl.C0449j3 c0449j3, io.appmetrica.analytics.impl.C0689sa c0689sa, io.appmetrica.analytics.impl.Jf jf) {
        this.f6583a = c0693se;
        this.f6584b = c0449j3;
        this.f6585c = c0689sa;
        this.f6586d = jf;
    }

    public final io.appmetrica.analytics.impl.C0564ne a(java.util.List<io.appmetrica.analytics.impl.Di> list) {
        throw new java.lang.UnsupportedOperationException();
    }
}
