package com.vungle.ads.internal.signals;

import com.vungle.ads.internal.model.s3;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;

/* loaded from: classes7.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f12121a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar) {
        super(0);
        this.f12121a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Json json;
        StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("unclosedad: ");
        json = this.f12121a.b;
        List c = this.f12121a.b().c();
        KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(s3.class))));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return a2.append(json.encodeToString(serializer, c)).toString();
    }
}
