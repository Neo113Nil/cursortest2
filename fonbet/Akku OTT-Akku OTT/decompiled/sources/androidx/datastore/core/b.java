package androidx.datastore.core;

import androidx.activity.N;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.Typography;
import kotlinx.serialization.descriptors.d;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.internal.S0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StorageConnection storageConnectionDelegate$lambda$0;
        switch (this.a) {
            case 0:
                storageConnectionDelegate$lambda$0 = DataStoreImpl.storageConnectionDelegate$lambda$0((DataStoreImpl) this.b);
                return storageConnectionDelegate$lambda$0;
            default:
                final kotlinx.serialization.f fVar = (kotlinx.serialization.f) this.b;
                kotlinx.serialization.descriptors.i c = kotlinx.serialization.descriptors.l.c("kotlinx.serialization.Polymorphic", d.a.a, new kotlinx.serialization.descriptors.f[0], new Function1() { // from class: kotlinx.serialization.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        kotlinx.serialization.descriptors.i c2;
                        kotlinx.serialization.descriptors.a buildSerialDescriptor = (kotlinx.serialization.descriptors.a) obj;
                        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                        kotlinx.serialization.builtins.a.d(StringCompanionObject.INSTANCE);
                        buildSerialDescriptor.a("type", S0.b, CollectionsKt.emptyList());
                        StringBuilder sb = new StringBuilder("kotlinx.serialization.Polymorphic<");
                        f fVar2 = f.this;
                        sb.append(fVar2.a.getSimpleName());
                        sb.append(Typography.greater);
                        c2 = kotlinx.serialization.descriptors.l.c(sb.toString(), m.a.a, new kotlinx.serialization.descriptors.f[0], new N(1));
                        buildSerialDescriptor.a("value", c2, CollectionsKt.emptyList());
                        List<? extends Annotation> list = fVar2.b;
                        Intrinsics.checkNotNullParameter(list, "<set-?>");
                        buildSerialDescriptor.b = list;
                        return Unit.INSTANCE;
                    }
                });
                KClass<T> context = fVar.a;
                Intrinsics.checkNotNullParameter(c, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                return new kotlinx.serialization.descriptors.c(c, context);
        }
    }
}
