package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ug {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5077a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0235al f5078b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0561nb f5079c = new io.appmetrica.analytics.impl.C0561nb();

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0606p4 f5080d = new io.appmetrica.analytics.impl.C0606p4(new io.appmetrica.analytics.impl.Zl(), new io.appmetrica.analytics.impl.C0580o4(), null);

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.backport.Consumer f5081e;

    public Ug(android.content.Context context, final io.appmetrica.analytics.impl.InterfaceC0298d6 interfaceC0298d6, final io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb, io.appmetrica.analytics.impl.InterfaceC0235al interfaceC0235al) {
        this.f5077a = context;
        this.f5078b = interfaceC0235al;
        this.f5081e = new io.appmetrica.analytics.coreapi.internal.backport.Consumer() { // from class: io.appmetrica.analytics.impl.To
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(java.lang.Object obj) {
                io.appmetrica.analytics.impl.Ug.a(io.appmetrica.analytics.impl.EnumC0251bb.this, interfaceC0298d6, this, (io.appmetrica.analytics.impl.C0457jb) obj);
            }
        };
    }

    public static final void a(io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb, io.appmetrica.analytics.impl.InterfaceC0298d6 interfaceC0298d6, io.appmetrica.analytics.impl.Ug ug, io.appmetrica.analytics.impl.C0457jb c0457jb) {
        java.lang.String str = c0457jb.f6183h;
        io.appmetrica.analytics.impl.P3 p3 = new io.appmetrica.analytics.impl.P3(str, c0457jb.f6180e, c0457jb.f6181f, c0457jb.f6182g, c0457jb.f6184i);
        java.lang.String str2 = c0457jb.f6177b;
        byte[] bArr = c0457jb.f6176a;
        int i2 = c0457jb.f6178c;
        java.util.HashMap hashMap = c0457jb.f6179d;
        java.lang.String str3 = c0457jb.f6185j;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger orCreatePublicLogger = io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(str);
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(bArr, str2, enumC0251bb.f5573a, orCreatePublicLogger);
        m3.f4638q = hashMap;
        m3.f4819g = i2;
        m3.f4815c = str3;
        ((io.appmetrica.analytics.impl.Sg) interfaceC0298d6).a(p3, m3, ug.f5080d);
    }
}
