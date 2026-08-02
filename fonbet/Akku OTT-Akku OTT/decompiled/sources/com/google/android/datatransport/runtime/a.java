package com.google.android.datatransport.runtime;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements Configurator {
    public static final a a = new a();

    /* renamed from: com.google.android.datatransport.runtime.a$a, reason: collision with other inner class name */
    public static final class C0102a implements ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.a> {
        public static final C0102a a = new C0102a();
        public static final FieldDescriptor b = androidx.collection.d.a(1, FieldDescriptor.builder("window"));
        public static final FieldDescriptor c = androidx.collection.d.a(2, FieldDescriptor.builder("logSourceMetrics"));
        public static final FieldDescriptor d = androidx.collection.d.a(3, FieldDescriptor.builder("globalMetrics"));
        public static final FieldDescriptor e = androidx.collection.d.a(4, FieldDescriptor.builder("appNamespace"));

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            com.google.android.datatransport.runtime.firebase.transport.a aVar = (com.google.android.datatransport.runtime.firebase.transport.a) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, aVar.a);
            objectEncoderContext2.add(c, aVar.b);
            objectEncoderContext2.add(d, aVar.c);
            objectEncoderContext2.add(e, aVar.d);
        }
    }

    public static final class b implements ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.b> {
        public static final b a = new b();
        public static final FieldDescriptor b = androidx.collection.d.a(1, FieldDescriptor.builder("storageMetrics"));

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, ((com.google.android.datatransport.runtime.firebase.transport.b) obj).a);
        }
    }

    public static final class c implements ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.c> {
        public static final c a = new c();
        public static final FieldDescriptor b = androidx.collection.d.a(1, FieldDescriptor.builder("eventsDroppedCount"));
        public static final FieldDescriptor c = androidx.collection.d.a(3, FieldDescriptor.builder(Constants.REASON));

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            com.google.android.datatransport.runtime.firebase.transport.c cVar = (com.google.android.datatransport.runtime.firebase.transport.c) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, cVar.a);
            objectEncoderContext2.add(c, cVar.b);
        }
    }

    public static final class d implements ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.d> {
        public static final d a = new d();
        public static final FieldDescriptor b = androidx.collection.d.a(1, FieldDescriptor.builder("logSource"));
        public static final FieldDescriptor c = androidx.collection.d.a(2, FieldDescriptor.builder("logEventDropped"));

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            com.google.android.datatransport.runtime.firebase.transport.d dVar = (com.google.android.datatransport.runtime.firebase.transport.d) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, dVar.a);
            objectEncoderContext2.add(c, dVar.b);
        }
    }

    public static final class e implements ObjectEncoder<k> {
        public static final e a = new e();
        public static final FieldDescriptor b = FieldDescriptor.of("clientMetrics");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, ((k) obj).a());
        }
    }

    public static final class f implements ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.e> {
        public static final f a = new f();
        public static final FieldDescriptor b = androidx.collection.d.a(1, FieldDescriptor.builder("currentCacheSizeBytes"));
        public static final FieldDescriptor c = androidx.collection.d.a(2, FieldDescriptor.builder("maxCacheSizeBytes"));

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            com.google.android.datatransport.runtime.firebase.transport.e eVar = (com.google.android.datatransport.runtime.firebase.transport.e) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, eVar.a);
            objectEncoderContext2.add(c, eVar.b);
        }
    }

    public static final class g implements ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.f> {
        public static final g a = new g();
        public static final FieldDescriptor b = androidx.collection.d.a(1, FieldDescriptor.builder("startMs"));
        public static final FieldDescriptor c = androidx.collection.d.a(2, FieldDescriptor.builder("endMs"));

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            com.google.android.datatransport.runtime.firebase.transport.f fVar = (com.google.android.datatransport.runtime.firebase.transport.f) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, fVar.a);
            objectEncoderContext2.add(c, fVar.b);
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(k.class, e.a);
        encoderConfig.registerEncoder(com.google.android.datatransport.runtime.firebase.transport.a.class, C0102a.a);
        encoderConfig.registerEncoder(com.google.android.datatransport.runtime.firebase.transport.f.class, g.a);
        encoderConfig.registerEncoder(com.google.android.datatransport.runtime.firebase.transport.d.class, d.a);
        encoderConfig.registerEncoder(com.google.android.datatransport.runtime.firebase.transport.c.class, c.a);
        encoderConfig.registerEncoder(com.google.android.datatransport.runtime.firebase.transport.b.class, b.a);
        encoderConfig.registerEncoder(com.google.android.datatransport.runtime.firebase.transport.e.class, f.a);
    }
}
