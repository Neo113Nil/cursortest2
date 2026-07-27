package H2;

import d2.C0279i;
import g2.InterfaceC0319c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import w2.AbstractC1242v;
import w2.B;
import w2.InterfaceC1241u;

/* loaded from: classes.dex */
public final class k extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I2.d f529e;
    public final /* synthetic */ l f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f530g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f531h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(I2.d dVar, l lVar, l lVar2, long j3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f529e = dVar;
        this.f = lVar;
        this.f530g = lVar2;
        this.f531h = j3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new k(this.f529e, this.f, this.f530g, this.f531h, interfaceC0319c);
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        X0.a.L(obj);
        I2.d dVar = this.f529e;
        boolean z3 = dVar.f691b;
        String str = dVar.f690a;
        if (!z3) {
            URL url = URI.create(str).toURL();
            kotlin.jvm.internal.j.d(url, "toURL(...)");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream openStream = url.openStream();
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = openStream.read(bArr);
                    Integer valueOf = Integer.valueOf(read);
                    if (read <= 0) {
                        valueOf = null;
                    }
                    if (valueOf == null) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, valueOf.intValue());
                }
                openStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.j.d(byteArray, "toByteArray(...)");
                File createTempFile = File.createTempFile("sound", "");
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    fileOutputStream.write(byteArray);
                    createTempFile.deleteOnExit();
                    fileOutputStream.close();
                    str = createTempFile.getAbsolutePath();
                    kotlin.jvm.internal.j.d(str, "getAbsolutePath(...)");
                } finally {
                }
            } finally {
            }
        } else if (v2.m.q0(str, "file://")) {
            str = str.substring(7);
            kotlin.jvm.internal.j.d(str, "substring(...)");
        }
        String str2 = str;
        l lVar = this.f;
        B2.e eVar = lVar.f534c;
        D2.d dVar2 = B.f10462a;
        AbstractC1242v.g(eVar, B2.o.f177a, new j(lVar, str2, this.f530g, this.f529e, this.f531h, null), 2);
        return C0279i.f4852a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj);
        C0279i c0279i = C0279i.f4852a;
        kVar.g(c0279i);
        return c0279i;
    }
}
