package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b implements Configurator {
    public static final b a = new b();

    public static final class a implements ObjectEncoder<com.google.android.datatransport.cct.internal.a> {
        public static final a a = new a();
        public static final FieldDescriptor b = FieldDescriptor.of("sdkVersion");
        public static final FieldDescriptor c = FieldDescriptor.of("model");
        public static final FieldDescriptor d = FieldDescriptor.of("hardware");
        public static final FieldDescriptor e = FieldDescriptor.of("device");
        public static final FieldDescriptor f = FieldDescriptor.of("product");
        public static final FieldDescriptor g = FieldDescriptor.of("osBuild");
        public static final FieldDescriptor h = FieldDescriptor.of("manufacturer");
        public static final FieldDescriptor i = FieldDescriptor.of("fingerprint");
        public static final FieldDescriptor j = FieldDescriptor.of("locale");
        public static final FieldDescriptor k = FieldDescriptor.of("country");
        public static final FieldDescriptor l = FieldDescriptor.of("mccMnc");
        public static final FieldDescriptor m = FieldDescriptor.of("applicationBuild");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            com.google.android.datatransport.cct.internal.a aVar = (com.google.android.datatransport.cct.internal.a) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, aVar.l());
            objectEncoderContext2.add(c, aVar.i());
            objectEncoderContext2.add(d, aVar.e());
            objectEncoderContext2.add(e, aVar.c());
            objectEncoderContext2.add(f, aVar.k());
            objectEncoderContext2.add(g, aVar.j());
            objectEncoderContext2.add(h, aVar.g());
            objectEncoderContext2.add(i, aVar.d());
            objectEncoderContext2.add(j, aVar.f());
            objectEncoderContext2.add(k, aVar.b());
            objectEncoderContext2.add(l, aVar.h());
            objectEncoderContext2.add(m, aVar.a());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$b, reason: collision with other inner class name */
    public static final class C0101b implements ObjectEncoder<n> {
        public static final C0101b a = new C0101b();
        public static final FieldDescriptor b = FieldDescriptor.of("logRequest");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, ((n) obj).a());
        }
    }

    public static final class c implements ObjectEncoder<o> {
        public static final c a = new c();
        public static final FieldDescriptor b = FieldDescriptor.of("clientType");
        public static final FieldDescriptor c = FieldDescriptor.of("androidClientInfo");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            o oVar = (o) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, oVar.b());
            objectEncoderContext2.add(c, oVar.a());
        }
    }

    public static final class d implements ObjectEncoder<p> {
        public static final d a = new d();
        public static final FieldDescriptor b = FieldDescriptor.of("privacyContext");
        public static final FieldDescriptor c = FieldDescriptor.of("productIdOrigin");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            p pVar = (p) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, pVar.a());
            objectEncoderContext2.add(c, pVar.b());
        }
    }

    public static final class e implements ObjectEncoder<q> {
        public static final e a = new e();
        public static final FieldDescriptor b = FieldDescriptor.of("clearBlob");
        public static final FieldDescriptor c = FieldDescriptor.of("encryptedBlob");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            q qVar = (q) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, qVar.a());
            objectEncoderContext2.add(c, qVar.b());
        }
    }

    public static final class f implements ObjectEncoder<r> {
        public static final f a = new f();
        public static final FieldDescriptor b = FieldDescriptor.of("originAssociatedProductId");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, ((r) obj).a());
        }
    }

    public static final class g implements ObjectEncoder<s> {
        public static final g a = new g();
        public static final FieldDescriptor b = FieldDescriptor.of("prequest");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, ((s) obj).a());
        }
    }

    public static final class h implements ObjectEncoder<t> {
        public static final h a = new h();
        public static final FieldDescriptor b = FieldDescriptor.of("eventTimeMs");
        public static final FieldDescriptor c = FieldDescriptor.of("eventCode");
        public static final FieldDescriptor d = FieldDescriptor.of("complianceData");
        public static final FieldDescriptor e = FieldDescriptor.of("eventUptimeMs");
        public static final FieldDescriptor f = FieldDescriptor.of("sourceExtension");
        public static final FieldDescriptor g = FieldDescriptor.of("sourceExtensionJsonProto3");
        public static final FieldDescriptor h = FieldDescriptor.of("timezoneOffsetSeconds");
        public static final FieldDescriptor i = FieldDescriptor.of("networkConnectionInfo");
        public static final FieldDescriptor j = FieldDescriptor.of("experimentIds");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            t tVar = (t) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, tVar.c());
            objectEncoderContext2.add(c, tVar.b());
            objectEncoderContext2.add(d, tVar.a());
            objectEncoderContext2.add(e, tVar.d());
            objectEncoderContext2.add(f, tVar.g());
            objectEncoderContext2.add(g, tVar.h());
            objectEncoderContext2.add(h, tVar.i());
            objectEncoderContext2.add(i, tVar.f());
            objectEncoderContext2.add(j, tVar.e());
        }
    }

    public static final class i implements ObjectEncoder<u> {
        public static final i a = new i();
        public static final FieldDescriptor b = FieldDescriptor.of("requestTimeMs");
        public static final FieldDescriptor c = FieldDescriptor.of("requestUptimeMs");
        public static final FieldDescriptor d = FieldDescriptor.of("clientInfo");
        public static final FieldDescriptor e = FieldDescriptor.of("logSource");
        public static final FieldDescriptor f = FieldDescriptor.of("logSourceName");
        public static final FieldDescriptor g = FieldDescriptor.of("logEvent");
        public static final FieldDescriptor h = FieldDescriptor.of("qosTier");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            u uVar = (u) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, uVar.f());
            objectEncoderContext2.add(c, uVar.g());
            objectEncoderContext2.add(d, uVar.a());
            objectEncoderContext2.add(e, uVar.c());
            objectEncoderContext2.add(f, uVar.d());
            objectEncoderContext2.add(g, uVar.b());
            objectEncoderContext2.add(h, uVar.e());
        }
    }

    public static final class j implements ObjectEncoder<w> {
        public static final j a = new j();
        public static final FieldDescriptor b = FieldDescriptor.of("networkType");
        public static final FieldDescriptor c = FieldDescriptor.of("mobileSubtype");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            w wVar = (w) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, wVar.b());
            objectEncoderContext2.add(c, wVar.a());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig<?> encoderConfig) {
        C0101b c0101b = C0101b.a;
        encoderConfig.registerEncoder(n.class, c0101b);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.d.class, c0101b);
        i iVar = i.a;
        encoderConfig.registerEncoder(u.class, iVar);
        encoderConfig.registerEncoder(k.class, iVar);
        c cVar = c.a;
        encoderConfig.registerEncoder(o.class, cVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.e.class, cVar);
        a aVar = a.a;
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.a.class, aVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.c.class, aVar);
        h hVar = h.a;
        encoderConfig.registerEncoder(t.class, hVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.j.class, hVar);
        d dVar = d.a;
        encoderConfig.registerEncoder(p.class, dVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.f.class, dVar);
        g gVar = g.a;
        encoderConfig.registerEncoder(s.class, gVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.i.class, gVar);
        f fVar = f.a;
        encoderConfig.registerEncoder(r.class, fVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.h.class, fVar);
        j jVar = j.a;
        encoderConfig.registerEncoder(w.class, jVar);
        encoderConfig.registerEncoder(m.class, jVar);
        e eVar = e.a;
        encoderConfig.registerEncoder(q.class, eVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.g.class, eVar);
    }
}
